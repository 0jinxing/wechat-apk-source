package com.tencent.mm.plugin.webview.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.pluginsdk.s.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d extends s
{
  private List<s.a> kCH;
  public long startTime;

  public d()
  {
    AppMethodBeat.i(10144);
    this.kCH = new LinkedList();
    this.startTime = 0L;
    AppMethodBeat.o(10144);
  }

  public final void ddc()
  {
    AppMethodBeat.i(10145);
    if (bo.ek(this.kCH))
      AppMethodBeat.o(10145);
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.kCH.iterator();
      while (localIterator.hasNext())
      {
        s.a locala = (s.a)localIterator.next();
        localStringBuilder.append("[");
        localStringBuilder.append(locala.key);
        localStringBuilder.append(": ");
        localStringBuilder.append(locala.time);
        if (locala.time > this.startTime)
          localStringBuilder.append(", ").append(locala.time - this.startTime);
        if (!bo.isNullOrNil(locala.detail))
          localStringBuilder.append(", ").append(locala.detail);
        localStringBuilder.append("] ");
      }
      ab.i("MicroMsg.WebViewPerformanceHelper", "webview Performance: %s", new Object[] { localStringBuilder.toString() });
      this.kCH.clear();
      AppMethodBeat.o(10145);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.e.d
 * JD-Core Version:    0.6.2
 */