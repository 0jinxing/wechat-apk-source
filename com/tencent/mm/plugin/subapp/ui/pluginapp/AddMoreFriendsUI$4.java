package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class AddMoreFriendsUI$4
  implements View.OnClickListener
{
  AddMoreFriendsUI$4(AddMoreFriendsUI paramAddMoreFriendsUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(25507);
    h.pYm.e(11264, new Object[] { Integer.valueOf(1) });
    paramView = new Intent();
    paramView.setClassName(this.svf, "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI");
    this.svf.mController.ylL.startActivity(paramView);
    AppMethodBeat.o(25507);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI.4
 * JD-Core Version:    0.6.2
 */