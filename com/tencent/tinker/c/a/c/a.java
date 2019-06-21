package com.tencent.tinker.c.a.c;

import com.tencent.tinker.a.a.e.a;
import com.tencent.tinker.a.a.e.b;
import java.io.ByteArrayInputStream;

public abstract class a
{
  public abstract int RL(int paramInt);

  public abstract int RM(int paramInt);

  public abstract int RN(int paramInt);

  public abstract int RO(int paramInt);

  public abstract int RP(int paramInt);

  public abstract int RQ(int paramInt);

  public abstract int RR(int paramInt);

  public abstract int RS(int paramInt);

  public abstract int RT(int paramInt);

  public abstract int RU(int paramInt);

  public abstract int RV(int paramInt);

  public abstract int RW(int paramInt);

  public abstract int RX(int paramInt);

  public abstract int RY(int paramInt);

  public final e.a[] b(e.a[] paramArrayOfa)
  {
    e.a[] arrayOfa = new e.a[paramArrayOfa.length];
    for (int i = 0; i < paramArrayOfa.length; i++)
    {
      e.a locala = paramArrayOfa[i];
      arrayOfa[i] = new e.a(RO(locala.Axw), locala.Axx);
    }
    return arrayOfa;
  }

  public final e.b[] b(e.b[] paramArrayOfb)
  {
    e.b[] arrayOfb = new e.b[paramArrayOfb.length];
    for (int i = 0; i < paramArrayOfb.length; i++)
    {
      e.b localb = paramArrayOfb[i];
      int j = RP(localb.Axy);
      int k = RY(localb.Axz);
      arrayOfb[i] = new e.b(j, localb.Axx, k);
    }
    return arrayOfb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.c.a
 * JD-Core Version:    0.6.2
 */