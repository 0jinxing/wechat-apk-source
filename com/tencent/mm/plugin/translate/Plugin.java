package com.tencent.mm.plugin.translate;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  public o createApplication()
  {
    AppMethodBeat.i(26045);
    b localb = new b();
    AppMethodBeat.o(26045);
    return localb;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(26046);
    a locala = new a();
    AppMethodBeat.o(26046);
    return locala;
  }

  public com.tencent.mm.pluginsdk.b.b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.Plugin
 * JD-Core Version:    0.6.2
 */