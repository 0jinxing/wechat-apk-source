package com.tencent.mm.ai;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.i.a;
import com.tencent.mm.protocal.j.g;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.agy;
import com.tencent.mm.protocal.protobuf.beh;
import com.tencent.mm.protocal.protobuf.bov;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.bvv;
import com.tencent.mm.protocal.protobuf.cjj;
import com.tencent.mm.protocal.protobuf.fv;
import com.tencent.mm.protocal.r.b;
import com.tencent.mm.protocal.v.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class v extends i.a
{
  private static a fun;
  private static char[] fuo = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private byte[] cPB;
  private l.e fum;
  private int type;

  public v(l.e parame, int paramInt)
  {
    this.fum = parame;
    this.type = paramInt;
  }

  private static String V(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58295);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(58295);
    }
    while (true)
    {
      return paramArrayOfByte;
      StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        localStringBuilder.append(fuo[((paramArrayOfByte[i] & 0xF0) >>> 4)]);
        localStringBuilder.append(fuo[(paramArrayOfByte[i] & 0xF)]);
      }
      paramArrayOfByte = localStringBuilder.toString();
      AppMethodBeat.o(58295);
    }
  }

  public static void a(a parama)
  {
    fun = parama;
  }

  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, PInt paramPInt, btd parambtd)
  {
    AppMethodBeat.i(58289);
    PByteArray localPByteArray1 = new PByteArray();
    paramPInt.value = -1;
    PByteArray localPByteArray2 = new PByteArray();
    PInt localPInt1 = new PInt(0);
    PInt localPInt2 = new PInt(0);
    PInt localPInt3 = new PInt(255);
    try
    {
      boolean bool1 = MMProtocalJni.unpack(localPByteArray2, paramArrayOfByte1, paramArrayOfByte2, localPByteArray1, paramPInt, localPInt1, localPInt2, localPInt3);
      ab.i("MicroMsg.RemoteResp", "bufToRespNoRSA unpack ret[%b], noticeid[%d], headExtFlags[%d]", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(localPInt2.value), Integer.valueOf(localPInt3.value) });
      if (localPInt2.value != 0)
      {
        paramArrayOfByte1 = new com/tencent/mm/g/a/hm;
        paramArrayOfByte1.<init>();
        paramArrayOfByte1.cCo.cCp = localPInt2.value;
        boolean bool2 = a.xxA.m(paramArrayOfByte1);
        ab.i("MicroMsg.RemoteResp", "summerdiz bufToRespNoRSA publish GetDisasterInfoEvent noticeid[%d] publish[%b]", new Object[] { Integer.valueOf(localPInt2.value), Boolean.valueOf(bool2) });
      }
      if (bool1)
      {
        if ((paramPInt.value == -13) || (paramPInt.value == -102) || (paramPInt.value == -3001))
        {
          ab.e("MicroMsg.RemoteResp", "unpack failed. error:%d", new Object[] { Integer.valueOf(paramPInt.value) });
          paramArrayOfByte1 = null;
          AppMethodBeat.o(58289);
        }
        while (true)
        {
          return paramArrayOfByte1;
          int i = paramPInt.value;
          if (i == -3002)
            try
            {
              paramArrayOfByte1 = new java/lang/String;
              paramArrayOfByte1.<init>(localPByteArray2.value);
              ab.i("MicroMsg.RemoteResp", "bufToRespNoRSA -3002 ERR_IDCDISASTER, errStr:%s", new Object[] { paramArrayOfByte1 });
              paramArrayOfByte2 = new com/tencent/mm/sdk/platformtools/ak;
              paramArrayOfByte2.<init>(Looper.getMainLooper());
              paramPInt = new com/tencent/mm/ai/v$1;
              paramPInt.<init>(paramArrayOfByte1);
              paramArrayOfByte2.post(paramPInt);
              paramArrayOfByte1 = null;
              AppMethodBeat.o(58289);
            }
            catch (Exception paramArrayOfByte1)
            {
              ab.e("MicroMsg.RemoteResp", "parse string err while MM_ERR_IDCDISASTER");
            }
        }
      }
      while (true)
      {
        paramArrayOfByte1 = null;
        AppMethodBeat.o(58289);
        break;
        ab.i("MicroMsg.RemoteResp", "fuckwifi bufToRespNoRSA using protobuf ok jtype:%d enType:%d ", new Object[] { Integer.valueOf(110), Integer.valueOf(localPInt1.value) });
        parambtd.parseFrom(localPByteArray2.value);
        paramArrayOfByte1 = localPByteArray2.value;
        AppMethodBeat.o(58289);
        break;
        ab.e("MicroMsg.RemoteResp", "unpack failed.");
      }
    }
    catch (Exception paramArrayOfByte1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.RemoteResp", paramArrayOfByte1, "parseFrom unbuild exception, check now!", new Object[0]);
        ab.e("MicroMsg.RemoteResp", "exception:%s", new Object[] { bo.l(paramArrayOfByte1) });
      }
    }
  }

  public final int QF()
  {
    int i;
    switch (this.type)
    {
    default:
      i = 0;
    case 252:
    case 701:
    case 702:
    case 763:
    case 126:
    case 877:
    }
    while (true)
    {
      return i;
      i = ((j.g)this.fum).vxV.xid.luF;
      continue;
      i = ((v.b)this.fum).vyJ.luF;
    }
  }

  // ERROR //
  public final boolean a(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    // Byte code:
    //   0: ldc 235
    //   2: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 81	com/tencent/mm/pointers/PByteArray
    //   8: dup
    //   9: invokespecial 82	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   12: astore 6
    //   14: aload_0
    //   15: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   18: instanceof 237
    //   21: ifne +21 -> 42
    //   24: ldc 96
    //   26: ldc 239
    //   28: invokestatic 242	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   31: iconst_0
    //   32: istore 7
    //   34: ldc 235
    //   36: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: iload 7
    //   41: ireturn
    //   42: new 81	com/tencent/mm/pointers/PByteArray
    //   45: dup
    //   46: invokespecial 82	com/tencent/mm/pointers/PByteArray:<init>	()V
    //   49: astore 8
    //   51: new 84	com/tencent/mm/pointers/PInt
    //   54: dup
    //   55: iconst_0
    //   56: invokespecial 88	com/tencent/mm/pointers/PInt:<init>	(I)V
    //   59: astore 9
    //   61: aload_0
    //   62: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   65: checkcast 237	com/tencent/mm/protocal/l$c
    //   68: astore 10
    //   70: new 84	com/tencent/mm/pointers/PInt
    //   73: dup
    //   74: iconst_0
    //   75: invokespecial 88	com/tencent/mm/pointers/PInt:<init>	(I)V
    //   78: astore 11
    //   80: new 84	com/tencent/mm/pointers/PInt
    //   83: dup
    //   84: iconst_0
    //   85: invokespecial 88	com/tencent/mm/pointers/PInt:<init>	(I)V
    //   88: astore 12
    //   90: new 84	com/tencent/mm/pointers/PInt
    //   93: dup
    //   94: sipush 255
    //   97: invokespecial 88	com/tencent/mm/pointers/PInt:<init>	(I)V
    //   100: astore 13
    //   102: aload 10
    //   104: invokeinterface 246 1 0
    //   109: ifeq +57 -> 166
    //   112: aload 10
    //   114: aload_2
    //   115: invokeinterface 250 2 0
    //   120: istore_1
    //   121: ldc 96
    //   123: ldc 252
    //   125: invokestatic 255	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload_0
    //   129: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   132: iload_1
    //   133: putfield 260	com/tencent/mm/protocal/l$e:vyl	I
    //   136: getstatic 266	com/tencent/mm/platformtools/ae:giC	Ljava/lang/String;
    //   139: invokestatic 270	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   142: ifne +13 -> 155
    //   145: aload_0
    //   146: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   149: getstatic 266	com/tencent/mm/platformtools/ae:giC	Ljava/lang/String;
    //   152: putfield 273	com/tencent/mm/protocal/l$e:vyn	Ljava/lang/String;
    //   155: iconst_1
    //   156: istore 7
    //   158: ldc 235
    //   160: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: goto -124 -> 39
    //   166: aload_2
    //   167: ifnonnull +659 -> 826
    //   170: iconst_m1
    //   171: istore 14
    //   173: aload_3
    //   174: ifnonnull +659 -> 833
    //   177: iconst_m1
    //   178: istore 15
    //   180: ldc 96
    //   182: ldc_w 275
    //   185: iconst_4
    //   186: anewarray 100	java/lang/Object
    //   189: dup
    //   190: iconst_0
    //   191: iload_1
    //   192: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   195: aastore
    //   196: dup
    //   197: iconst_1
    //   198: iload 14
    //   200: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   203: aastore
    //   204: dup
    //   205: iconst_2
    //   206: iload 15
    //   208: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   211: aastore
    //   212: dup
    //   213: iconst_3
    //   214: aload 6
    //   216: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   219: aastore
    //   220: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: aload 8
    //   225: aload_2
    //   226: aload_3
    //   227: aload 6
    //   229: aload 9
    //   231: aload 11
    //   233: aload 12
    //   235: aload 13
    //   237: invokestatic 94	com/tencent/mm/protocal/MMProtocalJni:unpack	(Lcom/tencent/mm/pointers/PByteArray;[B[BLcom/tencent/mm/pointers/PByteArray;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   240: istore 7
    //   242: aload 11
    //   244: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   247: istore 15
    //   249: aload 12
    //   251: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   254: istore 16
    //   256: aload 13
    //   258: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   261: istore 17
    //   263: aload 8
    //   265: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   268: astore 18
    //   270: aload 8
    //   272: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   275: ifnonnull +565 -> 840
    //   278: iconst_m1
    //   279: istore 14
    //   281: ldc 96
    //   283: ldc_w 277
    //   286: bipush 7
    //   288: anewarray 100	java/lang/Object
    //   291: dup
    //   292: iconst_0
    //   293: iload 7
    //   295: invokestatic 106	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   298: aastore
    //   299: dup
    //   300: iconst_1
    //   301: iload_1
    //   302: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   305: aastore
    //   306: dup
    //   307: iconst_2
    //   308: iload 15
    //   310: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   313: aastore
    //   314: dup
    //   315: iconst_3
    //   316: iload 16
    //   318: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   321: aastore
    //   322: dup
    //   323: iconst_4
    //   324: iload 17
    //   326: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   329: aastore
    //   330: dup
    //   331: iconst_5
    //   332: aload 18
    //   334: aastore
    //   335: dup
    //   336: bipush 6
    //   338: iload 14
    //   340: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   343: aastore
    //   344: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   347: iload 7
    //   349: ifeq +1081 -> 1430
    //   352: aload_0
    //   353: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   356: aload 13
    //   358: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   361: putfield 280	com/tencent/mm/protocal/l$e:vym	I
    //   364: iload_1
    //   365: sipush 701
    //   368: if_icmpeq +75 -> 443
    //   371: iload_1
    //   372: sipush 702
    //   375: if_icmpeq +68 -> 443
    //   378: iload_1
    //   379: sipush 252
    //   382: if_icmpeq +61 -> 443
    //   385: iload_1
    //   386: sipush 763
    //   389: if_icmpeq +54 -> 443
    //   392: sipush 10001
    //   395: getstatic 283	com/tencent/mm/platformtools/ae:giz	I
    //   398: if_icmpne +45 -> 443
    //   401: getstatic 286	com/tencent/mm/platformtools/ae:giA	I
    //   404: ifle +39 -> 443
    //   407: getstatic 286	com/tencent/mm/platformtools/ae:giA	I
    //   410: iconst_2
    //   411: if_icmpne +13 -> 424
    //   414: ldc_w 288
    //   417: ldc_w 288
    //   420: iconst_0
    //   421: invokestatic 294	com/tencent/mm/protocal/z:O	(Ljava/lang/String;Ljava/lang/String;I)V
    //   424: iconst_0
    //   425: putstatic 286	com/tencent/mm/platformtools/ae:giA	I
    //   428: aload 9
    //   430: bipush 243
    //   432: putfield 87	com/tencent/mm/pointers/PInt:value	I
    //   435: ldc 96
    //   437: ldc_w 296
    //   440: invokestatic 299	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   443: aload 9
    //   445: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   448: sipush -306
    //   451: if_icmpne +400 -> 851
    //   454: ldc 96
    //   456: ldc_w 301
    //   459: iconst_1
    //   460: anewarray 100	java/lang/Object
    //   463: dup
    //   464: iconst_0
    //   465: getstatic 307	com/tencent/mm/protocal/f:vxx	Z
    //   468: invokestatic 106	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   471: aastore
    //   472: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   475: iconst_0
    //   476: putstatic 307	com/tencent/mm/protocal/f:vxx	Z
    //   479: aload 9
    //   481: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   484: bipush 243
    //   486: if_icmpeq +57 -> 543
    //   489: aload 9
    //   491: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   494: bipush 154
    //   496: if_icmpeq +47 -> 543
    //   499: aload 9
    //   501: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   504: sipush -3001
    //   507: if_icmpeq +36 -> 543
    //   510: aload 9
    //   512: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   515: sipush -3002
    //   518: if_icmpeq +25 -> 543
    //   521: aload 9
    //   523: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   526: sipush -3003
    //   529: if_icmpeq +14 -> 543
    //   532: aload 9
    //   534: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   537: sipush -306
    //   540: if_icmpne +697 -> 1237
    //   543: aload_0
    //   544: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   547: aload 9
    //   549: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   552: putfield 260	com/tencent/mm/protocal/l$e:vyl	I
    //   555: aload 9
    //   557: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   560: istore 14
    //   562: iload 14
    //   564: sipush -3002
    //   567: if_icmpne +74 -> 641
    //   570: aload_0
    //   571: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   574: astore_3
    //   575: new 147	java/lang/String
    //   578: astore 10
    //   580: aload 10
    //   582: aload 8
    //   584: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   587: invokespecial 152	java/lang/String:<init>	([B)V
    //   590: aload_3
    //   591: aload 10
    //   593: putfield 273	com/tencent/mm/protocal/l$e:vyn	Ljava/lang/String;
    //   596: ldc 96
    //   598: ldc_w 309
    //   601: iconst_4
    //   602: anewarray 100	java/lang/Object
    //   605: dup
    //   606: iconst_0
    //   607: iload_1
    //   608: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   611: aastore
    //   612: dup
    //   613: iconst_1
    //   614: aload 9
    //   616: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   619: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   622: aastore
    //   623: dup
    //   624: iconst_2
    //   625: aload 12
    //   627: aastore
    //   628: dup
    //   629: iconst_3
    //   630: aload_0
    //   631: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   634: getfield 273	com/tencent/mm/protocal/l$e:vyn	Ljava/lang/String;
    //   637: aastore
    //   638: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   641: aload_0
    //   642: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   645: aload_2
    //   646: arraylength
    //   647: i2l
    //   648: putfield 313	com/tencent/mm/protocal/l$e:bufferSize	J
    //   651: aload_0
    //   652: aload 6
    //   654: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   657: putfield 315	com/tencent/mm/ai/v:cPB	[B
    //   660: getstatic 266	com/tencent/mm/platformtools/ae:giC	Ljava/lang/String;
    //   663: invokestatic 270	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   666: ifne +13 -> 679
    //   669: aload_0
    //   670: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   673: getstatic 266	com/tencent/mm/platformtools/ae:giC	Ljava/lang/String;
    //   676: putfield 273	com/tencent/mm/protocal/l$e:vyn	Ljava/lang/String;
    //   679: aload 12
    //   681: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   684: ifeq +131 -> 815
    //   687: new 118	com/tencent/mm/g/a/hm
    //   690: astore_2
    //   691: aload_2
    //   692: invokespecial 119	com/tencent/mm/g/a/hm:<init>	()V
    //   695: aload_2
    //   696: getfield 123	com/tencent/mm/g/a/hm:cCo	Lcom/tencent/mm/g/a/hm$a;
    //   699: aload 12
    //   701: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   704: putfield 128	com/tencent/mm/g/a/hm$a:cCp	I
    //   707: iload_1
    //   708: sipush 252
    //   711: if_icmpeq +10 -> 721
    //   714: iload_1
    //   715: sipush 701
    //   718: if_icmpne +51 -> 769
    //   721: aload_0
    //   722: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   725: getfield 260	com/tencent/mm/protocal/l$e:vyl	I
    //   728: ifne +41 -> 769
    //   731: ldc 96
    //   733: ldc_w 317
    //   736: iconst_2
    //   737: anewarray 100	java/lang/Object
    //   740: dup
    //   741: iconst_0
    //   742: aload 12
    //   744: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   747: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   750: aastore
    //   751: dup
    //   752: iconst_1
    //   753: iload_1
    //   754: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   757: aastore
    //   758: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   761: aload_2
    //   762: getfield 123	com/tencent/mm/g/a/hm:cCo	Lcom/tencent/mm/g/a/hm$a;
    //   765: iconst_1
    //   766: putfield 320	com/tencent/mm/g/a/hm$a:cCq	Z
    //   769: getstatic 134	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   772: aload_2
    //   773: invokevirtual 138	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   776: istore 7
    //   778: ldc 96
    //   780: ldc_w 322
    //   783: iconst_2
    //   784: anewarray 100	java/lang/Object
    //   787: dup
    //   788: iconst_0
    //   789: aload 12
    //   791: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   794: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   797: aastore
    //   798: dup
    //   799: iconst_1
    //   800: iload 7
    //   802: invokestatic 106	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   805: aastore
    //   806: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   809: aload 12
    //   811: iconst_0
    //   812: putfield 87	com/tencent/mm/pointers/PInt:value	I
    //   815: iconst_1
    //   816: istore 7
    //   818: ldc 235
    //   820: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   823: goto -784 -> 39
    //   826: aload_2
    //   827: arraylength
    //   828: istore 14
    //   830: goto -657 -> 173
    //   833: aload_3
    //   834: arraylength
    //   835: istore 15
    //   837: goto -657 -> 180
    //   840: aload 8
    //   842: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   845: arraylength
    //   846: istore 14
    //   848: goto -567 -> 281
    //   851: aload 11
    //   853: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   856: bipush 13
    //   858: if_icmpne +196 -> 1054
    //   861: aload 8
    //   863: aload_3
    //   864: aload 8
    //   866: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   869: invokestatic 328	com/tencent/mm/jni/utils/UtilsJni:AesGcmDecryptWithUncompress	([B[B)[B
    //   872: putfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   875: aload 8
    //   877: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   880: astore_3
    //   881: aload 8
    //   883: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   886: ifnonnull +157 -> 1043
    //   889: iconst_m1
    //   890: istore 14
    //   892: ldc 96
    //   894: ldc_w 330
    //   897: iconst_3
    //   898: anewarray 100	java/lang/Object
    //   901: dup
    //   902: iconst_0
    //   903: iload_1
    //   904: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   907: aastore
    //   908: dup
    //   909: iconst_1
    //   910: aload_3
    //   911: aastore
    //   912: dup
    //   913: iconst_2
    //   914: iload 14
    //   916: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   919: aastore
    //   920: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   923: goto -444 -> 479
    //   926: astore_2
    //   927: ldc 96
    //   929: aload_2
    //   930: ldc_w 332
    //   933: iconst_0
    //   934: anewarray 100	java/lang/Object
    //   937: invokestatic 193	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   940: ldc 96
    //   942: ldc 195
    //   944: iconst_1
    //   945: anewarray 100	java/lang/Object
    //   948: dup
    //   949: iconst_0
    //   950: aload_2
    //   951: invokestatic 201	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   954: aastore
    //   955: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   958: aload 12
    //   960: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   963: ifeq +69 -> 1032
    //   966: new 118	com/tencent/mm/g/a/hm
    //   969: dup
    //   970: invokespecial 119	com/tencent/mm/g/a/hm:<init>	()V
    //   973: astore_2
    //   974: aload_2
    //   975: getfield 123	com/tencent/mm/g/a/hm:cCo	Lcom/tencent/mm/g/a/hm$a;
    //   978: aload 12
    //   980: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   983: putfield 128	com/tencent/mm/g/a/hm$a:cCp	I
    //   986: getstatic 134	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   989: aload_2
    //   990: invokevirtual 138	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   993: istore 7
    //   995: ldc 96
    //   997: ldc_w 322
    //   1000: iconst_2
    //   1001: anewarray 100	java/lang/Object
    //   1004: dup
    //   1005: iconst_0
    //   1006: aload 12
    //   1008: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   1011: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1014: aastore
    //   1015: dup
    //   1016: iconst_1
    //   1017: iload 7
    //   1019: invokestatic 106	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1022: aastore
    //   1023: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1026: aload 12
    //   1028: iconst_0
    //   1029: putfield 87	com/tencent/mm/pointers/PInt:value	I
    //   1032: iconst_0
    //   1033: istore 7
    //   1035: ldc 235
    //   1037: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1040: goto -1001 -> 39
    //   1043: aload 8
    //   1045: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1048: arraylength
    //   1049: istore 14
    //   1051: goto -159 -> 892
    //   1054: aload 11
    //   1056: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   1059: bipush 12
    //   1061: if_icmpne -582 -> 479
    //   1064: aload 8
    //   1066: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1069: ifnonnull +135 -> 1204
    //   1072: iconst_m1
    //   1073: istore 14
    //   1075: lload 4
    //   1077: lconst_0
    //   1078: lcmp
    //   1079: ifne +22 -> 1101
    //   1082: ldc 96
    //   1084: ldc_w 334
    //   1087: iconst_1
    //   1088: anewarray 100	java/lang/Object
    //   1091: dup
    //   1092: iconst_0
    //   1093: iload_1
    //   1094: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1097: aastore
    //   1098: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1101: aload 8
    //   1103: lload 4
    //   1105: aload 8
    //   1107: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1110: invokestatic 338	com/tencent/mm/jni/utils/UtilsJni:HybridEcdhDecrypt	(J[B)[B
    //   1113: putfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1116: lload 4
    //   1118: invokestatic 342	com/tencent/mm/protocal/f:me	(J)V
    //   1121: aload 9
    //   1123: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   1126: istore 16
    //   1128: aload 8
    //   1130: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1133: astore_3
    //   1134: aload 8
    //   1136: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1139: ifnonnull +76 -> 1215
    //   1142: iconst_m1
    //   1143: istore 15
    //   1145: ldc 96
    //   1147: ldc_w 344
    //   1150: bipush 6
    //   1152: anewarray 100	java/lang/Object
    //   1155: dup
    //   1156: iconst_0
    //   1157: iload_1
    //   1158: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1161: aastore
    //   1162: dup
    //   1163: iconst_1
    //   1164: iload 16
    //   1166: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1169: aastore
    //   1170: dup
    //   1171: iconst_2
    //   1172: lload 4
    //   1174: invokestatic 349	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1177: aastore
    //   1178: dup
    //   1179: iconst_3
    //   1180: aload_3
    //   1181: aastore
    //   1182: dup
    //   1183: iconst_4
    //   1184: iload 14
    //   1186: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1189: aastore
    //   1190: dup
    //   1191: iconst_5
    //   1192: iload 15
    //   1194: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1197: aastore
    //   1198: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1201: goto -722 -> 479
    //   1204: aload 8
    //   1206: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1209: arraylength
    //   1210: istore 14
    //   1212: goto -137 -> 1075
    //   1215: aload 8
    //   1217: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1220: arraylength
    //   1221: istore 15
    //   1223: goto -78 -> 1145
    //   1226: astore_3
    //   1227: ldc 96
    //   1229: ldc 174
    //   1231: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1234: goto -638 -> 596
    //   1237: aload 10
    //   1239: aload 8
    //   1241: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1244: invokeinterface 250 2 0
    //   1249: istore 14
    //   1251: ldc 96
    //   1253: ldc_w 351
    //   1256: iconst_5
    //   1257: anewarray 100	java/lang/Object
    //   1260: dup
    //   1261: iconst_0
    //   1262: iload_1
    //   1263: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1266: aastore
    //   1267: dup
    //   1268: iconst_1
    //   1269: aload 11
    //   1271: getfield 87	com/tencent/mm/pointers/PInt:value	I
    //   1274: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1277: aastore
    //   1278: dup
    //   1279: iconst_2
    //   1280: iload 14
    //   1282: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1285: aastore
    //   1286: dup
    //   1287: iconst_3
    //   1288: aload 8
    //   1290: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1293: arraylength
    //   1294: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1297: aastore
    //   1298: dup
    //   1299: iconst_4
    //   1300: aload_0
    //   1301: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   1304: getfield 280	com/tencent/mm/protocal/l$e:vym	I
    //   1307: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1310: aastore
    //   1311: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1314: aload_0
    //   1315: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   1318: iload 14
    //   1320: putfield 260	com/tencent/mm/protocal/l$e:vyl	I
    //   1323: iload 14
    //   1325: sipush -305
    //   1328: if_icmpne -687 -> 641
    //   1331: ldc 96
    //   1333: ldc_w 353
    //   1336: iconst_2
    //   1337: anewarray 100	java/lang/Object
    //   1340: dup
    //   1341: iconst_0
    //   1342: getstatic 356	com/tencent/mm/protocal/f:vxC	I
    //   1345: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1348: aastore
    //   1349: dup
    //   1350: iconst_1
    //   1351: iload_1
    //   1352: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1355: aastore
    //   1356: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1359: invokestatic 359	com/tencent/mm/protocal/f:dmh	()Z
    //   1362: pop
    //   1363: goto -722 -> 641
    //   1366: astore_2
    //   1367: new 62	java/lang/StringBuilder
    //   1370: astore_3
    //   1371: aload_3
    //   1372: ldc_w 361
    //   1375: invokespecial 362	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1378: ldc 96
    //   1380: aload_3
    //   1381: aload_2
    //   1382: invokevirtual 365	java/lang/OutOfMemoryError:getMessage	()Ljava/lang/String;
    //   1385: invokevirtual 368	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1388: ldc_w 370
    //   1391: invokevirtual 368	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1394: aload 8
    //   1396: getfield 149	com/tencent/mm/pointers/PByteArray:value	[B
    //   1399: invokestatic 372	com/tencent/mm/ai/v:V	([B)Ljava/lang/String;
    //   1402: invokevirtual 368	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1405: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1408: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1411: aload_0
    //   1412: getfield 46	com/tencent/mm/ai/v:fum	Lcom/tencent/mm/protocal/l$e;
    //   1415: iconst_m1
    //   1416: putfield 260	com/tencent/mm/protocal/l$e:vyl	I
    //   1419: iconst_1
    //   1420: istore 7
    //   1422: ldc 235
    //   1424: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1427: goto -1388 -> 39
    //   1430: ldc 96
    //   1432: ldc_w 374
    //   1435: iconst_1
    //   1436: anewarray 100	java/lang/Object
    //   1439: dup
    //   1440: iconst_0
    //   1441: iload_1
    //   1442: invokestatic 111	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1445: aastore
    //   1446: invokestatic 145	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1449: goto -491 -> 958
    //
    // Exception table:
    //   from	to	target	type
    //   102	155	926	java/lang/Exception
    //   180	278	926	java/lang/Exception
    //   281	347	926	java/lang/Exception
    //   352	364	926	java/lang/Exception
    //   392	424	926	java/lang/Exception
    //   424	443	926	java/lang/Exception
    //   443	479	926	java/lang/Exception
    //   479	543	926	java/lang/Exception
    //   543	562	926	java/lang/Exception
    //   596	641	926	java/lang/Exception
    //   641	679	926	java/lang/Exception
    //   679	707	926	java/lang/Exception
    //   721	769	926	java/lang/Exception
    //   769	815	926	java/lang/Exception
    //   826	830	926	java/lang/Exception
    //   833	837	926	java/lang/Exception
    //   840	848	926	java/lang/Exception
    //   851	889	926	java/lang/Exception
    //   892	923	926	java/lang/Exception
    //   1043	1051	926	java/lang/Exception
    //   1054	1072	926	java/lang/Exception
    //   1082	1101	926	java/lang/Exception
    //   1101	1142	926	java/lang/Exception
    //   1145	1201	926	java/lang/Exception
    //   1204	1212	926	java/lang/Exception
    //   1215	1223	926	java/lang/Exception
    //   1227	1234	926	java/lang/Exception
    //   1237	1323	926	java/lang/Exception
    //   1331	1363	926	java/lang/Exception
    //   1367	1419	926	java/lang/Exception
    //   1430	1449	926	java/lang/Exception
    //   570	596	1226	java/lang/Exception
    //   1237	1323	1366	java/lang/OutOfMemoryError
    //   1331	1363	1366	java/lang/OutOfMemoryError
  }

  public final String adA()
  {
    AppMethodBeat.i(58292);
    Object localObject;
    if (this.type == 381)
    {
      localObject = ((r.b)this.fum).vyD.wnt;
      if (localObject != null)
      {
        localObject = bo.nullAsNil(((bov)localObject).wRs);
        AppMethodBeat.o(58292);
      }
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(58292);
    }
  }

  public final String adB()
  {
    AppMethodBeat.i(58293);
    Object localObject;
    if (this.type == 381)
    {
      localObject = ((r.b)this.fum).vyD.wnt;
      if (localObject != null)
      {
        localObject = bo.nullAsNil(((bov)localObject).wRr);
        AppMethodBeat.o(58293);
      }
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(58293);
    }
  }

  public final int adC()
  {
    if (this.type == 381);
    for (int i = ((r.b)this.fum).vyD.wmw; ; i = 0)
      return i;
  }

  public final String adD()
  {
    String str;
    switch (this.type)
    {
    default:
      str = "";
    case 252:
    case 701:
    case 702:
    case 763:
    case 126:
    case 877:
    }
    while (true)
    {
      return str;
      str = ((j.g)this.fum).gcF;
      continue;
      str = ((v.b)this.fum).vyJ.jBB;
    }
  }

  public final byte[] ada()
  {
    return this.cPB;
  }

  public final byte[] adc()
  {
    byte[] arrayOfByte = new byte[0];
    switch (this.type)
    {
    default:
    case 252:
    case 701:
    case 702:
    case 763:
    case 126:
    case 877:
    }
    while (true)
    {
      return arrayOfByte;
      arrayOfByte = ((j.g)this.fum).vxW;
      continue;
      arrayOfByte = ((v.b)this.fum).vxW;
    }
  }

  public final int adw()
  {
    return this.fum.vym;
  }

  public final String adx()
  {
    return this.fum.vyn;
  }

  public final int ady()
  {
    return this.fum.vyl;
  }

  public final byte[] adz()
  {
    AppMethodBeat.i(58291);
    switch (this.type)
    {
    default:
    case 252:
    case 701:
    case 702:
    case 763:
    case 126:
    case 877:
    }
    while (true)
    {
      Object localObject = new byte[0];
      while (true)
      {
        ab.i("MicroMsg.RemoteResp", "summerauths getAutoAuthKey type[%s] key[%s]", new Object[] { Integer.valueOf(this.type), Integer.valueOf(localObject.length) });
        AppMethodBeat.o(58291);
        return localObject;
        if (((j.g)this.fum).vxV.xid.vHH == null)
          break;
        localObject = ((j.g)this.fum).vxV.xid.vHH.getBuffer().toByteArray();
        continue;
        localObject = ((v.b)this.fum).vyJ.wIp;
        if ((localObject == null) || (((bvv)localObject).vHH == null))
          break label194;
        localObject = ((bvv)localObject).vHH.getBuffer().toByteArray();
      }
      label194: ab.d("MicroMsg.RemoteResp", "summerauth reg[%s] SecAuthRegKeySect is null", new Object[] { Integer.valueOf(this.type) });
    }
  }

  public final int getCmdId()
  {
    AppMethodBeat.i(58294);
    int i = this.fum.getCmdId();
    AppMethodBeat.o(58294);
    return i;
  }

  public final byte[] jQ(int paramInt)
  {
    AppMethodBeat.i(58290);
    byte[] arrayOfByte = new byte[0];
    switch (this.type)
    {
    default:
      if (arrayOfByte != null)
        break;
    case 252:
    case 701:
    case 702:
    case 763:
    case 126:
    case 877:
    }
    for (int i = -1; ; i = arrayOfByte.length)
    {
      ab.i("MicroMsg.RemoteResp", "summerauths getSessionKey seesionKeyType[%s] [%s] [%s]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), bo.dpG() });
      AppMethodBeat.o(58290);
      return arrayOfByte;
      arrayOfByte = ((j.g)this.fum).LA(paramInt);
      break;
      arrayOfByte = ((v.b)this.fum).LA(paramInt);
      break;
    }
  }

  public final void la(int paramInt)
  {
    this.fum.vyl = paramInt;
  }

  public final void qx(String paramString)
  {
    this.fum.vyn = paramString;
  }

  public static abstract interface a
  {
    public abstract void dm(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.v
 * JD-Core Version:    0.6.2
 */