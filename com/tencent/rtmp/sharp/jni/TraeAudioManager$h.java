package com.tencent.rtmp.sharp.jni;

import com.tencent.matrix.trace.core.AppMethodBeat;

class TraeAudioManager$h extends TraeAudioManager.k
{
  TraeAudioManager$h(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
  }

  public void a()
  {
    AppMethodBeat.i(65798);
    if (TraeAudioManager.IsUpdateSceneFlag)
      e();
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "connect earphone: do nothing");
    AppMethodBeat.o(65798);
  }

  public String b()
  {
    return "DEVICE_EARPHONE";
  }

  public void c()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.h
 * JD-Core Version:    0.6.2
 */