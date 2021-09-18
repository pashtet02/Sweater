create table user_subscriptions
(
    channel_id    INT NOT NULL AUTO_INCREMENT references usr,
    subscriber_id INT NOT NULL AUTO_INCREMENT references usr,
    primary key (channel_id, subscriber_id)
);