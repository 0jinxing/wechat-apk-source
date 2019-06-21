package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n
{
  final w.b aMV;
  final w.a aMW;
  w aNc;
  int repeatMode;

  public n()
  {
    AppMethodBeat.i(95258);
    this.aMW = new w.a();
    this.aMV = new w.b();
    AppMethodBeat.o(95258);
  }

  private boolean a(i.b paramb, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(95266);
    int i = this.aNc.a(paramb.bhq, this.aMW, false).aNV;
    if ((!this.aNc.a(i, this.aMV).aPn) && (this.aNc.b(paramb.bhq, this.aMW, this.aMV, this.repeatMode)) && (paramBoolean))
    {
      paramBoolean = true;
      AppMethodBeat.o(95266);
    }
    while (true)
    {
      return paramBoolean;
      AppMethodBeat.o(95266);
      paramBoolean = bool;
    }
  }

  private boolean b(i.b paramb, long paramLong)
  {
    boolean bool1 = true;
    AppMethodBeat.i(95265);
    int i = this.aNc.a(paramb.bhq, this.aMW, false).qi();
    if (i == 0)
      AppMethodBeat.o(95265);
    while (true)
    {
      return bool1;
      int j = i - 1;
      boolean bool2 = paramb.sh();
      if (this.aMW.aPe[j] != -9223372036854775808L)
      {
        if ((!bool2) && (paramLong == -9223372036854775808L))
        {
          AppMethodBeat.o(95265);
        }
        else
        {
          AppMethodBeat.o(95265);
          bool1 = false;
        }
      }
      else
      {
        int k = this.aMW.aPf[j];
        if (k == -1)
        {
          AppMethodBeat.o(95265);
          bool1 = false;
        }
        else
        {
          if ((bool2) && (paramb.bhr == j) && (paramb.bhs == k - 1));
          for (i = 1; ; i = 0)
          {
            if ((i == 0) && ((bool2) || (this.aMW.aPh[j] != k)))
              break label199;
            AppMethodBeat.o(95265);
            break;
          }
          label199: AppMethodBeat.o(95265);
          bool1 = false;
        }
      }
    }
  }

  public final n.a a(n.a parama, int paramInt)
  {
    AppMethodBeat.i(95260);
    parama = a(parama, parama.aOx.em(paramInt));
    AppMethodBeat.o(95260);
    return parama;
  }

  final n.a a(n.a parama, i.b paramb)
  {
    AppMethodBeat.i(95261);
    long l1 = parama.aNR;
    long l2 = parama.aOy;
    boolean bool1 = b(paramb, l2);
    boolean bool2 = a(paramb, bool1);
    this.aNc.a(paramb.bhq, this.aMW, false);
    long l3;
    if (paramb.sh())
      l3 = this.aMW.bb(paramb.bhr, paramb.bhs);
    while (true)
    {
      parama = new n.a(paramb, l1, l2, parama.aNS, l3, bool1, bool2, (byte)0);
      AppMethodBeat.o(95261);
      return parama;
      if (l2 == -9223372036854775808L)
        l3 = this.aMW.aOz;
      else
        l3 = l2;
    }
  }

  final n.a a(i.b paramb, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95262);
    this.aNc.a(paramb.bhq, this.aMW, false);
    if (paramb.sh())
    {
      if (!this.aMW.ba(paramb.bhr, paramb.bhs))
      {
        paramb = null;
        AppMethodBeat.o(95262);
      }
      while (true)
      {
        return paramb;
        paramb = b(paramb.bhq, paramb.bhr, paramb.bhs, paramLong1);
        AppMethodBeat.o(95262);
      }
    }
    int i = this.aMW.G(paramLong2);
    if (i == -1);
    for (paramLong1 = -9223372036854775808L; ; paramLong1 = this.aMW.aPe[i])
    {
      paramb = c(paramb.bhq, paramLong2, paramLong1);
      AppMethodBeat.o(95262);
      break;
    }
  }

  final n.a b(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(95263);
    Object localObject = new i.b(paramInt1, paramInt2, paramInt3);
    boolean bool1 = b((i.b)localObject, -9223372036854775808L);
    boolean bool2 = a((i.b)localObject, bool1);
    long l1 = this.aNc.a(((i.b)localObject).bhq, this.aMW, false).bb(((i.b)localObject).bhr, ((i.b)localObject).bhs);
    if (paramInt3 == this.aMW.aPh[paramInt2]);
    for (long l2 = this.aMW.aPj; ; l2 = 0L)
    {
      localObject = new n.a((i.b)localObject, l2, -9223372036854775808L, paramLong, l1, bool1, bool2, (byte)0);
      AppMethodBeat.o(95263);
      return localObject;
    }
  }

  final n.a c(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95264);
    Object localObject = new i.b(paramInt);
    boolean bool1 = b((i.b)localObject, paramLong2);
    boolean bool2 = a((i.b)localObject, bool1);
    this.aNc.a(((i.b)localObject).bhq, this.aMW, false);
    if (paramLong2 == -9223372036854775808L);
    for (long l = this.aMW.aOz; ; l = paramLong2)
    {
      localObject = new n.a((i.b)localObject, paramLong1, paramLong2, -9223372036854775807L, l, bool1, bool2, (byte)0);
      AppMethodBeat.o(95264);
      return localObject;
    }
  }

  public final i.b g(int paramInt, long paramLong)
  {
    AppMethodBeat.i(95259);
    this.aNc.a(paramInt, this.aMW, false);
    int i = this.aMW.F(paramLong);
    i.b localb;
    if (i == -1)
    {
      localb = new i.b(paramInt);
      AppMethodBeat.o(95259);
    }
    while (true)
    {
      return localb;
      localb = new i.b(paramInt, i, this.aMW.aPh[i]);
      AppMethodBeat.o(95259);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.n
 * JD-Core Version:    0.6.2
 */