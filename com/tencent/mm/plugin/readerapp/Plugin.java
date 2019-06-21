package com.tencent.mm.plugin.readerapp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.readerapp.b.a;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public final class Plugin
  implements c
{
  private b jJC;

  public Plugin()
  {
    AppMethodBeat.i(76737);
    this.jJC = new Plugin.1(this);
    AppMethodBeat.o(76737);
  }

  public final o createApplication()
  {
    AppMethodBeat.i(76738);
    a locala = new a();
    AppMethodBeat.o(76738);
    return locala;
  }

  public final at createSubCore()
  {
    return null;
  }

  public final b getContactWidgetFactory()
  {
    return this.jJC;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.Plugin
 * JD-Core Version:    0.6.2
 */