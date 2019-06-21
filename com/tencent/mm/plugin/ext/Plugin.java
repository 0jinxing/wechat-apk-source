package com.tencent.mm.plugin.ext;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  public o createApplication()
  {
    AppMethodBeat.i(20260);
    a locala = new a();
    AppMethodBeat.o(20260);
    return locala;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(20259);
    b localb = new b();
    AppMethodBeat.o(20259);
    return localb;
  }

  public com.tencent.mm.pluginsdk.b.b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.Plugin
 * JD-Core Version:    0.6.2
 */