package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.a;
import com.tencent.mm.sdk.platformtools.bo;

final class SettingsSearchAuthUI$3
  implements View.OnClickListener
{
  SettingsSearchAuthUI$3(SettingsSearchAuthUI paramSettingsSearchAuthUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127443);
    paramView = SettingsSearchAuthUI.d(this.qoM).getFtsEditText().getEditText().getText();
    if (!bo.ac(paramView))
      SettingsSearchAuthUI.a(this.qoM, paramView.toString().trim());
    AppMethodBeat.o(127443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.3
 * JD-Core Version:    0.6.2
 */