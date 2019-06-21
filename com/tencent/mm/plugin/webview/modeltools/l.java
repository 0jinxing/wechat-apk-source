package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;

public final class l
{
  public HashMap<String, a> upC;
  public HashMap<String, a> upD;
  private HashSet<Integer> upE;

  public l()
  {
    AppMethodBeat.i(7031);
    this.upC = new HashMap();
    this.upD = new HashMap();
    this.upE = new HashSet();
    AppMethodBeat.o(7031);
  }

  public final boolean IS(int paramInt)
  {
    AppMethodBeat.i(7033);
    boolean bool = this.upE.remove(Integer.valueOf(paramInt));
    AppMethodBeat.o(7033);
    return bool;
  }

  public final void bE(int paramInt, String paramString)
  {
    AppMethodBeat.i(7032);
    if (bo.getBoolean(paramString, false))
    {
      this.upE.add(Integer.valueOf(paramInt));
      AppMethodBeat.o(7032);
    }
    while (true)
    {
      return;
      this.upE.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(7032);
    }
  }

  public static final class a
  {
    public String desc;
    public String link;
    public String rid;
    public String title;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.l
 * JD-Core Version:    0.6.2
 */