package com.tencent.mm.plugin.appbrand.page.a;

import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;

public final class f$a
  implements c.a
{
  CharSequence IV = null;
  Drawable mDrawable = null;

  protected f$a(f paramf)
  {
  }

  public final void dismiss()
  {
    AppMethodBeat.i(87362);
    m.runOnUiThread(new f.a.5(this));
    AppMethodBeat.o(87362);
  }

  public final void pE(int paramInt)
  {
    AppMethodBeat.i(87361);
    m.runOnUiThread(new f.a.4(this, paramInt));
    AppMethodBeat.o(87361);
  }

  public final void setDescription(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(87360);
    m.runOnUiThread(new f.a.3(this, paramCharSequence));
    AppMethodBeat.o(87360);
  }

  public final void setLogo(int paramInt)
  {
    AppMethodBeat.i(87359);
    m.runOnUiThread(new f.a.2(this, paramInt));
    AppMethodBeat.o(87359);
  }

  public final void setLogo(Drawable paramDrawable)
  {
    AppMethodBeat.i(87358);
    m.runOnUiThread(new f.a.1(this, paramDrawable));
    AppMethodBeat.o(87358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.a.f.a
 * JD-Core Version:    0.6.2
 */