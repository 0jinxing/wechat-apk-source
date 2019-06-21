package com.tencent.mm.plugin.masssend;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.masssend.a.h;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  private b jJC;

  public Plugin()
  {
    AppMethodBeat.i(22718);
    this.jJC = new Plugin.1(this);
    AppMethodBeat.o(22718);
  }

  public o createApplication()
  {
    AppMethodBeat.i(22719);
    a locala = new a();
    AppMethodBeat.o(22719);
    return locala;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(22720);
    h localh = new h();
    AppMethodBeat.o(22720);
    return localh;
  }

  public b getContactWidgetFactory()
  {
    return this.jJC;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.Plugin
 * JD-Core Version:    0.6.2
 */