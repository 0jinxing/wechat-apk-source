package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.base.preference.Preference;

final class AccountInfoPreference$1
  implements View.OnClickListener
{
  AccountInfoPreference$1(AccountInfoPreference paramAccountInfoPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(28015);
    paramView = new Intent();
    d.b(this.vqh.mContext, "setting", ".ui.setting.SettingsPersonalInfoUI", paramView);
    AppMethodBeat.o(28015);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference.1
 * JD-Core Version:    0.6.2
 */