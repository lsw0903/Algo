-- 코드를 입력하세요
SELECT NAME
  FROM (SELECT NAME,
               DATETIME
          FROM ANIMAL_INS
         ORDER BY 2 ASC)
 WHERE ROWNUM = 1;