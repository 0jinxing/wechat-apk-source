package com.tencent.mm.plugin.a;

public final class b
{
  public long gjO = -1L;
  public long gjP = -1L;
  public long gjQ = -1L;
  public a gjR = null;

  // ERROR //
  private a z(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc 30
    //   2: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: lconst_0
    //   6: lconst_0
    //   7: lcmp
    //   8: ifge +19 -> 27
    //   11: ldc 38
    //   13: ldc 40
    //   15: invokestatic 46	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: aconst_null
    //   19: astore_2
    //   20: ldc 30
    //   22: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: aload_2
    //   26: areturn
    //   27: aconst_null
    //   28: astore_2
    //   29: aload_1
    //   30: lconst_0
    //   31: invokevirtual 55	java/io/InputStream:skip	(J)J
    //   34: lstore_3
    //   35: lload_3
    //   36: lconst_0
    //   37: lcmp
    //   38: ifge +13 -> 51
    //   41: aconst_null
    //   42: astore_2
    //   43: ldc 30
    //   45: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: goto -23 -> 25
    //   51: lconst_0
    //   52: lstore_3
    //   53: bipush 8
    //   55: newarray byte
    //   57: astore 5
    //   59: aload_1
    //   60: aload 5
    //   62: iconst_0
    //   63: bipush 8
    //   65: invokevirtual 59	java/io/InputStream:read	([BII)I
    //   68: istore 6
    //   70: iload 6
    //   72: bipush 8
    //   74: if_icmplt +217 -> 291
    //   77: aload 5
    //   79: iconst_0
    //   80: invokestatic 65	com/tencent/mm/plugin/a/c:readInt	([BI)I
    //   83: istore 6
    //   85: aload 5
    //   87: iconst_4
    //   88: invokestatic 65	com/tencent/mm/plugin/a/c:readInt	([BI)I
    //   91: istore 7
    //   93: lconst_0
    //   94: lstore 8
    //   96: iload 6
    //   98: iconst_1
    //   99: if_icmpne +24 -> 123
    //   102: aload_1
    //   103: aload 5
    //   105: iconst_0
    //   106: bipush 8
    //   108: invokevirtual 59	java/io/InputStream:read	([BII)I
    //   111: bipush 8
    //   113: if_icmplt +178 -> 291
    //   116: aload 5
    //   118: invokestatic 69	com/tencent/mm/plugin/a/c:af	([B)J
    //   121: lstore 8
    //   123: aload_0
    //   124: aload_2
    //   125: putfield 24	com/tencent/mm/plugin/a/b:gjR	Lcom/tencent/mm/plugin/a/a;
    //   128: new 71	com/tencent/mm/plugin/a/a
    //   131: astore 10
    //   133: aload 10
    //   135: iload 6
    //   137: lload_3
    //   138: iload 7
    //   140: lload 8
    //   142: invokespecial 74	com/tencent/mm/plugin/a/a:<init>	(IJIJ)V
    //   145: aload 10
    //   147: astore_2
    //   148: aload 10
    //   150: invokevirtual 78	com/tencent/mm/plugin/a/a:anX	()Z
    //   153: ifne +113 -> 266
    //   156: aload 10
    //   158: astore_2
    //   159: aload 10
    //   161: invokevirtual 81	com/tencent/mm/plugin/a/a:anY	()Z
    //   164: ifne +102 -> 266
    //   167: iload 6
    //   169: iconst_1
    //   170: if_icmple +49 -> 219
    //   173: iload 6
    //   175: bipush 8
    //   177: isub
    //   178: i2l
    //   179: lstore 8
    //   181: lload_3
    //   182: iload 6
    //   184: i2l
    //   185: ladd
    //   186: lstore_3
    //   187: aload 10
    //   189: astore_2
    //   190: aload_1
    //   191: lload 8
    //   193: invokevirtual 55	java/io/InputStream:skip	(J)J
    //   196: lload 8
    //   198: lcmp
    //   199: iflt +67 -> 266
    //   202: aload_1
    //   203: aload 5
    //   205: iconst_0
    //   206: bipush 8
    //   208: invokevirtual 59	java/io/InputStream:read	([BII)I
    //   211: istore 6
    //   213: aload 10
    //   215: astore_2
    //   216: goto -146 -> 70
    //   219: aload 10
    //   221: astore_2
    //   222: lload 8
    //   224: lconst_0
    //   225: lcmp
    //   226: ifle +40 -> 266
    //   229: lload_3
    //   230: lload 8
    //   232: ladd
    //   233: lstore_3
    //   234: lload 8
    //   236: ldc2_w 82
    //   239: lsub
    //   240: ldc2_w 82
    //   243: lsub
    //   244: lstore 8
    //   246: goto -59 -> 187
    //   249: astore_2
    //   250: aconst_null
    //   251: astore_1
    //   252: ldc 38
    //   254: aload_2
    //   255: ldc 85
    //   257: iconst_0
    //   258: anewarray 4	java/lang/Object
    //   261: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: aload_1
    //   265: astore_2
    //   266: ldc 30
    //   268: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   271: goto -246 -> 25
    //   274: astore_2
    //   275: aload 10
    //   277: astore_1
    //   278: goto -26 -> 252
    //   281: astore 10
    //   283: aload_2
    //   284: astore_1
    //   285: aload 10
    //   287: astore_2
    //   288: goto -36 -> 252
    //   291: goto -25 -> 266
    //
    // Exception table:
    //   from	to	target	type
    //   29	35	249	java/lang/Exception
    //   53	70	249	java/lang/Exception
    //   148	156	274	java/lang/Exception
    //   159	167	274	java/lang/Exception
    //   190	213	274	java/lang/Exception
    //   77	93	281	java/lang/Exception
    //   102	123	281	java/lang/Exception
    //   123	145	281	java/lang/Exception
  }

