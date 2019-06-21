package com.tencent.mm.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ab$3
  implements TextWatcher
{
  ab$3(ab paramab)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(112461);
    if ((paramEditable != null) && (paramEditable.length() > 0))
    {
      ab.c(this.ypW).setVisibility(0);
      AppMethodBeat.o(112461);
    }
    while (true)
    {
      return;
      ab.c(this.ypW).setVisibility(8);
      AppMethodBeat.o(112461);
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
 * Qualified Name:     com.tencent.mm.ui.ab.3
 * JD-Core Version:    0.6.2
 */