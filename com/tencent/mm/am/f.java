package com.tencent.mm.am;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.be.b;
import com.tencent.mm.storage.bi;

public final class f extends ai
{
  public final String getTag()
  {
    return "MicroMsg.ConversationDataTransfer";
  }

  public final boolean kw(int paramInt)
  {
    if ((paramInt != 0) && (paramInt < 604372991));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(16434);
    ab.d("MicroMsg.ConversationDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if ((paramInt != 0) && (paramInt < 604372991))
    {
      com.tencent.mm.plugin.report.service.h.pYm.k(336L, 14L, 1L);
      aw.ZK();
      localObject1 = c.Ru();
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("select rconversation.username from rconversation, rcontact, bizinfo where rconversation.username = rcontact.username and rconversation.username = bizinfo.username and ( rcontact.verifyFlag & 8").append(" ) != 0 ");
      localObject2 = ((StringBuilder)localObject2).toString();
      ab.d("MicroMsg.ConversationDataTransfer", "select sql %s", new Object[] { localObject2 });
      localObject2 = ((com.tencent.mm.cd.h)localObject1).a((String)localObject2, null, 2);
      if ((localObject2 != null) && (((Cursor)localObject2).moveToFirst()))
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("Update rconversation set parentRef = 'officialaccounts' where 1 !=1 ");
        do
        {
          localObject4 = ((Cursor)localObject2).getString(0);
          if (!t.nG((String)localObject4))
            ((StringBuilder)localObject3).append(" or username = '").append((String)localObject4).append("'");
        }
        while (((Cursor)localObject2).moveToNext());
        ((Cursor)localObject2).close();
        localObject3 = ((StringBuilder)localObject3).toString();
        ab.d("MicroMsg.ConversationDataTransfer", "changed[%B] execute sql[%s]", new Object[] { Boolean.TRUE, localObject3 });
        ((com.tencent.mm.cd.h)localObject1).hY("rconversation", (String)localObject3);
        aw.ZK();
        localObject1 = c.XR().aoZ("officialaccounts");
        if (localObject1 != null)
          break label555;
        localObject1 = new ak("officialaccounts");
        ((ak)localObject1).dsI();
        aw.ZK();
        c.XR().d((ak)localObject1);
      }
    }
    label555: 
    while (true)
    {
      aw.ZK();
      localObject3 = c.XR().dsR();
      if (bo.isNullOrNil((String)localObject3))
      {
        ab.w("MicroMsg.ConversationDataTransfer", "last convBiz is null");
        AppMethodBeat.o(16434);
      }
      while (true)
      {
        return;
        aw.ZK();
        bi localbi = c.XO().Rb((String)localObject3);
        if ((localbi == null) || (localbi.field_msgId == 0L))
        {
          ab.w("MicroMsg.ConversationDataTransfer", "last biz msg is error");
          AppMethodBeat.o(16434);
        }
        else
        {
          ((ak)localObject1).ap(localbi);
          ((ak)localObject1).setContent(localbi.field_talker + ":" + localbi.field_content);
          ((ak)localObject1).jg(Integer.toString(localbi.getType()));
          aw.ZK();
          be.b localb = c.XR().Cb();
          if (localb != null)
          {
            localObject3 = new PString();
            localObject4 = new PString();
            PInt localPInt = new PInt();
            localbi.ju("officialaccounts");
            localbi.setContent(((at)localObject1).field_content);
            localb.a(localbi, (PString)localObject3, (PString)localObject4, localPInt, false);
            ((ak)localObject1).jh(((PString)localObject3).value);
            ((ak)localObject1).ji(((PString)localObject4).value);
            ((ak)localObject1).hP(localPInt.value);
          }
          aw.ZK();
          c.XR().a((ak)localObject1, ((at)localObject1).field_username);
          if ((localObject2 != null) && (!((Cursor)localObject2).isClosed()))
            ((Cursor)localObject2).close();
          AppMethodBeat.o(16434);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.f
 * JD-Core Version:    0.6.2
 */