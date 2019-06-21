package com.tencent.mm.modelvoice;

final class i$a
  implements Runnable
{
  private i$a(i parami)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 26
    //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: bipush 240
    //   7: invokestatic 37	android/os/Process:setThreadPriority	(I)V
    //   10: aload_0
    //   11: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   14: invokestatic 41	com/tencent/mm/modelvoice/i:g	(Lcom/tencent/mm/modelvoice/i;)I
    //   17: iconst_2
    //   18: iconst_2
    //   19: invokestatic 47	android/media/AudioTrack:getMinBufferSize	(III)I
    //   22: iconst_2
    //   23: imul
    //   24: istore_1
    //   25: iload_1
    //   26: newarray byte
    //   28: astore_2
    //   29: aload_0
    //   30: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   33: invokestatic 41	com/tencent/mm/modelvoice/i:g	(Lcom/tencent/mm/modelvoice/i;)I
    //   36: bipush 20
    //   38: imul
    //   39: sipush 1000
    //   42: idiv
    //   43: i2s
    //   44: istore_3
    //   45: ldc 49
    //   47: ldc 51
    //   49: iconst_2
    //   50: anewarray 4	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: iload_3
    //   56: invokestatic 57	java/lang/Short:valueOf	(S)Ljava/lang/Short;
    //   59: aastore
    //   60: dup
    //   61: iconst_1
    //   62: iload_1
    //   63: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: aastore
    //   67: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: ldc 49
    //   72: ldc 70
    //   74: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aload_0
    //   78: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   81: invokestatic 76	com/tencent/mm/modelvoice/i:h	(Lcom/tencent/mm/modelvoice/i;)I
    //   84: iconst_1
    //   85: if_icmpeq +14 -> 99
    //   88: aload_0
    //   89: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   92: invokestatic 76	com/tencent/mm/modelvoice/i:h	(Lcom/tencent/mm/modelvoice/i;)I
    //   95: iconst_2
    //   96: if_icmpne +856 -> 952
    //   99: invokestatic 80	com/tencent/mm/modelvoice/i:alU	()Ljava/lang/Object;
    //   102: astore 4
    //   104: aload 4
    //   106: monitorenter
    //   107: invokestatic 84	com/tencent/mm/modelvoice/i:alV	()I
    //   110: aload_0
    //   111: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   114: invokestatic 86	com/tencent/mm/modelvoice/i:i	(Lcom/tencent/mm/modelvoice/i;)I
    //   117: if_icmpeq +83 -> 200
    //   120: ldc 49
    //   122: ldc 88
    //   124: iconst_2
    //   125: anewarray 4	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: aload_0
    //   131: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   134: invokestatic 86	com/tencent/mm/modelvoice/i:i	(Lcom/tencent/mm/modelvoice/i;)I
    //   137: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   140: aastore
    //   141: dup
    //   142: iconst_1
    //   143: invokestatic 84	com/tencent/mm/modelvoice/i:alV	()I
    //   146: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   149: aastore
    //   150: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: aload_0
    //   154: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   157: invokestatic 93	com/tencent/mm/modelvoice/i:j	(Lcom/tencent/mm/modelvoice/i;)I
    //   160: pop
    //   161: aload_0
    //   162: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   165: invokestatic 96	com/tencent/mm/modelvoice/i:k	(Lcom/tencent/mm/modelvoice/i;)I
    //   168: iconst_3
    //   169: if_icmple +17 -> 186
    //   172: getstatic 102	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   175: ldc2_w 103
    //   178: ldc2_w 105
    //   181: lconst_1
    //   182: iconst_0
    //   183: invokevirtual 109	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   186: aload_0
    //   187: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   190: aload_0
    //   191: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   194: invokestatic 113	com/tencent/mm/modelvoice/i:e	(Lcom/tencent/mm/modelvoice/i;)Ljava/lang/String;
    //   197: invokestatic 116	com/tencent/mm/modelvoice/i:a	(Lcom/tencent/mm/modelvoice/i;Ljava/lang/String;)V
    //   200: aload 4
    //   202: monitorexit
    //   203: aload_0
    //   204: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   207: invokestatic 120	com/tencent/mm/modelvoice/i:l	(Lcom/tencent/mm/modelvoice/i;)Z
    //   210: ifeq +222 -> 432
    //   213: ldc 49
    //   215: ldc 122
    //   217: invokestatic 124	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   220: ldc2_w 125
    //   223: invokestatic 132	java/lang/Thread:sleep	(J)V
    //   226: goto -23 -> 203
    //   229: astore_2
    //   230: getstatic 102	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   233: ldc2_w 103
    //   236: lconst_0
    //   237: lconst_1
    //   238: iconst_0
    //   239: invokevirtual 109	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   242: ldc 49
    //   244: ldc 134
    //   246: iconst_1
    //   247: anewarray 4	java/lang/Object
    //   250: dup
    //   251: iconst_0
    //   252: aload_2
    //   253: invokestatic 139	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   256: aastore
    //   257: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: aload_0
    //   261: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   264: invokestatic 145	com/tencent/mm/modelvoice/i:q	(Lcom/tencent/mm/modelvoice/i;)Landroid/media/MediaPlayer$OnErrorListener;
    //   267: ifnull +19 -> 286
    //   270: aload_0
    //   271: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   274: invokestatic 145	com/tencent/mm/modelvoice/i:q	(Lcom/tencent/mm/modelvoice/i;)Landroid/media/MediaPlayer$OnErrorListener;
    //   277: aconst_null
    //   278: iconst_0
    //   279: iconst_0
    //   280: invokeinterface 151 4 0
    //   285: pop
    //   286: aload_0
    //   287: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   290: iconst_0
    //   291: invokestatic 154	com/tencent/mm/modelvoice/i:a	(Lcom/tencent/mm/modelvoice/i;I)I
    //   294: pop
    //   295: invokestatic 80	com/tencent/mm/modelvoice/i:alU	()Ljava/lang/Object;
    //   298: astore 4
    //   300: aload 4
    //   302: monitorenter
    //   303: invokestatic 84	com/tencent/mm/modelvoice/i:alV	()I
    //   306: aload_0
    //   307: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   310: invokestatic 86	com/tencent/mm/modelvoice/i:i	(Lcom/tencent/mm/modelvoice/i;)I
    //   313: if_icmpne +43 -> 356
    //   316: invokestatic 159	com/tencent/mm/modelvoice/MediaRecorder:SilkDecUnInit	()I
    //   319: pop
    //   320: ldc 49
    //   322: ldc 161
    //   324: iconst_1
    //   325: anewarray 4	java/lang/Object
    //   328: dup
    //   329: iconst_0
    //   330: aload_0
    //   331: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   334: invokestatic 86	com/tencent/mm/modelvoice/i:i	(Lcom/tencent/mm/modelvoice/i;)I
    //   337: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   340: aastore
    //   341: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: invokestatic 164	com/tencent/mm/modelvoice/i:alW	()I
    //   347: pop
    //   348: aload_0
    //   349: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   352: invokestatic 167	com/tencent/mm/modelvoice/i:r	(Lcom/tencent/mm/modelvoice/i;)I
    //   355: pop
    //   356: aload 4
    //   358: monitorexit
    //   359: aload_0
    //   360: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   363: invokestatic 76	com/tencent/mm/modelvoice/i:h	(Lcom/tencent/mm/modelvoice/i;)I
    //   366: iconst_3
    //   367: if_icmpeq +616 -> 983
    //   370: aload_0
    //   371: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   374: invokestatic 171	com/tencent/mm/modelvoice/i:s	(Lcom/tencent/mm/modelvoice/i;)Lcom/tencent/mm/modelvoice/d$a;
    //   377: ifnull +15 -> 392
    //   380: aload_0
    //   381: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   384: invokestatic 171	com/tencent/mm/modelvoice/i:s	(Lcom/tencent/mm/modelvoice/i;)Lcom/tencent/mm/modelvoice/d$a;
    //   387: invokeinterface 176 1 0
    //   392: aload_0
    //   393: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   396: invokestatic 180	com/tencent/mm/modelvoice/i:t	(Lcom/tencent/mm/modelvoice/i;)Landroid/media/MediaPlayer$OnCompletionListener;
    //   399: ifnull +630 -> 1029
    //   402: aload_0
    //   403: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   406: invokestatic 180	com/tencent/mm/modelvoice/i:t	(Lcom/tencent/mm/modelvoice/i;)Landroid/media/MediaPlayer$OnCompletionListener;
    //   409: aconst_null
    //   410: invokeinterface 186 2 0
    //   415: ldc 26
    //   417: invokestatic 189	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   420: return
    //   421: astore_2
    //   422: aload 4
    //   424: monitorexit
    //   425: ldc 26
    //   427: invokestatic 189	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   430: aload_2
    //   431: athrow
    //   432: aload_2
    //   433: iload_3
    //   434: invokestatic 193	com/tencent/mm/modelvoice/MediaRecorder:SilkDoDec	([BS)I
    //   437: istore_1
    //   438: iload_1
    //   439: ifge +98 -> 537
    //   442: aload_0
    //   443: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   446: iconst_0
    //   447: invokestatic 154	com/tencent/mm/modelvoice/i:a	(Lcom/tencent/mm/modelvoice/i;I)I
    //   450: pop
    //   451: getstatic 102	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   454: ldc2_w 103
    //   457: lconst_0
    //   458: lconst_1
    //   459: iconst_0
    //   460: invokevirtual 109	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   463: getstatic 102	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   466: ldc2_w 103
    //   469: ldc2_w 194
    //   472: lconst_1
    //   473: iconst_0
    //   474: invokevirtual 109	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   477: ldc 49
    //   479: ldc 197
    //   481: iconst_2
    //   482: anewarray 4	java/lang/Object
    //   485: dup
    //   486: iconst_0
    //   487: aload_0
    //   488: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   491: invokestatic 86	com/tencent/mm/modelvoice/i:i	(Lcom/tencent/mm/modelvoice/i;)I
    //   494: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   497: aastore
    //   498: dup
    //   499: iconst_1
    //   500: iload_1
    //   501: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   504: aastore
    //   505: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   508: aload_0
    //   509: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   512: invokestatic 201	com/tencent/mm/modelvoice/i:m	(Lcom/tencent/mm/modelvoice/i;)Lcom/tencent/mm/audio/d/b;
    //   515: ifnull -438 -> 77
    //   518: getstatic 207	com/tencent/mm/platformtools/ae:gjd	Z
    //   521: ifeq -444 -> 77
    //   524: aload_0
    //   525: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   528: invokestatic 201	com/tencent/mm/modelvoice/i:m	(Lcom/tencent/mm/modelvoice/i;)Lcom/tencent/mm/audio/d/b;
    //   531: invokevirtual 212	com/tencent/mm/audio/d/b:Fg	()V
    //   534: goto -457 -> 77
    //   537: getstatic 207	com/tencent/mm/platformtools/ae:gjd	Z
    //   540: ifeq +28 -> 568
    //   543: aload_0
    //   544: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   547: invokestatic 201	com/tencent/mm/modelvoice/i:m	(Lcom/tencent/mm/modelvoice/i;)Lcom/tencent/mm/audio/d/b;
    //   550: ifnull +18 -> 568
    //   553: aload_0
    //   554: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   557: invokestatic 201	com/tencent/mm/modelvoice/i:m	(Lcom/tencent/mm/modelvoice/i;)Lcom/tencent/mm/audio/d/b;
    //   560: aload_2
    //   561: iload_3
    //   562: iconst_2
    //   563: imul
    //   564: invokevirtual 216	com/tencent/mm/audio/d/b:y	([BI)Z
    //   567: pop
    //   568: aload_0
    //   569: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   572: invokestatic 220	com/tencent/mm/modelvoice/i:c	(Lcom/tencent/mm/modelvoice/i;)Landroid/media/AudioTrack;
    //   575: aload_2
    //   576: iconst_0
    //   577: iload_3
    //   578: iconst_2
    //   579: imul
    //   580: invokevirtual 224	android/media/AudioTrack:write	([BII)I
    //   583: pop
    //   584: aload_0
    //   585: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   588: invokestatic 227	com/tencent/mm/modelvoice/i:n	(Lcom/tencent/mm/modelvoice/i;)I
    //   591: pop
    //   592: iload_1
    //   593: ifne +131 -> 724
    //   596: aload_0
    //   597: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   600: iconst_0
    //   601: invokestatic 154	com/tencent/mm/modelvoice/i:a	(Lcom/tencent/mm/modelvoice/i;I)I
    //   604: pop
    //   605: ldc 49
    //   607: ldc 229
    //   609: iconst_1
    //   610: anewarray 4	java/lang/Object
    //   613: dup
    //   614: iconst_0
    //   615: aload_0
    //   616: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   619: invokestatic 86	com/tencent/mm/modelvoice/i:i	(Lcom/tencent/mm/modelvoice/i;)I
    //   622: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   625: aastore
    //   626: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   629: aload_0
    //   630: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   633: invokestatic 201	com/tencent/mm/modelvoice/i:m	(Lcom/tencent/mm/modelvoice/i;)Lcom/tencent/mm/audio/d/b;
    //   636: ifnull -559 -> 77
    //   639: getstatic 207	com/tencent/mm/platformtools/ae:gjd	Z
    //   642: ifeq -565 -> 77
    //   645: aload_0
    //   646: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   649: invokestatic 201	com/tencent/mm/modelvoice/i:m	(Lcom/tencent/mm/modelvoice/i;)Lcom/tencent/mm/audio/d/b;
    //   652: invokevirtual 212	com/tencent/mm/audio/d/b:Fg	()V
    //   655: new 231	com/tencent/mm/modelvoice/i$a$1
    //   658: astore 4
    //   660: aload 4
    //   662: aload_0
    //   663: invokespecial 234	com/tencent/mm/modelvoice/i$a$1:<init>	(Lcom/tencent/mm/modelvoice/i$a;)V
    //   666: aload 4
    //   668: invokestatic 239	com/tencent/mm/sdk/platformtools/al:d	(Ljava/lang/Runnable;)V
    //   671: goto -594 -> 77
    //   674: astore 4
    //   676: ldc 49
    //   678: ldc 241
    //   680: iconst_1
    //   681: anewarray 4	java/lang/Object
    //   684: dup
    //   685: iconst_0
    //   686: aload 4
    //   688: invokevirtual 245	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   691: aastore
    //   692: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   695: getstatic 102	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   698: ldc2_w 103
    //   701: lconst_0
    //   702: lconst_1
    //   703: iconst_0
    //   704: invokevirtual 109	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   707: getstatic 102	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   710: ldc2_w 103
    //   713: ldc2_w 246
    //   716: lconst_1
    //   717: iconst_0
    //   718: invokevirtual 109	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   721: goto -137 -> 584
    //   724: aload_0
    //   725: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   728: invokestatic 76	com/tencent/mm/modelvoice/i:h	(Lcom/tencent/mm/modelvoice/i;)I
    //   731: iconst_2
    //   732: if_icmpne +157 -> 889
    //   735: aload_0
    //   736: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   739: invokestatic 249	com/tencent/mm/modelvoice/i:o	(Lcom/tencent/mm/modelvoice/i;)Ljava/lang/String;
    //   742: astore 4
    //   744: aload 4
    //   746: monitorenter
    //   747: ldc 49
    //   749: ldc 251
    //   751: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   754: aload_0
    //   755: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   758: invokestatic 249	com/tencent/mm/modelvoice/i:o	(Lcom/tencent/mm/modelvoice/i;)Ljava/lang/String;
    //   761: invokevirtual 257	java/lang/Object:notify	()V
    //   764: ldc 49
    //   766: ldc_w 259
    //   769: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   772: aload 4
    //   774: monitorexit
    //   775: aload_0
    //   776: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   779: invokestatic 262	com/tencent/mm/modelvoice/i:p	(Lcom/tencent/mm/modelvoice/i;)Ljava/lang/String;
    //   782: astore 4
    //   784: aload 4
    //   786: monitorenter
    //   787: ldc 49
    //   789: ldc_w 264
    //   792: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   795: aload_0
    //   796: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   799: invokestatic 262	com/tencent/mm/modelvoice/i:p	(Lcom/tencent/mm/modelvoice/i;)Ljava/lang/String;
    //   802: invokevirtual 267	java/lang/Object:wait	()V
    //   805: ldc 49
    //   807: ldc_w 269
    //   810: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   813: aload 4
    //   815: monitorexit
    //   816: goto -739 -> 77
    //   819: astore_2
    //   820: aload 4
    //   822: monitorexit
    //   823: ldc 26
    //   825: invokestatic 189	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   828: aload_2
    //   829: athrow
    //   830: astore 5
    //   832: ldc 49
    //   834: ldc 134
    //   836: iconst_1
    //   837: anewarray 4	java/lang/Object
    //   840: dup
    //   841: iconst_0
    //   842: aload 5
    //   844: invokestatic 139	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   847: aastore
    //   848: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   851: goto -79 -> 772
    //   854: astore_2
    //   855: aload 4
    //   857: monitorexit
    //   858: ldc 26
    //   860: invokestatic 189	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   863: aload_2
    //   864: athrow
    //   865: astore 5
    //   867: ldc 49
    //   869: ldc 134
    //   871: iconst_1
    //   872: anewarray 4	java/lang/Object
    //   875: dup
    //   876: iconst_0
    //   877: aload 5
    //   879: invokestatic 139	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   882: aastore
    //   883: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   886: goto -73 -> 813
    //   889: aload_0
    //   890: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   893: invokestatic 249	com/tencent/mm/modelvoice/i:o	(Lcom/tencent/mm/modelvoice/i;)Ljava/lang/String;
    //   896: astore 4
    //   898: aload 4
    //   900: monitorenter
    //   901: aload_0
    //   902: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   905: invokestatic 249	com/tencent/mm/modelvoice/i:o	(Lcom/tencent/mm/modelvoice/i;)Ljava/lang/String;
    //   908: invokevirtual 257	java/lang/Object:notify	()V
    //   911: aload 4
    //   913: monitorexit
    //   914: goto -837 -> 77
    //   917: astore_2
    //   918: aload 4
    //   920: monitorexit
    //   921: ldc 26
    //   923: invokestatic 189	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   926: aload_2
    //   927: athrow
    //   928: astore 5
    //   930: ldc 49
    //   932: ldc 134
    //   934: iconst_1
    //   935: anewarray 4	java/lang/Object
    //   938: dup
    //   939: iconst_0
    //   940: aload 5
    //   942: invokestatic 139	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   945: aastore
    //   946: invokestatic 141	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   949: goto -38 -> 911
    //   952: aload_0
    //   953: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   956: invokestatic 76	com/tencent/mm/modelvoice/i:h	(Lcom/tencent/mm/modelvoice/i;)I
    //   959: iconst_3
    //   960: if_icmpeq -665 -> 295
    //   963: ldc2_w 270
    //   966: invokestatic 132	java/lang/Thread:sleep	(J)V
    //   969: goto -674 -> 295
    //   972: astore_2
    //   973: aload 4
    //   975: monitorexit
    //   976: ldc 26
    //   978: invokestatic 189	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   981: aload_2
    //   982: athrow
    //   983: aload_0
    //   984: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   987: invokestatic 220	com/tencent/mm/modelvoice/i:c	(Lcom/tencent/mm/modelvoice/i;)Landroid/media/AudioTrack;
    //   990: ifnull +39 -> 1029
    //   993: ldc 49
    //   995: ldc_w 273
    //   998: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1001: aload_0
    //   1002: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   1005: invokestatic 220	com/tencent/mm/modelvoice/i:c	(Lcom/tencent/mm/modelvoice/i;)Landroid/media/AudioTrack;
    //   1008: invokevirtual 276	android/media/AudioTrack:stop	()V
    //   1011: aload_0
    //   1012: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   1015: invokestatic 220	com/tencent/mm/modelvoice/i:c	(Lcom/tencent/mm/modelvoice/i;)Landroid/media/AudioTrack;
    //   1018: invokevirtual 279	android/media/AudioTrack:release	()V
    //   1021: aload_0
    //   1022: getfield 15	com/tencent/mm/modelvoice/i$a:fZG	Lcom/tencent/mm/modelvoice/i;
    //   1025: invokestatic 281	com/tencent/mm/modelvoice/i:d	(Lcom/tencent/mm/modelvoice/i;)Landroid/media/AudioTrack;
    //   1028: pop
    //   1029: ldc 26
    //   1031: invokestatic 189	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1034: goto -614 -> 420
    //
    // Exception table:
    //   from	to	target	type
    //   5	77	229	java/lang/Exception
    //   77	99	229	java/lang/Exception
    //   99	107	229	java/lang/Exception
    //   203	226	229	java/lang/Exception
    //   425	432	229	java/lang/Exception
    //   432	438	229	java/lang/Exception
    //   442	534	229	java/lang/Exception
    //   537	568	229	java/lang/Exception
    //   584	592	229	java/lang/Exception
    //   596	671	229	java/lang/Exception
    //   676	721	229	java/lang/Exception
    //   724	747	229	java/lang/Exception
    //   775	787	229	java/lang/Exception
    //   823	830	229	java/lang/Exception
    //   858	865	229	java/lang/Exception
    //   889	901	229	java/lang/Exception
    //   921	928	229	java/lang/Exception
    //   952	969	229	java/lang/Exception
    //   107	186	421	finally
    //   186	200	421	finally
    //   200	203	421	finally
    //   422	425	421	finally
    //   568	584	674	java/lang/Exception
    //   787	813	819	finally
    //   813	816	819	finally
    //   820	823	819	finally
    //   867	886	819	finally
    //   747	772	830	java/lang/Exception
    //   747	772	854	finally
    //   772	775	854	finally
    //   832	851	854	finally
    //   855	858	854	finally
    //   787	813	865	java/lang/Exception
    //   901	911	917	finally
    //   911	914	917	finally
    //   918	921	917	finally
    //   930	949	917	finally
    //   901	911	928	java/lang/Exception
    //   303	356	972	finally
    //   356	359	972	finally
    //   973	976	972	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.i.a
 * JD-Core Version:    0.6.2
 */