package com.tencent.rtmp.sharp.jni;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

class TraeAudioManager$f$1
  implements TraeMediaPlayer.a
{
  TraeAudioManager$f$1(TraeAudioManager.f paramf)
  {
  }

  public void a()
  {
    AppMethodBeat.i(65660);
    if (QLog.isColorLevel())
      QLog.w("TRAE", 2, "_ringPlayer onCompletion _activeMode:" + this.a.p._activeMode + " _preRingMode:" + this.a.k);
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.TRUE);
    this.a.a(32783, localHashMap);
    this.a.j();
    AppMethodBeat.o(65660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.f.1
 * JD-Core Version:    0.6.2
 */