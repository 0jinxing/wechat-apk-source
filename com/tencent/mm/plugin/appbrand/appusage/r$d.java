package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Arrays;

public final class r$d
{
  public final String[] haa;

  public r$d()
  {
    AppMethodBeat.i(129628);
    this.haa = new String[9];
    Arrays.fill(this.haa, "0");
    this.haa[0] = ((String)g.RP().Ry().get(ac.a.xOe, ""));
    this.haa[1] = String.valueOf(g.RP().Ry().get(ac.a.xOf, Long.valueOf(0L)));
    this.haa[2] = String.valueOf(bo.anT());
    AppMethodBeat.o(129628);
  }

  public final void axA()
  {
    this.haa[5] = "1";
  }

  public final void axB()
  {
    this.haa[8] = "1";
  }

  public final void axz()
  {
    this.haa[3] = "1";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.r.d
 * JD-Core Version:    0.6.2
 */