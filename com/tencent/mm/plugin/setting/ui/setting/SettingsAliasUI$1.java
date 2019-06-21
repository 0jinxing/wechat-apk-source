package com.tencent.mm.plugin.setting.ui.setting;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class SettingsAliasUI$1
  implements TextWatcher
{
  SettingsAliasUI$1(SettingsAliasUI paramSettingsAliasUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(127184);
    SettingsAliasUI localSettingsAliasUI = this.qmW;
    a locala = new a();
    if ((paramCharSequence.length() < 6) || (paramCharSequence.length() > 20))
    {
      locala.aIm = localSettingsAliasUI.getString(2131304227);
      locala.cxj = false;
      if (!locala.cxj)
        break label338;
      this.qmW.enableOptionMenu(true);
      SettingsAliasUI.a(this.qmW).setTextColor(this.qmW.getResources().getColorStateList(2131690164));
    }
    while (true)
    {
      SettingsAliasUI.a(this.qmW).setText(locala.aIm);
      SettingsAliasUI.b(this.qmW).setText(this.qmW.getString(2131296520, new Object[] { paramCharSequence }));
      AppMethodBeat.o(127184);
      return;
      if (!bo.z(paramCharSequence.charAt(0)))
      {
        locala.aIm = localSettingsAliasUI.getString(2131304225);
        locala.cxj = false;
        break;
      }
      for (paramInt1 = paramCharSequence.length() - 1; ; paramInt1--)
      {
        if (paramInt1 <= 0)
          break label317;
        char c = paramCharSequence.charAt(paramInt1);
        if ((!bo.z(c)) && (c != '-') && (c != '_') && (!bo.A(c)))
        {
          if (Character.isSpace(c))
          {
            locala.aIm = localSettingsAliasUI.getString(2131304224);
            locala.cxj = false;
            break;
          }
          if (bo.y(c))
          {
            locala.aIm = localSettingsAliasUI.getString(2131304222);
            locala.cxj = false;
            break;
          }
          locala.aIm = localSettingsAliasUI.getString(2131304227);
          locala.cxj = false;
          break;
        }
      }
      label317: locala.aIm = localSettingsAliasUI.getString(2131301494);
      locala.cxj = true;
      break;
      label338: this.qmW.enableOptionMenu(false);
      SettingsAliasUI.a(this.qmW).setTextColor(this.qmW.getResources().getColorStateList(2131690438));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.1
 * JD-Core Version:    0.6.2
 */