package com.tencent.mm.plugin.setting.ui.setting;

import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsModifyEmailAddrUI$23
  implements InputFilter
{
  SettingsModifyEmailAddrUI$23(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(127285);
    if (paramCharSequence.length() <= 0)
    {
      paramCharSequence = paramSpanned.subSequence(paramInt3, paramInt4);
      AppMethodBeat.o(127285);
    }
    while (true)
    {
      return paramCharSequence;
      paramCharSequence = "";
      AppMethodBeat.o(127285);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI.23
 * JD-Core Version:    0.6.2
 */