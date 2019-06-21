package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.a.b;
import a.f.b.j;
import a.f.b.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.SimpleDateFormat;
import java.util.Date;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"toDate", "", "", "invoke"})
final class f$j extends k
  implements b<Long, String>
{
  public static final j jSB;

  static
  {
    AppMethodBeat.i(14820);
    jSB = new j();
    AppMethodBeat.o(14820);
  }

  f$j()
  {
    super(1);
  }

  public static String gN(long paramLong)
  {
    AppMethodBeat.i(14819);
    String str = new SimpleDateFormat("MM/dd HH:mm:ss").format(new Date(paramLong));
    j.o(str, "SimpleDateFormat(\"MM/dd …m:ss\").format(Date(this))");
    AppMethodBeat.o(14819);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.f.j
 * JD-Core Version:    0.6.2
 */