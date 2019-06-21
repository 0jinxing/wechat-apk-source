package com.tencent.tencentmap.mapsdk.maps.a;

class lh$2 extends Thread
{
  lh$2(lh paramlh, String paramString1, String paramString2)
  {
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc 29
    //   2: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokespecial 37	java/lang/Thread:run	()V
    //   9: new 39	java/net/URL
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: getfield 19	com/tencent/tencentmap/mapsdk/maps/a/lh$2:a	Ljava/lang/String;
    //   18: invokespecial 42	java/net/URL:<init>	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: invokevirtual 46	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   25: checkcast 48	java/net/HttpURLConnection
    //   28: astore_1
    //   29: aload_1
    //   30: sipush 3000
    //   33: invokevirtual 51	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   36: aload_1
    //   37: invokevirtual 55	java/net/HttpURLConnection:getResponseCode	()I
    //   40: sipush 200
    //   43: if_icmpne +77 -> 120
    //   46: aload_1
    //   47: invokevirtual 59	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   50: invokestatic 65	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   53: astore_2
    //   54: aload_2
    //   55: ifnull +15 -> 70
    //   58: invokestatic 69	com/tencent/tencentmap/mapsdk/maps/a/lh:m	()Ljava/util/concurrent/ConcurrentHashMap;
    //   61: aload_0
    //   62: getfield 21	com/tencent/tencentmap/mapsdk/maps/a/lh$2:b	Ljava/lang/String;
    //   65: aload_2
    //   66: invokevirtual 75	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   69: pop
    //   70: aload_0
    //   71: getfield 17	com/tencent/tencentmap/mapsdk/maps/a/lh$2:c	Lcom/tencent/tencentmap/mapsdk/maps/a/lh;
    //   74: invokestatic 78	com/tencent/tencentmap/mapsdk/maps/a/lh:b	(Lcom/tencent/tencentmap/mapsdk/maps/a/lh;)Landroid/widget/ImageView;
    //   77: ifnull +30 -> 107
    //   80: aload_0
    //   81: getfield 17	com/tencent/tencentmap/mapsdk/maps/a/lh$2:c	Lcom/tencent/tencentmap/mapsdk/maps/a/lh;
    //   84: invokestatic 78	com/tencent/tencentmap/mapsdk/maps/a/lh:b	(Lcom/tencent/tencentmap/mapsdk/maps/a/lh;)Landroid/widget/ImageView;
    //   87: astore_3
    //   88: new 80	com/tencent/tencentmap/mapsdk/maps/a/lh$2$1
    //   91: astore 4
    //   93: aload 4
    //   95: aload_0
    //   96: aload_2
    //   97: invokespecial 83	com/tencent/tencentmap/mapsdk/maps/a/lh$2$1:<init>	(Lcom/tencent/tencentmap/mapsdk/maps/a/lh$2;Landroid/graphics/Bitmap;)V
    //   100: aload_3
    //   101: aload 4
    //   103: invokevirtual 89	android/widget/ImageView:post	(Ljava/lang/Runnable;)Z
    //   106: pop
    //   107: aload_0
    //   108: getfield 17	com/tencent/tencentmap/mapsdk/maps/a/lh$2:c	Lcom/tencent/tencentmap/mapsdk/maps/a/lh;
    //   111: aload_0
    //   112: getfield 21	com/tencent/tencentmap/mapsdk/maps/a/lh$2:b	Ljava/lang/String;
    //   115: aload_2
    //   116: invokestatic 92	com/tencent/tencentmap/mapsdk/maps/a/lh:a	(Lcom/tencent/tencentmap/mapsdk/maps/a/lh;Ljava/lang/String;Landroid/graphics/Bitmap;)Z
    //   119: pop
    //   120: aload_1
    //   121: ifnull +7 -> 128
    //   124: aload_1
    //   125: invokevirtual 95	java/net/HttpURLConnection:disconnect	()V
    //   128: invokestatic 99	com/tencent/tencentmap/mapsdk/maps/a/lh:n	()Ljava/util/List;
    //   131: aload_0
    //   132: getfield 21	com/tencent/tencentmap/mapsdk/maps/a/lh$2:b	Ljava/lang/String;
    //   135: invokeinterface 105 2 0
    //   140: pop
    //   141: ldc 29
    //   143: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: return
    //   147: astore_1
    //   148: aconst_null
    //   149: astore_1
    //   150: aload_1
    //   151: ifnull +7 -> 158
    //   154: aload_1
    //   155: invokevirtual 95	java/net/HttpURLConnection:disconnect	()V
    //   158: invokestatic 99	com/tencent/tencentmap/mapsdk/maps/a/lh:n	()Ljava/util/List;
    //   161: aload_0
    //   162: getfield 21	com/tencent/tencentmap/mapsdk/maps/a/lh$2:b	Ljava/lang/String;
    //   165: invokeinterface 105 2 0
    //   170: pop
    //   171: ldc 29
    //   173: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: goto -30 -> 146
    //   179: astore_1
    //   180: aconst_null
    //   181: astore 4
    //   183: aload 4
    //   185: ifnull +8 -> 193
    //   188: aload 4
    //   190: invokevirtual 95	java/net/HttpURLConnection:disconnect	()V
    //   193: invokestatic 99	com/tencent/tencentmap/mapsdk/maps/a/lh:n	()Ljava/util/List;
    //   196: aload_0
    //   197: getfield 21	com/tencent/tencentmap/mapsdk/maps/a/lh$2:b	Ljava/lang/String;
    //   200: invokeinterface 105 2 0
    //   205: pop
    //   206: ldc 29
    //   208: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   211: aload_1
    //   212: athrow
    //   213: astore 4
    //   215: aload_1
    //   216: astore_2
    //   217: aload 4
    //   219: astore_1
    //   220: aload_2
    //   221: astore 4
    //   223: goto -40 -> 183
    //   226: astore 4
    //   228: goto -78 -> 150
    //
    // Exception table:
    //   from	to	target	type
    //   9	29	147	java/lang/Throwable
    //   9	29	179	finally
    //   29	54	213	finally
    //   58	70	213	finally
    //   70	107	213	finally
    //   107	120	213	finally
    //   29	54	226	java/lang/Throwable
    //   58	70	226	java/lang/Throwable
    //   70	107	226	java/lang/Throwable
    //   107	120	226	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lh.2
 * JD-Core Version:    0.6.2
 */