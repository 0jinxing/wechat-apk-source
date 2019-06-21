package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import com.tencent.mm.plugin.wenote.model.a.c;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;

public abstract class a extends RecyclerView.v
{
  protected k uSJ;

  public a(View paramView, k paramk)
  {
    super(paramView);
    this.uSJ = paramk;
  }

  public abstract void a(c paramc, int paramInt1, int paramInt2);

  public abstract int dfW();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.a
 * JD-Core Version:    0.6.2
 */