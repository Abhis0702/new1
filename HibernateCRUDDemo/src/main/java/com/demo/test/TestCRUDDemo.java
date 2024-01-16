package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.MyUser;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

public class TestCRUDDemo {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		UserService uservice=new UserServiceImpl();
		do {
			System.out.println("1. Add new USer\n2. Display all user\n3. Display by id");
			System.out.println("4. Delete by id\n5. Update by id\n6. Sort by id\n7. Exit");
			System.out.println("Choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				uservice.addNewUser();
				break;
			case 2:
				List<MyUser> u = uservice.GetAll();
				u.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Enter Id :");
				int id = sc.nextInt();
				MyUser user = uservice.getById(id);
				if(user != null) {
					System.out.println(user);
				}else {
					System.out.println("Not Found!!!");
				}
				break;
			case 4:
				System.out.println("Enter Id: ");
				id= sc.nextInt();
				boolean status= uservice.deleteById(id);
				if(status) {
					System.out.println("User Deleted Successfully..!!");
				}else {
					System.out.println("Id Not Found..!!");
				}
				break;
			case 5:
				System.out.println("Enter Id :");
				 id = sc.nextInt();
				System.out.println("Enter UserName :");
				String uname = sc.next();
				System.out.println("Enter Street");
				String str = sc.next();
				status = uservice.updateById(id, uname, str);
				if(status) {
					System.out.println("Updated successfully");
				}else {
					System.out.println("Not Updated..!!!");
				}
				break;
			case 6:
				List<MyUser> ulist= uservice.sortbyid();
				ulist.forEach(System.out::println);
				break;
			case 7:
				uservice.closeMySession();
				System.out.println("Thank You...");
				break;
			default:
				System.out.println("Enter Valid Choice...!!!");
				break;
				
			}
			
		}while(choice!=7);
		

	}

}
