package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMListPopupWindow$2
  implements AdapterView.OnItemSelectedListener
{
  MMListPopupWindow$2(MMListPopupWindow paramMMListPopupWindow)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112506);
    if (paramInt != -1)
    {
      paramAdapterView = MMListPopupWindow.a(this.yvN);
      if (paramAdapterView != null)
        MMListPopupWindow.a.a(paramAdapterView, false);
    }
    AppMethodBeat.o(112506);
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMListPopupWindow.2
 * JD-Core Version:    0.6.2
 */