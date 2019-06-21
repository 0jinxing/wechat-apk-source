package android.support.v7.widget;

import android.support.v4.view.s;
import java.util.ArrayList;

final class RecyclerView$q extends RecyclerView.c
{
  RecyclerView$q(RecyclerView paramRecyclerView)
  {
  }

  private void kd()
  {
    if ((RecyclerView.amW) && (this.aoo.anq) && (this.aoo.anp))
      s.b(this.aoo, this.aoo.ani);
    while (true)
    {
      return;
      this.aoo.any = true;
      this.aoo.requestLayout();
    }
  }

  public final void aw(int paramInt1, int paramInt2)
  {
    int i = 1;
    this.aoo.T(null);
    f localf = this.aoo.ane;
    if (paramInt2 > 0)
    {
      localf.aeX.add(localf.a(1, paramInt1, paramInt2, null));
      localf.afd |= 1;
      if (localf.aeX.size() != 1);
    }
    for (paramInt1 = i; ; paramInt1 = 0)
    {
      if (paramInt1 != 0)
        kd();
      return;
    }
  }

  public final void ax(int paramInt1, int paramInt2)
  {
    int i = 1;
    this.aoo.T(null);
    f localf = this.aoo.ane;
    if (paramInt2 > 0)
    {
      localf.aeX.add(localf.a(2, paramInt1, paramInt2, null));
      localf.afd |= 2;
      if (localf.aeX.size() != 1);
    }
    for (paramInt1 = i; ; paramInt1 = 0)
    {
      if (paramInt1 != 0)
        kd();
      return;
    }
  }

  public final void ay(int paramInt1, int paramInt2)
  {
    int i = 1;
    this.aoo.T(null);
    f localf = this.aoo.ane;
    if (paramInt1 != paramInt2)
    {
      localf.aeX.add(localf.a(8, paramInt1, paramInt2, null));
      localf.afd |= 8;
      if (localf.aeX.size() != 1);
    }
    for (paramInt1 = i; ; paramInt1 = 0)
    {
      if (paramInt1 != 0)
        kd();
      return;
    }
  }

  public final void d(int paramInt1, int paramInt2, Object paramObject)
  {
    int i = 1;
    this.aoo.T(null);
    f localf = this.aoo.ane;
    if (paramInt2 > 0)
    {
      localf.aeX.add(localf.a(4, paramInt1, paramInt2, paramObject));
      localf.afd |= 4;
      if (localf.aeX.size() != 1);
    }
    for (paramInt1 = i; ; paramInt1 = 0)
    {
      if (paramInt1 != 0)
        kd();
      return;
    }
  }

  public final void onChanged()
  {
    this.aoo.T(null);
    this.aoo.anY.apu = true;
    this.aoo.am(true);
    if (!this.aoo.ane.hw())
      this.aoo.requestLayout();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.q
 * JD-Core Version:    0.6.2
 */