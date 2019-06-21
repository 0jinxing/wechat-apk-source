package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.x;
import com.tencent.mm.model.aw;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

@com.tencent.mm.ui.base.a(3)
public class AccountDeletedAlphaAlertUI extends MMActivity
{
  private static AccountDeletedAlphaAlertUI zzW = null;

  public static AccountDeletedAlphaAlertUI dJp()
  {
    return zzW;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34741);
    super.onCreate(paramBundle);
    zzW = this;
    paramBundle = new x();
    com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
    aw.hold();
    paramBundle = com.tencent.mm.h.a.jY(getIntent().getStringExtra("errmsg"));
    if (paramBundle != null)
    {
      paramBundle.a(this, new AccountDeletedAlphaAlertUI.1(this), null);
      AppMethodBeat.o(34741);
    }
    while (true)
    {
      return;
      h.a(this, getString(2131301293), null, false, new AccountDeletedAlphaAlertUI.2(this));
      AppMethodBeat.o(34741);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34742);
    if (equals(zzW))
      zzW = null;
    super.onDestroy();
    AppMethodBeat.o(34742);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI
 * JD-Core Version:    0.6.2
 */