package com.tencent.mm.plugin.music.e;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class j
  implements b
{
  public AudioTrack ac(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137533);
    AudioTrack localAudioTrack = new AudioTrack(3, paramInt1, paramInt2, 2, paramInt3, 1);
    AppMethodBeat.o(137533);
    return localAudioTrack;
  }

  public MediaPlayer bTR()
  {
    AppMethodBeat.i(137532);
    MediaPlayer localMediaPlayer = new MediaPlayer();
    AppMethodBeat.o(137532);
    return localMediaPlayer;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.e.j
 * JD-Core Version:    0.6.2
 */