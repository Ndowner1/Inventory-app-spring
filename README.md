<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

## BASIC INSTRUCTIONS
Point to changes that were made in parts C thru J. Including prompt, file name, line number, and change.
Example: Prompt G, AddPartController.java Line 12, updated part controller class with increment methods.

Prompt C: mainscreen.html Line 14: title updated to "The Flight Shop"
                          Line 19: h1 updated to "Flight Vehicle Shop"
                          Line 21: h2 updated to "Flight Parts"
                          Line 54: h2 updated to "Flight Vehicle Products"

Prompt D: Created about.html in templates folder
                          Lines 17 - 20: h1, h2, p tags added to display about us information.
                          Line 21: Button with link added to navigate to mainscreen.html
          Created AboutController.java in controllers
                          AboutController class was created to map to about.html 
          mainscreen.html Line 91: Button with link added to navigate to about.html

Prompt E: BootStrapData.java Line 43- 145 Previous sample parts inventory                                   replaced with inventory of client. Total of 5                                     parts, with null values accounted for in if                                 else statements when parts are searched                                     through repository. Repository is checked to                                be empty (43) before adding.
            BootStrapData.java Line 147 - 169 Sample products inventory                         replaced with product inventory of client.                       Total of 5 product objects created,                             accompanied with save statements to the                           repository. Repository is checked to be empty                      (147) before adding.
            BootStrapData.java Line 41-42 Created a productCount and                            partCount variable to track if the repository                   is empty before adding sample parts and                         products.
Prompt F: Generated confirmationBuyNow.html Lines 1 - 23 to show a success page from a successful purchase that navigates back to home.

  Generated a failedBuyNow.html Lines 1 - 23 to show a failure page from a failed purchase that navigates back to home

  Generated ConfirmationBuyNowController.java class Lines 1-13 that maps to its corresponding html page

  Generated FailedBuyNowController.java class Lines 1-13 that maps to its corresponding html page

  Generated a ProductNotFoundException.java class that allowed for the throw of product not found errors when product cannot be located. Lines 1-7

  Generated a InventoryException.java class that allows for the throw of Inventory errors when inventory is less than 0. Lines 1-7

  mainscreen.html: Lines 86-89 Added a buy now button embedded within a form that sends POST requests to the server passing the product Id. 

  Product.java: Lines 107 - 115. Added an inStock method to product class which decrements the inventory after check if the product has inventory, returning true boolean. False if 0 or less. To be used for AddProductController class

  AddProductController.java: Lines 176 - 190. Added the buyNow method to map HTTP Post requests. It locates the product with its id and runs in response to the boolean return from inStock(). Inventory is read and then saved to the repository by getting the ProductServiceImpl service thru a bean and then redirects to confirmationBuyNow html if successful and failedBuyNow html if unsuccessful.
            

