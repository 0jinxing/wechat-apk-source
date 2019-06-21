package com.tencent.mm.ui.chatting.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.chatting.viewitems.am.d;

final class a$4
  implements t.a
{
  a$4(a parama)
  {
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(31099);
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (parama != null)
    {
      bool2 = bool1;
      if (parama.fXk != 3)
        if ((parama.fXk != 2) && (parama.fXk != -1))
        {
          bool2 = bool1;
          if (parama.fXk != 1);
        }
        else
        {
          bool2 = am.d.b(parama);
        }
    }
    if (!bool2)
      al.d(new a.4.1(this));
    AppMethodBeat.o(31099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.a.4
 * JD-Core Version:    0.6.2
 */