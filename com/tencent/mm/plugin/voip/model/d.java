package com.tencent.mm.plugin.voip.model;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class d extends Thread
{
  public static int sNT = 64;
  private static String sNU = e.eSn;
  public static byte[] sNW = null;
  public static byte[] sNX = null;
  public static byte[] sNY = null;
  public static int sOa = 640;
  public static int sOb = 480;
  private Surface aOO;
  public byte[] configbyte;
  private MediaCodec mDecoder;
  private BufferedOutputStream outputStream;
  private BufferedOutputStream sNV;
  private boolean sNZ;
  k sNl;
  private boolean sOc;
  public boolean sOd;
  public boolean sOe;
  public boolean sOf;
  public int sOg;
  public byte[] sOh;
  public int sOi;
  public int sOj;
  public int sOk;
  public byte[] sOl;
  public byte[] sOm;
  public byte[] sOn;

  public d(Surface paramSurface)
  {
    AppMethodBeat.i(4333);
    this.outputStream = null;
    this.sNV = null;
    this.configbyte = null;
    this.sNZ = false;
    this.sOc = false;
    this.sOd = true;
    this.sOe = true;
    this.sOf = false;
    this.sOg = 0;
    this.sNl = null;
    this.sOh = new byte[] { 0, 0, 0, 1 };
    this.sOi = 0;
    this.sOj = 0;
    this.sOk = 0;
    this.sOl = new byte[] { 103, 100, 0, 13, -84, -74, 10, 15, -120 };
    this.sOm = new byte[] { 0, 0, 0, 1, 40, -50, 60, 48 };
    this.sOn = new byte[] { 13, 0, -15, 98, -22 };
    this.sOd = true;
    this.sOe = true;
    this.mDecoder = null;
    this.sNZ = false;
    this.sOk = 0;
    if (paramSurface != null)
      this.aOO = paramSurface;
    AppMethodBeat.o(4333);
  }

  private static String bm(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(4336);
    String str1 = "";
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      String str2 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str3 = str2;
      if (str2.length() == 1)
        str3 = "0".concat(String.valueOf(str2));
      str1 = str1 + str3;
    }
    AppMethodBeat.o(4336);
    return str1;
  }

  private int cIu()
  {
    int i = 1;
    AppMethodBeat.i(4335);
    this.sOg += 1;
    ab.i("MeidaCodec[HWDec]", "[HW]:DecFrmError: I Req mIReqFlag = " + this.sOf + ", mIsHWDecEnable = " + this.sOd + ", mHWErrorDecFrmCount = " + this.sOg);
    if ((!this.sOd) || (this.sOg > sNT))
    {
      cIv();
      this.sNl.mq(true);
      this.sOk |= 64;
      ab.i("MeidaCodec[HWDec]", "[HW]: ErrFrm > threshold, end HWDec!!");
      i = 0;
      AppMethodBeat.o(4335);
    }
    while (true)
    {
      return i;
      ByteBuffer localByteBuffer = ByteBuffer.allocate(1);
      localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      localByteBuffer.put((byte)1);
      this.sNl.sPp.setAppCmd(28, localByteBuffer.array(), 1);
      this.sOf = true;
      AppMethodBeat.o(4335);
    }
  }

  // ERROR //
  public final int T(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: sipush 4337
    //   3: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 82	com/tencent/mm/plugin/voip/model/d:sOd	Z
    //   10: ifne +30 -> 40
    //   13: aload_0
    //   14: aload_0
    //   15: getfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   18: iconst_1
    //   19: ior
    //   20: putfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   23: ldc 241
    //   25: ldc 243
    //   27: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: iconst_m1
    //   31: istore_2
    //   32: sipush 4337
    //   35: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: iload_2
    //   39: ireturn
    //   40: invokestatic 252	java/lang/System:currentTimeMillis	()J
    //   43: pop2
    //   44: iload_2
    //   45: iconst_2
    //   46: if_icmpne +844 -> 890
    //   49: new 254	com/tencent/mm/protocal/protobuf/aso
    //   52: astore_3
    //   53: aload_3
    //   54: invokespecial 255	com/tencent/mm/protocal/protobuf/aso:<init>	()V
    //   57: aload_3
    //   58: aload_1
    //   59: invokevirtual 259	com/tencent/mm/protocal/protobuf/aso:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   62: checkcast 254	com/tencent/mm/protocal/protobuf/aso
    //   65: astore_1
    //   66: aload_1
    //   67: getfield 263	com/tencent/mm/protocal/protobuf/aso:wwf	Lcom/tencent/mm/bt/b;
    //   70: ifnonnull +431 -> 501
    //   73: iconst_0
    //   74: istore_2
    //   75: aload_1
    //   76: getfield 266	com/tencent/mm/protocal/protobuf/aso:wwd	Lcom/tencent/mm/bt/b;
    //   79: getfield 271	com/tencent/mm/bt/b:wR	[B
    //   82: arraylength
    //   83: istore 4
    //   85: aload_1
    //   86: getfield 274	com/tencent/mm/protocal/protobuf/aso:wwe	Lcom/tencent/mm/bt/b;
    //   89: getfield 271	com/tencent/mm/bt/b:wR	[B
    //   92: arraylength
    //   93: istore 5
    //   95: iload_2
    //   96: ifeq +417 -> 513
    //   99: aload_0
    //   100: getfield 78	com/tencent/mm/plugin/voip/model/d:sNZ	Z
    //   103: ifne +8 -> 111
    //   106: aload_0
    //   107: iconst_0
    //   108: putfield 80	com/tencent/mm/plugin/voip/model/d:sOc	Z
    //   111: aload_0
    //   112: iconst_1
    //   113: putfield 78	com/tencent/mm/plugin/voip/model/d:sNZ	Z
    //   116: iload_2
    //   117: iconst_4
    //   118: iadd
    //   119: newarray byte
    //   121: putstatic 51	com/tencent/mm/plugin/voip/model/d:sNW	[B
    //   124: iload 4
    //   126: iconst_4
    //   127: iadd
    //   128: newarray byte
    //   130: putstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   133: iload 5
    //   135: iconst_4
    //   136: iadd
    //   137: newarray byte
    //   139: putstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   142: aload_0
    //   143: getfield 94	com/tencent/mm/plugin/voip/model/d:sOh	[B
    //   146: iconst_0
    //   147: getstatic 51	com/tencent/mm/plugin/voip/model/d:sNW	[B
    //   150: iconst_0
    //   151: iconst_4
    //   152: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   155: aload_0
    //   156: getfield 94	com/tencent/mm/plugin/voip/model/d:sOh	[B
    //   159: iconst_0
    //   160: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   163: iconst_0
    //   164: iconst_4
    //   165: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   168: aload_0
    //   169: getfield 94	com/tencent/mm/plugin/voip/model/d:sOh	[B
    //   172: iconst_0
    //   173: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   176: iconst_0
    //   177: iconst_4
    //   178: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   181: aload_1
    //   182: getfield 263	com/tencent/mm/protocal/protobuf/aso:wwf	Lcom/tencent/mm/bt/b;
    //   185: getstatic 51	com/tencent/mm/plugin/voip/model/d:sNW	[B
    //   188: invokevirtual 282	com/tencent/mm/bt/b:bJ	([B)V
    //   191: aload_1
    //   192: getfield 266	com/tencent/mm/protocal/protobuf/aso:wwd	Lcom/tencent/mm/bt/b;
    //   195: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   198: invokevirtual 282	com/tencent/mm/bt/b:bJ	([B)V
    //   201: aload_1
    //   202: getfield 274	com/tencent/mm/protocal/protobuf/aso:wwe	Lcom/tencent/mm/bt/b;
    //   205: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   208: invokevirtual 282	com/tencent/mm/bt/b:bJ	([B)V
    //   211: aload_0
    //   212: getstatic 51	com/tencent/mm/plugin/voip/model/d:sNW	[B
    //   215: arraylength
    //   216: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   219: arraylength
    //   220: iadd
    //   221: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   224: arraylength
    //   225: iadd
    //   226: newarray byte
    //   228: putfield 76	com/tencent/mm/plugin/voip/model/d:configbyte	[B
    //   231: getstatic 51	com/tencent/mm/plugin/voip/model/d:sNW	[B
    //   234: iconst_0
    //   235: aload_0
    //   236: getfield 76	com/tencent/mm/plugin/voip/model/d:configbyte	[B
    //   239: iconst_0
    //   240: getstatic 51	com/tencent/mm/plugin/voip/model/d:sNW	[B
    //   243: arraylength
    //   244: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   247: getstatic 51	com/tencent/mm/plugin/voip/model/d:sNW	[B
    //   250: arraylength
    //   251: iconst_0
    //   252: iadd
    //   253: istore_2
    //   254: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   257: iconst_0
    //   258: aload_0
    //   259: getfield 76	com/tencent/mm/plugin/voip/model/d:configbyte	[B
    //   262: iload_2
    //   263: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   266: arraylength
    //   267: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   270: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   273: arraylength
    //   274: istore 5
    //   276: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   279: iconst_0
    //   280: aload_0
    //   281: getfield 76	com/tencent/mm/plugin/voip/model/d:configbyte	[B
    //   284: iload_2
    //   285: iload 5
    //   287: iadd
    //   288: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   291: arraylength
    //   292: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   295: aconst_null
    //   296: astore_1
    //   297: iconst_1
    //   298: istore_2
    //   299: aload_1
    //   300: ifnull +21 -> 321
    //   303: aload_0
    //   304: getfield 74	com/tencent/mm/plugin/voip/model/d:sNV	Ljava/io/BufferedOutputStream;
    //   307: ifnull +14 -> 321
    //   310: aload_0
    //   311: getfield 74	com/tencent/mm/plugin/voip/model/d:sNV	Ljava/io/BufferedOutputStream;
    //   314: aload_1
    //   315: iconst_0
    //   316: aload_1
    //   317: arraylength
    //   318: invokevirtual 288	java/io/BufferedOutputStream:write	([BII)V
    //   321: iload_2
    //   322: ifeq +957 -> 1279
    //   325: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   328: ifnull +951 -> 1279
    //   331: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   334: ifnull +945 -> 1279
    //   337: aload_0
    //   338: getfield 80	com/tencent/mm/plugin/voip/model/d:sOc	Z
    //   341: ifne +149 -> 490
    //   344: aload_0
    //   345: getfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   348: astore_3
    //   349: aload_3
    //   350: ifnull +22 -> 372
    //   353: aload_0
    //   354: getfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   357: invokevirtual 293	android/media/MediaCodec:stop	()V
    //   360: aload_0
    //   361: getfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   364: invokevirtual 296	android/media/MediaCodec:release	()V
    //   367: aload_0
    //   368: aconst_null
    //   369: putfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   372: aload_0
    //   373: getfield 78	com/tencent/mm/plugin/voip/model/d:sNZ	Z
    //   376: ifeq +929 -> 1305
    //   379: ldc_w 298
    //   382: getstatic 57	com/tencent/mm/plugin/voip/model/d:sOa	I
    //   385: getstatic 59	com/tencent/mm/plugin/voip/model/d:sOb	I
    //   388: invokestatic 304	android/media/MediaFormat:createVideoFormat	(Ljava/lang/String;II)Landroid/media/MediaFormat;
    //   391: astore_3
    //   392: aload_3
    //   393: ldc_w 306
    //   396: bipush 90
    //   398: invokevirtual 310	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   401: ldc 168
    //   403: ldc_w 312
    //   406: aload_3
    //   407: invokestatic 150	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   410: invokevirtual 154	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   413: invokestatic 188	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   416: aload_3
    //   417: ldc_w 314
    //   420: invokevirtual 317	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   423: astore 6
    //   425: aload 6
    //   427: ldc_w 319
    //   430: invokevirtual 323	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   433: ifeq +57 -> 490
    //   436: aload_0
    //   437: aload 6
    //   439: invokestatic 327	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   442: putfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   445: ldc 168
    //   447: ldc_w 329
    //   450: aload_3
    //   451: invokestatic 150	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   454: invokevirtual 154	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   457: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   460: aload_0
    //   461: getfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   464: aload_3
    //   465: aload_0
    //   466: getfield 125	com/tencent/mm/plugin/voip/model/d:aOO	Landroid/view/Surface;
    //   469: aconst_null
    //   470: iconst_0
    //   471: invokevirtual 333	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   474: aload_0
    //   475: getfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   478: invokevirtual 336	android/media/MediaCodec:start	()V
    //   481: aload_0
    //   482: iconst_1
    //   483: putfield 80	com/tencent/mm/plugin/voip/model/d:sOc	Z
    //   486: aload_0
    //   487: invokevirtual 337	com/tencent/mm/plugin/voip/model/d:start	()V
    //   490: iconst_1
    //   491: istore_2
    //   492: sipush 4337
    //   495: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   498: goto -460 -> 38
    //   501: aload_1
    //   502: getfield 263	com/tencent/mm/protocal/protobuf/aso:wwf	Lcom/tencent/mm/bt/b;
    //   505: getfield 271	com/tencent/mm/bt/b:wR	[B
    //   508: arraylength
    //   509: istore_2
    //   510: goto -435 -> 75
    //   513: aload_0
    //   514: getfield 78	com/tencent/mm/plugin/voip/model/d:sNZ	Z
    //   517: ifeq +8 -> 525
    //   520: aload_0
    //   521: iconst_0
    //   522: putfield 80	com/tencent/mm/plugin/voip/model/d:sOc	Z
    //   525: aload_0
    //   526: iconst_0
    //   527: putfield 78	com/tencent/mm/plugin/voip/model/d:sNZ	Z
    //   530: iload 4
    //   532: iconst_4
    //   533: iadd
    //   534: newarray byte
    //   536: astore_3
    //   537: aload_0
    //   538: getfield 94	com/tencent/mm/plugin/voip/model/d:sOh	[B
    //   541: iconst_0
    //   542: aload_3
    //   543: iconst_0
    //   544: iconst_4
    //   545: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   548: aload_1
    //   549: getfield 266	com/tencent/mm/protocal/protobuf/aso:wwd	Lcom/tencent/mm/bt/b;
    //   552: aload_3
    //   553: invokevirtual 282	com/tencent/mm/bt/b:bJ	([B)V
    //   556: ldc 168
    //   558: ldc_w 339
    //   561: aload_3
    //   562: invokestatic 150	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   565: invokevirtual 154	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   568: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   571: aload_3
    //   572: invokestatic 341	com/tencent/mm/plugin/voip/model/d:bm	([B)Ljava/lang/String;
    //   575: astore 7
    //   577: iconst_3
    //   578: newarray byte
    //   580: dup
    //   581: iconst_0
    //   582: ldc 91
    //   584: bastore
    //   585: dup
    //   586: iconst_1
    //   587: ldc 91
    //   589: bastore
    //   590: dup
    //   591: iconst_2
    //   592: ldc_w 342
    //   595: bastore
    //   596: invokestatic 341	com/tencent/mm/plugin/voip/model/d:bm	([B)Ljava/lang/String;
    //   599: astore 8
    //   601: new 156	java/lang/StringBuilder
    //   604: astore 6
    //   606: aload 6
    //   608: ldc_w 344
    //   611: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   614: ldc 168
    //   616: aload 6
    //   618: aload 7
    //   620: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   623: ldc_w 346
    //   626: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   629: aload 8
    //   631: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   634: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   637: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   640: aload 7
    //   642: aload 8
    //   644: iconst_0
    //   645: invokevirtual 350	java/lang/String:indexOf	(Ljava/lang/String;I)I
    //   648: istore_2
    //   649: iload_2
    //   650: iconst_m1
    //   651: if_icmpeq +206 -> 857
    //   654: ldc 168
    //   656: ldc_w 352
    //   659: iload_2
    //   660: invokestatic 354	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   663: invokevirtual 154	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   666: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   669: iconst_1
    //   670: istore_2
    //   671: iload_2
    //   672: ifeq +190 -> 862
    //   675: ldc 168
    //   677: ldc_w 356
    //   680: invokestatic 188	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   683: aload_3
    //   684: putstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   687: new 156	java/lang/StringBuilder
    //   690: astore_3
    //   691: aload_3
    //   692: ldc_w 358
    //   695: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   698: ldc 168
    //   700: aload_3
    //   701: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   704: arraylength
    //   705: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   708: ldc_w 360
    //   711: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   714: iload 4
    //   716: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   719: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   722: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   725: iload 5
    //   727: iconst_4
    //   728: iadd
    //   729: newarray byte
    //   731: putstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   734: aload_0
    //   735: getfield 94	com/tencent/mm/plugin/voip/model/d:sOh	[B
    //   738: iconst_0
    //   739: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   742: iconst_0
    //   743: iconst_4
    //   744: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   747: aload_1
    //   748: getfield 274	com/tencent/mm/protocal/protobuf/aso:wwe	Lcom/tencent/mm/bt/b;
    //   751: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   754: invokevirtual 282	com/tencent/mm/bt/b:bJ	([B)V
    //   757: aload_0
    //   758: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   761: arraylength
    //   762: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   765: arraylength
    //   766: iadd
    //   767: newarray byte
    //   769: putfield 76	com/tencent/mm/plugin/voip/model/d:configbyte	[B
    //   772: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   775: iconst_0
    //   776: aload_0
    //   777: getfield 76	com/tencent/mm/plugin/voip/model/d:configbyte	[B
    //   780: iconst_0
    //   781: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   784: arraylength
    //   785: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   788: getstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   791: arraylength
    //   792: istore_2
    //   793: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   796: iconst_0
    //   797: aload_0
    //   798: getfield 76	com/tencent/mm/plugin/voip/model/d:configbyte	[B
    //   801: iload_2
    //   802: iconst_0
    //   803: iadd
    //   804: getstatic 55	com/tencent/mm/plugin/voip/model/d:sNY	[B
    //   807: arraylength
    //   808: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   811: goto -516 -> 295
    //   814: astore_1
    //   815: aload_0
    //   816: aload_0
    //   817: getfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   820: iconst_2
    //   821: ior
    //   822: putfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   825: ldc 168
    //   827: new 156	java/lang/StringBuilder
    //   830: dup
    //   831: ldc_w 362
    //   834: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   837: aload_1
    //   838: invokevirtual 363	java/lang/Exception:toString	()Ljava/lang/String;
    //   841: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   844: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   847: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   850: aconst_null
    //   851: astore_1
    //   852: iconst_0
    //   853: istore_2
    //   854: goto -555 -> 299
    //   857: iconst_0
    //   858: istore_2
    //   859: goto -188 -> 671
    //   862: new 368	com/tencent/mm/plugin/voip/model/g
    //   865: invokespecial 369	com/tencent/mm/plugin/voip/model/g:<init>	()V
    //   868: new 371	java/io/ByteArrayInputStream
    //   871: astore 6
    //   873: aload 6
    //   875: aload_3
    //   876: invokespecial 373	java/io/ByteArrayInputStream:<init>	([B)V
    //   879: aload 6
    //   881: invokestatic 377	com/tencent/mm/plugin/voip/model/g:F	(Ljava/io/InputStream;)[B
    //   884: putstatic 53	com/tencent/mm/plugin/voip/model/d:sNX	[B
    //   887: goto -200 -> 687
    //   890: new 379	com/tencent/mm/protocal/protobuf/asn
    //   893: astore_3
    //   894: aload_3
    //   895: invokespecial 380	com/tencent/mm/protocal/protobuf/asn:<init>	()V
    //   898: aload_3
    //   899: aload_1
    //   900: invokevirtual 381	com/tencent/mm/protocal/protobuf/asn:parseFrom	([B)Lcom/tencent/mm/bt/a;
    //   903: checkcast 379	com/tencent/mm/protocal/protobuf/asn
    //   906: astore_3
    //   907: aload_3
    //   908: getfield 385	com/tencent/mm/protocal/protobuf/asn:wwb	Ljava/util/LinkedList;
    //   911: invokevirtual 391	java/util/LinkedList:getFirst	()Ljava/lang/Object;
    //   914: checkcast 134	java/lang/Integer
    //   917: invokevirtual 394	java/lang/Integer:intValue	()I
    //   920: istore 9
    //   922: iconst_0
    //   923: istore 5
    //   925: ldc 168
    //   927: ldc_w 396
    //   930: iload 9
    //   932: invokestatic 354	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   935: invokevirtual 154	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   938: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   941: iload_2
    //   942: iconst_1
    //   943: if_icmpne +182 -> 1125
    //   946: aload_0
    //   947: getfield 76	com/tencent/mm/plugin/voip/model/d:configbyte	[B
    //   950: arraylength
    //   951: istore 5
    //   953: iload 9
    //   955: iload 5
    //   957: iadd
    //   958: istore 4
    //   960: iload 4
    //   962: newarray byte
    //   964: astore_1
    //   965: aload_0
    //   966: getfield 76	com/tencent/mm/plugin/voip/model/d:configbyte	[B
    //   969: iconst_0
    //   970: aload_1
    //   971: iconst_0
    //   972: iload 5
    //   974: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   977: iinc 5 0
    //   980: iconst_0
    //   981: istore 10
    //   983: iconst_4
    //   984: invokestatic 205	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   987: astore 6
    //   989: aload_3
    //   990: getfield 399	com/tencent/mm/protocal/protobuf/asn:wvY	Lcom/tencent/mm/bt/b;
    //   993: aload 6
    //   995: invokevirtual 227	java/nio/ByteBuffer:array	()[B
    //   998: iload 10
    //   1000: iconst_0
    //   1001: iconst_4
    //   1002: invokevirtual 403	com/tencent/mm/bt/b:f	([BIII)V
    //   1005: aload 6
    //   1007: getstatic 406	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   1010: invokevirtual 215	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   1013: pop
    //   1014: aload 6
    //   1016: iconst_0
    //   1017: invokevirtual 410	java/nio/ByteBuffer:getInt	(I)I
    //   1020: istore 11
    //   1022: aload_0
    //   1023: getfield 94	com/tencent/mm/plugin/voip/model/d:sOh	[B
    //   1026: iconst_0
    //   1027: aload_1
    //   1028: iload 10
    //   1030: iload 5
    //   1032: iadd
    //   1033: iconst_4
    //   1034: invokestatic 278	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1037: iinc 10 4
    //   1040: aload_3
    //   1041: getfield 399	com/tencent/mm/protocal/protobuf/asn:wvY	Lcom/tencent/mm/bt/b;
    //   1044: aload_1
    //   1045: iload 10
    //   1047: iload 10
    //   1049: iload 5
    //   1051: iadd
    //   1052: iload 11
    //   1054: invokevirtual 403	com/tencent/mm/bt/b:f	([BIII)V
    //   1057: iload 9
    //   1059: iload 11
    //   1061: iconst_4
    //   1062: iadd
    //   1063: isub
    //   1064: istore 9
    //   1066: new 156	java/lang/StringBuilder
    //   1069: astore 6
    //   1071: aload 6
    //   1073: ldc_w 412
    //   1076: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1079: ldc 168
    //   1081: aload 6
    //   1083: iload 11
    //   1085: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1088: ldc_w 414
    //   1091: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1094: iload 4
    //   1096: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1099: ldc_w 416
    //   1102: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1105: iload_2
    //   1106: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1109: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1112: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1115: iload 9
    //   1117: ifgt +715 -> 1832
    //   1120: iconst_0
    //   1121: istore_2
    //   1122: goto -823 -> 299
    //   1125: iload 9
    //   1127: newarray byte
    //   1129: astore_1
    //   1130: iload 9
    //   1132: istore 4
    //   1134: goto -154 -> 980
    //   1137: astore_1
    //   1138: aload_0
    //   1139: aload_0
    //   1140: getfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   1143: iconst_4
    //   1144: ior
    //   1145: putfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   1148: ldc 168
    //   1150: new 156	java/lang/StringBuilder
    //   1153: dup
    //   1154: ldc_w 418
    //   1157: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1160: aload_1
    //   1161: invokevirtual 363	java/lang/Exception:toString	()Ljava/lang/String;
    //   1164: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1167: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1170: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1173: aconst_null
    //   1174: astore_1
    //   1175: iconst_0
    //   1176: istore_2
    //   1177: goto -878 -> 299
    //   1180: astore_3
    //   1181: ldc 168
    //   1183: new 156	java/lang/StringBuilder
    //   1186: dup
    //   1187: ldc_w 420
    //   1190: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1193: aload_3
    //   1194: invokevirtual 421	java/io/IOException:toString	()Ljava/lang/String;
    //   1197: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1200: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1203: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1206: goto -885 -> 321
    //   1209: astore 6
    //   1211: new 156	java/lang/StringBuilder
    //   1214: astore_3
    //   1215: aload_3
    //   1216: ldc_w 423
    //   1219: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1222: ldc 168
    //   1224: aload_3
    //   1225: aload 6
    //   1227: invokevirtual 363	java/lang/Exception:toString	()Ljava/lang/String;
    //   1230: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1233: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1236: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1239: goto -867 -> 372
    //   1242: astore_3
    //   1243: aload_0
    //   1244: aload_0
    //   1245: getfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   1248: bipush 16
    //   1250: ior
    //   1251: putfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   1254: ldc 168
    //   1256: new 156	java/lang/StringBuilder
    //   1259: dup
    //   1260: ldc_w 420
    //   1263: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1266: aload_3
    //   1267: invokevirtual 363	java/lang/Exception:toString	()Ljava/lang/String;
    //   1270: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1273: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1276: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1279: aload_0
    //   1280: getfield 80	com/tencent/mm/plugin/voip/model/d:sOc	Z
    //   1283: ifne +108 -> 1391
    //   1286: ldc 168
    //   1288: ldc_w 425
    //   1291: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1294: iconst_m1
    //   1295: istore_2
    //   1296: sipush 4337
    //   1299: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1302: goto -1264 -> 38
    //   1305: ldc_w 427
    //   1308: getstatic 57	com/tencent/mm/plugin/voip/model/d:sOa	I
    //   1311: getstatic 59	com/tencent/mm/plugin/voip/model/d:sOb	I
    //   1314: invokestatic 304	android/media/MediaFormat:createVideoFormat	(Ljava/lang/String;II)Landroid/media/MediaFormat;
    //   1317: astore_3
    //   1318: goto -926 -> 392
    //   1321: astore 7
    //   1323: aload_0
    //   1324: aload_0
    //   1325: getfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   1328: bipush 8
    //   1330: ior
    //   1331: putfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   1334: new 156	java/lang/StringBuilder
    //   1337: astore_3
    //   1338: aload_3
    //   1339: ldc_w 429
    //   1342: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1345: ldc 168
    //   1347: aload_3
    //   1348: aload 6
    //   1350: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1353: ldc_w 431
    //   1356: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1359: aload 7
    //   1361: invokevirtual 434	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1364: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1367: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1370: aload_0
    //   1371: iconst_0
    //   1372: putfield 82	com/tencent/mm/plugin/voip/model/d:sOd	Z
    //   1375: aload_0
    //   1376: invokespecial 436	com/tencent/mm/plugin/voip/model/d:cIu	()I
    //   1379: pop
    //   1380: iconst_m1
    //   1381: istore_2
    //   1382: sipush 4337
    //   1385: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1388: goto -1350 -> 38
    //   1391: aload_0
    //   1392: getfield 84	com/tencent/mm/plugin/voip/model/d:sOe	Z
    //   1395: ifne +8 -> 1403
    //   1398: aload_0
    //   1399: iconst_1
    //   1400: putfield 84	com/tencent/mm/plugin/voip/model/d:sOe	Z
    //   1403: aload_1
    //   1404: arraylength
    //   1405: istore_2
    //   1406: aload_1
    //   1407: iconst_4
    //   1408: baload
    //   1409: bipush 31
    //   1411: iand
    //   1412: istore 5
    //   1414: iload 5
    //   1416: bipush 7
    //   1418: if_icmpeq +10 -> 1428
    //   1421: iload 5
    //   1423: bipush 8
    //   1425: if_icmpne +102 -> 1527
    //   1428: bipush 83
    //   1430: istore 4
    //   1432: iload 4
    //   1434: istore 12
    //   1436: ldc 168
    //   1438: new 156	java/lang/StringBuilder
    //   1441: dup
    //   1442: ldc_w 438
    //   1445: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1448: iload_2
    //   1449: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1452: ldc_w 440
    //   1455: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1458: iload 5
    //   1460: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1463: ldc_w 442
    //   1466: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1469: iload 12
    //   1471: invokevirtual 445	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1474: ldc_w 447
    //   1477: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1480: aload_0
    //   1481: getfield 98	com/tencent/mm/plugin/voip/model/d:sOj	I
    //   1484: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1487: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1490: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1493: aload_0
    //   1494: getfield 86	com/tencent/mm/plugin/voip/model/d:sOf	Z
    //   1497: ifeq +65 -> 1562
    //   1500: iload 12
    //   1502: bipush 80
    //   1504: if_icmpne +58 -> 1562
    //   1507: ldc 168
    //   1509: ldc_w 449
    //   1512: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1515: bipush 254
    //   1517: istore_2
    //   1518: sipush 4337
    //   1521: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1524: goto -1486 -> 38
    //   1527: iload 5
    //   1529: iconst_5
    //   1530: if_icmpeq +10 -> 1540
    //   1533: iload 5
    //   1535: bipush 6
    //   1537: if_icmpne +14 -> 1551
    //   1540: bipush 73
    //   1542: istore 4
    //   1544: iload 4
    //   1546: istore 12
    //   1548: goto -112 -> 1436
    //   1551: bipush 80
    //   1553: istore 4
    //   1555: iload 4
    //   1557: istore 12
    //   1559: goto -123 -> 1436
    //   1562: aload_0
    //   1563: getfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   1566: ldc2_w 450
    //   1569: invokevirtual 455	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   1572: istore 5
    //   1574: iload 5
    //   1576: iflt +210 -> 1786
    //   1579: aload_1
    //   1580: ifnull +182 -> 1762
    //   1583: iload_2
    //   1584: ifle +178 -> 1762
    //   1587: invokestatic 252	java/lang/System:currentTimeMillis	()J
    //   1590: lstore 13
    //   1592: ldc 168
    //   1594: new 156	java/lang/StringBuilder
    //   1597: dup
    //   1598: ldc_w 457
    //   1601: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1604: iload 5
    //   1606: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1609: ldc_w 459
    //   1612: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1615: iload_2
    //   1616: invokevirtual 183	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1619: ldc_w 442
    //   1622: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1625: iload 12
    //   1627: invokevirtual 445	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1630: ldc_w 461
    //   1633: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1636: lload 13
    //   1638: invokevirtual 464	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1641: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1644: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1647: getstatic 469	android/os/Build$VERSION:SDK_INT	I
    //   1650: bipush 21
    //   1652: if_icmpge +121 -> 1773
    //   1655: aload_0
    //   1656: getfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   1659: invokevirtual 473	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   1662: iload 5
    //   1664: aaload
    //   1665: astore_3
    //   1666: aload_3
    //   1667: invokevirtual 477	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   1670: pop
    //   1671: aload_3
    //   1672: invokevirtual 477	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   1675: pop
    //   1676: aload_3
    //   1677: aload_1
    //   1678: iconst_0
    //   1679: iload_2
    //   1680: invokevirtual 480	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   1683: pop
    //   1684: aload_0
    //   1685: getfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   1688: iload 5
    //   1690: iconst_0
    //   1691: iload_2
    //   1692: lload 13
    //   1694: iconst_0
    //   1695: invokevirtual 484	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   1698: aload_0
    //   1699: aload_0
    //   1700: getfield 98	com/tencent/mm/plugin/voip/model/d:sOj	I
    //   1703: iconst_1
    //   1704: iadd
    //   1705: putfield 98	com/tencent/mm/plugin/voip/model/d:sOj	I
    //   1708: aload_0
    //   1709: iconst_0
    //   1710: putfield 88	com/tencent/mm/plugin/voip/model/d:sOg	I
    //   1713: aload_0
    //   1714: getfield 86	com/tencent/mm/plugin/voip/model/d:sOf	Z
    //   1717: ifeq +45 -> 1762
    //   1720: iconst_1
    //   1721: invokestatic 205	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   1724: astore_1
    //   1725: aload_1
    //   1726: getstatic 211	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   1729: invokevirtual 215	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   1732: pop
    //   1733: aload_1
    //   1734: iconst_0
    //   1735: invokevirtual 219	java/nio/ByteBuffer:put	(B)Ljava/nio/ByteBuffer;
    //   1738: pop
    //   1739: aload_0
    //   1740: getfield 90	com/tencent/mm/plugin/voip/model/d:sNl	Lcom/tencent/mm/plugin/voip/model/k;
    //   1743: getfield 223	com/tencent/mm/plugin/voip/model/k:sPp	Lcom/tencent/mm/plugin/voip/model/v2protocal;
    //   1746: bipush 28
    //   1748: aload_1
    //   1749: invokevirtual 227	java/nio/ByteBuffer:array	()[B
    //   1752: iconst_1
    //   1753: invokevirtual 233	com/tencent/mm/plugin/voip/model/v2protocal:setAppCmd	(I[BI)I
    //   1756: pop
    //   1757: aload_0
    //   1758: iconst_0
    //   1759: putfield 86	com/tencent/mm/plugin/voip/model/d:sOf	Z
    //   1762: iconst_0
    //   1763: istore_2
    //   1764: sipush 4337
    //   1767: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1770: goto -1732 -> 38
    //   1773: aload_0
    //   1774: getfield 123	com/tencent/mm/plugin/voip/model/d:mDecoder	Landroid/media/MediaCodec;
    //   1777: iload 5
    //   1779: invokevirtual 487	android/media/MediaCodec:getInputBuffer	(I)Ljava/nio/ByteBuffer;
    //   1782: astore_3
    //   1783: goto -112 -> 1671
    //   1786: aload_0
    //   1787: getfield 86	com/tencent/mm/plugin/voip/model/d:sOf	Z
    //   1790: ifeq +26 -> 1816
    //   1793: iload 12
    //   1795: bipush 80
    //   1797: if_icmpeq +19 -> 1816
    //   1800: aload_0
    //   1801: iconst_0
    //   1802: putfield 82	com/tencent/mm/plugin/voip/model/d:sOd	Z
    //   1805: aload_0
    //   1806: aload_0
    //   1807: getfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   1810: bipush 32
    //   1812: ior
    //   1813: putfield 100	com/tencent/mm/plugin/voip/model/d:sOk	I
    //   1816: aload_0
    //   1817: invokespecial 436	com/tencent/mm/plugin/voip/model/d:cIu	()I
    //   1820: pop
    //   1821: ldc 168
    //   1823: ldc_w 489
    //   1826: invokestatic 366	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1829: goto -67 -> 1762
    //   1832: iload 10
    //   1834: iload 11
    //   1836: iadd
    //   1837: istore 10
    //   1839: goto -856 -> 983
    //
    // Exception table:
    //   from	to	target	type
    //   49	73	814	java/lang/Exception
    //   75	95	814	java/lang/Exception
    //   99	111	814	java/lang/Exception
    //   111	295	814	java/lang/Exception
    //   501	510	814	java/lang/Exception
    //   513	525	814	java/lang/Exception
    //   525	649	814	java/lang/Exception
    //   654	669	814	java/lang/Exception
    //   675	687	814	java/lang/Exception
    //   687	811	814	java/lang/Exception
    //   862	887	814	java/lang/Exception
    //   890	922	1137	java/lang/Exception
    //   925	941	1137	java/lang/Exception
    //   946	953	1137	java/lang/Exception
    //   960	977	1137	java/lang/Exception
    //   983	1037	1137	java/lang/Exception
    //   1040	1057	1137	java/lang/Exception
    //   1066	1115	1137	java/lang/Exception
    //   1125	1130	1137	java/lang/Exception
    //   310	321	1180	java/io/IOException
    //   353	372	1209	java/lang/Exception
    //   325	349	1242	java/lang/Exception
    //   372	392	1242	java/lang/Exception
    //   392	445	1242	java/lang/Exception
    //   474	490	1242	java/lang/Exception
    //   1211	1239	1242	java/lang/Exception
    //   1305	1318	1242	java/lang/Exception
    //   1323	1380	1242	java/lang/Exception
    //   445	474	1321	java/lang/Exception
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(4334);
    this.sNl = paramk;
    ab.i("MeidaCodec[HWDec]", "setCallBack");
    AppMethodBeat.o(4334);
  }

  public final void cIv()
  {
    AppMethodBeat.i(4339);
    this.sOd = false;
    this.sOe = false;
    this.sOg = 0;
    ab.d("MeidaCodec[HWDec]", "steve: Stop Decode Thread!");
    try
    {
      if (this.outputStream != null)
      {
        this.outputStream.flush();
        this.outputStream.close();
      }
      if (this.sNV != null)
      {
        this.sNV.flush();
        this.sNV.close();
      }
      AppMethodBeat.o(4339);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.e("MeidaCodec[HWDec]", " error:" + localIOException.toString());
        AppMethodBeat.o(4339);
      }
    }
  }

  @SuppressLint({"NewApi"})
  public final void run()
  {
    AppMethodBeat.i(4338);
    while ((!Thread.interrupted()) && (this.sOd))
      if ((this.mDecoder != null) && (this.sOc) && (this.sOe))
      {
        Object localObject3;
        try
        {
          Object localObject1 = new android/media/MediaCodec$BufferInfo;
          ((MediaCodec.BufferInfo)localObject1).<init>();
          i = this.mDecoder.dequeueOutputBuffer((MediaCodec.BufferInfo)localObject1, 10000L);
          ab.d("MeidaCodec[HWDec]", "steve:  outIndex=".concat(String.valueOf(i)));
          switch (i)
          {
          default:
            if (((MediaCodec.BufferInfo)localObject1).size <= 0)
              break label435;
            long l1 = ((MediaCodec.BufferInfo)localObject1).presentationTimeUs;
            long l2 = System.currentTimeMillis();
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("DECODER_THREAD:: decoded SUCCESSFULLY!!! cnt : ");
            ab.d("MeidaCodec[HWDec]", this.sOi + ", size:" + ((MediaCodec.BufferInfo)localObject1).size + ", pts:" + ((MediaCodec.BufferInfo)localObject1).presentationTimeUs + ", latency:" + (l2 - l1));
            this.sOi += 1;
            this.mDecoder.releaseOutputBuffer(i, true);
            l2 = System.currentTimeMillis();
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("steve: Avcdecoder frame processTime = ");
            ab.d("MeidaCodec[HWDec]", l2 - l1 + ", decFrameCnt=" + this.sOi + ", endTime=" + l2);
          case -3:
          case -2:
          case -1:
          }
        }
        catch (Exception localException1)
        {
          this.sOd = false;
          this.sOk |= 128;
          cIu();
          ab.e("MeidaCodec[HWDec]", " dequeueOutputBuffer/releaseOutputBuffer error:" + localException1.toString());
        }
        continue;
        ab.d("MeidaCodec[HWDec]", "INFO_OUTPUT_BUFFERS_CHANGED");
        continue;
        Object localObject2 = this.mDecoder.getOutputFormat();
        ab.i("MeidaCodec[HWDec]", "DECODER_THREAD:: New format : ".concat(String.valueOf(localObject2)));
        int j = ((MediaFormat)localObject2).getInteger("width");
        int i = ((MediaFormat)localObject2).getInteger("height");
        if ((this.sNl != null) && (this.sNl.sPp != null))
        {
          localObject3 = this.sNl;
          localObject2 = ((k)localObject3).mHandler;
          k.9 local9 = new com/tencent/mm/plugin/voip/model/k$9;
          local9.<init>((k)localObject3, i, j);
          ((ak)localObject2).post(local9);
          continue;
          ab.d("MeidaCodec[HWDec]", "DECODER_THREAD:: dequeueOutputBuffer timed out!");
          continue;
          label435: localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("steve: drop frame: ");
          ab.d("MeidaCodec[HWDec]", this.sOi + ", size:" + ((MediaCodec.BufferInfo)localObject2).size + ", pts:" + ((MediaCodec.BufferInfo)localObject2).presentationTimeUs);
          this.mDecoder.releaseOutputBuffer(i, false);
        }
      }
      else
      {
        try
        {
          Thread.sleep(20L);
        }
        catch (InterruptedException localInterruptedException)
        {
          ab.e("MeidaCodec[HWDec]", " error:" + localInterruptedException.toString());
        }
      }
    if ((!this.sOd) && (this.mDecoder != null));
    while (true)
    {
      try
      {
        this.mDecoder.stop();
        this.mDecoder.release();
        this.mDecoder = null;
        AppMethodBeat.o(4338);
        return;
      }
      catch (Exception localException2)
      {
        ab.e("MeidaCodec[HWDec]", " decoder stop  error:" + localException2.toString());
      }
      AppMethodBeat.o(4338);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.d
 * JD-Core Version:    0.6.2
 */