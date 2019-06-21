package com.google.b.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class e
{
  private final CharSequence bzD;
  private final int bzE;
  public final int bzF;
  public final byte[] bzG;

  public e(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57167);
    this.bzD = paramCharSequence;
    this.bzF = paramInt1;
    this.bzE = paramInt2;
    this.bzG = new byte[paramInt1 * paramInt2];
    Arrays.fill(this.bzG, (byte)-1);
    AppMethodBeat.o(57167);
  }

  private void A(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(57170);
    q(paramInt1 - 2, paramInt2 - 2, paramInt3, 1);
    q(paramInt1 - 2, paramInt2 - 1, paramInt3, 2);
    q(paramInt1 - 1, paramInt2 - 2, paramInt3, 3);
    q(paramInt1 - 1, paramInt2 - 1, paramInt3, 4);
    q(paramInt1 - 1, paramInt2, paramInt3, 5);
    q(paramInt1, paramInt2 - 2, paramInt3, 6);
    q(paramInt1, paramInt2 - 1, paramInt3, 7);
    q(paramInt1, paramInt2, paramInt3, 8);
    AppMethodBeat.o(57170);
  }

  private boolean bF(int paramInt1, int paramInt2)
  {
    if (this.bzG[(this.bzF * paramInt2 + paramInt1)] >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void f(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte = this.bzG;
    int i = this.bzF;
    if (paramBoolean);
    for (int j = 1; ; j = 0)
    {
      arrayOfByte[(i * paramInt2 + paramInt1)] = ((byte)(byte)j);
      return;
    }
  }

  private void q(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = true;
    AppMethodBeat.i(57169);
    if (paramInt1 < 0)
    {
      paramInt1 += this.bzE;
      paramInt2 = 4 - (this.bzE + 4) % 8 + paramInt2;
    }
    while (true)
    {
      int i = paramInt2;
      int j = paramInt1;
      if (paramInt2 < 0)
      {
        i = paramInt2 + this.bzF;
        j = paramInt1 + (4 - (this.bzF + 4) % 8);
      }
      if ((this.bzD.charAt(paramInt3) & 1 << 8 - paramInt4) != 0);
      while (true)
      {
        f(i, j, bool);
        AppMethodBeat.o(57169);
        return;
        bool = false;
      }
    }
  }

  public final void vw()
  {
    AppMethodBeat.i(57168);
    int i = 0;
    int j = 4;
    int k = 0;
    int m = k;
    if (j == this.bzE)
    {
      m = k;
      if (i == 0)
      {
        q(this.bzE - 1, 0, k, 1);
        q(this.bzE - 1, 1, k, 2);
        q(this.bzE - 1, 2, k, 3);
        q(0, this.bzF - 2, k, 4);
        q(0, this.bzF - 1, k, 5);
        q(1, this.bzF - 1, k, 6);
        q(2, this.bzF - 1, k, 7);
        q(3, this.bzF - 1, k, 8);
        m = k + 1;
      }
    }
    int n = m;
    if (j == this.bzE - 2)
    {
      n = m;
      if (i == 0)
      {
        n = m;
        if (this.bzF % 4 != 0)
        {
          q(this.bzE - 3, 0, m, 1);
          q(this.bzE - 2, 0, m, 2);
          q(this.bzE - 1, 0, m, 3);
          q(0, this.bzF - 4, m, 4);
          q(0, this.bzF - 3, m, 5);
          q(0, this.bzF - 2, m, 6);
          q(0, this.bzF - 1, m, 7);
          q(1, this.bzF - 1, m, 8);
          n = m + 1;
        }
      }
    }
    k = n;
    if (j == this.bzE - 2)
    {
      k = n;
      if (i == 0)
      {
        k = n;
        if (this.bzF % 8 == 4)
        {
          q(this.bzE - 3, 0, n, 1);
          q(this.bzE - 2, 0, n, 2);
          q(this.bzE - 1, 0, n, 3);
          q(0, this.bzF - 2, n, 4);
          q(0, this.bzF - 1, n, 5);
          q(1, this.bzF - 1, n, 6);
          q(2, this.bzF - 1, n, 7);
          q(3, this.bzF - 1, n, 8);
          k = n + 1;
        }
      }
    }
    n = i;
    int i1 = j;
    m = k;
    if (j == this.bzE + 4)
    {
      n = i;
      i1 = j;
      m = k;
      if (i == 2)
      {
        n = i;
        i1 = j;
        m = k;
        if (this.bzF % 8 == 0)
        {
          q(this.bzE - 1, 0, k, 1);
          q(this.bzE - 1, this.bzF - 1, k, 2);
          q(0, this.bzF - 3, k, 3);
          q(0, this.bzF - 2, k, 4);
          q(0, this.bzF - 1, k, 5);
          q(1, this.bzF - 3, k, 6);
          q(1, this.bzF - 2, k, 7);
          q(1, this.bzF - 1, k, 8);
          m = k + 1;
          i1 = j;
          n = i;
        }
      }
    }
    do
    {
      j = m;
      if (i1 < this.bzE)
      {
        j = m;
        if (n >= 0)
        {
          j = m;
          if (!bF(n, i1))
          {
            A(i1, n, m);
            j = m + 1;
          }
        }
      }
      i = i1 - 2;
      k = n + 2;
      if (i < 0)
        break;
      n = k;
      i1 = i;
      m = j;
    }
    while (k < this.bzF);
    k += 3;
    i++;
    m = j;
    j = k;
    label717: if ((i >= 0) && (j < this.bzF) && (!bF(j, i)))
    {
      k = m + 1;
      A(i, j, m);
      m = k;
    }
    while (true)
    {
      i += 2;
      j -= 2;
      if ((i >= this.bzE) || (j < 0))
      {
        n = i + 3;
        i1 = j + 1;
        i = i1;
        j = n;
        k = m;
        if (n < this.bzE)
          break;
        i = i1;
        j = n;
        k = m;
        if (i1 < this.bzF)
          break;
        if (!bF(this.bzF - 1, this.bzE - 1))
        {
          f(this.bzF - 1, this.bzE - 1, true);
          f(this.bzF - 2, this.bzE - 2, true);
        }
        AppMethodBeat.o(57168);
        return;
      }
      break label717;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.e
 * JD-Core Version:    0.6.2
 */