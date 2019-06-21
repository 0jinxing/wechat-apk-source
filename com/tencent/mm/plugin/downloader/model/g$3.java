package com.tencent.mm.plugin.downloader.model;

final class g$3
  implements Runnable
{
  g$3(g paramg)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 2454
    //   3: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 14	com/tencent/mm/plugin/downloader/model/g$3:kNy	Lcom/tencent/mm/plugin/downloader/model/g;
    //   10: getfield 31	com/tencent/mm/plugin/downloader/model/g:kNw	Ljava/util/concurrent/CopyOnWriteArraySet;
    //   13: invokevirtual 37	java/util/concurrent/CopyOnWriteArraySet:iterator	()Ljava/util/Iterator;
    //   16: astore_1
    //   17: aload_1
    //   18: invokeinterface 43 1 0
    //   23: ifeq +678 -> 701
    //   26: aload_1
    //   27: invokeinterface 47 1 0
    //   32: checkcast 49	java/lang/Long
    //   35: invokevirtual 53	java/lang/Long:longValue	()J
    //   38: lstore_2
    //   39: aload_0
    //   40: getfield 14	com/tencent/mm/plugin/downloader/model/g$3:kNy	Lcom/tencent/mm/plugin/downloader/model/g;
    //   43: astore 4
    //   45: lload_2
    //   46: invokestatic 57	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   49: astore 5
    //   51: ldc 59
    //   53: ldc 61
    //   55: invokestatic 67	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: aload 5
    //   60: invokevirtual 53	java/lang/Long:longValue	()J
    //   63: invokestatic 73	com/tencent/mm/plugin/downloader/model/c:hv	(J)Lcom/tencent/mm/plugin/downloader/f/a;
    //   66: astore 6
    //   68: aload 6
    //   70: ifnull -53 -> 17
    //   73: new 75	android/app/DownloadManager$Query
    //   76: astore 7
    //   78: aload 7
    //   80: invokespecial 76	android/app/DownloadManager$Query:<init>	()V
    //   83: aload 7
    //   85: iconst_1
    //   86: newarray long
    //   88: dup
    //   89: iconst_0
    //   90: aload 6
    //   92: getfield 82	com/tencent/mm/plugin/downloader/f/a:field_sysDownloadId	J
    //   95: lastore
    //   96: invokevirtual 86	android/app/DownloadManager$Query:setFilterById	([J)Landroid/app/DownloadManager$Query;
    //   99: pop
    //   100: aload 4
    //   102: getfield 90	com/tencent/mm/plugin/downloader/model/g:kNv	Landroid/app/DownloadManager;
    //   105: aload 7
    //   107: invokevirtual 96	android/app/DownloadManager:query	(Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;
    //   110: astore 7
    //   112: aload 7
    //   114: ifnonnull +107 -> 221
    //   117: ldc 59
    //   119: ldc 98
    //   121: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   124: aload 4
    //   126: getfield 31	com/tencent/mm/plugin/downloader/model/g:kNw	Ljava/util/concurrent/CopyOnWriteArraySet;
    //   129: aload 5
    //   131: invokevirtual 105	java/util/concurrent/CopyOnWriteArraySet:remove	(Ljava/lang/Object;)Z
    //   134: pop
    //   135: aload 6
    //   137: iconst_4
    //   138: putfield 109	com/tencent/mm/plugin/downloader/f/a:field_status	I
    //   141: aload 6
    //   143: invokestatic 112	com/tencent/mm/plugin/downloader/model/c:e	(Lcom/tencent/mm/plugin/downloader/f/a;)J
    //   146: pop2
    //   147: goto -130 -> 17
    //   150: astore 5
    //   152: ldc 59
    //   154: aload 5
    //   156: invokevirtual 116	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   159: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   162: sipush 2454
    //   165: invokestatic 119	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: return
    //   169: astore 7
    //   171: ldc 59
    //   173: ldc 121
    //   175: iconst_2
    //   176: anewarray 4	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload 7
    //   183: invokevirtual 124	java/lang/Exception:toString	()Ljava/lang/String;
    //   186: aastore
    //   187: dup
    //   188: iconst_1
    //   189: aload 5
    //   191: aastore
    //   192: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   195: aload 4
    //   197: getfield 31	com/tencent/mm/plugin/downloader/model/g:kNw	Ljava/util/concurrent/CopyOnWriteArraySet;
    //   200: aload 5
    //   202: invokevirtual 105	java/util/concurrent/CopyOnWriteArraySet:remove	(Ljava/lang/Object;)Z
    //   205: pop
    //   206: aload 6
    //   208: iconst_4
    //   209: putfield 109	com/tencent/mm/plugin/downloader/f/a:field_status	I
    //   212: aload 6
    //   214: invokestatic 112	com/tencent/mm/plugin/downloader/model/c:e	(Lcom/tencent/mm/plugin/downloader/f/a;)J
    //   217: pop2
    //   218: goto -201 -> 17
    //   221: aload 7
    //   223: invokeinterface 132 1 0
    //   228: ifeq +136 -> 364
    //   231: aload 7
    //   233: ldc 134
    //   235: invokeinterface 138 2 0
    //   240: istore 8
    //   242: aload 7
    //   244: ldc 140
    //   246: invokeinterface 138 2 0
    //   251: istore 9
    //   253: aload 7
    //   255: ldc 142
    //   257: invokeinterface 138 2 0
    //   262: istore 10
    //   264: aload 7
    //   266: ldc 144
    //   268: invokeinterface 138 2 0
    //   273: istore 11
    //   275: iload 8
    //   277: iconst_m1
    //   278: if_icmpeq +86 -> 364
    //   281: aload 7
    //   283: iload 8
    //   285: invokeinterface 148 2 0
    //   290: istore 8
    //   292: ldc 59
    //   294: ldc 150
    //   296: iconst_1
    //   297: anewarray 4	java/lang/Object
    //   300: dup
    //   301: iconst_0
    //   302: iload 8
    //   304: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   307: aastore
    //   308: invokestatic 157	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: iload 8
    //   313: lookupswitch	default:+51->364, 1:+61->374, 2:+61->374, 4:+223->536, 8:+262->575, 16:+176->489
    //   365: iconst_4
    //   366: invokeinterface 160 1 0
    //   371: goto -354 -> 17
    //   374: iload 10
    //   376: iconst_m1
    //   377: if_icmpeq +17 -> 394
    //   380: aload 6
    //   382: aload 7
    //   384: iload 10
    //   386: invokeinterface 164 2 0
    //   391: putfield 167	com/tencent/mm/plugin/downloader/f/a:field_downloadedSize	J
    //   394: iload 11
    //   396: iconst_m1
    //   397: if_icmpeq +17 -> 414
    //   400: aload 6
    //   402: aload 7
    //   404: iload 11
    //   406: invokeinterface 164 2 0
    //   411: putfield 170	com/tencent/mm/plugin/downloader/f/a:field_totalSize	J
    //   414: aload 6
    //   416: iconst_1
    //   417: putfield 109	com/tencent/mm/plugin/downloader/f/a:field_status	I
    //   420: aload 6
    //   422: invokestatic 112	com/tencent/mm/plugin/downloader/model/c:e	(Lcom/tencent/mm/plugin/downloader/f/a;)J
    //   425: pop2
    //   426: aload 4
    //   428: getfield 174	com/tencent/mm/plugin/downloader/model/g:kMT	Lcom/tencent/mm/plugin/downloader/model/b;
    //   431: aload 5
    //   433: invokevirtual 53	java/lang/Long:longValue	()J
    //   436: invokevirtual 180	com/tencent/mm/plugin/downloader/model/b:ht	(J)V
    //   439: goto -75 -> 364
    //   442: astore 12
    //   444: aload 4
    //   446: getfield 31	com/tencent/mm/plugin/downloader/model/g:kNw	Ljava/util/concurrent/CopyOnWriteArraySet;
    //   449: aload 5
    //   451: invokevirtual 105	java/util/concurrent/CopyOnWriteArraySet:remove	(Ljava/lang/Object;)Z
    //   454: pop
    //   455: aload 6
    //   457: iconst_4
    //   458: putfield 109	com/tencent/mm/plugin/downloader/f/a:field_status	I
    //   461: aload 6
    //   463: invokestatic 112	com/tencent/mm/plugin/downloader/model/c:e	(Lcom/tencent/mm/plugin/downloader/f/a;)J
    //   466: pop2
    //   467: ldc 59
    //   469: ldc 182
    //   471: iconst_1
    //   472: anewarray 4	java/lang/Object
    //   475: dup
    //   476: iconst_0
    //   477: aload 12
    //   479: invokevirtual 124	java/lang/Exception:toString	()Ljava/lang/String;
    //   482: aastore
    //   483: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   486: goto -122 -> 364
    //   489: aload 4
    //   491: getfield 31	com/tencent/mm/plugin/downloader/model/g:kNw	Ljava/util/concurrent/CopyOnWriteArraySet;
    //   494: aload 5
    //   496: invokevirtual 105	java/util/concurrent/CopyOnWriteArraySet:remove	(Ljava/lang/Object;)Z
    //   499: pop
    //   500: getstatic 187	com/tencent/mm/plugin/downloader/a/a:kKb	I
    //   503: istore 9
    //   505: aload 6
    //   507: iconst_4
    //   508: putfield 109	com/tencent/mm/plugin/downloader/f/a:field_status	I
    //   511: aload 6
    //   513: invokestatic 112	com/tencent/mm/plugin/downloader/model/c:e	(Lcom/tencent/mm/plugin/downloader/f/a;)J
    //   516: pop2
    //   517: aload 4
    //   519: getfield 174	com/tencent/mm/plugin/downloader/model/g:kMT	Lcom/tencent/mm/plugin/downloader/model/b;
    //   522: aload 5
    //   524: invokevirtual 53	java/lang/Long:longValue	()J
    //   527: iload 9
    //   529: iconst_0
    //   530: invokevirtual 190	com/tencent/mm/plugin/downloader/model/b:d	(JIZ)V
    //   533: goto -169 -> 364
    //   536: aload 4
    //   538: getfield 31	com/tencent/mm/plugin/downloader/model/g:kNw	Ljava/util/concurrent/CopyOnWriteArraySet;
    //   541: aload 5
    //   543: invokevirtual 105	java/util/concurrent/CopyOnWriteArraySet:remove	(Ljava/lang/Object;)Z
    //   546: pop
    //   547: aload 6
    //   549: iconst_2
    //   550: putfield 109	com/tencent/mm/plugin/downloader/f/a:field_status	I
    //   553: aload 6
    //   555: invokestatic 112	com/tencent/mm/plugin/downloader/model/c:e	(Lcom/tencent/mm/plugin/downloader/f/a;)J
    //   558: pop2
    //   559: aload 4
    //   561: getfield 174	com/tencent/mm/plugin/downloader/model/g:kMT	Lcom/tencent/mm/plugin/downloader/model/b;
    //   564: aload 5
    //   566: invokevirtual 53	java/lang/Long:longValue	()J
    //   569: invokevirtual 193	com/tencent/mm/plugin/downloader/model/b:hs	(J)V
    //   572: goto -208 -> 364
    //   575: aload 4
    //   577: getfield 31	com/tencent/mm/plugin/downloader/model/g:kNw	Ljava/util/concurrent/CopyOnWriteArraySet;
    //   580: aload 5
    //   582: invokevirtual 105	java/util/concurrent/CopyOnWriteArraySet:remove	(Ljava/lang/Object;)Z
    //   585: pop
    //   586: iload 9
    //   588: iconst_m1
    //   589: if_icmpeq -225 -> 364
    //   592: aload 6
    //   594: getfield 197	com/tencent/mm/plugin/downloader/f/a:field_filePath	Ljava/lang/String;
    //   597: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   600: ifne +14 -> 614
    //   603: aload 6
    //   605: getfield 197	com/tencent/mm/plugin/downloader/f/a:field_filePath	Ljava/lang/String;
    //   608: invokestatic 208	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   611: ifne +37 -> 648
    //   614: ldc 59
    //   616: ldc 210
    //   618: iconst_1
    //   619: anewarray 4	java/lang/Object
    //   622: dup
    //   623: iconst_0
    //   624: aload 6
    //   626: getfield 197	com/tencent/mm/plugin/downloader/f/a:field_filePath	Ljava/lang/String;
    //   629: aastore
    //   630: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   633: aload 6
    //   635: iconst_4
    //   636: putfield 109	com/tencent/mm/plugin/downloader/f/a:field_status	I
    //   639: aload 6
    //   641: invokestatic 112	com/tencent/mm/plugin/downloader/model/c:e	(Lcom/tencent/mm/plugin/downloader/f/a;)J
    //   644: pop2
    //   645: goto -628 -> 17
    //   648: new 212	android/content/Intent
    //   651: astore 12
    //   653: aload 12
    //   655: invokespecial 213	android/content/Intent:<init>	()V
    //   658: aload 12
    //   660: invokestatic 219	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   663: ldc 221
    //   665: invokevirtual 225	android/content/Intent:setClass	(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
    //   668: pop
    //   669: aload 12
    //   671: getstatic 228	com/tencent/mm/plugin/downloader/model/FileDownloadService:EXTRA_ID	Ljava/lang/String;
    //   674: aload 6
    //   676: getfield 231	com/tencent/mm/plugin/downloader/f/a:field_downloadId	J
    //   679: invokevirtual 235	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   682: pop
    //   683: aload 12
    //   685: getstatic 238	com/tencent/mm/plugin/downloader/model/FileDownloadService:kNn	Ljava/lang/String;
    //   688: iconst_1
    //   689: invokevirtual 241	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   692: pop
    //   693: aload 12
    //   695: invokestatic 247	com/tencent/mm/bp/d:aH	(Landroid/content/Intent;)V
    //   698: goto -334 -> 364
    //   701: sipush 2454
    //   704: invokestatic 119	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   707: goto -539 -> 168
    //
    // Exception table:
    //   from	to	target	type
    //   6	17	150	java/lang/Exception
    //   17	68	150	java/lang/Exception
    //   73	100	150	java/lang/Exception
    //   117	147	150	java/lang/Exception
    //   171	218	150	java/lang/Exception
    //   221	275	150	java/lang/Exception
    //   364	371	150	java/lang/Exception
    //   444	486	150	java/lang/Exception
    //   100	112	169	java/lang/Exception
    //   281	311	442	java/lang/Exception
    //   380	394	442	java/lang/Exception
    //   400	414	442	java/lang/Exception
    //   414	439	442	java/lang/Exception
    //   489	533	442	java/lang/Exception
    //   536	572	442	java/lang/Exception
    //   575	586	442	java/lang/Exception
    //   592	614	442	java/lang/Exception
    //   614	645	442	java/lang/Exception
    //   648	698	442	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.g.3
 * JD-Core Version:    0.6.2
 */