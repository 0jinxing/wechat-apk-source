package android.support.v7.widget;

import android.util.SparseArray;
import java.util.ArrayList;

public final class RecyclerView$n
{
  SparseArray<RecyclerView.n.a> aoP = new SparseArray();
  int aoQ = 0;

  static long c(long paramLong1, long paramLong2)
  {
    if (paramLong1 == 0L);
    while (true)
    {
      return paramLong2;
      paramLong2 = paramLong1 / 4L * 3L + paramLong2 / 4L;
    }
  }

  public final void aF(int paramInt1, int paramInt2)
  {
    Object localObject = co(paramInt1);
    ((RecyclerView.n.a)localObject).aoS = paramInt2;
    localObject = ((RecyclerView.n.a)localObject).aoR;
    while (((ArrayList)localObject).size() > paramInt2)
      ((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1);
  }

  final boolean b(int paramInt, long paramLong1, long paramLong2)
  {
    long l = co(paramInt).aoT;
    if ((l == 0L) || (l + paramLong1 < paramLong2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final RecyclerView.v cn(int paramInt)
  {
    Object localObject = (RecyclerView.n.a)this.aoP.get(paramInt);
    if ((localObject != null) && (!((RecyclerView.n.a)localObject).aoR.isEmpty()))
      localObject = ((RecyclerView.n.a)localObject).aoR;
    for (localObject = (RecyclerView.v)((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1); ; localObject = null)
      return localObject;
  }

  final RecyclerView.n.a co(int paramInt)
  {
    RecyclerView.n.a locala1 = (RecyclerView.n.a)this.aoP.get(paramInt);
    RecyclerView.n.a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new RecyclerView.n.a();
      this.aoP.put(paramInt, locala2);
    }
    return locala2;
  }

  final void d(int paramInt, long paramLong)
  {
    RecyclerView.n.a locala = co(paramInt);
    locala.aoT = c(locala.aoT, paramLong);
  }

  final void detach()
  {
    this.aoQ -= 1;
  }

  final void ka()
  {
    this.aoQ += 1;
  }

  public final void p(RecyclerView.v paramv)
  {
    int i = paramv.apN;
    ArrayList localArrayList = co(i).aoR;
    if (((RecyclerView.n.a)this.aoP.get(i)).aoS <= localArrayList.size());
    while (true)
    {
      return;
      paramv.resetInternal();
      localArrayList.add(paramv);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.n
 * JD-Core Version:    0.6.2
 */