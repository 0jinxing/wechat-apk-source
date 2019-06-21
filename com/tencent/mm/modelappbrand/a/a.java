package com.tencent.mm.modelappbrand.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.b;
import android.support.v4.a.a.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.ref.WeakReference;

public enum a
{
  private static volatile WeakReference<Bitmap> fpX;

  public static Drawable abQ()
  {
    AppMethodBeat.i(93748);
    if (fpX != null)
    {
      localObject = (Bitmap)fpX.get();
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()));
    }
    else
    {
      fpX = new WeakReference(com.tencent.mm.compatible.g.a.decodeResource(ah.getResources(), 2131231594));
    }
    Object localObject = d.a(ah.getResources(), (Bitmap)fpX.get());
    ((b)localObject).dA();
    AppMethodBeat.o(93748);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.a
 * JD-Core Version:    0.6.2
 */