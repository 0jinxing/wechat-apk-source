package com.bumptech.glide.c.b.a;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public final class k
  implements e
{
  private static final Bitmap.Config aCG = Bitmap.Config.ARGB_8888;
  private final l aCH;
  private final Set<Bitmap.Config> aCI;
  private final long aCJ;
  private final k.a aCK;
  private long aCL;
  private int aCM;
  private int aCN;
  private int aCO;
  private int aCP;
  private long axz;

  public k(long paramLong)
  {
  }

  private k(long paramLong, l paraml, Set<Bitmap.Config> paramSet)
  {
    AppMethodBeat.i(91944);
    this.aCJ = paramLong;
    this.axz = paramLong;
    this.aCH = paraml;
    this.aCI = paramSet;
    this.aCK = new k.b();
    AppMethodBeat.o(91944);
  }

  private static Bitmap createBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91949);
    if (paramConfig != null);
    while (true)
    {
      paramConfig = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
      AppMethodBeat.o(91949);
      return paramConfig;
      paramConfig = aCG;
    }
  }

  private void dump()
  {
    AppMethodBeat.i(91954);
    if (Log.isLoggable("LruBitmapPool", 2))
      mT();
    AppMethodBeat.o(91954);
  }

  private Bitmap i(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Object localObject2;
    try
    {
      AppMethodBeat.i(91950);
      if ((Build.VERSION.SDK_INT >= 26) && (paramConfig == Bitmap.Config.HARDWARE))
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Cannot create a mutable Bitmap with config: ");
        ((IllegalArgumentException)localObject1).<init>(paramConfig + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        AppMethodBeat.o(91950);
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
    }
    Object localObject1 = this.aCH;
    if (paramConfig != null)
    {
      localObject2 = paramConfig;
      localObject2 = ((l)localObject1).c(paramInt1, paramInt2, (Bitmap.Config)localObject2);
      if (localObject2 != null)
        break label212;
      if (Log.isLoggable("LruBitmapPool", 3))
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Missing bitmap=");
        ((StringBuilder)localObject1).append(this.aCH.d(paramInt1, paramInt2, paramConfig));
      }
      this.aCN += 1;
    }
    while (true)
    {
      if (Log.isLoggable("LruBitmapPool", 2))
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Get bitmap=");
        ((StringBuilder)localObject1).append(this.aCH.d(paramInt1, paramInt2, paramConfig));
      }
      dump();
      AppMethodBeat.o(91950);
      return localObject2;
      localObject2 = aCG;
      break;
      label212: this.aCM += 1;
      this.aCL -= this.aCH.i((Bitmap)localObject2);
      ((Bitmap)localObject2).setHasAlpha(true);
      if (Build.VERSION.SDK_INT >= 19)
        ((Bitmap)localObject2).setPremultiplied(true);
    }
  }

  private void mT()
  {
    AppMethodBeat.i(91955);
    new StringBuilder("Hits=").append(this.aCM).append(", misses=").append(this.aCN).append(", puts=").append(this.aCO).append(", evictions=").append(this.aCP).append(", currentSize=").append(this.aCL).append(", maxSize=").append(this.axz).append("\nStrategy=").append(this.aCH);
    AppMethodBeat.o(91955);
  }

  private void p(long paramLong)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(91953);
        if (this.aCL > paramLong)
        {
          Bitmap localBitmap = this.aCH.mP();
          if (localBitmap == null)
          {
            if (Log.isLoggable("LruBitmapPool", 5))
              mT();
            this.aCL = 0L;
            AppMethodBeat.o(91953);
            return;
          }
          this.aCL -= this.aCH.i(localBitmap);
          this.aCP += 1;
          if (Log.isLoggable("LruBitmapPool", 3))
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("Evicting bitmap=");
            localStringBuilder.append(this.aCH.h(localBitmap));
          }
          dump();
          localBitmap.recycle();
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(91953);
    }
  }

  public final Bitmap c(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91947);
    Bitmap localBitmap = i(paramInt1, paramInt2, paramConfig);
    if (localBitmap != null)
      localBitmap.eraseColor(0);
    for (paramConfig = localBitmap; ; paramConfig = createBitmap(paramInt1, paramInt2, paramConfig))
    {
      AppMethodBeat.o(91947);
      return paramConfig;
    }
  }

  public final void g(Bitmap paramBitmap)
  {
    try
    {
      AppMethodBeat.i(91946);
      if (paramBitmap == null)
      {
        paramBitmap = new java/lang/NullPointerException;
        paramBitmap.<init>("Bitmap must not be null");
        AppMethodBeat.o(91946);
        throw paramBitmap;
      }
    }
    finally
    {
    }
    if (paramBitmap.isRecycled())
    {
      paramBitmap = new java/lang/IllegalStateException;
      paramBitmap.<init>("Cannot pool recycled bitmap");
      AppMethodBeat.o(91946);
      throw paramBitmap;
    }
    StringBuilder localStringBuilder;
    if ((!paramBitmap.isMutable()) || (this.aCH.i(paramBitmap) > this.axz) || (!this.aCI.contains(paramBitmap.getConfig())))
    {
      if (Log.isLoggable("LruBitmapPool", 2))
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Reject bitmap from pool, bitmap: ");
        localStringBuilder.append(this.aCH.h(paramBitmap)).append(", is mutable: ").append(paramBitmap.isMutable()).append(", is allowed config: ").append(this.aCI.contains(paramBitmap.getConfig()));
      }
      paramBitmap.recycle();
      AppMethodBeat.o(91946);
    }
    while (true)
    {
      return;
      int i = this.aCH.i(paramBitmap);
      this.aCH.g(paramBitmap);
      this.aCO += 1;
      long l = this.aCL;
      this.aCL = (i + l);
      if (Log.isLoggable("LruBitmapPool", 2))
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Put bitmap in pool=");
        localStringBuilder.append(this.aCH.h(paramBitmap));
      }
      dump();
      p(this.axz);
      AppMethodBeat.o(91946);
    }
  }

  public final Bitmap h(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(91948);
    Bitmap localBitmap1 = i(paramInt1, paramInt2, paramConfig);
    Bitmap localBitmap2 = localBitmap1;
    if (localBitmap1 == null)
      localBitmap2 = createBitmap(paramInt1, paramInt2, paramConfig);
    AppMethodBeat.o(91948);
    return localBitmap2;
  }

  public final void mO()
  {
    AppMethodBeat.i(91951);
    Log.isLoggable("LruBitmapPool", 3);
    p(0L);
    AppMethodBeat.o(91951);
  }

  @SuppressLint({"InlinedApi"})
  public final void trimMemory(int paramInt)
  {
    AppMethodBeat.i(91952);
    Log.isLoggable("LruBitmapPool", 3);
    if (paramInt >= 40)
    {
      mO();
      AppMethodBeat.o(91952);
    }
    while (true)
    {
      return;
      if ((paramInt >= 20) || (paramInt == 15))
        p(this.axz / 2L);
      AppMethodBeat.o(91952);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.k
 * JD-Core Version:    0.6.2
 */