package com.tencent.mm.ui.chatting.gallery;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.b;

final class TranslationResultUI$4
  implements MMGestureGallery.b
{
  TranslationResultUI$4(TranslationResultUI paramTranslationResultUI)
  {
  }

  public final void aa(float paramFloat1, float paramFloat2)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(138648);
    float f2 = 1.0F - paramFloat2 / TranslationResultUI.e(this.yYi).getHeight();
    if (f2 > 1.0F)
    {
      f2 = f1;
      ab.d("MicroMsg.TranslationResultUI", "onGalleryScale tx: %f, ty: %f, scale: %f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Float.valueOf(f2) });
      if (TranslationResultUI.f(this.yYi) == null)
        break label228;
      if ((paramFloat1 != 0.0F) || (paramFloat2 != 0.0F))
        break label213;
      TranslationResultUI.g(this.yYi).setVisibility(0);
      label100: TranslationResultUI.f(this.yYi).setPivotX(TranslationResultUI.e(this.yYi).getWidth() / 2);
      TranslationResultUI.f(this.yYi).setPivotY(TranslationResultUI.e(this.yYi).getHeight() / 2);
      TranslationResultUI.f(this.yYi).setScaleX(f2);
      TranslationResultUI.f(this.yYi).setScaleY(f2);
      TranslationResultUI.f(this.yYi).setTranslationX(paramFloat1);
      TranslationResultUI.f(this.yYi).setTranslationY(paramFloat2);
      TranslationResultUI.h(this.yYi).setAlpha(f2);
      AppMethodBeat.o(138648);
    }
    while (true)
    {
      return;
      break;
      label213: TranslationResultUI.g(this.yYi).setVisibility(8);
      break label100;
      label228: ab.d("MicroMsg.TranslationResultUI", "runDragAnimation contentView is null !!");
      AppMethodBeat.o(138648);
    }
  }

  public final void ab(float paramFloat1, float paramFloat2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.TranslationResultUI.4
 * JD-Core Version:    0.6.2
 */