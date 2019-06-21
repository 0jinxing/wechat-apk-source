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

final class SnsTransparentUI$1
  implements MMActivity.a
{
  SnsTransparentUI$1(SnsTransparentUI paramSnsTransparentUI, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39633);
    if (paramInt2 == -1)
      if (paramIntent == null)
      {
        paramIntent = null;
        if ((paramIntent != null) && (paramIntent.length() != 0))
          break label57;
        ab.e("SnsTransparentUI", "mmOnActivityResult fail, toUser is null");
        this.rBH.finish();
        AppMethodBeat.o(39633);
      }
    while (true)
    {
      return;
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      break;
      label57: ab.i("SnsTransparentUI", "doTransimt snsAdNativeLadingPagesUI is ok");
      String str = this.rBB;
      SnsTransparentUI localSnsTransparentUI = this.rBH;
      t.a.vlq.a(((MMActivity)localSnsTransparentUI).mController, this.rBC, this.rBD, this.rBE, true, localSnsTransparentUI.getResources().getString(2131297041), new SnsTransparentUI.1.1(this, str, localSnsTransparentUI, paramIntent));
      AppMethodBeat.o(39633);
      continue;
      this.rBH.finish();
      AppMethodBeat.o(39633);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTransparentUI.1
 * JD-Core Version:    0.6.2
 */