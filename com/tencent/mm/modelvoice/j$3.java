package com.tencent.mm.modelvoice;

final class j$3
  implements Runnable
{
  j$3(j paramj)
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
    //   11: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   14: aload_0
    //   15: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   18: getfield 41	com/tencent/mm/modelvoice/j:fileName	Ljava/lang/String;
    //   21: invokestatic 47	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   24: putfield 51	com/tencent/mm/modelvoice/j:fZT	Ljava/io/InputStream;
    //   27: aload_0
    //   28: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   31: getfield 55	com/tencent/mm/modelvoice/j:status	I
    //   34: iconst_1
    //   35: if_icmpeq +14 -> 49
    //   38: aload_0
    //   39: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   42: getfield 55	com/tencent/mm/modelvoice/j:status	I
    //   45: iconst_2
    //   46: if_icmpne +744 -> 790
    //   49: aload_0
    //   50: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   53: aload_0
    //   54: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   57: getfield 51	com/tencent/mm/modelvoice/j:fZT	Ljava/io/InputStream;
    //   60: aload_0
    //   61: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   64: getfield 59	com/tencent/mm/modelvoice/j:fZR	[B
    //   67: invokevirtual 65	java/io/InputStream:read	([B)I
    //   70: putfield 68	com/tencent/mm/modelvoice/j:fZS	I
    //   73: aload_0
    //   74: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   77: getfield 68	com/tencent/mm/modelvoice/j:fZS	I
    //   80: iconst_m1
    //   81: if_icmpeq +587 -> 668
    //   84: aload_0
    //   85: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   88: getfield 72	com/tencent/mm/modelvoice/j:fZN	Lcom/tencent/qqpinyin/voicerecoapi/a;
    //   91: astore_1
    //   92: aload_0
    //   93: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   96: getfield 59	com/tencent/mm/modelvoice/j:fZR	[B
    //   99: astore_2
    //   100: aload_0
    //   101: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   104: getfield 68	com/tencent/mm/modelvoice/j:fZS	I
    //   107: istore_3
    //   108: aload_1
    //   109: getfield 77	com/tencent/qqpinyin/voicerecoapi/a:AqB	I
    //   112: ifne +199 -> 311
    //   115: new 79	com/tencent/qqpinyin/voicerecoapi/b
    //   118: astore_2
    //   119: aload_2
    //   120: bipush 154
    //   122: invokespecial 81	com/tencent/qqpinyin/voicerecoapi/b:<init>	(I)V
    //   125: ldc 26
    //   127: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: aload_2
    //   131: athrow
    //   132: astore_2
    //   133: ldc 86
    //   135: ldc 88
    //   137: iconst_1
    //   138: anewarray 4	java/lang/Object
    //   141: dup
    //   142: iconst_0
    //   143: aload_2
    //   144: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   147: aastore
    //   148: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload_0
    //   152: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   155: getfield 104	com/tencent/mm/modelvoice/j:fZF	Landroid/media/MediaPlayer$OnErrorListener;
    //   158: ifnull +19 -> 177
    //   161: aload_0
    //   162: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   165: getfield 104	com/tencent/mm/modelvoice/j:fZF	Landroid/media/MediaPlayer$OnErrorListener;
    //   168: aconst_null
    //   169: iconst_0
    //   170: iconst_0
    //   171: invokeinterface 110 4 0
    //   176: pop
    //   177: aload_0
    //   178: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   181: iconst_0
    //   182: putfield 55	com/tencent/mm/modelvoice/j:status	I
    //   185: aload_0
    //   186: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   189: getfield 51	com/tencent/mm/modelvoice/j:fZT	Ljava/io/InputStream;
    //   192: ifnull +21 -> 213
    //   195: aload_0
    //   196: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   199: getfield 51	com/tencent/mm/modelvoice/j:fZT	Ljava/io/InputStream;
    //   202: invokevirtual 113	java/io/InputStream:close	()V
    //   205: aload_0
    //   206: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   209: aconst_null
    //   210: putfield 51	com/tencent/mm/modelvoice/j:fZT	Ljava/io/InputStream;
    //   213: aload_0
    //   214: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   217: getfield 72	com/tencent/mm/modelvoice/j:fZN	Lcom/tencent/qqpinyin/voicerecoapi/a;
    //   220: astore_2
    //   221: aload_2
    //   222: getfield 77	com/tencent/qqpinyin/voicerecoapi/a:AqB	I
    //   225: ifne +607 -> 832
    //   228: bipush 154
    //   230: istore_3
    //   231: aload_0
    //   232: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   235: getfield 55	com/tencent/mm/modelvoice/j:status	I
    //   238: iconst_3
    //   239: if_icmpeq +618 -> 857
    //   242: aload_0
    //   243: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   246: getfield 117	com/tencent/mm/modelvoice/j:fZI	Lcom/tencent/mm/modelvoice/d$a;
    //   249: ifnull +15 -> 264
    //   252: aload_0
    //   253: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   256: getfield 117	com/tencent/mm/modelvoice/j:fZI	Lcom/tencent/mm/modelvoice/d$a;
    //   259: invokeinterface 122 1 0
    //   264: aload_0
    //   265: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   268: getfield 126	com/tencent/mm/modelvoice/j:fZE	Landroid/media/MediaPlayer$OnCompletionListener;
    //   271: ifnull +16 -> 287
    //   274: aload_0
    //   275: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   278: getfield 126	com/tencent/mm/modelvoice/j:fZE	Landroid/media/MediaPlayer$OnCompletionListener;
    //   281: aconst_null
    //   282: invokeinterface 132 2 0
    //   287: iload_3
    //   288: ifeq +17 -> 305
    //   291: ldc 86
    //   293: ldc 134
    //   295: iload_3
    //   296: invokestatic 140	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   299: invokevirtual 144	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   302: invokestatic 147	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   305: ldc 26
    //   307: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   310: return
    //   311: aload_2
    //   312: ifnull +8 -> 320
    //   315: aload_2
    //   316: arraylength
    //   317: ifne +20 -> 337
    //   320: new 79	com/tencent/qqpinyin/voicerecoapi/b
    //   323: astore_2
    //   324: aload_2
    //   325: bipush 152
    //   327: invokespecial 81	com/tencent/qqpinyin/voicerecoapi/b:<init>	(I)V
    //   330: ldc 26
    //   332: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   335: aload_2
    //   336: athrow
    //   337: aload_1
    //   338: getfield 151	com/tencent/qqpinyin/voicerecoapi/a:AqC	Lcom/tencent/qqpinyin/voicerecoapi/TRSpeexNative;
    //   341: aload_1
    //   342: getfield 77	com/tencent/qqpinyin/voicerecoapi/a:AqB	I
    //   345: aload_2
    //   346: iconst_0
    //   347: iload_3
    //   348: aload_1
    //   349: getfield 154	com/tencent/qqpinyin/voicerecoapi/a:Aqz	[B
    //   352: invokevirtual 160	com/tencent/qqpinyin/voicerecoapi/TRSpeexNative:nativeTRSpeexDecode	(I[BII[B)I
    //   355: istore_3
    //   356: iload_3
    //   357: ifge +19 -> 376
    //   360: new 79	com/tencent/qqpinyin/voicerecoapi/b
    //   363: astore_2
    //   364: aload_2
    //   365: iload_3
    //   366: invokespecial 81	com/tencent/qqpinyin/voicerecoapi/b:<init>	(I)V
    //   369: ldc 26
    //   371: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   374: aload_2
    //   375: athrow
    //   376: iload_3
    //   377: ifne +24 -> 401
    //   380: aconst_null
    //   381: astore_2
    //   382: aload_2
    //   383: ifnull +7 -> 390
    //   386: iload_3
    //   387: ifne +32 -> 419
    //   390: aload_0
    //   391: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   394: iconst_0
    //   395: putfield 55	com/tencent/mm/modelvoice/j:status	I
    //   398: goto -371 -> 27
    //   401: iload_3
    //   402: newarray byte
    //   404: astore_2
    //   405: aload_1
    //   406: getfield 154	com/tencent/qqpinyin/voicerecoapi/a:Aqz	[B
    //   409: iconst_0
    //   410: aload_2
    //   411: iconst_0
    //   412: iload_3
    //   413: invokestatic 166	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   416: goto -34 -> 382
    //   419: aload_2
    //   420: arraylength
    //   421: istore_3
    //   422: iconst_0
    //   423: istore 4
    //   425: iload_3
    //   426: aload_0
    //   427: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   430: getfield 169	com/tencent/mm/modelvoice/j:fZU	I
    //   433: if_icmplt +99 -> 532
    //   436: aload_0
    //   437: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   440: getfield 55	com/tencent/mm/modelvoice/j:status	I
    //   443: iconst_1
    //   444: if_icmpne +88 -> 532
    //   447: aload_0
    //   448: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   451: getfield 173	com/tencent/mm/modelvoice/j:fZQ	Z
    //   454: ifeq +12 -> 466
    //   457: ldc2_w 174
    //   460: invokestatic 181	java/lang/Thread:sleep	(J)V
    //   463: goto -38 -> 425
    //   466: aload_0
    //   467: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   470: getfield 185	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   473: ifnull -48 -> 425
    //   476: aload_0
    //   477: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   480: getfield 173	com/tencent/mm/modelvoice/j:fZQ	Z
    //   483: ifne -58 -> 425
    //   486: aload_0
    //   487: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   490: getfield 185	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   493: aload_2
    //   494: iload 4
    //   496: aload_0
    //   497: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   500: getfield 169	com/tencent/mm/modelvoice/j:fZU	I
    //   503: invokevirtual 191	android/media/AudioTrack:write	([BII)I
    //   506: pop
    //   507: iload 4
    //   509: aload_0
    //   510: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   513: getfield 169	com/tencent/mm/modelvoice/j:fZU	I
    //   516: iadd
    //   517: istore 4
    //   519: iload_3
    //   520: aload_0
    //   521: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   524: getfield 169	com/tencent/mm/modelvoice/j:fZU	I
    //   527: isub
    //   528: istore_3
    //   529: goto -104 -> 425
    //   532: iload_3
    //   533: aload_0
    //   534: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   537: getfield 169	com/tencent/mm/modelvoice/j:fZU	I
    //   540: if_icmpge +32 -> 572
    //   543: iload_3
    //   544: ifle +28 -> 572
    //   547: aload_0
    //   548: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   551: getfield 185	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   554: ifnull +18 -> 572
    //   557: aload_0
    //   558: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   561: getfield 185	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   564: aload_2
    //   565: iload 4
    //   567: iload_3
    //   568: invokevirtual 191	android/media/AudioTrack:write	([BII)I
    //   571: pop
    //   572: aload_0
    //   573: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   576: getfield 55	com/tencent/mm/modelvoice/j:status	I
    //   579: iconst_2
    //   580: if_icmpne +153 -> 733
    //   583: aload_0
    //   584: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   587: getfield 194	com/tencent/mm/modelvoice/j:fZu	Ljava/lang/String;
    //   590: astore_2
    //   591: aload_2
    //   592: monitorenter
    //   593: ldc 86
    //   595: ldc 196
    //   597: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   600: aload_0
    //   601: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   604: getfield 194	com/tencent/mm/modelvoice/j:fZu	Ljava/lang/String;
    //   607: invokevirtual 202	java/lang/Object:notify	()V
    //   610: ldc 86
    //   612: ldc 204
    //   614: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   617: aload_2
    //   618: monitorexit
    //   619: aload_0
    //   620: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   623: getfield 207	com/tencent/mm/modelvoice/j:fZt	Ljava/lang/String;
    //   626: astore_2
    //   627: aload_2
    //   628: monitorenter
    //   629: ldc 86
    //   631: ldc 209
    //   633: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   636: aload_0
    //   637: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   640: getfield 207	com/tencent/mm/modelvoice/j:fZt	Ljava/lang/String;
    //   643: invokevirtual 212	java/lang/Object:wait	()V
    //   646: ldc 86
    //   648: ldc 214
    //   650: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   653: aload_2
    //   654: monitorexit
    //   655: goto -628 -> 27
    //   658: astore_1
    //   659: aload_2
    //   660: monitorexit
    //   661: ldc 26
    //   663: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   666: aload_1
    //   667: athrow
    //   668: aload_0
    //   669: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   672: iconst_0
    //   673: putfield 55	com/tencent/mm/modelvoice/j:status	I
    //   676: goto -104 -> 572
    //   679: astore_1
    //   680: ldc 86
    //   682: ldc 88
    //   684: iconst_1
    //   685: anewarray 4	java/lang/Object
    //   688: dup
    //   689: iconst_0
    //   690: aload_1
    //   691: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   694: aastore
    //   695: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   698: goto -81 -> 617
    //   701: astore_1
    //   702: aload_2
    //   703: monitorexit
    //   704: ldc 26
    //   706: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   709: aload_1
    //   710: athrow
    //   711: astore_1
    //   712: ldc 86
    //   714: ldc 88
    //   716: iconst_1
    //   717: anewarray 4	java/lang/Object
    //   720: dup
    //   721: iconst_0
    //   722: aload_1
    //   723: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   726: aastore
    //   727: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   730: goto -77 -> 653
    //   733: aload_0
    //   734: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   737: getfield 194	com/tencent/mm/modelvoice/j:fZu	Ljava/lang/String;
    //   740: astore_2
    //   741: aload_2
    //   742: monitorenter
    //   743: aload_0
    //   744: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   747: getfield 194	com/tencent/mm/modelvoice/j:fZu	Ljava/lang/String;
    //   750: invokevirtual 202	java/lang/Object:notify	()V
    //   753: aload_2
    //   754: monitorexit
    //   755: goto -728 -> 27
    //   758: astore_1
    //   759: aload_2
    //   760: monitorexit
    //   761: ldc 26
    //   763: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   766: aload_1
    //   767: athrow
    //   768: astore_1
    //   769: ldc 86
    //   771: ldc 88
    //   773: iconst_1
    //   774: anewarray 4	java/lang/Object
    //   777: dup
    //   778: iconst_0
    //   779: aload_1
    //   780: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   783: aastore
    //   784: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   787: goto -34 -> 753
    //   790: aload_0
    //   791: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   794: getfield 55	com/tencent/mm/modelvoice/j:status	I
    //   797: iconst_3
    //   798: if_icmpeq -613 -> 185
    //   801: ldc2_w 215
    //   804: invokestatic 181	java/lang/Thread:sleep	(J)V
    //   807: goto -622 -> 185
    //   810: astore_2
    //   811: ldc 86
    //   813: ldc 88
    //   815: iconst_1
    //   816: anewarray 4	java/lang/Object
    //   819: dup
    //   820: iconst_0
    //   821: aload_2
    //   822: invokestatic 94	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   825: aastore
    //   826: invokestatic 100	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   829: goto -624 -> 205
    //   832: aload_2
    //   833: aconst_null
    //   834: putfield 154	com/tencent/qqpinyin/voicerecoapi/a:Aqz	[B
    //   837: aload_2
    //   838: getfield 151	com/tencent/qqpinyin/voicerecoapi/a:AqC	Lcom/tencent/qqpinyin/voicerecoapi/TRSpeexNative;
    //   841: aload_2
    //   842: getfield 77	com/tencent/qqpinyin/voicerecoapi/a:AqB	I
    //   845: invokevirtual 220	com/tencent/qqpinyin/voicerecoapi/TRSpeexNative:nativeTRSpeexDecodeRelease	(I)I
    //   848: istore_3
    //   849: aload_2
    //   850: iconst_0
    //   851: putfield 77	com/tencent/qqpinyin/voicerecoapi/a:AqB	I
    //   854: goto -623 -> 231
    //   857: aload_0
    //   858: getfield 17	com/tencent/mm/modelvoice/j$3:fZV	Lcom/tencent/mm/modelvoice/j;
    //   861: invokevirtual 223	com/tencent/mm/modelvoice/j:alX	()V
    //   864: goto -577 -> 287
    //   867: astore_2
    //   868: goto -581 -> 287
    //
    // Exception table:
    //   from	to	target	type
    //   5	27	132	java/lang/Exception
    //   27	49	132	java/lang/Exception
    //   49	132	132	java/lang/Exception
    //   315	320	132	java/lang/Exception
    //   320	337	132	java/lang/Exception
    //   337	356	132	java/lang/Exception
    //   360	376	132	java/lang/Exception
    //   390	398	132	java/lang/Exception
    //   401	416	132	java/lang/Exception
    //   419	422	132	java/lang/Exception
    //   425	463	132	java/lang/Exception
    //   466	529	132	java/lang/Exception
    //   532	543	132	java/lang/Exception
    //   547	572	132	java/lang/Exception
    //   572	593	132	java/lang/Exception
    //   619	629	132	java/lang/Exception
    //   661	668	132	java/lang/Exception
    //   668	676	132	java/lang/Exception
    //   704	711	132	java/lang/Exception
    //   733	743	132	java/lang/Exception
    //   761	768	132	java/lang/Exception
    //   790	807	132	java/lang/Exception
    //   629	653	658	finally
    //   653	655	658	finally
    //   659	661	658	finally
    //   712	730	658	finally
    //   593	617	679	java/lang/Exception
    //   593	617	701	finally
    //   617	619	701	finally
    //   680	698	701	finally
    //   702	704	701	finally
    //   629	653	711	java/lang/Exception
    //   743	753	758	finally
    //   753	755	758	finally
    //   759	761	758	finally
    //   769	787	758	finally
    //   743	753	768	java/lang/Exception
    //   195	205	810	java/io/IOException
    //   857	864	867	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.j.3
 * JD-Core Version:    0.6.2
 */