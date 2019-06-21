package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.List;

public final class e extends b
{
  protected List<com.tencent.mm.plugin.choosemsgfile.b.b.a> iJL;
  public LinearLayoutManager jop;
  d kuY;

  public e(com.tencent.mm.plugin.choosemsgfile.ui.a parama)
  {
    super(parama);
    AppMethodBeat.i(54350);
    this.iJL = new ArrayList();
    AppMethodBeat.o(54350);
  }

  public final void b(boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(54352);
    ab.i("MicroMsg.ChooseMsgFileListUIController", "[loadData] isFirst:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.kuT.fO(paramBoolean);
    if (paramBoolean)
      this.iJL.clear();
    g.RQ();
    g.RS().aa(new e.2(this, paramString2, paramBoolean));
    AppMethodBeat.o(54352);
  }

  public final RecyclerView.a bfB()
  {
    AppMethodBeat.i(54351);
    this.kuY = new d(this.kuT, this.iJL);
    a.kuW = new e.4(this);
    this.kuY.kuV = new e.1(this);
    d locald = this.kuY;
    AppMethodBeat.o(54351);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.e
 * JD-Core Version:    0.6.2
 */