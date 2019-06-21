package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.as;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/AppMsgContextEx;", "", "()V", "testClear", "", "plugin-brandservice_release"})
public final class a
{
  public static final a jQI;

  static
  {
    AppMethodBeat.i(14779);
    jQI = new a();
    AppMethodBeat.o(14779);
  }

  public static final void aWM()
  {
    AppMethodBeat.i(14778);
    long l1 = b.aWQ();
    if (1L <= l1)
      for (long l2 = 1L; ; l2 += 1L)
      {
        b.gK(l2).clear();
        if (l2 == l1)
          break;
      }
    AppMethodBeat.o(14778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.a
 * JD-Core Version:    0.6.2
 */