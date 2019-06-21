package com.tencent.mm.plugin.shake;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  private b qrp;

  public Plugin()
  {
    AppMethodBeat.i(24408);
    this.qrp = new Plugin.1(this);
    AppMethodBeat.o(24408);
  }

  public o createApplication()
  {
    AppMethodBeat.i(24409);
    a locala = new a();
    AppMethodBeat.o(24409);
    return locala;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(24410);
    m localm = new m();
    AppMethodBeat.o(24410);
    return localm;
  }

  public b getContactWidgetFactory()
  {
    return this.qrp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.Plugin
 * JD-Core Version:    0.6.2
 */