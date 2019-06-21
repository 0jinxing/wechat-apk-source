package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class ad
{
  public static String a(bi parambi, j.b paramb)
  {
    AppMethodBeat.i(30944);
    String str1 = "";
    String str2 = str1;
    if (paramb != null)
    {
      str2 = str1;
      if (!bo.isNullOrNil(paramb.csD))
      {
        paramb = am.aUq().aiE(paramb.csD);
        str2 = str1;
        if (paramb != null)
        {
          str2 = str1;
          if (paramb.bCR())
          {
            str2 = str1;
            if (com.tencent.mm.vfs.e.ct(paramb.field_fileFullPath))
              str2 = paramb.field_fileFullPath;
          }
        }
      }
    }
    if (!bo.isNullOrNil(str2))
    {
      ab.d("MicroMsg.HistoryExportUtil", "get hd appmsg image path ok, %s", new Object[] { str2 });
      AppMethodBeat.o(30944);
    }
    while (true)
    {
      return str2;
      if (parambi != null)
        str2 = o.ahl().I(parambi.field_imgPath, true);
      ab.d("MicroMsg.HistoryExportUtil", "try get thumb appmsg image path finish, %s", new Object[] { str2 });
      AppMethodBeat.o(30944);
    }
  }

  private static String h(com.tencent.mm.at.e parame)
  {
    AppMethodBeat.i(30943);
    String str;
    if (parame != null)
      if (parame.agQ())
      {
        str = parame.fDz;
        if ((str != null) && (com.tencent.mm.vfs.e.ct(str)))
        {
          AppMethodBeat.o(30943);
          parame = str;
        }
      }
    while (true)
    {
      return parame;
      str = parame.fDz;
      str = o.ahl().q(str, null, null);
      if ((str != null) && (com.tencent.mm.vfs.e.ct(str)))
      {
        AppMethodBeat.o(30943);
        parame = str;
      }
      else
      {
        parame = parame.fDB;
        parame = o.ahl().q(parame, null, null);
        if ((parame != null) && (com.tencent.mm.vfs.e.ct(parame)))
        {
          AppMethodBeat.o(30943);
        }
        else
        {
          AppMethodBeat.o(30943);
          parame = null;
        }
      }
    }
  }

  public static String nb(long paramLong)
  {
    AppMethodBeat.i(30941);
    String str = h(o.ahl().fJ(paramLong));
    if (str != null)
      AppMethodBeat.o(30941);
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(30941);
    }
  }

  public static String nc(long paramLong)
  {
    AppMethodBeat.i(30942);
    String str = h(o.ahl().fI(paramLong));
    if (str != null)
      AppMethodBeat.o(30942);
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(30942);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ad
 * JD-Core Version:    0.6.2
 */