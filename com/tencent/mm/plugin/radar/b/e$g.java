package com.tencent.mm.plugin.radar.b;

import a.f.b.j;
import a.l;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/model/RadarManager$delayRadarRemove$1", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "handleMessage", "", "msg", "Landroid/os/Message;", "plugin-radar_release"})
public final class e$g extends ak
{
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(102918);
    j.p(paramMessage, "msg");
    if (paramMessage.what == e.cdD())
      g.Rg().d((m)new b());
    AppMethodBeat.o(102918);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.e.g
 * JD-Core Version:    0.6.2
 */