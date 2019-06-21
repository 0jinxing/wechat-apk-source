package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarStateView$switchHandler$1", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "handleMessage", "", "msg", "Landroid/os/Message;", "plugin-radar_release"})
public final class RadarStateView$d extends ak
{
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(103041);
    j.p(paramMessage, "msg");
    RadarStateView.a(this.pDg);
    this.pDg.cdL();
    AppMethodBeat.o(103041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarStateView.d
 * JD-Core Version:    0.6.2
 */