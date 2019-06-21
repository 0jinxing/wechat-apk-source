package com.tencent.mm.plugin.scanner.ui;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPageControlView;

final class ProductFurtherInfoUI$4
  implements ViewPager.OnPageChangeListener
{
  ProductFurtherInfoUI$4(ProductFurtherInfoUI paramProductFurtherInfoUI)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(81047);
    if (ProductFurtherInfoUI.b(this.qcF).getParent() != null)
      ProductFurtherInfoUI.b(this.qcF).getParent().requestDisallowInterceptTouchEvent(true);
    ProductFurtherInfoUI.c(this.qcF).setPage(paramInt);
    AppMethodBeat.o(81047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI.4
 * JD-Core Version:    0.6.2
 */