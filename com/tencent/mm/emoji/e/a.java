package com.tencent.mm.emoji.e;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  // ERROR //
  public static java.util.ArrayList<com.tencent.mm.storage.emotion.SmileyInfo> a(com.tencent.mm.vfs.b paramb)
  {
    // Byte code:
    //   0: ldc 11
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 19	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 23	java/util/ArrayList:<init>	()V
    //   12: astore_1
    //   13: invokestatic 29	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   16: astore_2
    //   17: aload_0
    //   18: invokestatic 35	com/tencent/mm/vfs/e:p	(Lcom/tencent/mm/vfs/b;)Ljava/io/InputStream;
    //   21: astore_3
    //   22: aconst_null
    //   23: astore_0
    //   24: aload_2
    //   25: invokevirtual 39	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   28: aload_3
    //   29: invokevirtual 45	javax/xml/parsers/DocumentBuilder:parse	(Ljava/io/InputStream;)Lorg/w3c/dom/Document;
    //   32: astore_2
    //   33: aload_2
    //   34: invokeinterface 50 1 0
    //   39: aload_2
    //   40: invokeinterface 54 1 0
    //   45: ldc 56
    //   47: invokeinterface 62 2 0
    //   52: astore 4
    //   54: aload 4
    //   56: ifnull +646 -> 702
    //   59: aload 4
    //   61: invokeinterface 68 1 0
    //   66: ifle +636 -> 702
    //   69: aload 4
    //   71: invokeinterface 68 1 0
    //   76: istore 5
    //   78: iconst_0
    //   79: istore 6
    //   81: iload 6
    //   83: iload 5
    //   85: if_icmpge +617 -> 702
    //   88: aload 4
    //   90: iload 6
    //   92: invokeinterface 72 2 0
    //   97: invokeinterface 78 1 0
    //   102: astore 7
    //   104: aload 7
    //   106: ifnull +581 -> 687
    //   109: aload 7
    //   111: invokeinterface 68 1 0
    //   116: ifle +571 -> 687
    //   119: new 80	com/tencent/mm/storage/emotion/SmileyInfo
    //   122: astore_2
    //   123: aload_2
    //   124: invokespecial 81	com/tencent/mm/storage/emotion/SmileyInfo:<init>	()V
    //   127: iconst_0
    //   128: istore 8
    //   130: iload 8
    //   132: aload 7
    //   134: invokeinterface 68 1 0
    //   139: if_icmpge +517 -> 656
    //   142: aload 7
    //   144: iload 8
    //   146: invokeinterface 72 2 0
    //   151: astore 9
    //   153: aload 9
    //   155: invokeinterface 85 1 0
    //   160: astore 10
    //   162: aload 10
    //   164: ldc 87
    //   166: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   169: ifeq +20 -> 189
    //   172: aload_2
    //   173: aload 9
    //   175: invokeinterface 96 1 0
    //   180: putfield 100	com/tencent/mm/storage/emotion/SmileyInfo:field_key	Ljava/lang/String;
    //   183: iinc 8 1
    //   186: goto -56 -> 130
    //   189: aload 10
    //   191: ldc 102
    //   193: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   196: ifeq +128 -> 324
    //   199: aload 9
    //   201: invokeinterface 96 1 0
    //   206: invokestatic 107	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   209: ifne +18 -> 227
    //   212: ldc 109
    //   214: aload 9
    //   216: invokeinterface 96 1 0
    //   221: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   224: ifeq +82 -> 306
    //   227: aload_2
    //   228: aload_2
    //   229: getfield 100	com/tencent/mm/storage/emotion/SmileyInfo:field_key	Ljava/lang/String;
    //   232: putfield 112	com/tencent/mm/storage/emotion/SmileyInfo:field_cnValue	Ljava/lang/String;
    //   235: goto -52 -> 183
    //   238: astore_0
    //   239: ldc 11
    //   241: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: aload_0
    //   245: athrow
    //   246: astore_2
    //   247: aload_3
    //   248: ifnull +11 -> 259
    //   251: aload_0
    //   252: ifnull +470 -> 722
    //   255: aload_3
    //   256: invokevirtual 120	java/io/InputStream:close	()V
    //   259: ldc 11
    //   261: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   264: aload_2
    //   265: athrow
    //   266: astore_0
    //   267: ldc 122
    //   269: ldc 124
    //   271: iconst_1
    //   272: anewarray 4	java/lang/Object
    //   275: dup
    //   276: iconst_0
    //   277: aload_0
    //   278: invokevirtual 127	java/lang/Exception:toString	()Ljava/lang/String;
    //   281: aastore
    //   282: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: aload_1
    //   286: invokevirtual 136	java/util/ArrayList:size	()I
    //   289: ifne +10 -> 299
    //   292: ldc 122
    //   294: ldc 138
    //   296: invokestatic 142	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   299: ldc 11
    //   301: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   304: aload_1
    //   305: areturn
    //   306: aload_2
    //   307: aload 9
    //   309: invokeinterface 96 1 0
    //   314: putfield 112	com/tencent/mm/storage/emotion/SmileyInfo:field_cnValue	Ljava/lang/String;
    //   317: goto -134 -> 183
    //   320: astore_2
    //   321: goto -74 -> 247
    //   324: aload 10
    //   326: ldc 144
    //   328: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   331: ifeq +56 -> 387
    //   334: aload 9
    //   336: invokeinterface 96 1 0
    //   341: invokestatic 107	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   344: ifne +18 -> 362
    //   347: ldc 109
    //   349: aload 9
    //   351: invokeinterface 96 1 0
    //   356: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   359: ifeq +14 -> 373
    //   362: aload_2
    //   363: aload_2
    //   364: getfield 100	com/tencent/mm/storage/emotion/SmileyInfo:field_key	Ljava/lang/String;
    //   367: putfield 147	com/tencent/mm/storage/emotion/SmileyInfo:field_qqValue	Ljava/lang/String;
    //   370: goto -187 -> 183
    //   373: aload_2
    //   374: aload 9
    //   376: invokeinterface 96 1 0
    //   381: putfield 147	com/tencent/mm/storage/emotion/SmileyInfo:field_qqValue	Ljava/lang/String;
    //   384: goto -201 -> 183
    //   387: aload 10
    //   389: ldc 149
    //   391: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   394: ifeq +56 -> 450
    //   397: aload 9
    //   399: invokeinterface 96 1 0
    //   404: invokestatic 107	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   407: ifne +18 -> 425
    //   410: ldc 109
    //   412: aload 9
    //   414: invokeinterface 96 1 0
    //   419: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   422: ifeq +14 -> 436
    //   425: aload_2
    //   426: aload_2
    //   427: getfield 100	com/tencent/mm/storage/emotion/SmileyInfo:field_key	Ljava/lang/String;
    //   430: putfield 152	com/tencent/mm/storage/emotion/SmileyInfo:field_enValue	Ljava/lang/String;
    //   433: goto -250 -> 183
    //   436: aload_2
    //   437: aload 9
    //   439: invokeinterface 96 1 0
    //   444: putfield 152	com/tencent/mm/storage/emotion/SmileyInfo:field_enValue	Ljava/lang/String;
    //   447: goto -264 -> 183
    //   450: aload 10
    //   452: ldc 154
    //   454: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   457: ifeq +56 -> 513
    //   460: aload 9
    //   462: invokeinterface 96 1 0
    //   467: invokestatic 107	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   470: ifne +18 -> 488
    //   473: ldc 109
    //   475: aload 9
    //   477: invokeinterface 96 1 0
    //   482: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   485: ifeq +14 -> 499
    //   488: aload_2
    //   489: aload_2
    //   490: getfield 100	com/tencent/mm/storage/emotion/SmileyInfo:field_key	Ljava/lang/String;
    //   493: putfield 157	com/tencent/mm/storage/emotion/SmileyInfo:field_twValue	Ljava/lang/String;
    //   496: goto -313 -> 183
    //   499: aload_2
    //   500: aload 9
    //   502: invokeinterface 96 1 0
    //   507: putfield 157	com/tencent/mm/storage/emotion/SmileyInfo:field_twValue	Ljava/lang/String;
    //   510: goto -327 -> 183
    //   513: aload 10
    //   515: ldc 159
    //   517: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   520: ifeq +56 -> 576
    //   523: aload 9
    //   525: invokeinterface 96 1 0
    //   530: invokestatic 107	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   533: ifne +18 -> 551
    //   536: ldc 109
    //   538: aload 9
    //   540: invokeinterface 96 1 0
    //   545: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   548: ifeq +14 -> 562
    //   551: aload_2
    //   552: aload_2
    //   553: getfield 100	com/tencent/mm/storage/emotion/SmileyInfo:field_key	Ljava/lang/String;
    //   556: putfield 162	com/tencent/mm/storage/emotion/SmileyInfo:field_thValue	Ljava/lang/String;
    //   559: goto -376 -> 183
    //   562: aload_2
    //   563: aload 9
    //   565: invokeinterface 96 1 0
    //   570: putfield 162	com/tencent/mm/storage/emotion/SmileyInfo:field_thValue	Ljava/lang/String;
    //   573: goto -390 -> 183
    //   576: aload 10
    //   578: ldc 164
    //   580: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   583: ifeq +17 -> 600
    //   586: aload_2
    //   587: aload 9
    //   589: invokeinterface 96 1 0
    //   594: putfield 167	com/tencent/mm/storage/emotion/SmileyInfo:field_fileName	Ljava/lang/String;
    //   597: goto -414 -> 183
    //   600: aload 10
    //   602: ldc 169
    //   604: invokevirtual 93	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   607: istore 11
    //   609: iload 11
    //   611: ifeq -428 -> 183
    //   614: aload 9
    //   616: invokeinterface 96 1 0
    //   621: invokestatic 175	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   624: invokevirtual 178	java/lang/Integer:intValue	()I
    //   627: istore 12
    //   629: aload_2
    //   630: iload 12
    //   632: putfield 182	com/tencent/mm/storage/emotion/SmileyInfo:field_eggIndex	I
    //   635: goto -452 -> 183
    //   638: astore 10
    //   640: ldc 122
    //   642: aload 10
    //   644: invokestatic 186	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   647: invokestatic 188	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   650: iconst_m1
    //   651: istore 12
    //   653: goto -24 -> 629
    //   656: aload_2
    //   657: iconst_m1
    //   658: putfield 191	com/tencent/mm/storage/emotion/SmileyInfo:field_position	I
    //   661: ldc 122
    //   663: aload_2
    //   664: invokevirtual 192	com/tencent/mm/storage/emotion/SmileyInfo:toString	()Ljava/lang/String;
    //   667: invokestatic 195	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   670: aload_2
    //   671: getfield 100	com/tencent/mm/storage/emotion/SmileyInfo:field_key	Ljava/lang/String;
    //   674: invokestatic 107	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   677: ifeq +16 -> 693
    //   680: ldc 122
    //   682: ldc 197
    //   684: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   687: iinc 6 1
    //   690: goto -609 -> 81
    //   693: aload_1
    //   694: aload_2
    //   695: invokevirtual 203	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   698: pop
    //   699: goto -12 -> 687
    //   702: aload_3
    //   703: ifnull -418 -> 285
    //   706: aload_3
    //   707: invokevirtual 120	java/io/InputStream:close	()V
    //   710: goto -425 -> 285
    //   713: astore_3
    //   714: aload_0
    //   715: aload_3
    //   716: invokevirtual 207	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   719: goto -460 -> 259
    //   722: aload_3
    //   723: invokevirtual 120	java/io/InputStream:close	()V
    //   726: goto -467 -> 259
    //
    // Exception table:
    //   from	to	target	type
    //   24	54	238	java/lang/Throwable
    //   59	78	238	java/lang/Throwable
    //   88	104	238	java/lang/Throwable
    //   109	127	238	java/lang/Throwable
    //   130	183	238	java/lang/Throwable
    //   189	227	238	java/lang/Throwable
    //   227	235	238	java/lang/Throwable
    //   306	317	238	java/lang/Throwable
    //   324	362	238	java/lang/Throwable
    //   362	370	238	java/lang/Throwable
    //   373	384	238	java/lang/Throwable
    //   387	425	238	java/lang/Throwable
    //   425	433	238	java/lang/Throwable
    //   436	447	238	java/lang/Throwable
    //   450	488	238	java/lang/Throwable
    //   488	496	238	java/lang/Throwable
    //   499	510	238	java/lang/Throwable
    //   513	551	238	java/lang/Throwable
    //   551	559	238	java/lang/Throwable
    //   562	573	238	java/lang/Throwable
    //   576	597	238	java/lang/Throwable
    //   600	609	238	java/lang/Throwable
    //   614	629	238	java/lang/Throwable
    //   629	635	238	java/lang/Throwable
    //   640	650	238	java/lang/Throwable
    //   656	687	238	java/lang/Throwable
    //   693	699	238	java/lang/Throwable
    //   239	246	246	finally
    //   17	22	266	java/lang/Exception
    //   255	259	266	java/lang/Exception
    //   259	266	266	java/lang/Exception
    //   706	710	266	java/lang/Exception
    //   714	719	266	java/lang/Exception
    //   722	726	266	java/lang/Exception
    //   24	54	320	finally
    //   59	78	320	finally
    //   88	104	320	finally
    //   109	127	320	finally
    //   130	183	320	finally
    //   189	227	320	finally
    //   227	235	320	finally
    //   306	317	320	finally
    //   324	362	320	finally
    //   362	370	320	finally
    //   373	384	320	finally
    //   387	425	320	finally
    //   425	433	320	finally
    //   436	447	320	finally
    //   450	488	320	finally
    //   488	496	320	finally
    //   499	510	320	finally
    //   513	551	320	finally
    //   551	559	320	finally
    //   562	573	320	finally
    //   576	597	320	finally
    //   600	609	320	finally
    //   614	629	320	finally
    //   629	635	320	finally
    //   640	650	320	finally
    //   656	687	320	finally
    //   693	699	320	finally
    //   614	629	638	java/lang/Exception
    //   255	259	713	java/lang/Throwable
  }

  // ERROR //
  public static java.util.ArrayList<com.tencent.mm.storage.emotion.r> b(com.tencent.mm.vfs.b paramb)
  {
    // Byte code:
    //   0: ldc 214
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 19	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 23	java/util/ArrayList:<init>	()V
    //   12: astore_1
    //   13: invokestatic 29	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   16: astore_2
    //   17: aconst_null
    //   18: astore_3
    //   19: aconst_null
    //   20: astore 4
    //   22: aload_0
    //   23: invokestatic 35	com/tencent/mm/vfs/e:p	(Lcom/tencent/mm/vfs/b;)Ljava/io/InputStream;
    //   26: astore 5
    //   28: aload 5
    //   30: astore 4
    //   32: aload 5
    //   34: astore_3
    //   35: aload_2
    //   36: invokevirtual 39	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   39: aload 5
    //   41: invokevirtual 45	javax/xml/parsers/DocumentBuilder:parse	(Ljava/io/InputStream;)Lorg/w3c/dom/Document;
    //   44: astore_0
    //   45: aload 5
    //   47: astore 4
    //   49: aload 5
    //   51: astore_3
    //   52: aload_0
    //   53: invokeinterface 50 1 0
    //   58: aload 5
    //   60: astore 4
    //   62: aload 5
    //   64: astore_3
    //   65: aload_0
    //   66: invokeinterface 54 1 0
    //   71: ldc 215
    //   73: invokeinterface 62 2 0
    //   78: astore 6
    //   80: aload 6
    //   82: ifnull +360 -> 442
    //   85: aload 5
    //   87: astore 4
    //   89: aload 5
    //   91: astore_3
    //   92: aload 6
    //   94: invokeinterface 68 1 0
    //   99: ifle +343 -> 442
    //   102: aload 5
    //   104: astore 4
    //   106: aload 5
    //   108: astore_3
    //   109: aload 6
    //   111: invokeinterface 68 1 0
    //   116: istore 7
    //   118: iconst_0
    //   119: istore 8
    //   121: iload 8
    //   123: iload 7
    //   125: if_icmpge +317 -> 442
    //   128: aload 5
    //   130: astore 4
    //   132: aload 5
    //   134: astore_3
    //   135: aload 6
    //   137: iload 8
    //   139: invokeinterface 72 2 0
    //   144: astore_0
    //   145: aload_0
    //   146: ifnull +234 -> 380
    //   149: aload 5
    //   151: astore 4
    //   153: aload 5
    //   155: astore_3
    //   156: aload_0
    //   157: invokeinterface 96 1 0
    //   162: invokestatic 107	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   165: ifne +215 -> 380
    //   168: aload 5
    //   170: astore 4
    //   172: aload 5
    //   174: astore_3
    //   175: aload_0
    //   176: invokeinterface 96 1 0
    //   181: ldc 217
    //   183: ldc 219
    //   185: invokevirtual 223	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   188: astore_0
    //   189: aload_0
    //   190: astore_2
    //   191: aload 5
    //   193: astore 4
    //   195: aload 5
    //   197: astore_3
    //   198: aload_0
    //   199: ldc 225
    //   201: invokevirtual 228	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   204: ifeq +103 -> 307
    //   207: aload 5
    //   209: astore 4
    //   211: aload 5
    //   213: astore_3
    //   214: aload_0
    //   215: iconst_3
    //   216: invokevirtual 232	java/lang/String:substring	(I)Ljava/lang/String;
    //   219: bipush 16
    //   221: invokestatic 236	java/lang/Integer:parseInt	(Ljava/lang/String;I)I
    //   224: invokestatic 242	java/lang/Character:toChars	(I)[C
    //   227: astore 9
    //   229: ldc 219
    //   231: astore_0
    //   232: iconst_0
    //   233: istore 10
    //   235: aload_0
    //   236: astore_2
    //   237: aload 5
    //   239: astore 4
    //   241: aload 5
    //   243: astore_3
    //   244: iload 10
    //   246: aload 9
    //   248: arraylength
    //   249: if_icmpge +58 -> 307
    //   252: aload 5
    //   254: astore 4
    //   256: aload 5
    //   258: astore_3
    //   259: new 244	java/lang/StringBuilder
    //   262: astore_2
    //   263: aload 5
    //   265: astore 4
    //   267: aload 5
    //   269: astore_3
    //   270: aload_2
    //   271: invokespecial 245	java/lang/StringBuilder:<init>	()V
    //   274: aload 5
    //   276: astore 4
    //   278: aload 5
    //   280: astore_3
    //   281: aload_2
    //   282: aload_0
    //   283: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: aload 9
    //   288: iload 10
    //   290: caload
    //   291: invokestatic 252	java/lang/String:valueOf	(C)Ljava/lang/String;
    //   294: invokevirtual 249	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: invokevirtual 253	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   300: astore_0
    //   301: iinc 10 1
    //   304: goto -69 -> 235
    //   307: aload 5
    //   309: astore 4
    //   311: aload 5
    //   313: astore_3
    //   314: new 255	com/tencent/mm/storage/emotion/r
    //   317: astore_0
    //   318: aload 5
    //   320: astore 4
    //   322: aload 5
    //   324: astore_3
    //   325: aload_0
    //   326: iload 8
    //   328: aload_2
    //   329: invokespecial 258	com/tencent/mm/storage/emotion/r:<init>	(ILjava/lang/String;)V
    //   332: aload 5
    //   334: astore 4
    //   336: aload 5
    //   338: astore_3
    //   339: aload_0
    //   340: getfield 259	com/tencent/mm/storage/emotion/r:field_key	Ljava/lang/String;
    //   343: invokestatic 107	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   346: ifeq +40 -> 386
    //   349: aload 5
    //   351: astore 4
    //   353: aload 5
    //   355: astore_3
    //   356: ldc 122
    //   358: ldc_w 261
    //   361: invokestatic 199	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   364: aload 5
    //   366: astore 4
    //   368: aload 5
    //   370: astore_3
    //   371: ldc 122
    //   373: aload_0
    //   374: invokevirtual 262	com/tencent/mm/storage/emotion/r:toString	()Ljava/lang/String;
    //   377: invokestatic 195	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   380: iinc 8 1
    //   383: goto -262 -> 121
    //   386: aload 5
    //   388: astore 4
    //   390: aload 5
    //   392: astore_3
    //   393: aload_1
    //   394: aload_0
    //   395: invokevirtual 203	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   398: pop
    //   399: goto -35 -> 364
    //   402: astore_0
    //   403: aload 4
    //   405: astore_3
    //   406: ldc 122
    //   408: ldc_w 264
    //   411: iconst_1
    //   412: anewarray 4	java/lang/Object
    //   415: dup
    //   416: iconst_0
    //   417: aload_0
    //   418: invokevirtual 127	java/lang/Exception:toString	()Ljava/lang/String;
    //   421: aastore
    //   422: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   425: aload 4
    //   427: ifnull +8 -> 435
    //   430: aload 4
    //   432: invokevirtual 120	java/io/InputStream:close	()V
    //   435: ldc 214
    //   437: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   440: aload_1
    //   441: areturn
    //   442: aload 5
    //   444: ifnull -9 -> 435
    //   447: aload 5
    //   449: invokevirtual 120	java/io/InputStream:close	()V
    //   452: goto -17 -> 435
    //   455: astore_0
    //   456: goto -21 -> 435
    //   459: astore_0
    //   460: aload_3
    //   461: ifnull +7 -> 468
    //   464: aload_3
    //   465: invokevirtual 120	java/io/InputStream:close	()V
    //   468: ldc 214
    //   470: invokestatic 115	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   473: aload_0
    //   474: athrow
    //   475: astore_0
    //   476: goto -41 -> 435
    //   479: astore_3
    //   480: goto -12 -> 468
    //
    // Exception table:
    //   from	to	target	type
    //   22	28	402	java/lang/Exception
    //   35	45	402	java/lang/Exception
    //   52	58	402	java/lang/Exception
    //   65	80	402	java/lang/Exception
    //   92	102	402	java/lang/Exception
    //   109	118	402	java/lang/Exception
    //   135	145	402	java/lang/Exception
    //   156	168	402	java/lang/Exception
    //   175	189	402	java/lang/Exception
    //   198	207	402	java/lang/Exception
    //   214	229	402	java/lang/Exception
    //   244	252	402	java/lang/Exception
    //   259	263	402	java/lang/Exception
    //   270	274	402	java/lang/Exception
    //   281	301	402	java/lang/Exception
    //   314	318	402	java/lang/Exception
    //   325	332	402	java/lang/Exception
    //   339	349	402	java/lang/Exception
    //   356	364	402	java/lang/Exception
    //   371	380	402	java/lang/Exception
    //   393	399	402	java/lang/Exception
    //   447	452	455	java/io/IOException
    //   22	28	459	finally
    //   35	45	459	finally
    //   52	58	459	finally
    //   65	80	459	finally
    //   92	102	459	finally
    //   109	118	459	finally
    //   135	145	459	finally
    //   156	168	459	finally
    //   175	189	459	finally
    //   198	207	459	finally
    //   214	229	459	finally
    //   244	252	459	finally
    //   259	263	459	finally
    //   270	274	459	finally
    //   281	301	459	finally
    //   314	318	459	finally
    //   325	332	459	finally
    //   339	349	459	finally
    //   356	364	459	finally
    //   371	380	459	finally
    //   393	399	459	finally
    //   406	425	459	finally
    //   430	435	475	java/io/IOException
    //   464	468	479	java/io/IOException
  }

  public static int y(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(62272);
    if (paramContext == null)
    {
      paramInt = 0;
      AppMethodBeat.o(62272);
    }
    while (true)
    {
      return paramInt;
      TypedValue localTypedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(paramInt, localTypedValue, true);
      paramInt = localTypedValue.resourceId;
      AppMethodBeat.o(62272);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.e.a
 * JD-Core Version:    0.6.2
 */