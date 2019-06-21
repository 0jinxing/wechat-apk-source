package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class a
{
  public static void a(bi parambi, a.a parama)
  {
    AppMethodBeat.i(16612);
    if (bo.isNullOrNil(parambi.dJE))
    {
      AppMethodBeat.o(16612);
      return;
    }
    d locald = new d();
    locald.l("20ExpIdStr", parambi.dJE + ",");
    locald.l("21OpType", parama.value + ",");
    locald.l("22msgId", parambi.field_msgSvrId + ",");
    locald.l("23MessageType", parambi.getType() + ",");
    int i;
    if (parambi.bAA())
    {
      parama = j.b.X(parambi.field_content, parambi.field_reserved);
      if (parama == null)
        i = 0;
    }
    while (true)
    {
      label168: parama = parambi.field_talker;
      locald.l("24AppMsgInnerType", i + ",");
      locald.l("25curUsername", parama + ",");
      String str = "";
      if (parambi.field_isSend == 1)
        parama = r.Yz();
      while (true)
      {
        locald.l("26msgPostUserName", parama + ",");
        locald.l("27MediaState", parambi.dJF + ",");
        ab.v("MicroMsg.ChattingExpUtil", "report logbuffer(13564): [chatting_exp]" + locald.Fk());
        h.pYm.e(13564, new Object[] { locald });
        AppMethodBeat.o(16612);
        break;
        i = parama.type;
        break label168;
        if ((parama != null) && (t.kH(parama)))
        {
          parama = str;
          if (parambi.field_content != null)
          {
            i = bf.ox(parambi.field_content);
            parama = str;
            if (i != -1)
              parama = parambi.field_content.substring(0, i).trim();
          }
        }
      }
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.a
 * JD-Core Version:    0.6.2
 */