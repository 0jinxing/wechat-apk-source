package com.tencent.mm.plugin.voip.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class VideoActivity$1$1
  implements Runnable
{
  VideoActivity$1$1(VideoActivity.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4786);
    if ((VideoActivity.a(this.sWm.sWl) != null) && (VideoActivity.a(this.sWm.sWl).get() != null))
      ab.i("MicroMsg.Voip.VideoActivity", "summerkick LogoutEvent ret[%b, %b, %b]", new Object[] { Boolean.valueOf(((c)VideoActivity.a(this.sWm.sWl).get()).cJs()), Boolean.valueOf(((c)VideoActivity.a(this.sWm.sWl).get()).cJr()), Boolean.valueOf(((c)VideoActivity.a(this.sWm.sWl).get()).cJk()) });
    AppMethodBeat.o(4786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VideoActivity.1.1
 * JD-Core Version:    0.6.2
 */