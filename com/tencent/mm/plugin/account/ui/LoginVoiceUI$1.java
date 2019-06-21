package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LoginVoiceUI$1
  implements View.OnClickListener
{
  LoginVoiceUI$1(LoginVoiceUI paramLoginVoiceUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125073);
    h.pYm.e(11557, new Object[] { Integer.valueOf(2) });
    paramView = new Intent();
    paramView.putExtra("Kusername", this.gDg.gCb);
    paramView.putExtra("kscene_type", 1);
    d.b(this.gDg.mController.ylL, "voiceprint", ".ui.VoiceLoginUI", paramView, 1024);
    AppMethodBeat.o(125073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginVoiceUI.1
 * JD-Core Version:    0.6.2
 */