package com.bumptech.glide.c.d.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.c.b.q;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class l
  implements q, u<BitmapDrawable>
{
  private final Resources aEH;
  private final u<Bitmap> aFB;

  private l(Resources paramResources, u<Bitmap> paramu)
  {
    AppMethodBeat.i(92243);
    this.aEH = ((Resources)i.d(paramResources, "Argument must not be null"));
    this.aFB = ((u)i.d(paramu, "Argument must not be null"));
    AppMethodBeat.o(92243);
  }

  public static u<BitmapDrawable> a(Resources paramResources, u<Bitmap> paramu)
  {
    AppMethodBeat.i(92242);
    if (paramu == null)
    {
      paramResources = null;
      AppMethodBeat.o(92242);
    }
    while (true)
    {
      return paramResources;
      paramResources = new l(paramResources, paramu);
      AppMethodBeat.o(92242);
    }
  }

  public final int getSize()
  {
    AppMethodBeat.i(92244);
    int i = this.aFB.getSize();
    AppMethodBeat.o(92244);
    return i;
  }

  public final void initialize()
  {
    AppMethodBeat.i(92246);
    if ((this.aFB instanceof q))
      ((q)this.aFB).initialize();
    AppMethodBeat.o(92246);
  }

  public final Class<BitmapDrawable> mK()
  {
    return BitmapDrawable.class;
  }

  public final void recycle()
  {
    AppMethodBeat.i(92245);
    this.aFB.recycle();
    AppMethodBeat.o(92245);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.l
 * JD-Core Version:    0.6.2
 */