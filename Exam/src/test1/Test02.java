p a c k a g e   t e s t 1 ;  
  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
 / * *  
   *   ����  :   2 0 2 3 / 1 2 / 2 8  
   *   tǄ�  :   @� �� 
   *   ����  :   ���  0���  �ǜ�%�  �ŵ�8�� 
   * /  
  
 p u b l i c   c l a s s   T e s t 0 2   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	  
 	 	 S c a n n e r   s c   =   n e w   S c a n n e r   ( S y s t e m . i n ) ;  
 	 	  
 	 	 i n t   y e a r ;  
 	 	 i n t   b i r t h ;  
 	 	 S t r i n g   n a m e ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t ( " ,�t�  D�ĳ  ��%�: " ) ;  
 	 	 y e a r   =   s c . n e x t I n t ( ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t ( " �дŜ�  D�ĳ  ��%�: " ) ;  
 	 	 b i r t h   =   s c . n e x t I n t ( ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t ( " tǄ���%�:   \ n " ) ;  
 	 	 n a m e   =   s c . n e x t ( ) ;  
 	 	  
 	 	 i n t   a g e   =   y e a r - b i r t h ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t f ( " % s ز  H�U�X�8���.   ����@�  ,�t�  ̹  % d 8�  ��Ȳ�. " , n a m e ,   a g e ) ;  
 	 	  
 	 	 s c . c l o s e ( ) ;  
 	 }  
  
 }  
 