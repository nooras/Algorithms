from selenium import webdriver

driver = webdriver.Chrome()
driver.get('http://web.whatsapp.com')

name = input('Enter the name of user or group : ')
#msg = input('Enter the message : ')
msg = "Friendship is one of the greatest bonds anyone can ever wish for. Lucky are those who have friends they can trust. Friendship is a devoted relationship between two individuals. They both feel immense care and love for each other. Usually, a friendship is shared by two people who have similar interests and feelings.Essay on Friendship. You meet many along the way of life but only some stay with you forever. Those are your real friends who stay by your side through thick and thin. Friendship is the most beautiful gift you can present to anyone. It is one which stays with a person forever. True Friendship A person is acquainted with many persons in their life. However, the closest ones become our friends. You may have a large friend circle in school or college, but you know you can only count on one or two people with whom you share true friendship. There are essentially two types of friends, one is good friends the other are true friends or best friends. They’re the ones with whom we have a special bond of love and affection. In other words, having a true friend makes our lives easier and full of happiness. Most importantly, true friendship stands for a relationship free of any judgments. In a true friendship, a person can be themselves completely without the fear of being judged. It makes you feel loved and accepted. This kind of freedom is what every human strives to have in their lives. In short, true friendship is what gives us reason to stay strong in life. Having a loving family and all is okay but you also need true friendship to be completely happy. Some people don’t even have families but they have friends who’re like their family only. Thus, we see having true friends means a lot to everyone. Importance of Friendship Friendship is important in life because it teaches us a great deal about life. We learn so many lessons from friendship which we won’t find anywhere else. You learn to love someone other than your family. You know how to be yourself in front of friends. Friendship never leaves us in bad times. You learn how to understand people and trust others. Your real friends will always motivate you and cheer for you. They will take you on the right path and save you from any evil. Similarly, friendship also teaches you a lot about loyalty. It helps us to become loyal and get loyalty in return. There is no greater feeling in the world than having a friend who is loyal to you. Moreover, friendship makes us stronger. It tests us and helps us grow. For instance, we see how we fight with our friends yet come back together after setting aside our differences. This is what makes us strong and teaches us patience.".strip().split()

#count = int(input('Enter the count : '))

#Scan the code before proceeding further
input('Enter anything after scanning QR code')

user = driver.find_element_by_xpath('//span[@title = "{}"]'.format(name))
user.click()

msg_box = driver.find_element_by_class_name('_1Plpp')

for i in msg:
    if i is not None:
    	msg_box.send_keys(i)
    	driver.find_element_by_class_name('_35EW6').click()
