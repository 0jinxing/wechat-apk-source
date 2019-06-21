package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;

public class e
  implements com.tencent.mm.ai.e
{
  private static final a fks;

  static
  {
    AppMethodBeat.i(59721);
    fks = new a((byte)0);
    AppMethodBeat.o(59721);
  }

  public static void a(com.tencent.mm.plugin.messenger.foundation.a.a parama)
  {
    AppMethodBeat.i(59718);
    fks.aD(parama);
    AppMethodBeat.o(59718);
  }

  protected bi a(cm paramcm, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(59720);
    if (paramString3.equals(paramString1));
    for (paramString3 = paramString2; ; paramString3 = paramString1)
    {
      bi localbi = ((j)g.K(j.class)).bOr().Q(paramString3, paramcm.ptF);
      ab.i("MicroMsg.BaseMsgExtension", "summerbadcr dkmsgid prepareMsgInfo svrid:%d localid:%d  from:%s to:%s talker:%s", new Object[] { Long.valueOf(paramcm.ptF), Long.valueOf(localbi.field_msgId), paramString1, paramString2, paramString3 });
      if ((localbi.field_msgId != 0L) && (localbi.field_createTime + 604800000L < bf.q(paramString3, paramcm.pcX)))
      {
        ab.w("MicroMsg.BaseMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(paramcm.ptF), Long.valueOf(localbi.field_msgId) });
        bf.fm(localbi.field_msgId);
        localbi.setMsgId(0L);
      }
      paramString1 = localbi;
      if (localbi.field_msgId == 0L)
      {
        paramString1 = new bi();
        paramString1.eI(paramcm.ptF);
        paramString1.eJ(bf.q(paramString3, paramcm.pcX));
        paramString1.setType(paramcm.nao);
        paramString1.setContent(bo.anA(bo.nullAsNil(aa.a(paramcm.vED))));
      }
      AppMethodBeat.o(59720);
      return paramString1;
    }
  }

  public void a(e.c paramc)
  {
  }

  public e.b b(com.tencent.mm.ai.e.a parama)
  {
    Object localObject = null;
    AppMethodBeat.i(59719);
    cm localcm = parama.eAB;
    String str1 = (String)g.RP().Ry().get(2, "");
    if (str1.length() <= 0)
      AppMethodBeat.o(59719);
    String str2;
    String str3;
    bi localbi;
    while (true)
    {
      return localObject;
      str2 = aa.a(localcm.vEB);
      str3 = aa.a(localcm.vEC);
      if ((bo.nullAsNil(str2).length() <= 0) || (bo.nullAsNil(str3).length() <= 0))
      {
        ab.e("MicroMsg.BaseMsgExtension", "neither from-user nor to-user can be empty");
        AppMethodBeat.o(59719);
      }
      else
      {
        localbi = a(localcm, str2, str3, str1);
        if (localbi != null)
          break;
        AppMethodBeat.o(59719);
      }
    }
    boolean bool;
    label161: int i;
    if ((((j)g.K(j.class)).XU().has(str2)) || (str1.equals(str2)))
    {
      bool = true;
      if (!bool)
        break label374;
      localbi.hO(1);
      localbi.ju(str3);
      i = localcm.jBT;
      label185: localbi.setStatus(i);
      if (localcm.nao == 10000)
        localbi.setStatus(4);
      localbi.ix(localcm.vEG);
      if (localbi.apB(r.Yz()))
      {
        localObject = ((j)g.K(j.class)).XR().aoZ(localbi.field_talker);
        if (localObject != null)
        {
          ((ak)localObject).jk(16777216);
          ((j)g.K(j.class)).XR().a((ak)localObject, localbi.field_talker);
        }
      }
      fks.a(parama, localbi, str2, str3, bool);
      if (localbi.field_msgId != 0L)
        break label410;
      localbi.hY(2);
      bf.a(localbi, parama);
      localbi.setMsgId(bf.l(localbi));
    }
    for (localObject = new e.b(localbi, true); ; localObject = new e.b(localbi, false))
    {
      fks.b(parama, localbi, str2, str3, bool);
      AppMethodBeat.o(59719);
      break;
      bool = false;
      break label161;
      label374: localbi.hO(0);
      localbi.ju(str2);
      if (localcm.jBT > 3)
      {
        i = localcm.jBT;
        break label185;
      }
      i = 3;
      break label185;
      label410: ((j)g.K(j.class)).bOr().b(localcm.ptF, localbi);
    }
  }

  static final class a extends com.tencent.mm.ci.a<com.tencent.mm.plugin.messenger.foundation.a.a>
    implements com.tencent.mm.plugin.messenger.foundation.a.a
  {
    public final void a(com.tencent.mm.ai.e.a parama, bi parambi, String paramString1, String paramString2, boolean paramBoolean)
    {
      AppMethodBeat.i(59716);
      a(new e.a.1(this, parama, parambi, paramString1, paramString2, paramBoolean));
      AppMethodBeat.o(59716);
    }

    public final void b(com.tencent.mm.ai.e.a parama, bi parambi, String paramString1, String paramString2, boolean paramBoolean)
    {
      AppMethodBeat.i(59717);
      a(new e.a.2(this, parama, parambi, paramString1, paramString2, paramBoolean));
      AppMethodBeat.o(59717);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.e
 * JD-Core Version:    0.6.2
 */