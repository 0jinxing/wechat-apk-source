package com.tencent.mm.plugin.sight.encode.ui;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class SightVideoTextureView$2
  implements Runnable
{
  SightVideoTextureView$2(SightVideoTextureView paramSightVideoTextureView, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25120);
    if (SightVideoTextureView.e(this.qBR) != null);
    try
    {
      SightVideoTextureView.e(this.qBR).stop();
      SightVideoTextureView.e(this.qBR).release();
    }
    catch (Exception localException1)
    {
      try
      {
        Object localObject1 = this.qBR;
        Object localObject2 = new com/tencent/mm/compatible/b/k;
        ((k)localObject2).<init>();
        SightVideoTextureView.a((SightVideoTextureView)localObject1, (MediaPlayer)localObject2);
        localObject1 = SightVideoTextureView.e(this.qBR);
        localObject2 = new com/tencent/mm/plugin/sight/encode/ui/SightVideoTextureView$2$1;
        ((SightVideoTextureView.2.1)localObject2).<init>(this);
        ((MediaPlayer)localObject1).setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject2);
        localObject2 = SightVideoTextureView.e(this.qBR);
        localObject1 = new com/tencent/mm/plugin/sight/encode/ui/SightVideoTextureView$2$2;
        ((SightVideoTextureView.2.2)localObject1).<init>(this);
        ((MediaPlayer)localObject2).setOnErrorListener((MediaPlayer.OnErrorListener)localObject1);
        SightVideoTextureView.e(this.qBR).setDataSource(this.qBS);
        SightVideoTextureView.a(this.qBR, this.qBR.getPreviewSurface());
        SightVideoTextureView.e(this.qBR).setSurface(SightVideoTextureView.f(this.qBR));
        SightVideoTextureView.e(this.qBR).setAudioStreamType(3);
        if (this.kAS)
          SightVideoTextureView.e(this.qBR).setVolume(0.0F, 0.0F);
        while (true)
        {
          SightVideoTextureView.e(this.qBR).setScreenOnWhilePlaying(true);
          SightVideoTextureView.e(this.qBR).setLooping(true);
          SightVideoTextureView.e(this.qBR).prepare();
          SightVideoTextureView.e(this.qBR).start();
          AppMethodBeat.o(25120);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("MicroMsg.SightVideoTextureView", localException1, "", new Object[0]);
          ab.w("MicroMsg.SightVideoTextureView", "try to release mediaplayer error");
          break;
          this.qBR.clU();
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.e("MicroMsg.SightVideoTextureView", "play %s, error: %s, %s", new Object[] { this.qBS, localException2.getMessage(), bo.l(localException2) });
          AppMethodBeat.o(25120);
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(25121);
    String str = super.toString() + "|playVideo";
    AppMethodBeat.o(25121);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.SightVideoTextureView.2
 * JD-Core Version:    0.6.2
 */