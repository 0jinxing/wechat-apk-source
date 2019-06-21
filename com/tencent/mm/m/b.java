package com.tencent.mm.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  public static int MW()
  {
    AppMethodBeat.i(77655);
    int i = bo.getInt(g.Nu().getValue("InputLimitSNSObjectText"), 2000);
    AppMethodBeat.o(77655);
    return i * 2;
  }

  public static int MX()
  {
    AppMethodBeat.i(77656);
    int i = bo.getInt(g.Nu().getValue("SnsCommentMaxSize"), 1000);
    AppMethodBeat.o(77656);
    return i * 2;
  }

  public static int MY()
  {
    AppMethodBeat.i(77657);
    int i = bo.getInt(g.Nu().getValue("InputLimitFavText"), 100000);
    AppMethodBeat.o(77657);
    return i * 2;
  }

  public static int MZ()
  {
    AppMethodBeat.i(77658);
    int i = bo.getInt(g.Nu().getValue("InputLimitSendEmotionBufSize"), 5242880);
    AppMethodBeat.o(77658);
    return i;
  }

  public static int Na()
  {
    int i = 1024;
    AppMethodBeat.i(77659);
    try
    {
      int j = bo.getInt(g.Nu().getValue("InputLimitSendEmotionWidth"), 1024);
      i = j;
      AppMethodBeat.o(77659);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.b("MicroMsg.BoundaryConfig", "getCustomEmojiMaxWidthAndHeight:%s", new Object[] { localException });
        AppMethodBeat.o(77659);
      }
    }
  }

  public static int Nb()
  {
    int i = 5242880;
    AppMethodBeat.i(77660);
    try
    {
      j = bo.getInt(g.Nu().getValue("InputLimitSendAppMsgEmotionBufSize"), 5242880);
      AppMethodBeat.o(77660);
      return j;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.b("MicroMsg.BoundaryConfig", "getAppEmojiMsgMaxSize:%s", new Object[] { localException });
        AppMethodBeat.o(77660);
        int j = i;
      }
    }
  }

  public static int Nc()
  {
    int i = 26214400;
    AppMethodBeat.i(77661);
    if (!com.tencent.mm.kernel.g.RN().QY())
      AppMethodBeat.o(77661);
    while (true)
    {
      return i;
      i = bo.getInt(g.Nu().getValue("InputLimitFavImageSize"), 26214400);
      AppMethodBeat.o(77661);
    }
  }

  public static int Nd()
  {
    AppMethodBeat.i(77662);
    int i = bo.getInt(g.Nu().getValue("InputLimitVideoSize"), 26214400);
    AppMethodBeat.o(77662);
    return i;
  }

  public static String Ne()
  {
    AppMethodBeat.i(77663);
    String str = g.Nu().getValue("InputLimitForbiddenChar");
    AppMethodBeat.o(77663);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.m.b
 * JD-Core Version:    0.6.2
 */