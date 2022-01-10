# Shopping Cart Application for AE2

## Software used:

* [Apache NetBeans](https://netbeans.apache.org/ "Netbeans link")
* [Apache Tomcat](http://tomcat.apache.org/ "Tomcat link")
* [Apache Maven](https://maven.apache.org/ "Maven link")
* [Java 11](https://jdk.java.net/11/ "Jdk link")
* [Bootstrap (formatting)](https://getbootstrap.com/ "Bootstrap link")
* [Spring](https://spring.io/ "Spring link")


## Setup
1. `git clone https://github.com/DYoung466/COM528_AE2_DYoung.git`
2. Main project is within the folder named Test
3. In Apache Netbeans, navigate to the shoppingCartApplication-web and run this
<br >![Run application](https://user-images.githubusercontent.com/71987991/148574748-3fccad1c-412e-4fd3-b1e5-7d79643b23c0.png "Run application")
4. The project will open on the index page located here : http://localhost:8080/shoppingCartApplication/index.html

## Requirements:

* Log in - User/admin
* View products
* Manage account details
* Manage accounts (administrator only)
* Manage catalogue (administrator only) 
* Add product to basket
* Checkout (using previous card checker and ReST interface)
* Convert order to invoice and store in invoice repository


## Feature List:
* Log in - User/admin
* View products
* Manage account details
* Manage accounts (administrator only)
* Manage catalogue (administrator only) 

## Use Cases:

![DYoung_Administrator_Use_Cases drawio](https://user-images.githubusercontent.com/71987991/148755868-92f5370a-0672-4870-94e0-b792b3e16a20.png)

![DYoung_Anonymous_Use_Cases drawio](https://user-images.githubusercontent.com/71987991/148755885-30130c18-7865-4fea-a495-a62e13964663.png)

![DYoung_Customer_Use_Cases drawio](https://user-images.githubusercontent.com/71987991/148755900-54d5ee6b-b269-4fef-8282-7ba33e7f2d50.png)


## Test Plan:
### Customer

|Test                                             	|Outcome                        	|
|--------------------------------------------------	|--------------------------------	|
| Customer                                        	|                         	      |
|--------------------------------------------------	|--------------------------------	|
| Customer logs in                                 	| Passed                         	|
| Customer manages details                         	| Passed                         	|
| Customer changes password                        	| Passed                         	|
| Customer returns to homepage                     	| Passed                         	|
| Customer adds product to basket if not in stock  	| Fail - Product not in stock    	|
|---------------------------------------------------|---------------------------------|
|Anonymous                                        	|                         	      |
|---------------------------------------------------|---------------------------------|
|User accesses page                        	        |Passed                          	|
|User browses stock                               	|Passed                          	|
|User attempts to access forbidden page           	|Passed- Returned to homepage    	|
|User creates account                      	        |Passed – Account created        	|
|User manages details                      	        |Passed- Becomes customer        	|
|---------------------------------------------------|---------------------------------|
|Administrator                                      |                         	      |
|---------------------------------------------------|---------------------------------|
|Admin logs in                                     	|Passed                           |
|Admin manages user details                        	|Passed                           |
|Admin navigates to catalogue      	                |Passed                           |
|Admin navigates to modify item    	                |Passed                           |
|Admin changes item details        	                |Fail –No Item details            |
|Admin manages own details                         	|Passed                           |
|Admin deactivates an account      	                |Passed                           |

