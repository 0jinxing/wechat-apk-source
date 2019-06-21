package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.u;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class af extends n
{
  private u pvF;

  private static void a(n.b paramb, OutputStream paramOutputStream)
  {
    AppMethodBeat.i(68072);
    if (paramb.puc == null)
      AppMethodBeat.o(68072);
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = paramb.puc.keySet().iterator();
      int i = 1;
      if (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        if (i != 0);
        for (String str2 = ""; ; str2 = "&")
        {
          localStringBuilder.append(str2).append(URLEncoder.encode(str1, "utf-8")).append('=').append(URLEncoder.encode((String)paramb.puc.get(str1), "utf-8"));
          i = 0;
          break;
        }
      }
      paramOutputStream.write(localStringBuilder.toString().getBytes());
      AppMethodBeat.o(68072);
    }
  }

  // ERROR //
  public final n.c a(String paramString1, String paramString2, n.b paramb, n.a parama)
  {
    // Byte code:
    //   0: ldc 98
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 100
    //   7: new 26	java/lang/StringBuilder
    //   10: dup
    //   11: ldc 102
    //   13: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   16: aload_2
    //   17: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: ldc 107
    //   22: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_3
    //   26: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   29: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: aconst_null
    //   36: astore 5
    //   38: aconst_null
    //   39: astore 6
    //   41: aconst_null
    //   42: astore 7
    //   44: aconst_null
    //   45: astore 8
    //   47: aconst_null
    //   48: astore 9
    //   50: aload_3
    //   51: getfield 120	com/tencent/mm/plugin/qqmail/b/n$b:pub	I
    //   54: ifne +732 -> 786
    //   57: aload_3
    //   58: getfield 21	com/tencent/mm/plugin/qqmail/b/n$b:puc	Ljava/util/Map;
    //   61: astore 10
    //   63: aload_0
    //   64: aload_1
    //   65: aload_2
    //   66: aload 10
    //   68: invokestatic 124	com/tencent/mm/plugin/qqmail/b/af:f	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   71: aconst_null
    //   72: invokestatic 129	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   75: putfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   78: aload_0
    //   79: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   82: getstatic 134	com/tencent/mm/plugin/qqmail/b/af:azs	I
    //   85: invokevirtual 139	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   88: aload_0
    //   89: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   92: astore 10
    //   94: aload_3
    //   95: getfield 120	com/tencent/mm/plugin/qqmail/b/n$b:pub	I
    //   98: ifne +694 -> 792
    //   101: ldc 141
    //   103: astore_1
    //   104: aload 10
    //   106: aload_1
    //   107: invokevirtual 144	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   110: aload_0
    //   111: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   114: invokevirtual 147	com/tencent/mm/network/u:amX	()V
    //   117: aload_0
    //   118: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   121: invokevirtual 150	com/tencent/mm/network/u:amY	()V
    //   124: aload_0
    //   125: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   128: iconst_0
    //   129: invokevirtual 154	com/tencent/mm/network/u:setUseCaches	(Z)V
    //   132: aload_0
    //   133: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   136: ldc 156
    //   138: getstatic 160	com/tencent/mm/plugin/qqmail/b/af:userAgent	Ljava/lang/String;
    //   141: invokevirtual 163	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: aload_0
    //   145: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   148: ldc 165
    //   150: getstatic 168	com/tencent/mm/plugin/qqmail/b/af:host	Ljava/lang/String;
    //   153: invokevirtual 163	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: ldc 170
    //   158: ldc 172
    //   160: invokestatic 177	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   163: pop
    //   164: aload_0
    //   165: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   168: ldc 179
    //   170: ldc 62
    //   172: invokevirtual 163	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   175: aload_0
    //   176: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   179: ldc 181
    //   181: ldc 183
    //   183: invokevirtual 163	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   186: aload_0
    //   187: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   190: ldc 185
    //   192: aload_3
    //   193: getfield 188	com/tencent/mm/plugin/qqmail/b/n$b:pud	Ljava/util/Map;
    //   196: invokestatic 192	com/tencent/mm/plugin/qqmail/b/af:W	(Ljava/util/Map;)Ljava/lang/String;
    //   199: invokevirtual 163	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: aload_0
    //   203: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   206: invokevirtual 195	com/tencent/mm/network/u:connect	()V
    //   209: aload_0
    //   210: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   213: invokevirtual 199	com/tencent/mm/network/u:getOutputStream	()Ljava/io/OutputStream;
    //   216: astore_1
    //   217: aload 8
    //   219: astore 7
    //   221: aload_1
    //   222: astore 5
    //   224: aload_3
    //   225: getfield 120	com/tencent/mm/plugin/qqmail/b/n$b:pub	I
    //   228: iconst_1
    //   229: if_icmpne +15 -> 244
    //   232: aload 8
    //   234: astore 7
    //   236: aload_1
    //   237: astore 5
    //   239: aload_3
    //   240: aload_1
    //   241: invokestatic 201	com/tencent/mm/plugin/qqmail/b/af:a	(Lcom/tencent/mm/plugin/qqmail/b/n$b;Ljava/io/OutputStream;)V
    //   244: aload 8
    //   246: astore 7
    //   248: aload_1
    //   249: astore 5
    //   251: aload_1
    //   252: invokevirtual 204	java/io/OutputStream:flush	()V
    //   255: aload 8
    //   257: astore 7
    //   259: aload_1
    //   260: astore 5
    //   262: aload_0
    //   263: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   266: invokevirtual 208	com/tencent/mm/network/u:getResponseCode	()I
    //   269: istore 11
    //   271: aload 9
    //   273: astore 12
    //   275: aload 8
    //   277: astore 7
    //   279: aload_1
    //   280: astore 5
    //   282: aload_0
    //   283: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   286: ldc 210
    //   288: invokevirtual 214	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   291: astore 13
    //   293: aload 9
    //   295: astore 12
    //   297: aload 8
    //   299: astore 7
    //   301: aload_1
    //   302: astore 5
    //   304: aload_0
    //   305: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   308: ldc 216
    //   310: invokevirtual 214	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   313: astore 6
    //   315: aload 9
    //   317: astore 12
    //   319: aload 8
    //   321: astore 7
    //   323: aload_1
    //   324: astore 5
    //   326: aload_0
    //   327: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   330: ldc 218
    //   332: invokevirtual 214	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   335: astore 10
    //   337: aload 10
    //   339: ifnull +460 -> 799
    //   342: aload 9
    //   344: astore 12
    //   346: aload 8
    //   348: astore 7
    //   350: aload_1
    //   351: astore 5
    //   353: aload 10
    //   355: ldc 220
    //   357: invokevirtual 224	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   360: ifeq +439 -> 799
    //   363: aload 9
    //   365: astore 12
    //   367: aload 8
    //   369: astore 7
    //   371: aload_1
    //   372: astore 5
    //   374: aload_2
    //   375: ldc 226
    //   377: invokevirtual 224	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   380: ifeq +419 -> 799
    //   383: iconst_1
    //   384: istore 14
    //   386: aload 9
    //   388: astore 12
    //   390: aload 8
    //   392: astore 7
    //   394: aload_1
    //   395: astore 5
    //   397: aload_0
    //   398: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   401: invokevirtual 230	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   404: astore 10
    //   406: aload 6
    //   408: ifnull +1045 -> 1453
    //   411: aload 6
    //   413: ldc 232
    //   415: invokevirtual 224	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   418: ifeq +1035 -> 1453
    //   421: new 234	java/util/zip/GZIPInputStream
    //   424: astore 7
    //   426: aload 7
    //   428: aload 10
    //   430: invokespecial 237	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   433: aload 7
    //   435: astore 10
    //   437: aconst_null
    //   438: astore 5
    //   440: aconst_null
    //   441: astore 7
    //   443: iload 14
    //   445: ifeq +386 -> 831
    //   448: aload 7
    //   450: astore 9
    //   452: aload 5
    //   454: astore 6
    //   456: new 239	java/io/File
    //   459: astore 12
    //   461: aload 7
    //   463: astore 9
    //   465: aload 5
    //   467: astore 6
    //   469: getstatic 242	com/tencent/mm/plugin/qqmail/b/af:pua	Ljava/lang/String;
    //   472: astore 8
    //   474: aload 7
    //   476: astore 9
    //   478: aload 5
    //   480: astore 6
    //   482: new 26	java/lang/StringBuilder
    //   485: astore 15
    //   487: aload 7
    //   489: astore 9
    //   491: aload 5
    //   493: astore 6
    //   495: aload 15
    //   497: invokespecial 30	java/lang/StringBuilder:<init>	()V
    //   500: aload 7
    //   502: astore 9
    //   504: aload 5
    //   506: astore 6
    //   508: aload_3
    //   509: getfield 21	com/tencent/mm/plugin/qqmail/b/n$b:puc	Ljava/util/Map;
    //   512: ldc 244
    //   514: invokeinterface 75 2 0
    //   519: ifnonnull +286 -> 805
    //   522: aload 7
    //   524: astore 9
    //   526: aload 5
    //   528: astore 6
    //   530: invokestatic 248	java/lang/System:currentTimeMillis	()J
    //   533: invokestatic 254	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   536: astore_3
    //   537: aload 7
    //   539: astore 9
    //   541: aload 5
    //   543: astore 6
    //   545: aload 12
    //   547: aload 8
    //   549: aload 15
    //   551: aload_3
    //   552: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   555: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   558: invokespecial 256	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   561: aload 7
    //   563: astore 9
    //   565: aload 5
    //   567: astore 6
    //   569: new 258	java/io/FileOutputStream
    //   572: astore_3
    //   573: aload 7
    //   575: astore 9
    //   577: aload 5
    //   579: astore 6
    //   581: aload_3
    //   582: aload 12
    //   584: iconst_1
    //   585: invokespecial 261	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   588: aload_3
    //   589: astore 9
    //   591: aload_3
    //   592: astore 6
    //   594: sipush 1024
    //   597: newarray byte
    //   599: astore 7
    //   601: aload_3
    //   602: astore 9
    //   604: aload_3
    //   605: astore 6
    //   607: aload 10
    //   609: aload 7
    //   611: invokevirtual 267	java/io/InputStream:read	([B)I
    //   614: istore 16
    //   616: iload 16
    //   618: ifle +232 -> 850
    //   621: aload_3
    //   622: astore 9
    //   624: aload_3
    //   625: astore 6
    //   627: aload_3
    //   628: aload 7
    //   630: iconst_0
    //   631: iload 16
    //   633: invokevirtual 270	java/io/OutputStream:write	([BII)V
    //   636: aload_3
    //   637: astore 9
    //   639: aload_3
    //   640: astore 6
    //   642: aload_3
    //   643: invokevirtual 204	java/io/OutputStream:flush	()V
    //   646: aload_3
    //   647: astore 9
    //   649: aload_3
    //   650: astore 6
    //   652: aload 4
    //   654: invokeinterface 275 1 0
    //   659: goto -58 -> 601
    //   662: astore_2
    //   663: aload 9
    //   665: astore 6
    //   667: ldc 100
    //   669: aload_2
    //   670: ldc 56
    //   672: iconst_0
    //   673: anewarray 277	java/lang/Object
    //   676: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   679: iload 11
    //   681: ifne +406 -> 1087
    //   684: sipush 503
    //   687: istore 14
    //   689: aload 9
    //   691: astore 6
    //   693: new 283	com/tencent/mm/plugin/qqmail/b/n$c
    //   696: dup
    //   697: iload 14
    //   699: aconst_null
    //   700: aconst_null
    //   701: invokespecial 286	com/tencent/mm/plugin/qqmail/b/n$c:<init>	(ILjava/util/Map;Ljava/lang/String;)V
    //   704: astore_2
    //   705: aload 9
    //   707: ifnull +35 -> 742
    //   710: aload 10
    //   712: astore 12
    //   714: aload 10
    //   716: astore 7
    //   718: aload_1
    //   719: astore 5
    //   721: aload 9
    //   723: invokevirtual 204	java/io/OutputStream:flush	()V
    //   726: aload 10
    //   728: astore 12
    //   730: aload 10
    //   732: astore 7
    //   734: aload_1
    //   735: astore 5
    //   737: aload 9
    //   739: invokevirtual 289	java/io/OutputStream:close	()V
    //   742: aload_1
    //   743: ifnull +7 -> 750
    //   746: aload_1
    //   747: invokevirtual 289	java/io/OutputStream:close	()V
    //   750: aload 10
    //   752: ifnull +8 -> 760
    //   755: aload 10
    //   757: invokevirtual 290	java/io/InputStream:close	()V
    //   760: aload_0
    //   761: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   764: ifnull +13 -> 777
    //   767: aload_0
    //   768: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   771: getfield 294	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   774: invokevirtual 299	java/net/HttpURLConnection:disconnect	()V
    //   777: ldc 98
    //   779: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   782: aload_2
    //   783: astore_1
    //   784: aload_1
    //   785: areturn
    //   786: aconst_null
    //   787: astore 10
    //   789: goto -726 -> 63
    //   792: ldc_w 301
    //   795: astore_1
    //   796: goto -692 -> 104
    //   799: iconst_0
    //   800: istore 14
    //   802: goto -416 -> 386
    //   805: aload 7
    //   807: astore 9
    //   809: aload 5
    //   811: astore 6
    //   813: aload_3
    //   814: getfield 21	com/tencent/mm/plugin/qqmail/b/n$b:puc	Ljava/util/Map;
    //   817: ldc 244
    //   819: invokeinterface 75 2 0
    //   824: checkcast 303	java/io/Serializable
    //   827: astore_3
    //   828: goto -291 -> 537
    //   831: aload 7
    //   833: astore 9
    //   835: aload 5
    //   837: astore 6
    //   839: new 305	java/io/ByteArrayOutputStream
    //   842: dup
    //   843: invokespecial 306	java/io/ByteArrayOutputStream:<init>	()V
    //   846: astore_3
    //   847: goto -259 -> 588
    //   850: aload_3
    //   851: astore 9
    //   853: aload_3
    //   854: astore 6
    //   856: new 283	com/tencent/mm/plugin/qqmail/b/n$c
    //   859: astore 8
    //   861: aload_3
    //   862: astore 9
    //   864: aload_3
    //   865: astore 6
    //   867: aload 13
    //   869: invokestatic 310	com/tencent/mm/plugin/qqmail/b/af:Vh	(Ljava/lang/String;)Ljava/util/Map;
    //   872: astore 7
    //   874: iload 14
    //   876: ifeq +154 -> 1030
    //   879: ldc 56
    //   881: astore 4
    //   883: aload_3
    //   884: astore 9
    //   886: aload_3
    //   887: astore 6
    //   889: aload 8
    //   891: iload 11
    //   893: aload 7
    //   895: aload 4
    //   897: invokespecial 286	com/tencent/mm/plugin/qqmail/b/n$c:<init>	(ILjava/util/Map;Ljava/lang/String;)V
    //   900: aload_3
    //   901: astore 9
    //   903: aload_3
    //   904: astore 6
    //   906: new 26	java/lang/StringBuilder
    //   909: astore 4
    //   911: aload_3
    //   912: astore 9
    //   914: aload_3
    //   915: astore 6
    //   917: aload 4
    //   919: ldc 102
    //   921: invokespecial 105	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   924: aload_3
    //   925: astore 9
    //   927: aload_3
    //   928: astore 6
    //   930: ldc 100
    //   932: aload 4
    //   934: aload_2
    //   935: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   938: ldc 107
    //   940: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   943: aload 8
    //   945: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   948: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   951: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   954: aload 10
    //   956: astore 12
    //   958: aload 10
    //   960: astore 7
    //   962: aload_1
    //   963: astore 5
    //   965: aload_3
    //   966: invokevirtual 204	java/io/OutputStream:flush	()V
    //   969: aload 10
    //   971: astore 12
    //   973: aload 10
    //   975: astore 7
    //   977: aload_1
    //   978: astore 5
    //   980: aload_3
    //   981: invokevirtual 289	java/io/OutputStream:close	()V
    //   984: aload_1
    //   985: ifnull +7 -> 992
    //   988: aload_1
    //   989: invokevirtual 289	java/io/OutputStream:close	()V
    //   992: aload 10
    //   994: ifnull +8 -> 1002
    //   997: aload 10
    //   999: invokevirtual 290	java/io/InputStream:close	()V
    //   1002: aload_0
    //   1003: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   1006: ifnull +13 -> 1019
    //   1009: aload_0
    //   1010: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   1013: getfield 294	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   1016: invokevirtual 299	java/net/HttpURLConnection:disconnect	()V
    //   1019: ldc 98
    //   1021: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1024: aload 8
    //   1026: astore_1
    //   1027: goto -243 -> 784
    //   1030: aload_3
    //   1031: astore 9
    //   1033: aload_3
    //   1034: astore 6
    //   1036: new 54	java/lang/String
    //   1039: dup
    //   1040: aload_3
    //   1041: checkcast 305	java/io/ByteArrayOutputStream
    //   1044: invokevirtual 313	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   1047: invokespecial 315	java/lang/String:<init>	([B)V
    //   1050: astore 4
    //   1052: goto -169 -> 883
    //   1055: astore_1
    //   1056: ldc 100
    //   1058: aload_1
    //   1059: ldc 56
    //   1061: iconst_0
    //   1062: anewarray 277	java/lang/Object
    //   1065: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1068: goto -76 -> 992
    //   1071: astore_1
    //   1072: ldc 100
    //   1074: aload_1
    //   1075: ldc 56
    //   1077: iconst_0
    //   1078: anewarray 277	java/lang/Object
    //   1081: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1084: goto -82 -> 1002
    //   1087: sipush 500
    //   1090: istore 14
    //   1092: goto -403 -> 689
    //   1095: astore_1
    //   1096: ldc 100
    //   1098: aload_1
    //   1099: ldc 56
    //   1101: iconst_0
    //   1102: anewarray 277	java/lang/Object
    //   1105: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1108: goto -358 -> 750
    //   1111: astore_1
    //   1112: ldc 100
    //   1114: aload_1
    //   1115: ldc 56
    //   1117: iconst_0
    //   1118: anewarray 277	java/lang/Object
    //   1121: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1124: goto -364 -> 760
    //   1127: astore_2
    //   1128: aload 6
    //   1130: ifnull +35 -> 1165
    //   1133: aload 10
    //   1135: astore 12
    //   1137: aload 10
    //   1139: astore 7
    //   1141: aload_1
    //   1142: astore 5
    //   1144: aload 6
    //   1146: invokevirtual 204	java/io/OutputStream:flush	()V
    //   1149: aload 10
    //   1151: astore 12
    //   1153: aload 10
    //   1155: astore 7
    //   1157: aload_1
    //   1158: astore 5
    //   1160: aload 6
    //   1162: invokevirtual 289	java/io/OutputStream:close	()V
    //   1165: aload 10
    //   1167: astore 12
    //   1169: aload 10
    //   1171: astore 7
    //   1173: aload_1
    //   1174: astore 5
    //   1176: ldc 98
    //   1178: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1181: aload 10
    //   1183: astore 12
    //   1185: aload 10
    //   1187: astore 7
    //   1189: aload_1
    //   1190: astore 5
    //   1192: aload_2
    //   1193: athrow
    //   1194: astore_3
    //   1195: aload 12
    //   1197: astore_2
    //   1198: aload_2
    //   1199: astore 7
    //   1201: aload_1
    //   1202: astore 5
    //   1204: ldc 100
    //   1206: aload_3
    //   1207: ldc 56
    //   1209: iconst_0
    //   1210: anewarray 277	java/lang/Object
    //   1213: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1216: iload 11
    //   1218: ifne +69 -> 1287
    //   1221: sipush 503
    //   1224: istore 11
    //   1226: aload_2
    //   1227: astore 7
    //   1229: aload_1
    //   1230: astore 5
    //   1232: new 283	com/tencent/mm/plugin/qqmail/b/n$c
    //   1235: dup
    //   1236: iload 11
    //   1238: aconst_null
    //   1239: aconst_null
    //   1240: invokespecial 286	com/tencent/mm/plugin/qqmail/b/n$c:<init>	(ILjava/util/Map;Ljava/lang/String;)V
    //   1243: astore_3
    //   1244: aload_1
    //   1245: ifnull +7 -> 1252
    //   1248: aload_1
    //   1249: invokevirtual 289	java/io/OutputStream:close	()V
    //   1252: aload_2
    //   1253: ifnull +7 -> 1260
    //   1256: aload_2
    //   1257: invokevirtual 290	java/io/InputStream:close	()V
    //   1260: aload_0
    //   1261: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   1264: ifnull +13 -> 1277
    //   1267: aload_0
    //   1268: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   1271: getfield 294	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   1274: invokevirtual 299	java/net/HttpURLConnection:disconnect	()V
    //   1277: ldc 98
    //   1279: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1282: aload_3
    //   1283: astore_1
    //   1284: goto -500 -> 784
    //   1287: sipush 500
    //   1290: istore 11
    //   1292: goto -66 -> 1226
    //   1295: astore_1
    //   1296: ldc 100
    //   1298: aload_1
    //   1299: ldc 56
    //   1301: iconst_0
    //   1302: anewarray 277	java/lang/Object
    //   1305: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1308: goto -56 -> 1252
    //   1311: astore_1
    //   1312: ldc 100
    //   1314: aload_1
    //   1315: ldc 56
    //   1317: iconst_0
    //   1318: anewarray 277	java/lang/Object
    //   1321: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1324: goto -64 -> 1260
    //   1327: astore_1
    //   1328: aload 5
    //   1330: astore_2
    //   1331: aload_2
    //   1332: ifnull +7 -> 1339
    //   1335: aload_2
    //   1336: invokevirtual 289	java/io/OutputStream:close	()V
    //   1339: aload 7
    //   1341: ifnull +8 -> 1349
    //   1344: aload 7
    //   1346: invokevirtual 290	java/io/InputStream:close	()V
    //   1349: aload_0
    //   1350: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   1353: ifnull +13 -> 1366
    //   1356: aload_0
    //   1357: getfield 131	com/tencent/mm/plugin/qqmail/b/af:pvF	Lcom/tencent/mm/network/u;
    //   1360: getfield 294	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   1363: invokevirtual 299	java/net/HttpURLConnection:disconnect	()V
    //   1366: ldc 98
    //   1368: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1371: aload_1
    //   1372: athrow
    //   1373: astore_2
    //   1374: ldc 100
    //   1376: aload_2
    //   1377: ldc 56
    //   1379: iconst_0
    //   1380: anewarray 277	java/lang/Object
    //   1383: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1386: goto -47 -> 1339
    //   1389: astore_2
    //   1390: ldc 100
    //   1392: aload_2
    //   1393: ldc 56
    //   1395: iconst_0
    //   1396: anewarray 277	java/lang/Object
    //   1399: invokestatic 281	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1402: goto -53 -> 1349
    //   1405: astore_1
    //   1406: aload 5
    //   1408: astore_2
    //   1409: goto -78 -> 1331
    //   1412: astore_3
    //   1413: aload_1
    //   1414: astore_2
    //   1415: aload_3
    //   1416: astore_1
    //   1417: aload 10
    //   1419: astore 7
    //   1421: goto -90 -> 1331
    //   1424: astore_3
    //   1425: iconst_0
    //   1426: istore 11
    //   1428: aconst_null
    //   1429: astore_1
    //   1430: aload 6
    //   1432: astore_2
    //   1433: goto -235 -> 1198
    //   1436: astore_3
    //   1437: iconst_0
    //   1438: istore 11
    //   1440: aload 6
    //   1442: astore_2
    //   1443: goto -245 -> 1198
    //   1446: astore_3
    //   1447: aload 10
    //   1449: astore_2
    //   1450: goto -252 -> 1198
    //   1453: goto -1016 -> 437
    //
    // Exception table:
    //   from	to	target	type
    //   456	461	662	java/lang/Exception
    //   469	474	662	java/lang/Exception
    //   482	487	662	java/lang/Exception
    //   495	500	662	java/lang/Exception
    //   508	522	662	java/lang/Exception
    //   530	537	662	java/lang/Exception
    //   545	561	662	java/lang/Exception
    //   569	573	662	java/lang/Exception
    //   581	588	662	java/lang/Exception
    //   594	601	662	java/lang/Exception
    //   607	616	662	java/lang/Exception
    //   627	636	662	java/lang/Exception
    //   642	646	662	java/lang/Exception
    //   652	659	662	java/lang/Exception
    //   813	828	662	java/lang/Exception
    //   839	847	662	java/lang/Exception
    //   856	861	662	java/lang/Exception
    //   867	874	662	java/lang/Exception
    //   889	900	662	java/lang/Exception
    //   906	911	662	java/lang/Exception
    //   917	924	662	java/lang/Exception
    //   930	954	662	java/lang/Exception
    //   1036	1052	662	java/lang/Exception
    //   988	992	1055	java/io/IOException
    //   997	1002	1071	java/io/IOException
    //   746	750	1095	java/io/IOException
    //   755	760	1111	java/io/IOException
    //   456	461	1127	finally
    //   469	474	1127	finally
    //   482	487	1127	finally
    //   495	500	1127	finally
    //   508	522	1127	finally
    //   530	537	1127	finally
    //   545	561	1127	finally
    //   569	573	1127	finally
    //   581	588	1127	finally
    //   594	601	1127	finally
    //   607	616	1127	finally
    //   627	636	1127	finally
    //   642	646	1127	finally
    //   652	659	1127	finally
    //   667	679	1127	finally
    //   693	705	1127	finally
    //   813	828	1127	finally
    //   839	847	1127	finally
    //   856	861	1127	finally
    //   867	874	1127	finally
    //   889	900	1127	finally
    //   906	911	1127	finally
    //   917	924	1127	finally
    //   930	954	1127	finally
    //   1036	1052	1127	finally
    //   282	293	1194	java/lang/Exception
    //   304	315	1194	java/lang/Exception
    //   326	337	1194	java/lang/Exception
    //   353	363	1194	java/lang/Exception
    //   374	383	1194	java/lang/Exception
    //   397	406	1194	java/lang/Exception
    //   721	726	1194	java/lang/Exception
    //   737	742	1194	java/lang/Exception
    //   965	969	1194	java/lang/Exception
    //   980	984	1194	java/lang/Exception
    //   1144	1149	1194	java/lang/Exception
    //   1160	1165	1194	java/lang/Exception
    //   1176	1181	1194	java/lang/Exception
    //   1192	1194	1194	java/lang/Exception
    //   1248	1252	1295	java/io/IOException
    //   1256	1260	1311	java/io/IOException
    //   50	63	1327	finally
    //   63	101	1327	finally
    //   104	217	1327	finally
    //   1335	1339	1373	java/io/IOException
    //   1344	1349	1389	java/io/IOException
    //   224	232	1405	finally
    //   239	244	1405	finally
    //   251	255	1405	finally
    //   262	271	1405	finally
    //   282	293	1405	finally
    //   304	315	1405	finally
    //   326	337	1405	finally
    //   353	363	1405	finally
    //   374	383	1405	finally
    //   397	406	1405	finally
    //   721	726	1405	finally
    //   737	742	1405	finally
    //   965	969	1405	finally
    //   980	984	1405	finally
    //   1144	1149	1405	finally
    //   1160	1165	1405	finally
    //   1176	1181	1405	finally
    //   1192	1194	1405	finally
    //   1204	1216	1405	finally
    //   1232	1244	1405	finally
    //   411	433	1412	finally
    //   50	63	1424	java/lang/Exception
    //   63	101	1424	java/lang/Exception
    //   104	217	1424	java/lang/Exception
    //   224	232	1436	java/lang/Exception
    //   239	244	1436	java/lang/Exception
    //   251	255	1436	java/lang/Exception
    //   262	271	1436	java/lang/Exception
    //   411	433	1446	java/lang/Exception
  }

  public final void cancel()
  {
    AppMethodBeat.i(68071);
    ab.d("MicroMsg.URLConnectionUtil", "cancel conection.");
    if (this.pvF != null)
      this.pvF.connection.disconnect();
    AppMethodBeat.o(68071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.af
 * JD-Core Version:    0.6.2
 */