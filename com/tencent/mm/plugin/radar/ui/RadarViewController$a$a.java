package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import a.v;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator$delayShowHandler$1", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "handleMessage", "", "msg", "Landroid/os/Message;", "plugin-radar_release"})
public final class RadarViewController$a$a extends ak
{
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(103080);
    j.p(paramMessage, "msg");
    if ((paramMessage.obj instanceof View))
    {
      paramMessage = paramMessage.obj;
      if (paramMessage == null)
      {
        paramMessage = new v("null cannot be cast to non-null type android.view.View");
        AppMethodBeat.o(103080);
        throw paramMessage;
      }
      View localView = (View)paramMessage;
      localView.setVisibility(0);
      localView.clearAnimation();
      if (!this.pEh.pEe)
      {
        Object localObject = localView.getTag(RadarViewController.b(this.pEh.pEg));
        paramMessage = (Message)localObject;
        if (!(localObject instanceof Animation))
          paramMessage = null;
        localObject = (Animation)paramMessage;
        paramMessage = (Message)localObject;
        if (localObject == null)
          paramMessage = this.pEh.getInAnimation();
        localView.startAnimation(paramMessage);
      }
    }
    AppMethodBeat.o(103080);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarViewController.a.a
 * JD-Core Version:    0.6.2
 */