package com.tencent.mm.plugin.label.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.ui.widget.InputClearablePreference;
import com.tencent.mm.plugin.label.ui.widget.InputClearablePreference.a;

final class ContactLabelEditUI$11
  implements InputClearablePreference.a
{
  ContactLabelEditUI$11(ContactLabelEditUI paramContactLabelEditUI)
  {
  }

  public final void PL(String paramString)
  {
    AppMethodBeat.i(22550);
    ContactLabelEditUI.b(this.nHW, paramString);
    ContactLabelEditUI.c(this.nHW, paramString);
    ContactLabelEditUI.e(this.nHW).iA(false);
    AppMethodBeat.o(22550);
  }

  public final void iy(boolean paramBoolean)
  {
    AppMethodBeat.i(22551);
    if ((!ContactLabelEditUI.f(this.nHW)) && (ContactLabelEditUI.g(this.nHW)))
    {
      this.nHW.enableOptionMenu(false);
      ContactLabelEditUI.h(this.nHW);
      AppMethodBeat.o(22551);
    }
    while (true)
    {
      return;
      this.nHW.enableOptionMenu(paramBoolean);
      AppMethodBeat.o(22551);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelEditUI.11
 * JD-Core Version:    0.6.2
 */