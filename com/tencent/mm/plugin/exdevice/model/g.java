package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ek;
import com.tencent.mm.g.a.id;
import com.tencent.mm.g.a.id.b;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.atq;
import com.tencent.mm.protocal.protobuf.atr;
import com.tencent.mm.protocal.protobuf.ats;
import com.tencent.mm.protocal.protobuf.att;
import com.tencent.mm.protocal.protobuf.atu;
import com.tencent.mm.protocal.protobuf.atv;
import com.tencent.mm.protocal.protobuf.atw;
import com.tencent.mm.protocal.protobuf.cin;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class g
  implements com.tencent.mm.ai.f
{
  String cEZ;
  long eFm;
  long edW;
  String fFa;
  public g.a fFk;
  int lsA;
  String lsB;
  String lsC;
  private String lsD;
  boolean lsE;
  boolean lsF;
  public HashMap<String, String> lsG;
  atr lsH;
  long lsI;
  List<com.tencent.mm.plugin.exdevice.h.b> lsJ;
  List<com.tencent.mm.plugin.exdevice.h.b> lsK;
  HashMap<String, String> lsL;
  HashMap<String, Integer> lsM;
  HashMap<String, Boolean> lsN;
  j.a lsO;
  j.a lsP;
  j.a lsQ;
  j.a lsR;
  Runnable lsS;
  atr lsT;
  String lsU;
  String lsV;
  int lsW;
  HashMap<Integer, String> lsX;
  boolean lsv;
  boolean lsw;
  boolean lsx;
  String lsy;
  String lsz;

  public g()
  {
    AppMethodBeat.i(19259);
    this.lsv = false;
    this.lsw = false;
    this.lsx = false;
    this.lsB = "send_data_sucess";
    this.lsC = "send_data_failed";
    this.lsD = "send_data_sending";
    this.lsE = false;
    this.lsF = false;
    this.lsG = new HashMap();
    this.fFa = "";
    this.lsJ = null;
    this.lsK = new ArrayList();
    this.lsL = new HashMap();
    this.lsM = new HashMap();
    this.lsN = new HashMap();
    this.lsS = new g.1(this);
    this.fFk = new g.2(this);
    this.lsX = new HashMap();
    this.lsK.clear();
    this.lsL.clear();
    this.lsN.clear();
    this.lsJ = ad.boW().bpA();
    if ((this.lsJ != null) && (this.lsJ.size() > 0))
    {
      ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "Bind Device Size is %d", new Object[] { Integer.valueOf(this.lsJ.size()) });
      int i = this.lsJ.size();
      for (int j = 0; j < i; j++)
        if ((((com.tencent.mm.plugin.exdevice.h.b)this.lsJ.get(j)).dFr.contains("internet_to_device")) && (!((com.tencent.mm.plugin.exdevice.h.b)this.lsJ.get(j)).dFr.contains("wechat_to_device")))
          this.lsK.add(this.lsJ.get(j));
      this.lsR = new g.3(this);
      this.lsO = new g.4(this);
      this.lsP = new g.5(this);
      this.lsQ = new g.6(this);
      aw.Rg().a(1717, this);
      j.boN().a(14, this.lsO);
      j.boN().a(12, this.lsP);
      j.boN().a(13, this.lsQ);
      j.boN().a(15, this.lsR);
      ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "initWCLanDeviceLib...");
      Java2CExDevice.initWCLanDeviceLib();
    }
    AppMethodBeat.o(19259);
  }

  // ERROR //
  static String B(String paramString, long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: sipush 19267
    //   5: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +13 -> 22
    //   12: sipush 19267
    //   15: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: aload_3
    //   19: astore_0
    //   20: aload_0
    //   21: areturn
    //   22: aload_0
    //   23: iconst_0
    //   24: aload_0
    //   25: ldc 247
    //   27: invokevirtual 251	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   30: invokevirtual 255	java/lang/String:substring	(II)Ljava/lang/String;
    //   33: astore 4
    //   35: new 257	java/lang/StringBuilder
    //   38: dup
    //   39: ldc_w 259
    //   42: invokespecial 262	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   45: aload_0
    //   46: invokevirtual 265	java/lang/String:hashCode	()I
    //   49: invokevirtual 269	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   52: invokevirtual 273	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: astore 5
    //   57: new 257	java/lang/StringBuilder
    //   60: dup
    //   61: invokespecial 274	java/lang/StringBuilder:<init>	()V
    //   64: aload 4
    //   66: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: ldc 247
    //   71: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: aload 5
    //   76: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 273	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: astore 6
    //   84: new 279	com/tencent/mm/vfs/b
    //   87: astore 5
    //   89: aload 5
    //   91: aload 6
    //   93: invokespecial 280	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   96: new 282	com/tencent/mm/modelsfs/c
    //   99: astore 4
    //   101: aload 4
    //   103: aload 5
    //   105: lload_1
    //   106: invokespecial 285	com/tencent/mm/modelsfs/c:<init>	(Lcom/tencent/mm/vfs/b;J)V
    //   109: aload_0
    //   110: invokestatic 291	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   113: astore_0
    //   114: aload_0
    //   115: astore 7
    //   117: aload 4
    //   119: astore 5
    //   121: sipush 1024
    //   124: newarray byte
    //   126: astore 8
    //   128: aload_0
    //   129: astore 7
    //   131: aload 4
    //   133: astore 5
    //   135: aload_0
    //   136: aload 8
    //   138: invokevirtual 297	java/io/InputStream:read	([B)I
    //   141: iconst_m1
    //   142: if_icmpeq +83 -> 225
    //   145: aload_0
    //   146: astore 7
    //   148: aload 4
    //   150: astore 5
    //   152: aload 4
    //   154: aload 8
    //   156: invokevirtual 303	java/io/OutputStream:write	([B)V
    //   159: goto -31 -> 128
    //   162: astore 6
    //   164: aload_0
    //   165: astore 7
    //   167: aload 4
    //   169: astore 5
    //   171: ldc 147
    //   173: ldc_w 305
    //   176: iconst_1
    //   177: anewarray 4	java/lang/Object
    //   180: dup
    //   181: iconst_0
    //   182: aload 6
    //   184: invokevirtual 308	java/io/IOException:getMessage	()Ljava/lang/String;
    //   187: aastore
    //   188: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   191: aload 4
    //   193: ifnull +13 -> 206
    //   196: aload 4
    //   198: invokevirtual 314	java/io/OutputStream:flush	()V
    //   201: aload 4
    //   203: invokevirtual 317	java/io/OutputStream:close	()V
    //   206: aload_0
    //   207: ifnull +7 -> 214
    //   210: aload_0
    //   211: invokevirtual 318	java/io/InputStream:close	()V
    //   214: sipush 19267
    //   217: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: aload_3
    //   221: astore_0
    //   222: goto -202 -> 20
    //   225: aload 4
    //   227: invokevirtual 314	java/io/OutputStream:flush	()V
    //   230: aload 4
    //   232: invokevirtual 317	java/io/OutputStream:close	()V
    //   235: aload_0
    //   236: ifnull +7 -> 243
    //   239: aload_0
    //   240: invokevirtual 318	java/io/InputStream:close	()V
    //   243: sipush 19267
    //   246: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   249: aload 6
    //   251: astore_0
    //   252: goto -232 -> 20
    //   255: astore_0
    //   256: ldc 147
    //   258: aload_0
    //   259: ldc 94
    //   261: iconst_0
    //   262: anewarray 4	java/lang/Object
    //   265: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   268: sipush 19267
    //   271: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   274: aload_3
    //   275: astore_0
    //   276: goto -256 -> 20
    //   279: astore_0
    //   280: ldc 147
    //   282: aload_0
    //   283: ldc 94
    //   285: iconst_0
    //   286: anewarray 4	java/lang/Object
    //   289: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   292: sipush 19267
    //   295: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   298: aload_3
    //   299: astore_0
    //   300: goto -280 -> 20
    //   303: astore_0
    //   304: ldc 147
    //   306: aload_0
    //   307: ldc 94
    //   309: iconst_0
    //   310: anewarray 4	java/lang/Object
    //   313: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   316: sipush 19267
    //   319: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   322: aload_3
    //   323: astore_0
    //   324: goto -304 -> 20
    //   327: astore_0
    //   328: ldc 147
    //   330: aload_0
    //   331: ldc 94
    //   333: iconst_0
    //   334: anewarray 4	java/lang/Object
    //   337: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: sipush 19267
    //   343: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   346: aload_3
    //   347: astore_0
    //   348: goto -328 -> 20
    //   351: astore_0
    //   352: aconst_null
    //   353: astore 7
    //   355: aconst_null
    //   356: astore 4
    //   358: aload 4
    //   360: ifnull +13 -> 373
    //   363: aload 4
    //   365: invokevirtual 314	java/io/OutputStream:flush	()V
    //   368: aload 4
    //   370: invokevirtual 317	java/io/OutputStream:close	()V
    //   373: aload 7
    //   375: ifnull +8 -> 383
    //   378: aload 7
    //   380: invokevirtual 318	java/io/InputStream:close	()V
    //   383: sipush 19267
    //   386: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   389: aload_0
    //   390: athrow
    //   391: astore_0
    //   392: ldc 147
    //   394: aload_0
    //   395: ldc 94
    //   397: iconst_0
    //   398: anewarray 4	java/lang/Object
    //   401: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   404: sipush 19267
    //   407: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   410: aload_3
    //   411: astore_0
    //   412: goto -392 -> 20
    //   415: astore_0
    //   416: ldc 147
    //   418: aload_0
    //   419: ldc 94
    //   421: iconst_0
    //   422: anewarray 4	java/lang/Object
    //   425: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   428: sipush 19267
    //   431: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   434: aload_3
    //   435: astore_0
    //   436: goto -416 -> 20
    //   439: astore_0
    //   440: aconst_null
    //   441: astore 7
    //   443: goto -85 -> 358
    //   446: astore_0
    //   447: aload 5
    //   449: astore 4
    //   451: goto -93 -> 358
    //   454: astore 6
    //   456: aconst_null
    //   457: astore_0
    //   458: aconst_null
    //   459: astore 4
    //   461: goto -297 -> 164
    //   464: astore 6
    //   466: aconst_null
    //   467: astore_0
    //   468: goto -304 -> 164
    //
    // Exception table:
    //   from	to	target	type
    //   121	128	162	java/io/IOException
    //   135	145	162	java/io/IOException
    //   152	159	162	java/io/IOException
    //   225	235	255	java/io/IOException
    //   239	243	279	java/io/IOException
    //   196	206	303	java/io/IOException
    //   210	214	327	java/io/IOException
    //   84	109	351	finally
    //   363	373	391	java/io/IOException
    //   378	383	415	java/io/IOException
    //   109	114	439	finally
    //   121	128	446	finally
    //   135	145	446	finally
    //   152	159	446	finally
    //   171	191	446	finally
    //   84	109	454	java/io/IOException
    //   109	114	464	java/io/IOException
  }

  // ERROR //
  public static byte[] Kh(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 19264
    //   5: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 147
    //   10: ldc_w 328
    //   13: iconst_1
    //   14: anewarray 4	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: aload_0
    //   20: aastore
    //   21: invokestatic 161	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: aload_0
    //   25: aconst_null
    //   26: invokestatic 333	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   29: astore_2
    //   30: aload_2
    //   31: ldc_w 335
    //   34: invokevirtual 340	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   37: aload_2
    //   38: sipush 25000
    //   41: invokevirtual 343	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   44: aload_2
    //   45: sipush 25000
    //   48: invokevirtual 346	com/tencent/mm/network/u:setReadTimeout	(I)V
    //   51: aload_2
    //   52: invokevirtual 350	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   55: astore_3
    //   56: aload_2
    //   57: invokevirtual 353	com/tencent/mm/network/u:getResponseCode	()I
    //   60: sipush 200
    //   63: if_icmpne +251 -> 314
    //   66: new 355	java/io/ByteArrayOutputStream
    //   69: astore_0
    //   70: aload_0
    //   71: invokespecial 356	java/io/ByteArrayOutputStream:<init>	()V
    //   74: aload_2
    //   75: astore 4
    //   77: aload_3
    //   78: astore 5
    //   80: aload_0
    //   81: astore 6
    //   83: sipush 1024
    //   86: newarray byte
    //   88: astore 7
    //   90: aload_2
    //   91: astore 4
    //   93: aload_3
    //   94: astore 5
    //   96: aload_0
    //   97: astore 6
    //   99: aload_3
    //   100: aload 7
    //   102: invokevirtual 297	java/io/InputStream:read	([B)I
    //   105: istore 8
    //   107: iload 8
    //   109: iconst_m1
    //   110: if_icmpeq +87 -> 197
    //   113: aload_2
    //   114: astore 4
    //   116: aload_3
    //   117: astore 5
    //   119: aload_0
    //   120: astore 6
    //   122: aload_0
    //   123: aload 7
    //   125: iconst_0
    //   126: iload 8
    //   128: invokevirtual 359	java/io/ByteArrayOutputStream:write	([BII)V
    //   131: goto -41 -> 90
    //   134: astore 7
    //   136: aload_2
    //   137: astore 4
    //   139: aload_3
    //   140: astore 5
    //   142: aload_0
    //   143: astore 6
    //   145: ldc 147
    //   147: aload 7
    //   149: ldc 94
    //   151: iconst_0
    //   152: anewarray 4	java/lang/Object
    //   155: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: aload_0
    //   159: ifnull +7 -> 166
    //   162: aload_0
    //   163: invokevirtual 360	java/io/ByteArrayOutputStream:close	()V
    //   166: aload_3
    //   167: ifnull +7 -> 174
    //   170: aload_3
    //   171: invokevirtual 318	java/io/InputStream:close	()V
    //   174: aload_2
    //   175: ifnull +10 -> 185
    //   178: aload_2
    //   179: getfield 364	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   182: invokevirtual 369	java/net/HttpURLConnection:disconnect	()V
    //   185: sipush 19264
    //   188: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: aload_1
    //   192: astore 7
    //   194: aload 7
    //   196: areturn
    //   197: aload_2
    //   198: astore 4
    //   200: aload_3
    //   201: astore 5
    //   203: aload_0
    //   204: astore 6
    //   206: aload_0
    //   207: invokevirtual 360	java/io/ByteArrayOutputStream:close	()V
    //   210: aload_2
    //   211: astore 4
    //   213: aload_3
    //   214: astore 5
    //   216: aload_0
    //   217: astore 6
    //   219: aload_3
    //   220: invokevirtual 318	java/io/InputStream:close	()V
    //   223: aload_2
    //   224: astore 4
    //   226: aload_3
    //   227: astore 5
    //   229: aload_0
    //   230: astore 6
    //   232: aload_2
    //   233: getfield 364	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   236: invokevirtual 369	java/net/HttpURLConnection:disconnect	()V
    //   239: aload_2
    //   240: astore 4
    //   242: aload_3
    //   243: astore 5
    //   245: aload_0
    //   246: astore 6
    //   248: aload_0
    //   249: invokevirtual 373	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   252: astore 7
    //   254: aload_0
    //   255: invokevirtual 360	java/io/ByteArrayOutputStream:close	()V
    //   258: aload_3
    //   259: ifnull +7 -> 266
    //   262: aload_3
    //   263: invokevirtual 318	java/io/InputStream:close	()V
    //   266: aload_2
    //   267: getfield 364	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   270: invokevirtual 369	java/net/HttpURLConnection:disconnect	()V
    //   273: sipush 19264
    //   276: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   279: goto -85 -> 194
    //   282: astore_0
    //   283: ldc 147
    //   285: aload_0
    //   286: ldc 94
    //   288: iconst_0
    //   289: anewarray 4	java/lang/Object
    //   292: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   295: goto -37 -> 258
    //   298: astore_0
    //   299: ldc 147
    //   301: aload_0
    //   302: ldc 94
    //   304: iconst_0
    //   305: anewarray 4	java/lang/Object
    //   308: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: goto -45 -> 266
    //   314: aload_3
    //   315: ifnull +7 -> 322
    //   318: aload_3
    //   319: invokevirtual 318	java/io/InputStream:close	()V
    //   322: aload_2
    //   323: getfield 364	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   326: invokevirtual 369	java/net/HttpURLConnection:disconnect	()V
    //   329: goto -144 -> 185
    //   332: astore_0
    //   333: ldc 147
    //   335: aload_0
    //   336: ldc 94
    //   338: iconst_0
    //   339: anewarray 4	java/lang/Object
    //   342: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   345: goto -23 -> 322
    //   348: astore_0
    //   349: ldc 147
    //   351: aload_0
    //   352: ldc 94
    //   354: iconst_0
    //   355: anewarray 4	java/lang/Object
    //   358: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   361: goto -195 -> 166
    //   364: astore_0
    //   365: ldc 147
    //   367: aload_0
    //   368: ldc 94
    //   370: iconst_0
    //   371: anewarray 4	java/lang/Object
    //   374: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   377: goto -203 -> 174
    //   380: astore_0
    //   381: aconst_null
    //   382: astore 4
    //   384: aconst_null
    //   385: astore_3
    //   386: aconst_null
    //   387: astore_2
    //   388: aload_2
    //   389: ifnull +7 -> 396
    //   392: aload_2
    //   393: invokevirtual 360	java/io/ByteArrayOutputStream:close	()V
    //   396: aload_3
    //   397: ifnull +7 -> 404
    //   400: aload_3
    //   401: invokevirtual 318	java/io/InputStream:close	()V
    //   404: aload 4
    //   406: ifnull +11 -> 417
    //   409: aload 4
    //   411: getfield 364	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
    //   414: invokevirtual 369	java/net/HttpURLConnection:disconnect	()V
    //   417: sipush 19264
    //   420: invokestatic 240	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   423: aload_0
    //   424: athrow
    //   425: astore_2
    //   426: ldc 147
    //   428: aload_2
    //   429: ldc 94
    //   431: iconst_0
    //   432: anewarray 4	java/lang/Object
    //   435: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   438: goto -42 -> 396
    //   441: astore_2
    //   442: ldc 147
    //   444: aload_2
    //   445: ldc 94
    //   447: iconst_0
    //   448: anewarray 4	java/lang/Object
    //   451: invokestatic 322	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   454: goto -50 -> 404
    //   457: astore_0
    //   458: aconst_null
    //   459: astore_3
    //   460: aconst_null
    //   461: astore 7
    //   463: aload_2
    //   464: astore 4
    //   466: aload 7
    //   468: astore_2
    //   469: goto -81 -> 388
    //   472: astore_0
    //   473: aconst_null
    //   474: astore 7
    //   476: aload_2
    //   477: astore 4
    //   479: aload 7
    //   481: astore_2
    //   482: goto -94 -> 388
    //   485: astore_0
    //   486: aload 5
    //   488: astore_3
    //   489: aload 6
    //   491: astore_2
    //   492: goto -104 -> 388
    //   495: astore 7
    //   497: aconst_null
    //   498: astore_2
    //   499: aconst_null
    //   500: astore_3
    //   501: aconst_null
    //   502: astore_0
    //   503: goto -367 -> 136
    //   506: astore 7
    //   508: aconst_null
    //   509: astore_3
    //   510: aconst_null
    //   511: astore_0
    //   512: goto -376 -> 136
    //   515: astore 7
    //   517: aconst_null
    //   518: astore_0
    //   519: goto -383 -> 136
    //
    // Exception table:
    //   from	to	target	type
    //   83	90	134	java/lang/Exception
    //   99	107	134	java/lang/Exception
    //   122	131	134	java/lang/Exception
    //   206	210	134	java/lang/Exception
    //   219	223	134	java/lang/Exception
    //   232	239	134	java/lang/Exception
    //   248	254	134	java/lang/Exception
    //   254	258	282	java/io/IOException
    //   262	266	298	java/io/IOException
    //   318	322	332	java/io/IOException
    //   162	166	348	java/io/IOException
    //   170	174	364	java/io/IOException
    //   24	30	380	finally
    //   392	396	425	java/io/IOException
    //   400	404	441	java/io/IOException
    //   30	56	457	finally
    //   56	74	472	finally
    //   83	90	485	finally
    //   99	107	485	finally
    //   122	131	485	finally
    //   145	158	485	finally
    //   206	210	485	finally
    //   219	223	485	finally
    //   232	239	485	finally
    //   248	254	485	finally
    //   24	30	495	java/lang/Exception
    //   30	56	506	java/lang/Exception
    //   56	74	515	java/lang/Exception
  }

  static String c(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    AppMethodBeat.i(19271);
    if (paramb == null)
    {
      paramb = "";
      AppMethodBeat.o(19271);
      return paramb;
    }
    String str = null;
    if (!bo.isNullOrNil(paramb.dFl))
      str = paramb.dFl;
    while (true)
    {
      paramb = bo.nullAsNil(str);
      AppMethodBeat.o(19271);
      break;
      if (!bo.isNullOrNil(paramb.dFm))
        str = paramb.dFm;
      else if (paramb.field_mac != 0L)
        str = com.tencent.mm.plugin.exdevice.j.b.ie(paramb.field_mac);
      else if (!bo.isNullOrNil(paramb.field_deviceID))
        str = paramb.field_deviceID;
    }
  }

  static void dQ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(19269);
    ek localek = new ek();
    localek.cxU.cxW = paramString2;
    localek.cxU.ceI = paramString1;
    a.xxA.m(localek);
    AppMethodBeat.o(19269);
  }

  static Boolean hI(long paramLong)
  {
    AppMethodBeat.i(19260);
    boolean bool1 = false;
    aw.ZK();
    bi localbi = com.tencent.mm.model.c.XO().jf(paramLong);
    Object localObject;
    if (localbi.field_msgId == 0L)
    {
      localObject = Boolean.FALSE;
      AppMethodBeat.o(19260);
    }
    while (true)
    {
      return localObject;
      localObject = localbi.field_content;
      boolean bool2 = bool1;
      if (localbi.getType() == 49)
      {
        localObject = j.b.me((String)localObject);
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (((j.b)localObject).type == 6)
            bool2 = true;
        }
      }
      localObject = Boolean.valueOf(bool2);
      AppMethodBeat.o(19260);
    }
  }

  static Boolean hJ(long paramLong)
  {
    AppMethodBeat.i(19261);
    boolean bool = false;
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.XO().jf(paramLong);
    if (((cy)localObject).field_msgId == 0L)
    {
      localObject = Boolean.FALSE;
      AppMethodBeat.o(19261);
    }
    while (true)
    {
      return localObject;
      if (((bi)localObject).getType() == 3)
        bool = true;
      localObject = Boolean.valueOf(bool);
      AppMethodBeat.o(19261);
    }
  }

  static Boolean hK(long paramLong)
  {
    AppMethodBeat.i(19262);
    boolean bool = false;
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.XO().jf(paramLong);
    if (((cy)localObject).field_msgId == 0L)
    {
      localObject = Boolean.FALSE;
      AppMethodBeat.o(19262);
    }
    while (true)
    {
      return localObject;
      if (((bi)localObject).dtA())
        bool = true;
      localObject = Boolean.valueOf(bool);
      AppMethodBeat.o(19262);
    }
  }

  static Boolean hL(long paramLong)
  {
    AppMethodBeat.i(19263);
    boolean bool = false;
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.XO().jf(paramLong);
    if (((cy)localObject).field_msgId == 0L)
    {
      localObject = Boolean.FALSE;
      AppMethodBeat.o(19263);
    }
    while (true)
    {
      return localObject;
      if (((bi)localObject).getType() == 62)
        bool = true;
      localObject = Boolean.valueOf(bool);
      AppMethodBeat.o(19263);
    }
  }

  private String hM(long paramLong)
  {
    AppMethodBeat.i(19268);
    String str = "";
    aw.ZK();
    Object localObject1 = com.tencent.mm.model.c.XO().jf(paramLong);
    if (((cy)localObject1).field_msgId == 0L)
    {
      localObject2 = "";
      AppMethodBeat.o(19268);
      return localObject2;
    }
    int i = ((bi)localObject1).getType();
    Object localObject2 = ((cy)localObject1).field_content;
    if (((bi)localObject1).bAA())
    {
      localObject1 = j.b.me((String)localObject2);
      if ((localObject1 != null) && ((((j.b)localObject1).type == 6) || (((j.b)localObject1).type == 2)))
      {
        localObject2 = am.aUq().aiE(((j.b)localObject1).csD);
        if (localObject2 != null)
          localObject2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
      }
    }
    while (true)
    {
      AppMethodBeat.o(19268);
      break;
      ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "getFilePath attInfo is null");
      localObject2 = str;
      continue;
      localObject2 = str;
      if (localObject1 != null)
        if (((j.b)localObject1).type != 3)
        {
          localObject2 = str;
          if (((j.b)localObject1).type != 5);
        }
        else
        {
          this.lsw = true;
          localObject2 = str;
          continue;
          if (i == 3)
          {
            localObject1 = com.tencent.mm.at.o.ahl().w((bi)localObject1);
            localObject2 = str;
            if (localObject1 != null)
            {
              str = com.tencent.mm.at.o.ahl().sj(((com.tencent.mm.at.e)localObject1).fDz);
              localObject2 = str;
              if (bo.isNullOrNil(str))
                localObject2 = com.tencent.mm.at.o.ahl().sj(((com.tencent.mm.at.e)localObject1).fDB);
            }
          }
          else if (i == 62)
          {
            com.tencent.mm.modelvideo.o.all();
            localObject2 = t.uh(((cy)localObject1).field_imgPath);
          }
          else
          {
            localObject2 = str;
            if (i == 48)
            {
              this.lsw = true;
              localObject2 = str;
            }
          }
        }
    }
  }

  final boolean a(atr paramatr, long paramLong)
  {
    AppMethodBeat.i(19266);
    int i = -1;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    String str = hM(paramLong);
    Object localObject4 = localObject3;
    Object localObject5 = localObject2;
    Object localObject6 = localObject1;
    int j = i;
    if (str != null)
    {
      localObject4 = localObject3;
      localObject5 = localObject2;
      localObject6 = localObject1;
      j = i;
      if (str.length() > 0)
      {
        localObject6 = new com.tencent.mm.vfs.b(str);
        localObject5 = ((com.tencent.mm.vfs.b)localObject6).getName();
        j = (int)((com.tencent.mm.vfs.b)localObject6).length();
        localObject4 = ((String)localObject5).substring(((String)localObject5).lastIndexOf(".") + 1, ((String)localObject5).length());
        localObject6 = com.tencent.mm.vfs.e.atg(str);
        ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "filePath %s", new Object[] { str });
        ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "fileSize %s", new Object[] { Integer.valueOf(j) });
        ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "fileMd5 %s", new Object[] { localObject6 });
      }
    }
    aw.ZK();
    localObject1 = com.tencent.mm.model.c.XO().jf(paramLong);
    boolean bool;
    if (((cy)localObject1).field_msgId == 0L)
    {
      ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "msgInfo or msgInfo.getMsgId() = 0");
      bool = false;
      AppMethodBeat.o(19266);
      return bool;
    }
    switch (((bi)localObject1).getType())
    {
    default:
    case 49:
    case 268435505:
    case 3:
    case 48:
    case 62:
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(19266);
      break;
      localObject4 = j.b.me(((cy)localObject1).field_content);
      if (localObject4 == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get content is null");
        bool = false;
        AppMethodBeat.o(19266);
        break;
      }
      if (((j.b)localObject4).type == 3)
      {
        localObject6 = new atu();
        ((atu)localObject6).Title = ((j.b)localObject4).title;
        ((atu)localObject6).wxR = ((j.b)localObject4).description;
        ((atu)localObject6).Url = ((j.b)localObject4).url;
        ((atu)localObject6).wxS = ((j.b)localObject4).fgn;
        ((atu)localObject6).vYK = ((j.b)localObject4).fgM;
        ((atu)localObject6).wxT = ((j.b)localObject4).fgN;
        ((atu)localObject6).ncH = ((j.b)localObject4).appName;
        if (bo.isNullOrNil(((atu)localObject6).ncH))
        {
          localObject5 = com.tencent.mm.pluginsdk.model.app.g.dX(((j.b)localObject4).appId, ((j.b)localObject4).axy);
          if (localObject5 != null)
            ((atu)localObject6).ncH = ((com.tencent.mm.pluginsdk.model.app.f)localObject5).field_appName;
        }
        ((atu)localObject6).wxU = ((j.b)localObject4).fgE;
        ((atu)localObject6).wxV = ((j.b)localObject4).fgF;
        ((atu)localObject6).wxW = ((j.b)localObject4).fgK;
        paramatr.wxI = ((atu)localObject6);
        paramatr.wxH = 1;
      }
      else if (((j.b)localObject4).type == 6)
      {
        localObject5 = new atq();
        ((atq)localObject5).Type = ((j.b)localObject4).fgp;
        ((atq)localObject5).Name = ((j.b)localObject4).title;
        ((atq)localObject5).jCo = j;
        ((atq)localObject5).Md5 = ((String)localObject6);
        paramatr.wxL = ((atq)localObject5);
        paramatr.wxH = 4;
      }
      else if (((j.b)localObject4).type == 5)
      {
        localObject6 = new atv();
        ((atv)localObject6).Url = ((j.b)localObject4).url;
        ((atv)localObject6).Title = ((j.b)localObject4).title;
        ((atv)localObject6).wxR = ((j.b)localObject4).description;
        ((atv)localObject6).ncH = ((j.b)localObject4).appName;
        if (bo.isNullOrNil(((atv)localObject6).ncH))
        {
          localObject5 = com.tencent.mm.pluginsdk.model.app.g.dX(((j.b)localObject4).appId, ((j.b)localObject4).axy);
          if (localObject5 != null)
            ((atv)localObject6).ncH = ((com.tencent.mm.pluginsdk.model.app.f)localObject5).field_appName;
        }
        paramatr.wxM = ((atv)localObject6);
        paramatr.wxH = 5;
      }
      else if (((j.b)localObject4).type == 2)
      {
        localObject4 = new ats();
        ((ats)localObject4).Type = "jpg";
        ((ats)localObject4).Name = ((String)localObject5);
        ((ats)localObject4).jCo = j;
        ((ats)localObject4).Md5 = ((String)localObject6);
        paramatr.wxK = ((ats)localObject4);
        paramatr.wxH = 3;
        continue;
        localObject1 = new ats();
        ((ats)localObject1).Type = ((String)localObject4);
        ((ats)localObject1).Name = ((String)localObject5);
        ((ats)localObject1).jCo = j;
        ((ats)localObject1).Md5 = ((String)localObject6);
        paramatr.wxK = ((ats)localObject1);
        paramatr.wxH = 3;
        continue;
        aw.ZK();
        localObject5 = com.tencent.mm.model.c.XO().Ro(((cy)localObject1).field_content);
        localObject6 = new att();
        ((att)localObject6).vOu = ((float)((bi.b)localObject5).nJu);
        ((att)localObject6).vOv = ((float)((bi.b)localObject5).nJv);
        ((att)localObject6).wxP = ((bi.b)localObject5).cED;
        ((att)localObject6).Label = ((bi.b)localObject5).label;
        ((att)localObject6).wxQ = ((bi.b)localObject5).eUu;
        paramatr.wxJ = ((att)localObject6);
        paramatr.wxH = 2;
        continue;
        localObject1 = new atw();
        ((atw)localObject1).Type = ((String)localObject4);
        ((atw)localObject1).jCo = j;
        ((atw)localObject1).Md5 = ((String)localObject6);
        ((atw)localObject1).Name = ((String)localObject5);
        paramatr.wxN = ((atw)localObject1);
        paramatr.wxH = 6;
      }
    }
  }

  public final TimeLineObject boL()
  {
    AppMethodBeat.i(19265);
    Object localObject = new id();
    ((id)localObject).cDc.cwT = this.lsy;
    a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((id)localObject).cDd.cDe;
    AppMethodBeat.o(19265);
    return localObject;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(19270);
    ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramm == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "scene is null.");
      AppMethodBeat.o(19270);
    }
    while (true)
    {
      return;
      if ((paramm instanceof n))
      {
        Object localObject = (n)paramm;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "NetSceneGetAppMsgInfo onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          dQ(((n)localObject).ceI, this.lsC);
          AppMethodBeat.o(19270);
        }
        else
        {
          if ((((n)localObject).ehh != null) && (((n)localObject).ehh.fsH.fsP != null));
          for (paramString = (cin)((n)localObject).ehh.fsH.fsP; ; paramString = null)
          {
            paramm = paramString.xhu;
            if (1 != ((n)localObject).ltE)
              break label208;
            dQ(((n)localObject).ceI, this.lsB);
            AppMethodBeat.o(19270);
            break;
          }
          label208: localObject = ((n)localObject).ceI;
          String str = (String)this.lsL.get(localObject);
          dQ((String)localObject, this.lsD);
          if ((this.lsx) && (this.lsy != null));
          for (paramString = this.lsz; ; paramString = hM(this.edW))
          {
            if ((str != null) && (str.length() != 0))
              break label308;
            ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "mDeviceInfo error");
            dQ((String)localObject, this.lsC);
            AppMethodBeat.o(19270);
            break;
          }
          label308: if (!this.lsv)
          {
            ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "onItemClick stop scan...");
            Java2CExDevice.stopScanWCLanDevice();
            this.lsv = true;
          }
          if ((!this.lsN.containsKey(localObject)) || (!((Boolean)this.lsN.get(localObject)).booleanValue()))
          {
            ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "connectWCLanDevice mDeviceInfo: ".concat(String.valueOf(str)));
            if (Java2CExDevice.connectWCLanDevice(str.getBytes(), true) != 0)
            {
              dQ((String)localObject, this.lsC);
              ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "connectWCLanDevice error!");
            }
          }
          if (this.lsw)
          {
            paramInt1 = Java2CExDevice.useWCLanDeviceService(str.getBytes(), paramm.getBytes());
            if (paramInt1 != 0)
            {
              this.lsX.put(Integer.valueOf(paramInt1), localObject);
              this.lsM.put(localObject, Integer.valueOf(paramInt1));
              ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get useWCLanDeviceService mCallBackCmdId: ".concat(String.valueOf(paramInt1)));
              AppMethodBeat.o(19270);
            }
            else
            {
              dQ((String)localObject, this.lsC);
              ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "useWCLanDeviceService error!");
              AppMethodBeat.o(19270);
            }
          }
          else if ((paramString == null) || (paramString.length() == 0))
          {
            ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "file path is error");
            dQ((String)localObject, this.lsC);
            AppMethodBeat.o(19270);
          }
          else
          {
            paramInt1 = Java2CExDevice.sendFileToWCLanDevice(str.getBytes(), paramm.getBytes(), paramString.getBytes());
            if (paramInt1 != 0)
            {
              this.lsX.put(Integer.valueOf(paramInt1), localObject);
              this.lsM.put(localObject, Integer.valueOf(paramInt1));
              ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get sendFileToWCLanDevice mCallBackCmdId =".concat(String.valueOf(paramInt1)));
              AppMethodBeat.o(19270);
            }
            else
            {
              dQ((String)localObject, this.lsC);
              ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "sendFileToWCLanDevice error!");
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(19270);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.g
 * JD-Core Version:    0.6.2
 */