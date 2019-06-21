package com.tencent.ttpic.util;

import android.media.MediaPlayer;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PlayerUtil$Player extends MediaPlayer
{
  private boolean isPlaying;

  public boolean isPlaying()
  {
    return this.isPlaying;
  }

  public void pause()
  {
    AppMethodBeat.i(50277);
    if (!this.isPlaying)
      AppMethodBeat.o(50277);
    while (true)
    {
      return;
      try
      {
        super.pause();
        this.isPlaying = false;
        AppMethodBeat.o(50277);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(50277);
      }
    }
  }

  public void release()
  {
    AppMethodBeat.i(50280);
    try
    {
      super.release();
      this.isPlaying = false;
      AppMethodBeat.o(50280);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(50280);
    }
  }

  public void reset()
  {
    AppMethodBeat.i(50279);
    try
    {
      super.reset();
      this.isPlaying = false;
      AppMethodBeat.o(50279);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(50279);
    }
  }

  public void start()
  {
    AppMethodBeat.i(50276);
    if (this.isPlaying)
      AppMethodBeat.o(50276);
    while (true)
    {
      return;
      try
      {
        super.start();
        this.isPlaying = true;
        AppMethodBeat.o(50276);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(50276);
      }
    }
  }

  public void stop()
  {
    AppMethodBeat.i(50278);
    try
    {
      super.stop();
      this.isPlaying = false;
      AppMethodBeat.o(50278);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(50278);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.PlayerUtil.Player
 * JD-Core Version:    0.6.2
 */