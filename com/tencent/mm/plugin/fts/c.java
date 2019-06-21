package com.tencent.mm.plugin.fts;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public final class c
  implements com.tencent.mm.plugin.fts.a.d.c
{
  private static int MAX_CACHE_SIZE = 32;
  private ak fbD;
  private ConcurrentHashMap<String, c.a> mAN;
  private Vector<String> mAO;
  private boolean mAP;
  private int mAQ;
  private ak[] mAR;
  private ConcurrentHashMap<Long, ByteArrayOutputStream> mAS;
  private ConcurrentHashMap<Long, byte[]> mAT;
  private ak mAU;
  private Set<String> mAV;

  public c()
  {
    AppMethodBeat.i(136527);
    this.mAP = true;
    this.mAQ = 0;
    this.fbD = new ak(Looper.getMainLooper());
    this.mAR = new ak[2];
    this.mAS = null;
    this.mAT = null;
    this.mAU = null;
    ab.i("MicroMsg.FTS.FTSImageLoader", "create SearchImageLoader");
    if (com.tencent.mm.compatible.util.d.iW(19));
    for (MAX_CACHE_SIZE = 64; ; MAX_CACHE_SIZE = 32)
    {
      this.mAN = new ConcurrentHashMap();
      this.mAO = new Vector();
      this.mAS = new ConcurrentHashMap();
      this.mAT = new ConcurrentHashMap();
      this.mAV = Collections.synchronizedSet(new HashSet());
      while (i < 2)
      {
        if (this.mAR[i] == null)
          com.tencent.mm.sdk.g.d.a(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(136521);
              Looper.prepare();
              c.a(c.this)[i] = new ak();
              Looper.loop();
              AppMethodBeat.o(136521);
            }
          }
          , "SearchImageLoader_loadImage_handler", 1).start();
        i++;
      }
    }
    com.tencent.mm.sdk.g.d.a(new c.2(this), "SearchImageLoader_saveImage_handler", 1).start();
    AppMethodBeat.o(136527);
  }

  private void MQ(String paramString)
  {
    AppMethodBeat.i(136540);
    c.a locala = (c.a)this.mAN.get(paramString);
    this.mAO.remove(paramString);
    this.mAN.remove(paramString);
    if ((locala != null) && (locala.bitmap != null))
    {
      if (!locala.bitmap.isRecycled())
      {
        ab.i("MicroMsg.FTS.FTSImageLoader", "bitmap recycle %s", new Object[] { locala.bitmap });
        locala.bitmap.recycle();
      }
      locala.bitmap = null;
    }
    AppMethodBeat.o(136540);
  }

  // ERROR //
  private Bitmap b(String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc_w 263
    //   3: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 202	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   10: ifeq +13 -> 23
    //   13: ldc_w 263
    //   16: invokestatic 143	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aconst_null
    //   20: astore_1
    //   21: aload_1
    //   22: areturn
    //   23: aload_0
    //   24: getfield 77	com/tencent/mm/plugin/fts/c:mAS	Ljava/util/concurrent/ConcurrentHashMap;
    //   27: invokestatic 267	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   30: invokevirtual 271	java/lang/Thread:getId	()J
    //   33: invokestatic 277	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   36: invokevirtual 150	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   39: checkcast 279	java/io/ByteArrayOutputStream
    //   42: astore 5
    //   44: aload 5
    //   46: astore 6
    //   48: aload 5
    //   50: ifnonnull +34 -> 84
    //   53: new 279	java/io/ByteArrayOutputStream
    //   56: dup
    //   57: ldc_w 280
    //   60: invokespecial 282	java/io/ByteArrayOutputStream:<init>	(I)V
    //   63: astore 6
    //   65: aload_0
    //   66: getfield 77	com/tencent/mm/plugin/fts/c:mAS	Ljava/util/concurrent/ConcurrentHashMap;
    //   69: invokestatic 267	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   72: invokevirtual 271	java/lang/Thread:getId	()J
    //   75: invokestatic 277	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   78: aload 6
    //   80: invokevirtual 248	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   83: pop
    //   84: aload 6
    //   86: invokevirtual 285	java/io/ByteArrayOutputStream:reset	()V
    //   89: aload_0
    //   90: invokespecial 289	com/tencent/mm/plugin/fts/c:getBuffer	()[B
    //   93: astore 7
    //   95: aload_1
    //   96: sipush 10000
    //   99: sipush 20000
    //   102: invokestatic 295	com/tencent/mm/network/b:p	(Ljava/lang/String;II)Ljava/io/InputStream;
    //   105: astore 8
    //   107: aload 8
    //   109: ifnonnull +435 -> 544
    //   112: aload 8
    //   114: astore 5
    //   116: ldc 83
    //   118: ldc_w 297
    //   121: iconst_1
    //   122: anewarray 4	java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: aload_1
    //   128: aastore
    //   129: invokestatic 300	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: aload 8
    //   134: ifnull +8 -> 142
    //   137: aload 8
    //   139: invokevirtual 305	java/io/InputStream:close	()V
    //   142: ldc_w 263
    //   145: invokestatic 143	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aconst_null
    //   149: astore_1
    //   150: goto -129 -> 21
    //   153: astore_1
    //   154: ldc 83
    //   156: aload_1
    //   157: ldc_w 307
    //   160: iconst_0
    //   161: anewarray 4	java/lang/Object
    //   164: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   167: goto -25 -> 142
    //   170: aload 8
    //   172: astore 5
    //   174: aload 8
    //   176: aload 7
    //   178: invokevirtual 315	java/io/InputStream:read	([B)I
    //   181: istore 9
    //   183: iload 9
    //   185: iconst_m1
    //   186: if_icmpeq +88 -> 274
    //   189: iload 10
    //   191: iload 9
    //   193: iadd
    //   194: istore 10
    //   196: aload 8
    //   198: astore 5
    //   200: aload 6
    //   202: aload 7
    //   204: iconst_0
    //   205: iload 9
    //   207: invokevirtual 319	java/io/ByteArrayOutputStream:write	([BII)V
    //   210: goto -40 -> 170
    //   213: astore 6
    //   215: aload 8
    //   217: astore 5
    //   219: ldc 83
    //   221: aload 6
    //   223: ldc_w 307
    //   226: iconst_0
    //   227: anewarray 4	java/lang/Object
    //   230: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: aload 8
    //   235: astore 5
    //   237: ldc 83
    //   239: ldc_w 321
    //   242: iconst_1
    //   243: anewarray 4	java/lang/Object
    //   246: dup
    //   247: iconst_0
    //   248: aload_1
    //   249: aastore
    //   250: invokestatic 300	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   253: aload 8
    //   255: ifnull +8 -> 263
    //   258: aload 8
    //   260: invokevirtual 305	java/io/InputStream:close	()V
    //   263: ldc_w 263
    //   266: invokestatic 143	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   269: aconst_null
    //   270: astore_1
    //   271: goto -250 -> 21
    //   274: aload 8
    //   276: astore 5
    //   278: aload 6
    //   280: invokevirtual 324	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   283: astore 6
    //   285: iload_3
    //   286: ifle +116 -> 402
    //   289: iload 4
    //   291: ifle +111 -> 402
    //   294: aload 8
    //   296: astore 5
    //   298: aload 6
    //   300: iload_3
    //   301: iload 4
    //   303: invokestatic 330	com/tencent/mm/sdk/platformtools/d:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   306: astore 6
    //   308: aload 8
    //   310: astore 5
    //   312: ldc 83
    //   314: ldc_w 332
    //   317: iconst_4
    //   318: anewarray 4	java/lang/Object
    //   321: dup
    //   322: iconst_0
    //   323: aload_1
    //   324: aastore
    //   325: dup
    //   326: iconst_1
    //   327: iload 10
    //   329: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   332: aastore
    //   333: dup
    //   334: iconst_2
    //   335: aload 6
    //   337: invokevirtual 340	android/graphics/Bitmap:getWidth	()I
    //   340: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   343: aastore
    //   344: dup
    //   345: iconst_3
    //   346: aload 6
    //   348: invokevirtual 343	android/graphics/Bitmap:getHeight	()I
    //   351: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   354: aastore
    //   355: invokestatic 346	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   358: iload_2
    //   359: ifeq +76 -> 435
    //   362: aload 8
    //   364: astore 5
    //   366: aload 6
    //   368: iconst_1
    //   369: aload 6
    //   371: invokevirtual 340	android/graphics/Bitmap:getWidth	()I
    //   374: i2f
    //   375: invokestatic 349	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ZF)Landroid/graphics/Bitmap;
    //   378: astore 6
    //   380: aload 6
    //   382: astore_1
    //   383: aload 8
    //   385: ifnull +8 -> 393
    //   388: aload 8
    //   390: invokevirtual 305	java/io/InputStream:close	()V
    //   393: ldc_w 263
    //   396: invokestatic 143	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   399: goto -378 -> 21
    //   402: aload 8
    //   404: astore 5
    //   406: aload 6
    //   408: invokestatic 353	com/tencent/mm/sdk/platformtools/d:bQ	([B)Landroid/graphics/Bitmap;
    //   411: astore 6
    //   413: goto -105 -> 308
    //   416: astore 5
    //   418: ldc 83
    //   420: aload 5
    //   422: ldc_w 307
    //   425: iconst_0
    //   426: anewarray 4	java/lang/Object
    //   429: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: goto -39 -> 393
    //   435: aload 8
    //   437: ifnull +8 -> 445
    //   440: aload 8
    //   442: invokevirtual 305	java/io/InputStream:close	()V
    //   445: ldc_w 263
    //   448: invokestatic 143	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   451: aload 6
    //   453: astore_1
    //   454: goto -433 -> 21
    //   457: astore_1
    //   458: ldc 83
    //   460: aload_1
    //   461: ldc_w 307
    //   464: iconst_0
    //   465: anewarray 4	java/lang/Object
    //   468: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   471: goto -26 -> 445
    //   474: astore_1
    //   475: ldc 83
    //   477: aload_1
    //   478: ldc_w 307
    //   481: iconst_0
    //   482: anewarray 4	java/lang/Object
    //   485: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   488: goto -225 -> 263
    //   491: astore_1
    //   492: aconst_null
    //   493: astore 5
    //   495: aload 5
    //   497: ifnull +8 -> 505
    //   500: aload 5
    //   502: invokevirtual 305	java/io/InputStream:close	()V
    //   505: ldc_w 263
    //   508: invokestatic 143	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   511: aload_1
    //   512: athrow
    //   513: astore 5
    //   515: ldc 83
    //   517: aload 5
    //   519: ldc_w 307
    //   522: iconst_0
    //   523: anewarray 4	java/lang/Object
    //   526: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   529: goto -24 -> 505
    //   532: astore_1
    //   533: goto -38 -> 495
    //   536: astore 6
    //   538: aconst_null
    //   539: astore 8
    //   541: goto -326 -> 215
    //   544: iconst_0
    //   545: istore 10
    //   547: goto -377 -> 170
    //
    // Exception table:
    //   from	to	target	type
    //   137	142	153	java/io/IOException
    //   116	132	213	java/lang/Exception
    //   174	183	213	java/lang/Exception
    //   200	210	213	java/lang/Exception
    //   278	285	213	java/lang/Exception
    //   298	308	213	java/lang/Exception
    //   312	358	213	java/lang/Exception
    //   366	380	213	java/lang/Exception
    //   406	413	213	java/lang/Exception
    //   388	393	416	java/io/IOException
    //   440	445	457	java/io/IOException
    //   258	263	474	java/io/IOException
    //   95	107	491	finally
    //   500	505	513	java/io/IOException
    //   116	132	532	finally
    //   174	183	532	finally
    //   200	210	532	finally
    //   219	233	532	finally
    //   237	253	532	finally
    //   278	285	532	finally
    //   298	308	532	finally
    //   312	358	532	finally
    //   366	380	532	finally
    //   406	413	532	finally
    //   95	107	536	java/lang/Exception
  }

  private static String b(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(136538);
    paramString1 = bo.bc(paramString1, "null") + bo.bc(paramString2, "null") + paramBoolean + paramInt1 + "_" + paramInt2;
    paramString1 = "fts_search_" + g.x(paramString1.getBytes());
    AppMethodBeat.o(136538);
    return paramString1;
  }

  private byte[] getBuffer()
  {
    try
    {
      AppMethodBeat.i(136537);
      byte[] arrayOfByte1 = (byte[])this.mAT.get(Long.valueOf(Thread.currentThread().getId()));
      byte[] arrayOfByte2 = arrayOfByte1;
      if (arrayOfByte1 == null)
      {
        arrayOfByte2 = new byte[1024];
        this.mAT.put(Long.valueOf(Thread.currentThread().getId()), arrayOfByte2);
      }
      AppMethodBeat.o(136537);
      return arrayOfByte2;
    }
    finally
    {
    }
  }

  private Bitmap sB(String paramString)
  {
    AppMethodBeat.i(136536);
    c.a locala = (c.a)this.mAN.get(paramString);
    if ((locala != null) && (locala.bitmap != null) && (!locala.bitmap.isRecycled()))
    {
      this.mAO.remove(paramString);
      this.mAO.add(0, paramString);
    }
    if (locala == null)
    {
      paramString = null;
      AppMethodBeat.o(136536);
    }
    while (true)
    {
      return paramString;
      paramString = locala.bitmap;
      AppMethodBeat.o(136536);
    }
  }

  public final Bitmap a(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(136535);
    paramString1 = sB(b(paramString1, paramString2, paramBoolean, paramInt1, paramInt2));
    AppMethodBeat.o(136535);
    return paramString1;
  }

  public final String a(ImageView paramImageView, String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(136529);
    paramString1 = b(paramString1, paramString2, paramBoolean, paramInt1, paramInt2);
    paramImageView.setTag(paramString1);
    ab.d("MicroMsg.FTS.FTSImageLoader", "update image view cache key: hashcode=%d | cacheKey=%s", new Object[] { Integer.valueOf(paramImageView.hashCode()), paramString1 });
    AppMethodBeat.o(136529);
    return paramString1;
  }

  public final void a(Context paramContext, ImageView paramImageView, String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(136528);
    String str = a(paramImageView, paramString1, paramString2, paramBoolean, paramInt1, paramInt2);
    if (!this.mAP)
      AppMethodBeat.o(136528);
    while (true)
    {
      return;
      paramContext = new b(str, paramString1, paramString2, paramBoolean, paramInt1, paramInt2, new c.3(this, paramImageView, paramContext));
      if (this.mAV.add(str))
      {
        this.mAQ += 1;
        this.mAQ %= 2;
        this.mAR[this.mAQ].post(paramContext);
        AppMethodBeat.o(136528);
      }
      else
      {
        ab.v("MicroMsg.FTS.FTSImageLoader", "cacheKey: %s | runningJobTask: %s", new Object[] { str, this.mAV.toString() });
        AppMethodBeat.o(136528);
      }
    }
  }

  public final void bAa()
  {
    AppMethodBeat.i(136534);
    bzZ();
    ab.d("MicroMsg.FTS.FTSImageLoader", "destoryLoader");
    for (int i = 0; i < 2; i++)
      if (this.mAR[i] != null)
        this.mAR[i].getLooper().quit();
    Iterator localIterator = this.mAS.values().iterator();
    while (localIterator.hasNext())
    {
      ByteArrayOutputStream localByteArrayOutputStream = (ByteArrayOutputStream)localIterator.next();
      try
      {
        localByteArrayOutputStream.close();
      }
      catch (IOException localIOException)
      {
      }
    }
    this.mAS.clear();
    this.mAT.clear();
    this.mAU.getLooper().quit();
    AppMethodBeat.o(136534);
  }

  public final void bzV()
  {
    AppMethodBeat.i(136530);
    ab.d("MicroMsg.FTS.FTSImageLoader", "stopLoadImageTask");
    for (int i = 0; i < 2; i++)
      if (this.mAR[i] != null)
        this.mAR[i].removeCallbacksAndMessages(null);
    AppMethodBeat.o(136530);
  }

  public final void bzW()
  {
    AppMethodBeat.i(136531);
    ab.d("MicroMsg.FTS.FTSImageLoader", "stopLoadImage");
    this.mAP = false;
    bzV();
    AppMethodBeat.o(136531);
  }

  public final boolean bzX()
  {
    return this.mAP;
  }

  public final void bzY()
  {
    AppMethodBeat.i(136532);
    ab.d("MicroMsg.FTS.FTSImageLoader", "startLoadImage");
    this.mAP = true;
    AppMethodBeat.o(136532);
  }

  public final void bzZ()
  {
    AppMethodBeat.i(136533);
    ab.d("MicroMsg.FTS.FTSImageLoader", "clearCacheAndTask %s", new Object[] { Integer.valueOf(this.mAN.size()) });
    bzV();
    Iterator localIterator = this.mAN.entrySet().iterator();
    while (localIterator.hasNext())
      MQ((String)((Map.Entry)localIterator.next()).getKey());
    this.mAO.clear();
    this.mAV.clear();
    AppMethodBeat.o(136533);
  }

  final class b
    implements Runnable
  {
    private String cHg;
    private String cacheKey;
    private int height;
    private boolean mAZ;
    private c.c mBa;
    private String url;
    private int width;

    public b(String paramString1, String paramString2, String paramBoolean, boolean paramInt1, int paramInt2, int paramc, c.c arg8)
    {
      this.cacheKey = paramString1;
      this.url = paramString2;
      this.cHg = paramBoolean;
      Object localObject;
      this.mBa = localObject;
      this.mAZ = paramInt1;
      this.width = paramInt2;
      this.height = paramc;
    }

    public final void run()
    {
      AppMethodBeat.i(136525);
      ab.d("MicroMsg.FTS.FTSImageLoader", "Start to run load bitmap job %s", new Object[] { this.cacheKey });
      if (bo.isNullOrNil(this.cHg))
        this.cHg = c.MR(this.cacheKey);
      long l1 = System.currentTimeMillis();
      Bitmap localBitmap = c.U(this.cHg, this.width, this.height);
      long l2 = System.currentTimeMillis();
      if (localBitmap != null)
      {
        ab.d("MicroMsg.FTS.FTSImageLoader", "Found image in local %s | localPath %s | use time %d", new Object[] { this.url, this.cHg, Long.valueOf(l2 - l1) });
        c.a(c.this, this.cacheKey, this.cHg, localBitmap);
        this.mBa.aK(this.cacheKey, true);
        AppMethodBeat.o(136525);
      }
      while (true)
      {
        return;
        localBitmap = c.a(c.this, this.url, this.mAZ, this.width, this.height);
        l1 = System.currentTimeMillis();
        ab.d("MicroMsg.FTS.FTSImageLoader", "Get image from net %s | localPath %s | use time %d", new Object[] { this.url, this.cHg, Long.valueOf(l1 - l2) });
        if (localBitmap != null)
        {
          c.a(c.this, this.cacheKey, this.cHg, localBitmap);
          this.mBa.aK(this.cacheKey, true);
          AppMethodBeat.o(136525);
        }
        else
        {
          this.mBa.aK(this.cacheKey, false);
          AppMethodBeat.o(136525);
        }
      }
    }
  }

  static abstract interface c
  {
    public abstract void aK(String paramString, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.c
 * JD-Core Version:    0.6.2
 */