# Java-Collections-TreeSet-HashMap
Buffer Yönetimi

LRU (Least Recently Used) algoritması, bir sayfa ihlali (page fault) olduğunda, yani diskteki bir sayfaya erişilmek istendiğinde, diskten ilgili sayfa hafızaya (RAM) yüklenirken, hafızadaki en az erişilen sayfa yerine yüklenir ve bu en az kullanılan sayfa da diske geri yazılır.

# Uygulama
5 kelimelik bir buffer yöneteceğiz. Buffer yönetimi için HashMap veri yapısını kullanacağız.

Komut satırından en az 10 kelimelik input alınacak.
Yeni kelime okununca eğer bufferda yoksa en eski string (yani bufferId'si en küçük olan) bufferdan atılarak onun yerine en yeni string bufferId'si en büyük olacak şekilde alınacak.Bufferda varsa bu string en yeni olarak işaretlenecek.Her bir kelimeye buffer id atanarak bufferda kalma süreleri karşılaştırılır. Bu sayede kelimeyi en eski kullanılan string şeklinde seçebiliriz.

![Screenshot_1](https://user-images.githubusercontent.com/49806516/71642489-f7bc2d80-2cbc-11ea-9df8-74ae3bcd02b7.png)




