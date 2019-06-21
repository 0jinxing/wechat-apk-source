package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.wear.model.d.a;
import com.tencent.mm.plugin.wear.model.f.d;
import com.tencent.mm.protocal.protobuf.ctv;

final class b$b extends d
{
  private ctv tXH;

  public b$b(b paramb, ctv paramctv)
  {
    this.tXH = paramctv;
  }

  public final void execute()
  {
    AppMethodBeat.i(26279);
    aw.Rg().a(1091, this.tXG);
    a locala = new a(this.tXH.xqs, "gh_43f2581f6fd6");
    aw.Rg().a(locala, 0);
    AppMethodBeat.o(26279);
  }

  public final String getName()
  {
    return "RegisterDeviceTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.b.b
 * JD-Core Version:    0.6.2
 */