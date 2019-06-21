package com.tencent.mm.cd.a;

import android.util.SparseArray;
import java.util.ArrayList;

public abstract class g<K, T extends a>
{
  public d ycB;

  public g(d paramd, int paramInt)
  {
    this.ycB = paramd;
    this.ycB.pt(true);
    this.ycB.a(new g.1(this));
    if (paramInt != 0)
      this.ycB.MH(paramInt);
    getCount();
  }

  public abstract ArrayList<T> ao(ArrayList<Object> paramArrayList);

  public final void c(Object paramObject, T paramT)
  {
    this.ycB.a(paramObject, paramT);
  }

  public final boolean cK(Object paramObject)
  {
    return this.ycB.cK(paramObject);
  }

  public final void close()
  {
    this.ycB.close();
    this.ycB = null;
  }

  public abstract T dvB();

  public final SparseArray<K>[] dvp()
  {
    return this.ycB.dvp();
  }

  public final boolean dvr()
  {
    return this.ycB.dvr();
  }

  public final int getCount()
  {
    return this.ycB.getCount();
  }

  public final boolean isClosed()
  {
    return this.ycB.isClosed();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.a.g
 * JD-Core Version:    0.6.2
 */