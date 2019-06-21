package com.tencent.mm.hardcoder;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
{
  // ERROR //
  public static long[] PF()
  {
    // Byte code:
    //   0: ldc 12
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 20	java/io/FileReader
    //   8: astore_0
    //   9: new 22	java/lang/StringBuilder
    //   12: astore_1
    //   13: aload_1
    //   14: ldc 24
    //   16: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: aload_1
    //   21: invokestatic 34	android/os/Process:myPid	()I
    //   24: invokevirtual 38	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   27: ldc 40
    //   29: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokespecial 48	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   38: new 50	java/io/BufferedReader
    //   41: astore_1
    //   42: aload_1
    //   43: aload_0
    //   44: invokespecial 53	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   47: aload_1
    //   48: astore_2
    //   49: aload_0
    //   50: astore_3
    //   51: aload_1
    //   52: invokevirtual 56	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   55: ldc 58
    //   57: invokevirtual 64	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   60: astore 4
    //   62: aload_1
    //   63: astore_2
    //   64: aload_0
    //   65: astore_3
    //   66: iconst_2
    //   67: newarray long
    //   69: astore 5
    //   71: aload_1
    //   72: astore_2
    //   73: aload_0
    //   74: astore_3
    //   75: aload 5
    //   77: iconst_0
    //   78: aload 4
    //   80: bipush 13
    //   82: aaload
    //   83: invokestatic 70	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   86: lastore
    //   87: aload_1
    //   88: astore_2
    //   89: aload_0
    //   90: astore_3
    //   91: aload 5
    //   93: iconst_1
    //   94: aload 4
    //   96: bipush 14
    //   98: aaload
    //   99: invokestatic 70	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   102: lastore
    //   103: aload_0
    //   104: invokevirtual 74	java/io/FileReader:close	()V
    //   107: aload_1
    //   108: invokevirtual 75	java/io/BufferedReader:close	()V
    //   111: ldc 12
    //   113: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   116: aload 5
    //   118: astore_1
    //   119: aload_1
    //   120: areturn
    //   121: astore_0
    //   122: ldc 80
    //   124: new 22	java/lang/StringBuilder
    //   127: dup
    //   128: ldc 82
    //   130: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   133: aload_0
    //   134: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   137: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   143: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   146: goto -39 -> 107
    //   149: astore_1
    //   150: ldc 80
    //   152: new 22	java/lang/StringBuilder
    //   155: dup
    //   156: ldc 93
    //   158: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   161: aload_1
    //   162: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   165: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: goto -63 -> 111
    //   177: astore 5
    //   179: aconst_null
    //   180: astore_1
    //   181: aconst_null
    //   182: astore_0
    //   183: aload_1
    //   184: astore_2
    //   185: aload_0
    //   186: astore_3
    //   187: new 22	java/lang/StringBuilder
    //   190: astore 4
    //   192: aload_1
    //   193: astore_2
    //   194: aload_0
    //   195: astore_3
    //   196: aload 4
    //   198: ldc 95
    //   200: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   203: aload_1
    //   204: astore_2
    //   205: aload_0
    //   206: astore_3
    //   207: ldc 80
    //   209: aload 4
    //   211: aload 5
    //   213: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   216: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   225: aload_0
    //   226: ifnull +7 -> 233
    //   229: aload_0
    //   230: invokevirtual 74	java/io/FileReader:close	()V
    //   233: aload_1
    //   234: ifnull +7 -> 241
    //   237: aload_1
    //   238: invokevirtual 75	java/io/BufferedReader:close	()V
    //   241: ldc 12
    //   243: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   246: aconst_null
    //   247: astore_1
    //   248: goto -129 -> 119
    //   251: astore_0
    //   252: ldc 80
    //   254: new 22	java/lang/StringBuilder
    //   257: dup
    //   258: ldc 82
    //   260: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   263: aload_0
    //   264: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   267: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   273: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   276: goto -43 -> 233
    //   279: astore_1
    //   280: ldc 80
    //   282: new 22	java/lang/StringBuilder
    //   285: dup
    //   286: ldc 93
    //   288: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   291: aload_1
    //   292: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   295: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   301: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   304: goto -63 -> 241
    //   307: astore_1
    //   308: aconst_null
    //   309: astore_2
    //   310: aconst_null
    //   311: astore_0
    //   312: aload_0
    //   313: ifnull +7 -> 320
    //   316: aload_0
    //   317: invokevirtual 74	java/io/FileReader:close	()V
    //   320: aload_2
    //   321: ifnull +7 -> 328
    //   324: aload_2
    //   325: invokevirtual 75	java/io/BufferedReader:close	()V
    //   328: ldc 12
    //   330: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   333: aload_1
    //   334: athrow
    //   335: astore_0
    //   336: ldc 80
    //   338: new 22	java/lang/StringBuilder
    //   341: dup
    //   342: ldc 82
    //   344: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   347: aload_0
    //   348: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   351: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   357: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   360: goto -40 -> 320
    //   363: astore_0
    //   364: ldc 80
    //   366: new 22	java/lang/StringBuilder
    //   369: dup
    //   370: ldc 93
    //   372: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   375: aload_0
    //   376: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   379: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   385: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   388: goto -60 -> 328
    //   391: astore_1
    //   392: aconst_null
    //   393: astore_2
    //   394: goto -82 -> 312
    //   397: astore_1
    //   398: aload_3
    //   399: astore_0
    //   400: goto -88 -> 312
    //   403: astore 5
    //   405: aconst_null
    //   406: astore_1
    //   407: goto -224 -> 183
    //   410: astore 5
    //   412: goto -229 -> 183
    //
    // Exception table:
    //   from	to	target	type
    //   103	107	121	java/lang/Exception
    //   107	111	149	java/lang/Exception
    //   5	38	177	java/lang/Exception
    //   229	233	251	java/lang/Exception
    //   237	241	279	java/lang/Exception
    //   5	38	307	finally
    //   316	320	335	java/lang/Exception
    //   324	328	363	java/lang/Exception
    //   38	47	391	finally
    //   51	62	397	finally
    //   66	71	397	finally
    //   75	87	397	finally
    //   91	103	397	finally
    //   187	192	397	finally
    //   196	203	397	finally
    //   207	225	397	finally
    //   38	47	403	java/lang/Exception
    //   51	62	410	java/lang/Exception
    //   66	71	410	java/lang/Exception
    //   75	87	410	java/lang/Exception
    //   91	103	410	java/lang/Exception
  }

  // ERROR //
  public static void a(java.io.InputStream paramInputStream, a parama)
  {
    // Byte code:
    //   0: ldc 98
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 50	java/io/BufferedReader
    //   8: astore_2
    //   9: new 100	java/io/InputStreamReader
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: invokespecial 103	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   18: aload_2
    //   19: aload_3
    //   20: invokespecial 53	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   23: aload_2
    //   24: astore_0
    //   25: aload_2
    //   26: invokevirtual 56	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   29: astore_3
    //   30: aload_3
    //   31: ifnull +23 -> 54
    //   34: aload_1
    //   35: ifnull -12 -> 23
    //   38: aload_2
    //   39: astore_0
    //   40: aload_1
    //   41: aload_3
    //   42: invokeinterface 107 2 0
    //   47: istore 4
    //   49: iload 4
    //   51: ifne -28 -> 23
    //   54: aload_2
    //   55: invokevirtual 75	java/io/BufferedReader:close	()V
    //   58: ldc 98
    //   60: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: return
    //   64: astore_0
    //   65: ldc 80
    //   67: aload_0
    //   68: ldc 109
    //   70: iconst_0
    //   71: anewarray 4	java/lang/Object
    //   74: invokestatic 113	com/tencent/mm/hardcoder/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: ldc 98
    //   79: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: goto -19 -> 63
    //   85: astore_3
    //   86: aconst_null
    //   87: astore_1
    //   88: aload_1
    //   89: astore_0
    //   90: ldc 80
    //   92: aload_3
    //   93: ldc 109
    //   95: iconst_0
    //   96: anewarray 4	java/lang/Object
    //   99: invokestatic 113	com/tencent/mm/hardcoder/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   102: aload_1
    //   103: ifnull +70 -> 173
    //   106: aload_1
    //   107: invokevirtual 75	java/io/BufferedReader:close	()V
    //   110: ldc 98
    //   112: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: goto -52 -> 63
    //   118: astore_0
    //   119: ldc 80
    //   121: aload_0
    //   122: ldc 109
    //   124: iconst_0
    //   125: anewarray 4	java/lang/Object
    //   128: invokestatic 113	com/tencent/mm/hardcoder/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: ldc 98
    //   133: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: goto -73 -> 63
    //   139: astore_1
    //   140: aconst_null
    //   141: astore_0
    //   142: aload_0
    //   143: ifnull +7 -> 150
    //   146: aload_0
    //   147: invokevirtual 75	java/io/BufferedReader:close	()V
    //   150: ldc 98
    //   152: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: aload_1
    //   156: athrow
    //   157: astore_0
    //   158: ldc 80
    //   160: aload_0
    //   161: ldc 109
    //   163: iconst_0
    //   164: anewarray 4	java/lang/Object
    //   167: invokestatic 113	com/tencent/mm/hardcoder/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   170: goto -20 -> 150
    //   173: ldc 98
    //   175: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: goto -115 -> 63
    //   181: astore_1
    //   182: goto -40 -> 142
    //   185: astore_3
    //   186: aload_2
    //   187: astore_1
    //   188: goto -100 -> 88
    //
    // Exception table:
    //   from	to	target	type
    //   54	58	64	java/lang/Exception
    //   5	23	85	java/lang/Exception
    //   106	110	118	java/lang/Exception
    //   5	23	139	finally
    //   146	150	157	java/lang/Exception
    //   25	30	181	finally
    //   40	49	181	finally
    //   90	102	181	finally
    //   25	30	185	java/lang/Exception
    //   40	49	185	java/lang/Exception
  }

  // ERROR //
  public static void a(String paramString, a parama)
  {
    // Byte code:
    //   0: ldc 115
    //   2: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 117	java/io/FileInputStream
    //   8: astore_2
    //   9: aload_2
    //   10: aload_0
    //   11: invokespecial 118	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   14: aload_2
    //   15: astore_0
    //   16: aload_2
    //   17: aload_1
    //   18: invokestatic 120	com/tencent/mm/hardcoder/g:a	(Ljava/io/InputStream;Lcom/tencent/mm/hardcoder/g$a;)V
    //   21: aload_2
    //   22: invokevirtual 123	java/io/InputStream:close	()V
    //   25: ldc 115
    //   27: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: return
    //   31: astore_0
    //   32: ldc 80
    //   34: aload_0
    //   35: ldc 109
    //   37: iconst_0
    //   38: anewarray 4	java/lang/Object
    //   41: invokestatic 113	com/tencent/mm/hardcoder/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   44: ldc 115
    //   46: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: goto -19 -> 30
    //   52: astore_3
    //   53: aconst_null
    //   54: astore_1
    //   55: aload_1
    //   56: astore_0
    //   57: ldc 80
    //   59: aload_3
    //   60: ldc 109
    //   62: iconst_0
    //   63: anewarray 4	java/lang/Object
    //   66: invokestatic 113	com/tencent/mm/hardcoder/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload_1
    //   70: ifnull +70 -> 140
    //   73: aload_1
    //   74: invokevirtual 123	java/io/InputStream:close	()V
    //   77: ldc 115
    //   79: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: goto -52 -> 30
    //   85: astore_0
    //   86: ldc 80
    //   88: aload_0
    //   89: ldc 109
    //   91: iconst_0
    //   92: anewarray 4	java/lang/Object
    //   95: invokestatic 113	com/tencent/mm/hardcoder/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   98: ldc 115
    //   100: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: goto -73 -> 30
    //   106: astore_1
    //   107: aconst_null
    //   108: astore_0
    //   109: aload_0
    //   110: ifnull +7 -> 117
    //   113: aload_0
    //   114: invokevirtual 123	java/io/InputStream:close	()V
    //   117: ldc 115
    //   119: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload_1
    //   123: athrow
    //   124: astore_0
    //   125: ldc 80
    //   127: aload_0
    //   128: ldc 109
    //   130: iconst_0
    //   131: anewarray 4	java/lang/Object
    //   134: invokestatic 113	com/tencent/mm/hardcoder/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: goto -20 -> 117
    //   140: ldc 115
    //   142: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: goto -115 -> 30
    //   148: astore_1
    //   149: goto -40 -> 109
    //   152: astore_3
    //   153: aload_2
    //   154: astore_1
    //   155: goto -100 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   21	25	31	java/lang/Exception
    //   5	14	52	java/lang/Exception
    //   73	77	85	java/lang/Exception
    //   5	14	106	finally
    //   113	117	124	java/lang/Exception
    //   16	21	148	finally
    //   57	69	148	finally
    //   16	21	152	java/lang/Exception
  }

  // ERROR //
  public static long[] jr(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 126
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 20	java/io/FileReader
    //   10: astore_2
    //   11: new 22	java/lang/StringBuilder
    //   14: astore_3
    //   15: aload_3
    //   16: ldc 24
    //   18: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: aload_2
    //   22: aload_3
    //   23: invokestatic 34	android/os/Process:myPid	()I
    //   26: invokevirtual 38	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   29: ldc 128
    //   31: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: iload_0
    //   35: invokevirtual 38	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   38: ldc 40
    //   40: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: invokespecial 48	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   49: new 50	java/io/BufferedReader
    //   52: astore_3
    //   53: aload_3
    //   54: aload_2
    //   55: invokespecial 53	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   58: aload_3
    //   59: astore 4
    //   61: aload_2
    //   62: astore 5
    //   64: aload_3
    //   65: invokevirtual 56	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   68: astore 6
    //   70: aload 6
    //   72: ifnonnull +76 -> 148
    //   75: aload_2
    //   76: invokevirtual 74	java/io/FileReader:close	()V
    //   79: aload_3
    //   80: invokevirtual 75	java/io/BufferedReader:close	()V
    //   83: ldc 126
    //   85: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: aload_1
    //   89: astore_3
    //   90: aload_3
    //   91: areturn
    //   92: astore_2
    //   93: ldc 80
    //   95: new 22	java/lang/StringBuilder
    //   98: dup
    //   99: ldc 130
    //   101: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   104: aload_2
    //   105: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   108: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: goto -38 -> 79
    //   120: astore_3
    //   121: ldc 80
    //   123: new 22	java/lang/StringBuilder
    //   126: dup
    //   127: ldc 132
    //   129: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   132: aload_3
    //   133: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   136: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: goto -62 -> 83
    //   148: aload_3
    //   149: astore 4
    //   151: aload_2
    //   152: astore 5
    //   154: aload 6
    //   156: ldc 58
    //   158: invokevirtual 64	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   161: astore 6
    //   163: aload_3
    //   164: astore 4
    //   166: aload_2
    //   167: astore 5
    //   169: aload 6
    //   171: bipush 13
    //   173: aaload
    //   174: invokestatic 135	com/tencent/mm/hardcoder/g:lb	(Ljava/lang/String;)J
    //   177: lstore 7
    //   179: aload_3
    //   180: astore 4
    //   182: aload_2
    //   183: astore 5
    //   185: aload 6
    //   187: bipush 14
    //   189: aaload
    //   190: invokestatic 135	com/tencent/mm/hardcoder/g:lb	(Ljava/lang/String;)J
    //   193: lstore 9
    //   195: aload_2
    //   196: invokevirtual 74	java/io/FileReader:close	()V
    //   199: aload_3
    //   200: invokevirtual 75	java/io/BufferedReader:close	()V
    //   203: ldc 126
    //   205: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: iconst_2
    //   209: newarray long
    //   211: dup
    //   212: iconst_0
    //   213: lload 7
    //   215: lastore
    //   216: dup
    //   217: iconst_1
    //   218: lload 9
    //   220: lastore
    //   221: astore_3
    //   222: goto -132 -> 90
    //   225: astore_2
    //   226: ldc 80
    //   228: new 22	java/lang/StringBuilder
    //   231: dup
    //   232: ldc 130
    //   234: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   237: aload_2
    //   238: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   241: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   247: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   250: goto -51 -> 199
    //   253: astore_3
    //   254: ldc 80
    //   256: new 22	java/lang/StringBuilder
    //   259: dup
    //   260: ldc 132
    //   262: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   265: aload_3
    //   266: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   269: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   278: goto -75 -> 203
    //   281: astore 6
    //   283: aconst_null
    //   284: astore_3
    //   285: aconst_null
    //   286: astore_2
    //   287: aload_3
    //   288: astore 4
    //   290: aload_2
    //   291: astore 5
    //   293: new 22	java/lang/StringBuilder
    //   296: astore 11
    //   298: aload_3
    //   299: astore 4
    //   301: aload_2
    //   302: astore 5
    //   304: aload 11
    //   306: ldc 137
    //   308: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   311: aload_3
    //   312: astore 4
    //   314: aload_2
    //   315: astore 5
    //   317: ldc 80
    //   319: aload 11
    //   321: aload 6
    //   323: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   326: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   335: aload_2
    //   336: ifnull +7 -> 343
    //   339: aload_2
    //   340: invokevirtual 74	java/io/FileReader:close	()V
    //   343: aload_3
    //   344: ifnull +7 -> 351
    //   347: aload_3
    //   348: invokevirtual 75	java/io/BufferedReader:close	()V
    //   351: ldc 126
    //   353: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   356: aload_1
    //   357: astore_3
    //   358: goto -268 -> 90
    //   361: astore_2
    //   362: ldc 80
    //   364: new 22	java/lang/StringBuilder
    //   367: dup
    //   368: ldc 130
    //   370: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   373: aload_2
    //   374: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   377: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   383: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   386: goto -43 -> 343
    //   389: astore_3
    //   390: ldc 80
    //   392: new 22	java/lang/StringBuilder
    //   395: dup
    //   396: ldc 132
    //   398: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   401: aload_3
    //   402: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   405: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   411: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   414: goto -63 -> 351
    //   417: astore_3
    //   418: aconst_null
    //   419: astore 4
    //   421: aconst_null
    //   422: astore_2
    //   423: aload_2
    //   424: ifnull +7 -> 431
    //   427: aload_2
    //   428: invokevirtual 74	java/io/FileReader:close	()V
    //   431: aload 4
    //   433: ifnull +8 -> 441
    //   436: aload 4
    //   438: invokevirtual 75	java/io/BufferedReader:close	()V
    //   441: ldc 126
    //   443: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   446: aload_3
    //   447: athrow
    //   448: astore_2
    //   449: ldc 80
    //   451: new 22	java/lang/StringBuilder
    //   454: dup
    //   455: ldc 130
    //   457: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   460: aload_2
    //   461: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   464: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   467: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   470: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   473: goto -42 -> 431
    //   476: astore_2
    //   477: ldc 80
    //   479: new 22	java/lang/StringBuilder
    //   482: dup
    //   483: ldc 132
    //   485: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   488: aload_2
    //   489: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   492: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   498: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   501: goto -60 -> 441
    //   504: astore_3
    //   505: aconst_null
    //   506: astore 4
    //   508: goto -85 -> 423
    //   511: astore_3
    //   512: aload 5
    //   514: astore_2
    //   515: goto -92 -> 423
    //   518: astore 6
    //   520: aconst_null
    //   521: astore_3
    //   522: goto -235 -> 287
    //   525: astore 6
    //   527: goto -240 -> 287
    //
    // Exception table:
    //   from	to	target	type
    //   75	79	92	java/lang/Exception
    //   79	83	120	java/lang/Exception
    //   195	199	225	java/lang/Exception
    //   199	203	253	java/lang/Exception
    //   7	49	281	java/lang/Exception
    //   339	343	361	java/lang/Exception
    //   347	351	389	java/lang/Exception
    //   7	49	417	finally
    //   427	431	448	java/lang/Exception
    //   436	441	476	java/lang/Exception
    //   49	58	504	finally
    //   64	70	511	finally
    //   154	163	511	finally
    //   169	179	511	finally
    //   185	195	511	finally
    //   293	298	511	finally
    //   304	311	511	finally
    //   317	335	511	finally
    //   49	58	518	java/lang/Exception
    //   64	70	525	java/lang/Exception
    //   154	163	525	java/lang/Exception
    //   169	179	525	java/lang/Exception
    //   185	195	525	java/lang/Exception
  }

  // ERROR //
  public static int js(int paramInt)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: ldc 140
    //   4: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 20	java/io/FileReader
    //   10: astore_2
    //   11: new 22	java/lang/StringBuilder
    //   14: astore_3
    //   15: aload_3
    //   16: ldc 24
    //   18: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: aload_2
    //   22: aload_3
    //   23: invokestatic 34	android/os/Process:myPid	()I
    //   26: invokevirtual 38	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   29: ldc 128
    //   31: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: iload_0
    //   35: invokevirtual 38	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   38: ldc 40
    //   40: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: invokespecial 48	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   49: new 50	java/io/BufferedReader
    //   52: astore_3
    //   53: aload_3
    //   54: aload_2
    //   55: invokespecial 53	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   58: aload_3
    //   59: astore 4
    //   61: aload_2
    //   62: astore 5
    //   64: aload_3
    //   65: invokevirtual 56	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   68: astore 6
    //   70: aload 6
    //   72: ifnonnull +76 -> 148
    //   75: aload_2
    //   76: invokevirtual 74	java/io/FileReader:close	()V
    //   79: aload_3
    //   80: invokevirtual 75	java/io/BufferedReader:close	()V
    //   83: ldc 140
    //   85: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: iload_1
    //   89: istore_0
    //   90: iload_0
    //   91: ireturn
    //   92: astore_2
    //   93: ldc 80
    //   95: new 22	java/lang/StringBuilder
    //   98: dup
    //   99: ldc 142
    //   101: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   104: aload_2
    //   105: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   108: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: goto -38 -> 79
    //   120: astore_3
    //   121: ldc 80
    //   123: new 22	java/lang/StringBuilder
    //   126: dup
    //   127: ldc 144
    //   129: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   132: aload_3
    //   133: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   136: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: goto -62 -> 83
    //   148: aload_3
    //   149: astore 4
    //   151: aload_2
    //   152: astore 5
    //   154: aload 6
    //   156: ldc 58
    //   158: invokevirtual 64	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   161: bipush 38
    //   163: aaload
    //   164: invokestatic 148	com/tencent/mm/hardcoder/g:la	(Ljava/lang/String;)I
    //   167: istore_0
    //   168: aload_2
    //   169: invokevirtual 74	java/io/FileReader:close	()V
    //   172: aload_3
    //   173: invokevirtual 75	java/io/BufferedReader:close	()V
    //   176: ldc 140
    //   178: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: goto -91 -> 90
    //   184: astore_2
    //   185: ldc 80
    //   187: new 22	java/lang/StringBuilder
    //   190: dup
    //   191: ldc 142
    //   193: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   196: aload_2
    //   197: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   200: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   209: goto -37 -> 172
    //   212: astore_3
    //   213: ldc 80
    //   215: new 22	java/lang/StringBuilder
    //   218: dup
    //   219: ldc 144
    //   221: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   224: aload_3
    //   225: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   228: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   234: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: goto -61 -> 176
    //   240: astore 6
    //   242: aconst_null
    //   243: astore_3
    //   244: aconst_null
    //   245: astore_2
    //   246: aload_3
    //   247: astore 4
    //   249: aload_2
    //   250: astore 5
    //   252: new 22	java/lang/StringBuilder
    //   255: astore 7
    //   257: aload_3
    //   258: astore 4
    //   260: aload_2
    //   261: astore 5
    //   263: aload 7
    //   265: ldc 150
    //   267: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   270: aload_3
    //   271: astore 4
    //   273: aload_2
    //   274: astore 5
    //   276: ldc 80
    //   278: aload 7
    //   280: aload 6
    //   282: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   285: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   291: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   294: aload_2
    //   295: ifnull +7 -> 302
    //   298: aload_2
    //   299: invokevirtual 74	java/io/FileReader:close	()V
    //   302: aload_3
    //   303: ifnull +7 -> 310
    //   306: aload_3
    //   307: invokevirtual 75	java/io/BufferedReader:close	()V
    //   310: ldc 140
    //   312: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   315: iload_1
    //   316: istore_0
    //   317: goto -227 -> 90
    //   320: astore_2
    //   321: ldc 80
    //   323: new 22	java/lang/StringBuilder
    //   326: dup
    //   327: ldc 142
    //   329: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   332: aload_2
    //   333: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   336: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   342: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   345: goto -43 -> 302
    //   348: astore_3
    //   349: ldc 80
    //   351: new 22	java/lang/StringBuilder
    //   354: dup
    //   355: ldc 144
    //   357: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   360: aload_3
    //   361: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   364: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   370: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   373: goto -63 -> 310
    //   376: astore_3
    //   377: aconst_null
    //   378: astore 4
    //   380: aconst_null
    //   381: astore_2
    //   382: aload_2
    //   383: ifnull +7 -> 390
    //   386: aload_2
    //   387: invokevirtual 74	java/io/FileReader:close	()V
    //   390: aload 4
    //   392: ifnull +8 -> 400
    //   395: aload 4
    //   397: invokevirtual 75	java/io/BufferedReader:close	()V
    //   400: ldc 140
    //   402: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   405: aload_3
    //   406: athrow
    //   407: astore_2
    //   408: ldc 80
    //   410: new 22	java/lang/StringBuilder
    //   413: dup
    //   414: ldc 142
    //   416: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   419: aload_2
    //   420: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   423: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   429: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   432: goto -42 -> 390
    //   435: astore_2
    //   436: ldc 80
    //   438: new 22	java/lang/StringBuilder
    //   441: dup
    //   442: ldc 144
    //   444: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   447: aload_2
    //   448: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   451: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   457: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   460: goto -60 -> 400
    //   463: astore_3
    //   464: aconst_null
    //   465: astore 4
    //   467: goto -85 -> 382
    //   470: astore_3
    //   471: aload 5
    //   473: astore_2
    //   474: goto -92 -> 382
    //   477: astore 6
    //   479: aconst_null
    //   480: astore_3
    //   481: goto -235 -> 246
    //   484: astore 6
    //   486: goto -240 -> 246
    //
    // Exception table:
    //   from	to	target	type
    //   75	79	92	java/lang/Exception
    //   79	83	120	java/lang/Exception
    //   168	172	184	java/lang/Exception
    //   172	176	212	java/lang/Exception
    //   7	49	240	java/lang/Exception
    //   298	302	320	java/lang/Exception
    //   306	310	348	java/lang/Exception
    //   7	49	376	finally
    //   386	390	407	java/lang/Exception
    //   395	400	435	java/lang/Exception
    //   49	58	463	finally
    //   64	70	470	finally
    //   154	168	470	finally
    //   252	257	470	finally
    //   263	270	470	finally
    //   276	294	470	finally
    //   49	58	477	java/lang/Exception
    //   64	70	484	java/lang/Exception
    //   154	168	484	java/lang/Exception
  }

  // ERROR //
  public static long jt(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 153
    //   3: lstore_1
    //   4: ldc 155
    //   6: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 157	java/io/File
    //   12: astore_3
    //   13: new 22	java/lang/StringBuilder
    //   16: astore 4
    //   18: aload 4
    //   20: ldc 159
    //   22: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   25: aload_3
    //   26: aload 4
    //   28: iload_0
    //   29: invokevirtual 38	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   32: ldc 161
    //   34: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokespecial 162	java/io/File:<init>	(Ljava/lang/String;)V
    //   43: aload_3
    //   44: invokevirtual 166	java/io/File:exists	()Z
    //   47: istore 5
    //   49: iload 5
    //   51: ifne +14 -> 65
    //   54: ldc 155
    //   56: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: lload_1
    //   60: lstore 6
    //   62: lload 6
    //   64: lreturn
    //   65: new 20	java/io/FileReader
    //   68: astore 4
    //   70: aload 4
    //   72: aload_3
    //   73: invokespecial 169	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   76: new 50	java/io/BufferedReader
    //   79: astore_3
    //   80: aload_3
    //   81: aload 4
    //   83: invokespecial 53	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   86: aload_3
    //   87: astore 8
    //   89: aload 4
    //   91: astore 9
    //   93: aload_3
    //   94: invokevirtual 56	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   97: invokestatic 135	com/tencent/mm/hardcoder/g:lb	(Ljava/lang/String;)J
    //   100: lstore 6
    //   102: aload_3
    //   103: invokevirtual 75	java/io/BufferedReader:close	()V
    //   106: aload 4
    //   108: invokevirtual 74	java/io/FileReader:close	()V
    //   111: ldc 155
    //   113: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   116: goto -54 -> 62
    //   119: astore_3
    //   120: ldc 80
    //   122: new 22	java/lang/StringBuilder
    //   125: dup
    //   126: ldc 171
    //   128: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   131: aload_3
    //   132: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   135: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: goto -38 -> 106
    //   147: astore_3
    //   148: ldc 80
    //   150: new 22	java/lang/StringBuilder
    //   153: dup
    //   154: ldc 173
    //   156: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   159: aload_3
    //   160: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   163: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: goto -61 -> 111
    //   175: astore 10
    //   177: aconst_null
    //   178: astore_3
    //   179: aconst_null
    //   180: astore 4
    //   182: aload_3
    //   183: astore 8
    //   185: aload 4
    //   187: astore 9
    //   189: new 22	java/lang/StringBuilder
    //   192: astore 11
    //   194: aload_3
    //   195: astore 8
    //   197: aload 4
    //   199: astore 9
    //   201: aload 11
    //   203: ldc 175
    //   205: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   208: aload_3
    //   209: astore 8
    //   211: aload 4
    //   213: astore 9
    //   215: ldc 80
    //   217: aload 11
    //   219: aload 10
    //   221: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   224: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   233: aload_3
    //   234: ifnull +7 -> 241
    //   237: aload_3
    //   238: invokevirtual 75	java/io/BufferedReader:close	()V
    //   241: aload 4
    //   243: ifnull +8 -> 251
    //   246: aload 4
    //   248: invokevirtual 74	java/io/FileReader:close	()V
    //   251: ldc 155
    //   253: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: lload_1
    //   257: lstore 6
    //   259: goto -197 -> 62
    //   262: astore_3
    //   263: ldc 80
    //   265: new 22	java/lang/StringBuilder
    //   268: dup
    //   269: ldc 171
    //   271: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   274: aload_3
    //   275: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   278: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   284: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   287: goto -46 -> 241
    //   290: astore_3
    //   291: ldc 80
    //   293: new 22	java/lang/StringBuilder
    //   296: dup
    //   297: ldc 173
    //   299: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   302: aload_3
    //   303: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   306: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   312: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   315: goto -64 -> 251
    //   318: astore_3
    //   319: aconst_null
    //   320: astore 8
    //   322: aconst_null
    //   323: astore 4
    //   325: aload 8
    //   327: ifnull +8 -> 335
    //   330: aload 8
    //   332: invokevirtual 75	java/io/BufferedReader:close	()V
    //   335: aload 4
    //   337: ifnull +8 -> 345
    //   340: aload 4
    //   342: invokevirtual 74	java/io/FileReader:close	()V
    //   345: ldc 155
    //   347: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   350: aload_3
    //   351: athrow
    //   352: astore 9
    //   354: ldc 80
    //   356: new 22	java/lang/StringBuilder
    //   359: dup
    //   360: ldc 171
    //   362: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   365: aload 9
    //   367: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   370: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   376: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   379: goto -44 -> 335
    //   382: astore 4
    //   384: ldc 80
    //   386: new 22	java/lang/StringBuilder
    //   389: dup
    //   390: ldc 173
    //   392: invokespecial 28	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   395: aload 4
    //   397: invokevirtual 85	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   400: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   406: invokestatic 91	com/tencent/mm/hardcoder/c:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   409: goto -64 -> 345
    //   412: astore_3
    //   413: aconst_null
    //   414: astore 8
    //   416: goto -91 -> 325
    //   419: astore_3
    //   420: aload 9
    //   422: astore 4
    //   424: goto -99 -> 325
    //   427: astore 10
    //   429: aconst_null
    //   430: astore_3
    //   431: goto -249 -> 182
    //   434: astore 10
    //   436: goto -254 -> 182
    //
    // Exception table:
    //   from	to	target	type
    //   102	106	119	java/lang/Exception
    //   106	111	147	java/lang/Exception
    //   9	49	175	java/lang/Exception
    //   65	76	175	java/lang/Exception
    //   237	241	262	java/lang/Exception
    //   246	251	290	java/lang/Exception
    //   9	49	318	finally
    //   65	76	318	finally
    //   330	335	352	java/lang/Exception
    //   340	345	382	java/lang/Exception
    //   76	86	412	finally
    //   93	102	419	finally
    //   189	194	419	finally
    //   201	208	419	finally
    //   215	233	419	finally
    //   76	86	427	java/lang/Exception
    //   93	102	434	java/lang/Exception
  }

  private static int la(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(93946);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
      {
        AppMethodBeat.o(93946);
        j = i;
      }
      while (true)
      {
        return j;
        j = Integer.decode(paramString).intValue();
        AppMethodBeat.o(93946);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        c.printErrStackTrace("HardCoder.HardCoderUtil", paramString, "getInt", new Object[0]);
        AppMethodBeat.o(93946);
        int j = i;
      }
    }
  }

  private static long lb(String paramString)
  {
    long l1 = 0L;
    AppMethodBeat.i(93947);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
      {
        AppMethodBeat.o(93947);
        l2 = l1;
      }
      while (true)
      {
        return l2;
        l2 = Long.decode(paramString).longValue();
        AppMethodBeat.o(93947);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        c.printErrStackTrace("HardCoder.HardCoderUtil", paramString, "getLong", new Object[0]);
        AppMethodBeat.o(93947);
        long l2 = l1;
      }
    }
  }

  public static abstract interface a
  {
    public abstract boolean kZ(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.hardcoder.g
 * JD-Core Version:    0.6.2
 */