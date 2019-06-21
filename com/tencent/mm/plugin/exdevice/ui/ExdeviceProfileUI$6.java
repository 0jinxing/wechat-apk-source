package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMPullDownView.d;

final class ExdeviceProfileUI$6
  implements MMPullDownView.d
{
  ExdeviceProfileUI$6(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final boolean bhl()
  {
    AppMethodBeat.i(20028);
    boolean bool;
    if (ExdeviceProfileUI.z(this.lCu).getFirstVisiblePosition() == 0)
    {
      View localView = ExdeviceProfileUI.z(this.lCu).getChildAt(ExdeviceProfileUI.z(this.lCu).getFirstVisiblePosition());
      if ((localView != null) && (localView.getTop() >= 0))
      {
        bool = true;
        AppMethodBeat.o(20028);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(20028);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.6
 * JD-Core Version:    0.6.2
 */