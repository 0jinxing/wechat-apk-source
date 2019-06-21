package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.m;
import java.util.List;

final class LoginHistoryUI$24
  implements View.OnClickListener
{
  LoginHistoryUI$24(LoginHistoryUI paramLoginHistoryUI, List paramList)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124931);
    LoginHistoryUI.a(this.gCv, ((m)this.gCz.get(0)).getItemId());
    AppMethodBeat.o(124931);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginHistoryUI.24
 * JD-Core Version:    0.6.2
 */