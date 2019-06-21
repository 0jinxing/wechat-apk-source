package com.tencent.mm.plugin.appbrand.widget.sms;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class EditVerifyCodeView$1
  implements TextWatcher
{
  EditVerifyCodeView$1(EditVerifyCodeView paramEditVerifyCodeView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(134402);
    if ((paramEditable == null) || (paramEditable.length() == 0))
      AppMethodBeat.o(134402);
    while (true)
    {
      return;
      ab.i("MicroMsg.EditVerifyCodeView", "afterTextChanged:%s", new Object[] { paramEditable.toString() });
      if (EditVerifyCodeView.a(this.joT).length() < 6)
      {
        EditVerifyCodeView.a(this.joT).append(paramEditable.toString());
        EditVerifyCodeView.b(this.joT);
      }
      paramEditable.delete(0, paramEditable.length());
      AppMethodBeat.o(134402);
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
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeView.1
 * JD-Core Version:    0.6.2
 */