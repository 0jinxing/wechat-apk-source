package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.applet.b.b;

final class d$2
  implements b.b
{
  d$2(d paramd)
  {
  }

  public final int apO()
  {
    AppMethodBeat.i(33562);
    int i = this.zln.getCount();
    AppMethodBeat.o(33562);
    return i;
  }

  public final String mW(int paramInt)
  {
    AppMethodBeat.i(33561);
    Object localObject;
    if ((paramInt < 0) || (paramInt >= this.zln.getCount()))
    {
      ab.e("MicroMsg.ChatroomContactAdapter", "pos is invalid");
      AppMethodBeat.o(33561);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = (ad)this.zln.getItem(paramInt);
      if (localObject == null)
      {
        AppMethodBeat.o(33561);
        localObject = null;
      }
      else
      {
        localObject = ((ap)localObject).field_username;
        AppMethodBeat.o(33561);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.d.2
 * JD-Core Version:    0.6.2
 */