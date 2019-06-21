package com.tencent.mm.audio.b;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Arrays;

final class d$1
  implements AudioRecord.OnRecordPositionUpdateListener
{
  d$1(d paramd)
  {
  }

  public final void onMarkerReached(AudioRecord paramAudioRecord)
  {
  }

  public final void onPeriodicNotification(AudioRecord paramAudioRecord)
  {
    AppMethodBeat.i(55745);
    if (this.cpZ.mIsPause)
      AppMethodBeat.o(55745);
    while (true)
    {
      return;
      if (this.cpZ.cpL != null)
      {
        if ((this.cpZ.cpx) || (this.cpZ.cpV == null))
          this.cpZ.cpV = new byte[this.cpZ.cpX];
        int i = this.cpZ.cpL.read(this.cpZ.cpV, 0, this.cpZ.cpX);
        ab.d("MicroMsg.RecordModeAsyncCallback", "OnRecordPositionUpdateListener, read ret: ".concat(String.valueOf(i)));
        if (this.cpZ.cpT != null)
          this.cpZ.cpT.d(i, this.cpZ.cpV);
        int j = i;
        if (i > this.cpZ.cpV.length)
          j = this.cpZ.cpV.length;
        if ((this.cpZ.mIsMute) && (j > 0))
          Arrays.fill(this.cpZ.cpV, 0, j, (byte)0);
        if ((this.cpZ.cpM != null) && (j > 0))
          this.cpZ.cpM.u(this.cpZ.cpV, j);
      }
      AppMethodBeat.o(55745);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.d.1
 * JD-Core Version:    0.6.2
 */