package com.tencent.mm.plugin.voiceprint;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.voiceprint.a.a;
import com.tencent.mm.plugin.voiceprint.model.k;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  public o createApplication()
  {
    AppMethodBeat.i(26073);
    a locala = new a();
    AppMethodBeat.o(26073);
    return locala;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(26074);
    k localk = new k();
    AppMethodBeat.o(26074);
    return localk;
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.Plugin
 * JD-Core Version:    0.6.2
 */