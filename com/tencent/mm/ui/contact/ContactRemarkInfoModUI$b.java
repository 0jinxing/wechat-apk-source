package com.tencent.mm.ui.contact;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.f;

final class ContactRemarkInfoModUI$b
  implements TextWatcher
{
  private int qkM = 800;
  private String zmi = "";

  private ContactRemarkInfoModUI$b(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(33648);
    this.qkM = f.bP(800, paramEditable.toString());
    if (this.qkM < 0)
      this.qkM = 0;
    if (ContactRemarkInfoModUI.b(this.zmg) != null)
      ContactRemarkInfoModUI.b(this.zmg).setText(this.qkM);
    ContactRemarkInfoModUI.a(this.zmg);
    AppMethodBeat.o(33648);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI.b
 * JD-Core Version:    0.6.2
 */