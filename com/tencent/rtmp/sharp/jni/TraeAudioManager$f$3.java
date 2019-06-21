package com.tencent.rtmp.sharp.jni;

import android.annotation.TargetApi;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TraeAudioManager$f$3
  implements AudioManager.OnAudioFocusChangeListener
{
  TraeAudioManager$f$3(TraeAudioManager.f paramf)
  {
  }

  @TargetApi(8)
  public void onAudioFocusChange(int paramInt)
  {
    AppMethodBeat.i(65653);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "focusChange:" + paramInt + " _focusSteamType:" + this.a.o + " currMode:" + this.a.p._am.getMode() + " _activeMode:" + this.a.p._activeMode);
    AppMethodBeat.o(65653);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.f.3
 * JD-Core Version:    0.6.2
 */