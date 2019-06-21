package com.tencent.mm.plugin.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.m;

public final class a
{
  private static int cpuFlag0;
  public static final int sxv;

  static
  {
    AppMethodBeat.i(25754);
    int i = m.Lw();
    cpuFlag0 = i;
    if ((i & 0x400) != 0);
    for (i = 16000; ; i = 8000)
    {
      sxv = i;
      AppMethodBeat.o(25754);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.a
 * JD-Core Version:    0.6.2
 */