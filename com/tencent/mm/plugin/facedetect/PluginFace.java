package com.tencent.mm.plugin.facedetect;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.c;

public class PluginFace extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.plugin.facedetect.a.a
{
  public void execute(g paramg)
  {
    AppMethodBeat.i(51);
    ab.i("MicroMsg.PluginFace", "hy: starting execute.");
    if (paramg.SG())
      com.tencent.mm.vending.g.f.dMn().d(new a()).a(new PluginFace.1(this));
    AppMethodBeat.o(51);
  }

  public String name()
  {
    return "plugin-facedetect";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.PluginFace
 * JD-Core Version:    0.6.2
 */