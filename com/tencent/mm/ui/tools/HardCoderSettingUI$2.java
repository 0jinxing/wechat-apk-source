package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HardCoderSettingUI$2
  implements View.OnClickListener
{
  HardCoderSettingUI$2(HardCoderSettingUI paramHardCoderSettingUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34871);
    HardCoderSettingUI.a(this.zER, true);
    this.zER.showDialog(1);
    AppMethodBeat.o(34871);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.HardCoderSettingUI.2
 * JD-Core Version:    0.6.2
 */