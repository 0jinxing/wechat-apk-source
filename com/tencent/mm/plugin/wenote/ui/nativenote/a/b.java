package com.tencent.mm.plugin.wenote.ui.nativenote.a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;

public abstract class b extends RecyclerView.m
{
  private int uUh;

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if (Math.abs(paramInt2) > this.uUh)
    {
      paramInt1 = 1;
      if (paramInt1 != 0)
      {
        if (paramRecyclerView.canScrollVertically(-1))
          break label35;
        dfU();
      }
    }
    while (true)
    {
      return;
      paramInt1 = 0;
      break;
      label35: if (!paramRecyclerView.canScrollVertically(1))
        dfV();
      else if (paramInt2 < 0)
        dfS();
      else if (paramInt2 > 0)
        dfT();
    }
  }

  public abstract void dfS();

  public abstract void dfT();

  public abstract void dfU();

  public abstract void dfV();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.a.b
 * JD-Core Version:    0.6.2
 */