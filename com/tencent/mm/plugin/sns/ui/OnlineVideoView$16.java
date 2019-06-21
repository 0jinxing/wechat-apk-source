package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class OnlineVideoView$16
  implements ap.a
{
  OnlineVideoView$16(OnlineVideoView paramOnlineVideoView)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(38405);
    boolean bool;
    if ((OnlineVideoView.k(this.rly) == null) || (OnlineVideoView.d(this.rly) == null))
    {
      AppMethodBeat.o(38405);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (((View)OnlineVideoView.d(this.rly)).getAlpha() < 1.0F)
        OnlineVideoView.m(this.rly);
      if (OnlineVideoView.d(this.rly).isPlaying())
        OnlineVideoView.n(this.rly);
      try
      {
        bool = bo.isNullOrNil(OnlineVideoView.k(this.rly).fUL);
        if (!bool);
        for (int i = 1; ; i = 0)
        {
          if (i != 0)
            break label120;
          AppMethodBeat.o(38405);
          bool = false;
          break;
        }
        label120: i = OnlineVideoView.d(this.rly).getCurrentPosition() / 1000;
        bool = OnlineVideoView.k(this.rly).mm(i);
        AppMethodBeat.o(38405);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.OnlineVideoView", "online video timer check error : " + localException.toString());
        AppMethodBeat.o(38405);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.16
 * JD-Core Version:    0.6.2
 */