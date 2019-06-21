package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.choosemsgfile.ui.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;

public final class f extends b
{
  int Lp;
  public c kvi;
  private com.tencent.mm.sdk.b.c kvj;
  private GridLayoutManager kvk;
  int kvl;

  public f(a parama)
  {
    super(parama);
    AppMethodBeat.i(54368);
    this.Lp = 0;
    this.kvl = 0;
    this.kvj = new f.1(this);
    AppMethodBeat.o(54368);
  }

  public final void b(boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(54375);
    if (paramBoolean)
    {
      this.iPr.clear();
      this.Lp = 0;
    }
    this.kvi.kuX = true;
    this.kuT.fO(paramBoolean);
    g.RQ();
    g.RS().aa(new f.5(this, paramString1, paramString2, paramBoolean));
    AppMethodBeat.o(54375);
  }

  public final RecyclerView.a bfB()
  {
    AppMethodBeat.i(54373);
    this.kvi = new c(this.kuT, this.iPr);
    this.kvi.kuV = new f.2(this);
    c localc = this.kvi;
    AppMethodBeat.o(54373);
    return localc;
  }

  public final <T extends RecyclerView.i> T bfC()
  {
    AppMethodBeat.i(54374);
    if (this.kvk == null)
    {
      this.kvk = new GridLayoutManager(4);
      this.kvk.akZ = new f.3(this);
    }
    GridLayoutManager localGridLayoutManager = this.kvk;
    AppMethodBeat.o(54374);
    return localGridLayoutManager;
  }

  public final void dx(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54369);
    ab.i("MicroMsg.ChooseMsgFileUIController", "onCreate");
    this.kvj.dnU();
    b(true, paramString1, paramString2);
    AppMethodBeat.o(54369);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(54372);
    ab.i("MicroMsg.ChooseMsgFileUIController", "onDestroy");
    this.kvj.dead();
    AppMethodBeat.o(54372);
  }

  public final void onPause()
  {
    AppMethodBeat.i(54371);
    ab.i("MicroMsg.ChooseMsgFileUIController", "onPause");
    AppMethodBeat.o(54371);
  }

  public final void onResume()
  {
    AppMethodBeat.i(54370);
    ab.i("MicroMsg.ChooseMsgFileUIController", "onResume");
    this.kvi.aop.notifyChanged();
    AppMethodBeat.o(54370);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.f
 * JD-Core Version:    0.6.2
 */