package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class bh
{
  public static int fmN = 0;

  public static void A(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(77813);
    if ("bizflag".equals(paramString))
      if (paramBoolean)
      {
        fmN |= 1;
        AppMethodBeat.o(77813);
      }
    while (true)
    {
      return;
      fmN &= -2;
      AppMethodBeat.o(77813);
    }
  }

  public static void a(bi parambi, int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(77823);
    if (parambi != null)
    {
      Object localObject1 = parambi.dqJ;
      Object localObject2;
      if (!bo.isNullOrNil((String)localObject1))
      {
        localObject2 = localObject1;
        if (((String)localObject1).trim().startsWith("<msgsource>"));
      }
      else
      {
        localObject2 = "<msgsource></msgsource>";
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("<sec_msg_node>");
      ((StringBuilder)localObject1).append("<sfn>").append(paramInt1).append("</sfn>");
      ((StringBuilder)localObject1).append("<fd>").append(paramInt2).append("</fd>");
      ((StringBuilder)localObject1).append("<show-h5>").append(bo.nullAsNil(paramString1)).append("</show-h5>");
      ((StringBuilder)localObject1).append("<clip-len>").append(paramInt3).append("</clip-len>");
      ((StringBuilder)localObject1).append("<share-tip-url>").append(bo.nullAsNil(paramString2)).append("</share-tip-url>");
      ((StringBuilder)localObject1).append("</sec_msg_node>");
      parambi.ix(((String)localObject2).replaceAll("(?s)<sec_msg_node[^>]*>.*?</sec_msg_node>", "").replace("</msgsource>", ((StringBuilder)localObject1).toString() + "</msgsource>"));
      ((j)g.K(j.class)).bOr().b(parambi.field_msgSvrId, parambi);
    }
    AppMethodBeat.o(77823);
  }

  public static String aad()
  {
    AppMethodBeat.i(77814);
    Object localObject = new StringBuilder();
    if (fmN != 0)
    {
      ((StringBuilder)localObject).append("<");
      ((StringBuilder)localObject).append("bizflag");
      ((StringBuilder)localObject).append(">");
      ((StringBuilder)localObject).append(fmN);
      ((StringBuilder)localObject).append("</");
      ((StringBuilder)localObject).append("bizflag");
      ((StringBuilder)localObject).append(">");
    }
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(77814);
    return localObject;
  }

  public static String aae()
  {
    AppMethodBeat.i(77816);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(bo.nullAsNil(aad()));
    if (((StringBuilder)localObject).length() > 0)
    {
      ((StringBuilder)localObject).insert(0, "<msgsource>");
      ((StringBuilder)localObject).append("</msgsource>");
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(77816);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(77816);
    }
  }

  public static String aaf()
  {
    AppMethodBeat.i(77824);
    String str = (String)g.RP().Ry().get(70, null);
    if (!bo.isNullOrNil(str))
      g.RP().Ry().set(70, "");
    ab.d("MicroMsg.MsgSourceHelper", "getMsg ccr[%s]", new Object[] { str });
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<msgsource>");
    localStringBuilder.append(bo.nullAsNil(str));
    if (fmN != 0)
    {
      localStringBuilder.append("<");
      localStringBuilder.append("bizflag");
      localStringBuilder.append(">");
      localStringBuilder.append(fmN);
      localStringBuilder.append("</");
      localStringBuilder.append("bizflag");
      localStringBuilder.append(">");
    }
    localStringBuilder.append("</msgsource>");
    str = localStringBuilder.toString();
    AppMethodBeat.o(77824);
    return str;
  }

  public static int n(bi parambi)
  {
    int i = 0;
    AppMethodBeat.i(77815);
    if (parambi == null)
    {
      AppMethodBeat.o(77815);
      return i;
    }
    parambi = br.z(parambi.dqJ, "msgsource");
    if (parambi != null)
    {
      parambi = (String)parambi.get(".msgsource.bizflag");
      if (bo.isNullOrNil(parambi));
    }
    for (i = bo.getInt(parambi, 0); ; i = 0)
    {
      AppMethodBeat.o(77815);
      break;
    }
  }

  public static boolean o(bi parambi)
  {
    AppMethodBeat.i(77817);
    boolean bool;
    if ((parambi != null) && (!bo.isNullOrNil(parambi.dqJ)))
    {
      parambi = br.z(parambi.dqJ, "msgsource");
      if ((parambi != null) && (bo.ank((String)parambi.get(".msgsource.sec_msg_node.sfn")) == 1))
      {
        AppMethodBeat.o(77817);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77817);
    }
  }

  public static void oG(String paramString)
  {
    AppMethodBeat.i(77825);
    ab.i("MicroMsg.MsgSourceHelper", "parseMsgSource  has been Deprecated  by dk. at 20151218 [%s] %s ", new Object[] { paramString, "" });
    AppMethodBeat.o(77825);
  }

  public static void p(bi parambi)
  {
    AppMethodBeat.i(77818);
    Object localObject;
    if ((parambi != null) && (!bo.isNullOrNil(parambi.dqJ)))
    {
      localObject = br.z(parambi.dqJ, "msgsource");
      if ((localObject == null) || (bo.ank((String)((Map)localObject).get(".msgsource.sec_msg_node.sfn")) != 1));
    }
    while (true)
    {
      try
      {
        localObject = parambi.dqJ.substring(parambi.dqJ.indexOf("<sec_msg_node"), parambi.dqJ.indexOf("</sec_msg_node") + 12 + 2);
        ab.i("MicroMsg.MsgSourceHelper", (String)localObject);
        if (!bo.isNullOrNil((String)localObject))
        {
          String str = ((String)localObject).substring(((String)localObject).indexOf("<sfn"), ((String)localObject).indexOf("</sfn") + 3 + 2);
          parambi.ix(parambi.dqJ.replace((CharSequence)localObject, ((String)localObject).replace(str, "<sfn>0<sfn/>")));
        }
        AppMethodBeat.o(77818);
        return;
      }
      catch (Exception parambi)
      {
        ab.printErrStackTrace("MicroMsg.MsgSourceHelper", parambi, "resetShareForbidden msg exception", new Object[0]);
      }
      AppMethodBeat.o(77818);
    }
  }

  public static boolean q(bi parambi)
  {
    AppMethodBeat.i(77819);
    boolean bool;
    if ((parambi != null) && (!bo.isNullOrNil(parambi.dqJ)))
    {
      parambi = br.z(parambi.dqJ, "msgsource");
      if ((parambi != null) && (bo.ank((String)parambi.get(".msgsource.sec_msg_node.fd")) == 1))
      {
        AppMethodBeat.o(77819);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77819);
    }
  }

  public static String r(bi parambi)
  {
    AppMethodBeat.i(77820);
    if ((parambi != null) && (!bo.isNullOrNil(parambi.dqJ)))
    {
      parambi = br.z(parambi.dqJ, "msgsource");
      if (parambi != null)
      {
        parambi = (String)parambi.get(".msgsource.sec_msg_node.show-h5");
        if (!bo.isNullOrNil(parambi))
          AppMethodBeat.o(77820);
      }
    }
    while (true)
    {
      return parambi;
      parambi = "";
      AppMethodBeat.o(77820);
    }
  }

  public static String s(bi parambi)
  {
    AppMethodBeat.i(77821);
    if ((parambi != null) && (!bo.isNullOrNil(parambi.dqJ)))
    {
      parambi = br.z(parambi.dqJ, "msgsource");
      if (parambi != null)
      {
        parambi = (String)parambi.get(".msgsource.sec_msg_node.share-tip-url");
        if (!bo.isNullOrNil(parambi))
          AppMethodBeat.o(77821);
      }
    }
    while (true)
    {
      return parambi;
      parambi = "";
      AppMethodBeat.o(77821);
    }
  }

  public static int t(bi parambi)
  {
    AppMethodBeat.i(77822);
    int i;
    if ((parambi != null) && (!bo.isNullOrNil(parambi.dqJ)))
    {
      parambi = br.z(parambi.dqJ, "msgsource");
      if (parambi != null)
      {
        i = bo.ank((String)parambi.get(".msgsource.sec_msg_node.clip-len"));
        AppMethodBeat.o(77822);
      }
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(77822);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bh
 * JD-Core Version:    0.6.2
 */