package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.os.Message;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarMemberView$handler$1", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "handleMessage", "", "msg", "Landroid/os/Message;", "plugin-radar_release"})
public final class RadarMemberView$d extends ak
{
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(102950);
    j.p(paramMessage, "msg");
    if (paramMessage.what == RadarMemberView.cdF())
    {
      paramMessage = this.pCy;
      this.pCy.getMember();
      RadarMemberView.a(paramMessage, this.pCy.getState());
      AppMethodBeat.o(102950);
    }
    while (true)
    {
      return;
      if (paramMessage.what == RadarMemberView.cdG())
      {
        this.pCy.setVisibility(4);
        RadarMemberView.j(this.pCy);
        paramMessage = RadarMemberView.k(this.pCy);
        if (paramMessage != null)
          paramMessage.setVisibility(0);
        paramMessage = RadarMemberView.a(this.pCy);
        if (paramMessage != null)
        {
          paramMessage.b(this.pCy.getMember(), this.pCy.getState());
          AppMethodBeat.o(102950);
        }
      }
      else
      {
        AppMethodBeat.o(102950);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarMemberView.d
 * JD-Core Version:    0.6.2
 */