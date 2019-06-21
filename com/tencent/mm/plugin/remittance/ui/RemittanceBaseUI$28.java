package com.tencent.mm.plugin.remittance.ui;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class RemittanceBaseUI$28
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  RemittanceBaseUI$28(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final void onGlobalLayout()
  {
    AppMethodBeat.i(44859);
    int i = ((WindowManager)this.pRX.getSystemService("window")).getDefaultDisplay().getHeight();
    int[] arrayOfInt = new int[2];
    int j;
    int k;
    int m;
    if (RemittanceBaseUI.e(this.pRX).getTag(RemittanceBaseUI.e(this.pRX).getId()) == null)
    {
      RemittanceBaseUI.e(this.pRX).getLocationOnScreen(arrayOfInt);
      RemittanceBaseUI.e(this.pRX).setTag(RemittanceBaseUI.e(this.pRX).getId(), arrayOfInt);
      j = arrayOfInt[1];
      k = RemittanceBaseUI.e(this.pRX).getMeasuredHeight();
      m = a.fromDPToPix(this.pRX, 40);
      if (RemittanceBaseUI.f(this.pRX).getVisibility() != 0)
        break label323;
    }
    label323: for (int n = RemittanceBaseUI.g(this.pRX).getMeasuredHeight(); ; n = 0)
    {
      n = a.fromDPToPix(this.pRX, 96) + n;
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)RemittanceBaseUI.h(this.pRX).getLayoutParams();
      if (i - (m + (j + k)) >= RemittanceBaseUI.h(this.pRX).getMeasuredHeight() + n);
      for (localMarginLayoutParams.topMargin = (i - n - RemittanceBaseUI.h(this.pRX).getMeasuredHeight() - arrayOfInt[1] - RemittanceBaseUI.e(this.pRX).getMeasuredHeight()); ; localMarginLayoutParams.topMargin = a.fromDPToPix(this.pRX, 40))
      {
        localMarginLayoutParams.bottomMargin = a.fromDPToPix(this.pRX, 96);
        RemittanceBaseUI.h(this.pRX).setLayoutParams(localMarginLayoutParams);
        RemittanceBaseUI.h(this.pRX).setVisibility(0);
        RemittanceBaseUI.h(this.pRX).requestLayout();
        AppMethodBeat.o(44859);
        return;
        arrayOfInt = (int[])RemittanceBaseUI.e(this.pRX).getTag(RemittanceBaseUI.e(this.pRX).getId());
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.28
 * JD-Core Version:    0.6.2
 */