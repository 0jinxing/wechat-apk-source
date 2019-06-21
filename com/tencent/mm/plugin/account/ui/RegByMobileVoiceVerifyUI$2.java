package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByMobileVoiceVerifyUI$2
  implements View.OnClickListener
{
  RegByMobileVoiceVerifyUI$2(RegByMobileVoiceVerifyUI paramRegByMobileVoiceVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125462);
    this.gGS.startActivityForResult(new Intent(this.gGS, RegByMobileVoiceVerifySelectUI.class).putExtra("voice_verify_code", RegByMobileVoiceVerifyUI.a(this.gGS)), 10000);
    AppMethodBeat.o(125462);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI.2
 * JD-Core Version:    0.6.2
 */