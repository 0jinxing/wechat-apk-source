package com.tencent.mm.plugin.label.ui.widget;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class InputClearablePreference$b
  implements InputFilter
{
  public final char[] nJp;

  InputClearablePreference$b(InputClearablePreference paramInputClearablePreference)
  {
    AppMethodBeat.i(22707);
    this.nJp = new char[] { 10, 44, 59, 12289, -244, -229 };
    AppMethodBeat.o(22707);
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(22708);
    ab.d("MicroMsg.Label.InputClearablePreference", "on create tag filter, %s [%d, %d) %s [%d, %d),", new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramSpanned, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    paramInt4 = paramInt1;
    int j;
    if (paramInt4 < paramInt2)
    {
      paramSpanned = new char[paramInt2 - paramInt1];
      TextUtils.getChars(paramCharSequence, paramInt1, paramInt2, paramSpanned, 0);
      int i = this.nJp.length;
      j = 0;
      label92: if (j < i)
        if ((paramSpanned[paramInt4] == ' ') && (paramInt3 == 0) && (paramInt4 == 0))
        {
          paramCharSequence = "";
          AppMethodBeat.o(22708);
        }
    }
    while (true)
    {
      return paramCharSequence;
      if (paramSpanned[paramInt4] == this.nJp[j])
      {
        this.nJo.iA(true);
        paramCharSequence = "";
        AppMethodBeat.o(22708);
      }
      else
      {
        j++;
        break label92;
        paramInt4++;
        break;
        paramCharSequence = null;
        AppMethodBeat.o(22708);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.widget.InputClearablePreference.b
 * JD-Core Version:    0.6.2
 */