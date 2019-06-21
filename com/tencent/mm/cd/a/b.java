package com.tencent.mm.cd.a;

import android.database.sqlite.SQLiteClosable;
import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class b<T extends a> extends SQLiteClosable
{
  int mStartPos = 0;
  SparseArray<Object> ych = new SparseArray();
  int yci;
  HashMap<Object, T> ycj = new HashMap();
  ArrayList<Object> yck;
  T ycl;

  public final boolean MI(int paramInt)
  {
    if (this.ych.indexOfKey(paramInt) >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract ArrayList<T> ao(ArrayList<Object> paramArrayList);

  final void b(Object paramObject, T paramT)
  {
    this.ycj.put(paramObject, paramT);
  }

  public final boolean cK(Object paramObject)
  {
    boolean bool;
    if ((paramObject instanceof Object[]))
    {
      Object[] arrayOfObject = (Object[])paramObject;
      if (arrayOfObject.length == 1)
        if ((this.ycj != null) && (this.ycj.containsKey(arrayOfObject[0])))
          bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if ((this.ycj != null) && (this.ycj.containsKey(paramObject)))
        bool = true;
      else
        bool = false;
    }
  }

  public final void clearData()
  {
    ab.i("MicroMsg.CursorDataWindow", "clearData");
    this.ych.clear();
    this.ycj.clear();
  }

  public abstract T dvz();

  public final void ha(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      ab.e("MicroMsg.CursorDataWindow", "newcursor rowEnd with error %d rowNum : %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      this.ych.remove(paramInt1);
    }
    while (true)
    {
      return;
      if (this.ycl != null)
      {
        Object localObject = this.ycl.getKey();
        b(localObject, this.ycl);
        this.ych.put(paramInt1, localObject);
      }
    }
  }

  protected void onAllReferencesReleased()
  {
    clearData();
  }

  final void z(Object[] paramArrayOfObject)
  {
    SparseArray localSparseArray = new SparseArray();
    int i = 0;
    int j = 0;
    if (i < this.ych.size())
    {
      int k = this.ych.keyAt(i);
      Object localObject = this.ych.valueAt(i);
      int m = 1;
      int n = paramArrayOfObject.length;
      int i1 = 0;
      label54: int i2 = j;
      int i3 = m;
      if (i1 < n)
      {
        if (paramArrayOfObject[i1].equals(localObject))
        {
          i2 = j + 1;
          i3 = 0;
        }
      }
      else
      {
        if (i3 == 0)
          break label122;
        localSparseArray.put(k - i2, localObject);
      }
      while (true)
      {
        i++;
        j = i2;
        break;
        i1++;
        break label54;
        label122: ab.i("MicroMsg.CursorDataWindow", "newcursor delete index : " + i + " obj : " + localObject);
      }
    }
    if (this.ych.size() != localSparseArray.size())
      ab.i("MicroMsg.CursorDataWindow", "newcursor oldposition size :" + this.ych.size() + " newposistion Size : " + localSparseArray.size());
    this.ych = localSparseArray;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.a.b
 * JD-Core Version:    0.6.2
 */