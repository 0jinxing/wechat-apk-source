package com.tencent.mm.plugin.appbrand.dynamic;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class i
{
  private static final i hlI;
  private Map<String, String> hlH;

  static
  {
    AppMethodBeat.i(10702);
    hlI = new i();
    AppMethodBeat.o(10702);
  }

  public i()
  {
    AppMethodBeat.i(10697);
    this.hlH = new HashMap();
    AppMethodBeat.o(10697);
  }

  public static i azC()
  {
    return hlI;
  }

  public final Collection<String> azD()
  {
    AppMethodBeat.i(10701);
    Collection localCollection = this.hlH.values();
    AppMethodBeat.o(10701);
    return localCollection;
  }

  public final void bK(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10698);
    if (TextUtils.isEmpty(paramString2))
      AppMethodBeat.o(10698);
    while (true)
    {
      return;
      this.hlH.put(paramString1, paramString2);
      AppMethodBeat.o(10698);
    }
  }

  public final String zV(String paramString)
  {
    AppMethodBeat.i(10699);
    paramString = (String)this.hlH.get(paramString);
    AppMethodBeat.o(10699);
    return paramString;
  }

  public final void zW(String paramString)
  {
    AppMethodBeat.i(10700);
    this.hlH.remove(paramString);
    AppMethodBeat.o(10700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.i
 * JD-Core Version:    0.6.2
 */