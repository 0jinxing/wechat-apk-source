package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.b.a;
import com.tencent.mm.ui.base.n.d;

final class MobileVerifyUI$8$2
  implements n.d
{
  MobileVerifyUI$8$2(MobileVerifyUI.8 param8)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(125274);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(125274);
    case 0:
      while (true)
      {
        return;
        MobileVerifyUI.g(this.gFs.gFn);
        AppMethodBeat.o(125274);
      }
    case 1:
    }
    this.gFs.gFn.aqX();
    if (MobileVerifyUI.f(this.gFs.gFn) == 2)
      a.wA("R200_500");
    while (true)
    {
      paramMenuItem = new Intent(this.gFs.gFn, RegByMobileVoiceVerifyUI.class);
      Bundle localBundle = new Bundle();
      localBundle.putString("bindmcontact_mobile", this.gFs.gFn.cFl);
      localBundle.putInt("voice_verify_type", MobileVerifyUI.h(this.gFs.gFn));
      paramMenuItem.putExtras(localBundle);
      this.gFs.gFn.startActivity(paramMenuItem);
      break;
      if (MobileVerifyUI.f(this.gFs.gFn) == 3)
        a.wA("F200_300");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI.8.2
 * JD-Core Version:    0.6.2
 */