package com.tencent.mm.plugin.nearby;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.nearby.a.f;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  private b jJC;

  public Plugin()
  {
    AppMethodBeat.i(55349);
    this.jJC = new Plugin.1(this);
    AppMethodBeat.o(55349);
  }

  public o createApplication()
  {
    AppMethodBeat.i(55350);
    a locala = new a();
    AppMethodBeat.o(55350);
    return locala;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(55351);
    f localf = new f();
    AppMethodBeat.o(55351);
    return localf;
  }

  public b getContactWidgetFactory()
  {
    return this.jJC;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.Plugin
 * JD-Core Version:    0.6.2
 */