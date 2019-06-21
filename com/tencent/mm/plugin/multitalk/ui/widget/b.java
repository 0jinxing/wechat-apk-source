package com.tencent.mm.plugin.multitalk.ui.widget;

import android.content.Context;
import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.ae;

public final class b
{
  public static final int oIa;
  public static final int oIb;
  public static final int oIc;
  public static final int oId;
  public static final int oIe;
  public static final int oIf;
  public static final int oIg;
  public static final int oIh;
  public static final int oIi;
  public static final int oIj;
  public static final int oIk;
  private static int oIl;

  static
  {
    AppMethodBeat.i(54187);
    oIa = a.fromDPToPix(ah.getContext(), 3);
    oIb = a.fromDPToPix(ah.getContext(), 4);
    oIc = a.fromDPToPix(ah.getContext(), 8);
    oId = a.fromDPToPix(ah.getContext(), 10);
    oIe = a.fromDPToPix(ah.getContext(), 14);
    oIf = a.fromDPToPix(ah.getContext(), 30);
    oIg = a.fromDPToPix(ah.getContext(), 26);
    oIh = a.fromDPToPix(ah.getContext(), 32);
    oIi = a.fromDPToPix(ah.getContext(), 96);
    oIj = a.fromDPToPix(ah.getContext(), 76);
    oIk = a.fromDPToPix(ah.getContext(), 230);
    oIl = 0;
    AppMethodBeat.o(54187);
  }

  public static int eC(Context paramContext)
  {
    AppMethodBeat.i(54186);
    if (oIl <= 0)
    {
      paramContext = ae.hy(paramContext);
      oIl = paramContext.y - oIk;
      ab.i("MicroMsg.MultiTalkDimensUtil", "getMultiTalkAvatarBoardHeight, displaySize: %s, MultiTalkAvatarBoardHeight: %s", new Object[] { paramContext, Integer.valueOf(oIl) });
    }
    int i = oIl;
    AppMethodBeat.o(54186);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.widget.b
 * JD-Core Version:    0.6.2
 */