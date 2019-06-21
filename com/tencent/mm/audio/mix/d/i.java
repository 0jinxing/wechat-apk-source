package com.tencent.mm.audio.mix.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class i
  implements Comparable<i>, Runnable
{
  private static int cmm = 1000;
  protected long cmn;
  protected String name;
  protected final int priority;

  public i(String paramString)
  {
    AppMethodBeat.i(137081);
    this.name = "";
    this.name = paramString;
    this.cmn = System.currentTimeMillis();
    this.priority = 5;
    AppMethodBeat.o(137081);
  }

  public void reset()
  {
  }

  public void run()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.d.i
 * JD-Core Version:    0.6.2
 */