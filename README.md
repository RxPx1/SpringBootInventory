Rob Pavlik\
Student ID# 010779327\
D287 - Java Frameworks\
\
\
Changes to Repo Working Branch-\
Day 1 Changes – 
1.	Created about.html
2.	Created AboutController.java 
3.	Changes to AddProductController lines-\
    a.	124-136 – added a buyProduct method for when the buy now button is clicked
4.	Changes to BootStrapData.java lines-\
    a.	21 – added Lombok @Data to the BootStrapData class\
    b.	34 – added inventoryService to the constructor\
    c.	36-38 – added variable InventoryService(private final /     @Autowired)\
    d.	--- deleted unused commented code
5.	Created boughtproduct.html
6.	Confirmationaddpart.html line changes-\
    a.	6 – uncommented meta tag\
    b.	8 – changed the title\
    c.	10 – added style to the body tag\
    d.	13 – changed the link to a button to return to mainscreen.html\
7.	Confirmationaddproduct.html line changes-\
    a.	6-7 – uncommented meta tag\
    b.	8 – changed the title\
    c.	10 – added style to body tag\
    d.	13 – changed the link to a button to return to mainscreen.html\
8.	Confirmationassocpart.html line changes-\
    a.	6-7 – uncommented meta tag\
    b.	8 – changed the title\
    c.	10 – added style to body tag\
    d.	13 – changed the link to a button to return to mainscreen.html\
9.	Confirmationdeletepart.html line changes-\
    a.	6-7 – uncommented meta tag\
    b.	8 – changed the title\
    c.	10 – added style to body tag\
    d.	13 – changed the link to a button to return to mainscreen.html\
10.	Confimationdeleteproduct.html line changes-\
    a.	4 – uncommented meta tag\
    b.	7-8 – changed the title\
    c.	10 – added style to body tag\
    d.	13 – changed the link to a button to return to mainscreen.html
11.	InhousePartForm.java line changes-\
    a.	6 – title change\
    b.	10 – added style to body tag\
    c.	17 – added header to p tag with input tag\
    d.	19 - added header to p tag with input tag\
    e.	22 - added header to p tag with input tag\
    f.	25 - added header to p tag with input tag\
    g.	27 – added style to input tag\
    h.	31 – added style to button tag
12.	Created InventoryService.java
13.	Mainscreen.html line changes-\
    a.	14 – title change\
    b.	16 – added style to body tag\
    c.	19 – added br tag\
    d.	20 – changed content of the h1 tags\
    e.	21 – added a button to direct to about.html\
    f.	22 – added style to hr tag\
    g.	23 – updated content of the h2 tag\
    h.	34 – added style to table tag\
    i.	55 – added br tags\
    j.	56 – added hr tags\
    k.	57- updated content of the h2 tag\
    l.	72 – added style to table tag\
    m.	79 – added th tags where the buy now button will go\
    n.	87 – 90 – added style to the a tags\
    o.	93 – 96 – added td tags with a tags implementing the buy now button\
    p.	100 – added br tags
14.	Negativeerror.html line changes-\
    a.	5 – updated content of the title tag\
    b.	7 – added style to body tag\
    c.	9 – changed the link to a button to return to mainscreen.html
15.	Created outofstock.html
16.	OutsourcedPartForm.java line changes-\
    a.	6 – updated content of the title tag\
    b.	9 – added style to body tag\
    c.	17 – added content to the p tag\
    d.	19 - added content to the p tag\
    e.	22 – added content to the p tag\
    f.	25 – added content to the p tag\
    g.	27 – added style to the input tag\
    h.	30 – changed the link to a button to return to mainscreen.html
17.	Part.java line changes-\
    a.	22 – removed abstract from class declaration\
    b.	It was causing runtime errors
18.	Pom.xml line changes –\
    a.	57-61 – added dependency for Lombok\
19.	productForm.html line changes-\
    a.	8 – updated content in the title tag\
    b.	12 – added style to the body tag\
    c.	18 – added content to the p tag\
    d.	20- added content to the p tag\
    e.	23 - added content to the p tag\
    f.	30 – added style to the input tag\
    g.	34 – added style to the table tag\
    h.	54 – added style to the table tag\
    i.	74 – added br tags\
    j.	75 – changed the link to a button to return to mainscreen.html\
