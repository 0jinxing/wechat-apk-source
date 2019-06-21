package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class OfflineVideoView$4
  implements Runnable
{
  OfflineVideoView$4(OfflineVideoView paramOfflineVideoView, boolean paramBoolean, float paramFloat)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38363);
    ab.i("MicroMsg.OfflineVideoView", "%d switch video model isVideoPlay %b %f", new Object[] { Integer.valueOf(this.rld.hashCode()), Boolean.valueOf(this.klz), Float.valueOf(this.rle) });
    View localView = (View)OfflineVideoView.b(this.rld);
    if (this.klz)
    {
      localView.setAlpha(this.rle);
      localView.setVisibility(0);
      OfflineVideoView.c(this.rld).setVisibility(0);
      OfflineVideoView.c(this.rld).setAlpha(this.rle);
      if (this.rle < 1.0D)
        break label171;
      OfflineVideoView.a(this.rld).setVisibility(8);
      AppMethodBeat.o(38363);
    }
    while (true)
    {
      return;
      localView.setVisibility(0);
      OfflineVideoView.c(this.rld).setVisibility(0);
      OfflineVideoView.c(this.rld).setAlpha(0.0F);
      OfflineVideoView.a(this.rld).setVisibility(0);
      label171: AppMethodBeat.o(38363);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OfflineVideoView.4
 * JD-Core Version:    0.6.2
 */