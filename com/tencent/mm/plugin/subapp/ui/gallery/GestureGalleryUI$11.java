package com.tencent.mm.plugin.subapp.ui.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.tools.e.b;

final class GestureGalleryUI$11
  implements e.b
{
  GestureGalleryUI$11(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(25391);
    GestureGalleryUI.g(this.sum).post(new GestureGalleryUI.11.2(this));
    GestureGalleryUI.a(this.sum, false);
    AppMethodBeat.o(25391);
  }

  public final void onAnimationStart()
  {
    AppMethodBeat.i(25390);
    GestureGalleryUI.a(this.sum, true);
    GestureGalleryUI.g(this.sum).postDelayed(new GestureGalleryUI.11.1(this), 20L);
    AppMethodBeat.o(25390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.11
 * JD-Core Version:    0.6.2
 */