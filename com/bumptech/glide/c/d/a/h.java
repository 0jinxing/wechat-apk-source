package com.bumptech.glide.c.d.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.f;
import com.bumptech.glide.c.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class h
{
  public static final com.bumptech.glide.c.i<com.bumptech.glide.c.b> aFl;

  @Deprecated
  public static final com.bumptech.glide.c.i<g> aFm;
  public static final com.bumptech.glide.c.i<Boolean> aFn;
  public static final com.bumptech.glide.c.i<Boolean> aFo;
  private static final Set<String> aFp;
  static final a aFq;
  private static final Set<f.a> aFr;
  private static final Queue<BitmapFactory.Options> aFs;
  private final DisplayMetrics aDu;
  private final k aFt;
  private final com.bumptech.glide.c.b.a.e awf;
  private final List<f> azH;
  private final com.bumptech.glide.c.b.a.b azx;

  static
  {
    AppMethodBeat.i(92231);
    aFl = com.bumptech.glide.c.i.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.c.b.ayM);
    aFm = g.aFh;
    aFn = com.bumptech.glide.c.i.c("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
    aFo = com.bumptech.glide.c.i.Z("com.bumtpech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
    aFp = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] { "image/vnd.wap.wbmp", "image/x-ico" })));
    aFq = new h.1();
    aFr = Collections.unmodifiableSet(EnumSet.of(f.a.ayT, f.a.ayV, f.a.ayW));
    aFs = com.bumptech.glide.h.j.dn(0);
    AppMethodBeat.o(92231);
  }

  public h(List<f> paramList, DisplayMetrics paramDisplayMetrics, com.bumptech.glide.c.b.a.e parame, com.bumptech.glide.c.b.a.b paramb)
  {
    AppMethodBeat.i(92223);
    this.aFt = k.nt();
    this.azH = paramList;
    this.aDu = ((DisplayMetrics)com.bumptech.glide.h.i.d(paramDisplayMetrics, "Argument must not be null"));
    this.awf = ((com.bumptech.glide.c.b.a.e)com.bumptech.glide.h.i.d(parame, "Argument must not be null"));
    this.azx = ((com.bumptech.glide.c.b.a.b)com.bumptech.glide.h.i.d(paramb, "Argument must not be null"));
    AppMethodBeat.o(92223);
  }

  private static int[] a(InputStream paramInputStream, BitmapFactory.Options paramOptions, a parama, com.bumptech.glide.c.b.a.e parame)
  {
    AppMethodBeat.i(92226);
    paramOptions.inJustDecodeBounds = true;
    b(paramInputStream, paramOptions, parama, parame);
    paramOptions.inJustDecodeBounds = false;
    int i = paramOptions.outWidth;
    int j = paramOptions.outHeight;
    AppMethodBeat.o(92226);
    return new int[] { i, j };
  }

  private static Bitmap b(InputStream paramInputStream, BitmapFactory.Options paramOptions, a parama, com.bumptech.glide.c.b.a.e parame)
  {
    AppMethodBeat.i(92227);
    if (paramOptions.inJustDecodeBounds)
      paramInputStream.mark(10485760);
    Object localObject2;
    while (true)
    {
      int i = paramOptions.outWidth;
      int j = paramOptions.outHeight;
      Object localObject1 = paramOptions.outMimeType;
      p.nx().lock();
      try
      {
        localObject2 = BitmapFactory.decodeStream(paramInputStream, null, paramOptions);
        parama = (a)localObject2;
        p.nx().unlock();
        if (paramOptions.inJustDecodeBounds)
          paramInputStream.reset();
        AppMethodBeat.o(92227);
        paramInputStream = parama;
        return paramInputStream;
        parama.ns();
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
        {
          localObject2 = new java/io/IOException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Exception decoding bitmap, outWidth: ");
          ((IOException)localObject2).<init>(i + ", outHeight: " + j + ", outMimeType: " + (String)localObject1 + ", inBitmap: " + j(paramOptions.inBitmap), localIllegalArgumentException);
          Log.isLoggable("Downsampler", 3);
          localObject1 = paramOptions.inBitmap;
          if (localObject1 != null)
            try
            {
              paramInputStream.reset();
              parame.g(paramOptions.inBitmap);
              paramOptions.inBitmap = null;
              paramInputStream = b(paramInputStream, paramOptions, parama, parame);
            }
            catch (IOException paramInputStream)
            {
              AppMethodBeat.o(92227);
              throw ((Throwable)localObject2);
            }
        }
      }
      finally
      {
        p.nx().unlock();
        AppMethodBeat.o(92227);
      }
    }
    AppMethodBeat.o(92227);
    throw ((Throwable)localObject2);
  }

  private static boolean b(BitmapFactory.Options paramOptions)
  {
    if ((paramOptions.inTargetDensity > 0) && (paramOptions.inDensity > 0) && (paramOptions.inTargetDensity != paramOptions.inDensity));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static void c(BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(92230);
    d(paramOptions);
    synchronized (aFs)
    {
      aFs.offer(paramOptions);
      AppMethodBeat.o(92230);
      return;
    }
  }

  private static void d(BitmapFactory.Options paramOptions)
  {
    paramOptions.inTempStorage = null;
    paramOptions.inDither = false;
    paramOptions.inScaled = false;
    paramOptions.inSampleSize = 1;
    paramOptions.inPreferredConfig = null;
    paramOptions.inJustDecodeBounds = false;
    paramOptions.inDensity = 0;
    paramOptions.inTargetDensity = 0;
    paramOptions.outWidth = 0;
    paramOptions.outHeight = 0;
    paramOptions.outMimeType = null;
    paramOptions.inBitmap = null;
    paramOptions.inMutable = true;
  }

  @TargetApi(19)
  private static String j(Bitmap paramBitmap)
  {
    AppMethodBeat.i(92228);
    if (paramBitmap == null)
    {
      paramBitmap = null;
      AppMethodBeat.o(92228);
      return paramBitmap;
    }
    if (Build.VERSION.SDK_INT >= 19);
    for (String str = " (" + paramBitmap.getAllocationByteCount() + ")"; ; str = "")
    {
      paramBitmap = "[" + paramBitmap.getWidth() + "x" + paramBitmap.getHeight() + "] " + paramBitmap.getConfig() + str;
      AppMethodBeat.o(92228);
      break;
    }
  }

  private static int l(double paramDouble)
  {
    AppMethodBeat.i(92225);
    if (paramDouble <= 1.0D);
    while (true)
    {
      int i = (int)Math.round(2147483647.0D * paramDouble);
      AppMethodBeat.o(92225);
      return i;
      paramDouble = 1.0D / paramDouble;
    }
  }

  private static BitmapFactory.Options nr()
  {
    try
    {
      AppMethodBeat.i(92229);
      synchronized (aFs)
      {
        BitmapFactory.Options localOptions = (BitmapFactory.Options)aFs.poll();
        ??? = localOptions;
        if (localOptions == null)
        {
          ??? = new android/graphics/BitmapFactory$Options;
          ((BitmapFactory.Options)???).<init>();
          d((BitmapFactory.Options)???);
        }
        AppMethodBeat.o(92229);
        return ???;
      }
    }
    finally
    {
    }
  }

  public final u<Bitmap> a(InputStream paramInputStream, int paramInt1, int paramInt2, com.bumptech.glide.c.j paramj, a parama)
  {
    AppMethodBeat.i(92224);
    com.bumptech.glide.h.i.b(paramInputStream.markSupported(), "You must provide an InputStream that supports mark()");
    byte[] arrayOfByte = (byte[])this.azx.a(65536, [B.class);
    BitmapFactory.Options localOptions = nr();
    localOptions.inTempStorage = arrayOfByte;
    Object localObject1 = (com.bumptech.glide.c.b)paramj.a(aFl);
    g localg = (g)paramj.a(g.aFh);
    boolean bool1 = ((Boolean)paramj.a(aFn)).booleanValue();
    int i;
    if ((paramj.a(aFo) != null) && (((Boolean)paramj.a(aFo)).booleanValue()))
    {
      i = 1;
      if (localObject1 == com.bumptech.glide.c.b.ayK)
        i = 0;
    }
    while (true)
    {
      int j;
      int k;
      boolean bool2;
      int i1;
      int i2;
      Object localObject2;
      try
      {
        long l = com.bumptech.glide.h.e.ok();
        paramj = a(paramInputStream, localOptions, parama, this.awf);
        j = paramj[0];
        k = paramj[1];
        String str = localOptions.outMimeType;
        if ((j != -1) && (k != -1))
          break label2125;
        m = 0;
        int n = com.bumptech.glide.c.g.b(this.azH, paramInputStream, this.azx);
        i = p.di(n);
        bool2 = p.dj(n);
        if (paramInt1 == -2147483648)
        {
          i1 = j;
          if (paramInt2 != -2147483648)
            continue;
          i2 = k;
          localObject2 = com.bumptech.glide.c.g.a(this.azH, paramInputStream, this.azx);
          paramj = this.awf;
          if ((j > 0) && (k > 0))
            continue;
          if (Log.isLoggable("Downsampler", 3))
          {
            paramj = new java/lang/StringBuilder;
            paramj.<init>("Unable to determine dimensions for: ");
            paramj.append(localObject2).append(" with target [").append(i1).append("x").append(i2).append("]");
          }
          paramj = this.aFt;
          if ((m != 0) && (Build.VERSION.SDK_INT >= 26) && (localObject1 != com.bumptech.glide.c.b.ayK) && (!bool2))
            break label1734;
          i3 = 0;
          if (i3 == 0)
          {
            if ((localObject1 != com.bumptech.glide.c.b.ayJ) && (localObject1 != com.bumptech.glide.c.b.ayK) && (Build.VERSION.SDK_INT != 16))
              break label1797;
            localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
          }
          label396: if (Build.VERSION.SDK_INT < 19)
            break label1898;
          i = 1;
          label407: if ((localOptions.inSampleSize == 1) || (i != 0))
          {
            if (Build.VERSION.SDK_INT < 19)
              break label1904;
            bool2 = true;
            label432: if (bool2)
            {
              if ((j < 0) || (k < 0) || (!bool1) || (i == 0))
                break label1919;
              i = i1;
              if ((i > 0) && (i2 > 0))
              {
                localObject1 = this.awf;
                paramj = null;
                if (Build.VERSION.SDK_INT >= 26)
                {
                  if (localOptions.inPreferredConfig != Bitmap.Config.HARDWARE)
                    paramj = localOptions.outConfig;
                }
                else
                {
                  localObject2 = paramj;
                  if (paramj == null)
                    localObject2 = localOptions.inPreferredConfig;
                  localOptions.inBitmap = ((com.bumptech.glide.c.b.a.e)localObject1).h(i, i2, (Bitmap.Config)localObject2);
                }
              }
            }
          }
          localObject2 = b(paramInputStream, localOptions, parama, this.awf);
          parama.a(this.awf, (Bitmap)localObject2);
          if (Log.isLoggable("Downsampler", 2))
          {
            paramInputStream = new java/lang/StringBuilder;
            paramInputStream.<init>("Decoded ");
            paramInputStream.append(j((Bitmap)localObject2)).append(" from [").append(j).append("x").append(k).append("] ").append(str).append(" with inBitmap ").append(j(localOptions.inBitmap)).append(" for [").append(paramInt1).append("x").append(paramInt2).append("], sample size: ").append(localOptions.inSampleSize).append(", density: ").append(localOptions.inDensity).append(", target density: ").append(localOptions.inTargetDensity).append(", thread: ").append(Thread.currentThread().getName()).append(", duration: ").append(com.bumptech.glide.h.e.q(l));
          }
          paramInputStream = null;
          if (localObject2 != null)
          {
            ((Bitmap)localObject2).setDensity(this.aDu.densityDpi);
            paramj = p.a(this.awf, (Bitmap)localObject2, n);
            paramInputStream = paramj;
            if (!localObject2.equals(paramj))
            {
              this.awf.g((Bitmap)localObject2);
              paramInputStream = paramj;
            }
          }
          paramInputStream = d.a(paramInputStream, this.awf);
          return paramInputStream;
          i = 0;
          break;
        }
        i1 = paramInt1;
        continue;
        i2 = paramInt2;
        continue;
        if ((i == 90) || (i == 270))
        {
          f = localg.l(k, j, i1, i2);
          if (f > 0.0F)
            break label1029;
          paramInputStream = new java/lang/IllegalArgumentException;
          paramj = new java/lang/StringBuilder;
          paramj.<init>("Cannot scale with factor: ");
          paramInputStream.<init>(f + " from: " + localg + ", source: [" + j + "x" + k + "], target: [" + i1 + "x" + i2 + "]");
          AppMethodBeat.o(92224);
          throw paramInputStream;
        }
      }
      finally
      {
        c(localOptions);
        this.azx.put(arrayOfByte);
        AppMethodBeat.o(92224);
      }
      float f = localg.l(j, k, i1, i2);
      continue;
      label1029: g.g localg1 = localg.nq();
      if (localg1 == null)
      {
        paramInputStream = new java/lang/IllegalArgumentException;
        paramInputStream.<init>("Cannot round with null rounding");
        AppMethodBeat.o(92224);
        throw paramInputStream;
      }
      int i3 = (int)(j * f + 0.5D);
      i = (int)(k * f + 0.5D);
      i3 = j / i3;
      i = k / i;
      label1119: int i4;
      if (localg1 == g.g.aFi)
      {
        i = Math.max(i3, i);
        if ((Build.VERSION.SDK_INT > 23) || (!aFp.contains(localOptions.outMimeType)))
          break label1491;
        i4 = 1;
      }
      label1719: label1732: label1734: label2122: 
      while (true)
      {
        while (true)
        {
          label1146: localOptions.inSampleSize = i4;
          label1232: double d1;
          if (localObject2 == f.a.ayT)
          {
            i = Math.min(i4, 8);
            int i5 = (int)Math.ceil(j / i);
            int i6 = (int)Math.ceil(k / i);
            int i7 = i4 / 8;
            i = i6;
            i3 = i5;
            if (i7 > 0)
            {
              i3 = i5 / i7;
              i = i6 / i7;
            }
            d1 = localg.l(i3, i, i1, i2);
            if (Build.VERSION.SDK_INT >= 19)
            {
              i5 = l(d1);
              i6 = (int)(i5 * d1 + 0.5D);
              double d2 = d1 / (i6 / i5);
              localOptions.inTargetDensity = ((int)(i6 * d2 + 0.5D));
              localOptions.inDensity = l(d1);
            }
            if (!b(localOptions))
              break label1719;
            localOptions.inScaled = true;
          }
          while (true)
          {
            if (!Log.isLoggable("Downsampler", 2))
              break label1732;
            paramj = new java/lang/StringBuilder;
            paramj.<init>("Calculate scaling, source: [");
            paramj.append(j).append("x").append(k).append("], target: [").append(i1).append("x").append(i2).append("], power of two scaled: [").append(i3).append("x").append(i).append("], exact scale factor: ").append(f).append(", power of 2 sample size: ").append(i4).append(", adjusted scale factor: ").append(d1).append(", target density: ").append(localOptions.inTargetDensity).append(", density: ").append(localOptions.inDensity);
            break;
            i = Math.min(i3, i);
            break label1119;
            label1491: i4 = Math.max(1, Integer.highestOneBit(i));
            if ((localg1 != g.g.aFi) || (i4 >= 1.0F / f))
              break label2122;
            i4 <<= 1;
            break label1146;
            if ((localObject2 == f.a.ayW) || (localObject2 == f.a.ayV))
            {
              i3 = (int)Math.floor(j / i4);
              i = (int)Math.floor(k / i4);
              break label1232;
            }
            if ((localObject2 == f.a.ayY) || (localObject2 == f.a.ayX))
            {
              if (Build.VERSION.SDK_INT >= 24)
              {
                i3 = Math.round(j / i4);
                i = Math.round(k / i4);
                break label1232;
              }
              i3 = (int)Math.floor(j / i4);
              i = (int)Math.floor(k / i4);
              break label1232;
            }
            if ((j % i4 != 0) || (k % i4 != 0))
            {
              paramj = a(paramInputStream, localOptions, parama, paramj);
              i3 = paramj[0];
              i = paramj[1];
              break label1232;
            }
            i3 = j / i4;
            i = k / i4;
            break label1232;
            localOptions.inTargetDensity = 0;
            localOptions.inDensity = 0;
          }
          break;
          if ((i1 >= 128) && (i2 >= 128) && (paramj.nu()));
          for (i = 1; ; i = 0)
          {
            i3 = i;
            if (i == 0)
              break;
            localOptions.inPreferredConfig = Bitmap.Config.HARDWARE;
            localOptions.inMutable = false;
            i3 = i;
            break;
          }
          try
          {
            bool2 = com.bumptech.glide.c.g.a(this.azH, paramInputStream, this.azx).aza;
            if (bool2)
            {
              paramj = Bitmap.Config.ARGB_8888;
              localOptions.inPreferredConfig = paramj;
              if (localOptions.inPreferredConfig != Bitmap.Config.RGB_565)
                break label396;
              localOptions.inDither = true;
            }
          }
          catch (IOException paramj)
          {
            while (true)
            {
              if (Log.isLoggable("Downsampler", 3))
              {
                paramj = new java/lang/StringBuilder;
                paramj.<init>("Cannot determine whether the image has alpha or not from header, format ");
                paramj.append(localObject1);
              }
              bool2 = false;
              continue;
              paramj = Bitmap.Config.RGB_565;
            }
          }
        }
        label1898: i = 0;
        break label407;
        label1904: bool2 = aFr.contains(localObject2);
        break label432;
        label1919: if (b(localOptions));
        for (f = localOptions.inTargetDensity / localOptions.inDensity; ; f = 1.0F)
        {
          i3 = localOptions.inSampleSize;
          i = (int)Math.ceil(j / i3);
          i1 = (int)Math.ceil(k / i3);
          i = Math.round(i * f);
          i2 = Math.round(i1 * f);
          if (Log.isLoggable("Downsampler", 2))
          {
            paramj = new java/lang/StringBuilder;
            paramj.<init>("Calculated target [");
            paramj.append(i).append("x").append(i2).append("] for source [").append(j).append("x").append(k).append("], sampleSize: ").append(i3).append(", targetDensity: ").append(localOptions.inTargetDensity).append(", density: ").append(localOptions.inDensity).append(", density multiplier: ").append(f);
          }
          break;
        }
      }
      label1797: label2125: int m = i;
    }
  }

  public static abstract interface a
  {
    public abstract void a(com.bumptech.glide.c.b.a.e parame, Bitmap paramBitmap);

    public abstract void ns();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.h
 * JD-Core Version:    0.6.2
 */