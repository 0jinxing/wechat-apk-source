package com.tencent.mm.ui.chatting;

import com.tencent.mm.ui.chatting.d.a;

public final class s$p extends s.e
{
  public s$p(a parama)
  {
    super(parama);
  }

  // ERROR //
  public final void a(android.view.View paramView, a parama, com.tencent.mm.storage.bi parambi)
  {
    // Byte code:
    //   0: sipush 30734
    //   3: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokevirtual 30	android/view/View:getTag	()Ljava/lang/Object;
    //   10: checkcast 32	com/tencent/mm/ui/chatting/viewitems/ay
    //   13: astore_1
    //   14: iconst_0
    //   15: istore 4
    //   17: invokestatic 38	java/lang/System:currentTimeMillis	()J
    //   20: lstore 5
    //   22: lload 5
    //   24: ldc2_w 39
    //   27: ldiv
    //   28: l2i
    //   29: istore 7
    //   31: ldc 42
    //   33: ldc 44
    //   35: iconst_1
    //   36: anewarray 46	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: iload 7
    //   43: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: aastore
    //   47: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: aload_1
    //   51: getfield 61	com/tencent/mm/ui/chatting/viewitems/ay:cRS	Ljava/lang/String;
    //   54: aload_2
    //   55: getfield 67	com/tencent/mm/ui/chatting/d/a:yTx	Lcom/tencent/mm/ui/chatting/BaseChattingUIFragment;
    //   58: invokevirtual 73	com/tencent/mm/ui/chatting/BaseChattingUIFragment:getContext	()Landroid/app/Activity;
    //   61: aconst_null
    //   62: aload_2
    //   63: invokevirtual 77	com/tencent/mm/ui/chatting/d/a:getTalkerUserName	()Ljava/lang/String;
    //   66: invokestatic 82	com/tencent/mm/ui/chatting/e:a	(Ljava/lang/String;Landroid/content/Context;Lcom/tencent/mm/ui/MMFragment;Ljava/lang/String;)Z
    //   69: ifeq +10 -> 79
    //   72: sipush 30734
    //   75: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: return
    //   79: aload_1
    //   80: getfield 88	com/tencent/mm/ui/chatting/viewitems/ay:userName	Ljava/lang/String;
    //   83: astore 8
    //   85: aload_1
    //   86: getfield 91	com/tencent/mm/ui/chatting/viewitems/ay:zit	Ljava/lang/String;
    //   89: astore 9
    //   91: aload 8
    //   93: ifnull +13 -> 106
    //   96: aload 8
    //   98: ldc 93
    //   100: invokevirtual 99	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   103: ifeq +12 -> 115
    //   106: sipush 30734
    //   109: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: goto -34 -> 78
    //   115: aload 8
    //   117: iconst_0
    //   118: aload_2
    //   119: getfield 67	com/tencent/mm/ui/chatting/d/a:yTx	Lcom/tencent/mm/ui/chatting/BaseChattingUIFragment;
    //   122: ldc 101
    //   124: sipush 10000
    //   127: invokevirtual 107	com/tencent/mm/ui/MMFragment:getIntExtra	(Ljava/lang/String;I)I
    //   130: iload 7
    //   132: invokestatic 113	com/tencent/mm/af/l:c	(Ljava/lang/String;III)Ljava/lang/String;
    //   135: astore 10
    //   137: new 115	android/content/Intent
    //   140: dup
    //   141: invokespecial 118	android/content/Intent:<init>	()V
    //   144: astore 8
    //   146: aload 8
    //   148: ldc 120
    //   150: aload 10
    //   152: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   155: pop
    //   156: aload 8
    //   158: ldc 126
    //   160: aload 10
    //   162: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   165: pop
    //   166: aload 8
    //   168: ldc 128
    //   170: aload 9
    //   172: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   175: pop
    //   176: new 130	android/os/Bundle
    //   179: dup
    //   180: invokespecial 131	android/os/Bundle:<init>	()V
    //   183: astore 9
    //   185: aload_3
    //   186: ifnull +970 -> 1156
    //   189: aload_3
    //   190: invokevirtual 137	com/tencent/mm/storage/bi:dtu	()Z
    //   193: ifeq +111 -> 304
    //   196: aload_3
    //   197: getfield 142	com/tencent/mm/g/c/cy:field_content	Ljava/lang/String;
    //   200: ldc 144
    //   202: invokestatic 150	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   205: astore 10
    //   207: aload 10
    //   209: ifnull +95 -> 304
    //   212: aload 10
    //   214: invokestatic 156	com/tencent/mm/ui/chatting/viewitems/w$b:aX	(Ljava/util/Map;)Lcom/tencent/mm/ui/chatting/viewitems/w$b;
    //   217: astore 10
    //   219: aload 10
    //   221: getfield 159	com/tencent/mm/ui/chatting/viewitems/w$b:fhu	Ljava/lang/String;
    //   224: invokestatic 165	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   227: ifne +77 -> 304
    //   230: aload 8
    //   232: ldc 167
    //   234: aload 10
    //   236: getfield 159	com/tencent/mm/ui/chatting/viewitems/w$b:fhu	Ljava/lang/String;
    //   239: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   242: pop
    //   243: ldc 42
    //   245: ldc 169
    //   247: iconst_2
    //   248: anewarray 46	java/lang/Object
    //   251: dup
    //   252: iconst_0
    //   253: aload 10
    //   255: getfield 159	com/tencent/mm/ui/chatting/viewitems/w$b:fhu	Ljava/lang/String;
    //   258: aastore
    //   259: dup
    //   260: iconst_1
    //   261: aload_1
    //   262: getfield 172	com/tencent/mm/ui/chatting/viewitems/ay:cMg	Ljava/lang/String;
    //   265: aastore
    //   266: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   269: getstatic 181	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   272: sipush 11608
    //   275: iconst_3
    //   276: anewarray 46	java/lang/Object
    //   279: dup
    //   280: iconst_0
    //   281: aload 10
    //   283: getfield 159	com/tencent/mm/ui/chatting/viewitems/w$b:fhu	Ljava/lang/String;
    //   286: aastore
    //   287: dup
    //   288: iconst_1
    //   289: aload_1
    //   290: getfield 172	com/tencent/mm/ui/chatting/viewitems/ay:cMg	Ljava/lang/String;
    //   293: aastore
    //   294: dup
    //   295: iconst_2
    //   296: iconst_0
    //   297: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   300: aastore
    //   301: invokevirtual 185	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   304: invokestatic 191	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   307: pop
    //   308: invokestatic 197	com/tencent/mm/model/c:XM	()Lcom/tencent/mm/storage/bd;
    //   311: aload_3
    //   312: getfield 200	com/tencent/mm/g/c/cy:field_talker	Ljava/lang/String;
    //   315: invokeinterface 206 2 0
    //   320: astore 10
    //   322: iload 4
    //   324: istore 11
    //   326: aload 10
    //   328: ifnull +37 -> 365
    //   331: iload 4
    //   333: istore 11
    //   335: aload 10
    //   337: invokevirtual 211	com/tencent/mm/storage/ad:dsf	()Z
    //   340: ifeq +25 -> 365
    //   343: iconst_4
    //   344: istore 11
    //   346: ldc 42
    //   348: ldc 213
    //   350: iconst_1
    //   351: anewarray 46	java/lang/Object
    //   354: dup
    //   355: iconst_0
    //   356: aload 10
    //   358: getfield 218	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   361: aastore
    //   362: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   365: iload 11
    //   367: istore 4
    //   369: aload 8
    //   371: ldc 220
    //   373: aload_3
    //   374: getfield 224	com/tencent/mm/g/c/cy:field_msgId	J
    //   377: invokevirtual 227	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   380: pop
    //   381: aload 8
    //   383: ldc 229
    //   385: new 231	java/lang/StringBuilder
    //   388: dup
    //   389: ldc 233
    //   391: invokespecial 236	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   394: aload_3
    //   395: getfield 239	com/tencent/mm/g/c/cy:field_msgSvrId	J
    //   398: invokestatic 245	java/lang/Long:toString	(J)Ljava/lang/String;
    //   401: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   407: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   410: pop
    //   411: aload 8
    //   413: ldc 253
    //   415: aload_3
    //   416: getfield 200	com/tencent/mm/g/c/cy:field_talker	Ljava/lang/String;
    //   419: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   422: pop
    //   423: aload_2
    //   424: ldc 255
    //   426: invokevirtual 259	com/tencent/mm/ui/chatting/d/a:aF	(Ljava/lang/Class;)Lcom/tencent/mm/ui/chatting/c/v;
    //   429: checkcast 255	com/tencent/mm/ui/chatting/c/b/d
    //   432: astore 10
    //   434: aload 8
    //   436: ldc_w 261
    //   439: new 231	java/lang/StringBuilder
    //   442: dup
    //   443: ldc 233
    //   445: invokespecial 236	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   448: aload_3
    //   449: getfield 239	com/tencent/mm/g/c/cy:field_msgSvrId	J
    //   452: invokestatic 245	java/lang/Long:toString	(J)Ljava/lang/String;
    //   455: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   458: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   461: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   464: pop
    //   465: aload 8
    //   467: ldc_w 263
    //   470: aload_3
    //   471: aload_1
    //   472: getfield 267	com/tencent/mm/ui/chatting/viewitems/ay:yFW	Z
    //   475: aload 10
    //   477: invokeinterface 270 1 0
    //   482: invokestatic 275	com/tencent/mm/ui/chatting/viewitems/c:a	(Lcom/tencent/mm/storage/bi;ZZ)Ljava/lang/String;
    //   485: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   488: pop
    //   489: aload 8
    //   491: ldc_w 277
    //   494: aload_2
    //   495: invokevirtual 77	com/tencent/mm/ui/chatting/d/a:getTalkerUserName	()Ljava/lang/String;
    //   498: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   501: pop
    //   502: aload 8
    //   504: ldc_w 279
    //   507: aload_1
    //   508: getfield 283	com/tencent/mm/ui/chatting/viewitems/ay:uno	I
    //   511: invokevirtual 286	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   514: pop
    //   515: aload_1
    //   516: getfield 290	com/tencent/mm/ui/chatting/viewitems/ay:ziy	Landroid/os/Bundle;
    //   519: astore 10
    //   521: iload 4
    //   523: istore 11
    //   525: aload 10
    //   527: ifnull +15 -> 542
    //   530: aload 8
    //   532: aload 10
    //   534: invokevirtual 294	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   537: pop
    //   538: iload 4
    //   540: istore 11
    //   542: aload 9
    //   544: ldc_w 296
    //   547: iload 11
    //   549: invokevirtual 300	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   552: aload 8
    //   554: ldc_w 302
    //   557: aload 9
    //   559: invokevirtual 305	android/content/Intent:putExtra	(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //   562: pop
    //   563: aload 8
    //   565: ldc_w 307
    //   568: aload_2
    //   569: invokevirtual 77	com/tencent/mm/ui/chatting/d/a:getTalkerUserName	()Ljava/lang/String;
    //   572: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   575: pop
    //   576: aload_1
    //   577: getfield 172	com/tencent/mm/ui/chatting/viewitems/ay:cMg	Ljava/lang/String;
    //   580: invokestatic 165	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   583: ifne +39 -> 622
    //   586: aload 8
    //   588: ldc_w 309
    //   591: aload_1
    //   592: getfield 172	com/tencent/mm/ui/chatting/viewitems/ay:cMg	Ljava/lang/String;
    //   595: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   598: pop
    //   599: aload 8
    //   601: ldc_w 311
    //   604: aload_1
    //   605: getfield 314	com/tencent/mm/ui/chatting/viewitems/ay:cMh	Ljava/lang/String;
    //   608: invokevirtual 124	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   611: pop
    //   612: aload 8
    //   614: ldc_w 316
    //   617: iconst_1
    //   618: invokevirtual 286	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   621: pop
    //   622: aload 8
    //   624: ldc_w 318
    //   627: aload_1
    //   628: getfield 321	com/tencent/mm/ui/chatting/viewitems/ay:unn	J
    //   631: invokevirtual 227	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   634: pop
    //   635: aload 8
    //   637: ldc_w 323
    //   640: aload_1
    //   641: getfield 283	com/tencent/mm/ui/chatting/viewitems/ay:uno	I
    //   644: invokevirtual 286	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   647: pop
    //   648: aload 8
    //   650: ldc_w 325
    //   653: iconst_1
    //   654: invokevirtual 286	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   657: pop
    //   658: aload 8
    //   660: ldc_w 327
    //   663: lload 5
    //   665: invokevirtual 227	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   668: pop
    //   669: aload 8
    //   671: getstatic 332	com/tencent/mm/ui/e$m:ygo	Ljava/lang/String;
    //   674: aload_1
    //   675: getfield 335	com/tencent/mm/ui/chatting/viewitems/ay:ziA	I
    //   678: invokevirtual 286	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   681: pop
    //   682: aload 8
    //   684: ldc_w 336
    //   687: invokevirtual 340	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   690: pop
    //   691: aload_2
    //   692: getfield 67	com/tencent/mm/ui/chatting/d/a:yTx	Lcom/tencent/mm/ui/chatting/BaseChattingUIFragment;
    //   695: invokevirtual 73	com/tencent/mm/ui/chatting/BaseChattingUIFragment:getContext	()Landroid/app/Activity;
    //   698: invokevirtual 346	android/app/Activity:getIntent	()Landroid/content/Intent;
    //   701: ldc 101
    //   703: sipush 10000
    //   706: invokevirtual 347	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   709: istore 11
    //   711: ldc_w 349
    //   714: invokestatic 355	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   717: checkcast 349	com/tencent/mm/plugin/brandservice/a/b
    //   720: iconst_2
    //   721: invokeinterface 359 2 0
    //   726: ifeq +170 -> 896
    //   729: ldc_w 349
    //   732: invokestatic 355	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   735: checkcast 349	com/tencent/mm/plugin/brandservice/a/b
    //   738: aload_2
    //   739: getfield 67	com/tencent/mm/ui/chatting/d/a:yTx	Lcom/tencent/mm/ui/chatting/BaseChattingUIFragment;
    //   742: invokevirtual 73	com/tencent/mm/ui/chatting/BaseChattingUIFragment:getContext	()Landroid/app/Activity;
    //   745: aload_1
    //   746: getfield 88	com/tencent/mm/ui/chatting/viewitems/ay:userName	Ljava/lang/String;
    //   749: aload_1
    //   750: getfield 335	com/tencent/mm/ui/chatting/viewitems/ay:ziA	I
    //   753: iconst_0
    //   754: iload 11
    //   756: aload 8
    //   758: invokeinterface 362 7 0
    //   763: ifeq +133 -> 896
    //   766: ldc 42
    //   768: ldc_w 364
    //   771: invokestatic 367	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   774: aload_2
    //   775: invokevirtual 77	com/tencent/mm/ui/chatting/d/a:getTalkerUserName	()Ljava/lang/String;
    //   778: invokestatic 165	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   781: ifne +43 -> 824
    //   784: invokestatic 191	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   787: pop
    //   788: invokestatic 197	com/tencent/mm/model/c:XM	()Lcom/tencent/mm/storage/bd;
    //   791: aload_2
    //   792: invokevirtual 77	com/tencent/mm/ui/chatting/d/a:getTalkerUserName	()Ljava/lang/String;
    //   795: invokeinterface 206 2 0
    //   800: getfield 370	com/tencent/mm/g/c/ap:duk	I
    //   803: iconst_1
    //   804: if_icmpne +20 -> 824
    //   807: invokestatic 191	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   810: pop
    //   811: invokestatic 374	com/tencent/mm/model/c:XR	()Lcom/tencent/mm/storage/be;
    //   814: aload_2
    //   815: invokevirtual 77	com/tencent/mm/ui/chatting/d/a:getTalkerUserName	()Ljava/lang/String;
    //   818: invokeinterface 379 2 0
    //   823: pop
    //   824: aload_3
    //   825: ifnull +256 -> 1081
    //   828: aload_3
    //   829: invokevirtual 382	com/tencent/mm/storage/bi:drC	()Z
    //   832: ifeq +249 -> 1081
    //   835: ldc_w 384
    //   838: invokestatic 355	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   841: checkcast 384	com/tencent/mm/plugin/biz/a/a
    //   844: aload_3
    //   845: getfield 224	com/tencent/mm/g/c/cy:field_msgId	J
    //   848: aload_3
    //   849: getfield 142	com/tencent/mm/g/c/cy:field_content	Ljava/lang/String;
    //   852: invokeinterface 388 4 0
    //   857: astore 8
    //   859: aload 8
    //   861: ifnull +26 -> 887
    //   864: aload 8
    //   866: getfield 394	com/tencent/mm/af/o:fjr	Ljava/util/LinkedList;
    //   869: ifnull +18 -> 887
    //   872: aload 8
    //   874: getfield 394	com/tencent/mm/af/o:fjr	Ljava/util/LinkedList;
    //   877: invokevirtual 400	java/util/LinkedList:size	()I
    //   880: aload_1
    //   881: getfield 283	com/tencent/mm/ui/chatting/viewitems/ay:uno	I
    //   884: if_icmpgt +33 -> 917
    //   887: sipush 30734
    //   890: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   893: goto -815 -> 78
    //   896: aload_2
    //   897: getfield 67	com/tencent/mm/ui/chatting/d/a:yTx	Lcom/tencent/mm/ui/chatting/BaseChattingUIFragment;
    //   900: invokevirtual 73	com/tencent/mm/ui/chatting/BaseChattingUIFragment:getContext	()Landroid/app/Activity;
    //   903: ldc_w 402
    //   906: ldc_w 404
    //   909: aload 8
    //   911: invokestatic 409	com/tencent/mm/bp/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   914: goto -140 -> 774
    //   917: iconst_0
    //   918: istore 11
    //   920: aload 8
    //   922: getfield 394	com/tencent/mm/af/o:fjr	Ljava/util/LinkedList;
    //   925: aload_1
    //   926: getfield 283	com/tencent/mm/ui/chatting/viewitems/ay:uno	I
    //   929: invokevirtual 413	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   932: checkcast 415	com/tencent/mm/af/p
    //   935: astore_1
    //   936: aload_1
    //   937: getfield 418	com/tencent/mm/af/p:url	Ljava/lang/String;
    //   940: invokestatic 165	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   943: ifne +207 -> 1150
    //   946: aload_1
    //   947: getfield 418	com/tencent/mm/af/p:url	Ljava/lang/String;
    //   950: invokestatic 424	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   953: astore_1
    //   954: aload_1
    //   955: ldc_w 426
    //   958: invokevirtual 430	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   961: lconst_0
    //   962: invokestatic 434	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   965: lstore 5
    //   967: aload_1
    //   968: ldc_w 436
    //   971: invokevirtual 430	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   974: iconst_0
    //   975: invokestatic 439	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   978: istore 4
    //   980: iload 4
    //   982: istore 11
    //   984: aload_2
    //   985: getfield 67	com/tencent/mm/ui/chatting/d/a:yTx	Lcom/tencent/mm/ui/chatting/BaseChattingUIFragment;
    //   988: ldc_w 441
    //   991: iconst_0
    //   992: invokevirtual 107	com/tencent/mm/ui/MMFragment:getIntExtra	(Ljava/lang/String;I)I
    //   995: istore 12
    //   997: invokestatic 446	com/tencent/mm/storage/s:getSessionId	()I
    //   1000: istore 4
    //   1002: getstatic 181	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1005: sipush 16243
    //   1008: bipush 8
    //   1010: anewarray 46	java/lang/Object
    //   1013: dup
    //   1014: iconst_0
    //   1015: aload_3
    //   1016: getfield 200	com/tencent/mm/g/c/cy:field_talker	Ljava/lang/String;
    //   1019: aastore
    //   1020: dup
    //   1021: iconst_1
    //   1022: lload 5
    //   1024: invokestatic 449	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1027: aastore
    //   1028: dup
    //   1029: iconst_2
    //   1030: iload 11
    //   1032: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1035: aastore
    //   1036: dup
    //   1037: iconst_3
    //   1038: iload 12
    //   1040: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1043: aastore
    //   1044: dup
    //   1045: iconst_4
    //   1046: iload 4
    //   1048: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1051: aastore
    //   1052: dup
    //   1053: iconst_5
    //   1054: iconst_2
    //   1055: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1058: aastore
    //   1059: dup
    //   1060: bipush 6
    //   1062: iload 7
    //   1064: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1067: aastore
    //   1068: dup
    //   1069: bipush 7
    //   1071: invokestatic 452	com/tencent/mm/af/l:Me	()I
    //   1074: invokestatic 52	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1077: aastore
    //   1078: invokevirtual 185	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1081: sipush 30734
    //   1084: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1087: goto -1009 -> 78
    //   1090: astore_1
    //   1091: lconst_0
    //   1092: lstore 5
    //   1094: ldc 42
    //   1096: ldc_w 454
    //   1099: iconst_1
    //   1100: anewarray 46	java/lang/Object
    //   1103: dup
    //   1104: iconst_0
    //   1105: aload_1
    //   1106: invokevirtual 457	java/lang/UnsupportedOperationException:getMessage	()Ljava/lang/String;
    //   1109: aastore
    //   1110: invokestatic 460	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1113: goto -129 -> 984
    //   1116: astore_1
    //   1117: lconst_0
    //   1118: lstore 5
    //   1120: ldc 42
    //   1122: ldc_w 454
    //   1125: iconst_1
    //   1126: anewarray 46	java/lang/Object
    //   1129: dup
    //   1130: iconst_0
    //   1131: aload_1
    //   1132: invokevirtual 461	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1135: aastore
    //   1136: invokestatic 460	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1139: goto -155 -> 984
    //   1142: astore_1
    //   1143: goto -23 -> 1120
    //   1146: astore_1
    //   1147: goto -53 -> 1094
    //   1150: lconst_0
    //   1151: lstore 5
    //   1153: goto -169 -> 984
    //   1156: iconst_0
    //   1157: istore 11
    //   1159: goto -617 -> 542
    //
    // Exception table:
    //   from	to	target	type
    //   946	967	1090	java/lang/UnsupportedOperationException
    //   946	967	1116	java/lang/Exception
    //   967	980	1142	java/lang/Exception
    //   967	980	1146	java/lang/UnsupportedOperationException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.p
 * JD-Core Version:    0.6.2
 */