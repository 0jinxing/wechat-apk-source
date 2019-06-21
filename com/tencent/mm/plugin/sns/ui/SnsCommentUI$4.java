package com.tencent.mm.plugin.sns.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsCommentUI$4
  implements TextWatcher
{
  SnsCommentUI$4(SnsCommentUI paramSnsCommentUI)
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
    AppMethodBeat.i(38919);
    if (SnsCommentUI.b(this.rrL).getText().toString().trim().length() > 0)
    {
      this.rrL.enableOptionMenu(true);
      AppMethodBeat.o(38919);
    }
    while (true)
    {
      return;
      this.rrL.enableOptionMenu(false);
      AppMethodBeat.o(38919);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentUI.4
 * JD-Core Version:    0.6.2
 */