20.	Saveproductscreen.html line changes –\
    a.	5 – updated content of the title tag\
    b.	7 – added style to the body tag\
c.	9 - changed the link to a button to return to mainscreen.html
\
\
Day 2 changes – 
1.	About.html line changes-\
    a.	12 – added styling to body tag\
    b.	16 – added styling to h3 tag\
2.	AddInHousePartController.java line changes-\
    a.	36-61 – modified submitForm method to have Validation logic for values being entered\
3.	AddOutsourcedPartController.java line changes-\
    a.	37- 57 – modified submitForm method to have Validation logic for values being entered\
4.	BoughtProduct.html changes-\
    a.	Removed button that returns to main screen due to refresh being at 1 sec and it not being needed\
5.	ConfirmationAddPart.html line changes – \
    a.	5 - Changed meta tag content time setting from 0 to 1.\ 
    b.	Removed button that returns to main screen due to refresh   being at 1 sec and it not being needed\
6.	ConfirmationAddProduct.html line changes –\
    a.	5 – updated content in the meta tag from 0 to 1\
    b.	Removed button that returns to main screen due to refresh being at 1 sec and it not being needed\
7.	Confirmationassocpart.html line changes – \
    a.	5 – updated content in the meta tag from 0 to 1\
    b.	Removed button that returns to main screen due to refresh being at 1 sec and it not being needed\
8.	ConfirmationDeletePart.html line changes-\
    a.	5 – updated content in the meta tag from 0 to 1\
    b.	Removed button that returns to main screen due to refresh being at 1 sec and it not being needed\
9.	ConfirmationDeleteProduct.html line changes-\
    a.	5 – updated content in the meta tag from 0 to 1\
    b.	Removed button that returns to main screen due to refresh being at 1 sec and it not being needed\
10.	InHousePartForm.html line changes –\
    a.	10 – 12 – added style to body and h1 tags\
    b.	18- 35 – added style to tags\
    c.	30 – 34 – created input tags for min and max Inv values\
    d.	39 – added style to the button tag\
11.	InHousePartTest.java line changes-\
    a.	40 – 62 - Added two test cases for testing min and max inventory inputs\
12.	OutsourcedPartTest.java line changes-\
    a.	42 – 63 - Added two test cases for testing min and max inventory inputs\
13.	InventoryServices.java line changes –\
    a.	24 – 61 – Took preexisting code and cleaned it up into clearer easier to read code\
14.	Mainscreen.html line changes – \
    a.	16 – added style to the body tag\
    b.	25 – added style to the Filter\
    c.	38 – 42 – added style to the th tags
    d.	50-51 – created td tags on the parts table for the min and max inventory values to display\
    e.	63 – added style to the Filter\
    f.	80-83 – added style to the th tags\
    g.	95 – added style to the button tag\
    h.	99 – added style to the button tag\
15.	Negativeerror.html line changes-\
    a.	5 – updated content in the meta tag from 0 to 1\
    b.	Removed button that returns to main screen due to refresh being at 1 sec and it not being needed\
16.	OutofStock.html line changes-\
    a.	6 – updated content from 0 to 1 in the meta tag\
    b.	10 – added style to the body tag\
17.	OutsourcedPartForm.html line changes – \
    a.	9 – added style to body tag\
    b.	11 – added style to the h1 tag\
    c.	17 – 26 – added style to p and input tags\
    d.	28- 32 – created input tags for min and max Inv values\
18.	Part.java line changes – \
    a.	32 – added NotBlank validation to name\
    b.	37 – 42 – added NotNull and Min validation to inv\
    c.	42 – added NotNull  validation to minInv\
    d.	44 – 48 added NotNull and Min to maxInv\
    e.	63 – 89 added minInv and maxInv to construtors and created getters and setters\
19.	saveProductScreen.html line changes- \
    a.	4 – 5 – updated content in the meta tag from 0 to 1 \
    b.	10 – removed button to return to mainscreen\


