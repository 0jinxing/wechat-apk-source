package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class f
  implements h.a
{
  private AcousticEchoCanceler eoW;

  @TargetApi(16)
  public f(AudioRecord paramAudioRecord)
  {
    AppMethodBeat.i(92838);
    this.eoW = null;
    boolean bool = AcousticEchoCanceler.isAvailable();
    ab.d("MicroMsg.MMAcousticEchoCanceler", "available  ".concat(String.valueOf(bool)));
    if (bool)
      this.eoW = AcousticEchoCanceler.create(paramAudioRecord.getAudioSessionId());
    AppMethodBeat.o(92838);
  }

  @TargetApi(16)
  public final boolean KJ()
  {
    boolean bool = true;
    AppMethodBeat.i(92840);
    if (this.eoW != null);
    try
    {
      int i = this.eoW.setEnabled(true);
      if (i == 0)
        AppMethodBeat.o(92840);
      while (true)
      {
        return bool;
        ab.d("MicroMsg.MMAcousticEchoCanceler", "setEnabled failed ".concat(String.valueOf(i)));
        AppMethodBeat.o(92840);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MMAcousticEchoCanceler", localException, "", new Object[0]);
    }
  }

  @TargetApi(16)
  public final boolean isAvailable()
  {
    AppMethodBeat.i(92839);
    boolean bool = AcousticEchoCanceler.isAvailable();
    AppMethodBeat.o(92839);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.f
 * JD-Core Version:    0.6.2
 */