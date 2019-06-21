package com.tencent.mm.pluginsdk.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class MMPhoneNumberEditText$2
  implements TextWatcher
{
  MMPhoneNumberEditText$2(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(27493);
    if (bo.isNullOrNil(paramCharSequence.toString()))
    {
      MMPhoneNumberEditText.a(this.vhV, true);
      AppMethodBeat.o(27493);
    }
    while (true)
    {
      return;
      MMPhoneNumberEditText.a(this.vhV, false);
      AppMethodBeat.o(27493);
    }
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(27492);
    MMPhoneNumberEditText.c(this.vhV);
    if ((paramCharSequence.toString().equals("")) && (!MMPhoneNumberEditText.d(this.vhV)))
    {
      if ((MMPhoneNumberEditText.b(this.vhV) == null) || (!this.vhV.isFocused()))
        break label177;
      MMPhoneNumberEditText.b(this.vhV).g(this.vhV);
      AppMethodBeat.o(27492);
    }
    while (true)
    {
      return;
      if ((!paramCharSequence.toString().equals("")) && (MMPhoneNumberEditText.d(this.vhV)))
      {
        if ((MMPhoneNumberEditText.b(this.vhV) != null) && (this.vhV.isFocused()))
        {
          MMPhoneNumberEditText.b(this.vhV).djd();
          AppMethodBeat.o(27492);
        }
      }
      else
      {
        if ((MMPhoneNumberEditText.b(this.vhV) != null) && (this.vhV.isFocused()))
          MMPhoneNumberEditText.b(this.vhV).dje();
        label177: AppMethodBeat.o(27492);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText.2
 * JD-Core Version:    0.6.2
 */