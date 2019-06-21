package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.c;

public class a
{
  private static a AIR = null;
  private f AIS = null;

  public static a dSQ()
  {
    AppMethodBeat.i(127764);
    if (AIR == null);
    try
    {
      if (AIR == null)
      {
        locala = new com/tencent/wecall/talkroom/model/a;
        locala.<init>();
        AIR = locala;
      }
      a locala = AIR;
      AppMethodBeat.o(127764);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(127764);
    }
  }

  public static f dSR()
  {
    AppMethodBeat.i(127765);
    Object localObject1 = dSQ();
    if (((a)localObject1).AIS == null);
    try
    {
      if (((a)localObject1).AIS == null)
      {
        f localf = new com/tencent/wecall/talkroom/model/f;
        localf.<init>();
        ((a)localObject1).AIS = localf;
      }
      localObject1 = ((a)localObject1).AIS;
      AppMethodBeat.o(127765);
      return localObject1;
    }
    finally
    {
      AppMethodBeat.o(127765);
    }
  }

  public static void dSS()
  {
    AppMethodBeat.i(127766);
    c.d("MicroMsg.Voip", new Object[] { "registerEvents" });
    dSR();
    AppMethodBeat.o(127766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.a
 * JD-Core Version:    0.6.2
 */