package com.tencent.mm.ui.tools;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class MMTextInputUI$4
  implements TextWatcher
{
  MMTextInputUI$4(MMTextInputUI paramMMTextInputUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    boolean bool = false;
    AppMethodBeat.i(107727);
    paramEditable = paramEditable.toString();
    int i;
    if (!MMTextInputUI.c(this.zGf))
    {
      if (paramEditable.trim().length() > 0)
        this.zGf.enableOptionMenu(true);
    }
    else
    {
      if (MMTextInputUI.d(this.zGf) <= 0)
        break label409;
      MMTextInputUI.a(this.zGf, 0);
      i = 0;
      label61: if (i >= paramEditable.length())
        break label134;
      if (!bo.y(paramEditable.charAt(i)))
        break label114;
      MMTextInputUI.a(this.zGf, MMTextInputUI.e(this.zGf) + 2);
    }
    while (true)
    {
      i++;
      break label61;
      this.zGf.enableOptionMenu(false);
      break;
      label114: MMTextInputUI.a(this.zGf, MMTextInputUI.e(this.zGf) + 1);
    }
    label134: if ((MMTextInputUI.e(this.zGf) >= MMTextInputUI.f(this.zGf)) && (MMTextInputUI.e(this.zGf) <= MMTextInputUI.d(this.zGf)))
    {
      this.zGf.enableOptionMenu(true);
      MMTextInputUI.g(this.zGf).setVisibility(0);
      MMTextInputUI.g(this.zGf).setTextColor(this.zGf.getResources().getColor(2131690568));
      MMTextInputUI.g(this.zGf).setText(this.zGf.getString(2131304045, new Object[] { Integer.valueOf(MMTextInputUI.d(this.zGf) - MMTextInputUI.e(this.zGf) >> 1) }));
      AppMethodBeat.o(107727);
    }
    while (true)
    {
      return;
      if (MMTextInputUI.e(this.zGf) <= MMTextInputUI.d(this.zGf))
        break;
      this.zGf.enableOptionMenu(false);
      MMTextInputUI.g(this.zGf).setVisibility(0);
      MMTextInputUI.g(this.zGf).setTextColor(this.zGf.getResources().getColor(2131690569));
      MMTextInputUI.g(this.zGf).setText(this.zGf.getString(2131304046, new Object[] { Integer.valueOf((MMTextInputUI.e(this.zGf) - MMTextInputUI.d(this.zGf) >> 1) + 1) }));
      AppMethodBeat.o(107727);
    }
    paramEditable = this.zGf;
    if (MMTextInputUI.c(this.zGf))
      bool = true;
    while (true)
    {
      paramEditable.enableOptionMenu(bool);
      MMTextInputUI.g(this.zGf).setVisibility(8);
      label409: AppMethodBeat.o(107727);
      break;
      if (MMTextInputUI.e(this.zGf) > 0)
        bool = true;
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMTextInputUI.4
 * JD-Core Version:    0.6.2
 */