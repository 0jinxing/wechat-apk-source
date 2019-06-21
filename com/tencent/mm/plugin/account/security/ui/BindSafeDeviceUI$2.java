package com.tencent.mm.plugin.account.security.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.bind.ui.BindMContactUI;
import com.tencent.mm.ui.MMWizardActivity;

final class BindSafeDeviceUI$2
  implements View.OnClickListener
{
  BindSafeDeviceUI$2(BindSafeDeviceUI paramBindSafeDeviceUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(69859);
    paramView = new Intent();
    paramView.putExtra("bind_scene", 1);
    paramView.setClass(this.gzp, BindMContactUI.class);
    MMWizardActivity.J(this.gzp, paramView);
    AppMethodBeat.o(69859);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI.2
 * JD-Core Version:    0.6.2
 */