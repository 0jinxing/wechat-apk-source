package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HardCoderSettingUI$3
  implements View.OnClickListener
{
  HardCoderSettingUI$3(HardCoderSettingUI paramHardCoderSettingUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34872);
    HardCoderSettingUI.a(this.zER, false);
    this.zER.showDialog(1);
    AppMethodBeat.o(34872);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.HardCoderSettingUI.3
 * JD-Core Version:    0.6.2
 */