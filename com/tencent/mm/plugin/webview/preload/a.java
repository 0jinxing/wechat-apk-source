package com.tencent.mm.plugin.webview.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static void IT(int paramInt)
  {
    AppMethodBeat.i(80438);
    e(974, paramInt, 1, false);
    AppMethodBeat.o(80438);
  }

  public static void IU(int paramInt)
  {
    AppMethodBeat.i(80442);
    ae(paramInt, 1L);
    AppMethodBeat.o(80442);
  }

  public static void ae(int paramInt, long paramLong)
  {
    AppMethodBeat.i(80443);
    h.pYm.k(1009L, paramInt, paramLong);
    AppMethodBeat.o(80443);
  }

  public static void e(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(80441);
    ab.i("ConstantsPreload", "id:%d, key:%d, valye:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    h.pYm.a(paramInt1, paramInt2, paramInt3, false);
    if ((paramBoolean) && (paramInt1 != 908) && (paramInt1 != 0))
      h.pYm.a(908L, paramInt2, paramInt3, false);
    h.pYm.e(15792, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(80441);
  }

  public static void gu(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138538);
    e(paramInt1, paramInt2, 1, true);
    AppMethodBeat.o(138538);
  }

  public static void gv(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(80440);
    e(908, paramInt1, paramInt2, true);
    AppMethodBeat.o(80440);
  }

  public static void kT(int paramInt)
  {
    AppMethodBeat.i(80437);
    e(908, paramInt, 1, true);
    AppMethodBeat.o(80437);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.preload.a
 * JD-Core Version:    0.6.2
 */