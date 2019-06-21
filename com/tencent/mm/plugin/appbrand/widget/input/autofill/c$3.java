package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.widget.input.ab;

final class c$3
  implements ViewTreeObserver.OnPreDrawListener
{
  c$3(c paramc, ListView paramListView, int paramInt)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(123900);
    this.jhT.getViewTreeObserver().removeOnPreDrawListener(this);
    c localc = this.jhS;
    if ((!localc.jhC.amH.isShowing()) || (localc.jhC.jhV == null) || (localc.jhC.jhV.getAdapter() == null) || (localc.jhC.jhV.getAdapter().getCount() <= 0));
    Object localObject;
    do
    {
      AppMethodBeat.o(123900);
      return true;
      localObject = localc.jhB.getInputPanel();
    }
    while (localObject == null);
    int i = a.fromDPToPix(localc.jhB.getContext(), 8);
    int j = localc.jhC.jhV.getChildAt(0).getHeight();
    int k = localc.jhC.jhV.getAdapter().getCount() * j;
    int m = k + i * 2;
    int n = j * 3 + i * 2;
    if (m > n)
      k = n - i * 2;
    while (true)
    {
      localc.jhC.aml = n;
      int[] arrayOfInt = new int[2];
      localc.jhB.getView().getLocationInWindow(arrayOfInt);
      n = arrayOfInt[1];
      n = localc.jhB.getView().getHeight() + n;
      ((View)localObject).getLocationInWindow(arrayOfInt);
      m = arrayOfInt[1];
      label243: if (((localc.jhQ == -2147483648) || (localc.jhQ >= 0 - i)) && (m - n >= k + i))
      {
        localc.jhC.amx = localc.jhB.getView();
        localc.jhC.aml = (i * 2 + k);
        localc.jhC.setVerticalOffset(0 - i);
        localc.jhC.show();
        localObject = localc.jhC;
        if (((AutoFillListPopupWindowBase)localObject).amp)
          break label514;
      }
      label313: for (k = 0; ; k = ((AutoFillListPopupWindowBase)localObject).amn)
      {
        localc.jhQ = k;
        break;
        if (n - localc.jhB.getView().getHeight() >= k)
        {
          localc.jhC.amx = localc.jhB.getView();
          localc.jhC.aml = (i * 2 + k);
          localc.jhC.setVerticalOffset(-(k + i) - localc.jhB.getView().getHeight());
          break label313;
        }
        if (k <= j)
        {
          localc.jhC.aml = j;
          localc.jhC.amx = localc.jhB.getView();
          if (localc.jhQ < 0 - i)
          {
            localc.jhC.setVerticalOffset(-(k + i) - localc.jhB.getView().getHeight());
            break label313;
          }
          localc.jhC.setVerticalOffset(0 - i);
          break label313;
        }
        k -= j;
        break label243;
      }
      label514: n = m;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.c.3
 * JD-Core Version:    0.6.2
 */