package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.ui.tools.o;

final class MMBaseSelectContactUI$5
  implements LabelContainerView.a
{
  MMBaseSelectContactUI$5(MMBaseSelectContactUI paramMMBaseSelectContactUI)
  {
  }

  public final void bmk()
  {
    AppMethodBeat.i(105219);
    if (MMBaseSelectContactUI.d(this.znk) != null)
      MMBaseSelectContactUI.d(this.znk).clearFocus();
    if (MMBaseSelectContactUI.h(this.znk) != null)
    {
      MMBaseSelectContactUI.h(this.znk).clearFocus();
      MMBaseSelectContactUI.h(this.znk).dJS();
    }
    MMBaseSelectContactUI.i(this.znk).requestFocus();
    MMBaseSelectContactUI.i(this.znk).setVisibility(8);
    AppMethodBeat.o(105219);
  }

  public final void bml()
  {
    AppMethodBeat.i(105220);
    this.znk.aqX();
    AppMethodBeat.o(105220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.MMBaseSelectContactUI.5
 * JD-Core Version:    0.6.2
 */