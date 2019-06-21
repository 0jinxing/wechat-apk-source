package com.tencent.mm.storage;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.b;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.e;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

public final class p
  implements e, com.tencent.mm.plugin.messenger.foundation.a.f
{
  private be xHS;

  public p(be parambe)
  {
    AppMethodBeat.i(11844);
    z.aff();
    this.xHS = parambe;
    this.xHS.a(this);
    this.xHS.a(this);
    AppMethodBeat.o(11844);
  }

  private void a(String paramString, ak paramak, int paramInt1, int paramInt2, h.c paramc)
  {
    AppMethodBeat.i(11848);
    bi localbi;
    com.tencent.mm.aj.a.a locala;
    c localc;
    label244: Object localObject1;
    String str;
    label377: Object localObject2;
    if ((paramak != null) && (paramc != null) && (paramc.jMj != -1L) && (paramak.jl(8388608)))
    {
      localbi = ((com.tencent.mm.aj.o)g.K(com.tencent.mm.aj.o.class)).XP().aM(paramString, paramc.jMj);
      locala = z.aeU().fv(paramc.jMj);
      localc = z.aeT().aK(paramc.jMj);
      if (localc.field_bizChatServId == null)
      {
        ab.w("MicroMsg.BizConversationStorage", "willen updateBizChatConversation bizChatInfo == null");
        AppMethodBeat.o(11848);
      }
      while (true)
      {
        return;
        if ((localbi != null) && (localbi.field_msgId != 0L))
          break;
        ab.i("MicroMsg.BizConversationStorage", "update null BizChatConversation with talker ".concat(String.valueOf(paramString)));
        locala.field_status = 0;
        locala.field_isSend = 0;
        locala.field_content = "";
        locala.field_msgType = "0";
        locala.field_unReadCount = 0;
        locala.field_digest = "";
        locala.field_digestUser = "";
        z.aeU();
        b.a(locala, paramInt2, paramInt1);
        z.aeU().b(locala);
        AppMethodBeat.o(11848);
      }
      boolean bool = localc.isGroup();
      locala.field_brandUserName = paramString;
      if (localbi.dtv())
      {
        locala.field_content = localbi.dtW();
        localObject1 = new PString();
        this.xHS.Cb().a(localbi, (PString)localObject1, new PString(), new PInt(), false);
        str = ((PString)localObject1).value;
        localObject1 = z.aeV().cH(localbi.field_bizChatUserId);
        if (!bool)
          break label922;
        if ((localbi.field_isSend != 1) || (localObject1 == null))
          break label850;
        locala.field_digest = (ah.getContext().getString(2131296970) + ":" + str);
        ((com.tencent.mm.aj.a.j)localObject1).field_userName = ah.getContext().getString(2131296970);
        localObject1 = null;
        str = this.xHS.ac(localbi.getType(), localbi.field_content);
        localObject2 = bo.nullAsNil(locala.field_digest);
        if (!bo.isNullOrNil(str))
          break label935;
        str = "";
        label420: locala.field_digest = ((String)localObject2).concat(str);
        locala.field_digestUser = "";
        locala.field_chatType = localc.field_chatType;
        locala.field_lastMsgID = localbi.field_msgId;
        if (!localbi.bwt())
          break label961;
      }
    }
    label670: label935: label961: label1099: label1102: 
    while (true)
    {
      long l = localbi.field_createTime;
      label474: locala.field_lastMsgTime = l;
      locala.field_status = localbi.field_status;
      locala.field_isSend = localbi.field_isSend;
      locala.field_msgType = Integer.toString(localbi.getType());
      locala.field_flag = b.a(locala, 1, localbi.field_createTime);
      int i = 0;
      int j;
      if ((!paramc.oqJ.equals("insert")) || (paramc.oqL <= 0))
      {
        j = i;
        if (paramc.oqJ.equals("update"))
        {
          j = i;
          if (locala.field_unReadCount + paramc.oqL < 0);
        }
      }
      else
      {
        locala.field_unReadCount += paramc.oqL;
        locala.field_newUnReadCount += paramc.oqL;
        j = i;
        if (paramc.oqL > 0)
        {
          j = i;
          if (localc.lc(1))
          {
            j = paramak.field_unReadCount - paramc.oqL;
            if (j > 0)
              break label978;
            paramak.hM(0);
            paramak.hS(paramak.field_unReadMuteCount + paramc.oqL);
            j = 1;
          }
        }
      }
      i = j;
      if (paramc.oqJ.equals("insert"))
      {
        i = j;
        if (paramc.oqK.size() > 0)
        {
          i = j;
          if (localc.isGroup())
          {
            str = z.aeV().cI(localbi.field_talker);
            localObject2 = paramc.oqK.iterator();
            label755: if (((Iterator)localObject2).hasNext())
            {
              paramc = (bi)((Iterator)localObject2).next();
              if ((str == null) || (paramc.field_isSend == 1) || (!paramc.isText()) || (!paramc.apB(str)))
                break label1099;
              locala.field_atCount += 1;
              paramak.hR(paramak.field_atCount + 1);
              j = 1;
            }
          }
        }
      }
      while (true)
      {
        break label755;
        locala.field_content = localbi.field_content;
        break label244;
        label850: if ((localObject1 != null) && (!bo.isNullOrNil(((com.tencent.mm.aj.a.j)localObject1).field_userName)))
        {
          locala.field_digest = (((com.tencent.mm.aj.a.j)localObject1).field_userName + ":" + str);
          localObject1 = ((com.tencent.mm.aj.a.j)localObject1).field_userName;
          break label377;
        }
        locala.field_digest = str;
        localObject1 = null;
        break label377;
        locala.field_digest = str;
        localObject1 = null;
        break label377;
        str = " " + bo.nullAsNil(str);
        break label420;
        if (localbi.field_status != 1)
          break label1102;
        l = 9223372036854775807L;
        break label474;
        label978: paramak.hM(j);
        break label670;
        i = j;
        z.aeU();
        b.a(locala, paramInt2, paramInt1);
        paramc = (h.c)localObject1;
        if (bo.isNullOrNil((String)localObject1))
          paramc = localc.mJ(localbi.field_bizChatUserId);
        ab.i("MicroMsg.BizConversationStorage", "updateBizChatConversation brandUserName:%s, bizChatId:%s, userId:%s, displayName:%s", new Object[] { paramString, localc.field_bizChatServId, localbi.field_bizChatUserId, paramc });
        z.aeU().b(locala);
        if (i != 0)
          this.xHS.a(paramak, paramString);
        AppMethodBeat.o(11848);
        break;
      }
    }
  }

  public static void aok(String paramString)
  {
    AppMethodBeat.i(11850);
    be localbe = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR();
    paramString = new ak(paramString);
    paramString.jj("officialaccounts");
    b(paramString, localbe);
    AppMethodBeat.o(11850);
  }

  public static void b(ak paramak, be parambe)
  {
    AppMethodBeat.i(11851);
    if ((paramak == null) || (parambe == null))
      AppMethodBeat.o(11851);
    while (true)
    {
      return;
      if ((!t.mZ(paramak.field_username)) || (bo.isNullOrNil(paramak.field_parentRef)))
        break label526;
      if ((!s.aVO()) || (!t.ny(paramak.field_parentRef)))
        break;
      AppMethodBeat.o(11851);
    }
    ak localak = parambe.aoZ(paramak.field_parentRef);
    ab.v("MicroMsg.BizConversationStorage", "postConvExt, username = %s, parentRef = %s", new Object[] { paramak.field_username, paramak.field_parentRef });
    if (!paramak.field_parentRef.equals("officialaccounts"));
    for (int i = 1; ; i = 0)
    {
      if (localak == null)
      {
        localak = new ak(paramak.field_parentRef);
        if (i != 0)
          localak.jj(2097152);
      }
      for (int j = 1; ; j = 0)
      {
        if ((i != 0) && (localak.field_attrflag == 0))
        {
          localak.jj(2097152);
          ab.v("MicroMsg.BizConversationStorage", "Enterprise cvs reset attr flag!");
        }
        ab.i("MicroMsg.BizConversationStorage", "enterprise cvs count is %d", new Object[] { Integer.valueOf(localak.field_unReadCount) });
        Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().apm(paramak.field_parentRef);
        bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rb((String)localObject);
        if ((localbi != null) && (localbi.field_msgId > 0L))
        {
          localak.ap(localbi);
          localak.setContent(localbi.field_talker + ":" + localbi.field_content);
          localak.jg(Integer.toString(localbi.getType()));
          be.b localb = parambe.Cb();
          if (localb != null)
          {
            PString localPString = new PString();
            localObject = new PString();
            PInt localPInt = new PInt();
            localbi.ju(paramak.field_parentRef);
            localbi.setContent(localak.field_content);
            localb.a(localbi, localPString, (PString)localObject, localPInt, true);
            localak.jh(localPString.value);
            localak.ji(((PString)localObject).value);
            localak.hP(localPInt.value);
          }
        }
        while (true)
        {
          int k = 0;
          int m = k;
          if (i != 0)
          {
            m = k;
            if (parambe.apl(localak.field_username) <= 0)
              m = 1;
          }
          if (m == 0)
            break label492;
          parambe.aoX(localak.field_username);
          AppMethodBeat.o(11851);
          break;
          localak.dsI();
          ab.i("MicroMsg.BizConversationStorage", "lastOfMsg is null or MsgId <= 0, lastConvBiz is %s", new Object[] { localObject });
        }
        label492: if (j != 0)
        {
          parambe.d(localak);
          AppMethodBeat.o(11851);
          break;
        }
        parambe.a(localak, localak.field_username);
        label526: AppMethodBeat.o(11851);
        break;
      }
    }
  }

  public final void a(bi parambi, ak paramak)
  {
    Object localObject = null;
    AppMethodBeat.i(11845);
    c localc;
    String str1;
    com.tencent.mm.aj.a.j localj;
    String str2;
    if ((paramak != null) && (parambi != null) && (parambi.field_bizChatId != -1L) && (paramak.jl(8388608)))
    {
      localc = z.aeT().aK(parambi.field_bizChatId);
      str1 = paramak.field_digest;
      if (!bo.isNullOrNil(parambi.field_bizChatUserId))
      {
        localj = z.aeV().cH(parambi.field_bizChatUserId);
        if (localj != null)
        {
          str2 = localj.field_userName;
          boolean bool = parambi.field_bizChatUserId.equals(z.aeV().cI(parambi.field_talker));
          if ((localj == null) || (!bool))
            break label220;
          paramak.jh(ah.getContext().getString(2131296970) + ":" + str1);
          label152: if (localc.isGroup())
            break label332;
          if ((bool) || (str2 == null) || (str2.length() <= 0) || (str2.equals(localc.field_chatName)))
            break label271;
          localc.field_chatName = str2;
          z.aeT().b(localc);
          AppMethodBeat.o(11845);
        }
      }
    }
    while (true)
    {
      return;
      str2 = null;
      break;
      label220: if ((localj == null) || (bo.isNullOrNil(localj.field_userName)))
        break label152;
      paramak.jh(localj.field_userName + ":" + str1);
      break label152;
      label271: paramak = z.aeV().cH(localc.field_bizChatServId);
      parambi = localObject;
      if (paramak != null)
        parambi = paramak.field_userName;
      if ((parambi != null) && (parambi.length() > 0) && (!parambi.equals(localc.field_chatName)))
      {
        localc.field_chatName = parambi;
        z.aeT().b(localc);
      }
      label332: AppMethodBeat.o(11845);
      continue;
      ab.w("MicroMsg.BizConversationStorage", "BizChatUserId is null:%s %s", new Object[] { localc.field_bizChatServId, localc.field_chatName });
      AppMethodBeat.o(11845);
    }
  }

  public final void a(bi parambi, ak paramak, boolean paramBoolean, h.c paramc)
  {
    AppMethodBeat.i(11846);
    if (paramc == null)
    {
      ab.e("MicroMsg.BizConversationStorage", "compose notifyInfo is null");
      AppMethodBeat.o(11846);
      return;
    }
    String str = paramc.talker;
    if (paramBoolean)
    {
      if ((parambi != null) && (parambi.field_isSend != 1) && ((bh.n(parambi) & 0x1) != 0))
      {
        ab.i("MicroMsg.BizConversationStorage", "create a temp session conversation.");
        paramak.jj(4194304);
      }
      if ((parambi != null) && (com.tencent.mm.aj.f.kq(str)))
      {
        ab.i("MicroMsg.BizConversationStorage", "create a bitChat conversation.");
        paramak.jj(8388608);
      }
    }
    while (true)
    {
      if ((paramc != null) && (!paramc.oqK.isEmpty()) && (paramc.oqK.get(0) != null))
      {
        paramak.hO(((bi)paramc.oqK.get(0)).field_isSend);
        if (paramc.oqJ.equals("insert"))
          paramak.xXq = ((bi)paramc.oqK.get(paramc.oqK.size() - 1));
      }
      AppMethodBeat.o(11846);
      break;
      ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str);
      if ((localad != null) && (localad.dsf()) && (!com.tencent.mm.n.a.jh(localad.field_type)) && (parambi != null) && (parambi.field_isSend != 1) && (!paramak.jl(4194304)) && ((paramak.field_conversationTime < z.aff()) || ((bh.n(parambi) & 0x1) != 0)))
      {
        paramak.jj(4194304);
        ab.i("MicroMsg.BizConversationStorage", "onNotifyChange is old temp session, %s", new Object[] { str });
      }
      if ((parambi != null) && (com.tencent.mm.aj.f.kq(str)))
      {
        ab.i("MicroMsg.BizConversationStorage", "onNotifyChange a bitChat conversation, %s", new Object[] { str });
        paramak.jj(8388608);
      }
    }
  }

  public final void aoj(String paramString)
  {
    AppMethodBeat.i(11849);
    if ((paramString == null) || (!t.mZ(paramString)) || (!com.tencent.mm.aj.f.rc(paramString)))
      AppMethodBeat.o(11849);
    ak localak;
    while (true)
    {
      return;
      localak = this.xHS.aoZ(paramString);
      if (localak != null)
        break;
      AppMethodBeat.o(11849);
    }
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().apm(paramString);
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rb((String)localObject);
    if ((localObject != null) && (((cy)localObject).field_msgId > 0L))
    {
      localak.ap((bi)localObject);
      localak.setContent(((cy)localObject).field_talker + ":" + ((cy)localObject).field_content);
      localak.jg(Integer.toString(((bi)localObject).getType()));
      be.b localb = this.xHS.Cb();
      if (localb == null)
        break label281;
      PString localPString1 = new PString();
      PString localPString2 = new PString();
      PInt localPInt = new PInt();
      ((bi)localObject).ju(paramString);
      ((bi)localObject).setContent(localak.field_content);
      localb.a((bi)localObject, localPString1, localPString2, localPInt, true);
      localak.jh(localPString1.value);
      localak.ji(localPString2.value);
      localak.hP(localPInt.value);
    }
    while (true)
    {
      this.xHS.a(localak, localak.field_username);
      AppMethodBeat.o(11849);
      break;
      label281: localak.dsI();
    }
  }

  public final void b(bi parambi, ak paramak, boolean paramBoolean, h.c paramc)
  {
    AppMethodBeat.i(11847);
    be localbe = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR();
    if (paramc == null)
    {
      parambi = null;
      if ((paramc == null) || (!paramc.oqJ.equals("delete")) || (paramc.oqN <= 0))
        break label896;
    }
    label896: for (int i = paramc.oqN; ; i = 0)
    {
      if ((paramc != null) && (paramc.oqJ.equals("insert")) && (paramc.oqM > 0));
      for (int j = paramc.oqM; ; j = 0)
      {
        ak localak;
        Object localObject1;
        if (!bo.isNullOrNil(paramak.field_parentRef))
        {
          localak = localbe.aoZ(paramak.field_parentRef);
          if ((localak == null) || (!localak.jl(2097152)))
            break label664;
          if (j > 0)
          {
            if (((paramc.oqJ.equals("insert")) && (paramc.oqL > 0)) || ((paramc.oqJ.equals("update")) && (localak.field_unReadCount + paramc.oqL >= 0)))
            {
              localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi);
              if ((localObject1 == null) || (!((ad)localObject1).DX()))
                break label614;
              localak.hS(localak.field_unReadMuteCount + j);
            }
            label239: localbe.a(paramak, i, j);
          }
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().apm(paramak.field_parentRef);
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rb((String)localObject1);
          if ((localObject1 == null) || (((cy)localObject1).field_msgId <= 0L))
            break label656;
          localak.ap((bi)localObject1);
          localak.setContent(((cy)localObject1).field_talker + ":" + ((cy)localObject1).field_content);
          localak.jg(Integer.toString(((bi)localObject1).getType()));
          if (localbe.Cb() != null)
          {
            Object localObject2 = new PString();
            PString localPString = new PString();
            PInt localPInt = new PInt();
            ((bi)localObject1).ju(paramak.field_parentRef);
            ((bi)localObject1).setContent(localak.field_content);
            localbe.Cb().a((bi)localObject1, (PString)localObject2, localPString, localPInt, true);
            localObject1 = localbe.ac(((bi)localObject1).getType(), ((cy)localObject1).field_content);
            localObject2 = bo.nullAsNil(((PString)localObject2).value);
            if (!bo.isNullOrNil((String)localObject1))
              break label630;
            localObject1 = "";
            label488: localak.jh(((String)localObject2).concat((String)localObject1));
            localak.ji(localPString.value);
            localak.hP(localPInt.value);
          }
          label520: if (localbe.a(localak, paramak.field_parentRef) > 0)
          {
            ab.d("MicroMsg.BizConversationStorage", "hakon update parent conversation's unread %s, %d", new Object[] { paramak.field_parentRef, Integer.valueOf(localak.field_unReadCount + j) });
            localbe.b(3, (n)localbe, paramak.field_parentRef);
          }
        }
        while (true)
        {
          a(parambi, paramak, j, i, paramc);
          AppMethodBeat.o(11847);
          return;
          parambi = paramc.talker;
          break;
          label614: localak.hM(localak.field_unReadCount + j);
          break label239;
          label630: localObject1 = " " + bo.nullAsNil((String)localObject1);
          break label488;
          label656: localak.dsI();
          break label520;
          label664: if ((localak != null) && ("officialaccounts".equals(localak.field_username)))
          {
            if ((j > 0) && (!s.aVO()) && (((paramc.oqJ.equals("insert")) && (paramc.oqL > 0)) || ((paramc.oqJ.equals("update")) && (localak.field_unReadCount + paramc.oqL >= 0))))
            {
              localak.hM(localak.field_unReadCount + j);
              localbe.a(localak, paramak.field_parentRef);
            }
          }
          else if ((localak != null) && ("appbrandcustomerservicemsg".equals(localak.field_username)) && (j > 0))
          {
            if (((paramc.oqJ.equals("insert")) && (paramc.oqL > 0)) || ((paramc.oqJ.equals("update")) && (localak.field_unReadCount + paramc.oqL >= 0)))
              localak.hM(localak.field_unReadCount + j);
            localbe.a(paramak, i, j);
            localbe.a(localak, paramak.field_parentRef);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.p
 * JD-Core Version:    0.6.2
 */