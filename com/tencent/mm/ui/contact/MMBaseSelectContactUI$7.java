package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.sdk.platformtools.al;

final class MMBaseSelectContactUI$7
  implements Runnable
{
  MMBaseSelectContactUI$7(MMBaseSelectContactUI paramMMBaseSelectContactUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(105223);
    MMBaseSelectContactUI.a(this.znk, a.bJa().bIV());
    MMBaseSelectContactUI.j(this.znk);
    al.d(new MMBaseSelectContactUI.7.1(this));
    AppMethodBeat.o(105223);
  }

  public final String toString()
  {
    AppMethodBeat.i(105224);
    String str = super.toString() + "|updateLabelList";
    AppMethodBeat.o(105224);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.MMBaseSelectContactUI.7
 * JD-Core Version:    0.6.2
 */