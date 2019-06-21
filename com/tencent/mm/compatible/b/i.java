package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class i
  implements h.a
{
  private AutomaticGainControl epz;

  @TargetApi(16)
  public i(AudioRecord paramAudioRecord)
  {
    AppMethodBeat.i(92893);
    this.epz = null;
    boolean bool = AutomaticGainControl.isAvailable();
    ab.d("MicroMsg.MMAutomaticGainControl", "available  ".concat(String.valueOf(bool)));
    if (bool)
      this.epz = AutomaticGainControl.create(paramAudioRecord.getAudioSessionId());
    AppMethodBeat.o(92893);
  }

  @TargetApi(16)
  public final boolean KJ()
  {
    boolean bool = true;
    AppMethodBeat.i(92895);
    if (this.epz != null);
    try
    {
      int i = this.epz.setEnabled(true);
      if (i == 0)
        AppMethodBeat.o(92895);
      while (true)
      {
        return bool;
        ab.d("MicroMsg.MMAutomaticGainControl", "setEnabled failed ".concat(String.valueOf(i)));
        AppMethodBeat.o(92895);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MMAutomaticGainControl", localException, "", new Object[0]);
    }
  }

  @TargetApi(16)
  public final boolean isAvailable()
  {
    AppMethodBeat.i(92894);
    boolean bool = AutomaticGainControl.isAvailable();
    AppMethodBeat.o(92894);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.i
 * JD-Core Version:    0.6.2
 */