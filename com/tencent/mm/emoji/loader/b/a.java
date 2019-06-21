package com.tencent.mm.emoji.loader.b;

import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/decoder/AnimateDecoder;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "decode", "Landroid/graphics/drawable/Drawable;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "sizeCallback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "width", "height", "", "plugin-emojisdk_release"})
public final class a
{
  private final String TAG = "MicroMsg.EmojiLoader.AnimateDecoder";

  // ERROR //
  public final android.graphics.drawable.Drawable a(com.tencent.mm.storage.emotion.EmojiInfo paramEmojiInfo, a.f.a.m<? super java.lang.Integer, ? super java.lang.Integer, a.y> paramm)
  {
    // Byte code:
    //   0: ldc 44
    //   2: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ldc 51
    //   8: invokestatic 57	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   11: aload_1
    //   12: invokevirtual 63	com/tencent/mm/storage/emotion/EmojiInfo:getGroup	()I
    //   15: getstatic 69	com/tencent/mm/storage/emotion/EmojiGroupInfo:yad	I
    //   18: if_icmpeq +23 -> 41
    //   21: aload_1
    //   22: invokevirtual 63	com/tencent/mm/storage/emotion/EmojiInfo:getGroup	()I
    //   25: getstatic 72	com/tencent/mm/storage/emotion/EmojiInfo:yak	I
    //   28: if_icmpeq +13 -> 41
    //   31: aload_1
    //   32: invokevirtual 63	com/tencent/mm/storage/emotion/EmojiInfo:getGroup	()I
    //   35: getstatic 75	com/tencent/mm/storage/emotion/EmojiInfo:yaj	I
    //   38: if_icmpne +143 -> 181
    //   41: aload_1
    //   42: invokevirtual 78	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   45: astore_3
    //   46: aload_3
    //   47: ldc 80
    //   49: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload_3
    //   53: checkcast 85	java/lang/CharSequence
    //   56: iconst_1
    //   57: anewarray 87	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: ldc 89
    //   64: aastore
    //   65: invokestatic 94	a/k/m:a	(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;
    //   68: iconst_0
    //   69: invokeinterface 100 2 0
    //   74: checkcast 87	java/lang/String
    //   77: astore_3
    //   78: aload_0
    //   79: getfield 36	com/tencent/mm/emoji/loader/b/a:TAG	Ljava/lang/String;
    //   82: ldc 102
    //   84: iconst_1
    //   85: anewarray 4	java/lang/Object
    //   88: dup
    //   89: iconst_0
    //   90: aload_3
    //   91: aastore
    //   92: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: invokestatic 114	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   98: astore 4
    //   100: aload 4
    //   102: ldc 116
    //   104: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   107: aload 4
    //   109: invokevirtual 122	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   112: aload_3
    //   113: ldc 124
    //   115: invokestatic 127	com/tencent/mm/sdk/platformtools/ah:getPackageName	()Ljava/lang/String;
    //   118: invokevirtual 133	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   121: istore 5
    //   123: invokestatic 114	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   126: astore_3
    //   127: aload_3
    //   128: ldc 116
    //   130: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   133: aload_3
    //   134: invokevirtual 122	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   137: iload 5
    //   139: invokevirtual 137	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   142: astore_3
    //   143: iconst_0
    //   144: istore 5
    //   146: iconst_0
    //   147: istore 6
    //   149: aload_3
    //   150: ifnull +571 -> 721
    //   153: aload_2
    //   154: ifnull +20 -> 174
    //   157: aload_2
    //   158: iload 6
    //   160: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   163: iload 5
    //   165: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   168: invokeinterface 149 3 0
    //   173: pop
    //   174: ldc 44
    //   176: invokestatic 151	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   179: aload_3
    //   180: areturn
    //   181: aload_1
    //   182: invokevirtual 155	com/tencent/mm/storage/emotion/EmojiInfo:duS	()Z
    //   185: ifeq +124 -> 309
    //   188: aload_1
    //   189: invokevirtual 78	com/tencent/mm/storage/emotion/EmojiInfo:getName	()Ljava/lang/String;
    //   192: astore_3
    //   193: aload_3
    //   194: ldc 80
    //   196: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   199: aload_3
    //   200: checkcast 85	java/lang/CharSequence
    //   203: iconst_1
    //   204: anewarray 87	java/lang/String
    //   207: dup
    //   208: iconst_0
    //   209: ldc 89
    //   211: aastore
    //   212: invokestatic 94	a/k/m:a	(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;
    //   215: iconst_0
    //   216: invokeinterface 100 2 0
    //   221: checkcast 87	java/lang/String
    //   224: astore_3
    //   225: aload_0
    //   226: getfield 36	com/tencent/mm/emoji/loader/b/a:TAG	Ljava/lang/String;
    //   229: ldc 102
    //   231: iconst_1
    //   232: anewarray 4	java/lang/Object
    //   235: dup
    //   236: iconst_0
    //   237: aload_3
    //   238: aastore
    //   239: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: invokestatic 114	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   245: astore 4
    //   247: aload 4
    //   249: ldc 116
    //   251: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   254: aload 4
    //   256: invokevirtual 122	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   259: aload_3
    //   260: ldc 124
    //   262: invokestatic 127	com/tencent/mm/sdk/platformtools/ah:getPackageName	()Ljava/lang/String;
    //   265: invokevirtual 133	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   268: istore 5
    //   270: invokestatic 114	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   273: astore_3
    //   274: aload_3
    //   275: ldc 116
    //   277: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   280: new 157	com/tencent/mm/plugin/gif/d
    //   283: dup
    //   284: aload_3
    //   285: invokevirtual 122	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   288: iload 5
    //   290: invokevirtual 161	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   293: invokespecial 164	com/tencent/mm/plugin/gif/d:<init>	(Ljava/io/InputStream;)V
    //   296: checkcast 166	android/graphics/drawable/Drawable
    //   299: astore_3
    //   300: iconst_0
    //   301: istore 5
    //   303: iconst_0
    //   304: istore 6
    //   306: goto -157 -> 149
    //   309: aload_1
    //   310: invokevirtual 169	com/tencent/mm/storage/emotion/EmojiInfo:duP	()Z
    //   313: ifne +13 -> 326
    //   316: ldc 44
    //   318: invokestatic 151	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   321: aconst_null
    //   322: astore_3
    //   323: goto -144 -> 179
    //   326: ldc 171
    //   328: invokestatic 177	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   331: astore_3
    //   332: aload_3
    //   333: ldc 179
    //   335: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   338: aload_3
    //   339: checkcast 171	com/tencent/mm/plugin/emoji/b/d
    //   342: invokeinterface 183 1 0
    //   347: aload_1
    //   348: invokeinterface 189 2 0
    //   353: astore 7
    //   355: aload 7
    //   357: invokestatic 195	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   360: ifeq +43 -> 403
    //   363: aload_0
    //   364: getfield 36	com/tencent/mm/emoji/loader/b/a:TAG	Ljava/lang/String;
    //   367: new 197	java/lang/StringBuilder
    //   370: dup
    //   371: ldc 199
    //   373: invokespecial 202	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   376: aload_1
    //   377: invokevirtual 205	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   380: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   386: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   389: aload_1
    //   390: invokevirtual 218	com/tencent/mm/storage/emotion/EmojiInfo:duQ	()V
    //   393: ldc 44
    //   395: invokestatic 151	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   398: aconst_null
    //   399: astore_3
    //   400: goto -221 -> 179
    //   403: aload 7
    //   405: invokestatic 223	com/tencent/mm/sdk/platformtools/r:bU	([B)Z
    //   408: ifeq +125 -> 533
    //   411: new 225	com/tencent/mm/plugin/gif/h
    //   414: astore_3
    //   415: aload_3
    //   416: aload 7
    //   418: invokespecial 228	com/tencent/mm/plugin/gif/h:<init>	([B)V
    //   421: aload_3
    //   422: checkcast 166	android/graphics/drawable/Drawable
    //   425: astore_3
    //   426: ldc 171
    //   428: invokestatic 177	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   431: astore 4
    //   433: aload 4
    //   435: ldc 179
    //   437: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   440: aload 4
    //   442: checkcast 171	com/tencent/mm/plugin/emoji/b/d
    //   445: invokeinterface 183 1 0
    //   450: astore 4
    //   452: aload 4
    //   454: ldc 230
    //   456: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   459: aload 4
    //   461: invokeinterface 233 1 0
    //   466: ifne +318 -> 784
    //   469: aload_0
    //   470: getfield 36	com/tencent/mm/emoji/loader/b/a:TAG	Ljava/lang/String;
    //   473: ldc 235
    //   475: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   478: aload_1
    //   479: invokevirtual 218	com/tencent/mm/storage/emotion/EmojiInfo:duQ	()V
    //   482: getstatic 244	com/tencent/mm/emoji/loader/a:exs	Lcom/tencent/mm/emoji/loader/a;
    //   485: astore 4
    //   487: aload_1
    //   488: aconst_null
    //   489: invokestatic 247	com/tencent/mm/emoji/loader/a:a	(Lcom/tencent/mm/storage/emotion/EmojiInfo;Lcom/tencent/mm/emoji/loader/d/h$a;)Lcom/tencent/mm/emoji/loader/d/d;
    //   492: pop
    //   493: aload_3
    //   494: instanceof 157
    //   497: ifeq +54 -> 551
    //   500: aload_3
    //   501: checkcast 157	com/tencent/mm/plugin/gif/d
    //   504: invokevirtual 250	com/tencent/mm/plugin/gif/d:bFO	()I
    //   507: istore 6
    //   509: iload 6
    //   511: istore 5
    //   513: iload 6
    //   515: istore 8
    //   517: aload_3
    //   518: checkcast 157	com/tencent/mm/plugin/gif/d
    //   521: invokevirtual 253	com/tencent/mm/plugin/gif/d:bFP	()I
    //   524: istore 9
    //   526: iload 9
    //   528: istore 5
    //   530: goto -381 -> 149
    //   533: new 157	com/tencent/mm/plugin/gif/d
    //   536: astore_3
    //   537: aload_3
    //   538: aload 7
    //   540: invokespecial 254	com/tencent/mm/plugin/gif/d:<init>	([B)V
    //   543: aload_3
    //   544: checkcast 166	android/graphics/drawable/Drawable
    //   547: astore_3
    //   548: goto -55 -> 493
    //   551: aload_3
    //   552: checkcast 225	com/tencent/mm/plugin/gif/h
    //   555: invokevirtual 255	com/tencent/mm/plugin/gif/h:bFO	()I
    //   558: istore 6
    //   560: iload 6
    //   562: istore 5
    //   564: iload 6
    //   566: istore 8
    //   568: aload_3
    //   569: checkcast 225	com/tencent/mm/plugin/gif/h
    //   572: invokevirtual 256	com/tencent/mm/plugin/gif/h:bFP	()I
    //   575: istore 9
    //   577: iload 9
    //   579: istore 5
    //   581: goto -432 -> 149
    //   584: astore 4
    //   586: aconst_null
    //   587: astore_3
    //   588: iconst_0
    //   589: istore 6
    //   591: aload 4
    //   593: invokevirtual 259	com/tencent/mm/plugin/gif/MMGIFException:getErrorCode	()I
    //   596: bipush 103
    //   598: if_icmpne +180 -> 778
    //   601: aload 7
    //   603: invokestatic 265	com/tencent/mm/sdk/platformtools/d:bQ	([B)Landroid/graphics/Bitmap;
    //   606: astore 4
    //   608: aload 4
    //   610: ifnonnull +27 -> 637
    //   613: aload_0
    //   614: getfield 36	com/tencent/mm/emoji/loader/b/a:TAG	Ljava/lang/String;
    //   617: ldc_w 267
    //   620: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   623: aload_1
    //   624: invokevirtual 218	com/tencent/mm/storage/emotion/EmojiInfo:duQ	()V
    //   627: ldc 44
    //   629: invokestatic 151	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   632: aconst_null
    //   633: astore_3
    //   634: goto -455 -> 179
    //   637: aload 4
    //   639: sipush 320
    //   642: invokevirtual 272	android/graphics/Bitmap:setDensity	(I)V
    //   645: invokestatic 114	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   648: astore_3
    //   649: aload_3
    //   650: ldc 116
    //   652: invokestatic 83	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   655: new 274	android/graphics/drawable/BitmapDrawable
    //   658: dup
    //   659: aload_3
    //   660: invokevirtual 122	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   663: aload 4
    //   665: invokespecial 277	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   668: checkcast 166	android/graphics/drawable/Drawable
    //   671: astore_3
    //   672: aload 4
    //   674: invokevirtual 280	android/graphics/Bitmap:getWidth	()I
    //   677: istore 6
    //   679: aload 4
    //   681: invokevirtual 283	android/graphics/Bitmap:getHeight	()I
    //   684: istore 5
    //   686: goto -537 -> 149
    //   689: astore 4
    //   691: aconst_null
    //   692: astore_3
    //   693: iconst_0
    //   694: istore 6
    //   696: aload_0
    //   697: getfield 36	com/tencent/mm/emoji/loader/b/a:TAG	Ljava/lang/String;
    //   700: aload 4
    //   702: checkcast 285	java/lang/Throwable
    //   705: ldc_w 286
    //   708: iconst_0
    //   709: anewarray 4	java/lang/Object
    //   712: invokestatic 290	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   715: iconst_0
    //   716: istore 5
    //   718: goto -569 -> 149
    //   721: aload_1
    //   722: invokevirtual 218	com/tencent/mm/storage/emotion/EmojiInfo:duQ	()V
    //   725: goto -551 -> 174
    //   728: astore 4
    //   730: iconst_0
    //   731: istore 6
    //   733: goto -37 -> 696
    //   736: astore 4
    //   738: iconst_0
    //   739: istore 6
    //   741: goto -45 -> 696
    //   744: astore 4
    //   746: iload 5
    //   748: istore 6
    //   750: goto -54 -> 696
    //   753: astore 4
    //   755: iconst_0
    //   756: istore 6
    //   758: goto -167 -> 591
    //   761: astore 4
    //   763: iconst_0
    //   764: istore 6
    //   766: goto -175 -> 591
    //   769: astore 4
    //   771: iload 8
    //   773: istore 6
    //   775: goto -184 -> 591
    //   778: iconst_0
    //   779: istore 5
    //   781: goto -632 -> 149
    //   784: goto -291 -> 493
    //
    // Exception table:
    //   from	to	target	type
    //   403	426	584	com/tencent/mm/plugin/gif/MMGIFException
    //   533	548	584	com/tencent/mm/plugin/gif/MMGIFException
    //   403	426	689	java/io/IOException
    //   533	548	689	java/io/IOException
    //   426	493	728	java/io/IOException
    //   493	509	736	java/io/IOException
    //   551	560	736	java/io/IOException
    //   517	526	744	java/io/IOException
    //   568	577	744	java/io/IOException
    //   426	493	753	com/tencent/mm/plugin/gif/MMGIFException
    //   493	509	761	com/tencent/mm/plugin/gif/MMGIFException
    //   551	560	761	com/tencent/mm/plugin/gif/MMGIFException
    //   517	526	769	com/tencent/mm/plugin/gif/MMGIFException
    //   568	577	769	com/tencent/mm/plugin/gif/MMGIFException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.b.a
 * JD-Core Version:    0.6.2
 */