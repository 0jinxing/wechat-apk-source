package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaLuckyMoneyPrepareUI$17
  implements TextWatcher
{
  WxaLuckyMoneyPrepareUI$17(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(42073);
    if (paramEditable.toString().startsWith("."))
      paramEditable.insert(0, "0");
    String str = paramEditable.toString();
    int i = str.indexOf(".");
    int j = str.length();
    if ((i >= 0) && (j - i > 3))
    {
      paramEditable.delete(i + 3, j);
      AppMethodBeat.o(42073);
    }
    while (true)
    {
      return;
      if (i > 6)
      {
        paramEditable.delete(6, i);
        AppMethodBeat.o(42073);
      }
      else
      {
        if ((i == -1) && (j > 6))
          paramEditable.delete(6, j);
        AppMethodBeat.o(42073);
      }
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.17
 * JD-Core Version:    0.6.2
 */