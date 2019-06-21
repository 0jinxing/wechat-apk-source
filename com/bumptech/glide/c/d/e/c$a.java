package com.bumptech.glide.c.d.e;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a extends Drawable.ConstantState
{
  final g aGa;

  c$a(g paramg)
  {
    this.aGa = paramg;
  }

  public final int getChangingConfigurations()
  {
    return 0;
  }

  public final Drawable newDrawable()
  {
    AppMethodBeat.i(92314);
    c localc = new c(this);
    AppMethodBeat.o(92314);
    return localc;
  }

  public final Drawable newDrawable(Resources paramResources)
  {
    AppMethodBeat.i(92313);
    paramResources = newDrawable();
    AppMethodBeat.o(92313);
    return paramResources;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.c.a
 * JD-Core Version:    0.6.2
 */