package com.google.b.a.a;

import com.google.b.b.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

final class f
{
  static final f byy;
  final int byA;
  final int byB;
  private final g byz;
  final int mode;

  static
  {
    AppMethodBeat.i(57303);
    byy = new f(g.byC, 0, 0, 0);
    AppMethodBeat.o(57303);
  }

  private f(g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    this.byz = paramg;
    this.mode = paramInt1;
    this.byA = paramInt2;
    this.byB = paramInt3;
  }

  final boolean a(f paramf)
  {
    int i = this.byB + (d.bys[this.mode][paramf.mode] >> 16);
    int j = i;
    if (paramf.byA > 0)
      if (this.byA != 0)
      {
        j = i;
        if (this.byA <= paramf.byA);
      }
      else
      {
        j = i + 10;
      }
    if (j <= paramf.byB);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final f bw(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57297);
    int i = this.byB;
    Object localObject = this.byz;
    int j;
    if (paramInt1 != this.mode)
    {
      j = d.bys[this.mode][paramInt1];
      localObject = ((g)localObject).by(0xFFFF & j, j >> 16);
      i += (j >> 16);
    }
    while (true)
    {
      if (paramInt1 == 2);
      for (j = 4; ; j = 5)
      {
        localObject = new f(((g)localObject).by(paramInt2, j), paramInt1, 0, j + i);
        AppMethodBeat.o(57297);
        return localObject;
      }
    }
  }

  final f bx(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57298);
    Object localObject = this.byz;
    if (this.mode == 2);
    for (int i = 4; ; i = 5)
    {
      localObject = new f(((g)localObject).by(d.byu[this.mode][paramInt1], i).by(paramInt2, 5), this.mode, 0, i + this.byB + 5);
      AppMethodBeat.o(57298);
      return localObject;
    }
  }

  final f fA(int paramInt)
  {
    AppMethodBeat.i(57299);
    g localg = this.byz;
    int i = this.mode;
    int j = this.byB;
    int k;
    int m;
    Object localObject;
    if (this.mode != 4)
    {
      k = j;
      m = i;
      localObject = localg;
      if (this.mode != 2);
    }
    else
    {
      m = d.bys[i][0];
      localObject = localg.by(0xFFFF & m, m >> 16);
      k = j + (m >> 16);
      m = 0;
    }
    if ((this.byA == 0) || (this.byA == 31))
    {
      j = 18;
      localObject = new f((g)localObject, m, this.byA + 1, k + j);
      if (((f)localObject).byA != 2078)
        break label181;
      localObject = ((f)localObject).fB(paramInt + 1);
    }
    label181: 
    while (true)
    {
      AppMethodBeat.o(57299);
      return localObject;
      if (this.byA == 62)
      {
        j = 9;
        break;
      }
      j = 8;
      break;
    }
  }

  final f fB(int paramInt)
  {
    AppMethodBeat.i(57300);
    f localf;
    if (this.byA == 0)
    {
      AppMethodBeat.o(57300);
      localf = this;
    }
    while (true)
    {
      return localf;
      localf = new f(this.byz.bz(paramInt - this.byA, this.byA), this.mode, 0, this.byB);
      AppMethodBeat.o(57300);
    }
  }

  final a r(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(57301);
    Object localObject1 = new LinkedList();
    for (Object localObject2 = fB(paramArrayOfByte.length).byz; localObject2 != null; localObject2 = ((g)localObject2).byD)
      ((Deque)localObject1).addFirst(localObject2);
    localObject2 = new a();
    localObject1 = ((Deque)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((g)((Iterator)localObject1).next()).a((a)localObject2, paramArrayOfByte);
    AppMethodBeat.o(57301);
    return localObject2;
  }

  public final String toString()
  {
    AppMethodBeat.i(57302);
    String str = String.format("%s bits=%d bytes=%d", new Object[] { d.byr[this.mode], Integer.valueOf(this.byB), Integer.valueOf(this.byA) });
    AppMethodBeat.o(57302);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.b.a.a.f
 * JD-Core Version:    0.6.2
 */