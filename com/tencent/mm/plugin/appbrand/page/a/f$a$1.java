package com.tencent.mm.plugin.appbrand.page.a;

import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f$a$1
  implements Runnable
{
  f$a$1(f.a parama, Drawable paramDrawable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87353);
    this.ivp.mDrawable = this.fqj;
    if (f.a.a(this.ivp))
      this.ivp.ivo.q(this.ivp.mDrawable);
    AppMethodBeat.o(87353);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.a.f.a.1
 * JD-Core Version:    0.6.2
 */