package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.v;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.choosemsgfile.b.b.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class f$2$1
  implements com.tencent.mm.plugin.choosemsgfile.b.a.a
{
  f$2$1(f.2 param2, com.tencent.mm.plugin.choosemsgfile.b.b.a parama, RecyclerView.v paramv)
  {
  }

  public final void a(MsgFile paramMsgFile)
  {
    AppMethodBeat.i(54357);
    ab.i("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadSuccess msgFile:%s", new Object[] { this.kva, paramMsgFile });
    f.a(this.kvn.kvm).gY(this.kva.kua.field_msgId);
    f.a(this.kvn.kvm).a(this.kva.kua.field_msgId, paramMsgFile);
    if (f.a(this.kvn.kvm).bfD())
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(54356);
          f.2.1.this.kvn.kvm.kvi.aop.notifyChanged();
          AppMethodBeat.o(54356);
        }
      });
    this.kvn.kvm.kuT.bfG();
    this.kva.bfr();
    paramMsgFile = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((m)this.jbn).kuG.getTag();
    if (paramMsgFile.equals(this.kva))
      paramMsgFile.T(this.jbn);
    AppMethodBeat.o(54357);
  }

  public final void bfe()
  {
    AppMethodBeat.i(54358);
    ab.e("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadFails", new Object[] { this.kva });
    f.a(this.kvn.kvm).gY(this.kva.kua.field_msgId);
    this.kva.bft();
    com.tencent.mm.plugin.choosemsgfile.b.b.a locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((m)this.jbn).kuG.getTag();
    if (locala.equals(this.kva))
      locala.T(this.jbn);
    AppMethodBeat.o(54358);
  }

  public final void bff()
  {
    AppMethodBeat.i(54359);
    ab.i("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadPause", new Object[] { this.kva });
    f.a(this.kvn.kvm).gY(this.kva.kua.field_msgId);
    this.kva.bfu();
    com.tencent.mm.plugin.choosemsgfile.b.b.a locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((m)this.jbn).kuG.getTag();
    if (locala.equals(this.kva))
      locala.T(this.jbn);
    AppMethodBeat.o(54359);
  }

  public final void bfg()
  {
    AppMethodBeat.i(54360);
    ab.e("MicroMsg.ChooseMsgFileUIController", "item:%s onExpireFail", new Object[] { this.kva });
    f.a(this.kvn.kvm).gY(this.kva.kua.field_msgId);
    this.kva.bfs();
    com.tencent.mm.plugin.choosemsgfile.b.b.a locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((m)this.jbn).kuG.getTag();
    if (locala.equals(this.kva))
      locala.T(this.jbn);
    AppMethodBeat.o(54360);
  }

  public final void dK(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54361);
    ab.e("MicroMsg.ChooseMsgFileUIController", "item:%s onDownloadProgress offset:%d totalLen:%d", new Object[] { this.kva, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.kva.dM(paramInt1, paramInt2);
    com.tencent.mm.plugin.choosemsgfile.b.b.a locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)((m)this.jbn).kuG.getTag();
    if (locala.equals(this.kva))
      locala.T(this.jbn);
    AppMethodBeat.o(54361);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.f.2.1
 * JD-Core Version:    0.6.2
 */