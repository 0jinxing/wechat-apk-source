package com.tinkerboots.sdk.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  public final Map<String, String> AUb;

  public a()
  {
    AppMethodBeat.i(65533);
    this.AUb = new HashMap();
    AppMethodBeat.o(65533);
  }

  public final a iQ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65534);
    this.AUb.put(paramString1, paramString2);
    AppMethodBeat.o(65534);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.a.c.a
 * JD-Core Version:    0.6.2
 */