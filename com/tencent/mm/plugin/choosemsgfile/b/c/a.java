package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import com.tencent.mm.kernel.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public abstract class a extends RecyclerView.a
  implements g
{
  static g.b kuW;
  protected List<com.tencent.mm.plugin.choosemsgfile.b.b.a> iJL;
  private com.tencent.mm.plugin.choosemsgfile.ui.a kuT;
  private boolean kuU;
  g.a kuV;

  public a(com.tencent.mm.plugin.choosemsgfile.ui.a parama, List<com.tencent.mm.plugin.choosemsgfile.b.b.a> paramList)
  {
    this.kuT = parama;
    this.iJL = paramList;
    this.kuU = com.tencent.mm.kernel.g.RP().isSDCardAvailable();
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    if (!this.kuU)
      ab.e("MicroMsg.BaseChooseFileAdapter", "[onBindViewHolder] isSDCardAvailable:%b", new Object[] { Boolean.valueOf(this.kuU) });
    while (true)
    {
      return;
      ts(paramInt).a(paramv, paramInt);
    }
  }

  public final void a(RecyclerView.v paramv, int paramInt, List paramList)
  {
    ts(paramInt);
    super.a(paramv, paramInt, paramList);
  }

  public final void a(boolean paramBoolean, com.tencent.mm.plugin.choosemsgfile.b.b.a parama, RecyclerView.v paramv)
  {
    if (this.kuV != null)
      this.kuV.a(paramBoolean, parama, paramv);
  }

  public final com.tencent.mm.plugin.choosemsgfile.ui.a bfy()
  {
    return this.kuT;
  }

  public boolean bfz()
  {
    return false;
  }

  public final int getItemCount()
  {
    return this.iJL.size();
  }

  public final int getItemViewType(int paramInt)
  {
    return ts(paramInt).getType();
  }

  public final com.tencent.mm.plugin.choosemsgfile.b.b.a ts(int paramInt)
  {
    if ((this.iJL == null) || (this.iJL.size() <= paramInt));
    for (com.tencent.mm.plugin.choosemsgfile.b.b.a locala = null; ; locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)this.iJL.get(paramInt))
      return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.a
 * JD-Core Version:    0.6.2
 */