  // ERROR //
  public final long vB(java.lang.String paramString)
  {
    // Byte code:
    //   0: ldc2_w 15
    //   3: lstore_2
    //   4: ldc 94
    //   6: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: invokestatic 98	com/tencent/mm/plugin/a/c:isNullOrNil	(Ljava/lang/String;)Z
    //   13: ifeq +17 -> 30
    //   16: ldc 38
    //   18: ldc 100
    //   20: invokestatic 46	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: ldc 94
    //   25: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: lload_2
    //   29: lreturn
    //   30: new 102	java/io/File
    //   33: dup
    //   34: aload_1
    //   35: invokespecial 105	java/io/File:<init>	(Ljava/lang/String;)V
    //   38: astore 4
    //   40: aconst_null
    //   41: astore 5
    //   43: new 107	java/io/FileInputStream
    //   46: astore 6
    //   48: aload 6
    //   50: aload_1
    //   51: invokespecial 108	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   54: aload_0
    //   55: aload 4
    //   57: invokevirtual 112	java/io/File:length	()J
    //   60: putfield 22	com/tencent/mm/plugin/a/b:gjQ	J
    //   63: aload_0
    //   64: aload 6
    //   66: invokespecial 114	com/tencent/mm/plugin/a/b:z	(Ljava/io/InputStream;)Lcom/tencent/mm/plugin/a/a;
    //   69: astore 7
    //   71: aload 7
    //   73: ifnonnull +110 -> 183
    //   76: ldc 38
    //   78: ldc 116
    //   80: invokestatic 46	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: ldc2_w 15
    //   86: lstore_2
    //   87: ldc2_w 15
    //   90: lstore 8
    //   92: aload 6
    //   94: invokevirtual 119	java/io/InputStream:close	()V
    //   97: lload_2
    //   98: lstore 10
    //   100: aload_0
    //   101: lload 8
    //   103: putfield 18	com/tencent/mm/plugin/a/b:gjO	J
    //   106: aload_0
    //   107: lload 10
    //   109: putfield 20	com/tencent/mm/plugin/a/b:gjP	J
    //   112: ldc 38
    //   114: new 121	java/lang/StringBuilder
    //   117: dup
    //   118: ldc 123
    //   120: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   123: lload 8
    //   125: invokevirtual 128	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   128: ldc 130
    //   130: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: aload_0
    //   134: getfield 20	com/tencent/mm/plugin/a/b:gjP	J
    //   137: invokevirtual 128	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   140: ldc 135
    //   142: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: aload 4
    //   147: invokevirtual 112	java/io/File:length	()J
    //   150: ldc2_w 136
    //   153: ldiv
    //   154: invokevirtual 128	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   157: ldc 139
    //   159: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload_1
    //   163: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: ldc 94
    //   174: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   177: lload 8
    //   179: lstore_2
    //   180: goto -152 -> 28
    //   183: aload 7
    //   185: invokevirtual 78	com/tencent/mm/plugin/a/a:anX	()Z
    //   188: ifeq +19 -> 207
    //   191: aload 7
    //   193: getfield 148	com/tencent/mm/plugin/a/a:gjN	J
    //   196: lstore 8
    //   198: aload 7
    //   200: invokevirtual 151	com/tencent/mm/plugin/a/a:getSize	()J
    //   203: lstore_2
    //   204: goto -112 -> 92
    //   207: aload 7
    //   209: invokevirtual 81	com/tencent/mm/plugin/a/a:anY	()Z
    //   212: ifeq +22 -> 234
    //   215: ldc 38
    //   217: ldc 153
    //   219: invokestatic 46	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: ldc2_w 15
    //   225: lstore_2
    //   226: ldc2_w 15
    //   229: lstore 8
    //   231: goto -139 -> 92
    //   234: aload 7
    //   236: invokevirtual 151	com/tencent/mm/plugin/a/a:getSize	()J
    //   239: lconst_0
    //   240: lcmp
    //   241: ifle +183 -> 424
    //   244: aload 7
    //   246: invokevirtual 156	com/tencent/mm/plugin/a/a:getEndPos	()J
    //   249: lstore 8
    //   251: ldc2_w 15
    //   254: lstore_2
    //   255: goto -163 -> 92
    //   258: astore 6
    //   260: ldc 38
    //   262: aload 6
    //   264: ldc 85
    //   266: iconst_0
    //   267: anewarray 4	java/lang/Object
    //   270: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: lload_2
    //   274: lstore 10
    //   276: goto -176 -> 100
    //   279: astore 7
    //   281: ldc2_w 15
    //   284: lstore_2
    //   285: aload 5
    //   287: astore 6
    //   289: ldc 38
    //   291: aload 7
    //   293: ldc 85
    //   295: iconst_0
    //   296: anewarray 4	java/lang/Object
    //   299: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   302: aload 6
    //   304: ifnull +109 -> 413
    //   307: aload 6
    //   309: invokevirtual 119	java/io/InputStream:close	()V
    //   312: ldc2_w 15
    //   315: lstore 10
    //   317: lload_2
    //   318: lstore 8
    //   320: goto -220 -> 100
    //   323: astore 6
    //   325: ldc 38
    //   327: aload 6
    //   329: ldc 85
    //   331: iconst_0
    //   332: anewarray 4	java/lang/Object
    //   335: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   338: ldc2_w 15
    //   341: lstore 10
    //   343: lload_2
    //   344: lstore 8
    //   346: goto -246 -> 100
    //   349: astore_1
    //   350: aconst_null
    //   351: astore 6
    //   353: aload 6
    //   355: ifnull +8 -> 363
    //   358: aload 6
    //   360: invokevirtual 119	java/io/InputStream:close	()V
    //   363: ldc 94
    //   365: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   368: aload_1
    //   369: athrow
    //   370: astore 6
    //   372: ldc 38
    //   374: aload 6
    //   376: ldc 85
    //   378: iconst_0
    //   379: anewarray 4	java/lang/Object
    //   382: invokestatic 89	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   385: goto -22 -> 363
    //   388: astore_1
    //   389: goto -36 -> 353
    //   392: astore_1
    //   393: goto -40 -> 353
    //   396: astore 7
    //   398: ldc2_w 15
    //   401: lstore_2
    //   402: goto -113 -> 289
    //   405: astore 7
    //   407: lload 8
    //   409: lstore_2
    //   410: goto -121 -> 289
    //   413: ldc2_w 15
    //   416: lstore 10
    //   418: lload_2
    //   419: lstore 8
    //   421: goto -321 -> 100
    //   424: ldc2_w 15
    //   427: lstore_2
    //   428: ldc2_w 15
    //   431: lstore 8
    //   433: goto -341 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   92	97	258	java/io/IOException
    //   43	54	279	java/lang/Exception
    //   307	312	323	java/io/IOException
    //   43	54	349	finally
    //   358	363	370	java/io/IOException
    //   54	71	388	finally
    //   76	83	388	finally
    //   183	198	388	finally
    //   198	204	388	finally
    //   207	222	388	finally
    //   234	251	388	finally
    //   289	302	392	finally
    //   54	71	396	java/lang/Exception
    //   76	83	396	java/lang/Exception
    //   183	198	396	java/lang/Exception
    //   207	222	396	java/lang/Exception
    //   234	251	396	java/lang/Exception
    //   198	204	405	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.a.b
 * JD-Core Version:    0.6.2
 */