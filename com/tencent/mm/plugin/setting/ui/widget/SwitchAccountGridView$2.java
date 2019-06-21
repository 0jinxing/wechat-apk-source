package com.tencent.mm.plugin.setting.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SwitchAccountGridView$2
  implements View.OnClickListener
{
  SwitchAccountGridView$2(SwitchAccountGridView paramSwitchAccountGridView, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127703);
    if (SwitchAccountGridView.c(this.qrm) != null)
      SwitchAccountGridView.c(this.qrm).Wz(this.qrl);
    AppMethodBeat.o(127703);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.2
 * JD-Core Version:    0.6.2
 */