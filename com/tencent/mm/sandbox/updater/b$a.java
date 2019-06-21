package com.tencent.mm.sandbox.updater;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.u;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.api;
import com.tencent.mm.protocal.protobuf.apj;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.HttpURLConnection;

final class b$a extends AsyncTask<api, Integer, apj>
{
  private String host;
  private u pvF;
  private com.tencent.mm.sandbox.b.a xvR;
  private int xvV;
  private PInt xvW;

  public b$a(b paramb, String paramString, com.tencent.mm.sandbox.b.a parama)
  {
    AppMethodBeat.i(28846);
    this.pvF = null;
    this.xvV = 200;
    this.xvW = new PInt();
    this.host = null;
    this.xvR = null;
    this.host = paramString;
    this.xvR = parama;
    AppMethodBeat.o(28846);
  }

  // ERROR //
  private apj a(api[] paramArrayOfapi)
  {
    // Byte code:
    //   0: sipush 28847
    //   3: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: arraylength
    //   8: ifeq +9 -> 17
    //   11: aload_1
    //   12: iconst_0
    //   13: aaload
    //   14: ifnonnull +18 -> 32
    //   17: aload_0
    //   18: iconst_m1
    //   19: putfield 37	com/tencent/mm/sandbox/updater/b$a:xvV	I
    //   22: aconst_null
    //   23: astore_1
    //   24: sipush 28847
    //   27: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: aload_1
    //   31: areturn
    //   32: ldc 57
    //   34: new 59	java/lang/StringBuilder
    //   37: dup
    //   38: ldc 61
    //   40: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   43: aload_1
    //   44: iconst_0
    //   45: aaload
    //   46: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   49: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   55: aload_1
    //   56: iconst_0
    //   57: aaload
    //   58: astore_1
    //   59: new 80	com/tencent/mm/pointers/PByteArray
    //   62: dup
    //   63: invokespecial 81	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   66: astore_2
    //   67: bipush 6
    //   69: istore_3
    //   70: getstatic 87	com/tencent/mm/sdk/a/b:foreground	Z
    //   73: ifeq +6 -> 79
    //   76: bipush 7
    //   78: istore_3
    //   79: aload_1
    //   80: invokevirtual 93	com/tencent/mm/protocal/protobuf/api:toByteArray	()[B
    //   83: astore_1
    //   84: iconst_0
    //   85: istore 4
    //   87: iload 4
    //   89: istore 5
    //   91: aload_0
    //   92: getfield 24	com/tencent/mm/sandbox/updater/b$a:xvU	Lcom/tencent/mm/sandbox/updater/b;
    //   95: invokestatic 97	com/tencent/mm/sandbox/updater/b:j	(Lcom/tencent/mm/sandbox/updater/b;)[B
    //   98: invokestatic 103	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   101: ifne +34 -> 135
    //   104: iload 4
    //   106: istore 5
    //   108: aload_1
    //   109: invokestatic 103	com/tencent/mm/sdk/platformtools/bo:cb	([B)Z
    //   112: ifne +23 -> 135
    //   115: aload_0
    //   116: getfield 24	com/tencent/mm/sandbox/updater/b$a:xvU	Lcom/tencent/mm/sandbox/updater/b;
    //   119: invokestatic 107	com/tencent/mm/sandbox/updater/b:k	(Lcom/tencent/mm/sandbox/updater/b;)I
    //   122: aload_0
    //   123: getfield 24	com/tencent/mm/sandbox/updater/b$a:xvU	Lcom/tencent/mm/sandbox/updater/b;
    //   126: invokestatic 97	com/tencent/mm/sandbox/updater/b:j	(Lcom/tencent/mm/sandbox/updater/b;)[B
    //   129: aload_1
    //   130: invokestatic 113	com/tencent/mm/protocal/MMProtocalJni:genSignature	(I[B[B)I
    //   133: istore 5
    //   135: aload_1
    //   136: aload_2
    //   137: aload_0
    //   138: getfield 24	com/tencent/mm/sandbox/updater/b$a:xvU	Lcom/tencent/mm/sandbox/updater/b;
    //   141: invokestatic 116	com/tencent/mm/sandbox/updater/b:l	(Lcom/tencent/mm/sandbox/updater/b;)[B
    //   144: iconst_0
    //   145: aload_0
    //   146: getfield 24	com/tencent/mm/sandbox/updater/b$a:xvU	Lcom/tencent/mm/sandbox/updater/b;
    //   149: invokestatic 119	com/tencent/mm/sandbox/updater/b:m	(Lcom/tencent/mm/sandbox/updater/b;)[B
    //   152: invokestatic 124	com/tencent/mm/compatible/e/q:LM	()Ljava/lang/String;
    //   155: aload_0
    //   156: getfield 24	com/tencent/mm/sandbox/updater/b$a:xvU	Lcom/tencent/mm/sandbox/updater/b;
    //   159: invokestatic 107	com/tencent/mm/sandbox/updater/b:k	(Lcom/tencent/mm/sandbox/updater/b;)I
    //   162: bipush 113
    //   164: iconst_0
    //   165: iconst_0
    //   166: newarray byte
    //   168: iconst_0
    //   169: newarray byte
    //   171: iload 5
    //   173: iload_3
    //   174: iconst_0
    //   175: invokestatic 128	com/tencent/mm/protocal/MMProtocalJni:pack	([BLcom/tencent/mm/pointers/PByteArray;[BI[BLjava/lang/String;III[B[BIII)Z
    //   178: pop
    //   179: aconst_null
    //   180: astore 6
    //   182: aconst_null
    //   183: astore 7
    //   185: aconst_null
    //   186: astore 8
    //   188: new 59	java/lang/StringBuilder
    //   191: astore_1
    //   192: aload_1
    //   193: ldc 130
    //   195: invokespecial 64	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   198: aload_0
    //   199: aload_1
    //   200: aload_0
    //   201: getfield 44	com/tencent/mm/sandbox/updater/b$a:host	Ljava/lang/String;
    //   204: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: ldc 135
    //   209: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   215: aconst_null
    //   216: invokestatic 140	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   219: putfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   222: aload_0
    //   223: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   226: ldc 142
    //   228: invokevirtual 147	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   231: aload_0
    //   232: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   235: invokevirtual 150	com/tencent/mm/network/u:amX	()V
    //   238: aload_0
    //   239: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   242: invokevirtual 153	com/tencent/mm/network/u:amY	()V
    //   245: aload_0
    //   246: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   249: iconst_0
    //   250: invokevirtual 157	com/tencent/mm/network/u:setUseCaches	(Z)V
    //   253: aload_0
    //   254: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   257: ldc 159
    //   259: ldc 161
    //   261: invokevirtual 164	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   264: aload_0
    //   265: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   268: ldc 166
    //   270: ldc 168
    //   272: invokevirtual 164	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   275: aload_0
    //   276: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   279: ldc 170
    //   281: ldc 172
    //   283: invokevirtual 164	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   286: aload_0
    //   287: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   290: ldc 174
    //   292: ldc 176
    //   294: invokevirtual 164	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   297: aload_0
    //   298: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   301: ldc 178
    //   303: ldc 180
    //   305: invokevirtual 164	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   308: aload_0
    //   309: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   312: ldc 182
    //   314: ldc 184
    //   316: invokevirtual 164	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   319: aload_0
    //   320: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   323: sipush 15000
    //   326: invokevirtual 187	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   329: aload_0
    //   330: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   333: invokevirtual 190	com/tencent/mm/network/u:connect	()V
    //   336: aload_0
    //   337: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   340: invokevirtual 194	com/tencent/mm/network/u:getOutputStream	()Ljava/io/OutputStream;
    //   343: astore_1
    //   344: aload_1
    //   345: aload_2
    //   346: getfield 198	com/tencent/mm/pointers/PByteArray:value	[B
    //   349: invokevirtual 204	java/io/OutputStream:write	([B)V
    //   352: aload_1
    //   353: invokevirtual 207	java/io/OutputStream:flush	()V
    //   356: aload_0
    //   357: getfield 46	com/tencent/mm/sandbox/updater/b$a:xvR	Lcom/tencent/mm/sandbox/b$a;
    //   360: ldc2_w 208
    //   363: aload_2
    //   364: getfield 198	com/tencent/mm/pointers/PByteArray:value	[B
    //   367: arraylength
    //   368: i2l
    //   369: ladd
    //   370: invokeinterface 215 3 0
    //   375: aload_0
    //   376: aload_0
    //   377: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   380: invokevirtual 219	com/tencent/mm/network/u:getResponseCode	()I
    //   383: putfield 37	com/tencent/mm/sandbox/updater/b$a:xvV	I
    //   386: aload_0
    //   387: getfield 37	com/tencent/mm/sandbox/updater/b$a:xvV	I
    //   390: istore_3
    //   391: iload_3
    //   392: sipush 200
    //   395: if_icmpeq +102 -> 497
    //   398: aload_1
    //   399: ifnull +7 -> 406
    //   402: aload_1
    //   403: invokevirtual 222	java/io/OutputStream:close	()V
    //   406: aload_0
    //   407: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   410: ifnull +18 -> 428
    //   413: aload_0
    //   414: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   417: getfield 226	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   420: invokevirtual 231	java/net/HttpURLConnection:disconnect	()V
    //   423: aload_0
    //   424: aconst_null
    //   425: putfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   428: aconst_null
    //   429: astore_1
    //   430: sipush 28847
    //   433: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   436: goto -406 -> 30
    //   439: astore_1
    //   440: ldc 57
    //   442: ldc 233
    //   444: iconst_1
    //   445: anewarray 235	java/lang/Object
    //   448: dup
    //   449: iconst_0
    //   450: aload_1
    //   451: invokevirtual 238	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   454: aastore
    //   455: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   458: ldc 57
    //   460: aload_1
    //   461: ldc 244
    //   463: iconst_0
    //   464: anewarray 235	java/lang/Object
    //   467: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   470: aconst_null
    //   471: astore_1
    //   472: sipush 28847
    //   475: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   478: goto -448 -> 30
    //   481: astore_1
    //   482: ldc 57
    //   484: aload_1
    //   485: ldc 244
    //   487: iconst_0
    //   488: anewarray 235	java/lang/Object
    //   491: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   494: goto -88 -> 406
    //   497: aload_0
    //   498: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   501: ldc 250
    //   503: invokevirtual 254	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   506: astore 7
    //   508: aload_0
    //   509: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   512: invokevirtual 258	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   515: astore 6
    //   517: ldc2_w 208
    //   520: lstore 9
    //   522: aload 7
    //   524: ifnull +77 -> 601
    //   527: aload 7
    //   529: ldc_w 260
    //   532: invokevirtual 266	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   535: ifeq +66 -> 601
    //   538: new 268	java/util/zip/GZIPInputStream
    //   541: astore 7
    //   543: aload 7
    //   545: aload 6
    //   547: invokespecial 271	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   550: iconst_1
    //   551: istore_3
    //   552: new 273	java/io/ByteArrayOutputStream
    //   555: astore 8
    //   557: aload 8
    //   559: invokespecial 274	java/io/ByteArrayOutputStream:<init>	()V
    //   562: sipush 1024
    //   565: newarray byte
    //   567: astore_2
    //   568: aload 7
    //   570: aload_2
    //   571: invokevirtual 280	java/io/InputStream:read	([B)I
    //   574: istore 5
    //   576: iload 5
    //   578: ifle +32 -> 610
    //   581: aload 8
    //   583: aload_2
    //   584: iconst_0
    //   585: iload 5
    //   587: invokevirtual 283	java/io/ByteArrayOutputStream:write	([BII)V
    //   590: lload 9
    //   592: iload 5
    //   594: i2l
    //   595: ladd
    //   596: lstore 9
    //   598: goto -30 -> 568
    //   601: iconst_0
    //   602: istore_3
    //   603: aload 6
    //   605: astore 7
    //   607: goto -55 -> 552
    //   610: iload_3
    //   611: ifeq +212 -> 823
    //   614: aload 6
    //   616: invokevirtual 287	java/io/InputStream:markSupported	()Z
    //   619: ifeq +204 -> 823
    //   622: aload 6
    //   624: iconst_1
    //   625: invokevirtual 290	java/io/InputStream:mark	(I)V
    //   628: ldc2_w 208
    //   631: lstore 9
    //   633: aload 6
    //   635: aload_2
    //   636: invokevirtual 280	java/io/InputStream:read	([B)I
    //   639: istore_3
    //   640: iload_3
    //   641: ifle +13 -> 654
    //   644: lload 9
    //   646: iload_3
    //   647: i2l
    //   648: ladd
    //   649: lstore 9
    //   651: goto -18 -> 633
    //   654: aload_0
    //   655: getfield 46	com/tencent/mm/sandbox/updater/b$a:xvR	Lcom/tencent/mm/sandbox/b$a;
    //   658: lload 9
    //   660: invokeinterface 293 3 0
    //   665: new 80	com/tencent/mm/pointers/PByteArray
    //   668: astore 6
    //   670: aload 6
    //   672: invokespecial 81	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   675: new 80	com/tencent/mm/pointers/PByteArray
    //   678: astore_2
    //   679: aload_2
    //   680: invokespecial 81	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   683: new 39	com/tencent/mm/pointers/PInt
    //   686: astore 11
    //   688: aload 11
    //   690: invokespecial 40	com/tencent/mm/pointers/PInt:<init>	()V
    //   693: new 39	com/tencent/mm/pointers/PInt
    //   696: astore 12
    //   698: aload 12
    //   700: iconst_0
    //   701: invokespecial 295	com/tencent/mm/pointers/PInt:<init>	(I)V
    //   704: new 39	com/tencent/mm/pointers/PInt
    //   707: astore 13
    //   709: aload 13
    //   711: sipush 255
    //   714: invokespecial 295	com/tencent/mm/pointers/PInt:<init>	(I)V
    //   717: aload 6
    //   719: aload 8
    //   721: invokevirtual 296	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   724: aload_0
    //   725: getfield 24	com/tencent/mm/sandbox/updater/b$a:xvU	Lcom/tencent/mm/sandbox/updater/b;
    //   728: invokestatic 116	com/tencent/mm/sandbox/updater/b:l	(Lcom/tencent/mm/sandbox/updater/b;)[B
    //   731: aload_2
    //   732: aload_0
    //   733: getfield 42	com/tencent/mm/sandbox/updater/b$a:xvW	Lcom/tencent/mm/pointers/PInt;
    //   736: aload 11
    //   738: aload 12
    //   740: aload 13
    //   742: invokestatic 300	com/tencent/mm/protocal/MMProtocalJni:unpack	(Lcom/tencent/mm/pointers/PByteArray;[B[BLcom/tencent/mm/pointers/PByteArray;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   745: pop
    //   746: new 302	com/tencent/mm/protocal/protobuf/apj
    //   749: astore 8
    //   751: aload 8
    //   753: invokespecial 303	com/tencent/mm/protocal/protobuf/apj:<init>	()V
    //   756: aload 8
    //   758: aload 6
    //   760: getfield 198	com/tencent/mm/pointers/PByteArray:value	[B
    //   763: invokevirtual 307	com/tencent/mm/protocal/protobuf/apj:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   766: checkcast 302	com/tencent/mm/protocal/protobuf/apj
    //   769: astore 6
    //   771: aload_1
    //   772: ifnull +7 -> 779
    //   775: aload_1
    //   776: invokevirtual 222	java/io/OutputStream:close	()V
    //   779: aload 7
    //   781: ifnull +8 -> 789
    //   784: aload 7
    //   786: invokevirtual 308	java/io/InputStream:close	()V
    //   789: aload_0
    //   790: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   793: ifnull +18 -> 811
    //   796: aload_0
    //   797: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   800: getfield 226	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   803: invokevirtual 231	java/net/HttpURLConnection:disconnect	()V
    //   806: aload_0
    //   807: aconst_null
    //   808: putfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   811: sipush 28847
    //   814: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   817: aload 6
    //   819: astore_1
    //   820: goto -790 -> 30
    //   823: aload_0
    //   824: getfield 46	com/tencent/mm/sandbox/updater/b$a:xvR	Lcom/tencent/mm/sandbox/b$a;
    //   827: lload 9
    //   829: invokeinterface 293 3 0
    //   834: goto -169 -> 665
    //   837: astore 6
    //   839: aload 7
    //   841: astore 8
    //   843: aload_1
    //   844: astore 7
    //   846: aload 8
    //   848: astore_1
    //   849: ldc 57
    //   851: ldc_w 310
    //   854: iconst_1
    //   855: anewarray 235	java/lang/Object
    //   858: dup
    //   859: iconst_0
    //   860: aload 6
    //   862: invokevirtual 238	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   865: aastore
    //   866: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   869: ldc 57
    //   871: aload 6
    //   873: ldc 244
    //   875: iconst_0
    //   876: anewarray 235	java/lang/Object
    //   879: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   882: aload_0
    //   883: iconst_m1
    //   884: putfield 37	com/tencent/mm/sandbox/updater/b$a:xvV	I
    //   887: aload 7
    //   889: ifnull +8 -> 897
    //   892: aload 7
    //   894: invokevirtual 222	java/io/OutputStream:close	()V
    //   897: aload_1
    //   898: ifnull +7 -> 905
    //   901: aload_1
    //   902: invokevirtual 308	java/io/InputStream:close	()V
    //   905: aload_0
    //   906: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   909: ifnull +18 -> 927
    //   912: aload_0
    //   913: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   916: getfield 226	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   919: invokevirtual 231	java/net/HttpURLConnection:disconnect	()V
    //   922: aload_0
    //   923: aconst_null
    //   924: putfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   927: aconst_null
    //   928: astore_1
    //   929: sipush 28847
    //   932: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   935: goto -905 -> 30
    //   938: astore_1
    //   939: ldc 57
    //   941: aload_1
    //   942: ldc 244
    //   944: iconst_0
    //   945: anewarray 235	java/lang/Object
    //   948: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   951: goto -172 -> 779
    //   954: astore_1
    //   955: ldc 57
    //   957: aload_1
    //   958: ldc 244
    //   960: iconst_0
    //   961: anewarray 235	java/lang/Object
    //   964: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   967: goto -178 -> 789
    //   970: astore 7
    //   972: ldc 57
    //   974: aload 7
    //   976: ldc 244
    //   978: iconst_0
    //   979: anewarray 235	java/lang/Object
    //   982: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   985: goto -88 -> 897
    //   988: astore_1
    //   989: ldc 57
    //   991: aload_1
    //   992: ldc 244
    //   994: iconst_0
    //   995: anewarray 235	java/lang/Object
    //   998: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1001: goto -96 -> 905
    //   1004: astore_1
    //   1005: aload 6
    //   1007: astore 7
    //   1009: aload 8
    //   1011: astore 6
    //   1013: aload 7
    //   1015: ifnull +8 -> 1023
    //   1018: aload 7
    //   1020: invokevirtual 222	java/io/OutputStream:close	()V
    //   1023: aload 6
    //   1025: ifnull +8 -> 1033
    //   1028: aload 6
    //   1030: invokevirtual 308	java/io/InputStream:close	()V
    //   1033: aload_0
    //   1034: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   1037: ifnull +18 -> 1055
    //   1040: aload_0
    //   1041: getfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   1044: getfield 226	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   1047: invokevirtual 231	java/net/HttpURLConnection:disconnect	()V
    //   1050: aload_0
    //   1051: aconst_null
    //   1052: putfield 35	com/tencent/mm/sandbox/updater/b$a:pvF	Lcom/tencent/mm/network/u;
    //   1055: sipush 28847
    //   1058: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1061: aload_1
    //   1062: athrow
    //   1063: astore 7
    //   1065: ldc 57
    //   1067: aload 7
    //   1069: ldc 244
    //   1071: iconst_0
    //   1072: anewarray 235	java/lang/Object
    //   1075: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1078: goto -55 -> 1023
    //   1081: astore 7
    //   1083: ldc 57
    //   1085: aload 7
    //   1087: ldc 244
    //   1089: iconst_0
    //   1090: anewarray 235	java/lang/Object
    //   1093: invokestatic 248	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1096: goto -63 -> 1033
    //   1099: astore 6
    //   1101: aload_1
    //   1102: astore 7
    //   1104: aload 6
    //   1106: astore_1
    //   1107: aload 8
    //   1109: astore 6
    //   1111: goto -98 -> 1013
    //   1114: astore 6
    //   1116: aload 7
    //   1118: astore 8
    //   1120: aload_1
    //   1121: astore 7
    //   1123: aload 6
    //   1125: astore_1
    //   1126: aload 8
    //   1128: astore 6
    //   1130: goto -117 -> 1013
    //   1133: astore 6
    //   1135: aload_1
    //   1136: astore 8
    //   1138: aload 6
    //   1140: astore_1
    //   1141: aload 8
    //   1143: astore 6
    //   1145: goto -132 -> 1013
    //   1148: astore 6
    //   1150: aconst_null
    //   1151: astore_1
    //   1152: goto -303 -> 849
    //   1155: astore 6
    //   1157: aconst_null
    //   1158: astore 8
    //   1160: aload_1
    //   1161: astore 7
    //   1163: aload 8
    //   1165: astore_1
    //   1166: goto -317 -> 849
    //
    // Exception table:
    //   from	to	target	type
    //   79	84	439	java/lang/Exception
    //   91	104	439	java/lang/Exception
    //   108	135	439	java/lang/Exception
    //   135	179	439	java/lang/Exception
    //   402	406	481	java/io/IOException
    //   552	568	837	java/lang/Exception
    //   568	576	837	java/lang/Exception
    //   581	590	837	java/lang/Exception
    //   614	628	837	java/lang/Exception
    //   633	640	837	java/lang/Exception
    //   654	665	837	java/lang/Exception
    //   665	771	837	java/lang/Exception
    //   823	834	837	java/lang/Exception
    //   775	779	938	java/io/IOException
    //   784	789	954	java/io/IOException
    //   892	897	970	java/io/IOException
    //   901	905	988	java/io/IOException
    //   188	344	1004	finally
    //   1018	1023	1063	java/io/IOException
    //   1028	1033	1081	java/io/IOException
    //   344	391	1099	finally
    //   497	517	1099	finally
    //   527	550	1099	finally
    //   552	568	1114	finally
    //   568	576	1114	finally
    //   581	590	1114	finally
    //   614	628	1114	finally
    //   633	640	1114	finally
    //   654	665	1114	finally
    //   665	771	1114	finally
    //   823	834	1114	finally
    //   849	887	1133	finally
    //   188	344	1148	java/lang/Exception
    //   344	391	1155	java/lang/Exception
    //   497	517	1155	java/lang/Exception
    //   527	550	1155	java/lang/Exception
  }

  protected final void onCancelled()
  {
    AppMethodBeat.i(28848);
    ab.d("MicroMsg.NetSceneGetUpdatePack", "task had been cancelled.");
    if (this.pvF != null)
      this.pvF.connection.disconnect();
    AppMethodBeat.o(28848);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.b.a
 * JD-Core Version:    0.6.2
 */