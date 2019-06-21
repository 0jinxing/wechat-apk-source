package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.support.v7.widget.RecyclerView.v;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.choosemsgfile.b.b.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class e$1$1
  implements com.tencent.mm.plugin.choosemsgfile.b.a.a
{
  e$1$1(e.1 param1, com.tencent.mm.plugin.choosemsgfile.b.b.a parama, RecyclerView.v paramv)
  {
  }

  public final void a(MsgFile paramMsgFile)
  {
    AppMethodBeat.i(54339);
    ab.i("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadSuccess msgFile:%s", new Object[] { this.kva, paramMsgFile });
    e.a(this.kvb.kuZ).gY(this.kva.kua.field_msgId);
    e.a(this.kvb.kuZ).a(this.kva.kua.field_msgId, paramMsgFile);
    if (e.a(this.kvb.kuZ).bfD())
      al.d(new e.1.1.1(this));
    this.kvb.kuZ.kuT.bfG();
    this.kva.bfr();
    paramMsgFile = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((n)this.jbn).kuD.getTag();
    if (paramMsgFile.equals(this.kva))
      paramMsgFile.T(this.jbn);
    AppMethodBeat.o(54339);
  }

  public final void bfe()
  {
    AppMethodBeat.i(54340);
    ab.e("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadFails", new Object[] { this.kva });
    e.a(this.kvb.kuZ).gY(this.kva.kua.field_msgId);
    this.kva.bft();
    com.tencent.mm.plugin.choosemsgfile.b.b.a locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((n)this.jbn).kuD.getTag();
    if (locala.equals(this.kva))
      locala.T(this.jbn);
    AppMethodBeat.o(54340);
  }

  public final void bff()
  {
    AppMethodBeat.i(54341);
    ab.i("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadPause", new Object[] { this.kva });
    e.a(this.kvb.kuZ).gY(this.kva.kua.field_msgId);
    this.kva.bfu();
    com.tencent.mm.plugin.choosemsgfile.b.b.a locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((n)this.jbn).kuD.getTag();
    if (locala.equals(this.kva))
      locala.T(this.jbn);
    AppMethodBeat.o(54341);
  }

  public final void bfg()
  {
    AppMethodBeat.i(54342);
    ab.e("MicroMsg.ChooseMsgFileListUIController", "item:%s onExpireFail", new Object[] { this.kva });
    e.a(this.kvb.kuZ).gY(this.kva.kua.field_msgId);
    this.kva.bfs();
    com.tencent.mm.plugin.choosemsgfile.b.b.a locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((n)this.jbn).kuD.getTag();
    if (locala.equals(this.kva))
      locala.T(this.jbn);
    AppMethodBeat.o(54342);
  }

  public final void dK(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54343);
    ab.e("MicroMsg.ChooseMsgFileListUIController", "item:%s onDownloadProgress offset:%d totalLen:%d", new Object[] { this.kva, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.kva.dM(paramInt1, paramInt2);
    com.tencent.mm.plugin.choosemsgfile.b.b.a locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((n)this.jbn).kuD.getTag();
    if (locala.equals(this.kva))
      locala.T(this.jbn);
    AppMethodBeat.o(54343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.e.1.1
 * JD-Core Version:    0.6.2
 */