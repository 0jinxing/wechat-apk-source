package com.tencent.tinker.c.a.c;

import com.tencent.tinker.a.a.j;
import com.tencent.tinker.a.b.a.c;
import com.tencent.tinker.a.b.a.d;
import com.tencent.tinker.a.b.a.e;
import com.tencent.tinker.a.b.a.f;
import com.tencent.tinker.a.b.a.g;
import com.tencent.tinker.a.b.a.h;
import java.io.EOFException;

public final class b
{
  final a AAK;

  public b(a parama)
  {
    this.AAK = parama;
  }

  public final short[] a(short[] paramArrayOfShort)
  {
    h localh = new h(paramArrayOfShort.length);
    Object localObject = new c();
    f localf = new f(localh, (c)localObject);
    paramArrayOfShort = new d(new g(paramArrayOfShort));
    while (true)
    {
      int i;
      try
      {
        a locala = new com/tencent/tinker/c/a/c/b$a;
        locala.<init>(this, (e)localObject);
        paramArrayOfShort.a(locala);
        localObject = new com/tencent/tinker/c/a/c/b$a;
        ((a)localObject).<init>(this, localf);
        paramArrayOfShort.a((e)localObject);
        i = localh.akp;
        if (i == localh.Azg.length)
        {
          paramArrayOfShort = localh.Azg;
          return paramArrayOfShort;
        }
      }
      catch (EOFException paramArrayOfShort)
      {
        throw new j(paramArrayOfShort);
      }
      paramArrayOfShort = new short[i];
      System.arraycopy(localh.Azg, 0, paramArrayOfShort, 0, i);
    }
  }

  final class a extends e
  {
    a(e arg2)
    {
      super();
    }

    private int ie(int paramInt1, int paramInt2)
    {
      switch (paramInt2)
      {
      default:
      case 3:
      case 2:
      case 5:
      case 4:
      }
      while (true)
      {
        return paramInt1;
        paramInt1 = b.this.AAK.RL(paramInt1);
        continue;
        paramInt1 = b.this.AAK.RM(paramInt1);
        continue;
        paramInt1 = b.this.AAK.RO(paramInt1);
        continue;
        paramInt1 = b.this.AAK.RP(paramInt1);
      }
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong)
    {
      super.a(paramInt1, paramInt2, ie(paramInt3, paramInt4), paramInt4, paramInt5, paramLong);
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6)
    {
      super.a(paramInt1, paramInt2, ie(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6);
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7)
    {
      super.a(paramInt1, paramInt2, ie(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7);
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7, int paramInt8)
    {
      super.a(paramInt1, paramInt2, ie(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7, paramInt8);
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
    {
      super.a(paramInt1, paramInt2, ie(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7, paramInt8, paramInt9);
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
    {
      super.a(paramInt1, paramInt2, ie(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
    }

    public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong, int paramInt6, int paramInt7)
    {
      super.b(paramInt1, paramInt2, ie(paramInt3, paramInt4), paramInt4, paramInt5, paramLong, paramInt6, paramInt7);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.c.b
 * JD-Core Version:    0.6.2
 */