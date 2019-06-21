package com.tencent.mm.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class b
{
  public String eyp;
  public String fnS;
  public String fnT;
  public String fnU;
  public HashMap<String, e> fnV;

  public b()
  {
    AppMethodBeat.i(118140);
    this.fnV = new HashMap();
    AppMethodBeat.o(118140);
  }

  public final e oP(String paramString)
  {
    AppMethodBeat.i(118141);
    if ((this.fnV != null) && (this.fnV.containsKey(paramString)))
    {
      paramString = (e)this.fnV.get(paramString);
      AppMethodBeat.o(118141);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(118141);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.a.b
 * JD-Core Version:    0.6.2
 */