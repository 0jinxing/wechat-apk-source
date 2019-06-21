package com.tencent.mm.plugin.voip.video;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class i$3
  implements MediaPlayer.OnCompletionListener
{
  i$3(i parami, int paramInt1, long paramLong, boolean paramBoolean, int paramInt2)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    AppMethodBeat.i(5094);
    if (System.currentTimeMillis() - this.tbl.tbi > 70000L)
      this.tbl.tbh = 4;
    if (this.tbl.aFV)
    {
      this.tbl.tbk = new i.a(this.tbl, this.tbm, this.tbn, this.tbo, this.tbp);
      this.tbl.fbD.postDelayed(this.tbl.tbk, this.tbn);
    }
    AppMethodBeat.o(5094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.i.3
 * JD-Core Version:    0.6.2
 */