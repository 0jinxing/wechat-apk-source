package android.support.v4.widget;

import android.support.v4.f.k.a;
import android.support.v4.f.k.b;
import android.support.v4.f.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class h<T>
{
  public final k.a<ArrayList<T>> PQ = new k.b(10);
  public final m<T, ArrayList<T>> PR = new m();
  private final ArrayList<T> PS = new ArrayList();
  private final HashSet<T> PT = new HashSet();

  private void a(T paramT, ArrayList<T> paramArrayList, HashSet<T> paramHashSet)
  {
    if (paramArrayList.contains(paramT));
    while (true)
    {
      return;
      if (paramHashSet.contains(paramT))
        throw new RuntimeException("This graph contains cyclic dependencies");
      paramHashSet.add(paramT);
      ArrayList localArrayList = (ArrayList)this.PR.get(paramT);
      if (localArrayList != null)
      {
        int i = 0;
        int j = localArrayList.size();
        while (i < j)
        {
          a(localArrayList.get(i), paramArrayList, paramHashSet);
          i++;
        }
      }
      paramHashSet.remove(paramT);
      paramArrayList.add(paramT);
    }
  }

  public final void I(T paramT)
  {
    if (!this.PR.containsKey(paramT))
      this.PR.put(paramT, null);
  }

  public final List J(T paramT)
  {
    return (List)this.PR.get(paramT);
  }

  public final List<T> K(T paramT)
  {
    Object localObject1 = null;
    int i = this.PR.size();
    int j = 0;
    Object localObject2;
    if (j < i)
    {
      ArrayList localArrayList = (ArrayList)this.PR.valueAt(j);
      localObject2 = localObject1;
      if (localArrayList != null)
      {
        localObject2 = localObject1;
        if (localArrayList.contains(paramT))
        {
          if (localObject1 != null)
            break label93;
          localObject1 = new ArrayList();
        }
      }
    }
    label93: 
    while (true)
    {
      ((ArrayList)localObject1).add(this.PR.keyAt(j));
      localObject2 = localObject1;
      j++;
      localObject1 = localObject2;
      break;
      return localObject1;
    }
  }

  public final ArrayList<T> eE()
  {
    this.PS.clear();
    this.PT.clear();
    int i = 0;
    int j = this.PR.size();
    while (i < j)
    {
      a(this.PR.keyAt(i), this.PS, this.PT);
      i++;
    }
    return this.PS;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.h
 * JD-Core Version:    0.6.2
 */