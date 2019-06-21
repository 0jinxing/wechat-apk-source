package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.LruCache;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class jv
{
  private LruCache<String, Bitmap> a;
  private Set<SoftReference<Bitmap>> b;
  private final float c;

  public jv(int paramInt)
  {
    AppMethodBeat.i(100128);
    this.c = 0.2F;
    a(paramInt);
    AppMethodBeat.o(100128);
  }

  private void a(int paramInt)
  {
    AppMethodBeat.i(100129);
    paramInt = Math.min(paramInt, (int)(0.2F * (float)Runtime.getRuntime().maxMemory()));
    if (Build.VERSION.SDK_INT >= 11)
      this.b = new HashSet();
    this.a = new jv.1(this, paramInt);
    AppMethodBeat.o(100129);
  }

  public int a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(100130);
    int i;
    if (Build.VERSION.SDK_INT >= 19)
    {
      i = paramBitmap.getAllocationByteCount();
      AppMethodBeat.o(100130);
    }
    while (true)
    {
      return i;
      if (Build.VERSION.SDK_INT >= 12)
      {
        i = paramBitmap.getByteCount();
        AppMethodBeat.o(100130);
      }
      else
      {
        i = paramBitmap.getRowBytes() * paramBitmap.getHeight();
        AppMethodBeat.o(100130);
      }
    }
  }

  public Bitmap a()
  {
    AppMethodBeat.i(100131);
    while (true)
    {
      try
      {
        if ((this.b != null) && (!this.b.isEmpty()))
        {
          Iterator localIterator = this.b.iterator();
          if (localIterator.hasNext())
          {
            Bitmap localBitmap = (Bitmap)((SoftReference)localIterator.next()).get();
            if ((localBitmap != null) && (localBitmap.isMutable()))
            {
              localIterator.remove();
              return localBitmap;
            }
            localIterator.remove();
            continue;
          }
        }
      }
      finally
      {
        AppMethodBeat.o(100131);
      }
      Object localObject2 = null;
    }
  }

  public Bitmap a(String paramString)
  {
    AppMethodBeat.i(100132);
    Bitmap localBitmap = null;
    if (this.a != null)
      localBitmap = (Bitmap)this.a.get(paramString);
    AppMethodBeat.o(100132);
    return localBitmap;
  }

  public void a(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(100133);
    if ((paramString == null) || (paramBitmap == null))
      AppMethodBeat.o(100133);
    while (true)
    {
      return;
      this.a.put(paramString, paramBitmap);
      AppMethodBeat.o(100133);
    }
  }

  public void b()
  {
    AppMethodBeat.i(100134);
    if (this.a != null)
      this.a.evictAll();
    AppMethodBeat.o(100134);
  }

  public void c()
  {
    AppMethodBeat.i(100135);
    this.a.evictAll();
    this.b.clear();
    this.a = null;
    this.b = null;
    AppMethodBeat.o(100135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jv
 * JD-Core Version:    0.6.2
 */