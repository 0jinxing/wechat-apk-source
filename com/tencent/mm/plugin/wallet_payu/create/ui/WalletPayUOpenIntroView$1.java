package com.tencent.mm.plugin.wallet_payu.create.ui;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMAutoHeightViewPager;
import com.tencent.mm.ui.base.MMPageControlView;

final class WalletPayUOpenIntroView$1
  implements ViewPager.OnPageChangeListener
{
  WalletPayUOpenIntroView$1(WalletPayUOpenIntroView paramWalletPayUOpenIntroView)
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
    AppMethodBeat.i(48389);
    if (WalletPayUOpenIntroView.a(this.tTn).getParent() != null)
      WalletPayUOpenIntroView.a(this.tTn).getParent().requestDisallowInterceptTouchEvent(true);
    WalletPayUOpenIntroView.b(this.tTn).setPage(paramInt);
    AppMethodBeat.o(48389);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView.1
 * JD-Core Version:    0.6.2
 */