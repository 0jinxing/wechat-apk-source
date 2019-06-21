package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class LoginFaceUI extends LoginHistoryUI
{
  protected final void aqU()
  {
    int i = -1;
    AppMethodBeat.i(124912);
    super.aqU();
    aqV();
    com.tencent.mm.modelsimple.q localq = new com.tencent.mm.modelsimple.q(this.gCb, this.gCk, "", 0);
    int j;
    String str;
    if (this.gCk == null)
    {
      j = -1;
      str = bo.anv(this.gCk);
      if (this.gBT.guf != null)
        break label162;
    }
    while (true)
    {
      ab.d("MicroMsg.LoginFaceUI", "summerauth mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", new Object[] { Integer.valueOf(j), str, Integer.valueOf(i), bo.anv(this.gBT.guf) });
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131301031), true, new LoginFaceUI.2(this, localq));
      g.Rg().a(localq, 0);
      AppMethodBeat.o(124912);
      return;
      j = this.gCk.length();
      break;
      label162: i = this.gBT.guf.length();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124911);
    super.onCreate(paramBundle);
    if (this.gCl)
      AppMethodBeat.o(124911);
    while (true)
    {
      return;
      this.gwX = 4;
      this.gCg.setVisibility(0);
      this.gBN.setVisibility(0);
      findViewById(2131825309).setEnabled(false);
      ((TextView)findViewById(2131825310)).setTextColor(getResources().getColorStateList(2131690780));
      ((TextView)findViewById(2131825310)).setBackgroundResource(getResources().getColor(2131690597));
      this.gBN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(124909);
          com.tencent.mm.plugin.report.service.h.pYm.e(11557, new Object[] { Integer.valueOf(2) });
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("k_user_name", LoginFaceUI.this.gCb);
          paramAnonymousView.putExtra("k_purpose", 2);
          paramAnonymousView.putExtra("k_need_signature", true);
          d.b(LoginFaceUI.this.mController.ylL, "facedetect", ".ui.FaceDetectUI", paramAnonymousView, 1025);
          AppMethodBeat.o(124909);
        }
      });
      AppMethodBeat.o(124911);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginFaceUI
 * JD-Core Version:    0.6.2
 */