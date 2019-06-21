package com.tencent.mm.plugin.wallet_ecard;

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
    return null;
  }

  public at createSubCore()
  {
    AppMethodBeat.i(48037);
    a locala = new a();
    AppMethodBeat.o(48037);
    return locala;
  }

  public b getContactWidgetFactory()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.Plugin
 * JD-Core Version:    0.6.2
 */