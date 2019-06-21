package com.tencent.rtmp.sharp.jni;

import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

class TraeAudioManager$i extends TraeAudioManager.k
{
  TraeAudioManager$i(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
  }

  public void a()
  {
    AppMethodBeat.i(65658);
    if ((!TraeAudioManager.IsMusicScene) && (TraeAudioManager.IsUpdateSceneFlag))
      this.a._am.setWiredHeadsetOn(true);
    e();
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "connect headset: do nothing");
    AppMethodBeat.o(65658);
  }

  public String b()
  {
    return "DEVICE_WIREDHEADSET";
  }

  public void c()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.i
 * JD-Core Version:    0.6.2
 */