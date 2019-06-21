package com.tencent.mm.plugin.qqmail.ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ComposeUI$2
  implements TextWatcher
{
  ComposeUI$2(ComposeUI paramComposeUI, ImageView paramImageView)
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
    paramInt1 = 4;
    AppMethodBeat.i(68168);
    if (this.pwY.pwC)
    {
      paramCharSequence = this.pwZ;
      if (ComposeUI.j(this.pwY).getText().length() > 0)
        paramInt1 = 0;
      paramCharSequence.setVisibility(paramInt1);
      AppMethodBeat.o(68168);
    }
    while (true)
    {
      return;
      this.pwZ.setVisibility(4);
      AppMethodBeat.o(68168);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.2
 * JD-Core Version:    0.6.2
 */