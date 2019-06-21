package com.bumptech.glide.c.d.f;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.d.a.l;
import com.bumptech.glide.c.j;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
  implements e<Bitmap, BitmapDrawable>
{
  private final Resources aEH;

  public b(Resources paramResources)
  {
    AppMethodBeat.i(92361);
    this.aEH = ((Resources)i.d(paramResources, "Argument must not be null"));
    AppMethodBeat.o(92361);
  }

  public final u<BitmapDrawable> a(u<Bitmap> paramu, j paramj)
  {
    AppMethodBeat.i(92362);
    paramu = l.a(this.aEH, paramu);
    AppMethodBeat.o(92362);
    return paramu;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.f.b
 * JD-Core Version:    0.6.2
 */