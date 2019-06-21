package com.tencent.mm.plugin.mmsight.model.a;

import android.media.MediaRecorder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class i
  implements c
{
  private int audioSampleRate;
  private int fzS;
  c.a ovU;
  private ak ovX;
  private MediaRecorder owh;
  private boolean owi;

  public i(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76586);
    this.owi = false;
    this.ovX = new i.1(this);
    this.audioSampleRate = paramInt1;
    this.fzS = paramInt2;
    ab.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder, sampleRate: %s, bitrate: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(76586);
  }

  public final int a(c.a parama)
  {
    int i = 0;
    AppMethodBeat.i(76588);
    ab.i("MicroMsg.MMSightAACMediaRecorder", "start, onPcmReady: %s", new Object[] { parama });
    this.ovU = parama;
    try
    {
      if ((this.owh != null) && (!this.owi))
        this.owh.start();
      return i;
    }
    catch (Exception parama)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", parama, "start record aac.mp4 error:%s", new Object[] { parama.getMessage() });
        this.ovX.sendEmptyMessage(0);
        i = -1;
        AppMethodBeat.o(76588);
      }
    }
    finally
    {
      this.ovX.sendEmptyMessage(0);
      AppMethodBeat.o(76588);
    }
    throw parama;
  }

  public final int a(c.b paramb)
  {
    int i = 0;
    AppMethodBeat.i(76589);
    ab.i("MicroMsg.MMSightAACMediaRecorder", "stop, mediaRecorder: %s, callback: %s", new Object[] { this.owh, paramb });
    if (this.owh == null)
    {
      if (paramb != null)
        paramb.WT();
      AppMethodBeat.o(76589);
    }
    while (true)
    {
      return i;
      try
      {
        if (!this.owi)
        {
          this.owh.stop();
          this.owh.release();
        }
        this.owh = null;
        if (paramb != null)
          paramb.WT();
        AppMethodBeat.o(76589);
      }
      catch (Exception paramb)
      {
        ab.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", paramb, "stop record aac.mp4 error:%s", new Object[] { paramb.getMessage() });
        i = -1;
        AppMethodBeat.o(76589);
      }
    }
  }

  public final void bPM()
  {
  }

  public final com.tencent.mm.audio.b.c.a bPN()
  {
    return null;
  }

  public final void clear()
  {
    AppMethodBeat.i(76590);
    try
    {
      if (this.owh != null)
      {
        if (!this.owi)
        {
          this.owh.stop();
          this.owh.release();
        }
        this.owh = null;
      }
      AppMethodBeat.o(76590);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", localException, "clear error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(76590);
      }
    }
  }

  public final void iW(boolean paramBoolean)
  {
    this.owi = paramBoolean;
  }

  public final int q(int paramInt, String paramString)
  {
    paramInt = 0;
    AppMethodBeat.i(76587);
    ab.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder init tempPath[%s], sampleRate[%d]", new Object[] { paramString, Integer.valueOf(this.audioSampleRate) });
    this.owh = new MediaRecorder();
    this.owh.setAudioSource(1);
    this.owh.setOutputFormat(2);
    this.owh.setAudioEncoder(3);
    this.owh.setAudioChannels(1);
    this.owh.setAudioEncodingBitRate(this.fzS);
    this.owh.setAudioSamplingRate(this.audioSampleRate);
    this.owh.setOutputFile(paramString);
    try
    {
      this.owh.prepare();
      AppMethodBeat.o(76587);
      return paramInt;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMSightAACMediaRecorder", paramString, "mediaRecorder prepare error: %s", new Object[] { paramString.getMessage() });
        paramInt = -1;
        AppMethodBeat.o(76587);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.i
 * JD-Core Version:    0.6.2
 */