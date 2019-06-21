package com.tencent.mm.audio.b;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class d extends f
{
  AudioRecord cpL;
  c.a cpM;
  byte[] cpV;
  private int cpW;
  int cpX;
  private AudioRecord.OnRecordPositionUpdateListener cpY;
  boolean cpx;
  private HandlerThread mHandlerThread;
  boolean mIsMute;

  public d(AudioRecord paramAudioRecord, c.a parama, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55746);
    this.mHandlerThread = null;
    this.cpV = null;
    this.cpY = new d.1(this);
    this.cpL = paramAudioRecord;
    this.cpM = parama;
    this.cpx = paramBoolean;
    this.cpW = paramInt1;
    this.cpX = paramInt2;
    AppMethodBeat.o(55746);
  }

  public final boolean EL()
  {
    boolean bool = false;
    AppMethodBeat.i(55747);
    if (this.mHandlerThread != null)
    {
      ab.e("MicroMsg.RecordModeAsyncCallback", "alreay started record");
      AppMethodBeat.o(55747);
    }
    while (true)
    {
      return bool;
      this.mHandlerThread = com.tencent.mm.sdk.g.d.ek("RecordModeAsyncCallback_handlerThread", 10);
      this.mHandlerThread.start();
      this.cpL.setRecordPositionUpdateListener(this.cpY, ak.fetchFreeHandler(this.mHandlerThread.getLooper()));
      this.cpL.setPositionNotificationPeriod(this.cpW);
      if ((this.cpx) || (this.cpV == null))
        this.cpV = new byte[this.cpX];
      int i = this.cpL.read(this.cpV, 0, this.cpX);
      ab.d("MicroMsg.RecordModeAsyncCallback", "startRecord, read ret: ".concat(String.valueOf(i)));
      if ((this.cpM != null) && (i > 0))
        this.cpM.u(this.cpV, i);
      bool = true;
      AppMethodBeat.o(55747);
    }
  }

  public final void bs(boolean paramBoolean)
  {
    this.mIsMute = paramBoolean;
  }

  public final void stopRecord()
  {
    AppMethodBeat.i(55748);
    this.cpL.setRecordPositionUpdateListener(null);
    this.cpL = null;
    this.mHandlerThread.quit();
    this.mHandlerThread = null;
    AppMethodBeat.o(55748);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.d
 * JD-Core Version:    0.6.2
 */