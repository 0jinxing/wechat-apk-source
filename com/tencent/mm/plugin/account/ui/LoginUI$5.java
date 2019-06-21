package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LoginUI$5
  implements View.OnClickListener
{
  LoginUI$5(LoginUI paramLoginUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125030);
    Intent localIntent = new Intent(this.gDe, MobileInputUI.class);
    paramView = new int[5];
    paramView[0] = 2;
    localIntent.putExtra("mobile_input_purpose", 1);
    localIntent.putExtra("kv_report_login_method_data", paramView);
    localIntent.putExtra("from_switch_account", LoginUI.f(this.gDe));
    this.gDe.startActivity(localIntent);
    this.gDe.finish();
    AppMethodBeat.o(125030);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.5
 * JD-Core Version:    0.6.2
 */