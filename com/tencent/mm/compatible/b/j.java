package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.NoiseSuppressor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class j
  implements h.a
{
  private NoiseSuppressor epA;

  @TargetApi(16)
  public j(AudioRecord paramAudioRecord)
  {
    AppMethodBeat.i(92896);
    this.epA = null;
    boolean bool = NoiseSuppressor.isAvailable();
    ab.d("MicroMsg.MMNoiseSuppressor", "available  ".concat(String.valueOf(bool)));
    if (bool)
      this.epA = NoiseSuppressor.create(paramAudioRecord.getAudioSessionId());
    AppMethodBeat.o(92896);
  }

  @TargetApi(16)
  public final boolean KJ()
  {
    boolean bool = true;
    AppMethodBeat.i(92898);
    if (this.epA != null);
    try
    {
      int i = this.epA.setEnabled(true);
      if (i == 0)
        AppMethodBeat.o(92898);
      while (true)
      {
        return bool;
        ab.d("MicroMsg.MMNoiseSuppressor", "setEnabled failed ".concat(String.valueOf(i)));
        AppMethodBeat.o(92898);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MMNoiseSuppressor", localException, "", new Object[0]);
    }
  }

  @TargetApi(16)
  public final boolean isAvailable()
  {
    AppMethodBeat.i(92897);
    boolean bool = NoiseSuppressor.isAvailable();
    AppMethodBeat.o(92897);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.j
 * JD-Core Version:    0.6.2
 */