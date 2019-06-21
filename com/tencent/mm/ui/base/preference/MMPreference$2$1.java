package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPreference$2$1
  implements DialogPreference.a
{
  MMPreference$2$1(MMPreference.2 param2, DialogPreference paramDialogPreference, Preference paramPreference)
  {
  }

  public final void dAx()
  {
    AppMethodBeat.i(107209);
    MMPreference.c(this.yCC.yCA);
    if (this.yCB.yDf)
      MMPreference.b(this.yCC.yCA).edit().putString(this.iFO.mKey, this.yCB.getValue()).commit();
    MMPreference.d(this.yCC.yCA).notifyDataSetChanged();
    AppMethodBeat.o(107209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreference.2.1
 * JD-Core Version:    0.6.2
 */