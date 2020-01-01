# Java-Collections-TreeSet-HashMap
Buffer Yönetimi

LRU (Least Recently Used) algoritması, bir sayfa ihlali (page fault) olduğunda, yani diskteki bir sayfaya erişilmek istendiğinde, diskten ilgili sayfa hafızaya (RAM) yüklenirken, hafızadaki en az erişilen sayfa yerine yüklenir ve bu en az kullanılan sayfa da diske geri yazılır.

# Uygulama
5 kelimelik bir buffer yöneteceğiz. Buffer yönetimi için HashMap veri yapısını kullanacağız.

Komut satırından en az 10 kelimelik input alınacak.
Yeni kelime okununca eğer bufferda yoksa en eski string bufferdan atılarak onun yerine en yeni string olarak alınacak.Bufferda varsa bu string en yeni olarak işaretlenecek.



