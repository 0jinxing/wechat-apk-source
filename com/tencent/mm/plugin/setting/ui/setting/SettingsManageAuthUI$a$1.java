package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.model.c;
import com.tencent.mm.protocal.protobuf.cmb;
import com.tencent.mm.ui.base.h;

final class SettingsManageAuthUI$a$1
  implements View.OnClickListener
{
  SettingsManageAuthUI$a$1(SettingsManageAuthUI.a parama, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127253);
    if (this.qnx.Cm(this.sN) != null)
    {
      paramView = new c(this.qnx.Cm(this.sN).csB, 1);
      if (SettingsManageAuthUI.f(this.qnx.qnv) != null)
        SettingsManageAuthUI.f(this.qnx.qnv).dismiss();
      g.Rg().a(paramView, 0);
      SettingsManageAuthUI.a(this.qnx.qnv, h.b(this.qnx.qnv, this.qnx.qnv.getString(2131297043), true, new SettingsManageAuthUI.a.1.1(this, paramView)));
    }
    AppMethodBeat.o(127253);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI.a.1
 * JD-Core Version:    0.6.2
 */