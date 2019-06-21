package com.tencent.mm.plugin.topstory.ui.home;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.topstory.ui.webview.e;
import com.tencent.mm.plugin.topstory.ui.webview.e.11;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class b$7 extends n.a
{
  b$7(b paramb)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(1584);
    try
    {
      e locale = this.sCf.sBL;
      e.11 local11 = new com/tencent/mm/plugin/topstory/ui/webview/e$11;
      local11.<init>(locale);
      al.d(local11);
      AppMethodBeat.o(1584);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryUIComponentImpl", localException, "", new Object[0]);
        AppMethodBeat.o(1584);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.7
 * JD-Core Version:    0.6.2
 */