package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class k extends a
{
  public String mKQ;
  private k.b mKR;
  private k.a mKS;

  public k(int paramInt)
  {
    super(0, paramInt);
    AppMethodBeat.i(62007);
    this.mKR = new k.b(this);
    this.mKS = new k.a(this);
    AppMethodBeat.o(62007);
  }

  public a.b Ps()
  {
    return this.mKR;
  }

  public void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62008);
    this.mKQ = bo.bc(m.wf(this.mFl), "");
    ab.i("MicroMsg.FTS.FTSHeaderDataItem", "fillingDataItem: header=%s", new Object[] { this.mKQ });
    AppMethodBeat.o(62008);
  }

  public a.a bBi()
  {
    return this.mKS;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.k
 * JD-Core Version:    0.6.2
 */