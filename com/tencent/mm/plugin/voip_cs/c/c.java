package com.tencent.mm.plugin.voip_cs.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class c
{
  public static final int oIa;
  public static final int oIb;
  public static final int oIc;
  public static final int oId;
  public static final int oIe;
  public static final int oIf;
  public static final int oIh;
  public static final int oIi;
  public static final int oIj;
  public static final int oIk;
  private static int teQ;

  static
  {
    AppMethodBeat.i(135441);
    oIa = a.fromDPToPix(ah.getContext(), 3);
    oIb = a.fromDPToPix(ah.getContext(), 4);
    oIc = a.fromDPToPix(ah.getContext(), 8);
    oId = a.fromDPToPix(ah.getContext(), 10);
    oIe = a.fromDPToPix(ah.getContext(), 14);
    oIf = a.fromDPToPix(ah.getContext(), 30);
    oIh = a.fromDPToPix(ah.getContext(), 32);
    oIi = a.fromDPToPix(ah.getContext(), 96);
    oIj = a.fromDPToPix(ah.getContext(), 76);
    oIk = a.fromDPToPix(ah.getContext(), 230);
    teQ = 0;
    AppMethodBeat.o(135441);
  }

  public static int fj(Context paramContext)
  {
    AppMethodBeat.i(135440);
    if (teQ == 0)
      teQ = a.ge(paramContext);
    int i = teQ;
    AppMethodBeat.o(135440);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.c.c
 * JD-Core Version:    0.6.2
 */