package com.tencent.mm.plugin.sight.encode.ui;

import android.media.MediaPlayer;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class SightVideoTextureView$3
  implements Runnable
{
  SightVideoTextureView$3(SightVideoTextureView paramSightVideoTextureView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25122);
    try
    {
      this.qBR.clV();
      SightVideoTextureView.e(this.qBR).stop();
      SightVideoTextureView.e(this.qBR).release();
      if ((SightVideoTextureView.f(this.qBR) != null) && (SightVideoTextureView.f(this.qBR).isValid()))
      {
        SightVideoTextureView.f(this.qBR).release();
        SightVideoTextureView.a(this.qBR, null);
      }
      SightVideoTextureView.a(this.qBR, null);
      AppMethodBeat.o(25122);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.SightVideoTextureView", "stop play video error: %s, %s", new Object[] { localException.getMessage(), bo.l(localException) });
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(25123);
    String str = super.toString() + "|stopPlayVideo";
    AppMethodBeat.o(25123);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.SightVideoTextureView.3
 * JD-Core Version:    0.6.2
 */