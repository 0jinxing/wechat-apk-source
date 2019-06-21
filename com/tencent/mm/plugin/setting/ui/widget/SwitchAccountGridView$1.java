package com.tencent.mm.plugin.setting.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SwitchAccountGridView$1
  implements View.OnClickListener
{
  SwitchAccountGridView$1(SwitchAccountGridView paramSwitchAccountGridView, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127702);
    ab.i("MicroMsg.SwitchAccountGridView", "click %s", new Object[] { this.qrl });
    if ((!SwitchAccountGridView.a(this.qrm)) && (SwitchAccountGridView.b(this.qrm) != null))
      SwitchAccountGridView.b(this.qrm).Wy(this.qrl);
    AppMethodBeat.o(127702);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.1
 * JD-Core Version:    0.6.2
 */