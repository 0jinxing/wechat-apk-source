package com.tencent.mm.graphics.ui;

import android.graphics.Bitmap;
import com.davemorrissey.labs.subscaleview.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class WxBaseImageView$3
  implements b
{
  WxBaseImageView$3(WxBaseImageView paramWxBaseImageView, b paramb)
  {
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(57106);
    WxBaseImageView.a(this.eDu, paramc);
    if (this.eDv != null)
      this.eDv.a(paramc);
    AppMethodBeat.o(57106);
  }

  public final void b(c paramc)
  {
    AppMethodBeat.i(57107);
    WxBaseImageView.b(this.eDu, paramc);
    if (this.eDv != null)
      this.eDv.b(paramc);
    AppMethodBeat.o(57107);
  }

  public final void c(c paramc)
  {
    AppMethodBeat.i(57108);
    WxBaseImageView.b(this.eDu, paramc);
    if (this.eDv != null)
      this.eDv.c(paramc);
    AppMethodBeat.o(57108);
  }

  public final void l(Bitmap paramBitmap)
  {
    AppMethodBeat.i(57105);
    WxBaseImageView.e(this.eDu);
    if (this.eDv != null)
      this.eDv.l(paramBitmap);
    AppMethodBeat.o(57105);
  }

  public final void oL()
  {
    AppMethodBeat.i(57104);
    WxBaseImageView.d(this.eDu);
    if (this.eDv != null)
      this.eDv.oL();
    AppMethodBeat.o(57104);
  }

  public final void oM()
  {
    AppMethodBeat.i(57109);
    ab.i("MicroMsg.WxBaseImageView", "alvinluo onPreviewReleased");
    if (this.eDv != null)
      this.eDv.oM();
    AppMethodBeat.o(57109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.graphics.ui.WxBaseImageView.3
 * JD-Core Version:    0.6.2
 */