package com.tencent.mm.plugin.radar.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/model/RadarManager$Status;", "", "(Ljava/lang/String;I)V", "Stopped", "Locating", "RadarSearching", "Waiting", "plugin-radar_release"})
 enum e$f
{
  static
  {
    AppMethodBeat.i(102914);
    f localf1 = new f("Stopped", 0);
    pBS = localf1;
    f localf2 = new f("Locating", 1);
    pBT = localf2;
    f localf3 = new f("RadarSearching", 2);
    pBU = localf3;
    f localf4 = new f("Waiting", 3);
    pBV = localf4;
    pBW = new f[] { localf1, localf2, localf3, localf4 };
    AppMethodBeat.o(102914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.e.f
 * JD-Core Version:    0.6.2
 */