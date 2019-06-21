package com.google.b.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$b
{
  final int bBF;
  final c.a[] bBG;

  c$b(int paramInt, c.a[] paramArrayOfa)
  {
    this.bBF = paramInt;
    this.bBG = paramArrayOfa;
  }

  public final int vL()
  {
    c.a[] arrayOfa = this.bBG;
    int i = arrayOfa.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m + k)
    {
      m = arrayOfa[j].count;
      j++;
    }
    return k;
  }

  public final int vM()
  {
    AppMethodBeat.i(57176);
    int i = this.bBF;
    int j = vL();
    AppMethodBeat.o(57176);
    return i * j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.b.f.a.c.b
 * JD-Core Version:    0.6.2
 */