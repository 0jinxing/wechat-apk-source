package com.tencent.mm.plugin.subapp.ui.gallery;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class GestureGalleryUI$11$1
  implements Runnable
{
  GestureGalleryUI$11$1(GestureGalleryUI.11 param11)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25388);
    View localView = GestureGalleryUI.f(this.sup.sum).cDI();
    if ((localView instanceof MultiTouchImageView))
      ((MultiTouchImageView)localView).dzA();
    AppMethodBeat.o(25388);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.11.1
 * JD-Core Version:    0.6.2
 */