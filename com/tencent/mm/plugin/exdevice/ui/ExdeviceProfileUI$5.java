package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.c;

final class ExdeviceProfileUI$5
  implements MMPullDownView.c
{
  ExdeviceProfileUI$5(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final boolean bhm()
  {
    AppMethodBeat.i(20027);
    View localView = ExdeviceProfileUI.z(this.lCu).getChildAt(ExdeviceProfileUI.z(this.lCu).getChildCount() - 1);
    int i = ExdeviceProfileUI.z(this.lCu).getAdapter().getCount();
    boolean bool;
    if ((i > 0) && (localView != null) && (localView.getBottom() <= ExdeviceProfileUI.z(this.lCu).getHeight()) && (ExdeviceProfileUI.z(this.lCu).getLastVisiblePosition() >= i - 1))
    {
      bool = true;
      AppMethodBeat.o(20027);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(20027);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.5
 * JD-Core Version:    0.6.2
 */