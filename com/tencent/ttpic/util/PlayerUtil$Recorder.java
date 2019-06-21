package com.tencent.ttpic.util;

import android.media.MediaRecorder;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PlayerUtil$Recorder extends MediaRecorder
{
  private boolean isRecording;

  public boolean isRecording()
  {
    return this.isRecording;
  }

  public void release()
  {
    AppMethodBeat.i(50284);
    try
    {
      super.release();
      this.isRecording = false;
      AppMethodBeat.o(50284);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(50284);
    }
  }

  public void reset()
  {
    AppMethodBeat.i(50283);
    if (!this.isRecording)
      AppMethodBeat.o(50283);
    while (true)
    {
      return;
      try
      {
        super.reset();
        this.isRecording = false;
        AppMethodBeat.o(50283);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(50283);
      }
    }
  }

  public void start()
  {
    AppMethodBeat.i(50281);
    if (this.isRecording)
      AppMethodBeat.o(50281);
    while (true)
    {
      return;
      try
      {
        super.start();
        this.isRecording = true;
        AppMethodBeat.o(50281);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(50281);
      }
    }
  }

  public void stop()
  {
    AppMethodBeat.i(50282);
    if (!this.isRecording)
      AppMethodBeat.o(50282);
    while (true)
    {
      return;
      try
      {
        super.stop();
        this.isRecording = false;
        AppMethodBeat.o(50282);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(50282);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PlayerUtil.Recorder
 * JD-Core Version:    0.6.2
 */