--create table game();
insert into game(id, player_id, shot)
values
    ('3422b448-2460-4fd2-8183-8000de6f8343', '3422b448-2460-4fd2-8888-8000de6f8343', 'Мимо');


insert into player(id, player_nick_name, ship_one_deck_id, ship_two_deck_id, ship_three_deck_id, ship_four_deck_id)
values
    ('3422b448-2460-4fd2-8888-8000de6f8343', 'Vasya', '3422b448-2460-4fd2-1999-8000de6f8343', '3422b448-2460-4fd2-1229-8000de6f8343', '3422b414-2460-4fd2-1229-8000de6f8343', '3722b443-2460-4fd2-1229-8000de6f8343'),
    ('8422b448-2460-4fd2-8888-8000de6f8343', 'Lena', '3422b448-2460-4fd2-2999-8000de6f8343', '3422b448-2460-4fd2-1339-8000de6f8343', '3422b418-2460-4fd2-1339-8000de6f8343', '3722b443-2460-4fd2-1229-8000de6f8343');

insert into ship_one_deck(id, ship_name, coordinate)
values
    ('3422b448-2460-4fd2-1999-8000de6f8343','1deck_ship', 'A1'),
    ('3422b448-2460-4fd2-2999-8000de6f8343','1deck_ship', 'B6'),
    ('3422b448-2460-4fd2-3999-8000de6f8343','1deck_ship', 'F6'),
    ('8422b448-2460-4fd2-4999-8000de6f8343','1deck_ship', 'G2');

insert into ship_two_deck(id, ship_name, orientation, coordinate)
values
    ('3422b448-2460-4fd2-1229-8000de6f8343', '2deck_ship', 'vertical', 'K2K3'),
    ('3422b448-2460-4fd2-1339-8000de6f8343', '2deck_ship', 'horizontal', 'B9C9'),
    ('3422b448-2460-4fd2-1449-8000de6f8343', '2deck_ship', 'horizontal', 'F9G9');

insert into ship_three_deck(id, ship_name, orientation, coordinate)
values
    ('3422b414-2460-4fd2-1229-8000de6f8343', '3deck_ship', 'vertical', 'H4H5H6'),
    ('3422b418-2460-4fd2-1339-8000de6f8343', '3deck_ship', 'vertical', 'D5D6D7');

insert into ship_four_deck(id, ship_name, orientation, coordinate)
values
    ('3722b443-2460-4fd2-1229-8000de6f8343', '4deck_ship', 'horizontal', 'B3C3D3E3');


--insert into shot(id, dead, hit, miss, victory)
--values
  --('3402b448-2460-4fd2-1999-8000de6f8313', false, false, false, true),
  --('3420b448-2460-4fd2-2999-8000de6f8343', false, false, true, false),
  --('3420b448-2460-4fd2-3999-8000de6f8343', false, true, false, false),
  --('8420b448-2460-4fd2-4999-8000de6f8343', true, false, false, false);


