package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class MMBaseSelectContactUI$3
  implements m.a
{
  MMBaseSelectContactUI$3(MMBaseSelectContactUI paramMMBaseSelectContactUI)
  {
  }

  public final void w(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(105216);
    ab.i("MicroMsg.MMBaseSelectContactUI", "Callback SearchEnd Count=%d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramBoolean) && (paramInt == 0))
      if (!bo.isNullOrNil(paramString))
      {
        MMBaseSelectContactUI.b(this.znk);
        AppMethodBeat.o(105216);
      }
    while (true)
    {
      return;
      MMBaseSelectContactUI.a(this.znk);
      AppMethodBeat.o(105216);
      continue;
      MMBaseSelectContactUI.c(this.znk);
      AppMethodBeat.o(105216);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.MMBaseSelectContactUI.3
 * JD-Core Version:    0.6.2
 */