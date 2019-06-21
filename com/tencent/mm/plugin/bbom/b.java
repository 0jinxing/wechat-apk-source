package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.at.o;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.je;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Stack;

public final class b
  implements com.tencent.mm.plugin.messenger.foundation.a.a
{
  static void a(cm paramcm, bf.b paramb, ad paramad)
  {
    AppMethodBeat.i(18234);
    String str1 = aa.a(paramcm.vEB);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(73729, Integer.valueOf(1));
    String str2 = paramad.field_nickname;
    com.tencent.mm.storage.bf localbf = new com.tencent.mm.storage.bf();
    localbf.field_content = aa.a(paramcm.vED);
    localbf.field_createtime = bo.anT();
    localbf.field_imgpath = "";
    if (paramcm.nao == 3)
    {
      paramad = ah.getContext().getString(2131301647);
      localbf.field_sayhicontent = paramad;
      localbf.field_sayhiuser = str1;
      localbf.field_scene = 18;
      if (paramcm.jBT <= 3)
        break label226;
    }
    label226: for (int i = paramcm.jBT; ; i = 3)
    {
      localbf.field_status = i;
      localbf.field_svrid = paramcm.ptF;
      localbf.field_talker = str2;
      localbf.field_type = paramcm.nao;
      localbf.field_isSend = 0;
      localbf.field_sayhiencryptuser = str1;
      localbf.field_ticket = paramb.fmx;
      d.akQ().a(localbf);
      paramcm = new je();
      paramcm.cEq.cEr = str1;
      com.tencent.mm.sdk.b.a.xxA.m(paramcm);
      AppMethodBeat.o(18234);
      return;
      paramad = aa.a(paramcm.vED);
      break;
    }
  }

  public final void a(final e.a parama, bi parambi, final String paramString1, final String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(18232);
    parama = parama.eAB;
    paramString2 = com.tencent.mm.model.bf.oE(parama.vEG);
    if (paramString2 != null)
    {
      parambi.jA(paramString2.fmu);
      parambi.jy(paramString2.fmt);
      ab.i("MicroMsg.BaseMsgCallbackImpl", "bizClientMsgId = %s", new Object[] { paramString2.fmt });
      if ((paramString2.fmx != null) && (paramString2.scene == 1) && (parama.nao != 10000))
      {
        aw.ZK();
        parambi = com.tencent.mm.model.c.XM().aoO(paramString1);
        if ((parambi == null) || ((int)parambi.ewQ <= 0))
        {
          ao.a.flu.a(paramString1, null, new ao.b.a()
          {
            public final void o(String paramAnonymousString, boolean paramAnonymousBoolean)
            {
              AppMethodBeat.i(18231);
              aw.ZK();
              paramAnonymousString = com.tencent.mm.model.c.XM().aoO(paramString1);
              b.a(parama, paramString2, paramAnonymousString);
              AppMethodBeat.o(18231);
            }
          });
          AppMethodBeat.o(18232);
        }
      }
    }
    while (true)
    {
      return;
      a(parama, paramString2, parambi);
      AppMethodBeat.o(18232);
    }
  }

  public final void b(e.a arg1, bi parambi, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(18233);
    int i;
    if (com.tencent.mm.plugin.priority.a.a.a.bZu())
    {
      if ((!t.mY(paramString1)) || (!t.nN(paramString1)))
        break label181;
      i = 1;
    }
    while (true)
    {
      int j;
      long l;
      if ((t.kH(paramString1)) && (!t.nM(paramString1)))
      {
        j = 1;
        if ((!paramBoolean) && (parambi.drE()) && (i == 0) && (j == 0))
        {
          com.tencent.mm.modelcontrol.c.afC();
          if (com.tencent.mm.modelcontrol.c.u(parambi))
          {
            paramString1 = o.ahn();
            l = parambi.field_msgId;
            com.tencent.mm.modelcontrol.c.afC();
            if (!com.tencent.mm.modelcontrol.c.afD());
          }
        }
      }
      synchronized (paramString1.fCV)
      {
        if (paramString1.fCV.size() >= 100)
          paramString1.fCV.remove(0);
        paramString1.fCV.push(Long.valueOf(l));
        paramString1.fCZ = System.currentTimeMillis();
        ab.i("MicroMsg.AutoGetBigImgLogic", "add %d", new Object[] { Long.valueOf(l) });
        paramString1.start();
        AppMethodBeat.o(18233);
        return;
        label181: i = 0;
        continue;
        j = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.b
 * JD-Core Version:    0.6.2
 */