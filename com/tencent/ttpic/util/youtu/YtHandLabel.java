package com.tencent.ttpic.util.youtu;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class YtHandLabel
{
  private static final int LOST_TIME_INTERVAL = 300;
  private static final String TAG;
  public long lostStartTimestamp;
  public String name = "";
  public int value = -1;

  static
  {
    AppMethodBeat.i(84417);
    TAG = YtHandLabel.class.getSimpleName();
    AppMethodBeat.o(84417);
  }

  public boolean isConsiderLost()
  {
    AppMethodBeat.i(84416);
    boolean bool;
    if (System.currentTimeMillis() - this.lostStartTimestamp > 300L)
    {
      bool = true;
      AppMethodBeat.o(84416);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84416);
    }
  }

  public void reset()
  {
    this.value = -1;
    this.name = "";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.YtHandLabel
 * JD-Core Version:    0.6.2
 */