package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class f
{
  public static e a(e parame)
  {
    AppMethodBeat.i(78196);
    if (parame == null)
    {
      parame = null;
      AppMethodBeat.o(78196);
    }
    while (true)
    {
      return parame;
      if (parame.agQ())
      {
        e locale = o.ahl().ly(parame.fDJ);
        if (locale == null)
        {
          AppMethodBeat.o(78196);
        }
        else
        {
          AppMethodBeat.o(78196);
          parame = locale;
        }
      }
      else
      {
        AppMethodBeat.o(78196);
      }
    }
  }

  public static boolean b(e parame)
  {
    boolean bool = false;
    AppMethodBeat.i(78197);
    if (parame == null)
      AppMethodBeat.o(78197);
    while (true)
    {
      return bool;
      int i = parame.offset;
      int j = parame.frO;
      long l = parame.cKK;
      if (parame.agQ())
      {
        parame = o.ahl().ly(parame.fDJ);
        i = parame.offset;
        j = parame.frO;
        l = parame.cKK;
      }
      if (j == 0)
      {
        AppMethodBeat.o(78197);
        bool = true;
      }
      else if (((i == j) && (j != 0)) || (l != 0L))
      {
        AppMethodBeat.o(78197);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(78197);
      }
    }
  }

  public static String c(e parame)
  {
    AppMethodBeat.i(78198);
    if (parame == null)
    {
      parame = "";
      AppMethodBeat.o(78198);
    }
    while (true)
    {
      return parame;
      if (parame.agQ())
      {
        parame = o.ahl().ly(parame.fDJ);
        if (parame == null)
        {
          parame = "";
          AppMethodBeat.o(78198);
        }
        else
        {
          parame = parame.fDz;
          AppMethodBeat.o(78198);
        }
      }
      else
      {
        parame = parame.fDz;
        AppMethodBeat.o(78198);
      }
    }
  }

  public static String c(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(78199);
    String str = null;
    if (!bo.isNullOrNil(paramString1))
      str = String.format("<appinfo><appid>%s</appid><mediatagname>%s</mediatagname><messageext>%s</messageext><messageaction>%s</messageaction></appinfo>", new Object[] { paramString1, bo.nullAsNil(paramString2), bo.nullAsNil(paramString3), bo.nullAsNil(paramString4) });
    AppMethodBeat.o(78199);
    return str;
  }

  public static final a sg(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(78200);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(78200);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf('<');
      Object localObject2 = paramString;
      if (i > 0)
        localObject2 = paramString.substring(i);
      localObject2 = br.z((String)localObject2, "msg");
      if (localObject2 == null)
      {
        ab.e("MicroMsg.ImgInfoLogic", "parseImg failed");
        AppMethodBeat.o(78200);
        paramString = localObject1;
      }
      else
      {
        paramString = new a();
        paramString.appId = ((String)((Map)localObject2).get(".msg.appinfo.appid"));
        paramString.mediaTagName = ((String)((Map)localObject2).get(".msg.appinfo.mediatagname"));
        paramString.messageExt = ((String)((Map)localObject2).get(".msg.appinfo.messageext"));
        paramString.messageAction = ((String)((Map)localObject2).get(".msg.appinfo.messageaction"));
        AppMethodBeat.o(78200);
      }
    }
  }

  public static String sh(String paramString)
  {
    AppMethodBeat.i(78201);
    if (!com.tencent.mm.vfs.e.ct(paramString))
    {
      paramString = null;
      AppMethodBeat.o(78201);
    }
    while (true)
    {
      return paramString;
      long l = com.tencent.mm.vfs.e.asZ(paramString);
      paramString = com.tencent.mm.a.g.x((paramString + "-" + l).getBytes());
      AppMethodBeat.o(78201);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.f
 * JD-Core Version:    0.6.2
 */