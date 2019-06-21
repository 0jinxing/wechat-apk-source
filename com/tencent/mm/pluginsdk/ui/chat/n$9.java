package com.tencent.mm.pluginsdk.ui.chat;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;

final class n$9
  implements TextWatcher
{
  n$9(n paramn)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(27981);
    if ((n.g(this.vpC).size() < 2) || ((n.i(this.vpC).getText() != null) && (n.i(this.vpC).getText().length() > 0)) || ((n.i(this.vpC).getHint() != null) && (n.i(this.vpC).getHint().length() > 0)))
    {
      n.f(this.vpC).setVisibility(8);
      AppMethodBeat.o(27981);
    }
    while (true)
    {
      return;
      n.f(this.vpC).setVisibility(0);
      AppMethodBeat.o(27981);
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.n.9
 * JD-Core Version:    0.6.2
 */