package com.tencent.mm.plugin.webview.luggage.permission;

import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.protocal.c.g;
import java.util.HashSet;
import java.util.Set;

public final class c
  implements a
{
  private d uiI;
  private LuggageGetA8Key uii;
  private Set<String> ulu;

  public c(d paramd, LuggageGetA8Key paramLuggageGetA8Key)
  {
    AppMethodBeat.i(6490);
    this.ulu = new HashSet();
    this.uiI = paramd;
    this.uii = paramLuggageGetA8Key;
    AppMethodBeat.o(6490);
  }

  public final void a(com.tencent.luggage.d.a.c paramc)
  {
    AppMethodBeat.i(6492);
    paramc.a(b.bPW);
    AppMethodBeat.o(6492);
  }

  public final void a(String paramString, com.tencent.luggage.d.a.c paramc)
  {
    AppMethodBeat.i(6493);
    if (this.ulu.contains(paramString))
    {
      this.ulu.remove(paramString);
      paramc.a(b.bPW);
      AppMethodBeat.o(6493);
      return;
    }
    LuggageGetA8Key localLuggageGetA8Key = this.uii;
    String str = this.uiI.getUrl();
    paramString = com.tencent.mm.protocal.c.akD(paramString);
    int i;
    if (paramString == null)
    {
      i = -1;
      label72: if (!localLuggageGetA8Key.dA(str, i))
        break label112;
    }
    label112: for (paramString = b.bPW; ; paramString = b.bPX)
    {
      paramc.a(paramString);
      AppMethodBeat.o(6493);
      break;
      i = paramString.dmb();
      break label72;
    }
  }

  public final void aen(String paramString)
  {
    AppMethodBeat.i(6491);
    this.ulu.add(paramString);
    AppMethodBeat.o(6491);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.permission.c
 * JD-Core Version:    0.6.2
 */