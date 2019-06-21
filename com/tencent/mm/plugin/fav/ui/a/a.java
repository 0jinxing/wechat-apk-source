package com.tencent.mm.plugin.fav.ui.a;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import com.tencent.mm.plugin.fav.a.w;
import java.util.Set;

public abstract class a extends BaseAdapter
  implements AdapterView.OnItemClickListener
{
  protected long lastUpdateTime;
  protected Set<Integer> mkZ;
  protected w mla;
  protected a.a mlb;
  protected int type;

  public final void a(w paramw)
  {
    this.mla = paramw;
  }

  public final void a(a.a parama)
  {
    this.mlb = parama;
  }

  public final long bvV()
  {
    return this.lastUpdateTime;
  }

  public final void bvW()
  {
    if (this.mlb != null)
      this.mlb.bvU();
  }

  public abstract void bvX();

  public abstract void bvY();

  public final void f(Set<Integer> paramSet)
  {
    this.mkZ = paramSet;
  }

  public final int getType()
  {
    return this.type;
  }

  public abstract boolean isEmpty();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.a.a
 * JD-Core Version:    0.6.2
 */