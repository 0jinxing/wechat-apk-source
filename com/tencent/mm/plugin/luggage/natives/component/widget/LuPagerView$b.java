package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.support.v4.view.ViewPager.d;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuPagerView$b
  implements ViewPager.d
{
  private LuPagerView$b(LuPagerView paramLuPagerView)
  {
  }

  public final void j(View paramView, float paramFloat)
  {
    AppMethodBeat.i(116892);
    if (paramFloat >= -1.0F)
      if (paramFloat <= 0.0F)
      {
        paramView.setTranslationX(paramView.getWidth() * -paramFloat);
        paramView.setTranslationY(paramView.getHeight() * paramFloat);
        AppMethodBeat.o(116892);
      }
    while (true)
    {
      return;
      if (paramFloat <= 1.0F)
      {
        paramView.setTranslationX(paramView.getWidth() * -paramFloat);
        paramView.setTranslationY(0.0F);
      }
      AppMethodBeat.o(116892);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.LuPagerView.b
 * JD-Core Version:    0.6.2
 */