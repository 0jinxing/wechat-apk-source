package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.Gallery;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.b;

final class SnsBrowseUI$6
  implements MMGestureGallery.b
{
  SnsBrowseUI$6(SnsBrowseUI paramSnsBrowseUI, Gallery paramGallery)
  {
  }

  public final void aa(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(38757);
    if (((SnsBrowseUI.f(this.rpC) == 0) || (SnsBrowseUI.g(this.rpC) == 0)) && (this.rpC.rpp != null))
    {
      SnsBrowseUI.b(this.rpC, this.rpC.rpp.getHeight());
      SnsBrowseUI.a(this.rpC, this.rpC.rpp.getWidth());
    }
    if (SnsBrowseUI.f(this.rpC) != 0)
    {
      float f1 = 1.0F - paramFloat2 / SnsBrowseUI.f(this.rpC);
      float f2 = f1;
      if (f1 > 1.0F)
        f2 = 1.0F;
      SnsBrowseUI.a(this.rpC, f2);
      View localView = ((MMGestureGallery)this.rpG).getSelectedView();
      if ((localView instanceof MultiTouchImageView))
      {
        localView.setPivotX(SnsBrowseUI.g(this.rpC) / 2);
        localView.setPivotY(SnsBrowseUI.f(this.rpC) / 2);
        localView.setScaleX(f2);
        localView.setScaleY(f2);
        localView.setTranslationX(paramFloat1);
        localView.setTranslationY(paramFloat2);
        SnsBrowseUI.d(this.rpC).setAlpha(f2);
      }
    }
    AppMethodBeat.o(38757);
  }

  public final void ab(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(38758);
    SnsBrowseUI.e(this.rpC, (int)paramFloat1);
    SnsBrowseUI.f(this.rpC, (int)paramFloat2);
    AppMethodBeat.o(38758);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsBrowseUI.6
 * JD-Core Version:    0.6.2
 */