package com.tencent.mm.plugin.topstory.ui.video.fs;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class d$1
  implements Runnable
{
  d$1(d paramd, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1873);
    Object localObject1 = this.sFJ.sDo.cGg();
    int i = ((n)localObject1).cGR();
    ab.i("MicroMsg.TopStory.TopStoryFSVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.sEx.size()) });
    List localList = this.sEx;
    try
    {
      if (!bo.ek(localList))
        ((n)localObject1).cGQ().addAll(localList);
      localObject1 = this.sFJ;
      ((d)localObject1).cg(i + ((d)localObject1).getHeadersCount());
      AppMethodBeat.o(1873);
      return;
    }
    finally
    {
      AppMethodBeat.o(1873);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.d.1
 * JD-Core Version:    0.6.2
 */