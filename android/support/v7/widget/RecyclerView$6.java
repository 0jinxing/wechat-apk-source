package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

final class RecyclerView$6
  implements f.a
{
  RecyclerView$6(RecyclerView paramRecyclerView)
  {
  }

  private void f(f.b paramb)
  {
    switch (paramb.Cn)
    {
    case 3:
    case 5:
    case 6:
    case 7:
    default:
    case 1:
    case 2:
    case 4:
    case 8:
    }
    while (true)
    {
      return;
      this.aoo.ank.c(this.aoo, paramb.afe, paramb.afg);
      continue;
      this.aoo.ank.d(this.aoo, paramb.afe, paramb.afg);
      continue;
      this.aoo.ank.a(this.aoo, paramb.afe, paramb.afg, paramb.aff);
      continue;
      this.aoo.ank.a(this.aoo, paramb.afe, paramb.afg, 1);
    }
  }

  public final void O(int paramInt1, int paramInt2)
  {
    this.aoo.e(paramInt1, paramInt2, true);
    this.aoo.aob = true;
    RecyclerView.s locals = this.aoo.anY;
    locals.apr += paramInt2;
  }

  public final void P(int paramInt1, int paramInt2)
  {
    this.aoo.e(paramInt1, paramInt2, false);
    this.aoo.aob = true;
  }

  public final void Q(int paramInt1, int paramInt2)
  {
    RecyclerView localRecyclerView = this.aoo;
    int i = localRecyclerView.anf.hU();
    for (int j = 0; j < i; j++)
    {
      localObject = RecyclerView.bn(localRecyclerView.anf.bI(j));
      if ((localObject != null) && (!((RecyclerView.v)localObject).kh()) && (((RecyclerView.v)localObject).mPosition >= paramInt1))
      {
        ((RecyclerView.v)localObject).o(paramInt2, false);
        localRecyclerView.anY.apu = true;
      }
    }
    Object localObject = localRecyclerView.anc;
    i = ((RecyclerView.o)localObject).aoX.size();
    for (j = 0; j < i; j++)
    {
      RecyclerView.v localv = (RecyclerView.v)((RecyclerView.o)localObject).aoX.get(j);
      if ((localv != null) && (localv.mPosition >= paramInt1))
        localv.o(paramInt2, true);
    }
    localRecyclerView.requestLayout();
    this.aoo.aob = true;
  }

  public final void R(int paramInt1, int paramInt2)
  {
    int i = -1;
    RecyclerView localRecyclerView = this.aoo;
    int j = localRecyclerView.anf.hU();
    int k;
    int m;
    int n;
    int i1;
    if (paramInt1 < paramInt2)
    {
      k = -1;
      m = paramInt2;
      n = paramInt1;
      i1 = 0;
      label35: if (i1 >= j)
        break label138;
      localObject = RecyclerView.bn(localRecyclerView.anf.bI(i1));
      if ((localObject != null) && (((RecyclerView.v)localObject).mPosition >= n) && (((RecyclerView.v)localObject).mPosition <= m))
      {
        if (((RecyclerView.v)localObject).mPosition != paramInt1)
          break label127;
        ((RecyclerView.v)localObject).o(paramInt2 - paramInt1, false);
      }
    }
    while (true)
    {
      localRecyclerView.anY.apu = true;
      i1++;
      break label35;
      k = 1;
      m = paramInt1;
      n = paramInt2;
      break;
      label127: ((RecyclerView.v)localObject).o(k, false);
    }
    label138: Object localObject = localRecyclerView.anc;
    label171: RecyclerView.v localv;
    if (paramInt1 < paramInt2)
    {
      m = paramInt2;
      k = paramInt1;
      n = i;
      i = ((RecyclerView.o)localObject).aoX.size();
      i1 = 0;
      if (i1 >= i)
        break label264;
      localv = (RecyclerView.v)((RecyclerView.o)localObject).aoX.get(i1);
      if ((localv != null) && (localv.mPosition >= k) && (localv.mPosition <= m))
      {
        if (localv.mPosition != paramInt1)
          break label253;
        localv.o(paramInt2 - paramInt1, false);
      }
    }
    while (true)
    {
      i1++;
      break label171;
      n = 1;
      m = paramInt1;
      k = paramInt2;
      break;
      label253: localv.o(n, false);
    }
    label264: localRecyclerView.requestLayout();
    this.aoo.aob = true;
  }

  public final void b(int paramInt1, int paramInt2, Object paramObject)
  {
    RecyclerView localRecyclerView = this.aoo;
    int i = localRecyclerView.anf.hU();
    Object localObject;
    for (int j = 0; j < i; j++)
    {
      localObject = localRecyclerView.anf.bI(j);
      RecyclerView.v localv = RecyclerView.bn((View)localObject);
      if ((localv != null) && (!localv.kh()) && (localv.mPosition >= paramInt1) && (localv.mPosition < paramInt1 + paramInt2))
      {
        localv.addFlags(2);
        localv.O(paramObject);
        ((RecyclerView.LayoutParams)((View)localObject).getLayoutParams()).aoN = true;
      }
    }
    paramObject = localRecyclerView.anc;
    for (j = paramObject.aoX.size() - 1; j >= 0; j--)
    {
      localObject = (RecyclerView.v)paramObject.aoX.get(j);
      if (localObject != null)
      {
        i = ((RecyclerView.v)localObject).mPosition;
        if ((i >= paramInt1) && (i < paramInt1 + paramInt2))
        {
          ((RecyclerView.v)localObject).addFlags(2);
          paramObject.cs(j);
        }
      }
    }
    this.aoo.aoc = true;
  }

  public final RecyclerView.v bC(int paramInt)
  {
    RecyclerView localRecyclerView = this.aoo;
    int i = localRecyclerView.anf.hU();
    int j = 0;
    Object localObject1 = null;
    Object localObject2;
    if (j < i)
    {
      localObject2 = RecyclerView.bn(localRecyclerView.anf.bI(j));
      if ((localObject2 == null) || (((RecyclerView.v)localObject2).isRemoved()) || (((RecyclerView.v)localObject2).mPosition != paramInt))
        break label129;
      localObject1 = localObject2;
      if (localRecyclerView.anf.aY(((RecyclerView.v)localObject2).apJ))
        localObject1 = localObject2;
    }
    label129: 
    while (true)
    {
      j++;
      break;
      if (localObject1 == null)
        localObject2 = null;
      while (true)
      {
        return localObject2;
        localObject2 = localObject1;
        if (this.aoo.anf.aY(localObject1.apJ))
          localObject2 = null;
      }
    }
  }

  public final void d(f.b paramb)
  {
    f(paramb);
  }

  public final void e(f.b paramb)
  {
    f(paramb);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.6
 * JD-Core Version:    0.6.2
 */