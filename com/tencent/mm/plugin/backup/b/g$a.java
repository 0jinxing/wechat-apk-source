package com.tencent.mm.plugin.backup.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.f.k;
import com.tencent.mm.plugin.backup.f.k.a;

public final class g$a
{
  public static String jrk = "<msg>";
  public static String jrl = "</msg>";

  public static String Fg(String paramString)
  {
    AppMethodBeat.i(17116);
    paramString = k.Fk(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(17116);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.jvN;
      AppMethodBeat.o(17116);
    }
  }

  // ERROR //
  public static String a(com.tencent.mm.storage.bi parambi, com.tencent.mm.protocal.protobuf.gu paramgu)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: sipush 17117
    //   5: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 60	com/tencent/mm/plugin/backup/h/d:aUr	()Lcom/tencent/mm/plugin/backup/h/d;
    //   11: invokevirtual 64	com/tencent/mm/plugin/backup/h/d:aUs	()Lcom/tencent/mm/plugin/backup/h/b;
    //   14: invokevirtual 70	com/tencent/mm/plugin/backup/h/b:aUp	()Lcom/tencent/mm/storage/emotion/d;
    //   17: aload_0
    //   18: getfield 75	com/tencent/mm/g/c/cy:field_imgPath	Ljava/lang/String;
    //   21: invokevirtual 81	com/tencent/mm/storage/emotion/d:aqi	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   24: astore_3
    //   25: aload_3
    //   26: ifnonnull +13 -> 39
    //   29: sipush 17117
    //   32: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: aload_2
    //   36: astore_0
    //   37: aload_0
    //   38: areturn
    //   39: aload_3
    //   40: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   43: invokestatic 90	com/tencent/mm/plugin/backup/f/k:Fl	(Ljava/lang/String;)Lcom/tencent/mm/plugin/backup/f/k$a;
    //   46: astore_2
    //   47: aload_2
    //   48: astore_0
    //   49: aload_2
    //   50: ifnonnull +27 -> 77
    //   53: new 40	com/tencent/mm/plugin/backup/f/k$a
    //   56: dup
    //   57: aload_3
    //   58: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   61: aload_3
    //   62: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   65: aload_3
    //   66: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   69: aload_3
    //   70: invokevirtual 87	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   73: invokespecial 94	com/tencent/mm/plugin/backup/f/k$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   76: astore_0
    //   77: new 96	java/io/StringWriter
    //   80: dup
    //   81: invokespecial 98	java/io/StringWriter:<init>	()V
    //   84: astore 4
    //   86: invokestatic 104	org/xmlpull/v1/XmlPullParserFactory:newInstance	()Lorg/xmlpull/v1/XmlPullParserFactory;
    //   89: invokevirtual 108	org/xmlpull/v1/XmlPullParserFactory:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   92: astore_2
    //   93: aload_2
    //   94: aload 4
    //   96: invokeinterface 114 2 0
    //   101: aload_2
    //   102: ldc 116
    //   104: getstatic 122	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   107: invokeinterface 126 3 0
    //   112: aload_2
    //   113: aconst_null
    //   114: ldc 128
    //   116: invokeinterface 132 3 0
    //   121: pop
    //   122: aload_2
    //   123: aconst_null
    //   124: ldc 134
    //   126: invokeinterface 132 3 0
    //   131: pop
    //   132: aload_2
    //   133: aconst_null
    //   134: ldc 136
    //   136: aload_1
    //   137: getfield 142	com/tencent/mm/protocal/protobuf/gu:vEB	Lcom/tencent/mm/protocal/protobuf/bts;
    //   140: getfield 147	com/tencent/mm/protocal/protobuf/bts:wVI	Ljava/lang/String;
    //   143: invokeinterface 151 4 0
    //   148: pop
    //   149: aload_2
    //   150: aconst_null
    //   151: ldc 153
    //   153: aload_1
    //   154: getfield 156	com/tencent/mm/protocal/protobuf/gu:vEC	Lcom/tencent/mm/protocal/protobuf/bts;
    //   157: getfield 147	com/tencent/mm/protocal/protobuf/bts:wVI	Ljava/lang/String;
    //   160: invokeinterface 151 4 0
    //   165: pop
    //   166: new 158	java/lang/StringBuilder
    //   169: astore_1
    //   170: aload_1
    //   171: invokespecial 159	java/lang/StringBuilder:<init>	()V
    //   174: aload_2
    //   175: aconst_null
    //   176: ldc 161
    //   178: aload_1
    //   179: aload_3
    //   180: getfield 165	com/tencent/mm/storage/emotion/EmojiInfo:field_type	I
    //   183: invokevirtual 169	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   186: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: invokeinterface 151 4 0
    //   194: pop
    //   195: aload_2
    //   196: aconst_null
    //   197: ldc 174
    //   199: aload_3
    //   200: invokevirtual 177	com/tencent/mm/storage/emotion/EmojiInfo:duW	()Ljava/lang/String;
    //   203: invokeinterface 151 4 0
    //   208: pop
    //   209: aload_2
    //   210: aconst_null
    //   211: ldc 179
    //   213: aload_0
    //   214: getfield 182	com/tencent/mm/plugin/backup/f/k$a:jvO	Ljava/lang/String;
    //   217: invokeinterface 151 4 0
    //   222: pop
    //   223: aload_2
    //   224: aconst_null
    //   225: ldc 184
    //   227: ldc 186
    //   229: invokeinterface 151 4 0
    //   234: pop
    //   235: aload_2
    //   236: aconst_null
    //   237: ldc 188
    //   239: aload_0
    //   240: getfield 43	com/tencent/mm/plugin/backup/f/k$a:jvN	Ljava/lang/String;
    //   243: invokeinterface 151 4 0
    //   248: pop
    //   249: aload_2
    //   250: aconst_null
    //   251: ldc 190
    //   253: ldc 186
    //   255: invokeinterface 151 4 0
    //   260: pop
    //   261: aload_2
    //   262: aconst_null
    //   263: ldc 192
    //   265: aload_3
    //   266: getfield 195	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   269: invokeinterface 151 4 0
    //   274: pop
    //   275: aload_2
    //   276: aconst_null
    //   277: ldc 197
    //   279: aload_3
    //   280: getfield 200	com/tencent/mm/storage/emotion/EmojiInfo:field_cdnUrl	Ljava/lang/String;
    //   283: invokeinterface 151 4 0
    //   288: pop
    //   289: aload_2
    //   290: aconst_null
    //   291: ldc 202
    //   293: aload_3
    //   294: getfield 205	com/tencent/mm/storage/emotion/EmojiInfo:field_designerID	Ljava/lang/String;
    //   297: invokeinterface 151 4 0
    //   302: pop
    //   303: aload_2
    //   304: aconst_null
    //   305: ldc 207
    //   307: aload_3
    //   308: getfield 210	com/tencent/mm/storage/emotion/EmojiInfo:field_thumbUrl	Ljava/lang/String;
    //   311: invokeinterface 151 4 0
    //   316: pop
    //   317: aload_2
    //   318: aconst_null
    //   319: ldc 212
    //   321: aload_3
    //   322: getfield 215	com/tencent/mm/storage/emotion/EmojiInfo:field_encrypturl	Ljava/lang/String;
    //   325: invokeinterface 151 4 0
    //   330: pop
    //   331: aload_2
    //   332: aconst_null
    //   333: ldc 217
    //   335: aload_3
    //   336: getfield 220	com/tencent/mm/storage/emotion/EmojiInfo:field_aeskey	Ljava/lang/String;
    //   339: invokeinterface 151 4 0
    //   344: pop
    //   345: aload_2
    //   346: aconst_null
    //   347: ldc 222
    //   349: aload_3
    //   350: getfield 225	com/tencent/mm/storage/emotion/EmojiInfo:field_externUrl	Ljava/lang/String;
    //   353: invokeinterface 151 4 0
    //   358: pop
    //   359: aload_2
    //   360: aconst_null
    //   361: ldc 227
    //   363: aload_3
    //   364: getfield 230	com/tencent/mm/storage/emotion/EmojiInfo:field_externMd5	Ljava/lang/String;
    //   367: invokeinterface 151 4 0
    //   372: pop
    //   373: aload_2
    //   374: aconst_null
    //   375: ldc 232
    //   377: aload_3
    //   378: getfield 235	com/tencent/mm/storage/emotion/EmojiInfo:field_width	I
    //   381: invokestatic 241	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   384: invokeinterface 151 4 0
    //   389: pop
    //   390: aload_2
    //   391: aconst_null
    //   392: ldc 243
    //   394: aload_3
    //   395: getfield 246	com/tencent/mm/storage/emotion/EmojiInfo:field_height	I
    //   398: invokestatic 241	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   401: invokeinterface 151 4 0
    //   406: pop
    //   407: aload_2
    //   408: aconst_null
    //   409: ldc 248
    //   411: aload_3
    //   412: getfield 251	com/tencent/mm/storage/emotion/EmojiInfo:field_tpurl	Ljava/lang/String;
    //   415: invokeinterface 151 4 0
    //   420: pop
    //   421: aload_2
    //   422: aconst_null
    //   423: ldc 253
    //   425: aload_3
    //   426: getfield 256	com/tencent/mm/storage/emotion/EmojiInfo:field_tpauthkey	Ljava/lang/String;
    //   429: invokeinterface 151 4 0
    //   434: pop
    //   435: aload_2
    //   436: aconst_null
    //   437: ldc_w 258
    //   440: aload_3
    //   441: getfield 261	com/tencent/mm/storage/emotion/EmojiInfo:field_attachedText	Ljava/lang/String;
    //   444: invokeinterface 151 4 0
    //   449: pop
    //   450: aload_2
    //   451: aconst_null
    //   452: ldc_w 263
    //   455: aload_3
    //   456: getfield 266	com/tencent/mm/storage/emotion/EmojiInfo:field_attachTextColor	Ljava/lang/String;
    //   459: invokeinterface 151 4 0
    //   464: pop
    //   465: aload_2
    //   466: aconst_null
    //   467: ldc_w 268
    //   470: aload_3
    //   471: getfield 271	com/tencent/mm/storage/emotion/EmojiInfo:field_lensId	Ljava/lang/String;
    //   474: invokeinterface 151 4 0
    //   479: pop
    //   480: aload_2
    //   481: aconst_null
    //   482: ldc_w 273
    //   485: aload_3
    //   486: getfield 276	com/tencent/mm/storage/emotion/EmojiInfo:field_activityid	Ljava/lang/String;
    //   489: invokeinterface 151 4 0
    //   494: pop
    //   495: aload_2
    //   496: aconst_null
    //   497: ldc 134
    //   499: invokeinterface 279 3 0
    //   504: pop
    //   505: aload_3
    //   506: invokevirtual 283	com/tencent/mm/storage/emotion/EmojiInfo:xy	()Z
    //   509: ifeq +141 -> 650
    //   512: aload_2
    //   513: aconst_null
    //   514: ldc_w 285
    //   517: invokeinterface 132 3 0
    //   522: pop
    //   523: aload_3
    //   524: invokevirtual 288	com/tencent/mm/storage/emotion/EmojiInfo:getContent	()Ljava/lang/String;
    //   527: ldc_w 285
    //   530: invokestatic 294	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   533: astore_1
    //   534: aload_1
    //   535: ldc_w 296
    //   538: invokeinterface 302 2 0
    //   543: checkcast 237	java/lang/String
    //   546: ldc_w 304
    //   549: invokestatic 310	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   552: astore_0
    //   553: aload_1
    //   554: ldc_w 312
    //   557: invokeinterface 302 2 0
    //   562: checkcast 237	java/lang/String
    //   565: ldc_w 304
    //   568: invokestatic 310	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   571: astore_1
    //   572: aload_0
    //   573: ldc_w 304
    //   576: invokevirtual 316	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   579: ifne +13 -> 592
    //   582: aload_1
    //   583: ldc_w 304
    //   586: invokevirtual 316	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   589: ifeq +21 -> 610
    //   592: aload 4
    //   594: invokevirtual 319	java/io/StringWriter:close	()V
    //   597: ldc_w 304
    //   600: astore_0
    //   601: sipush 17117
    //   604: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   607: goto -570 -> 37
    //   610: aload_2
    //   611: aconst_null
    //   612: ldc 161
    //   614: aload_0
    //   615: invokestatic 322	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   618: invokeinterface 151 4 0
    //   623: pop
    //   624: aload_2
    //   625: aconst_null
    //   626: ldc_w 324
    //   629: aload_1
    //   630: invokestatic 322	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   633: invokeinterface 151 4 0
    //   638: pop
    //   639: aload_2
    //   640: aconst_null
    //   641: ldc_w 285
    //   644: invokeinterface 279 3 0
    //   649: pop
    //   650: aload_2
    //   651: aconst_null
    //   652: ldc 128
    //   654: invokeinterface 279 3 0
    //   659: pop
    //   660: aload_2
    //   661: invokeinterface 327 1 0
    //   666: aload 4
    //   668: invokevirtual 330	java/io/StringWriter:flush	()V
    //   671: aload 4
    //   673: invokevirtual 319	java/io/StringWriter:close	()V
    //   676: aload 4
    //   678: invokevirtual 334	java/io/StringWriter:getBuffer	()Ljava/lang/StringBuffer;
    //   681: invokevirtual 337	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   684: astore_0
    //   685: aload_0
    //   686: aload_0
    //   687: getstatic 16	com/tencent/mm/plugin/backup/b/g$a:jrk	Ljava/lang/String;
    //   690: invokevirtual 341	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   693: aload_0
    //   694: getstatic 20	com/tencent/mm/plugin/backup/b/g$a:jrl	Ljava/lang/String;
    //   697: invokevirtual 341	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   700: getstatic 20	com/tencent/mm/plugin/backup/b/g$a:jrl	Ljava/lang/String;
    //   703: invokevirtual 345	java/lang/String:length	()I
    //   706: iadd
    //   707: invokevirtual 349	java/lang/String:substring	(II)Ljava/lang/String;
    //   710: astore_0
    //   711: ldc_w 351
    //   714: ldc_w 353
    //   717: aload_0
    //   718: invokestatic 322	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   721: invokevirtual 356	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   724: invokestatic 362	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   727: sipush 17117
    //   730: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   733: goto -696 -> 37
    //   736: astore_0
    //   737: ldc_w 351
    //   740: aload_0
    //   741: ldc_w 304
    //   744: iconst_0
    //   745: anewarray 4	java/lang/Object
    //   748: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   751: ldc_w 304
    //   754: astore_0
    //   755: sipush 17117
    //   758: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   761: goto -724 -> 37
    //   764: astore_0
    //   765: ldc_w 351
    //   768: aload_0
    //   769: ldc_w 304
    //   772: iconst_0
    //   773: anewarray 4	java/lang/Object
    //   776: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   779: ldc_w 304
    //   782: astore_0
    //   783: sipush 17117
    //   786: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   789: goto -752 -> 37
    //   792: astore_0
    //   793: ldc_w 351
    //   796: aload_0
    //   797: ldc_w 304
    //   800: iconst_0
    //   801: anewarray 4	java/lang/Object
    //   804: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   807: ldc_w 304
    //   810: astore_0
    //   811: sipush 17117
    //   814: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   817: goto -780 -> 37
    //   820: astore_0
    //   821: ldc_w 351
    //   824: aload_0
    //   825: ldc_w 304
    //   828: iconst_0
    //   829: anewarray 4	java/lang/Object
    //   832: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   835: ldc_w 304
    //   838: astore_0
    //   839: sipush 17117
    //   842: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   845: goto -808 -> 37
    //   848: astore_0
    //   849: ldc_w 304
    //   852: astore_0
    //   853: sipush 17117
    //   856: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   859: goto -822 -> 37
    //
    // Exception table:
    //   from	to	target	type
    //   86	592	736	org/xmlpull/v1/XmlPullParserException
    //   592	597	736	org/xmlpull/v1/XmlPullParserException
    //   610	650	736	org/xmlpull/v1/XmlPullParserException
    //   650	676	736	org/xmlpull/v1/XmlPullParserException
    //   86	592	764	java/lang/IllegalArgumentException
    //   592	597	764	java/lang/IllegalArgumentException
    //   610	650	764	java/lang/IllegalArgumentException
    //   650	676	764	java/lang/IllegalArgumentException
    //   86	592	792	java/lang/IllegalStateException
    //   592	597	792	java/lang/IllegalStateException
    //   610	650	792	java/lang/IllegalStateException
    //   650	676	792	java/lang/IllegalStateException
    //   86	592	820	java/io/IOException
    //   592	597	820	java/io/IOException
    //   610	650	820	java/io/IOException
    //   650	676	820	java/io/IOException
    //   685	727	848	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.b.g.a
 * JD-Core Version:    0.6.2
 */