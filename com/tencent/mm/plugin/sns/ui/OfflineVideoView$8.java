package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.sdk.platformtools.ab;

final class OfflineVideoView$8
  implements e.e
{
  OfflineVideoView$8(OfflineVideoView paramOfflineVideoView)
  {
  }

  public final void bQL()
  {
    AppMethodBeat.i(38367);
    ab.i("MicroMsg.OfflineVideoView", "%d on texture update.", new Object[] { Integer.valueOf(this.rld.hashCode()) });
    try
    {
      this.rld.a(true, 1.0F);
      AppMethodBeat.o(38367);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.OfflineVideoView", "texture view update. error " + localException.toString());
        AppMethodBeat.o(38367);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OfflineVideoView.8
 * JD-Core Version:    0.6.2
 */