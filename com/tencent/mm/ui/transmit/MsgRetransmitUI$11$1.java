package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class MsgRetransmitUI$11$1
  implements t.a
{
  MsgRetransmitUI$11$1(MsgRetransmitUI.11 param11)
  {
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(35073);
    parama = u.ut(parama.fileName);
    if ((parama != null) && (parama.status == 199))
    {
      MsgRetransmitUI.b localb = new MsgRetransmitUI.b((byte)0);
      localb.zJI = new LinkedList();
      localb.zJI.addAll(this.zJt.zJr.zIR);
      parama = this.zJt.zJr.zIR.iterator();
      while (parama.hasNext())
      {
        String str = (String)parama.next();
        ab.i("MicroMsg.MsgRetransmitUI", "copy video after download %s", new Object[] { str });
        MsgRetransmitUI.a(this.zJt.zJr, localb, str);
      }
    }
    AppMethodBeat.o(35073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.11.1
 * JD-Core Version:    0.6.2
 */