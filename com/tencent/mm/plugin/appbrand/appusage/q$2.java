package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.w;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.protocal.protobuf.ard;
import com.tencent.mm.protocal.protobuf.are;

final class q$2
  implements com.tencent.mm.modelgeo.b.a
{
  private int gZI = 0;

  q$2(PBool paramPBool1, PBool paramPBool2)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(129600);
    e.at(this);
    d.agz().c(this);
    paramInt = this.gZI + 1;
    this.gZI = paramInt;
    if ((paramInt > 1) || (this.gZH.value))
      AppMethodBeat.o(129600);
    while (true)
    {
      return false;
      this.gZG.value = true;
      if (paramBoolean)
        break;
      q.a(null);
      AppMethodBeat.o(129600);
    }
    com.tencent.mm.ai.b.a locala = new com.tencent.mm.ai.b.a();
    locala.fsI = 1056;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxaappnearby";
    ard localard = new ard();
    localard.wuQ = paramFloat1;
    localard.wuR = paramFloat2;
    if (!q.axo());
    for (paramBoolean = true; ; paramBoolean = false)
    {
      localard.wuT = paramBoolean;
      locala.fsJ = localard;
      locala.fsK = new are();
      w.a(locala.acD(), new q.2.1(this), true);
      AppMethodBeat.o(129600);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.q.2
 * JD-Core Version:    0.6.2
 */