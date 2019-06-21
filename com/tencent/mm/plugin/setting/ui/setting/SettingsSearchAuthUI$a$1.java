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

final class SettingsSearchAuthUI$a$1
  implements View.OnClickListener
{
  SettingsSearchAuthUI$a$1(SettingsSearchAuthUI.a parama, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127451);
    if (this.qoO.Cm(this.sN) != null)
    {
      paramView = new c(this.qoO.Cm(this.sN).csB, 2);
      if (SettingsSearchAuthUI.j(this.qoO.qoM) != null)
        SettingsSearchAuthUI.j(this.qoO.qoM).dismiss();
      g.Rg().a(paramView, 0);
      SettingsSearchAuthUI.a(this.qoO.qoM, h.b(this.qoO.qoM, this.qoO.qoM.getString(2131297043), true, new SettingsSearchAuthUI.a.1.1(this, paramView)));
    }
    AppMethodBeat.o(127451);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.a.1
 * JD-Core Version:    0.6.2
 */