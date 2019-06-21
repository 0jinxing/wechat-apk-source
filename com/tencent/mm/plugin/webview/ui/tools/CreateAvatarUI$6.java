package com.tencent.mm.plugin.webview.ui.tools;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CreateAvatarUI$6
  implements TextWatcher
{
  CreateAvatarUI$6(CreateAvatarUI paramCreateAvatarUI)
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
    AppMethodBeat.i(7358);
    if (!CreateAvatarUI.b(this.urn).getText().toString().equals(""))
    {
      this.urn.findViewById(2131823165).setEnabled(true);
      AppMethodBeat.o(7358);
    }
    while (true)
    {
      return;
      this.urn.findViewById(2131823165).setEnabled(false);
      AppMethodBeat.o(7358);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.6
 * JD-Core Version:    0.6.2
 */