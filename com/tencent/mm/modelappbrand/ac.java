package com.tencent.mm.modelappbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ac
  implements ab
{
  private f fpV;
  protected Map<String, m> fpW;

  public ac(ab paramab)
  {
    AppMethodBeat.i(70644);
    this.fpW = new HashMap();
    if (paramab == null)
      AppMethodBeat.o(70644);
    while (true)
    {
      return;
      this.fpV = paramab.abN();
      a(paramab);
      AppMethodBeat.o(70644);
    }
  }

  public ac(f paramf)
  {
    AppMethodBeat.i(70643);
    this.fpW = new HashMap();
    this.fpV = paramf;
    AppMethodBeat.o(70643);
  }

  private void a(ab paramab)
  {
    AppMethodBeat.i(70645);
    paramab = paramab.abO().iterator();
    while (paramab.hasNext())
      a((m)paramab.next());
    AppMethodBeat.o(70645);
  }

  public final void a(m paramm)
  {
    AppMethodBeat.i(70647);
    this.fpW.put(paramm.getName(), paramm);
    AppMethodBeat.o(70647);
  }

  public final f abN()
  {
    return this.fpV;
  }

  public final List<m> abO()
  {
    AppMethodBeat.i(70648);
    ArrayList localArrayList = new ArrayList(this.fpW.values());
    AppMethodBeat.o(70648);
    return localArrayList;
  }

  public final <T> T px(String paramString)
  {
    AppMethodBeat.i(70646);
    paramString = this.fpW.get(paramString);
    AppMethodBeat.o(70646);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.ac
 * JD-Core Version:    0.6.2
 */