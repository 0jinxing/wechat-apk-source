package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.t;
import com.tencent.mm.pluginsdk.ui.applet.t.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

final class SnsAdNativeLandingTestUI$1$1
  implements MMActivity.a
{
  SnsAdNativeLandingTestUI$1$1(SnsAdNativeLandingTestUI.1 param1)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(38701);
    if (paramInt2 == -1)
      if (paramIntent == null)
      {
        paramIntent = null;
        if ((paramIntent != null) && (paramIntent.length() != 0))
          break label50;
        ab.e("MicroMsg.Sns.SnsAdNativieLandingTestUI", "mmOnActivityResult fail, toUser is null");
        AppMethodBeat.o(38701);
      }
    while (true)
    {
      return;
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      break;
      label50: SnsAdNativeLandingTestUI localSnsAdNativeLandingTestUI = this.roY.roX;
      t.a.vlq.a(((MMActivity)localSnsAdNativeLandingTestUI).mController, "test title", "http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150", "test desc", true, localSnsAdNativeLandingTestUI.getResources().getString(2131297041), new SnsAdNativeLandingTestUI.1.1.1(this, paramIntent, localSnsAdNativeLandingTestUI));
      AppMethodBeat.o(38701);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.1.1
 * JD-Core Version:    0.6.2
 */