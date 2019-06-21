package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.a;

final class k$1
  implements Runnable
{
  k$1(k paramk, bi parambi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31344);
    ((i)g.K(i.class)).ai(this.fku);
    bi localbi = this.fku;
    boolean bool1 = this.yPj;
    Object localObject1 = new PString();
    Object localObject2 = new PString();
    boolean bool2;
    d locald;
    if (a.a(localbi, (PString)localObject1, (PString)localObject2))
    {
      Object localObject3 = ((PString)localObject1).value;
      String str = ((PString)localObject2).value;
      localObject1 = localbi.field_talker;
      bool2 = t.mN((String)localObject1);
      if (localbi.field_isSend != 1)
        break label529;
      localObject2 = r.Yz();
      locald = new d();
      locald.l("20source_publishid", (String)localObject3 + ",");
      locald.l("21uxinfo", str + ",");
      locald.l("22clienttime", bo.anU() + ",");
      localObject3 = new StringBuilder();
      if (localbi.getType() != 62)
        break label552;
      i = 1;
      label209: locald.l("23source_type", i + ",");
      localObject3 = new StringBuilder();
      if (!bool2)
        break label558;
      i = 4;
      label248: locald.l("24scene", i + ",");
      locald.l("25scene_chatname", (String)localObject1 + ",");
      locald.l("26scene_username", (String)localObject2 + ",");
      locald.l("27curr_publishid", ",");
      locald.l("28curr_msgid", localbi.field_msgSvrId + ",");
      locald.l("29curr_favid", "0,");
      localObject2 = new StringBuilder();
      if (!bool1)
        break label564;
      i = 1;
      label386: locald.l("30isdownload", i + ",");
      localObject2 = new StringBuilder();
      if (!bool2)
        break label570;
    }
    label529: label552: label558: label564: label570: for (int i = n.mA((String)localObject1); ; i = 0)
    {
      locald.l("31chatroom_membercount", i + ",");
      ((i)g.K(i.class)).b(((i)g.K(i.class)).I(localbi), locald);
      ab.i("MicroMsg.AdVideoStatistic", "report snsad_video_exposure: " + locald.Fk());
      h.pYm.e(12989, new Object[] { locald });
      AppMethodBeat.o(31344);
      return;
      if (bool2)
      {
        localObject2 = bf.oy(localbi.field_content);
        break;
      }
      localObject2 = localObject1;
      break;
      i = 2;
      break label209;
      i = 3;
      break label248;
      i = 0;
      break label386;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.k.1
 * JD-Core Version:    0.6.2
 */