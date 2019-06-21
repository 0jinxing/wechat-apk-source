package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView.a;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class x$6
  implements Runnable
{
  x$6(x paramx)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37283);
    OfflineVideoView localOfflineVideoView = x.a(this.rbM);
    ab.i("MicroMsg.OfflineVideoView", "%d start hasResumed[%b], curPos [%d], duration [%d], shouldSeek [%d]", new Object[] { Integer.valueOf(localOfflineVideoView.hashCode()), Boolean.valueOf(localOfflineVideoView.rkY), Integer.valueOf(localOfflineVideoView.klq.getCurrentPosition()), Integer.valueOf(localOfflineVideoView.klq.getDuration()), Integer.valueOf(localOfflineVideoView.rla) });
    localOfflineVideoView.rkZ = true;
    if (localOfflineVideoView.rkY)
      if (!bo.isNullOrNil(localOfflineVideoView.klq.getVideoPath()))
        if (localOfflineVideoView.klq.getCurrentPosition() >= localOfflineVideoView.klq.getDuration())
        {
          localOfflineVideoView.klq.d(0.0D, true);
          if (localOfflineVideoView.rkX != null)
            localOfflineVideoView.rkX.onStart(localOfflineVideoView.duration);
        }
    while (true)
    {
      localOfflineVideoView.startTimer();
      AppMethodBeat.o(37283);
      return;
      localOfflineVideoView.klq.start();
      continue;
      localOfflineVideoView.onResume();
      continue;
      localOfflineVideoView.onResume();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x.6
 * JD-Core Version:    0.6.2
 */