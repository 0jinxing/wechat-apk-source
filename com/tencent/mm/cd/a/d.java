package com.tencent.mm.cd.a;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.HashMap;

public abstract interface d<T> extends Cursor
{
  public abstract boolean MF(int paramInt);

  public abstract a MG(int paramInt);

  public abstract void MH(int paramInt);

  public abstract void a(f.a parama);

  public abstract boolean a(Object paramObject, a parama);

  public abstract boolean cK(Object paramObject);

  public abstract a cL(Object paramObject);

  public abstract SparseArray<T>[] dvp();

  public abstract HashMap<Object, T> dvq();

  public abstract boolean dvr();

  public abstract void pt(boolean paramBoolean);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.a.d
 * JD-Core Version:    0.6.2
 */