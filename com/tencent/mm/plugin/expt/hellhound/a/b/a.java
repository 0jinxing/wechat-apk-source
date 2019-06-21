package com.tencent.mm.plugin.expt.hellhound.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  private static a lMU;
  private List<Object> mq;

  private a()
  {
    AppMethodBeat.i(73461);
    if (com.tencent.mm.plugin.expt.hellhound.core.b.bqo())
      com.tencent.mm.plugin.expt.hellhound.core.a.b.v("mmkv_key_session_page", new byte[0]);
    this.mq = new ArrayList();
    AppMethodBeat.o(73461);
  }

  public static a bqG()
  {
    AppMethodBeat.i(73460);
    if (lMU == null);
    try
    {
      if (lMU == null)
      {
        locala = new com/tencent/mm/plugin/expt/hellhound/a/b/a;
        locala.<init>();
        lMU = locala;
      }
      a locala = lMU;
      AppMethodBeat.o(73460);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(73460);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.a.b.a
 * JD-Core Version:    0.6.2
 */