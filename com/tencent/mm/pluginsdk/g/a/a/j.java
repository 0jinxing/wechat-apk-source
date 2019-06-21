package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

public final class j
{
  private static final int veA = i.b.vex.bJt;
  private static final int veB = i.b.vew.bJt;
  private static final int vez = i.b.vev.bJt;

  public static void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(79541);
    int i = veA;
    if (paramBoolean);
    for (int j = 0; ; j = 1)
    {
      a(paramInt1, paramInt2, "", paramInt3, i, j, j.a.veD.ordinal(), 1, 1, 1, paramString);
      AppMethodBeat.o(79541);
      return;
    }
  }

  public static void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, String paramString)
  {
    AppMethodBeat.i(79542);
    int i = veB;
    int j;
    int k;
    int m;
    label33: int n;
    if (paramBoolean1)
    {
      j = 0;
      k = j.a.veD.ordinal();
      if (!paramBoolean3)
        break label83;
      m = 0;
      if (!paramBoolean2)
        break label89;
      n = 0;
      label41: if (!paramBoolean4)
        break label95;
    }
    label83: label89: label95: for (int i1 = 0; ; i1 = 1)
    {
      a(paramInt1, paramInt2, "", paramInt3, i, j, k, m, n, i1, paramString);
      AppMethodBeat.o(79542);
      return;
      j = 1;
      break;
      m = 1;
      break label33;
      n = 1;
      break label41;
    }
  }

  private static void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, String paramString2)
  {
    AppMethodBeat.i(79543);
    h.pYm.e(11906, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), Integer.valueOf(paramInt8), Integer.valueOf(paramInt9) });
    if ((!bo.isNullOrNil(paramString2)) && (!paramString2.equals("0")))
      h.pYm.e(11907, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), Integer.valueOf(paramInt8), Integer.valueOf(paramInt9), paramString2 });
    AppMethodBeat.o(79543);
  }

  public static void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, j.a parama, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2)
  {
    AppMethodBeat.i(79540);
    int i = vez;
    int j;
    int k;
    int m;
    if (paramBoolean2)
    {
      j = 0;
      k = parama.ordinal();
      if (!paramBoolean3)
        break label73;
      m = 0;
      label33: if (!paramBoolean1)
        break label79;
    }
    label73: label79: for (int n = 0; ; n = 1)
    {
      a(paramInt1, paramInt2, paramString1, paramInt3, i, j, k, m, 1, n, paramString2);
      AppMethodBeat.o(79540);
      return;
      j = 1;
      break;
      m = 1;
      break label33;
    }
  }

  public static void mc(long paramLong)
  {
    AppMethodBeat.i(79539);
    z(paramLong, 2L);
    AppMethodBeat.o(79539);
  }

  public static void z(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(79538);
    if ((paramLong1 > 0L) && (197L != paramLong1))
      h.pYm.a(paramLong1, paramLong2, 1L, false);
    h.pYm.a(197L, paramLong2, 1L, false);
    AppMethodBeat.o(79538);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.j
 * JD-Core Version:    0.6.2
 */