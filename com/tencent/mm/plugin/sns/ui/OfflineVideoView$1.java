package com.tencent.mm.plugin.sns.ui;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;

final class OfflineVideoView$1
  implements Runnable
{
  OfflineVideoView$1(OfflineVideoView paramOfflineVideoView, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38360);
    if (OfflineVideoView.a(this.rld) != null)
    {
      ab.i("MicroMsg.OfflineVideoView", "%d fresh thumb image", new Object[] { Integer.valueOf(hashCode()) });
      OfflineVideoView.a(this.rld).setImageBitmap(BackwardSupportUtil.b.i(this.rlc, 1.0F));
    }
    AppMethodBeat.o(38360);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OfflineVideoView.1
 * JD-Core Version:    0.6.2
 */