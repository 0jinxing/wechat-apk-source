package com.tencent.mm.plugin.qmessage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.qmessage.a.g;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  private b jJC;

  public Plugin()
  {
    AppMethodBeat.i(24064);
    this.jJC = new Plugin.1(this);
    AppMethodBeat.o(24064);
  }

  public o createApplication()
  {
    AppMethodBeat.i(24065);
    a locala = new a();
    AppMethodBeat.o(24065);
    return locala;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(24066);
    g localg = new g();
    AppMethodBeat.o(24066);
    return localg;
  }

  public b getContactWidgetFactory()
  {
    return this.jJC;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.Plugin
 * JD-Core Version:    0.6.2
 */