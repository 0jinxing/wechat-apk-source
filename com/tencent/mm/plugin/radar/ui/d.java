package com.tencent.mm.plugin.radar.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarPressDetector;", "", "()V", "PressIsClickDuringThreshold", "", "getPressIsClickDuringThreshold", "()I", "PressTooShortDuringThreshold", "getPressTooShortDuringThreshold", "isClick", "", "during", "", "isPress", "isTooShort", "plugin-radar_release"})
public final class d
{
  private static final int pCA = 1000;
  private static final int pCB = 500;
  public static final d pCC;

  static
  {
    AppMethodBeat.i(102988);
    pCC = new d();
    pCA = 1000;
    pCB = 500;
    AppMethodBeat.o(102988);
  }

  public static int cdH()
  {
    return pCA;
  }

  public static boolean jz(long paramLong)
  {
    if (paramLong <= pCB);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.d
 * JD-Core Version:    0.6.2
 */