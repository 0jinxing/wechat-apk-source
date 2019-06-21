package com.tencent.mm.plugin.sandbox;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin
  implements c
{
  public o createApplication()
  {
    AppMethodBeat.i(24379);
    a locala = new a();
    AppMethodBeat.o(24379);
    return locala;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(24380);
    SubCoreSandBox localSubCoreSandBox = new SubCoreSandBox();
    AppMethodBeat.o(24380);
    return localSubCoreSandBox;
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sandbox.Plugin
 * JD-Core Version:    0.6.2
 */