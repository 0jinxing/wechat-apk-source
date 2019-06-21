package com.tencent.mm.ui.contact;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.f;

final class ModRemarkNameUI$b
  implements TextWatcher
{
  private int qkM = 800;

  private ModRemarkNameUI$b(ModRemarkNameUI paramModRemarkNameUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(33749);
    this.qkM = f.bP(800, paramEditable.toString());
    if (this.qkM < 0)
      this.qkM = 0;
    if (ModRemarkNameUI.i(this.znY) != null)
      ModRemarkNameUI.i(this.znY).setText(this.qkM);
    ModRemarkNameUI.j(this.znY);
    AppMethodBeat.o(33749);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ModRemarkNameUI.b
 * JD-Core Version:    0.6.2
 */