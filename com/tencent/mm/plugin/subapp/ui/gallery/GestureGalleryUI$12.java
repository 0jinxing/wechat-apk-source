package com.tencent.mm.plugin.subapp.ui.gallery;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.b;

final class GestureGalleryUI$12
  implements MMGestureGallery.b
{
  GestureGalleryUI$12(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  public final void aa(float paramFloat1, float paramFloat2)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(25392);
    float f2 = 1.0F - paramFloat2 / GestureGalleryUI.a(this.sum).getHeight();
    if (f2 > 1.0F)
    {
      f2 = f1;
      ab.d("MicroMsg.GestureGalleryUI", "onGalleryScale tx: %f, ty: %f, scale: %f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Float.valueOf(f2) });
      GestureGalleryUI.a(this.sum, f2);
      View localView = GestureGalleryUI.f(this.sum).cDI();
      if (localView == null)
        break label179;
      localView.setPivotX(GestureGalleryUI.a(this.sum).getWidth() / 2);
      localView.setPivotY(GestureGalleryUI.a(this.sum).getHeight() / 2);
      localView.setScaleX(f2);
      localView.setScaleY(f2);
      localView.setTranslationX(paramFloat1);
      localView.setTranslationY(paramFloat2);
      GestureGalleryUI.h(this.sum).setAlpha(f2);
      AppMethodBeat.o(25392);
    }
    while (true)
    {
      return;
      break;
      label179: ab.d("MicroMsg.GestureGalleryUI", "runDragAnimation contentView is null !!");
      AppMethodBeat.o(25392);
    }
  }

  public final void ab(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(25393);
    GestureGalleryUI.a(this.sum, (int)paramFloat1);
    GestureGalleryUI.b(this.sum, (int)paramFloat2);
    AppMethodBeat.o(25393);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.12
 * JD-Core Version:    0.6.2
 */