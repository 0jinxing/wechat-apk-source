package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

final class x$7
  implements Runnable
{
  x$7(x paramx)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37284);
    OfflineVideoView localOfflineVideoView = x.a(this.rbM);
    ab.i("MicroMsg.OfflineVideoView", "%d pause", new Object[] { Integer.valueOf(localOfflineVideoView.hashCode()) });
    ab.d("MicroMsg.OfflineVideoView", "%d on pause %s ", new Object[] { Integer.valueOf(localOfflineVideoView.hashCode()), bo.dpG() });
    localOfflineVideoView.rkZ = false;
    if (localOfflineVideoView.klq.isPlaying())
    {
      localOfflineVideoView.rla = localOfflineVideoView.klq.getCurrentPosition();
      ab.i("MicroMsg.OfflineVideoView", "%d pause play", new Object[] { Integer.valueOf(localOfflineVideoView.hashCode()) });
      localOfflineVideoView.klq.pause();
    }
    localOfflineVideoView.bJc();
    localOfflineVideoView.klw.stopTimer();
    AppMethodBeat.o(37284);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x.7
 * JD-Core Version:    0.6.2
 */