package com.tencent.mm.at.a.b;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.c.m;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class f
  implements m
{
  private com.tencent.mm.a.f<String, Bitmap> fHm;
  private com.tencent.mm.a.f<String, Bitmap> fHn;

  public f()
  {
    AppMethodBeat.i(116089);
    this.fHm = new b(50, getClass());
    this.fHn = new b(10, getClass());
    AppMethodBeat.o(116089);
  }

  public final void c(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(116091);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed. key is null.");
      AppMethodBeat.o(116091);
    }
    while (true)
    {
      return;
      if (paramBitmap == null)
      {
        ab.w("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put failed.value is null.");
        AppMethodBeat.o(116091);
      }
      else
      {
        Bitmap localBitmap;
        long l;
        if ((paramBitmap != null) && ((paramBitmap instanceof Bitmap)))
        {
          localBitmap = (Bitmap)paramBitmap;
          if (Build.VERSION.SDK_INT >= 12)
            l = localBitmap.getByteCount();
        }
        while (true)
        {
          ab.d("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "[cpan] put key:%s,bitmap size:%d B newsize:%s", new Object[] { paramString, Long.valueOf(l), bo.ga(l) });
          if (l <= 524288L)
            break label160;
          this.fHn.put(paramString, paramBitmap);
          AppMethodBeat.o(116091);
          break;
          int i = localBitmap.getRowBytes();
          l = localBitmap.getHeight() * i;
          continue;
          l = 0L;
        }
        label160: this.fHm.put(paramString, paramBitmap);
        AppMethodBeat.o(116091);
      }
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(116092);
    Iterator localIterator;
    try
    {
      if (this.fHm == null)
        break label132;
      Object localObject1 = this.fHm.snapshot();
      if ((!((Map)localObject1).isEmpty()) && (((Map)localObject1).size() > 0))
      {
        localIterator = ((Map)localObject1).entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (Bitmap)((Map.Entry)localIterator.next()).getValue();
          if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
            ab.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s, not need", new Object[] { localObject1.toString() });
        }
      }
    }
    finally
    {
      AppMethodBeat.o(116092);
    }
    this.fHm.clear();
    label132: if (this.fHn != null)
    {
      Object localObject3 = this.fHn.snapshot();
      if ((!((Map)localObject3).isEmpty()) && (((Map)localObject3).size() > 0))
      {
        localIterator = ((Map)localObject3).entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject3 = (Bitmap)((Map.Entry)localIterator.next()).getValue();
          if ((localObject3 != null) && (!((Bitmap)localObject3).isRecycled()))
            ab.i("MicroMsg.imageloader.DefaultImageMemoryCacheListener", "recycle bitmap:%s. not need", new Object[] { localObject3.toString() });
        }
      }
      this.fHn.clear();
    }
    AppMethodBeat.o(116092);
  }

  public final Bitmap kR(String paramString)
  {
    AppMethodBeat.i(116090);
    if (!bo.isNullOrNil(paramString))
      if (this.fHm.get(paramString) == null)
      {
        paramString = (Bitmap)this.fHn.get(paramString);
        AppMethodBeat.o(116090);
      }
    while (true)
    {
      return paramString;
      paramString = (Bitmap)this.fHm.get(paramString);
      AppMethodBeat.o(116090);
      continue;
      paramString = null;
      AppMethodBeat.o(116090);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.b.f
 * JD-Core Version:    0.6.2
 */