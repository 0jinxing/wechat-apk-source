package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a;

import android.support.v4.view.ViewPager.d;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements ViewPager.d
{
  public final void j(View paramView, float paramFloat)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(37654);
    float f2;
    if ((0.0F <= paramFloat) && (paramFloat <= 1.0F))
      f2 = 1.0F - paramFloat;
    while (true)
    {
      paramView.setAlpha(f2);
      paramView.setTranslationX(paramView.getWidth() * -paramFloat);
      paramView.setTranslationY(paramView.getHeight() * paramFloat);
      AppMethodBeat.o(37654);
      return;
      f2 = f1;
      if (-1.0F < paramFloat)
      {
        f2 = f1;
        if (paramFloat < 0.0F)
          f2 = paramFloat + 1.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a.a
 * JD-Core Version:    0.6.2
 */