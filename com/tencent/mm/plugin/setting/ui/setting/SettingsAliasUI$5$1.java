package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;

final class SettingsAliasUI$5$1
  implements Runnable
{
  SettingsAliasUI$5$1(SettingsAliasUI.5 param5, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127189);
    if (SettingsAliasUI.h(this.qmY.qmW) != null)
    {
      SettingsAliasUI.h(this.qmY.qmW).dismiss();
      SettingsAliasUI.i(this.qmY.qmW);
    }
    SettingsAliasUI.j(this.qmY.qmW);
    if (this.crb.getType() == 255)
      if ((this.crd == -3) && (this.crc == 4))
        break label137;
    label137: for (boolean bool = true; ; bool = false)
    {
      Intent localIntent = new Intent(this.qmY.qmW, SettingsAliasResultUI.class);
      localIntent.putExtra("has_pwd", bool);
      this.qmY.qmW.startActivity(localIntent);
      this.qmY.qmW.finish();
      AppMethodBeat.o(127189);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.5.1
 * JD-Core Version:    0.6.2
 */