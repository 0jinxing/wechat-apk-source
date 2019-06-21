package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.oy;
import com.tencent.mm.g.a.oz;
import com.tencent.mm.g.a.qa;
import com.tencent.mm.g.a.qc;
import com.tencent.mm.g.a.ua;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.model.app.al.a;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

public final class ak
{
  public static void aQ(bi parambi)
  {
    AppMethodBeat.i(30976);
    ab.i("MicroMsg.ResendMsgLogic", "resendVoiceMsg, msgId:%d", new Object[] { Long.valueOf(parambi.field_msgId) });
    Object localObject;
    if (t.nv(parambi.field_talker))
    {
      localObject = new oz();
      ((oz)localObject).cLo.csG = parambi;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(30976);
    }
    while (true)
    {
      return;
      localObject = new oy();
      ((oy)localObject).cLn.csG = parambi;
      a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(30976);
    }
  }

  public static void aR(bi parambi)
  {
    AppMethodBeat.i(30977);
    qa localqa = new qa();
    long l1 = bf.oC(parambi.field_talker);
    ab.i("MicroMsg.ResendMsgLogic", "resendMsgImage, msgId:%d, time[%d - > %d]", new Object[] { Long.valueOf(parambi.field_msgId), Long.valueOf(parambi.field_createTime), Long.valueOf(l1) });
    long l2 = l1;
    if (l1 == parambi.field_createTime)
      l2 = l1 + 1L;
    parambi.eJ(l2);
    aw.ZK();
    com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
    localqa.cMp.csG = parambi;
    a.xxA.m(localqa);
    AppMethodBeat.o(30977);
  }

  public static void aS(bi parambi)
  {
    AppMethodBeat.i(30978);
    ab.i("MicroMsg.ResendMsgLogic", "resendEmoji, msgId:%d", new Object[] { Long.valueOf(parambi.field_msgId) });
    ua localua = new ua();
    localua.cQj.csG = parambi;
    a.xxA.m(localua);
    AppMethodBeat.o(30978);
  }

  public static void aT(bi parambi)
  {
    AppMethodBeat.i(30979);
    ab.i("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, msgId:%d", new Object[] { Long.valueOf(parambi.field_msgId) });
    long l1 = bf.oC(parambi.field_talker);
    long l2 = l1;
    if (l1 == parambi.field_createTime)
      l2 = l1 + 1L;
    parambi.eJ(l2);
    aw.ZK();
    com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
    com.tencent.mm.pluginsdk.model.app.b localb = am.aUq().lZ(parambi.field_msgId);
    if ((localb != null) && (localb.field_msgInfoId == parambi.field_msgId))
    {
      ab.d("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, upload app attach first");
      localb.field_status = 101L;
      localb.field_offset = 0L;
      localb.field_lastModifyTime = (System.currentTimeMillis() / 1000L);
      am.aUq().a(localb, new String[0]);
      am.dhP().run();
      AppMethodBeat.o(30979);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, directly send app mag");
      am.dhP();
      al.a.jB(parambi.field_msgId);
      AppMethodBeat.o(30979);
    }
  }

  public static void aU(bi parambi)
  {
    AppMethodBeat.i(30980);
    ab.i("MicroMsg.ResendMsgLogic", "resendTextMsg, msgId:%d", new Object[] { Long.valueOf(parambi.field_msgId) });
    aX(parambi);
    AppMethodBeat.o(30980);
  }

  public static void aV(bi parambi)
  {
    AppMethodBeat.i(30981);
    ab.i("MicroMsg.ResendMsgLogic", "resendLocation, msgId:%d", new Object[] { Long.valueOf(parambi.field_msgId) });
    aX(parambi);
    AppMethodBeat.o(30981);
  }

  public static void aW(bi parambi)
  {
    AppMethodBeat.i(30982);
    ab.i("MicroMsg.ResendMsgLogic", "resendCardMsg, msgId:%d", new Object[] { Long.valueOf(parambi.field_msgId) });
    aX(parambi);
    AppMethodBeat.o(30982);
  }

  private static void aX(bi parambi)
  {
    AppMethodBeat.i(30983);
    long l1 = parambi.field_msgId;
    if (l1 == -1L)
    {
      ab.e("MicroMsg.ResendMsgLogic", "sendMsgInternal failed msgId ".concat(String.valueOf(l1)));
      AppMethodBeat.o(30983);
    }
    while (true)
    {
      return;
      if ((parambi.field_talker.equals("medianote")) && ((r.YD() & 0x4000) == 0))
      {
        AppMethodBeat.o(30983);
      }
      else
      {
        ab.d("MicroMsg.ResendMsgLogic", "sendMsgInternal, start send msgId: %d", new Object[] { Long.valueOf(l1) });
        Object localObject = new com.tencent.mm.modelmulti.h(l1);
        if (!aw.Rg().a((m)localObject, 0))
        {
          ab.e("MicroMsg.ResendMsgLogic", "sendMsgInternal, doScene return false, directly mark msg to failed");
          parambi.setStatus(5);
          aw.ZK();
          com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
          localObject = new qc();
          ((qc)localObject).cMs.csG = parambi;
          a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
          AppMethodBeat.o(30983);
        }
        else
        {
          long l2 = bf.oC(parambi.field_talker);
          l1 = l2;
          if (l2 == parambi.field_createTime)
            l1 = l2 + 1L;
          parambi.eJ(l1);
          aw.ZK();
          com.tencent.mm.model.c.XO().a(parambi.field_msgId, parambi);
          AppMethodBeat.o(30983);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ak
 * JD-Core Version:    0.6.2
 */