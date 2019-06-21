package com.tencent.mm.modelappbrand.a;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

public final class b$c
  implements b.j
{
  final f<String, Reference<Bitmap>> fqo;

  public b$c()
  {
    AppMethodBeat.i(77329);
    this.fqo = new b.c.1(this);
    AppMethodBeat.o(77329);
  }

  public final void c(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(77331);
    if ((bo.isNullOrNil(paramString)) || (paramBitmap == null))
      AppMethodBeat.o(77331);
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrandSimpleImageLoader.DefaultMemoryCache", "put, key %s, bmp %s", new Object[] { paramString, paramBitmap });
      this.fqo.put(paramString, new SoftReference(paramBitmap));
      AppMethodBeat.o(77331);
    }
  }

  public final void f(Bitmap paramBitmap)
  {
    AppMethodBeat.i(77332);
    ab.d("MicroMsg.AppBrandSimpleImageLoader.DefaultMemoryCache", "release, bmp %s", new Object[] { paramBitmap });
    if (paramBitmap != null)
      paramBitmap.isRecycled();
    AppMethodBeat.o(77332);
  }

  public final Bitmap kR(String paramString)
  {
    AppMethodBeat.i(77330);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(77330);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Object localObject = (Reference)this.fqo.get(paramString);
      if (localObject == null)
      {
        AppMethodBeat.o(77330);
        paramString = null;
      }
      else
      {
        localObject = (Bitmap)((Reference)localObject).get();
        if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
        {
          this.fqo.remove(paramString);
          AppMethodBeat.o(77330);
          paramString = null;
        }
        else
        {
          AppMethodBeat.o(77330);
          paramString = (String)localObject;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.c
 * JD-Core Version:    0.6.2
 */