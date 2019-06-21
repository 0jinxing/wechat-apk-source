package com.tencent.mm.plugin.luckymoney.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class LuckyMoneyWishFooter$3
  implements TextWatcher
{
  LuckyMoneyWishFooter$3(LuckyMoneyWishFooter paramLuckyMoneyWishFooter)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(43049);
    if (LuckyMoneyWishFooter.b(this.ois).getText() == null)
    {
      AppMethodBeat.o(43049);
      return;
    }
    LuckyMoneyWishFooter.b(this.ois).requestFocus();
    if ((paramEditable.length() > 0) && (paramEditable.toString().trim().length() > 0));
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (this.ois.oio))
      {
        LuckyMoneyWishFooter.a(this.ois, true);
        this.ois.oio = false;
      }
      if (i == 0)
      {
        LuckyMoneyWishFooter.a(this.ois, false);
        this.ois.oio = true;
      }
      AppMethodBeat.o(43049);
      break;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyWishFooter.3
 * JD-Core Version:    0.6.2
 */