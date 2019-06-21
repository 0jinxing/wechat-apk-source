package com.tencent.mm.plugin.music.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
{
  public String content;
  public boolean oMp;
  public long timestamp;

  public final String toString()
  {
    AppMethodBeat.i(104870);
    String str = String.format("[%d %s]", new Object[] { Long.valueOf(this.timestamp), this.content });
    AppMethodBeat.o(104870);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.a.a
 * JD-Core Version:    0.6.2
 */