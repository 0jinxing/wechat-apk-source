package com.tencent.mm.plugin.gallery.model;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Vector;

public final class c
{
  private static final int mNu;
  private volatile boolean isDecoding;
  d mNv;
  private c.a mNw;
  private h<String> mNx;
  private h<b> mNy;

  static
  {
    AppMethodBeat.i(21239);
    if (com.tencent.mm.compatible.util.d.fP(14));
    for (int i = 20; ; i = 40)
    {
      mNu = i;
      AppMethodBeat.o(21239);
      return;
    }
  }

  public c()
  {
    AppMethodBeat.i(21232);
    this.isDecoding = false;
    this.mNv = new d();
    this.mNw = new c.a(this, (byte)0);
    this.mNx = new h();
    this.mNy = new h();
    AppMethodBeat.o(21232);
  }

  private void bBW()
  {
    AppMethodBeat.i(21235);
    if (this.isDecoding)
    {
      ab.w("MircoMsg.CacheService", "is decoding now, wait a minute");
      AppMethodBeat.o(21235);
    }
    while (true)
    {
      return;
      if ((this.mNy != null) && (this.mNy.size() > 0))
      {
        this.isDecoding = true;
        c((b)this.mNy.bCr());
        AppMethodBeat.o(21235);
      }
      else
      {
        ab.i("MircoMsg.CacheService", "all job empty");
        if (e.bCa() == null)
        {
          AppMethodBeat.o(21235);
        }
        else
        {
          e.bCa().W(new c.1(this));
          AppMethodBeat.o(21235);
        }
      }
    }
  }

  private void c(az.a parama)
  {
    AppMethodBeat.i(21236);
    if (parama == null)
    {
      ab.e("MircoMsg.CacheService", "obj is null");
      this.isDecoding = false;
      bBW();
      AppMethodBeat.o(21236);
    }
    while (true)
    {
      return;
      this.mNw.d(parama);
      AppMethodBeat.o(21236);
    }
  }

