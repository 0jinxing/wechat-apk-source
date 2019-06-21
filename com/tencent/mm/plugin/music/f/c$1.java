package com.tencent.mm.plugin.music.f;

final class c$1
  implements Runnable
{
  c$1(c paramc)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 22
    //   2: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 30
    //   7: ldc 32
    //   9: invokestatic 37	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   12: bipush 237
    //   14: invokestatic 42	android/os/Process:setThreadPriority	(I)V
    //   17: aload_0
    //   18: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   21: getfield 46	com/tencent/mm/plugin/music/f/c:clO	Ljava/lang/String;
    //   24: invokestatic 52	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   27: ifeq +24 -> 51
    //   30: ldc 30
    //   32: ldc 54
    //   34: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   37: aload_0
    //   38: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   41: iconst_0
    //   42: invokevirtual 61	com/tencent/mm/plugin/music/f/c:jy	(Z)V
    //   45: ldc 22
    //   47: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: return
    //   51: aload_0
    //   52: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   55: new 66	android/media/MediaExtractor
    //   58: dup
    //   59: invokespecial 67	android/media/MediaExtractor:<init>	()V
    //   62: putfield 71	com/tencent/mm/plugin/music/f/c:clX	Landroid/media/MediaExtractor;
    //   65: aload_0
    //   66: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   69: getfield 71	com/tencent/mm/plugin/music/f/c:clX	Landroid/media/MediaExtractor;
    //   72: aload_0
    //   73: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   76: getfield 46	com/tencent/mm/plugin/music/f/c:clO	Ljava/lang/String;
    //   79: invokevirtual 75	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   82: aconst_null
    //   83: astore_1
    //   84: aconst_null
    //   85: astore_2
    //   86: aload_1
    //   87: astore_3
    //   88: aload_0
    //   89: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   92: getfield 71	com/tencent/mm/plugin/music/f/c:clX	Landroid/media/MediaExtractor;
    //   95: invokevirtual 79	android/media/MediaExtractor:getTrackCount	()I
    //   98: istore 4
    //   100: aload_1
    //   101: astore_3
    //   102: ldc 30
    //   104: ldc 81
    //   106: iconst_1
    //   107: anewarray 4	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: iload 4
    //   114: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   117: aastore
    //   118: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: iconst_0
    //   122: istore 5
    //   124: aload_2
    //   125: astore 6
    //   127: iload 5
    //   129: iload 4
    //   131: if_icmpge +67 -> 198
    //   134: aload_1
    //   135: astore_3
    //   136: aload_0
    //   137: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   140: getfield 71	com/tencent/mm/plugin/music/f/c:clX	Landroid/media/MediaExtractor;
    //   143: iload 5
    //   145: invokevirtual 94	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   148: astore 6
    //   150: aload_1
    //   151: astore_3
    //   152: aload_0
    //   153: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   156: aload 6
    //   158: ldc 96
    //   160: invokevirtual 102	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   163: putfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   166: aload_1
    //   167: astore_3
    //   168: aload_0
    //   169: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   172: getfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   175: invokestatic 52	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   178: ifne +118 -> 296
    //   181: aload_1
    //   182: astore_3
    //   183: aload_0
    //   184: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   187: getfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   190: ldc 107
    //   192: invokevirtual 112	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   195: ifeq +101 -> 296
    //   198: aload 6
    //   200: ifnonnull +102 -> 302
    //   203: aload 6
    //   205: astore_3
    //   206: ldc 30
    //   208: ldc 114
    //   210: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   213: aload 6
    //   215: astore_3
    //   216: aload_0
    //   217: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   220: sipush 703
    //   223: putfield 118	com/tencent/mm/plugin/music/f/c:clN	I
    //   226: aload 6
    //   228: astore_3
    //   229: aload_0
    //   230: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   233: iconst_1
    //   234: invokevirtual 61	com/tencent/mm/plugin/music/f/c:jy	(Z)V
    //   237: aload 6
    //   239: astore_3
    //   240: aload_0
    //   241: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   244: invokestatic 121	com/tencent/mm/plugin/music/f/c:a	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   247: ldc 22
    //   249: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: goto -202 -> 50
    //   255: astore 6
    //   257: ldc 30
    //   259: aload 6
    //   261: ldc 123
    //   263: iconst_0
    //   264: anewarray 4	java/lang/Object
    //   267: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: aload_0
    //   271: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   274: sipush 702
    //   277: putfield 118	com/tencent/mm/plugin/music/f/c:clN	I
    //   280: aload_0
    //   281: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   284: iconst_1
    //   285: invokevirtual 61	com/tencent/mm/plugin/music/f/c:jy	(Z)V
    //   288: ldc 22
    //   290: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   293: goto -243 -> 50
    //   296: iinc 5 1
    //   299: goto -175 -> 124
    //   302: aload 6
    //   304: astore_3
    //   305: ldc 30
    //   307: ldc 129
    //   309: iconst_1
    //   310: anewarray 4	java/lang/Object
    //   313: dup
    //   314: iconst_0
    //   315: aload 6
    //   317: aastore
    //   318: invokestatic 131	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   321: aload 6
    //   323: astore_3
    //   324: aload_0
    //   325: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   328: aload 6
    //   330: ldc 133
    //   332: invokevirtual 137	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   335: putfield 140	com/tencent/mm/plugin/music/f/c:sampleRate	I
    //   338: aload 6
    //   340: astore_3
    //   341: aload_0
    //   342: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   345: aload 6
    //   347: ldc 142
    //   349: invokevirtual 137	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   352: putfield 145	com/tencent/mm/plugin/music/f/c:channels	I
    //   355: aload 6
    //   357: astore_3
    //   358: aload_0
    //   359: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   362: aload 6
    //   364: ldc 147
    //   366: invokevirtual 151	android/media/MediaFormat:getLong	(Ljava/lang/String;)J
    //   369: putfield 155	com/tencent/mm/plugin/music/f/c:duration	J
    //   372: bipush 21
    //   374: invokestatic 161	com/tencent/mm/compatible/util/d:iW	(I)Z
    //   377: ifeq +31 -> 408
    //   380: new 163	android/media/MediaCodecList
    //   383: astore_3
    //   384: aload_3
    //   385: iconst_1
    //   386: invokespecial 165	android/media/MediaCodecList:<init>	(I)V
    //   389: aload_3
    //   390: aload 6
    //   392: invokevirtual 169	android/media/MediaCodecList:findDecoderForFormat	(Landroid/media/MediaFormat;)Ljava/lang/String;
    //   395: astore_3
    //   396: aload_3
    //   397: ifnull +11 -> 408
    //   400: aload_0
    //   401: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   404: aload_3
    //   405: putfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   408: aload_0
    //   409: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   412: aload_0
    //   413: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   416: getfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   419: invokestatic 175	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   422: putfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   425: aload_0
    //   426: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   429: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   432: aload 6
    //   434: aconst_null
    //   435: aconst_null
    //   436: iconst_0
    //   437: invokevirtual 183	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   440: aload_0
    //   441: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   444: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   447: invokevirtual 186	android/media/MediaCodec:start	()V
    //   450: aload_0
    //   451: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   454: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   457: invokevirtual 190	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   460: astore_2
    //   461: aload_0
    //   462: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   465: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   468: invokevirtual 193	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   471: astore_3
    //   472: ldc 30
    //   474: ldc 195
    //   476: iconst_5
    //   477: anewarray 4	java/lang/Object
    //   480: dup
    //   481: iconst_0
    //   482: aload 6
    //   484: aastore
    //   485: dup
    //   486: iconst_1
    //   487: aload_0
    //   488: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   491: getfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   494: aastore
    //   495: dup
    //   496: iconst_2
    //   497: aload_0
    //   498: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   501: getfield 140	com/tencent/mm/plugin/music/f/c:sampleRate	I
    //   504: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   507: aastore
    //   508: dup
    //   509: iconst_3
    //   510: aload_0
    //   511: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   514: getfield 145	com/tencent/mm/plugin/music/f/c:channels	I
    //   517: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   520: aastore
    //   521: dup
    //   522: iconst_4
    //   523: aload_0
    //   524: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   527: getfield 155	com/tencent/mm/plugin/music/f/c:duration	J
    //   530: invokestatic 200	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   533: aastore
    //   534: invokestatic 131	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   537: aload_0
    //   538: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   541: getfield 71	com/tencent/mm/plugin/music/f/c:clX	Landroid/media/MediaExtractor;
    //   544: iconst_0
    //   545: invokevirtual 203	android/media/MediaExtractor:selectTrack	(I)V
    //   548: new 205	android/media/MediaCodec$BufferInfo
    //   551: dup
    //   552: invokespecial 206	android/media/MediaCodec$BufferInfo:<init>	()V
    //   555: astore_1
    //   556: iconst_0
    //   557: istore 4
    //   559: iconst_0
    //   560: istore 5
    //   562: iconst_0
    //   563: istore 7
    //   565: aload_0
    //   566: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   569: getfield 210	com/tencent/mm/plugin/music/f/c:oNR	Lcom/tencent/mm/plugin/music/f/a/g;
    //   572: iconst_3
    //   573: putfield 215	com/tencent/mm/plugin/music/f/a/g:oNV	I
    //   576: aload_0
    //   577: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   580: invokevirtual 218	com/tencent/mm/plugin/music/f/c:onStart	()V
    //   583: aload_3
    //   584: astore 6
    //   586: iload 5
    //   588: ifne +927 -> 1515
    //   591: iload 7
    //   593: bipush 50
    //   595: if_icmpge +920 -> 1515
    //   598: aload_0
    //   599: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   602: invokevirtual 221	com/tencent/mm/plugin/music/f/c:bUC	()V
    //   605: aload_0
    //   606: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   609: invokevirtual 225	com/tencent/mm/plugin/music/f/c:bUz	()Z
    //   612: ifeq +903 -> 1515
    //   615: iinc 7 1
    //   618: iload 4
    //   620: istore 8
    //   622: iload 4
    //   624: ifne +118 -> 742
    //   627: aload_0
    //   628: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   631: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   634: ldc2_w 226
    //   637: invokevirtual 231	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   640: istore 9
    //   642: iload 9
    //   644: iflt +451 -> 1095
    //   647: aload_2
    //   648: iload 9
    //   650: aaload
    //   651: astore_3
    //   652: aload_0
    //   653: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   656: getfield 71	com/tencent/mm/plugin/music/f/c:clX	Landroid/media/MediaExtractor;
    //   659: aload_3
    //   660: iconst_0
    //   661: invokevirtual 235	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
    //   664: istore 10
    //   666: iload 10
    //   668: ifge +348 -> 1016
    //   671: ldc 30
    //   673: ldc 237
    //   675: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   678: iconst_1
    //   679: istore 4
    //   681: iconst_0
    //   682: istore 8
    //   684: aload_0
    //   685: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   688: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   691: astore_3
    //   692: aload_0
    //   693: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   696: getfield 240	com/tencent/mm/plugin/music/f/c:presentationTimeUs	J
    //   699: lstore 11
    //   701: iload 4
    //   703: ifeq +386 -> 1089
    //   706: iconst_4
    //   707: istore 10
    //   709: aload_3
    //   710: iload 9
    //   712: iconst_0
    //   713: iload 8
    //   715: lload 11
    //   717: iload 10
    //   719: invokevirtual 244	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   722: iload 4
    //   724: ifne +14 -> 738
    //   727: aload_0
    //   728: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   731: getfield 71	com/tencent/mm/plugin/music/f/c:clX	Landroid/media/MediaExtractor;
    //   734: invokevirtual 247	android/media/MediaExtractor:advance	()Z
    //   737: pop
    //   738: iload 4
    //   740: istore 8
    //   742: aload_0
    //   743: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   746: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   749: aload_1
    //   750: ldc2_w 226
    //   753: invokevirtual 251	android/media/MediaCodec:dequeueOutputBuffer	(Landroid/media/MediaCodec$BufferInfo;J)I
    //   756: istore 10
    //   758: iload 10
    //   760: iflt +546 -> 1306
    //   763: aload_1
    //   764: getfield 254	android/media/MediaCodec$BufferInfo:size	I
    //   767: ifle +939 -> 1706
    //   770: iconst_0
    //   771: istore 4
    //   773: aload 6
    //   775: iload 10
    //   777: aaload
    //   778: astore 13
    //   780: aload_1
    //   781: getfield 254	android/media/MediaCodec$BufferInfo:size	I
    //   784: newarray byte
    //   786: astore_3
    //   787: aload 13
    //   789: aload_3
    //   790: invokevirtual 260	java/nio/ByteBuffer:get	([B)Ljava/nio/ByteBuffer;
    //   793: pop
    //   794: aload 13
    //   796: invokevirtual 264	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   799: pop
    //   800: aload_3
    //   801: arraylength
    //   802: ifle +460 -> 1262
    //   805: aload_0
    //   806: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   809: getfield 268	com/tencent/mm/plugin/music/f/c:aQf	Landroid/media/AudioTrack;
    //   812: ifnonnull +435 -> 1247
    //   815: aload_0
    //   816: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   819: invokevirtual 271	com/tencent/mm/plugin/music/f/c:createAudioTrack	()Z
    //   822: ifne +415 -> 1237
    //   825: ldc 30
    //   827: ldc_w 273
    //   830: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   833: aload_0
    //   834: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   837: sipush 707
    //   840: putfield 118	com/tencent/mm/plugin/music/f/c:clN	I
    //   843: aload_0
    //   844: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   847: iconst_1
    //   848: invokevirtual 61	com/tencent/mm/plugin/music/f/c:jy	(Z)V
    //   851: aload_0
    //   852: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   855: invokestatic 121	com/tencent/mm/plugin/music/f/c:a	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   858: aload_0
    //   859: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   862: invokestatic 276	com/tencent/mm/plugin/music/f/c:b	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   865: aload_0
    //   866: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   869: invokestatic 279	com/tencent/mm/plugin/music/f/c:c	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   872: aload_0
    //   873: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   876: aconst_null
    //   877: putfield 46	com/tencent/mm/plugin/music/f/c:clO	Ljava/lang/String;
    //   880: aload_0
    //   881: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   884: aconst_null
    //   885: putfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   888: aload_0
    //   889: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   892: iconst_0
    //   893: putfield 140	com/tencent/mm/plugin/music/f/c:sampleRate	I
    //   896: aload_0
    //   897: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   900: iconst_0
    //   901: putfield 145	com/tencent/mm/plugin/music/f/c:channels	I
    //   904: aload_0
    //   905: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   908: lconst_0
    //   909: putfield 240	com/tencent/mm/plugin/music/f/c:presentationTimeUs	J
    //   912: aload_0
    //   913: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   916: lconst_0
    //   917: putfield 155	com/tencent/mm/plugin/music/f/c:duration	J
    //   920: ldc 22
    //   922: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   925: goto -875 -> 50
    //   928: astore 6
    //   930: ldc 30
    //   932: aload 6
    //   934: ldc_w 281
    //   937: iconst_0
    //   938: anewarray 4	java/lang/Object
    //   941: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   944: aload_0
    //   945: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   948: sipush 705
    //   951: putfield 118	com/tencent/mm/plugin/music/f/c:clN	I
    //   954: aload_3
    //   955: astore 6
    //   957: goto -585 -> 372
    //   960: astore 6
    //   962: ldc 30
    //   964: aload 6
    //   966: ldc_w 282
    //   969: iconst_0
    //   970: anewarray 4	java/lang/Object
    //   973: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   976: aload_0
    //   977: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   980: sipush 704
    //   983: putfield 118	com/tencent/mm/plugin/music/f/c:clN	I
    //   986: aload_0
    //   987: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   990: iconst_1
    //   991: invokevirtual 61	com/tencent/mm/plugin/music/f/c:jy	(Z)V
    //   994: aload_0
    //   995: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   998: invokestatic 121	com/tencent/mm/plugin/music/f/c:a	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1001: aload_0
    //   1002: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1005: invokestatic 276	com/tencent/mm/plugin/music/f/c:b	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1008: ldc 22
    //   1010: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1013: goto -963 -> 50
    //   1016: aload_0
    //   1017: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1020: aload_0
    //   1021: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1024: getfield 71	com/tencent/mm/plugin/music/f/c:clX	Landroid/media/MediaExtractor;
    //   1027: invokevirtual 286	android/media/MediaExtractor:getSampleTime	()J
    //   1030: putfield 240	com/tencent/mm/plugin/music/f/c:presentationTimeUs	J
    //   1033: aload_0
    //   1034: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1037: getfield 155	com/tencent/mm/plugin/music/f/c:duration	J
    //   1040: lconst_0
    //   1041: lcmp
    //   1042: ifne +22 -> 1064
    //   1045: iconst_0
    //   1046: istore 8
    //   1048: aload_0
    //   1049: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1052: iload 8
    //   1054: invokevirtual 289	com/tencent/mm/plugin/music/f/c:zR	(I)V
    //   1057: iload 10
    //   1059: istore 8
    //   1061: goto -377 -> 684
    //   1064: ldc2_w 290
    //   1067: aload_0
    //   1068: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1071: getfield 240	com/tencent/mm/plugin/music/f/c:presentationTimeUs	J
    //   1074: lmul
    //   1075: aload_0
    //   1076: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1079: getfield 155	com/tencent/mm/plugin/music/f/c:duration	J
    //   1082: ldiv
    //   1083: l2i
    //   1084: istore 8
    //   1086: goto -38 -> 1048
    //   1089: iconst_0
    //   1090: istore 10
    //   1092: goto -383 -> 709
    //   1095: ldc 30
    //   1097: ldc_w 293
    //   1100: iload 9
    //   1102: invokestatic 296	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1105: invokevirtual 299	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1108: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1111: iload 4
    //   1113: istore 8
    //   1115: goto -373 -> 742
    //   1118: astore 6
    //   1120: ldc 30
    //   1122: aload 6
    //   1124: ldc_w 301
    //   1127: iconst_0
    //   1128: anewarray 4	java/lang/Object
    //   1131: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1134: aload_0
    //   1135: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1138: sipush 706
    //   1141: putfield 118	com/tencent/mm/plugin/music/f/c:clN	I
    //   1144: aload_0
    //   1145: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1148: iconst_1
    //   1149: invokevirtual 61	com/tencent/mm/plugin/music/f/c:jy	(Z)V
    //   1152: aload_0
    //   1153: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1156: invokestatic 121	com/tencent/mm/plugin/music/f/c:a	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1159: aload_0
    //   1160: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1163: invokestatic 276	com/tencent/mm/plugin/music/f/c:b	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1166: aload_0
    //   1167: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1170: invokestatic 279	com/tencent/mm/plugin/music/f/c:c	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1173: aload_0
    //   1174: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1177: aconst_null
    //   1178: putfield 46	com/tencent/mm/plugin/music/f/c:clO	Ljava/lang/String;
    //   1181: aload_0
    //   1182: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1185: aconst_null
    //   1186: putfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   1189: aload_0
    //   1190: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1193: iconst_0
    //   1194: putfield 140	com/tencent/mm/plugin/music/f/c:sampleRate	I
    //   1197: aload_0
    //   1198: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1201: iconst_0
    //   1202: putfield 145	com/tencent/mm/plugin/music/f/c:channels	I
    //   1205: aload_0
    //   1206: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1209: lconst_0
    //   1210: putfield 240	com/tencent/mm/plugin/music/f/c:presentationTimeUs	J
    //   1213: aload_0
    //   1214: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1217: lconst_0
    //   1218: putfield 155	com/tencent/mm/plugin/music/f/c:duration	J
    //   1221: ldc 30
    //   1223: ldc_w 303
    //   1226: invokestatic 37	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1229: ldc 22
    //   1231: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1234: goto -1184 -> 50
    //   1237: aload_0
    //   1238: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1241: getfield 268	com/tencent/mm/plugin/music/f/c:aQf	Landroid/media/AudioTrack;
    //   1244: invokevirtual 308	android/media/AudioTrack:play	()V
    //   1247: aload_0
    //   1248: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1251: getfield 268	com/tencent/mm/plugin/music/f/c:aQf	Landroid/media/AudioTrack;
    //   1254: aload_3
    //   1255: iconst_0
    //   1256: aload_3
    //   1257: arraylength
    //   1258: invokevirtual 312	android/media/AudioTrack:write	([BII)I
    //   1261: pop
    //   1262: aload_0
    //   1263: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1266: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   1269: iload 10
    //   1271: iconst_0
    //   1272: invokevirtual 316	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   1275: aload_1
    //   1276: getfield 319	android/media/MediaCodec$BufferInfo:flags	I
    //   1279: iconst_4
    //   1280: iand
    //   1281: ifeq +422 -> 1703
    //   1284: ldc 30
    //   1286: ldc_w 321
    //   1289: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1292: iconst_1
    //   1293: istore 5
    //   1295: iload 4
    //   1297: istore 7
    //   1299: iload 8
    //   1301: istore 4
    //   1303: goto -717 -> 586
    //   1306: iload 10
    //   1308: bipush 253
    //   1310: if_icmpne +30 -> 1340
    //   1313: aload_0
    //   1314: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1317: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   1320: invokevirtual 193	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   1323: astore 6
    //   1325: ldc 30
    //   1327: ldc_w 323
    //   1330: invokestatic 37	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1333: iload 8
    //   1335: istore 4
    //   1337: goto -751 -> 586
    //   1340: iload 10
    //   1342: bipush 254
    //   1344: if_icmpne +148 -> 1492
    //   1347: aload_0
    //   1348: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1351: getfield 179	com/tencent/mm/plugin/music/f/c:bek	Landroid/media/MediaCodec;
    //   1354: invokevirtual 327	android/media/MediaCodec:getOutputFormat	()Landroid/media/MediaFormat;
    //   1357: astore_3
    //   1358: ldc 30
    //   1360: ldc_w 329
    //   1363: aload_3
    //   1364: invokestatic 332	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1367: invokevirtual 299	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1370: invokestatic 37	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1373: aload_0
    //   1374: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1377: aload_3
    //   1378: ldc 133
    //   1380: invokevirtual 137	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   1383: putfield 140	com/tencent/mm/plugin/music/f/c:sampleRate	I
    //   1386: aload_0
    //   1387: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1390: aload_3
    //   1391: ldc 142
    //   1393: invokevirtual 137	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   1396: putfield 145	com/tencent/mm/plugin/music/f/c:channels	I
    //   1399: aload_0
    //   1400: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1403: invokestatic 279	com/tencent/mm/plugin/music/f/c:c	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1406: iload 8
    //   1408: istore 4
    //   1410: goto -824 -> 586
    //   1413: astore 6
    //   1415: aload_0
    //   1416: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1419: invokestatic 121	com/tencent/mm/plugin/music/f/c:a	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1422: aload_0
    //   1423: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1426: invokestatic 276	com/tencent/mm/plugin/music/f/c:b	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1429: aload_0
    //   1430: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1433: invokestatic 279	com/tencent/mm/plugin/music/f/c:c	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1436: aload_0
    //   1437: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1440: aconst_null
    //   1441: putfield 46	com/tencent/mm/plugin/music/f/c:clO	Ljava/lang/String;
    //   1444: aload_0
    //   1445: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1448: aconst_null
    //   1449: putfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   1452: aload_0
    //   1453: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1456: iconst_0
    //   1457: putfield 140	com/tencent/mm/plugin/music/f/c:sampleRate	I
    //   1460: aload_0
    //   1461: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1464: iconst_0
    //   1465: putfield 145	com/tencent/mm/plugin/music/f/c:channels	I
    //   1468: aload_0
    //   1469: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1472: lconst_0
    //   1473: putfield 240	com/tencent/mm/plugin/music/f/c:presentationTimeUs	J
    //   1476: aload_0
    //   1477: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1480: lconst_0
    //   1481: putfield 155	com/tencent/mm/plugin/music/f/c:duration	J
    //   1484: ldc 22
    //   1486: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1489: aload 6
    //   1491: athrow
    //   1492: ldc 30
    //   1494: ldc_w 334
    //   1497: iload 10
    //   1499: invokestatic 296	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1502: invokevirtual 299	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1505: invokestatic 37	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1508: iload 8
    //   1510: istore 4
    //   1512: goto -926 -> 586
    //   1515: aload_0
    //   1516: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1519: getfield 155	com/tencent/mm/plugin/music/f/c:duration	J
    //   1522: ldc2_w 226
    //   1525: ldiv
    //   1526: aload_0
    //   1527: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1530: getfield 240	com/tencent/mm/plugin/music/f/c:presentationTimeUs	J
    //   1533: ldc2_w 226
    //   1536: ldiv
    //   1537: lsub
    //   1538: ldc2_w 335
    //   1541: lcmp
    //   1542: ifge +123 -> 1665
    //   1545: iconst_1
    //   1546: istore 14
    //   1548: iload 7
    //   1550: bipush 50
    //   1552: if_icmplt +119 -> 1671
    //   1555: ldc 30
    //   1557: ldc_w 338
    //   1560: iconst_1
    //   1561: anewarray 4	java/lang/Object
    //   1564: dup
    //   1565: iconst_0
    //   1566: iload 7
    //   1568: invokestatic 87	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1571: aastore
    //   1572: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1575: aload_0
    //   1576: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1579: sipush 706
    //   1582: putfield 118	com/tencent/mm/plugin/music/f/c:clN	I
    //   1585: aload_0
    //   1586: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1589: iconst_1
    //   1590: invokevirtual 61	com/tencent/mm/plugin/music/f/c:jy	(Z)V
    //   1593: aload_0
    //   1594: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1597: invokestatic 121	com/tencent/mm/plugin/music/f/c:a	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1600: aload_0
    //   1601: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1604: invokestatic 276	com/tencent/mm/plugin/music/f/c:b	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1607: aload_0
    //   1608: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1611: invokestatic 279	com/tencent/mm/plugin/music/f/c:c	(Lcom/tencent/mm/plugin/music/f/c;)V
    //   1614: aload_0
    //   1615: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1618: aconst_null
    //   1619: putfield 46	com/tencent/mm/plugin/music/f/c:clO	Ljava/lang/String;
    //   1622: aload_0
    //   1623: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1626: aconst_null
    //   1627: putfield 105	com/tencent/mm/plugin/music/f/c:clY	Ljava/lang/String;
    //   1630: aload_0
    //   1631: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1634: iconst_0
    //   1635: putfield 140	com/tencent/mm/plugin/music/f/c:sampleRate	I
    //   1638: aload_0
    //   1639: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1642: iconst_0
    //   1643: putfield 145	com/tencent/mm/plugin/music/f/c:channels	I
    //   1646: aload_0
    //   1647: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1650: lconst_0
    //   1651: putfield 240	com/tencent/mm/plugin/music/f/c:presentationTimeUs	J
    //   1654: aload_0
    //   1655: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1658: lconst_0
    //   1659: putfield 155	com/tencent/mm/plugin/music/f/c:duration	J
    //   1662: goto -441 -> 1221
    //   1665: iconst_0
    //   1666: istore 14
    //   1668: goto -120 -> 1548
    //   1671: ldc 30
    //   1673: ldc_w 340
    //   1676: iconst_1
    //   1677: anewarray 4	java/lang/Object
    //   1680: dup
    //   1681: iconst_0
    //   1682: iload 14
    //   1684: invokestatic 345	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1687: aastore
    //   1688: invokestatic 131	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1691: aload_0
    //   1692: getfield 14	com/tencent/mm/plugin/music/f/c$1:oNz	Lcom/tencent/mm/plugin/music/f/c;
    //   1695: iload 14
    //   1697: invokevirtual 348	com/tencent/mm/plugin/music/f/c:jz	(Z)V
    //   1700: goto -107 -> 1593
    //   1703: goto -408 -> 1295
    //   1706: iload 7
    //   1708: istore 4
    //   1710: goto -937 -> 773
    //
    // Exception table:
    //   from	to	target	type
    //   65	82	255	java/lang/Exception
    //   88	100	928	java/lang/Exception
    //   102	121	928	java/lang/Exception
    //   136	150	928	java/lang/Exception
    //   152	166	928	java/lang/Exception
    //   168	181	928	java/lang/Exception
    //   183	198	928	java/lang/Exception
    //   206	213	928	java/lang/Exception
    //   216	226	928	java/lang/Exception
    //   229	237	928	java/lang/Exception
    //   240	247	928	java/lang/Exception
    //   305	321	928	java/lang/Exception
    //   324	338	928	java/lang/Exception
    //   341	355	928	java/lang/Exception
    //   358	372	928	java/lang/Exception
    //   372	396	960	java/lang/Exception
    //   400	408	960	java/lang/Exception
    //   408	450	960	java/lang/Exception
    //   598	615	1118	java/lang/Exception
    //   627	642	1118	java/lang/Exception
    //   652	666	1118	java/lang/Exception
    //   671	678	1118	java/lang/Exception
    //   684	701	1118	java/lang/Exception
    //   709	722	1118	java/lang/Exception
    //   727	738	1118	java/lang/Exception
    //   742	758	1118	java/lang/Exception
    //   763	770	1118	java/lang/Exception
    //   780	851	1118	java/lang/Exception
    //   1016	1045	1118	java/lang/Exception
    //   1048	1057	1118	java/lang/Exception
    //   1064	1086	1118	java/lang/Exception
    //   1095	1111	1118	java/lang/Exception
    //   1237	1247	1118	java/lang/Exception
    //   1247	1262	1118	java/lang/Exception
    //   1262	1292	1118	java/lang/Exception
    //   1313	1333	1118	java/lang/Exception
    //   1347	1406	1118	java/lang/Exception
    //   1492	1508	1118	java/lang/Exception
    //   1515	1545	1118	java/lang/Exception
    //   1555	1593	1118	java/lang/Exception
    //   1671	1700	1118	java/lang/Exception
    //   598	615	1413	finally
    //   627	642	1413	finally
    //   652	666	1413	finally
    //   671	678	1413	finally
    //   684	701	1413	finally
    //   709	722	1413	finally
    //   727	738	1413	finally
    //   742	758	1413	finally
    //   763	770	1413	finally
    //   780	851	1413	finally
    //   1016	1045	1413	finally
    //   1048	1057	1413	finally
    //   1064	1086	1413	finally
    //   1095	1111	1413	finally
    //   1120	1152	1413	finally
    //   1237	1247	1413	finally
    //   1247	1262	1413	finally
    //   1262	1292	1413	finally
    //   1313	1333	1413	finally
    //   1347	1406	1413	finally
    //   1492	1508	1413	finally
    //   1515	1545	1413	finally
    //   1555	1593	1413	finally
    //   1671	1700	1413	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.c.1
 * JD-Core Version:    0.6.2
 */