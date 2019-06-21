package com.tencent.mm.at.a.f;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.a;
import com.tencent.mm.at.a.c.d;
import com.tencent.mm.at.a.c.e;
import com.tencent.mm.at.a.c.f;
import com.tencent.mm.at.a.c.g;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.at.a.c.j;
import com.tencent.mm.at.a.c.k;
import com.tencent.mm.at.a.c.l;
import com.tencent.mm.at.a.c.m;
import com.tencent.mm.at.a.c.n;
import com.tencent.mm.at.a.c.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
  implements Runnable
{
  private final com.tencent.mm.at.a.a.b fGK;
  public final com.tencent.mm.at.a.a.c fGS;
  private final m fGT;
  private final a fGU;
  private final com.tencent.mm.at.a.c.b fGV;
  private final j fGX;
  private final e fGZ;
  private final n fHc;
  private final o fHk;
  private final com.tencent.mm.at.a.b fHp;
  public final com.tencent.mm.at.a.c fHr;
  private final ak fHs;
  private final i fHt;
  private final g fHu;
  private final f fHv;
  private final k fHw;
  private final d fHx;
  private final l fHy;
  public final String url;

  public b(String paramString, com.tencent.mm.at.a.c paramc, ak paramak, com.tencent.mm.at.a.a.c paramc1, i parami, com.tencent.mm.at.a.b paramb, g paramg)
  {
    AppMethodBeat.i(116106);
    this.url = paramString;
    this.fHr = paramc;
    this.fHs = paramak;
    this.fHp = paramb;
    this.fHu = paramg;
    this.fGK = this.fHp.fGK;
    if (paramc1 == null)
    {
      this.fGS = this.fGK.fGS;
      this.fHt = parami;
      this.fGX = this.fGK.fGX;
      if (this.fGS.fGV == null)
        break label203;
    }
    label203: for (this.fGV = this.fGS.fGV; ; this.fGV = this.fGK.fGV)
    {
      this.fHk = this.fGS.fHk;
      this.fGT = this.fGK.fGT;
      this.fGU = this.fGK.fGU;
      this.fHv = this.fGK.fGW;
      this.fHw = this.fGK.fGY;
      this.fGZ = this.fGK.fGZ;
      this.fHx = null;
      this.fHy = null;
      this.fHc = this.fGK.fHc;
      AppMethodBeat.o(116106);
      return;
      this.fGS = paramc1;
      break;
    }
  }

  private Bitmap a(com.tencent.mm.at.a.d.b paramb, Bitmap paramBitmap)
  {
    AppMethodBeat.i(116109);
    if ((this.fHu != null) && (paramb != null))
    {
      paramb.bitmap = paramBitmap;
      paramb = this.fHu.a(this.url, this.fHr.getImageView(), paramb);
      if ((paramb != null) && (!paramb.isRecycled()))
      {
        AppMethodBeat.o(116109);
        paramBitmap = paramb;
      }
    }
    while (true)
    {
      return paramBitmap;
      AppMethodBeat.o(116109);
    }
  }

  private void k(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(116108);
    if (this.fGS.ePF)
    {
      ab.d("MicroMsg.imageloader.ImageLoadTask", "[cpan] run. put key %s to memory cache.", new Object[] { this.url });
      this.fGT.c(paramString, paramBitmap);
    }
    AppMethodBeat.o(116108);
  }

  public final void fN(long paramLong)
  {
    AppMethodBeat.i(116111);
    if (this.fGX != null)
      this.fGX.fN(paramLong);
    AppMethodBeat.o(116111);
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 181
    //   2: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_1
    //   7: new 125	com/tencent/mm/at/a/d/b
    //   10: dup
    //   11: invokespecial 182	com/tencent/mm/at/a/d/b:<init>	()V
    //   14: astore_2
    //   15: aload_2
    //   16: iconst_1
    //   17: putfield 186	com/tencent/mm/at/a/d/b:from	I
    //   20: aload_0
    //   21: aload_0
    //   22: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   25: invokevirtual 190	com/tencent/mm/at/a/f/b:sJ	(Ljava/lang/String;)Ljava/lang/String;
    //   28: astore_3
    //   29: ldc 155
    //   31: ldc 192
    //   33: iconst_1
    //   34: anewarray 4	java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: aload_0
    //   40: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   43: aastore
    //   44: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: invokestatic 198	java/lang/System:currentTimeMillis	()J
    //   50: lstore 4
    //   52: aload_0
    //   53: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   56: getfield 201	com/tencent/mm/at/a/a/c:fHe	I
    //   59: istore 6
    //   61: aload_0
    //   62: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   65: getfield 204	com/tencent/mm/at/a/a/c:ePP	Z
    //   68: istore 7
    //   70: aload_0
    //   71: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   74: getfield 207	com/tencent/mm/at/a/a/c:cvZ	Ljava/lang/String;
    //   77: astore 8
    //   79: ldc 155
    //   81: ldc 209
    //   83: iload 7
    //   85: invokestatic 215	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   88: invokevirtual 218	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   91: invokestatic 221	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: ldc 155
    //   96: ldc 223
    //   98: iconst_1
    //   99: anewarray 4	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: iload 6
    //   106: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   109: aastore
    //   110: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: ldc 155
    //   115: ldc 230
    //   117: iconst_2
    //   118: anewarray 4	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload_0
    //   124: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   127: getfield 233	com/tencent/mm/at/a/c:width	I
    //   130: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   133: aastore
    //   134: dup
    //   135: iconst_1
    //   136: aload_0
    //   137: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   140: getfield 236	com/tencent/mm/at/a/c:height	I
    //   143: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   146: aastore
    //   147: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: iload 6
    //   152: tableswitch	default:+36 -> 188, 1:+330->482, 2:+1235->1387, 3:+1264->1416, 4:+1317->1469, 5:+1009->1161
    //   189: iflt +4846 -> 5035
    //   192: iconst_1
    //   193: anewarray 4	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: iload 6
    //   200: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   203: aastore
    //   204: invokestatic 241	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   207: invokestatic 198	java/lang/System:currentTimeMillis	()J
    //   210: lstore 9
    //   212: aload_1
    //   213: ifnull +10 -> 223
    //   216: aload_1
    //   217: invokevirtual 146	android/graphics/Bitmap:isRecycled	()Z
    //   220: ifeq +1924 -> 2144
    //   223: iload 6
    //   225: tableswitch	default:+35 -> 260, 1:+1905->2130, 2:+1905->2130, 3:+1905->2130, 4:+1905->2130, 5:+1283->1508
    //   261: iflt +4851 -> 5112
    //   264: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   267: aload_2
    //   268: astore 11
    //   270: aload_1
    //   271: ifnull +2059 -> 2330
    //   274: aload_1
    //   275: invokevirtual 146	android/graphics/Bitmap:isRecycled	()Z
    //   278: ifne +2052 -> 2330
    //   281: ldc 155
    //   283: ldc 248
    //   285: invokestatic 221	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   288: aload_1
    //   289: astore_2
    //   290: aload_0
    //   291: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   294: getfield 251	com/tencent/mm/at/a/a/c:fHf	Z
    //   297: ifeq +15 -> 312
    //   300: aload_1
    //   301: aload_0
    //   302: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   305: getfield 254	com/tencent/mm/at/a/a/c:fHg	I
    //   308: invokestatic 259	com/tencent/mm/sdk/platformtools/d:e	(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   311: astore_2
    //   312: new 261	com/tencent/mm/at/a/f/c
    //   315: dup
    //   316: aload_0
    //   317: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   320: aload_0
    //   321: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   324: aload_2
    //   325: aload_0
    //   326: getfield 64	com/tencent/mm/at/a/f/b:fHp	Lcom/tencent/mm/at/a/b;
    //   329: aload_0
    //   330: aload_0
    //   331: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   334: invokevirtual 190	com/tencent/mm/at/a/f/b:sJ	(Ljava/lang/String;)Ljava/lang/String;
    //   337: invokespecial 264	com/tencent/mm/at/a/f/c:<init>	(Ljava/lang/String;Lcom/tencent/mm/at/a/c;Landroid/graphics/Bitmap;Lcom/tencent/mm/at/a/b;Ljava/lang/String;)V
    //   340: astore_1
    //   341: aload_0
    //   342: getfield 62	com/tencent/mm/at/a/f/b:fHs	Lcom/tencent/mm/sdk/platformtools/ak;
    //   345: ifnull +12 -> 357
    //   348: aload_0
    //   349: getfield 62	com/tencent/mm/at/a/f/b:fHs	Lcom/tencent/mm/sdk/platformtools/ak;
    //   352: aload_1
    //   353: invokevirtual 270	com/tencent/mm/sdk/platformtools/ak:post	(Ljava/lang/Runnable;)Z
    //   356: pop
    //   357: aload 11
    //   359: aload_2
    //   360: putfield 129	com/tencent/mm/at/a/d/b:bitmap	Landroid/graphics/Bitmap;
    //   363: aload 11
    //   365: iconst_0
    //   366: putfield 273	com/tencent/mm/at/a/d/b:status	I
    //   369: aload_2
    //   370: astore_1
    //   371: aload_0
    //   372: getfield 66	com/tencent/mm/at/a/f/b:fHu	Lcom/tencent/mm/at/a/c/g;
    //   375: ifnull +36 -> 411
    //   378: aload 11
    //   380: ifnull +31 -> 411
    //   383: aload 11
    //   385: aload_1
    //   386: putfield 129	com/tencent/mm/at/a/d/b:bitmap	Landroid/graphics/Bitmap;
    //   389: aload_0
    //   390: getfield 66	com/tencent/mm/at/a/f/b:fHu	Lcom/tencent/mm/at/a/c/g;
    //   393: aload_0
    //   394: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   397: aload_0
    //   398: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   401: invokevirtual 135	com/tencent/mm/at/a/c:getImageView	()Landroid/widget/ImageView;
    //   404: aload 11
    //   406: invokeinterface 277 4 0
    //   411: aload_0
    //   412: getfield 78	com/tencent/mm/at/a/f/b:fHt	Lcom/tencent/mm/at/a/c/i;
    //   415: aload_0
    //   416: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   419: aload_0
    //   420: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   423: invokevirtual 135	com/tencent/mm/at/a/c:getImageView	()Landroid/widget/ImageView;
    //   426: aload_1
    //   427: aload_0
    //   428: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   431: getfield 281	com/tencent/mm/at/a/a/c:eQd	[Ljava/lang/Object;
    //   434: invokeinterface 286 5 0
    //   439: aload_0
    //   440: getfield 64	com/tencent/mm/at/a/f/b:fHp	Lcom/tencent/mm/at/a/b;
    //   443: astore_1
    //   444: aload_1
    //   445: getfield 290	com/tencent/mm/at/a/b:fGO	Ljava/util/HashMap;
    //   448: ifnull +28 -> 476
    //   451: aload_0
    //   452: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   455: ifnull +21 -> 476
    //   458: aload_1
    //   459: getfield 290	com/tencent/mm/at/a/b:fGO	Ljava/util/HashMap;
    //   462: aload_0
    //   463: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   466: getfield 293	com/tencent/mm/at/a/c:eQF	I
    //   469: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   472: invokevirtual 299	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   475: pop
    //   476: ldc 181
    //   478: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   481: return
    //   482: aload_0
    //   483: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   486: getfield 302	com/tencent/mm/at/a/a/c:thumbPath	Ljava/lang/String;
    //   489: astore 11
    //   491: aload_0
    //   492: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   495: getfield 305	com/tencent/mm/at/a/a/c:fHh	Z
    //   498: ifeq +120 -> 618
    //   501: aload 11
    //   503: invokestatic 311	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   506: ifne +112 -> 618
    //   509: aload 11
    //   511: invokestatic 316	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   514: ifeq +104 -> 618
    //   517: aload_0
    //   518: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   521: getfield 319	com/tencent/mm/at/a/a/c:eQa	Z
    //   524: ifeq +66 -> 590
    //   527: aload_0
    //   528: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   531: aload 11
    //   533: aload_0
    //   534: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   537: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   540: aload_0
    //   541: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   544: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   547: invokestatic 330	com/tencent/mm/at/a/g/a:b	(Lcom/tencent/mm/at/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   550: astore 11
    //   552: aload 11
    //   554: astore_1
    //   555: aload 11
    //   557: astore 12
    //   559: aload_0
    //   560: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   563: getfield 333	com/tencent/mm/at/a/a/c:density	I
    //   566: ifle +1831 -> 2397
    //   569: aload 11
    //   571: astore_1
    //   572: aload 11
    //   574: aload_0
    //   575: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   578: getfield 333	com/tencent/mm/at/a/a/c:density	I
    //   581: invokevirtual 336	android/graphics/Bitmap:setDensity	(I)V
    //   584: aload 11
    //   586: astore_1
    //   587: goto -380 -> 207
    //   590: aload_0
    //   591: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   594: aload 11
    //   596: aload_0
    //   597: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   600: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   603: aload_0
    //   604: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   607: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   610: invokestatic 338	com/tencent/mm/at/a/g/a:a	(Lcom/tencent/mm/at/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   613: astore 11
    //   615: goto -63 -> 552
    //   618: aload_0
    //   619: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   622: invokestatic 311	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   625: ifne +525 -> 1150
    //   628: aload_0
    //   629: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   632: invokestatic 316	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   635: ifeq +504 -> 1139
    //   638: iload 7
    //   640: ifeq +21 -> 661
    //   643: aload_0
    //   644: getfield 105	com/tencent/mm/at/a/f/b:fHw	Lcom/tencent/mm/at/a/c/k;
    //   647: aload 8
    //   649: aload_0
    //   650: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   653: invokeinterface 344 3 0
    //   658: ifeq +468 -> 1126
    //   661: aload_0
    //   662: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   665: getfield 319	com/tencent/mm/at/a/a/c:eQa	Z
    //   668: ifeq +160 -> 828
    //   671: aload_0
    //   672: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   675: aload_0
    //   676: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   679: aload_0
    //   680: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   683: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   686: aload_0
    //   687: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   690: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   693: invokestatic 330	com/tencent/mm/at/a/g/a:b	(Lcom/tencent/mm/at/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   696: astore 11
    //   698: aload 11
    //   700: astore 12
    //   702: aload 11
    //   704: astore_1
    //   705: aload_0
    //   706: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   709: getfield 347	com/tencent/mm/at/a/a/c:eQh	Z
    //   712: ifeq +66 -> 778
    //   715: aload 11
    //   717: astore 12
    //   719: aload 11
    //   721: ifnonnull +57 -> 778
    //   724: aload 11
    //   726: astore 12
    //   728: aload 11
    //   730: astore_1
    //   731: aload_0
    //   732: getfield 112	com/tencent/mm/at/a/f/b:fHy	Lcom/tencent/mm/at/a/c/l;
    //   735: ifnull +43 -> 778
    //   738: aload 11
    //   740: astore_1
    //   741: aload_0
    //   742: getfield 110	com/tencent/mm/at/a/f/b:fHx	Lcom/tencent/mm/at/a/c/d;
    //   745: ifnull +360 -> 1105
    //   748: aload 11
    //   750: astore_1
    //   751: aload_0
    //   752: getfield 112	com/tencent/mm/at/a/f/b:fHy	Lcom/tencent/mm/at/a/c/l;
    //   755: aload_0
    //   756: getfield 110	com/tencent/mm/at/a/f/b:fHx	Lcom/tencent/mm/at/a/c/d;
    //   759: aload_0
    //   760: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   763: getfield 281	com/tencent/mm/at/a/a/c:eQd	[Ljava/lang/Object;
    //   766: invokeinterface 352 2 0
    //   771: invokeinterface 358 2 0
    //   776: astore 12
    //   778: aload 12
    //   780: ifnull +31 -> 811
    //   783: aload 12
    //   785: astore_1
    //   786: aload_0
    //   787: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   790: getfield 333	com/tencent/mm/at/a/a/c:density	I
    //   793: ifle +18 -> 811
    //   796: aload 12
    //   798: astore_1
    //   799: aload 12
    //   801: aload_0
    //   802: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   805: getfield 333	com/tencent/mm/at/a/a/c:density	I
    //   808: invokevirtual 336	android/graphics/Bitmap:setDensity	(I)V
    //   811: aload 12
    //   813: astore_1
    //   814: ldc 155
    //   816: ldc_w 360
    //   819: invokestatic 221	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   822: aload 12
    //   824: astore_1
    //   825: goto -618 -> 207
    //   828: aload_0
    //   829: getfield 89	com/tencent/mm/at/a/f/b:fHk	Lcom/tencent/mm/at/a/c/o;
    //   832: astore_1
    //   833: aload_1
    //   834: ifnull +171 -> 1005
    //   837: aconst_null
    //   838: astore 11
    //   840: aload 11
    //   842: astore_1
    //   843: aload_0
    //   844: getfield 89	com/tencent/mm/at/a/f/b:fHk	Lcom/tencent/mm/at/a/c/o;
    //   847: astore 12
    //   849: aload 11
    //   851: astore_1
    //   852: new 362	com/tencent/mm/vfs/d
    //   855: aload_0
    //   856: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   859: invokespecial 365	com/tencent/mm/vfs/d:<init>	(Ljava/lang/String;)V
    //   862: aload 11
    //   864: astore_1
    //   865: aload 12
    //   867: invokeinterface 371 1 0
    //   872: astore 13
    //   874: aload 13
    //   876: astore_1
    //   877: aload_0
    //   878: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   881: aload 13
    //   883: aload_0
    //   884: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   887: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   890: aload_0
    //   891: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   894: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   897: aload_0
    //   898: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   901: getfield 374	com/tencent/mm/at/a/a/c:ePS	Z
    //   904: aload_0
    //   905: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   908: getfield 378	com/tencent/mm/at/a/a/c:alpha	F
    //   911: aload_0
    //   912: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   915: getfield 381	com/tencent/mm/at/a/a/c:ePQ	Z
    //   918: invokestatic 384	com/tencent/mm/at/a/g/a:a	(Lcom/tencent/mm/at/a/c;Ljava/io/InputStream;IIZFZ)Landroid/graphics/Bitmap;
    //   921: astore 12
    //   923: aload 12
    //   925: astore 11
    //   927: aload 13
    //   929: ifnull -231 -> 698
    //   932: aload 12
    //   934: astore_1
    //   935: aload 13
    //   937: invokevirtual 389	java/io/InputStream:close	()V
    //   940: aload 12
    //   942: astore 11
    //   944: goto -246 -> 698
    //   947: astore_1
    //   948: aload 12
    //   950: astore 11
    //   952: goto -254 -> 698
    //   955: astore 11
    //   957: aload_1
    //   958: ifnull +7 -> 965
    //   961: aload_1
    //   962: invokevirtual 389	java/io/InputStream:close	()V
    //   965: ldc 181
    //   967: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   970: aload 11
    //   972: athrow
    //   973: astore 12
    //   975: aload_2
    //   976: astore 11
    //   978: aconst_null
    //   979: astore_1
    //   980: aload 12
    //   982: astore_2
    //   983: ldc 155
    //   985: ldc_w 391
    //   988: iconst_1
    //   989: anewarray 4	java/lang/Object
    //   992: dup
    //   993: iconst_0
    //   994: aload_2
    //   995: invokevirtual 395	java/lang/Exception:toString	()Ljava/lang/String;
    //   998: aastore
    //   999: invokestatic 241	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1002: goto -732 -> 270
    //   1005: aload_0
    //   1006: getfield 110	com/tencent/mm/at/a/f/b:fHx	Lcom/tencent/mm/at/a/c/d;
    //   1009: ifnull +66 -> 1075
    //   1012: aload_0
    //   1013: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   1016: aload_0
    //   1017: getfield 110	com/tencent/mm/at/a/f/b:fHx	Lcom/tencent/mm/at/a/c/d;
    //   1020: aload_0
    //   1021: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1024: getfield 281	com/tencent/mm/at/a/a/c:eQd	[Ljava/lang/Object;
    //   1027: invokeinterface 352 2 0
    //   1032: aload_0
    //   1033: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1036: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   1039: aload_0
    //   1040: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1043: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   1046: aload_0
    //   1047: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1050: getfield 374	com/tencent/mm/at/a/a/c:ePS	Z
    //   1053: aload_0
    //   1054: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1057: getfield 378	com/tencent/mm/at/a/a/c:alpha	F
    //   1060: aload_0
    //   1061: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1064: getfield 381	com/tencent/mm/at/a/a/c:ePQ	Z
    //   1067: invokestatic 398	com/tencent/mm/at/a/g/a:a	(Lcom/tencent/mm/at/a/c;[BIIZFZ)Landroid/graphics/Bitmap;
    //   1070: astore 11
    //   1072: goto -374 -> 698
    //   1075: aload_0
    //   1076: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   1079: aload_0
    //   1080: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1083: aload_0
    //   1084: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1087: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   1090: aload_0
    //   1091: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1094: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   1097: invokestatic 338	com/tencent/mm/at/a/g/a:a	(Lcom/tencent/mm/at/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   1100: astore 11
    //   1102: goto -404 -> 698
    //   1105: aload 11
    //   1107: astore_1
    //   1108: aload_0
    //   1109: getfield 112	com/tencent/mm/at/a/f/b:fHy	Lcom/tencent/mm/at/a/c/l;
    //   1112: aload_0
    //   1113: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1116: invokeinterface 402 2 0
    //   1121: astore 12
    //   1123: goto -345 -> 778
    //   1126: ldc 155
    //   1128: ldc_w 404
    //   1131: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1134: aconst_null
    //   1135: astore_1
    //   1136: goto -929 -> 207
    //   1139: ldc 155
    //   1141: ldc_w 406
    //   1144: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1147: goto -940 -> 207
    //   1150: ldc 155
    //   1152: ldc_w 408
    //   1155: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1158: goto -951 -> 207
    //   1161: aconst_null
    //   1162: astore 11
    //   1164: iconst_0
    //   1165: istore 14
    //   1167: aload_0
    //   1168: getfield 95	com/tencent/mm/at/a/f/b:fGU	Lcom/tencent/mm/at/a/c/a;
    //   1171: aload_0
    //   1172: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1175: aload_0
    //   1176: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1179: invokeinterface 413 3 0
    //   1184: astore 12
    //   1186: aload 12
    //   1188: ifnull +1215 -> 2403
    //   1191: iload 7
    //   1193: ifeq +23 -> 1216
    //   1196: aload 12
    //   1198: astore 11
    //   1200: aload_0
    //   1201: getfield 105	com/tencent/mm/at/a/f/b:fHw	Lcom/tencent/mm/at/a/c/k;
    //   1204: aload 8
    //   1206: aload 12
    //   1208: invokeinterface 416 3 0
    //   1213: ifeq +147 -> 1360
    //   1216: aload 12
    //   1218: astore_1
    //   1219: aload 12
    //   1221: astore 11
    //   1223: aload_0
    //   1224: getfield 89	com/tencent/mm/at/a/f/b:fHk	Lcom/tencent/mm/at/a/c/o;
    //   1227: ifnull +17 -> 1244
    //   1230: aload 12
    //   1232: astore 11
    //   1234: aload_0
    //   1235: getfield 89	com/tencent/mm/at/a/f/b:fHk	Lcom/tencent/mm/at/a/c/o;
    //   1238: invokeinterface 371 1 0
    //   1243: astore_1
    //   1244: aload_1
    //   1245: astore 11
    //   1247: aload_0
    //   1248: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   1251: aload_1
    //   1252: aload_0
    //   1253: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1256: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   1259: aload_0
    //   1260: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1263: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   1266: aload_0
    //   1267: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1270: getfield 374	com/tencent/mm/at/a/a/c:ePS	Z
    //   1273: aload_0
    //   1274: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1277: getfield 378	com/tencent/mm/at/a/a/c:alpha	F
    //   1280: aload_0
    //   1281: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1284: getfield 381	com/tencent/mm/at/a/a/c:ePQ	Z
    //   1287: invokestatic 384	com/tencent/mm/at/a/g/a:a	(Lcom/tencent/mm/at/a/c;Ljava/io/InputStream;IIZFZ)Landroid/graphics/Bitmap;
    //   1290: astore 12
    //   1292: aload 12
    //   1294: astore 11
    //   1296: iconst_1
    //   1297: istore 14
    //   1299: aload_1
    //   1300: astore 12
    //   1302: aload 12
    //   1304: ifnull +11 -> 1315
    //   1307: aload 11
    //   1309: astore_1
    //   1310: aload 12
    //   1312: invokevirtual 389	java/io/InputStream:close	()V
    //   1315: aload 11
    //   1317: astore 12
    //   1319: iload 14
    //   1321: ifeq +1076 -> 2397
    //   1324: aload 11
    //   1326: astore 12
    //   1328: aload 11
    //   1330: ifnonnull +1067 -> 2397
    //   1333: aload 11
    //   1335: astore_1
    //   1336: aload_0
    //   1337: getfield 95	com/tencent/mm/at/a/f/b:fGU	Lcom/tencent/mm/at/a/c/a;
    //   1340: aload_0
    //   1341: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1344: aload_0
    //   1345: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1348: invokeinterface 419 3 0
    //   1353: pop
    //   1354: aload 11
    //   1356: astore_1
    //   1357: goto -1150 -> 207
    //   1360: iconst_1
    //   1361: istore 14
    //   1363: aconst_null
    //   1364: astore 11
    //   1366: goto -64 -> 1302
    //   1369: astore_1
    //   1370: aload 11
    //   1372: ifnull +8 -> 1380
    //   1375: aload 11
    //   1377: invokevirtual 389	java/io/InputStream:close	()V
    //   1380: ldc 181
    //   1382: invokestatic 118	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1385: aload_1
    //   1386: athrow
    //   1387: aload_0
    //   1388: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   1391: aload_0
    //   1392: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1395: aload_0
    //   1396: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1399: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   1402: aload_0
    //   1403: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1406: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   1409: invokestatic 421	com/tencent/mm/at/a/g/a:c	(Lcom/tencent/mm/at/a/c;Ljava/lang/String;II)Landroid/graphics/Bitmap;
    //   1412: astore_1
    //   1413: goto -1206 -> 207
    //   1416: aload_0
    //   1417: getfield 71	com/tencent/mm/at/a/f/b:fGK	Lcom/tencent/mm/at/a/a/b;
    //   1420: getfield 425	com/tencent/mm/at/a/a/b:aEH	Landroid/content/res/Resources;
    //   1423: aload_0
    //   1424: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1427: ldc_w 427
    //   1430: aload_0
    //   1431: getfield 71	com/tencent/mm/at/a/f/b:fGK	Lcom/tencent/mm/at/a/a/b;
    //   1434: getfield 430	com/tencent/mm/at/a/a/b:packageName	Ljava/lang/String;
    //   1437: invokevirtual 436	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   1440: istore 14
    //   1442: aload_0
    //   1443: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   1446: iload 14
    //   1448: aload_0
    //   1449: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1452: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   1455: aload_0
    //   1456: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1459: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   1462: invokestatic 439	com/tencent/mm/at/a/g/a:a	(Lcom/tencent/mm/at/a/c;III)Landroid/graphics/Bitmap;
    //   1465: astore_1
    //   1466: goto -1259 -> 207
    //   1469: aload_0
    //   1470: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1473: invokestatic 442	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   1476: invokevirtual 446	java/lang/Integer:intValue	()I
    //   1479: istore 14
    //   1481: aload_0
    //   1482: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   1485: iload 14
    //   1487: aload_0
    //   1488: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1491: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   1494: aload_0
    //   1495: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1498: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   1501: invokestatic 439	com/tencent/mm/at/a/g/a:a	(Lcom/tencent/mm/at/a/c;III)Landroid/graphics/Bitmap;
    //   1504: astore_1
    //   1505: goto -1298 -> 207
    //   1508: invokestatic 198	java/lang/System:currentTimeMillis	()J
    //   1511: lstore 4
    //   1513: ldc 155
    //   1515: ldc_w 448
    //   1518: invokestatic 221	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1521: aload_0
    //   1522: getfield 66	com/tencent/mm/at/a/f/b:fHu	Lcom/tencent/mm/at/a/c/g;
    //   1525: ifnull +32 -> 1557
    //   1528: aload_0
    //   1529: getfield 66	com/tencent/mm/at/a/f/b:fHu	Lcom/tencent/mm/at/a/c/g;
    //   1532: astore 12
    //   1534: aload_0
    //   1535: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1538: astore 11
    //   1540: aload_0
    //   1541: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   1544: invokevirtual 135	com/tencent/mm/at/a/c:getImageView	()Landroid/widget/ImageView;
    //   1547: pop
    //   1548: aload 12
    //   1550: aload 11
    //   1552: invokeinterface 451 2 0
    //   1557: aload_0
    //   1558: getfield 115	com/tencent/mm/at/a/f/b:fHc	Lcom/tencent/mm/at/a/c/n;
    //   1561: aload_0
    //   1562: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1565: invokeinterface 456 2 0
    //   1570: ifeq +59 -> 1629
    //   1573: aload_0
    //   1574: getfield 86	com/tencent/mm/at/a/f/b:fGV	Lcom/tencent/mm/at/a/c/b;
    //   1577: aload_0
    //   1578: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1581: invokeinterface 462 2 0
    //   1586: astore 11
    //   1588: aload 11
    //   1590: ifnonnull +804 -> 2394
    //   1593: new 125	com/tencent/mm/at/a/d/b
    //   1596: astore_2
    //   1597: aload_2
    //   1598: aconst_null
    //   1599: aconst_null
    //   1600: invokespecial 465	com/tencent/mm/at/a/d/b:<init>	([BLjava/lang/String;)V
    //   1603: aload_2
    //   1604: astore 11
    //   1606: aload 11
    //   1608: iconst_2
    //   1609: putfield 186	com/tencent/mm/at/a/d/b:from	I
    //   1612: aload 11
    //   1614: getfield 469	com/tencent/mm/at/a/d/b:data	[B
    //   1617: ifnonnull +26 -> 1643
    //   1620: aload 11
    //   1622: iconst_1
    //   1623: putfield 273	com/tencent/mm/at/a/d/b:status	I
    //   1626: goto -1356 -> 270
    //   1629: ldc 155
    //   1631: ldc_w 471
    //   1634: invokestatic 473	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1637: aload_2
    //   1638: astore 11
    //   1640: goto -52 -> 1588
    //   1643: iload 7
    //   1645: ifeq +22 -> 1667
    //   1648: aload_0
    //   1649: getfield 105	com/tencent/mm/at/a/f/b:fHw	Lcom/tencent/mm/at/a/c/k;
    //   1652: aload 8
    //   1654: aload 11
    //   1656: getfield 469	com/tencent/mm/at/a/d/b:data	[B
    //   1659: invokeinterface 477 3 0
    //   1664: ifeq +447 -> 2111
    //   1667: ldc 155
    //   1669: ldc_w 479
    //   1672: invokestatic 221	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1675: invokestatic 198	java/lang/System:currentTimeMillis	()J
    //   1678: lstore 9
    //   1680: aload 11
    //   1682: getfield 469	com/tencent/mm/at/a/d/b:data	[B
    //   1685: astore 12
    //   1687: aload 12
    //   1689: astore_2
    //   1690: aload_0
    //   1691: getfield 89	com/tencent/mm/at/a/f/b:fHk	Lcom/tencent/mm/at/a/c/o;
    //   1694: ifnull +77 -> 1771
    //   1697: aload_0
    //   1698: getfield 89	com/tencent/mm/at/a/f/b:fHk	Lcom/tencent/mm/at/a/c/o;
    //   1701: astore_2
    //   1702: new 481	java/io/ByteArrayInputStream
    //   1705: aload 12
    //   1707: invokespecial 484	java/io/ByteArrayInputStream:<init>	([B)V
    //   1710: aload_2
    //   1711: invokeinterface 371 1 0
    //   1716: astore 13
    //   1718: new 486	java/io/ByteArrayOutputStream
    //   1721: astore_2
    //   1722: aload_2
    //   1723: aload 12
    //   1725: arraylength
    //   1726: invokespecial 488	java/io/ByteArrayOutputStream:<init>	(I)V
    //   1729: sipush 1024
    //   1732: newarray byte
    //   1734: astore 12
    //   1736: aload 13
    //   1738: aload 12
    //   1740: invokevirtual 492	java/io/InputStream:read	([B)I
    //   1743: istore 14
    //   1745: iload 14
    //   1747: iflt +19 -> 1766
    //   1750: aload_2
    //   1751: aload 12
    //   1753: iconst_0
    //   1754: iload 14
    //   1756: invokevirtual 496	java/io/ByteArrayOutputStream:write	([BII)V
    //   1759: goto -23 -> 1736
    //   1762: astore_2
    //   1763: goto -780 -> 983
    //   1766: aload_2
    //   1767: invokevirtual 500	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   1770: astore_2
    //   1771: aload_0
    //   1772: getfield 60	com/tencent/mm/at/a/f/b:fHr	Lcom/tencent/mm/at/a/c;
    //   1775: aload_2
    //   1776: aload_0
    //   1777: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1780: getfield 322	com/tencent/mm/at/a/a/c:ePN	I
    //   1783: aload_0
    //   1784: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1787: getfield 325	com/tencent/mm/at/a/a/c:ePO	I
    //   1790: aload_0
    //   1791: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1794: getfield 374	com/tencent/mm/at/a/a/c:ePS	Z
    //   1797: aload_0
    //   1798: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1801: getfield 378	com/tencent/mm/at/a/a/c:alpha	F
    //   1804: aload_0
    //   1805: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1808: getfield 381	com/tencent/mm/at/a/a/c:ePQ	Z
    //   1811: invokestatic 398	com/tencent/mm/at/a/g/a:a	(Lcom/tencent/mm/at/a/c;[BIIZFZ)Landroid/graphics/Bitmap;
    //   1814: astore 12
    //   1816: aload 12
    //   1818: ifnonnull +18 -> 1836
    //   1821: aload 12
    //   1823: astore_1
    //   1824: aload 11
    //   1826: iconst_3
    //   1827: putfield 273	com/tencent/mm/at/a/d/b:status	I
    //   1830: aload 12
    //   1832: astore_1
    //   1833: goto -1563 -> 270
    //   1836: aload 12
    //   1838: astore_1
    //   1839: aload 11
    //   1841: getfield 469	com/tencent/mm/at/a/d/b:data	[B
    //   1844: astore_2
    //   1845: aload 12
    //   1847: astore_1
    //   1848: aload_0
    //   1849: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1852: getfield 503	com/tencent/mm/at/a/a/c:ePH	Z
    //   1855: ifeq +25 -> 1880
    //   1858: aload 12
    //   1860: astore_1
    //   1861: aload_0
    //   1862: getfield 95	com/tencent/mm/at/a/f/b:fGU	Lcom/tencent/mm/at/a/c/a;
    //   1865: aload_0
    //   1866: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1869: aload_2
    //   1870: aload_0
    //   1871: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1874: invokeinterface 506 4 0
    //   1879: pop
    //   1880: aload 12
    //   1882: astore_1
    //   1883: aload_0
    //   1884: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1887: getfield 509	com/tencent/mm/at/a/a/c:ePG	Z
    //   1890: ifeq +25 -> 1915
    //   1893: aload 12
    //   1895: astore_1
    //   1896: aload_0
    //   1897: getfield 95	com/tencent/mm/at/a/f/b:fGU	Lcom/tencent/mm/at/a/c/a;
    //   1900: aload_0
    //   1901: getfield 58	com/tencent/mm/at/a/f/b:url	Ljava/lang/String;
    //   1904: aload_2
    //   1905: aload_0
    //   1906: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1909: invokeinterface 506 4 0
    //   1914: pop
    //   1915: aload 12
    //   1917: astore_2
    //   1918: aload 12
    //   1920: astore_1
    //   1921: aload_0
    //   1922: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1925: getfield 512	com/tencent/mm/at/a/a/c:eQf	Z
    //   1928: ifeq +52 -> 1980
    //   1931: aload 12
    //   1933: astore_1
    //   1934: aload_0
    //   1935: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   1938: getfield 515	com/tencent/mm/at/a/a/c:eQg	F
    //   1941: fconst_0
    //   1942: fcmpl
    //   1943: ifne +148 -> 2091
    //   1946: aload 12
    //   1948: astore_1
    //   1949: aload 12
    //   1951: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   1954: aload 12
    //   1956: invokevirtual 521	android/graphics/Bitmap:getHeight	()I
    //   1959: if_icmpne +55 -> 2014
    //   1962: aload 12
    //   1964: astore_1
    //   1965: aload 12
    //   1967: iconst_0
    //   1968: aload 12
    //   1970: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   1973: iconst_2
    //   1974: idiv
    //   1975: i2f
    //   1976: invokestatic 524	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   1979: astore_2
    //   1980: aload_2
    //   1981: astore_1
    //   1982: aload_0
    //   1983: aload 11
    //   1985: aload_2
    //   1986: invokespecial 526	com/tencent/mm/at/a/f/b:a	(Lcom/tencent/mm/at/a/d/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   1989: astore_2
    //   1990: aload_2
    //   1991: astore_1
    //   1992: aload_0
    //   1993: aload_3
    //   1994: aload_2
    //   1995: invokespecial 528	com/tencent/mm/at/a/f/b:k	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   1998: aload_2
    //   1999: astore_1
    //   2000: aload_0
    //   2001: lload 9
    //   2003: lload 4
    //   2005: lsub
    //   2006: invokevirtual 529	com/tencent/mm/at/a/f/b:fN	(J)V
    //   2009: aload_2
    //   2010: astore_1
    //   2011: goto -1741 -> 270
    //   2014: aload 12
    //   2016: astore_1
    //   2017: aload 12
    //   2019: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   2022: aload 12
    //   2024: invokevirtual 521	android/graphics/Bitmap:getHeight	()I
    //   2027: invokestatic 535	java/lang/Math:min	(II)I
    //   2030: istore 6
    //   2032: iload 6
    //   2034: istore 14
    //   2036: iload 6
    //   2038: ifgt +21 -> 2059
    //   2041: aload 12
    //   2043: astore_1
    //   2044: aload 12
    //   2046: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   2049: aload 12
    //   2051: invokevirtual 521	android/graphics/Bitmap:getHeight	()I
    //   2054: invokestatic 538	java/lang/Math:max	(II)I
    //   2057: istore 14
    //   2059: aload 12
    //   2061: astore_1
    //   2062: aload 12
    //   2064: iload 14
    //   2066: iload 14
    //   2068: iconst_1
    //   2069: invokestatic 541	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   2072: astore_2
    //   2073: aload_2
    //   2074: astore_1
    //   2075: aload_2
    //   2076: iconst_0
    //   2077: aload_2
    //   2078: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   2081: iconst_2
    //   2082: idiv
    //   2083: i2f
    //   2084: invokestatic 524	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2087: astore_2
    //   2088: goto -108 -> 1980
    //   2091: aload 12
    //   2093: astore_1
    //   2094: aload 12
    //   2096: iconst_0
    //   2097: aload_0
    //   2098: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   2101: getfield 515	com/tencent/mm/at/a/a/c:eQg	F
    //   2104: invokestatic 524	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2107: astore_2
    //   2108: goto -128 -> 1980
    //   2111: aload 11
    //   2113: iconst_2
    //   2114: putfield 273	com/tencent/mm/at/a/d/b:status	I
    //   2117: ldc 155
    //   2119: ldc_w 543
    //   2122: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2125: aconst_null
    //   2126: astore_1
    //   2127: goto -1857 -> 270
    //   2130: ldc 155
    //   2132: ldc_w 545
    //   2135: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2138: aload_2
    //   2139: astore 11
    //   2141: goto -1871 -> 270
    //   2144: aload_0
    //   2145: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   2148: getfield 512	com/tencent/mm/at/a/a/c:eQf	Z
    //   2151: ifeq +237 -> 2388
    //   2154: aload_0
    //   2155: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   2158: getfield 515	com/tencent/mm/at/a/a/c:eQg	F
    //   2161: fconst_0
    //   2162: fcmpl
    //   2163: ifne +150 -> 2313
    //   2166: aload_1
    //   2167: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   2170: aload_1
    //   2171: invokevirtual 521	android/graphics/Bitmap:getHeight	()I
    //   2174: if_icmpne +71 -> 2245
    //   2177: aload_1
    //   2178: iconst_0
    //   2179: aload_1
    //   2180: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   2183: iconst_2
    //   2184: idiv
    //   2185: i2f
    //   2186: invokestatic 524	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2189: astore 11
    //   2191: aload 11
    //   2193: astore_1
    //   2194: aload_0
    //   2195: aload_2
    //   2196: aload 11
    //   2198: invokespecial 526	com/tencent/mm/at/a/f/b:a	(Lcom/tencent/mm/at/a/d/b;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   2201: astore 11
    //   2203: aload 11
    //   2205: astore_1
    //   2206: aload_0
    //   2207: aload_3
    //   2208: aload 11
    //   2210: invokespecial 528	com/tencent/mm/at/a/f/b:k	(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //   2213: aload 11
    //   2215: astore_1
    //   2216: aload_0
    //   2217: lload 9
    //   2219: lload 4
    //   2221: lsub
    //   2222: invokevirtual 529	com/tencent/mm/at/a/f/b:fN	(J)V
    //   2225: aload 11
    //   2227: astore_1
    //   2228: ldc 155
    //   2230: ldc_w 547
    //   2233: invokestatic 221	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2236: aload 11
    //   2238: astore_1
    //   2239: aload_2
    //   2240: astore 11
    //   2242: goto -1972 -> 270
    //   2245: aload_1
    //   2246: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   2249: aload_1
    //   2250: invokevirtual 521	android/graphics/Bitmap:getHeight	()I
    //   2253: invokestatic 535	java/lang/Math:min	(II)I
    //   2256: istore 6
    //   2258: iload 6
    //   2260: istore 14
    //   2262: iload 6
    //   2264: ifgt +16 -> 2280
    //   2267: aload_1
    //   2268: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   2271: aload_1
    //   2272: invokevirtual 521	android/graphics/Bitmap:getHeight	()I
    //   2275: invokestatic 538	java/lang/Math:max	(II)I
    //   2278: istore 14
    //   2280: aload_1
    //   2281: iload 14
    //   2283: iload 14
    //   2285: iconst_1
    //   2286: invokestatic 541	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   2289: astore 11
    //   2291: aload 11
    //   2293: astore_1
    //   2294: aload 11
    //   2296: iconst_0
    //   2297: aload 11
    //   2299: invokevirtual 518	android/graphics/Bitmap:getWidth	()I
    //   2302: iconst_2
    //   2303: idiv
    //   2304: i2f
    //   2305: invokestatic 524	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2308: astore 11
    //   2310: goto -119 -> 2191
    //   2313: aload_1
    //   2314: iconst_0
    //   2315: aload_0
    //   2316: getfield 76	com/tencent/mm/at/a/f/b:fGS	Lcom/tencent/mm/at/a/a/c;
    //   2319: getfield 515	com/tencent/mm/at/a/a/c:eQg	F
    //   2322: invokestatic 524	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   2325: astore 11
    //   2327: goto -136 -> 2191
    //   2330: ldc 155
    //   2332: ldc_w 549
    //   2335: invokestatic 246	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2338: goto -1967 -> 371
    //   2341: astore_1
    //   2342: goto -1377 -> 965
    //   2345: astore_1
    //   2346: goto -1031 -> 1315
    //   2349: astore 11
    //   2351: goto -971 -> 1380
    //   2354: astore 11
    //   2356: aload_2
    //   2357: astore 12
    //   2359: aload 11
    //   2361: astore_2
    //   2362: aload 12
    //   2364: astore 11
    //   2366: goto -1383 -> 983
    //   2369: astore 12
    //   2371: aload_2
    //   2372: astore 11
    //   2374: aload 12
    //   2376: astore_2
    //   2377: goto -1394 -> 983
    //   2380: astore_2
    //   2381: goto -1398 -> 983
    //   2384: astore_2
    //   2385: goto -1402 -> 983
    //   2388: aload_1
    //   2389: astore 11
    //   2391: goto -200 -> 2191
    //   2394: goto -788 -> 1606
    //   2397: aload 12
    //   2399: astore_1
    //   2400: goto -2193 -> 207
    //   2403: aconst_null
    //   2404: astore 11
    //   2406: goto -1104 -> 1302
    //
    // Exception table:
    //   from	to	target	type
    //   935	940	947	java/io/IOException
    //   843	849	955	finally
    //   852	862	955	finally
    //   865	874	955	finally
    //   877	923	955	finally
    //   20	150	973	java/lang/Exception
    //   188	207	973	java/lang/Exception
    //   482	552	973	java/lang/Exception
    //   590	615	973	java/lang/Exception
    //   618	638	973	java/lang/Exception
    //   643	661	973	java/lang/Exception
    //   661	698	973	java/lang/Exception
    //   828	833	973	java/lang/Exception
    //   961	965	973	java/lang/Exception
    //   965	973	973	java/lang/Exception
    //   1005	1072	973	java/lang/Exception
    //   1075	1102	973	java/lang/Exception
    //   1126	1134	973	java/lang/Exception
    //   1139	1147	973	java/lang/Exception
    //   1150	1158	973	java/lang/Exception
    //   1375	1380	973	java/lang/Exception
    //   1380	1387	973	java/lang/Exception
    //   1387	1413	973	java/lang/Exception
    //   1416	1466	973	java/lang/Exception
    //   1469	1505	973	java/lang/Exception
    //   1167	1186	1369	finally
    //   1200	1216	1369	finally
    //   1223	1230	1369	finally
    //   1234	1244	1369	finally
    //   1247	1292	1369	finally
    //   1606	1626	1762	java/lang/Exception
    //   1648	1667	1762	java/lang/Exception
    //   1667	1687	1762	java/lang/Exception
    //   1690	1736	1762	java/lang/Exception
    //   1736	1745	1762	java/lang/Exception
    //   1750	1759	1762	java/lang/Exception
    //   1766	1771	1762	java/lang/Exception
    //   1771	1816	1762	java/lang/Exception
    //   2111	2125	1762	java/lang/Exception
    //   961	965	2341	java/io/IOException
    //   1310	1315	2345	java/io/IOException
    //   1375	1380	2349	java/io/IOException
    //   559	569	2354	java/lang/Exception
    //   572	584	2354	java/lang/Exception
    //   705	715	2354	java/lang/Exception
    //   731	738	2354	java/lang/Exception
    //   741	748	2354	java/lang/Exception
    //   751	778	2354	java/lang/Exception
    //   786	796	2354	java/lang/Exception
    //   799	811	2354	java/lang/Exception
    //   814	822	2354	java/lang/Exception
    //   935	940	2354	java/lang/Exception
    //   1108	1123	2354	java/lang/Exception
    //   1310	1315	2354	java/lang/Exception
    //   1336	1354	2354	java/lang/Exception
    //   2194	2203	2354	java/lang/Exception
    //   2206	2213	2354	java/lang/Exception
    //   2216	2225	2354	java/lang/Exception
    //   2228	2236	2354	java/lang/Exception
    //   2294	2310	2354	java/lang/Exception
    //   207	212	2369	java/lang/Exception
    //   216	223	2369	java/lang/Exception
    //   260	267	2369	java/lang/Exception
    //   1508	1557	2369	java/lang/Exception
    //   1557	1588	2369	java/lang/Exception
    //   1629	1637	2369	java/lang/Exception
    //   2130	2138	2369	java/lang/Exception
    //   2144	2191	2369	java/lang/Exception
    //   2245	2258	2369	java/lang/Exception
    //   2267	2280	2369	java/lang/Exception
    //   2280	2291	2369	java/lang/Exception
    //   2313	2327	2369	java/lang/Exception
    //   1593	1603	2380	java/lang/Exception
    //   1824	1830	2384	java/lang/Exception
    //   1839	1845	2384	java/lang/Exception
    //   1848	1858	2384	java/lang/Exception
    //   1861	1880	2384	java/lang/Exception
    //   1883	1893	2384	java/lang/Exception
    //   1896	1915	2384	java/lang/Exception
    //   1921	1931	2384	java/lang/Exception
    //   1934	1946	2384	java/lang/Exception
    //   1949	1962	2384	java/lang/Exception
    //   1965	1980	2384	java/lang/Exception
    //   1982	1990	2384	java/lang/Exception
    //   1992	1998	2384	java/lang/Exception
    //   2000	2009	2384	java/lang/Exception
    //   2017	2032	2384	java/lang/Exception
    //   2044	2059	2384	java/lang/Exception
    //   2062	2073	2384	java/lang/Exception
    //   2075	2088	2384	java/lang/Exception
    //   2094	2108	2384	java/lang/Exception
  }

  public final String sJ(String paramString)
  {
    AppMethodBeat.i(116110);
    if ((bo.isNullOrNil(paramString)) || (this.fGS == null))
    {
      paramString = null;
      AppMethodBeat.o(116110);
    }
    while (true)
    {
      return paramString;
      String str = paramString;
      if (this.fGS.eQf)
        str = paramString + "round" + this.fGS.eQg;
      paramString = str;
      if (!bo.isNullOrNil(this.fGS.ePX))
        paramString = str + this.fGS.ePX;
      paramString = paramString + "size" + this.fGS.ePN + this.fGS.ePO;
      AppMethodBeat.o(116110);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.f.b
 * JD-Core Version:    0.6.2
 */