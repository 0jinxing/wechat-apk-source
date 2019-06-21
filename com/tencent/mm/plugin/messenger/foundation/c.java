package com.tencent.mm.plugin.messenger.foundation;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.au.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.u;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.vo;
import com.tencent.mm.protocal.protobuf.vv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.List;

public final class c
  implements com.tencent.mm.plugin.messenger.foundation.a.r
{
  private static boolean QE(String paramString)
  {
    AppMethodBeat.i(1027);
    boolean bool;
    if ((com.tencent.mm.model.t.nd(paramString)) && (!b.ahP()))
    {
      bool = true;
      AppMethodBeat.o(1027);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1027);
    }
  }

  public static e.b a(e.a parama, com.tencent.mm.plugin.messenger.foundation.a.t paramt)
  {
    AppMethodBeat.i(1026);
    cm localcm = parama.eAB;
    if ((10008 == ae.giz) && (ae.giA != 0))
    {
      ab.i("MicroMsg.MessageSyncExtension", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(localcm.ptF), Integer.valueOf(ae.giA) });
      localcm.ptF = ae.giA;
      ae.giA = 0;
    }
    if (((j)g.K(j.class)).bOr().jh(localcm.ptF))
    {
      ab.i("MicroMsg.MessageSyncExtension", "ignore, because reSync the deleted msg perhaps the IDC has change has swtiched");
      localObject1 = null;
      AppMethodBeat.o(1026);
    }
    String str;
    while (true)
    {
      return localObject1;
      str = aa.a(localcm.vEB);
      localObject1 = aa.a(localcm.vEC);
      if ((!str.equals(com.tencent.mm.model.r.Yz())) || (!((String)localObject1).equals("newsapp")) || (localcm.nao == 51))
        break;
      ab.w("MicroMsg.MessageSyncExtension", "msgid:%d type:%d this fucking msg from mac weixin ,someone send msg to newsapp at mac weixin ,givp up.", new Object[] { Long.valueOf(localcm.ptF), Integer.valueOf(localcm.nao) });
      localObject1 = null;
      AppMethodBeat.o(1026);
    }
    ab.i("MicroMsg.MessageSyncExtension", "dkAddMsg from:%s to:%s id:[%d,%d,%d] status:%d type:%d time:[%d %s] diff:%d imgstatus:%d imgbuf:%d src:%d push:%d content:%s", new Object[] { str, localObject1, Long.valueOf(localcm.ptF), Integer.valueOf(localcm.ptD), Integer.valueOf(localcm.vEI), Integer.valueOf(localcm.jBT), Integer.valueOf(localcm.nao), Integer.valueOf(localcm.pcX), bo.mx(localcm.pcX), Long.valueOf(bo.anT() - localcm.pcX), Integer.valueOf(localcm.vEE), Integer.valueOf(aa.a(localcm.vEF, new byte[0]).length), Integer.valueOf(bo.nullAsNil(localcm.vEG).length()), Integer.valueOf(bo.nullAsNil(localcm.vEH).length()), bo.anv(aa.a(localcm.vED, "")) });
    ab.i("MicroMsg.MessageSyncExtension", "parseMsgSource  has been Deprecated  by dk. at 20151218 [%s] %s ", new Object[] { localcm.vEG, "" });
    u.h(localcm);
    if (str.equals("readerapp"))
    {
      localcm.vEB = aa.vy("newsapp");
      localcm.nao = 12399999;
    }
    if (((str.equals("blogapp")) || (str.equals("newsapp"))) && (localcm.nao != 10002))
      localcm.nao = 12399999;
    if (localcm.nao == 52)
      localcm.nao = 1000052;
    if (localcm.nao == 53)
      localcm.nao = 1000053;
    bf.c(parama);
    int i = 0;
    Object localObject1 = null;
    e locale = e.d.bg(Integer.valueOf(localcm.nao));
    Object localObject2 = locale;
    if (locale == null)
      localObject2 = e.d.bg(str);
    if (localObject2 != null)
    {
      localObject2 = ((e)localObject2).b(parama);
      if (localObject2 != null)
        break label671;
      localObject1 = null;
      label566: if (localObject1 != null)
        break label680;
      ab.w("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg, type=%d, svrId=%d, MsgSeq=%d, createTime=%d, addMsgInfo=%s", new Object[] { Integer.valueOf(localcm.nao), Long.valueOf(localcm.ptF), Integer.valueOf(localcm.vEI), Integer.valueOf(localcm.pcX), parama });
    }
    while (true)
    {
      i = 1;
      localObject1 = localObject2;
      u.b(5, localcm);
      if (i == 0)
        ab.f("MicroMsg.MessageSyncExtension", "unknown add msg request, type=%d. drop now !!!", new Object[] { Integer.valueOf(localcm.nao) });
      AppMethodBeat.o(1026);
      break;
      label671: localObject1 = ((e.b)localObject2).csG;
      break label566;
      label680: if (!QE(str))
      {
        ab.d("MicroMsg.MessageSyncExtension", " msg , id =" + ((cy)localObject1).field_msgId + "  " + paramt);
        if ((((cy)localObject1).field_msgId > 0L) && (paramt != null) && (((e.b)localObject2).fsZ))
          paramt.a((bi)localObject1, localcm);
      }
    }
  }

  public final void a(tb paramtb, byte[] paramArrayOfByte, boolean paramBoolean, com.tencent.mm.plugin.messenger.foundation.a.t paramt)
  {
    AppMethodBeat.i(1025);
    switch (paramtb.wat)
    {
    case 6:
    case 7:
    default:
    case 5:
    case 8:
    case 9:
    }
    while (true)
    {
      AppMethodBeat.o(1025);
      while (true)
      {
        return;
        paramArrayOfByte = (cm)new cm().parseFrom(paramArrayOfByte);
        if (paramArrayOfByte != null)
        {
          paramtb = new e.a(paramArrayOfByte, false, false, false);
          a(paramtb, paramt);
          if (!paramtb.fsU)
            bg.a(aa.a(paramArrayOfByte.vEB), paramArrayOfByte.ptF, paramArrayOfByte.pcX * 1000L, paramArrayOfByte.nao);
        }
        AppMethodBeat.o(1025);
        continue;
        paramArrayOfByte = (vo)new vo().parseFrom(paramArrayOfByte);
        paramtb = aa.a(paramArrayOfByte.wcB);
        i = paramArrayOfByte.wcE;
        paramt = ((j)g.K(j.class)).bOr().cy(paramtb, i);
        if (paramt.moveToFirst())
          while (!paramt.isAfterLast())
          {
            paramArrayOfByte = new bi();
            paramArrayOfByte.d(paramt);
            bf.m(paramArrayOfByte);
            paramt.moveToNext();
          }
        paramt.close();
        ((j)g.K(j.class)).bOr().cx(paramtb, i);
        AppMethodBeat.o(1025);
      }
      paramtb = (vv)new vv().parseFrom(paramArrayOfByte);
      paramArrayOfByte = paramtb.wcH;
      for (int i = 0; i < paramArrayOfByte.size(); i++)
        bf.r(aa.a(paramtb.wcB), ((Integer)paramArrayOfByte.get(i)).intValue());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.c
 * JD-Core Version:    0.6.2
 */