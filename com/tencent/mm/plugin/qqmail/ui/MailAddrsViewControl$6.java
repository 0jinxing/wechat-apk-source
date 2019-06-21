package com.tencent.mm.plugin.qqmail.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrsViewControl$6
  implements TextWatcher
{
  MailAddrsViewControl$6(MailAddrsViewControl paramMailAddrsViewControl)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(68343);
    paramCharSequence = paramCharSequence.toString();
    if ((paramCharSequence.endsWith("\n")) || (paramCharSequence.endsWith(" ")))
      MailAddrsViewControl.a(this.pyG, paramCharSequence, true);
    this.pyG.cdj();
    AppMethodBeat.o(68343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.6
 * JD-Core Version:    0.6.2
 */