package com.tencent.mm.plugin.product.ui;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class MallGalleryUI$1
  implements ViewPager.OnPageChangeListener
{
  MallGalleryUI$1(MallGalleryUI paramMallGalleryUI)
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
    AppMethodBeat.i(44035);
    ab.d("MicroMsg.MallGalleryUI", "Page Selected postion: %d", new Object[] { Integer.valueOf(paramInt) });
    MallGalleryUI.a(this.piy, paramInt);
    if (MallGalleryUI.a(this.piy))
    {
      this.piy.mController.hideTitleView();
      MallGalleryUI.b(this.piy);
    }
    AppMethodBeat.o(44035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallGalleryUI.1
 * JD-Core Version:    0.6.2
 */