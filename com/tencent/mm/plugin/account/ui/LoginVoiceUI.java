package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

public class LoginVoiceUI extends LoginHistoryUI
{
  protected final void aqU()
  {
    int i = -1;
    AppMethodBeat.i(125076);
    super.aqU();
    aqV();
    q localq = new q(this.gCb, this.gCk, "", 0);
    localq.tr(this.gCk);
    int j;
    String str;
    if (this.gCk == null)
    {
      j = -1;
      str = bo.anv(this.gCk);
      if (this.gBT.guf != null)
        break label170;
    }
    while (true)
    {
      ab.d("MicroMsg.LoginVoiceUI", "summerauth mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", new Object[] { Integer.valueOf(j), str, Integer.valueOf(i), bo.anv(this.gBT.guf) });
      getString(2131297061);
      this.ehJ = h.b(this, getString(2131301031), true, new LoginVoiceUI.2(this, localq));
      g.Rg().a(localq, 0);
      AppMethodBeat.o(125076);
      return;
      j = this.gCk.length();
      break;
      label170: i = this.gBT.guf.length();
    }
  }

  public final boolean aqY()
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125075);
    super.onCreate(paramBundle);
    if (this.gCl)
      AppMethodBeat.o(125075);
    while (true)
    {
      return;
      this.gwX = 1;
      this.gCe.setVisibility(0);
      this.gBM.setVisibility(0);
      paramBundle = (LinearLayout.LayoutParams)this.gBL.getLayoutParams();
      paramBundle.gravity = 1;
      paramBundle.leftMargin = 0;
      this.gBL.setLayoutParams(paramBundle);
      findViewById(2131825304).setEnabled(false);
      ((TextView)findViewById(2131825305)).setTextColor(getResources().getColorStateList(2131690780));
      ((TextView)findViewById(2131825305)).setBackgroundResource(getResources().getColor(2131690597));
      this.gBM.setOnClickListener(new LoginVoiceUI.1(this));
      AppMethodBeat.o(125075);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginVoiceUI
 * JD-Core Version:    0.6.2
 */