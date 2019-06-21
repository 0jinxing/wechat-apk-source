package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ar;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.h;
import com.tencent.mm.ui.q;

final class SnsSettingIntroduceUI$2
  implements View.OnClickListener
{
  SnsSettingIntroduceUI$2(SnsSettingIntroduceUI paramSnsSettingIntroduceUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39243);
    paramView = new ar();
    paramView.ctN.index = 3;
    a.xxA.m(paramView);
    paramView = new Intent();
    d.b(this.rwK.mController.ylL, "setting", ".ui.setting.SettingsUI", paramView);
    paramView = new Intent();
    paramView.putExtra("enter_scene", e.h.yga);
    d.b(this.rwK.mController.ylL, "setting", ".ui.setting.SettingsPrivacyUI", paramView);
    h.pYm.e(14090, new Object[] { Integer.valueOf(2) });
    this.rwK.finish();
    AppMethodBeat.o(39243);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI.2
 * JD-Core Version:    0.6.2
 */