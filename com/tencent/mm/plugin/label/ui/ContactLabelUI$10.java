package com.tencent.mm.plugin.label.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.ui.widget.MMLabelPanel;

final class ContactLabelUI$10
  implements Runnable
{
  ContactLabelUI$10(ContactLabelUI paramContactLabelUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22674);
    ContactLabelUI.b(this.nIU).dAc();
    this.nIU.showVKB();
    AppMethodBeat.o(22674);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelUI.10
 * JD-Core Version:    0.6.2
 */