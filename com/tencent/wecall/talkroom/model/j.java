package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.c;

public final class j
{
  public static boolean auS(String paramString)
  {
    AppMethodBeat.i(128001);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      bool = false;
      AppMethodBeat.o(128001);
    }
    while (true)
    {
      return bool;
      bool = paramString.startsWith("client_");
      AppMethodBeat.o(128001);
    }
  }

  public static int dTH()
  {
    int i = 0;
    AppMethodBeat.i(128002);
    try
    {
      int j = a.dSR().nCF;
      AppMethodBeat.o(128002);
      i = j;
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        c.w("tagorewang:VoiceGroupUtil", new Object[] { "getActiveRoomId err: ", localException });
        AppMethodBeat.o(128002);
      }
    }
  }

  public static long dTI()
  {
    AppMethodBeat.i(128003);
    try
    {
      l = a.dSR().sZg;
      AppMethodBeat.o(128003);
      return l;
    }
    catch (Exception localException)
    {
      while (true)
      {
        c.w("tagorewang:VoiceGroupUtil", new Object[] { "getActiveRoomKey err: ", localException });
        long l = 0L;
        AppMethodBeat.o(128003);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.j
 * JD-Core Version:    0.6.2
 */