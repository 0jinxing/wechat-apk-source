package com.tencent.mm.plugin.mall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class MallIndexUI$12
  implements View.OnClickListener
{
  MallIndexUI$12(MallIndexUI paramMallIndexUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43217);
    ab.i("MicorMsg.MallIndexUI", "click settings btn");
    d.H(this.onu.mController.ylL, "mall", ".ui.MallFunctionSettingsUI");
    AppMethodBeat.o(43217);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI.12
 * JD-Core Version:    0.6.2
 */