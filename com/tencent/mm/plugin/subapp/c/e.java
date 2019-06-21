package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.memory.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class e
{
  private static final f<Integer, e> emX;
  public String csD;
  public int fgo;
  public String fgp;
  public int ssY;
  public int ssZ;
  public String sta;
  public int stb;
  public int stc;
  public int std;
  public int ste;

  static
  {
    AppMethodBeat.i(25282);
    emX = new c(100);
    AppMethodBeat.o(25282);
  }

  public static e abk(String paramString)
  {
    AppMethodBeat.i(25281);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(25281);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf('<');
      Object localObject = paramString;
      if (i > 0)
        localObject = paramString.substring(i);
      i = ((String)localObject).hashCode();
      paramString = (e)emX.get(Integer.valueOf(i));
      if (paramString != null)
      {
        AppMethodBeat.o(25281);
      }
      else
      {
        localObject = br.z((String)localObject, "msg");
        if (localObject == null)
        {
          ab.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse msg failed");
          AppMethodBeat.o(25281);
          paramString = null;
        }
        else
        {
          try
          {
            paramString = new com/tencent/mm/plugin/subapp/c/e;
            paramString.<init>();
            paramString.fgo = bo.getInt((String)((Map)localObject).get(".msg.appmsg.appattach.totallen"), 0);
            paramString.csD = ((String)((Map)localObject).get(".msg.appmsg.appattach.attachid"));
            paramString.fgp = ((String)((Map)localObject).get(".msg.appmsg.appattach.fileext"));
            paramString.ssY = bo.getInt((String)((Map)localObject).get(".msg.appmsg.voicecmd.reminder.$remindtime"), 0);
            paramString.ssZ = bo.getInt((String)((Map)localObject).get(".msg.appmsg.voicecmd.reminder.$remindid"), 0);
            paramString.sta = ((String)((Map)localObject).get(".msg.appmsg.voicecmd.reminder.$remindattachid"));
            paramString.stb = bo.getInt((String)((Map)localObject).get(".msg.appmsg.voicecmd.reminder.$remindattachtotallen"), 0);
            paramString.stc = bo.getInt((String)((Map)localObject).get(".msg.appmsg.voicecmd.reminder.$remindformat"), 0);
            paramString.std = bo.getInt((String)((Map)localObject).get(".msg.appmsg.voicecmd.reminder.$originformat"), 0);
            paramString.ste = bo.getInt((String)((Map)localObject).get(".msg.appmsg.voicecmd.reminder.$msgsvrid"), 0);
            emX.k(Integer.valueOf(i), paramString);
            AppMethodBeat.o(25281);
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.VoiceRemindAppMsgExInfo", "parse amessage xml failed");
            ab.printErrStackTrace("MicroMsg.VoiceRemindAppMsgExInfo", paramString, "", new Object[0]);
            AppMethodBeat.o(25281);
            paramString = null;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.e
 * JD-Core Version:    0.6.2
 */