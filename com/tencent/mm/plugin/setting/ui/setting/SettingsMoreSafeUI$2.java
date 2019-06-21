package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.model.d;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.q;

final class SettingsMoreSafeUI$2
  implements h.b
{
  SettingsMoreSafeUI$2(SettingsMoreSafeUI paramSettingsMoreSafeUI)
  {
  }

  public final boolean s(CharSequence paramCharSequence)
  {
    boolean bool = false;
    AppMethodBeat.i(127326);
    if (!bo.amW(paramCharSequence.toString()))
    {
      h.bQ(this.qob.mController.ylL, this.qob.getString(2131304231));
      AppMethodBeat.o(127326);
    }
    while (true)
    {
      return bool;
      b.gkF.BS();
      final d locald = new d(d.gyK, paramCharSequence.toString());
      g.Rg().a(locald, 0);
      paramCharSequence = this.qob;
      AppCompatActivity localAppCompatActivity = this.qob.mController.ylL;
      this.qob.getString(2131297061);
      SettingsMoreSafeUI.a(paramCharSequence, h.b(localAppCompatActivity, this.qob.getString(2131303053), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(127325);
          g.Rg().c(locald);
          AppMethodBeat.o(127325);
        }
      }));
      AppMethodBeat.o(127326);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI.2
 * JD-Core Version:    0.6.2
 */