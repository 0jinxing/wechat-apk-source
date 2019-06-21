package com.tencent.mm.cf;

final class d$1
  implements Runnable
{
  d$1(d paramd, d.a parama)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 33
    //   2: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 44	android/os/Debug:stopMethodTracing	()V
    //   8: aload_0
    //   9: getfield 21	com/tencent/mm/cf/d$1:ydN	Lcom/tencent/mm/cf/d$a;
    //   12: getfield 50	com/tencent/mm/cf/d$a:savePath	Ljava/lang/String;
    //   15: astore_1
    //   16: aload_0
    //   17: getfield 21	com/tencent/mm/cf/d$1:ydN	Lcom/tencent/mm/cf/d$a;
    //   20: getfield 54	com/tencent/mm/cf/d$a:ydQ	I
    //   23: istore_2
    //   24: aload_0
    //   25: getfield 21	com/tencent/mm/cf/d$1:ydN	Lcom/tencent/mm/cf/d$a;
    //   28: getfield 50	com/tencent/mm/cf/d$a:savePath	Ljava/lang/String;
    //   31: astore_3
    //   32: aload_3
    //   33: ifnonnull +17 -> 50
    //   36: aload_0
    //   37: getfield 19	com/tencent/mm/cf/d$1:ydO	Lcom/tencent/mm/cf/d;
    //   40: invokestatic 57	com/tencent/mm/cf/d:b	(Lcom/tencent/mm/cf/d;)Z
    //   43: pop
    //   44: ldc 33
    //   46: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: return
    //   50: new 62	java/io/File
    //   53: astore_3
    //   54: aload_3
    //   55: aload_1
    //   56: invokespecial 65	java/io/File:<init>	(Ljava/lang/String;)V
    //   59: new 67	java/lang/StringBuilder
    //   62: astore 4
    //   64: aload 4
    //   66: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   69: aload 4
    //   71: aload_1
    //   72: iconst_0
    //   73: aload_1
    //   74: bipush 46
    //   76: invokevirtual 74	java/lang/String:lastIndexOf	(I)I
    //   79: invokevirtual 78	java/lang/String:substring	(II)Ljava/lang/String;
    //   82: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: ldc 84
    //   87: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: astore 4
    //   95: new 62	java/io/File
    //   98: astore_1
    //   99: aload_1
    //   100: aload 4
    //   102: invokespecial 65	java/io/File:<init>	(Ljava/lang/String;)V
    //   105: invokestatic 94	java/lang/System:currentTimeMillis	()J
    //   108: lstore 5
    //   110: aload_3
    //   111: aload_1
    //   112: invokevirtual 98	java/io/File:renameTo	(Ljava/io/File;)Z
    //   115: pop
    //   116: aload_3
    //   117: invokevirtual 102	java/io/File:delete	()Z
    //   120: pop
    //   121: new 67	java/lang/StringBuilder
    //   124: astore_3
    //   125: aload_3
    //   126: ldc 104
    //   128: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   131: ldc 107
    //   133: aload_3
    //   134: invokestatic 94	java/lang/System:currentTimeMillis	()J
    //   137: lload 5
    //   139: lsub
    //   140: invokevirtual 110	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   143: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: invokestatic 115	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   149: bipush 10
    //   151: invokestatic 120	android/os/Process:setThreadPriority	(I)V
    //   154: aload_0
    //   155: getfield 21	com/tencent/mm/cf/d$1:ydN	Lcom/tencent/mm/cf/d$a;
    //   158: getfield 123	com/tencent/mm/cf/d$a:cPw	I
    //   161: bipush 6
    //   163: if_icmpne +137 -> 300
    //   166: new 125	java/util/ArrayList
    //   169: astore_3
    //   170: aload_3
    //   171: invokespecial 126	java/util/ArrayList:<init>	()V
    //   174: aload_3
    //   175: aload_1
    //   176: invokevirtual 130	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   179: pop
    //   180: new 62	java/io/File
    //   183: astore 7
    //   185: new 67	java/lang/StringBuilder
    //   188: astore 4
    //   190: aload 4
    //   192: invokespecial 68	java/lang/StringBuilder:<init>	()V
    //   195: aload 7
    //   197: aload 4
    //   199: aload_1
    //   200: invokevirtual 133	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   203: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: ldc 135
    //   208: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: invokespecial 65	java/io/File:<init>	(Ljava/lang/String;)V
    //   217: aload_3
    //   218: aload 7
    //   220: invokestatic 141	com/tencent/mm/a/q:a	(Ljava/util/Collection;Ljava/io/File;)V
    //   223: getstatic 145	com/tencent/mm/cf/d:fbD	Lcom/tencent/mm/sdk/platformtools/ak;
    //   226: iconst_1
    //   227: invokevirtual 151	com/tencent/mm/sdk/platformtools/ak:sendEmptyMessage	(I)Z
    //   230: pop
    //   231: aload_0
    //   232: getfield 19	com/tencent/mm/cf/d$1:ydO	Lcom/tencent/mm/cf/d;
    //   235: invokestatic 57	com/tencent/mm/cf/d:b	(Lcom/tencent/mm/cf/d;)Z
    //   238: pop
    //   239: ldc 33
    //   241: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: goto -195 -> 49
    //   247: astore_1
    //   248: ldc 107
    //   250: ldc 153
    //   252: iconst_1
    //   253: anewarray 4	java/lang/Object
    //   256: dup
    //   257: iconst_0
    //   258: aload_1
    //   259: invokestatic 159	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   262: aastore
    //   263: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: ldc 107
    //   268: ldc 165
    //   270: iconst_1
    //   271: anewarray 4	java/lang/Object
    //   274: dup
    //   275: iconst_0
    //   276: aload_1
    //   277: invokevirtual 168	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   280: aastore
    //   281: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: aload_0
    //   285: getfield 19	com/tencent/mm/cf/d$1:ydO	Lcom/tencent/mm/cf/d;
    //   288: invokestatic 57	com/tencent/mm/cf/d:b	(Lcom/tencent/mm/cf/d;)Z
    //   291: pop
    //   292: ldc 33
    //   294: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   297: goto -248 -> 49
    //   300: aload_0
    //   301: getfield 19	com/tencent/mm/cf/d$1:ydO	Lcom/tencent/mm/cf/d;
    //   304: invokestatic 171	com/tencent/mm/cf/d:a	(Lcom/tencent/mm/cf/d;)Ljava/util/concurrent/LinkedBlockingQueue;
    //   307: ifnull +16 -> 323
    //   310: aload_0
    //   311: getfield 19	com/tencent/mm/cf/d$1:ydO	Lcom/tencent/mm/cf/d;
    //   314: invokestatic 171	com/tencent/mm/cf/d:a	(Lcom/tencent/mm/cf/d;)Ljava/util/concurrent/LinkedBlockingQueue;
    //   317: invokevirtual 177	java/util/concurrent/LinkedBlockingQueue:size	()I
    //   320: ifne +44 -> 364
    //   323: aload_1
    //   324: invokestatic 181	com/tencent/mm/cf/d:ac	(Ljava/io/File;)Ljava/lang/String;
    //   327: astore_3
    //   328: aload_3
    //   329: invokestatic 185	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   332: ifne +32 -> 364
    //   335: aload_0
    //   336: getfield 19	com/tencent/mm/cf/d$1:ydO	Lcom/tencent/mm/cf/d;
    //   339: astore_1
    //   340: iload_2
    //   341: iconst_1
    //   342: if_icmpeq +17 -> 359
    //   345: iload_2
    //   346: iconst_3
    //   347: if_icmpne +17 -> 364
    //   350: invokestatic 191	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   353: invokestatic 197	com/tencent/mm/sdk/platformtools/at:isWifi	(Landroid/content/Context;)Z
    //   356: ifeq +8 -> 364
    //   359: aload_1
    //   360: aload_3
    //   361: invokevirtual 200	com/tencent/mm/cf/d:aqA	(Ljava/lang/String;)V
    //   364: aload_0
    //   365: getfield 19	com/tencent/mm/cf/d$1:ydO	Lcom/tencent/mm/cf/d;
    //   368: invokestatic 57	com/tencent/mm/cf/d:b	(Lcom/tencent/mm/cf/d;)Z
    //   371: pop
    //   372: ldc 33
    //   374: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   377: goto -328 -> 49
    //   380: astore_3
    //   381: ldc 202
    //   383: aload_3
    //   384: ldc 204
    //   386: iconst_0
    //   387: anewarray 4	java/lang/Object
    //   390: invokestatic 208	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   393: new 28	java/lang/IncompatibleClassChangeError
    //   396: astore_1
    //   397: aload_1
    //   398: ldc 204
    //   400: invokespecial 209	java/lang/IncompatibleClassChangeError:<init>	(Ljava/lang/String;)V
    //   403: aload_1
    //   404: aload_3
    //   405: invokevirtual 213	java/lang/IncompatibleClassChangeError:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   408: checkcast 28	java/lang/IncompatibleClassChangeError
    //   411: astore_1
    //   412: ldc 33
    //   414: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   417: aload_1
    //   418: athrow
    //   419: astore_1
    //   420: aload_0
    //   421: getfield 19	com/tencent/mm/cf/d$1:ydO	Lcom/tencent/mm/cf/d;
    //   424: invokestatic 57	com/tencent/mm/cf/d:b	(Lcom/tencent/mm/cf/d;)Z
    //   427: pop
    //   428: ldc 33
    //   430: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   433: aload_1
    //   434: athrow
    //   435: astore_1
    //   436: ldc 107
    //   438: aload_1
    //   439: ldc 215
    //   441: iconst_0
    //   442: anewarray 4	java/lang/Object
    //   445: invokestatic 208	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   448: aload_0
    //   449: getfield 19	com/tencent/mm/cf/d$1:ydO	Lcom/tencent/mm/cf/d;
    //   452: invokestatic 57	com/tencent/mm/cf/d:b	(Lcom/tencent/mm/cf/d;)Z
    //   455: pop
    //   456: ldc 33
    //   458: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   461: goto -412 -> 49
    //
    // Exception table:
    //   from	to	target	type
    //   217	223	247	java/lang/Exception
    //   5	32	380	java/lang/IncompatibleClassChangeError
    //   50	217	380	java/lang/IncompatibleClassChangeError
    //   217	223	380	java/lang/IncompatibleClassChangeError
    //   223	231	380	java/lang/IncompatibleClassChangeError
    //   248	284	380	java/lang/IncompatibleClassChangeError
    //   300	323	380	java/lang/IncompatibleClassChangeError
    //   323	340	380	java/lang/IncompatibleClassChangeError
    //   350	359	380	java/lang/IncompatibleClassChangeError
    //   359	364	380	java/lang/IncompatibleClassChangeError
    //   5	32	419	finally
    //   50	217	419	finally
    //   217	223	419	finally
    //   223	231	419	finally
    //   248	284	419	finally
    //   300	323	419	finally
    //   323	340	419	finally
    //   350	359	419	finally
    //   359	364	419	finally
    //   381	419	419	finally
    //   436	448	419	finally
    //   5	32	435	java/lang/Throwable
    //   50	217	435	java/lang/Throwable
    //   217	223	435	java/lang/Throwable
    //   223	231	435	java/lang/Throwable
    //   248	284	435	java/lang/Throwable
    //   300	323	435	java/lang/Throwable
    //   323	340	435	java/lang/Throwable
    //   350	359	435	java/lang/Throwable
    //   359	364	435	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cf.d.1
 * JD-Core Version:    0.6.2
 */