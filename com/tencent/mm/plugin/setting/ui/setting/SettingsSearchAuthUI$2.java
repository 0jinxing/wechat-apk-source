package com.tencent.mm.plugin.setting.ui.setting;

import android.content.res.Resources;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.a;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class SettingsSearchAuthUI$2
  implements FTSEditTextView.a
{
  SettingsSearchAuthUI$2(SettingsSearchAuthUI paramSettingsSearchAuthUI)
  {
  }

  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(127439);
    ab.i("MicroMsg.SettingsSearchAuthUI", "search totalText %s", new Object[] { paramString1 });
    if (!bo.isNullOrNil(paramString1))
    {
      SettingsSearchAuthUI.a(this.qoM);
      paramString2 = this.qoM.getString(2131297040);
      paramString1 = new k(paramString2 + " " + paramString1.trim());
      paramString1.setSpan(new ForegroundColorSpan(this.qoM.getResources().getColor(2131689776)), paramString2.length(), paramString1.length(), 33);
      SettingsSearchAuthUI.b(this.qoM).setText(paramString1);
      AppMethodBeat.o(127439);
    }
    while (true)
    {
      return;
      SettingsSearchAuthUI.c(this.qoM);
      AppMethodBeat.o(127439);
    }
  }

  public final boolean aMo()
  {
    AppMethodBeat.i(127442);
    ab.i("MicroMsg.SettingsSearchAuthUI", "search key down");
    Editable localEditable = SettingsSearchAuthUI.d(this.qoM).getFtsEditText().getEditText().getText();
    SettingsSearchAuthUI.b(this.qoM).setVisibility(8);
    SettingsSearchAuthUI.d(this.qoM).getFtsEditText().getEditText().clearFocus();
    this.qoM.aqX();
    SettingsSearchAuthUI.e(this.qoM);
    if (!bo.ac(localEditable))
      SettingsSearchAuthUI.a(this.qoM, localEditable.toString().trim());
    AppMethodBeat.o(127442);
    return true;
  }

  public final void bAR()
  {
  }

  public final void hz(boolean paramBoolean)
  {
    AppMethodBeat.i(127440);
    ab.i("MicroMsg.SettingsSearchAuthUI", "searchView hasFocus %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.qoM.showVKB();
      AppMethodBeat.o(127440);
    }
    while (true)
    {
      return;
      this.qoM.aqX();
      AppMethodBeat.o(127440);
    }
  }

  public final void onClickClearTextBtn(View paramView)
  {
    AppMethodBeat.i(127441);
    ab.i("MicroMsg.SettingsSearchAuthUI", "clear search text");
    SettingsSearchAuthUI.c(this.qoM);
    AppMethodBeat.o(127441);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI.2
 * JD-Core Version:    0.6.2
 */