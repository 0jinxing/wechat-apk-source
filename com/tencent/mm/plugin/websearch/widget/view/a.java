package com.tencent.mm.plugin.websearch.widget.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.ui.widget.a.d;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static final a udC;
  public Map<Integer, d> udA;
  private c udB;

  static
  {
    AppMethodBeat.i(91479);
    udC = new a();
    AppMethodBeat.o(91479);
  }

  private a()
  {
    AppMethodBeat.i(91477);
    this.udA = new HashMap();
    c.a locala = new c.a();
    locala.ePH = true;
    locala.ePG = true;
    this.udB = locala.ahG();
    AppMethodBeat.o(91477);
  }

  public static a cVT()
  {
    return udC;
  }

  public final void Ip(int paramInt)
  {
    AppMethodBeat.i(91478);
    d locald = (d)this.udA.remove(Integer.valueOf(paramInt));
    if (locald != null)
      locald.cpE();
    AppMethodBeat.o(91478);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.a
 * JD-Core Version:    0.6.2
 */