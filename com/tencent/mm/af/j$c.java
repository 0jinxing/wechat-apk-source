package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class j$c
{
  private static final List<c<? extends f>> fjp;
  private static final HashMap<Integer, c<? extends f>> fjq;

  static
  {
    AppMethodBeat.i(77790);
    fjp = Collections.synchronizedList(new ArrayList());
    fjq = new HashMap();
    AppMethodBeat.o(77790);
  }

  public static void a(c<? extends f> paramc)
  {
    AppMethodBeat.i(77788);
    fjp.add(paramc);
    AppMethodBeat.o(77788);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.j.c
 * JD-Core Version:    0.6.2
 */