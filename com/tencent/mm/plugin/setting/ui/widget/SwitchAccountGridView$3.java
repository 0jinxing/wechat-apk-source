package com.tencent.mm.plugin.setting.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SwitchAccountGridView$3
  implements View.OnClickListener
{
  SwitchAccountGridView$3(SwitchAccountGridView paramSwitchAccountGridView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127704);
    ab.i("MicroMsg.SwitchAccountGridView", "click addBtn");
    if (SwitchAccountGridView.b(this.qrm) != null)
      SwitchAccountGridView.b(this.qrm).Wy(null);
    AppMethodBeat.o(127704);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.3
 * JD-Core Version:    0.6.2
 */