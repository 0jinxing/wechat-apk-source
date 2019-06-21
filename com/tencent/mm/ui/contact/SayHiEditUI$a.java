package com.tencent.mm.ui.contact;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.normsg.a.b;

final class SayHiEditUI$a
  implements TextWatcher
{
  private boolean eLU = false;

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(33843);
    if (this.eLU)
      AppMethodBeat.o(33843);
    while (true)
    {
      return;
      this.eLU = true;
      b.oTO.ae(3, 2, 10);
      AppMethodBeat.o(33843);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SayHiEditUI.a
 * JD-Core Version:    0.6.2
 */