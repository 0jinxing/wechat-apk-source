package com.tencent.rtmp.sharp.jni;

import com.tencent.matrix.trace.core.AppMethodBeat;

class TraeAudioManager$j extends TraeAudioManager.k
{
  TraeAudioManager$j(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
  }

  public void a()
  {
    AppMethodBeat.i(65649);
    if ((!TraeAudioManager.IsMusicScene) && (TraeAudioManager.IsUpdateSceneFlag))
      e();
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "connect speakerPhone: do nothing");
    AppMethodBeat.o(65649);
  }

  public String b()
  {
    return "DEVICE_SPEAKERPHONE";
  }

  public void c()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.j
 * JD-Core Version:    0.6.2
 */