  public final Bitmap Nz(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(21234);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MircoMsg.CacheService", "file path is null");
      AppMethodBeat.o(21234);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Bitmap localBitmap = this.mNv.getBitmap(paramString);
      if (localBitmap != null)
      {
        ab.v("MircoMsg.CacheService", "get bitmap from cache: %s", new Object[] { paramString });
        AppMethodBeat.o(21234);
        paramString = localBitmap;
      }
      else
      {
        AppMethodBeat.o(21234);
        paramString = localObject;
      }
    }
  }

  public final void a(d.b paramb)
  {
    AppMethodBeat.i(21237);
    d locald = this.mNv;
    if (locald.ghp.size() > 64)
      ab.i("MicroMsg.GalleryCache", "has exceed the max listener size[%d], remove some listeners[%s]", new Object[] { Integer.valueOf(64), (d.b)locald.ghp.remove(0) });
    ab.v("MicroMsg.GalleryCache", "try add listener[%s]", new Object[] { paramb });
    if (!locald.ghp.contains(paramb))
    {
      ab.d("MicroMsg.GalleryCache", "add listener[%s] ok", new Object[] { paramb });
      locald.ghp.add(paramb);
    }
    AppMethodBeat.o(21237);
  }

  public final Bitmap b(String paramString1, int paramInt, String paramString2, long paramLong)
  {
    AppMethodBeat.i(21233);
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MircoMsg.CacheService", "file path is null");
      AppMethodBeat.o(21233);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      Object localObject = this.mNv.getBitmap(paramString1);
      if (localObject != null)
      {
        ab.v("MircoMsg.CacheService", "get bitmap from cache: %s", new Object[] { paramString1 });
        AppMethodBeat.o(21233);
        paramString1 = (String)localObject;
      }
      else
      {
        ab.v("MircoMsg.CacheService", "filePathInService size is : [%d]", new Object[] { Integer.valueOf(this.mNx.size()) });
        if (this.mNx.aj(paramString1))
        {
          ab.w("MircoMsg.CacheService", "has already getting bitmap from file, %s", new Object[] { paramString1 });
          bBW();
          AppMethodBeat.o(21233);
          paramString1 = null;
        }
        else
        {
          if (this.mNx.size() > mNu)
          {
            ab.w("MircoMsg.CacheService", "filePathInService size: [%d], waitingDecodeTask size:[%d]", new Object[] { Integer.valueOf(this.mNx.size()), Integer.valueOf(this.mNy.size()) });
            if (!this.mNy.isEmpty())
            {
              localObject = (b)this.mNy.bCr();
              if (localObject != null)
              {
                localObject = ((b)localObject).mFilePath;
                this.mNx.bV(localObject);
                ab.w("MircoMsg.CacheService", "the running task has exceed 40, remove the first one! path:%s", new Object[] { localObject });
              }
            }
          }
          this.mNx.add(paramString1);
          this.mNy.add(new b(paramString1, paramInt, paramString2, paramLong));
          bBW();
          AppMethodBeat.o(21233);
          paramString1 = null;
        }
      }
    }
  }

  public final void b(d.b paramb)
  {
    AppMethodBeat.i(138608);
    d locald = this.mNv;
    if (paramb == null)
    {
      if (locald.ghp != null)
        locald.ghp.clear();
      AppMethodBeat.o(138608);
    }
    while (true)
    {
      return;
      if ((locald.ghp != null) && (locald.ghp.contains(paramb)))
        locald.ghp.remove(paramb);
      AppMethodBeat.o(138608);
    }
  }

  final class b
    implements az.a
  {
    private Bitmap bitmap;
    private int cyQ;
    String mFilePath;
    private String mNC;
    private long mND;
    private int mNE;

    public b(String paramInt, int paramString1, String paramLong, long arg5)
    {
      this(paramInt, paramString1, paramLong, localObject, (byte)0);
    }

    private b(String paramInt, int paramString1, String paramLong, long arg5, byte arg7)
    {
      this.mFilePath = paramInt;
      this.mND = ???;
      this.mNC = paramLong;
      this.mNE = 12288;
      this.cyQ = paramString1;
    }

    // ERROR //
    public final boolean acf()
    {
      // Byte code:
      //   0: sipush 21228
      //   3: invokestatic 52	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   6: aload_0
      //   7: getfield 29	com/tencent/mm/plugin/gallery/model/c$b:mNz	Lcom/tencent/mm/plugin/gallery/model/c;
      //   10: invokestatic 56	com/tencent/mm/plugin/gallery/model/c:a	(Lcom/tencent/mm/plugin/gallery/model/c;)Lcom/tencent/mm/plugin/gallery/model/d;
      //   13: astore_1
      //   14: ldc 58
      //   16: iconst_3
      //   17: anewarray 4	java/lang/Object
      //   20: dup
      //   21: iconst_0
      //   22: aload_0
      //   23: getfield 34	com/tencent/mm/plugin/gallery/model/c$b:mFilePath	Ljava/lang/String;
      //   26: aastore
      //   27: dup
      //   28: iconst_1
      //   29: aload_0
      //   30: getfield 38	com/tencent/mm/plugin/gallery/model/c$b:mNC	Ljava/lang/String;
      //   33: aastore
      //   34: dup
      //   35: iconst_2
      //   36: aload_0
      //   37: getfield 36	com/tencent/mm/plugin/gallery/model/c$b:mND	J
      //   40: invokestatic 64	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   43: aastore
      //   44: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   47: astore_2
      //   48: aload_1
      //   49: getfield 76	com/tencent/mm/plugin/gallery/model/d:mNG	Lcom/tencent/mm/plugin/gallery/model/f;
      //   52: ifnonnull +43 -> 95
      //   55: aconst_null
      //   56: astore_1
      //   57: aload_0
      //   58: aload_1
      //   59: putfield 78	com/tencent/mm/plugin/gallery/model/c$b:bitmap	Landroid/graphics/Bitmap;
      //   62: aload_0
      //   63: getfield 78	com/tencent/mm/plugin/gallery/model/c$b:bitmap	Landroid/graphics/Bitmap;
      //   66: ifnull +44 -> 110
      //   69: ldc 80
      //   71: ldc 82
      //   73: iconst_1
      //   74: anewarray 4	java/lang/Object
      //   77: dup
      //   78: iconst_0
      //   79: aload_0
      //   80: getfield 34	com/tencent/mm/plugin/gallery/model/c$b:mFilePath	Ljava/lang/String;
      //   83: aastore
      //   84: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   87: sipush 21228
      //   90: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   93: iconst_1
      //   94: ireturn
      //   95: aload_1
      //   96: getfield 76	com/tencent/mm/plugin/gallery/model/d:mNG	Lcom/tencent/mm/plugin/gallery/model/f;
      //   99: aload_2
      //   100: invokevirtual 95	java/lang/String:hashCode	()I
      //   103: invokevirtual 101	com/tencent/mm/plugin/gallery/model/f:wn	(I)Landroid/graphics/Bitmap;
      //   106: astore_1
      //   107: goto -50 -> 57
      //   110: aload_0
      //   111: aload_0
      //   112: getfield 36	com/tencent/mm/plugin/gallery/model/c$b:mND	J
      //   115: aload_0
      //   116: getfield 42	com/tencent/mm/plugin/gallery/model/c$b:cyQ	I
      //   119: aload_0
      //   120: getfield 34	com/tencent/mm/plugin/gallery/model/c$b:mFilePath	Ljava/lang/String;
      //   123: aload_0
      //   124: getfield 38	com/tencent/mm/plugin/gallery/model/c$b:mNC	Ljava/lang/String;
      //   127: invokestatic 106	com/tencent/mm/plugin/gallery/model/k:a	(JILjava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;
      //   130: putfield 78	com/tencent/mm/plugin/gallery/model/c$b:bitmap	Landroid/graphics/Bitmap;
      //   133: aload_0
      //   134: getfield 78	com/tencent/mm/plugin/gallery/model/c$b:bitmap	Landroid/graphics/Bitmap;
      //   137: ifnull +594 -> 731
      //   140: aload_0
      //   141: getfield 29	com/tencent/mm/plugin/gallery/model/c$b:mNz	Lcom/tencent/mm/plugin/gallery/model/c;
      //   144: invokestatic 56	com/tencent/mm/plugin/gallery/model/c:a	(Lcom/tencent/mm/plugin/gallery/model/c;)Lcom/tencent/mm/plugin/gallery/model/d;
      //   147: astore_1
      //   148: aload_0
      //   149: getfield 34	com/tencent/mm/plugin/gallery/model/c$b:mFilePath	Ljava/lang/String;
      //   152: astore_3
      //   153: aload_0
      //   154: getfield 38	com/tencent/mm/plugin/gallery/model/c$b:mNC	Ljava/lang/String;
      //   157: astore 4
      //   159: aload_0
      //   160: getfield 36	com/tencent/mm/plugin/gallery/model/c$b:mND	J
      //   163: lstore 5
      //   165: aload_0
      //   166: getfield 78	com/tencent/mm/plugin/gallery/model/c$b:bitmap	Landroid/graphics/Bitmap;
      //   169: astore_2
      //   170: aload_2
      //   171: ifnull +76 -> 247
      //   174: ldc 58
      //   176: iconst_3
      //   177: anewarray 4	java/lang/Object
      //   180: dup
      //   181: iconst_0
      //   182: aload_3
      //   183: aastore
      //   184: dup
      //   185: iconst_1
      //   186: aload 4
      //   188: aastore
      //   189: dup
      //   190: iconst_2
      //   191: lload 5
      //   193: invokestatic 64	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   196: aastore
      //   197: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      //   200: astore 4
      //   202: aload_1
      //   203: getfield 76	com/tencent/mm/plugin/gallery/model/d:mNG	Lcom/tencent/mm/plugin/gallery/model/f;
      //   206: ifnull +41 -> 247
      //   209: aload_1
      //   210: getfield 76	com/tencent/mm/plugin/gallery/model/d:mNG	Lcom/tencent/mm/plugin/gallery/model/f;
      //   213: astore_3
      //   214: aload 4
      //   216: invokevirtual 95	java/lang/String:hashCode	()I
      //   219: istore 7
      //   221: aload_3
      //   222: getfield 110	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
      //   225: ifnull +15 -> 240
      //   228: aload_3
      //   229: getfield 110	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
      //   232: invokeinterface 115 1 0
      //   237: ifgt +19 -> 256
      //   240: ldc 117
      //   242: ldc 119
      //   244: invokestatic 123	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   247: sipush 21228
      //   250: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   253: goto -160 -> 93
      //   256: aload_2
      //   257: ifnonnull +13 -> 270
      //   260: ldc 117
      //   262: ldc 125
      //   264: invokestatic 123	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   267: goto -20 -> 247
      //   270: ldc 117
      //   272: ldc 127
      //   274: iconst_3
      //   275: anewarray 4	java/lang/Object
      //   278: dup
      //   279: iconst_0
      //   280: iload 7
      //   282: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   285: aastore
      //   286: dup
      //   287: iconst_1
      //   288: aload_2
      //   289: invokevirtual 137	android/graphics/Bitmap:getWidth	()I
      //   292: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   295: aastore
      //   296: dup
      //   297: iconst_2
      //   298: aload_2
      //   299: invokevirtual 140	android/graphics/Bitmap:getHeight	()I
      //   302: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   305: aastore
      //   306: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   309: aload_3
      //   310: getfield 110	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
      //   313: ifnull +15 -> 328
      //   316: aload_3
      //   317: getfield 110	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
      //   320: invokeinterface 115 1 0
      //   325: ifgt +21 -> 346
      //   328: iconst_m1
      //   329: istore 8
      //   331: iload 8
      //   333: ifge +108 -> 441
      //   336: ldc 117
      //   338: ldc 142
      //   340: invokestatic 123	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   343: goto -96 -> 247
      //   346: aload_3
      //   347: invokevirtual 145	com/tencent/mm/plugin/gallery/model/f:bCk	()I
      //   350: istore 9
      //   352: iload 9
      //   354: istore 8
      //   356: iload 9
      //   358: ifge +69 -> 427
      //   361: ldc 117
      //   363: ldc 147
      //   365: iconst_1
      //   366: anewarray 4	java/lang/Object
      //   369: dup
      //   370: iconst_0
      //   371: aload_3
      //   372: getfield 150	com/tencent/mm/plugin/gallery/model/f:mNZ	I
      //   375: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   378: aastore
      //   379: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   382: aload_3
      //   383: getfield 150	com/tencent/mm/plugin/gallery/model/f:mNZ	I
      //   386: iconst_1
      //   387: iadd
      //   388: bipush 25
      //   390: if_icmplt +40 -> 430
      //   393: iconst_0
      //   394: istore 8
      //   396: ldc 117
      //   398: ldc 152
      //   400: iconst_1
      //   401: anewarray 4	java/lang/Object
      //   404: dup
      //   405: iconst_0
      //   406: iload 8
      //   408: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   411: aastore
      //   412: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   415: aload_3
      //   416: iload 8
      //   418: invokevirtual 155	com/tencent/mm/plugin/gallery/model/f:wm	(I)V
      //   421: aload_3
      //   422: iload 8
      //   424: invokevirtual 158	com/tencent/mm/plugin/gallery/model/f:wl	(I)V
      //   427: goto -96 -> 331
      //   430: aload_3
      //   431: getfield 150	com/tencent/mm/plugin/gallery/model/f:mNZ	I
      //   434: iconst_1
      //   435: iadd
      //   436: istore 8
      //   438: goto -42 -> 396
      //   441: aload_3
      //   442: getfield 162	com/tencent/mm/plugin/gallery/model/f:mNY	Landroid/util/SparseArray;
      //   445: iload 7
      //   447: invokevirtual 168	android/util/SparseArray:get	(I)Ljava/lang/Object;
      //   450: checkcast 170	com/tencent/mm/protocal/protobuf/auo
      //   453: astore_1
      //   454: aload_1
      //   455: ifnonnull +285 -> 740
      //   458: new 170	com/tencent/mm/protocal/protobuf/auo
      //   461: dup
      //   462: invokespecial 171	com/tencent/mm/protocal/protobuf/auo:<init>	()V
      //   465: astore_1
      //   466: aload_1
      //   467: iload 7
      //   469: putfield 174	com/tencent/mm/protocal/protobuf/auo:key	I
      //   472: new 176	java/io/ByteArrayOutputStream
      //   475: dup
      //   476: invokespecial 177	java/io/ByteArrayOutputStream:<init>	()V
      //   479: astore 4
      //   481: aload_2
      //   482: getstatic 183	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
      //   485: bipush 100
      //   487: aload 4
      //   489: invokevirtual 187	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
      //   492: pop
      //   493: invokestatic 193	java/lang/System:currentTimeMillis	()J
      //   496: lstore 5
      //   498: aload_3
      //   499: getfield 110	com/tencent/mm/plugin/gallery/model/f:mNX	Ljava/util/List;
      //   502: iload 8
      //   504: invokeinterface 194 2 0
      //   509: checkcast 196	java/io/RandomAccessFile
      //   512: astore 10
      //   514: aload_1
      //   515: aload 10
      //   517: invokevirtual 199	java/io/RandomAccessFile:length	()J
      //   520: putfield 202	com/tencent/mm/protocal/protobuf/auo:wyJ	J
      //   523: aload_1
      //   524: iload 8
      //   526: putfield 205	com/tencent/mm/protocal/protobuf/auo:wyK	I
      //   529: aload_1
      //   530: aload 4
      //   532: invokevirtual 206	java/io/ByteArrayOutputStream:size	()I
      //   535: putfield 208	com/tencent/mm/protocal/protobuf/auo:length	I
      //   538: aload 4
      //   540: invokevirtual 212	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   543: astore_2
      //   544: aload 10
      //   546: aload_1
      //   547: getfield 202	com/tencent/mm/protocal/protobuf/auo:wyJ	J
      //   550: invokevirtual 216	java/io/RandomAccessFile:seek	(J)V
      //   553: aload 10
      //   555: aload_2
      //   556: invokevirtual 220	java/io/RandomAccessFile:write	([B)V
      //   559: aload_3
      //   560: iload 8
      //   562: putfield 150	com/tencent/mm/plugin/gallery/model/f:mNZ	I
      //   565: ldc 117
      //   567: ldc 222
      //   569: iconst_5
      //   570: anewarray 4	java/lang/Object
      //   573: dup
      //   574: iconst_0
      //   575: invokestatic 193	java/lang/System:currentTimeMillis	()J
      //   578: lload 5
      //   580: lsub
      //   581: invokestatic 64	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   584: aastore
      //   585: dup
      //   586: iconst_1
      //   587: aload_1
      //   588: getfield 174	com/tencent/mm/protocal/protobuf/auo:key	I
      //   591: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   594: aastore
      //   595: dup
      //   596: iconst_2
      //   597: aload_1
      //   598: getfield 202	com/tencent/mm/protocal/protobuf/auo:wyJ	J
      //   601: invokestatic 64	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   604: aastore
      //   605: dup
      //   606: iconst_3
      //   607: aload_1
      //   608: getfield 208	com/tencent/mm/protocal/protobuf/auo:length	I
      //   611: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   614: aastore
      //   615: dup
      //   616: iconst_4
      //   617: aload_1
      //   618: getfield 205	com/tencent/mm/protocal/protobuf/auo:wyK	I
      //   621: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   624: aastore
      //   625: invokestatic 88	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   628: aload 4
      //   630: invokestatic 225	com/tencent/mm/plugin/gallery/model/f:d	(Ljava/io/Closeable;)V
      //   633: aload_3
      //   634: iconst_1
      //   635: putfield 229	com/tencent/mm/plugin/gallery/model/f:dirty	Z
      //   638: aload_3
      //   639: getfield 162	com/tencent/mm/plugin/gallery/model/f:mNY	Landroid/util/SparseArray;
      //   642: iload 7
      //   644: aload_1
      //   645: invokevirtual 233	android/util/SparseArray:put	(ILjava/lang/Object;)V
      //   648: goto -401 -> 247
      //   651: astore_1
      //   652: ldc 117
      //   654: ldc 235
      //   656: iconst_1
      //   657: anewarray 4	java/lang/Object
      //   660: dup
      //   661: iconst_0
      //   662: aload_1
      //   663: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   666: aastore
      //   667: invokestatic 241	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   670: ldc 117
      //   672: aload_1
      //   673: ldc 243
      //   675: iconst_0
      //   676: anewarray 4	java/lang/Object
      //   679: invokestatic 247	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   682: aload 4
      //   684: invokestatic 225	com/tencent/mm/plugin/gallery/model/f:d	(Ljava/io/Closeable;)V
      //   687: goto -440 -> 247
      //   690: astore_1
      //   691: ldc 117
      //   693: ldc 249
      //   695: iconst_1
      //   696: anewarray 4	java/lang/Object
      //   699: dup
      //   700: iconst_0
      //   701: aload_1
      //   702: invokevirtual 239	java/lang/Exception:getMessage	()Ljava/lang/String;
      //   705: aastore
      //   706: invokestatic 241	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   709: aload 4
      //   711: invokestatic 225	com/tencent/mm/plugin/gallery/model/f:d	(Ljava/io/Closeable;)V
      //   714: goto -467 -> 247
      //   717: astore_1
      //   718: aload 4
      //   720: invokestatic 225	com/tencent/mm/plugin/gallery/model/f:d	(Ljava/io/Closeable;)V
      //   723: sipush 21228
      //   726: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   729: aload_1
      //   730: athrow
      //   731: sipush 21228
      //   734: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   737: goto -644 -> 93
      //   740: goto -268 -> 472
      //
      // Exception table:
      //   from	to	target	type
      //   481	493	651	java/lang/Exception
      //   493	628	690	java/lang/Exception
      //   493	628	717	finally
      //   691	709	717	finally
    }

    public final boolean acg()
    {
      boolean bool = false;
      AppMethodBeat.i(21229);
      ab.d("MircoMsg.CacheService", "do on post execute, filePath[%s]", new Object[] { this.mFilePath });
      c.b(c.this).bV(this.mFilePath);
      ab.v("MircoMsg.CacheService", "remove filePathInService at position 0 : now position:[%d]", new Object[] { Integer.valueOf(c.b(c.this).size()) });
      if (this.bitmap == null)
      {
        ab.e("MircoMsg.CacheService", "decode file failed, %s ", new Object[] { this.mFilePath });
        AppMethodBeat.o(21229);
        return bool;
      }
      d locald = c.a(c.this);
      String str = this.mFilePath;
      Bitmap localBitmap = this.bitmap;
      int i = this.mNE;
      if (locald.mNF == null)
        ab.e("MicroMsg.GalleryCache", "cache is null");
      while (true)
      {
        this.bitmap = null;
        AppMethodBeat.o(21229);
        bool = true;
        break;
        locald.mNF.k(str, new d.a(locald, localBitmap, i));
        locald.fry.cF(str);
        locald.fry.doNotify();
      }
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool = false;
      AppMethodBeat.i(21230);
      if (paramObject == null)
        AppMethodBeat.o(21230);
      while (true)
      {
        return bool;
        if (this == paramObject)
        {
          bool = true;
          AppMethodBeat.o(21230);
        }
        else if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          bool = bo.bc(this.mFilePath, "").equals(paramObject.mFilePath);
          AppMethodBeat.o(21230);
        }
        else
        {
          AppMethodBeat.o(21230);
        }
      }
    }

    public final int hashCode()
    {
      AppMethodBeat.i(21231);
      int i = bo.bc(this.mFilePath, "").hashCode();
      AppMethodBeat.o(21231);
      return i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.c
 * JD-Core Version:    0.6.2
 */