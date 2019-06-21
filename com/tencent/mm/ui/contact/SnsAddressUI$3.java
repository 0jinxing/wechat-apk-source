package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.a;
import java.util.HashSet;

final class SnsAddressUI$3
  implements MultiSelectContactView.a
{
  SnsAddressUI$3(SnsAddressUI paramSnsAddressUI)
  {
  }

  public final void vI(String paramString)
  {
    AppMethodBeat.i(33925);
    if (paramString != null)
    {
      SnsAddressUI.a(this.zpf).remove(paramString);
      SnsAddressUI.b(this.zpf);
    }
    AppMethodBeat.o(33925);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsAddressUI.3
 * JD-Core Version:    0.6.2
 */