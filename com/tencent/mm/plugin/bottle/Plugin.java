package com.tencent.mm.plugin.bottle;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.bottle.a.d;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public final class Plugin
  implements c
{
  private b jJC;

  public Plugin()
  {
    AppMethodBeat.i(18529);
    this.jJC = new Plugin.1(this);
    AppMethodBeat.o(18529);
  }

  public final o createApplication()
  {
    AppMethodBeat.i(18530);
    a locala = new a();
    AppMethodBeat.o(18530);
    return locala;
  }

  public final at createSubCore()
  {
    AppMethodBeat.i(18531);
    d locald = new d();
    AppMethodBeat.o(18531);
    return locald;
  }

  public final b getContactWidgetFactory()
  {
    return this.jJC;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.Plugin
 * JD-Core Version:    0.6.2
 */