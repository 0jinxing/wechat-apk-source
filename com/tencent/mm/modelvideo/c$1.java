package com.tencent.mm.modelvideo;

import android.os.AsyncTask;

final class c$1 extends AsyncTask<String, Integer, String>
{
  int ret = 0;

  c$1(c paramc)
  {
  }

  // ERROR //
  private String akS()
  {
    // Byte code:
    //   0: ldc 26
    //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
    //   10: invokestatic 38	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   13: invokestatic 44	com/tencent/mm/sdk/platformtools/at:is2G	(Landroid/content/Context;)Z
    //   16: istore_1
    //   17: aload_0
    //   18: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   21: getfield 48	com/tencent/mm/modelvideo/c:context	Landroid/content/Context;
    //   24: aload_0
    //   25: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   28: getfield 52	com/tencent/mm/modelvideo/c:intent	Landroid/content/Intent;
    //   31: invokestatic 58	com/tencent/mm/compatible/j/a:j	(Landroid/content/Context;Landroid/content/Intent;)Lcom/tencent/mm/compatible/j/a$a;
    //   34: astore_2
    //   35: aload_2
    //   36: ifnonnull +61 -> 97
    //   39: ldc 60
    //   41: ldc 62
    //   43: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: getstatic 74	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   49: ldc2_w 75
    //   52: ldc2_w 77
    //   55: lconst_1
    //   56: iconst_0
    //   57: invokevirtual 82	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   60: aload_0
    //   61: ldc 83
    //   63: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
    //   66: ldc 26
    //   68: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: aconst_null
    //   72: areturn
    //   73: astore_2
    //   74: ldc 60
    //   76: ldc 88
    //   78: iconst_1
    //   79: anewarray 90	java/lang/Object
    //   82: dup
    //   83: iconst_0
    //   84: aload_2
    //   85: invokestatic 96	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   88: aastore
    //   89: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aconst_null
    //   93: astore_2
    //   94: goto -59 -> 35
    //   97: aload_0
    //   98: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   101: aload_2
    //   102: getfield 105	com/tencent/mm/compatible/j/a$a:filename	Ljava/lang/String;
    //   105: putfield 108	com/tencent/mm/modelvideo/c:fUG	Ljava/lang/String;
    //   108: aload_0
    //   109: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   112: getfield 108	com/tencent/mm/modelvideo/c:fUG	Ljava/lang/String;
    //   115: invokestatic 114	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   118: l2i
    //   119: istore_3
    //   120: ldc 60
    //   122: ldc 116
    //   124: iconst_4
    //   125: anewarray 90	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: iload_1
    //   131: invokestatic 122	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   134: aastore
    //   135: dup
    //   136: iconst_1
    //   137: iload_3
    //   138: invokestatic 127	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   141: aastore
    //   142: dup
    //   143: iconst_2
    //   144: aload_2
    //   145: getfield 130	com/tencent/mm/compatible/j/a$a:duration	I
    //   148: invokestatic 127	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   151: aastore
    //   152: dup
    //   153: iconst_3
    //   154: aload_0
    //   155: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   158: getfield 108	com/tencent/mm/modelvideo/c:fUG	Ljava/lang/String;
    //   161: aastore
    //   162: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: iload_3
    //   166: ifgt +31 -> 197
    //   169: getstatic 74	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   172: ldc2_w 75
    //   175: ldc2_w 77
    //   178: lconst_1
    //   179: iconst_0
    //   180: invokevirtual 82	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   183: aload_0
    //   184: ldc 133
    //   186: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
    //   189: ldc 26
    //   191: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: goto -123 -> 71
    //   197: iload_1
    //   198: ifeq +41 -> 239
    //   201: ldc 134
    //   203: istore 4
    //   205: iload_3
    //   206: iload 4
    //   208: if_icmple +39 -> 247
    //   211: getstatic 74	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   214: ldc2_w 75
    //   217: ldc2_w 135
    //   220: lconst_1
    //   221: iconst_0
    //   222: invokevirtual 82	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   225: aload_0
    //   226: ldc 137
    //   228: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
    //   231: ldc 26
    //   233: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: goto -165 -> 71
    //   239: getstatic 140	com/tencent/mm/modelvideo/c:fUE	I
    //   242: istore 4
    //   244: goto -39 -> 205
    //   247: aload_0
    //   248: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   251: getfield 108	com/tencent/mm/modelvideo/c:fUG	Ljava/lang/String;
    //   254: aload_0
    //   255: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   258: getfield 143	com/tencent/mm/modelvideo/c:videoPath	Ljava/lang/String;
    //   261: invokestatic 147	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   264: pop2
    //   265: aload_0
    //   266: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   269: aload_2
    //   270: getfield 130	com/tencent/mm/compatible/j/a$a:duration	I
    //   273: sipush 1000
    //   276: idiv
    //   277: putfield 148	com/tencent/mm/modelvideo/c:duration	I
    //   280: iconst_1
    //   281: istore_3
    //   282: iconst_1
    //   283: istore 4
    //   285: aload_2
    //   286: getfield 152	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   289: ifnull +40 -> 329
    //   292: aload_2
    //   293: getfield 152	com/tencent/mm/compatible/j/a$a:bitmap	Landroid/graphics/Bitmap;
    //   296: bipush 60
    //   298: getstatic 158	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   301: aload_0
    //   302: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   305: getfield 161	com/tencent/mm/modelvideo/c:thumbPath	Ljava/lang/String;
    //   308: iconst_1
    //   309: invokestatic 166	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   312: getstatic 74	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   315: ldc2_w 75
    //   318: ldc2_w 167
    //   321: lconst_1
    //   322: iconst_0
    //   323: invokevirtual 82	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   326: iconst_0
    //   327: istore 4
    //   329: iload 4
    //   331: ifeq +44 -> 375
    //   334: getstatic 74	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   337: ldc2_w 75
    //   340: ldc2_w 169
    //   343: lconst_1
    //   344: iconst_0
    //   345: invokevirtual 82	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   348: ldc 171
    //   350: sipush 320
    //   353: sipush 480
    //   356: invokestatic 175	com/tencent/mm/sdk/platformtools/d:au	(III)Landroid/graphics/Bitmap;
    //   359: bipush 60
    //   361: getstatic 158	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   364: aload_0
    //   365: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   368: getfield 161	com/tencent/mm/modelvideo/c:thumbPath	Ljava/lang/String;
    //   371: iconst_1
    //   372: invokestatic 166	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   375: aload_0
    //   376: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   379: getfield 143	com/tencent/mm/modelvideo/c:videoPath	Ljava/lang/String;
    //   382: invokestatic 179	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   385: ifne +9 -> 394
    //   388: aload_0
    //   389: ldc 180
    //   391: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
    //   394: aload_0
    //   395: getfield 15	com/tencent/mm/modelvideo/c$1:fUI	Lcom/tencent/mm/modelvideo/c;
    //   398: getfield 161	com/tencent/mm/modelvideo/c:thumbPath	Ljava/lang/String;
    //   401: invokestatic 179	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   404: ifne +9 -> 413
    //   407: aload_0
    //   408: ldc 181
    //   410: putfield 20	com/tencent/mm/modelvideo/c$1:ret	I
    //   413: ldc 26
    //   415: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   418: goto -347 -> 71
    //   421: astore_2
    //   422: iload_3
    //   423: istore 4
    //   425: ldc 60
    //   427: ldc 88
    //   429: iconst_1
    //   430: anewarray 90	java/lang/Object
    //   433: dup
    //   434: iconst_0
    //   435: aload_2
    //   436: invokestatic 96	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   439: aastore
    //   440: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   443: goto -114 -> 329
    //   446: astore_2
    //   447: ldc 60
    //   449: ldc 88
    //   451: iconst_1
    //   452: anewarray 90	java/lang/Object
    //   455: dup
    //   456: iconst_0
    //   457: aload_2
    //   458: invokestatic 96	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   461: aastore
    //   462: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   465: goto -90 -> 375
    //   468: astore_2
    //   469: iconst_0
    //   470: istore 4
    //   472: goto -47 -> 425
    //
    // Exception table:
    //   from	to	target	type
    //   17	35	73	java/lang/Exception
    //   292	312	421	java/lang/Exception
    //   334	375	446	java/lang/Exception
    //   312	326	468	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.c.1
 * JD-Core Version:    0.6.2
 */