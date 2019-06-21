package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class i$2
  implements k.b
{
  i$2(i parami)
  {
  }

  public final boolean iD(int paramInt)
  {
    AppMethodBeat.i(79732);
    if ((!this.vkB.vkt.vkL) || (!this.vkB.vkt.KW(paramInt)))
      AppMethodBeat.o(79732);
    while (true)
    {
      return true;
      if (!this.vkB.vkt.KU(paramInt))
        ab.d("MicroMsg.ContactListArchor", "onItemLongClick ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(79732);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.i.2
 * JD-Core Version:    0.6.2
 */