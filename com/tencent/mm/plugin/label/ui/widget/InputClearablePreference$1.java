package com.tencent.mm.plugin.label.ui.widget;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class InputClearablePreference$1
  implements TextWatcher
{
  InputClearablePreference$1(InputClearablePreference paramInputClearablePreference)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    boolean bool = false;
    AppMethodBeat.i(22703);
    if (paramEditable != null)
    {
      String str = paramEditable.toString();
      InputClearablePreference.a(this.nJo, str);
      paramEditable = this.nJo;
      if (bo.isNullOrNil(str))
      {
        InputClearablePreference.a(paramEditable, bool);
        InputClearablePreference.b(this.nJo, str);
        AppMethodBeat.o(22703);
      }
    }
    while (true)
    {
      return;
      bool = true;
      break;
      InputClearablePreference.a(this.nJo, false);
      AppMethodBeat.o(22703);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(22702);
    if (paramCharSequence != null)
    {
      ab.d("MicroMsg.Label.InputClearablePreference", "cpan[onTextChanged] :%s", new Object[] { paramCharSequence.toString() });
      if (InputClearablePreference.a(this.nJo) != null)
        InputClearablePreference.a(this.nJo).PL(paramCharSequence.toString());
    }
    AppMethodBeat.o(22702);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.widget.InputClearablePreference.1
 * JD-Core Version:    0.6.2
 */