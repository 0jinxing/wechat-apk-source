package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.storage.bi;
import java.io.File;

public final class h
{
  static boolean a(g paramg)
  {
    boolean bool = false;
    AppMethodBeat.i(25290);
    if (paramg == null)
      AppMethodBeat.o(25290);
    while (true)
    {
      return bool;
      if (paramg.bJt == -1)
      {
        AppMethodBeat.o(25290);
      }
      else
      {
        bool = d.cDE().a(paramg.field_filename, paramg);
        AppMethodBeat.o(25290);
      }
    }
  }

  private static boolean abl(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(25287);
    if (paramString == null)
      AppMethodBeat.o(25287);
    while (true)
    {
      return bool;
      d.cDE().pI(paramString);
      uO(paramString);
      bool = new File(by(paramString, false)).delete();
      AppMethodBeat.o(25287);
    }
  }

  public static c abm(String paramString)
  {
    AppMethodBeat.i(25291);
    paramString = d.cDE().abo(by(paramString, false));
    AppMethodBeat.o(25291);
    return paramString;
  }

  public static String by(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(25285);
    aw.ZK();
    paramString = j.b(com.tencent.mm.model.c.XZ(), "recbiz_", paramString, ".rec", 2);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(25285);
    }
    while (true)
    {
      return paramString;
      if (paramBoolean)
        AppMethodBeat.o(25285);
      else if (new File(paramString).exists())
        AppMethodBeat.o(25285);
      else
        AppMethodBeat.o(25285);
    }
  }

  static void uO(String paramString)
  {
    AppMethodBeat.i(25288);
    d.cDE().uO(by(paramString, false));
    AppMethodBeat.o(25288);
  }

  public static boolean uS(String paramString)
  {
    AppMethodBeat.i(25286);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(25286);
    }
    while (true)
    {
      return bool;
      g localg = d.cDE().abp(paramString);
      if (localg == null)
      {
        ab.d("MicroMsg.VoiceRemindLogic", "cancel null record : ".concat(String.valueOf(paramString)));
        bool = true;
        AppMethodBeat.o(25286);
      }
      else
      {
        ab.d("MicroMsg.VoiceRemindLogic", "cancel record : " + paramString + " LocalId:" + localg.field_msglocalid);
        if (localg.field_msglocalid != 0)
        {
          aw.ZK();
          com.tencent.mm.model.c.XO().jg(localg.field_msglocalid);
        }
        bool = abl(paramString);
        AppMethodBeat.o(25286);
      }
    }
  }

  public static boolean um(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(25289);
    if (paramString == null)
      AppMethodBeat.o(25289);
    while (true)
    {
      return bool;
      g localg = d.cDE().abp(paramString);
      if (localg == null)
      {
        ab.e("MicroMsg.VoiceRemindLogic", "Set error failed file:".concat(String.valueOf(paramString)));
        AppMethodBeat.o(25289);
      }
      else
      {
        localg.field_status = 98;
        localg.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
        localg.bJt = 320;
        bool = a(localg);
        ab.d("MicroMsg.VoiceRemindLogic", "setError file:" + paramString + " msgid:" + localg.field_msglocalid + " old stat:" + localg.field_status);
        if ((localg.field_msglocalid == 0) || (bo.isNullOrNil(localg.field_user)))
        {
          ab.e("MicroMsg.VoiceRemindLogic", "setError failed msg id:" + localg.field_msglocalid + " user:" + localg.field_user);
          AppMethodBeat.o(25289);
        }
        else
        {
          aw.ZK();
          paramString = com.tencent.mm.model.c.XO().jf(localg.field_msglocalid);
          paramString.setMsgId(localg.field_msglocalid);
          paramString.setStatus(5);
          paramString.ju(localg.field_user);
          paramString.setContent(f.d(localg.field_human, -1L, true));
          aw.ZK();
          com.tencent.mm.model.c.XO().a(paramString.field_msgId, paramString);
          AppMethodBeat.o(25289);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.h
 * JD-Core Version:    0.6.2
 */