package com.tencent.mm.chatroom.plugin;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.b;
import com.tencent.mm.model.q;

public final class a extends q
{
  private static a ehI;

  public a()
  {
    super(b.class);
  }

  public static a JA()
  {
    try
    {
      AppMethodBeat.i(103960);
      if (ehI == null)
      {
        locala = new com/tencent/mm/chatroom/plugin/a;
        locala.<init>();
        ehI = locala;
      }
      a locala = ehI;
      AppMethodBeat.o(103960);
      return locala;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.plugin.a
 * JD-Core Version:    0.6.2
 */