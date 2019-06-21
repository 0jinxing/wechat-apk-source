package com.tencent.mm.plugin.topstory.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;

final class PluginTopStoryUI$1
  implements Runnable
{
  PluginTopStoryUI$1(PluginTopStoryUI paramPluginTopStoryUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1518);
    long l = aa.HV(1);
    if (((Long)g.RP().Ry().get(ac.a.xVW, Long.valueOf(0L))).longValue() != l)
    {
      h.pYm.e(17040, new Object[] { Integer.valueOf(1), Long.valueOf(l) });
      g.RP().Ry().set(ac.a.xVW, Long.valueOf(l));
      g.RP().Ry().dsb();
    }
    ((j)g.K(j.class)).XR().aoX("topstoryapp");
    ab.i("MicroMsg.TopStory.PluginTopStoryUI", "Delete TopStory Conversation Entry");
    AppMethodBeat.o(1518);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI.1
 * JD-Core Version:    0.6.2
 */