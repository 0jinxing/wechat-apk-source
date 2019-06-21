package com.tencent.mm.plugin.ipcall;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  b nvj;

  public Plugin()
  {
    AppMethodBeat.i(21703);
    this.nvj = new b();
    AppMethodBeat.o(21703);
  }

  public o createApplication()
  {
    return this.nvj;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(21704);
    i locali = i.bHp();
    AppMethodBeat.o(21704);
    return locali;
  }

  public com.tencent.mm.pluginsdk.b.b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.Plugin
 * JD-Core Version:    0.6.2
 */