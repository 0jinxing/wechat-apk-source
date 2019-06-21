package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.LruCache;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.SoftReference;
import java.util.Set;

class jv$1 extends LruCache<String, Bitmap>
{
  jv$1(jv paramjv, int paramInt)
  {
    super(paramInt);
  }

  protected int a(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(100124);
    int i = this.a.a(paramBitmap);
    AppMethodBeat.o(100124);
    return i;
  }

  protected void a(boolean paramBoolean, String arg2, Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    AppMethodBeat.i(100125);
    if (Build.VERSION.SDK_INT >= 11);
    while (true)
    {
      synchronized (this.a)
      {
        paramBitmap2 = jv.a(this.a);
        SoftReference localSoftReference = new java/lang/ref/SoftReference;
        localSoftReference.<init>(paramBitmap1);
        paramBitmap2.add(localSoftReference);
        AppMethodBeat.o(100125);
        return;
      }
      AppMethodBeat.o(100125);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.jv.1
 * JD-Core Version:    0.6.2
 */