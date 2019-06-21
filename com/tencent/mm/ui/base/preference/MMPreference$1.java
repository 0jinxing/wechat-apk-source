package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPreference$1
  implements Preference.a
{
  MMPreference$1(MMPreference paramMMPreference)
  {
  }

  public final boolean a(Preference paramPreference, Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(107208);
    if ((!MMPreference.a(this.yCA)) && (paramPreference.isEnabled()) && (paramPreference.yDd))
    {
      MMPreference.a(this.yCA, true);
      if (!(paramPreference instanceof CheckBoxPreference))
        break label178;
      paramObject = (CheckBoxPreference)paramPreference;
      paramObject.uOT = paramObject.isChecked();
      if (paramObject.yDf)
        MMPreference.b(this.yCA).edit().putBoolean(paramPreference.mKey, paramObject.isChecked()).commit();
      MMPreference.c(this.yCA);
    }
    label178: for (int i = 1; ; i = 0)
    {
      if (paramPreference.mKey != null)
        this.yCA.a(MMPreference.d(this.yCA), paramPreference);
      if (i != 0)
        MMPreference.d(this.yCA).notifyDataSetChanged();
      MMPreference.a(this.yCA, false);
      if (i != 0)
        AppMethodBeat.o(107208);
      while (true)
      {
        return bool;
        AppMethodBeat.o(107208);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreference.1
 * JD-Core Version:    0.6.2
 */