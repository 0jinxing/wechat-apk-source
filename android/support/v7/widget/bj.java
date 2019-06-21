package android.support.v7.widget;

import android.support.v4.f.a;
import android.support.v4.f.f;

final class bj
{
  final a<RecyclerView.v, bj.a> auY = new a();
  final f<RecyclerView.v> auZ = new f();

  final boolean H(RecyclerView.v paramv)
  {
    paramv = (bj.a)this.auY.get(paramv);
    if ((paramv != null) && ((paramv.flags & 0x1) != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean I(RecyclerView.v paramv)
  {
    paramv = (bj.a)this.auY.get(paramv);
    if ((paramv != null) && ((paramv.flags & 0x4) != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void J(RecyclerView.v paramv)
  {
    bj.a locala1 = (bj.a)this.auY.get(paramv);
    bj.a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = bj.a.ly();
      this.auY.put(paramv, locala2);
    }
    locala2.flags |= 1;
  }

  final void K(RecyclerView.v paramv)
  {
    paramv = (bj.a)this.auY.get(paramv);
    if (paramv == null);
    while (true)
    {
      return;
      paramv.flags &= -2;
    }
  }

  final void L(RecyclerView.v paramv)
  {
    for (int i = this.auZ.size() - 1; ; i--)
      if (i >= 0)
      {
        if (paramv == this.auZ.valueAt(i))
          this.auZ.removeAt(i);
      }
      else
      {
        paramv = (bj.a)this.auY.remove(paramv);
        if (paramv != null)
          bj.a.a(paramv);
        return;
      }
  }

  final void a(long paramLong, RecyclerView.v paramv)
  {
    this.auZ.put(paramLong, paramv);
  }

  final void a(bj.b paramb)
  {
    int i = this.auY.size() - 1;
    if (i >= 0)
    {
      RecyclerView.v localv = (RecyclerView.v)this.auY.keyAt(i);
      bj.a locala = (bj.a)this.auY.removeAt(i);
      if ((locala.flags & 0x3) == 3)
        paramb.j(localv);
      while (true)
      {
        bj.a.a(locala);
        i--;
        break;
        if ((locala.flags & 0x1) != 0)
        {
          if (locala.ava == null)
            paramb.j(localv);
          else
            paramb.a(localv, locala.ava, locala.avb);
        }
        else if ((locala.flags & 0xE) == 14)
          paramb.b(localv, locala.ava, locala.avb);
        else if ((locala.flags & 0xC) == 12)
          paramb.c(localv, locala.ava, locala.avb);
        else if ((locala.flags & 0x4) != 0)
          paramb.a(localv, locala.ava, null);
        else if ((locala.flags & 0x8) != 0)
          paramb.b(localv, locala.ava, locala.avb);
      }
    }
  }

  final void b(RecyclerView.v paramv, RecyclerView.f.c paramc)
  {
    bj.a locala1 = (bj.a)this.auY.get(paramv);
    bj.a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = bj.a.ly();
      this.auY.put(paramv, locala2);
    }
    locala2.ava = paramc;
    locala2.flags |= 4;
  }

  final void c(RecyclerView.v paramv, RecyclerView.f.c paramc)
  {
    bj.a locala1 = (bj.a)this.auY.get(paramv);
    bj.a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = bj.a.ly();
      this.auY.put(paramv, locala2);
    }
    locala2.flags |= 2;
    locala2.ava = paramc;
  }

  final void clear()
  {
    this.auY.clear();
    this.auZ.clear();
  }

  final RecyclerView.f.c d(RecyclerView.v paramv, int paramInt)
  {
    Object localObject1 = null;
    int i = this.auY.indexOfKey(paramv);
    Object localObject2;
    if (i < 0)
      localObject2 = localObject1;
    bj.a locala;
    do
    {
      do
      {
        return localObject2;
        locala = (bj.a)this.auY.valueAt(i);
        localObject2 = localObject1;
      }
      while (locala == null);
      localObject2 = localObject1;
    }
    while ((locala.flags & paramInt) == 0);
    locala.flags &= (paramInt ^ 0xFFFFFFFF);
    if (paramInt == 4);
    for (paramv = locala.ava; ; paramv = locala.avb)
    {
      localObject2 = paramv;
      if ((locala.flags & 0xC) != 0)
        break;
      this.auY.removeAt(i);
      bj.a.a(locala);
      localObject2 = paramv;
      break;
      if (paramInt != 8)
        break label133;
    }
    label133: throw new IllegalArgumentException("Must provide flag PRE or POST");
  }

  final void d(RecyclerView.v paramv, RecyclerView.f.c paramc)
  {
    bj.a locala1 = (bj.a)this.auY.get(paramv);
    bj.a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = bj.a.ly();
      this.auY.put(paramv, locala2);
    }
    locala2.avb = paramc;
    locala2.flags |= 8;
  }

  final RecyclerView.v o(long paramLong)
  {
    return (RecyclerView.v)this.auZ.k(paramLong);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bj
 * JD-Core Version:    0.6.2
 */