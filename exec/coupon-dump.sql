use red-limo-db;
insert into item_coupon (item_coupon_idx, create_time, update_time, coupon_discount, coupon_expired, coupon_name)
values  (1, '2023-05-04 11:28:53', '2023-05-04 11:28:53', 300, '2023-05-16 11:28:53', '쿠폰'),
        (2, '2023-05-04 11:28:53', '2023-05-04 11:28:53', 500, '2023-05-16 11:28:53', '쿠폰'),
        (3, '2023-05-04 11:28:53', '2023-05-04 11:28:53', 500, '2023-05-16 11:28:53', '쿠폰'),
        (4, '2023-05-04 11:28:53', '2023-05-04 11:28:53', 700, '2023-05-16 11:28:53', '쿠폰'),
        (5, '2023-05-04 11:28:53', '2023-05-04 11:28:53', 300, '2023-05-16 11:28:53', '쿠폰'),
        (6, '2023-05-04 11:28:53', '2023-05-04 11:28:53', 100, '2023-05-16 11:28:53', '쿠폰'),
        (7, '2023-05-04 11:28:53', '2023-05-04 11:28:53', 200, '2023-05-16 11:28:53', '쿠폰'),
        (8, '2023-05-04 11:28:53', '2023-05-04 11:28:53', 700, '2023-05-16 11:28:53', '쿠폰');
insert into item_item_coupon (item_item_coupon_idx, create_time, update_time, item_idx, item_coupon_idx)
values  (1, '2023-05-04 13:00:55', '2023-05-04 13:00:55', 1, 1),
        (2, '2023-05-04 13:00:55', '2023-05-04 13:00:55', 2, 2),
        (3, '2023-05-04 13:00:55', '2023-05-04 13:00:55', 3, 3),
        (4, '2023-05-04 13:00:55', '2023-05-04 13:00:55', 4, 4),
        (5, '2023-05-04 13:00:55', '2023-05-04 13:00:55', 5, 5),
        (6, '2023-05-04 13:00:55', '2023-05-04 13:00:55', 6, 6),
        (7, '2023-05-04 13:00:55', '2023-05-04 13:00:55', 7, 7),
        (8, '2023-05-04 13:00:55', '2023-05-04 13:00:55', 8, 8);