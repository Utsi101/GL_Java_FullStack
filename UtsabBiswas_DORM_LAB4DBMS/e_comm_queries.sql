select cus_gender, count(cus_gender) count from customer
where cus_id in (select cus_id from orders where ord_amount >= 3000)
group by cus_gender;

/*4*/
select product.pro_name, orders.* from product inner join supplier_pricing on supplier_pricing.pro_id=product.pro_id
inner join orders on orders.pricing_id=supplier_pricing.pricing_id where orders.cus_id=2;

/*5*/
select supplier.* from supplier where supp_id in
(select supp_id from supplier_pricing group by supp_id having count(pro_id)>1);

/*6*/
select * from
(select category.*,t2.pro_name,t2.min_price from category inner join
(select product.*,t1.min_price from product inner join
(select pro_id, min(supp_price) as min_price from supplier_pricing group by pro_id) as t1
on product.pro_id = t1.PRO_ID) as t2
on category.CAT_ID = t2.CAT_ID) as t3
group by t3.cat_id; 

/*7*/
select product.pro_id,product.pro_name from orders
inner join supplier_pricing
on supplier_pricing.pricing_id=orders.pricing_id
inner join product on product.pro_id=supplier_pricing.pro_id
where orders.ord_date > "2021-10-05";

/*8*/
select customer.cus_name,customer.cus_gender from customer where customer.cus_name like 'A%' OR customer.cus_name like '%A' ;

/*9*/
DELIMITER &&
CREATE PROCEDURE prod()
BEGIN
select report.supp_id,report.supp_name,report.Average,
CASE
WHEN report.Average = 5 THEN 'Excellent Service' WHEN report.Average >= 4 THEN 'Good Service'
WHEN report.Average >2 THEN 'Average Service'
ELSE 'Poor Service'
END AS Type_of_Service from
(select final.supp_id, supplier.supp_name, final.Average from 
(select test2.supp_id, sum(test2.rat_ratstars)/count(test2.rat_ratstars) as Average from
(select supplier_pricing.supp_id, test.ord_id, test.rat_ratstars from supplier_pricing inner join
(select orders.pricing_id, rating.ord_id, rating.rat_ratstars from orders inner join rating on rating.ord_id = orders.ord_id) 
as test on test.pricing_id = supplier_pricing.pricing_id)
as test2 group by supplier_pricing.supp_id)
as final inner join supplier where final.supp_id = supplier.supp_id) as report;
END &&
DELIMITER ; 
call prod();