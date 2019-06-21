package com.tencent.mm.plugin.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.q;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.plugin.audio.a.a;

public class PluginVoice extends f
  implements a
{
  public void execute(g paramg)
  {
    AppMethodBeat.i(116801);
    if (paramg.SG())
      pin(new q(m.class));
    AppMethodBeat.o(116801);
  }

  public String name()
  {
    return "plugin-voice";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.audio.PluginVoice
 * JD-Core Version:    0.6.2
 */