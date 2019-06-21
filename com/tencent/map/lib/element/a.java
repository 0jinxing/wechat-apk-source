package com.tencent.map.lib.element;

import android.graphics.Rect;
import com.tencent.tencentmap.mapsdk.maps.a.fw;
import com.tencent.tencentmap.mapsdk.maps.a.gj;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T extends o<E>, E extends j>
  implements j
{
  private T a;
  private ArrayList<E> b;
  private a.a<E> c;
  private int d = -1;
  private int e = -1;

  public int a()
  {
    return this.e;
  }

  public Rect a(fw paramfw)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    try
    {
      int i;
      if (this.b != null)
      {
        i = this.b.size();
        if (i != 0)
          break label38;
        localObject3 = localObject2;
      }
      label38: int j;
      do
      {
        return localObject3;
        j = this.b.size();
        i = 0;
        localObject2 = localObject1;
        localObject3 = localObject2;
      }
      while (i >= j);
      localObject3 = ((j)this.b.get(i)).a(paramfw);
      if (localObject3 != null)
        if (localObject2 == null)
          localObject2 = localObject3;
      while (true)
      {
        i++;
        break;
        localObject2.left = Math.min(localObject2.left, ((Rect)localObject3).left);
        localObject2.top = Math.max(localObject2.top, ((Rect)localObject3).top);
        localObject2.right = Math.max(localObject2.right, ((Rect)localObject3).right);
        localObject2.bottom = Math.min(localObject2.bottom, ((Rect)localObject3).bottom);
      }
    }
    finally
    {
    }
    throw paramfw;
  }

  public E a(int paramInt)
  {
    try
    {
      if ((this.b != null) && (paramInt >= 0))
      {
        int i = this.b.size();
        if (i > paramInt)
          break label32;
      }
      label32: for (Object localObject1 = null; ; localObject1 = (j)this.b.get(paramInt))
        return localObject1;
    }
    finally
    {
    }
  }

  public void a(E paramE)
  {
    try
    {
      if (this.b == null)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        this.b = localArrayList;
      }
      this.b.add(paramE);
      return;
    }
    finally
    {
    }
    throw paramE;
  }

  public void a(gj paramgj, fw paramfw)
  {
    try
    {
      int i = a();
      int j = 0;
      int k = c();
      while (j < k)
      {
        if (i != j)
        {
          localj = a(j);
          if ((localj != null) && ((localj instanceof d)))
            localj.b(paramgj, paramfw);
        }
        j++;
      }
      j localj = b();
      if ((localj != null) && ((localj instanceof d)))
        localj.b(paramgj, paramfw);
      return;
    }
    finally
    {
    }
    throw paramgj;
  }

  public void a(List<E> paramList)
  {
    if (paramList != null);
    while (true)
    {
      try
      {
        if (paramList.size() <= 0)
        {
          this.b = null;
          return;
        }
        if (this.b == null)
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>(paramList.size());
          this.b = localArrayList;
          this.b.addAll(paramList);
          continue;
        }
      }
      finally
      {
      }
      this.b.clear();
    }
  }

  public boolean a(fw paramfw, float paramFloat1, float paramFloat2)
  {
    if (this.b == null);
    label147: for (boolean bool = false; ; bool = false)
    {
      return bool;
      while (true)
      {
        int j;
        try
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>(this.b.size());
          localArrayList.addAll(this.b);
          int i = localArrayList.size();
          j = 0;
          if (j >= i)
            break label147;
          int k = (this.d + j + 1) % i;
          j localj = (j)localArrayList.get(k);
          if (localj.a(paramfw, paramFloat1, paramFloat2))
          {
            this.d = k;
            if (this.c != null)
              this.c.a(this.a, localj, k);
            bool = true;
            break;
          }
        }
        finally
        {
        }
        j++;
      }
    }
  }

  public E b()
  {
    try
    {
      if ((this.b != null) && (this.e >= 0) && (this.b.size() > this.e))
      {
        localj = (j)this.b.get(this.e);
        return localj;
      }
      j localj = null;
    }
    finally
    {
    }
  }

  public void b(gj paramgj, fw paramfw)
  {
    try
    {
      int i = a();
      int j = 0;
      int k = c();
      while (j < k)
      {
        if (i != j)
        {
          localj = a(j);
          if ((localj != null) && (!(localj instanceof d)))
            localj.b(paramgj, paramfw);
        }
        j++;
      }
      j localj = b();
      if ((localj != null) && (!(localj instanceof d)))
        localj.b(paramgj, paramfw);
      return;
    }
    finally
    {
    }
    throw paramgj;
  }

  public boolean b(E paramE)
  {
    try
    {
      if (this.b != null)
      {
        bool = this.b.remove(paramE);
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public int c()
  {
    try
    {
      ArrayList localArrayList = this.b;
      if (localArrayList == null);
      for (int i = 0; ; i = this.b.size())
        return i;
    }
    finally
    {
    }
  }

  public void d()
  {
    try
    {
      if (this.b != null)
        this.b.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.element.a
 * JD-Core Version:    0.6.2
 */