package com.tencent.mm.plugin.wallet_core;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.wallet_core.a.a;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  public o createApplication()
  {
    AppMethodBeat.i(46465);
    a locala = new a();
    AppMethodBeat.o(46465);
    return locala;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(46466);
    r localr = new r();
    AppMethodBeat.o(46466);
    return localr;
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.Plugin
 * JD-Core Version:    0.6.2
 */