package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;

final class SnsSettingIntroduceUI$1
  implements View.OnClickListener
{
  SnsSettingIntroduceUI$1(SnsSettingIntroduceUI paramSnsSettingIntroduceUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39242);
    h.pYm.e(14090, new Object[] { Integer.valueOf(3) });
    d.b(this.rwK, "sns", ".ui.SnsTimeLineUI", SnsSettingIntroduceUI.a(this.rwK));
    this.rwK.finish();
    this.rwK.overridePendingTransition(0, 0);
    AppMethodBeat.o(39242);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI.1
 * JD-Core Version:    0.6.2
 */