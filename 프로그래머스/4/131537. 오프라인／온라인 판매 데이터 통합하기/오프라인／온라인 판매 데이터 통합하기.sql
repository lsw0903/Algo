-- 코드를 입력하세요
SELECT TO_CHAR(SALES_DATE,'YYYY-MM-DD') AS SALES_DATE,
       PRODUCT_ID,
       USER_ID,
       SALES_AMOUNT
  FROM ONLINE_SALE
 WHERE EXTRACT(YEAR FROM SALES_DATE) = 2022
   AND EXTRACT(MONTH FROM SALES_DATE) = 03
UNION
SELECT TO_CHAR(SALES_DATE,'YYYY-MM-DD'),
       PRODUCT_ID,
       NULL,
       SALES_AMOUNT
  FROM OFFLINE_SALE
 WHERE EXTRACT(YEAR FROM SALES_DATE) = 2022
   AND EXTRACT(MONTH FROM SALES_DATE) = 03
 ORDER BY 1 ASC, 2 ASC, 3;