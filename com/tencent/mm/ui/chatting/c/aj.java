package com.tencent.mm.ui.chatting.c;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.nn;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.model.c;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.y;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.c.b.r;
import com.tencent.mm.ui.chatting.c.b.v;
import com.tencent.mm.ui.chatting.c.b.z;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=com.tencent.mm.ui.chatting.c.b.ab.class)
public class aj extends a
  implements com.tencent.mm.ai.f, h.a, com.tencent.mm.ui.chatting.c.b.ab
{
  private static boolean yRV = false;
  private int eCL;

  @SuppressLint({"HandlerLeak"})
  private ak handler;
  private int yRU;
  private long yRW;

  public aj()
  {
    AppMethodBeat.i(31699);
    this.eCL = -1;
    this.handler = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(31695);
        if ((aj.this.cgL == null) || (!aj.this.cgL.caA))
          AppMethodBeat.o(31695);
        while (true)
        {
          return;
          if (aj.yRV)
          {
            aj.Pu();
            ((r)aj.this.cgL.aF(r.class)).dEm();
            aj.this.cgL.aWv();
          }
          AppMethodBeat.o(31695);
        }
      }
    };
    AppMethodBeat.o(31699);
  }

  public final void OE(int paramInt)
  {
    AppMethodBeat.i(31702);
    if (this.cgL == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SignallingComponent", "[doDirectSend] mChattingContext is null!", new Object[] { bo.dpG().toString() });
      AppMethodBeat.o(31702);
    }
    while (true)
    {
      return;
      Object localObject1 = this.cgL;
      if ((((com.tencent.mm.ui.chatting.d.a)localObject1).dFw()) || (((d)((com.tencent.mm.ui.chatting.d.a)localObject1).aF(d.class)).dDn()));
      int j;
      for (int i = 1; ; i = 0)
      {
        j = ((Integer)aw.ZI().get(35, Integer.valueOf(10))).intValue();
        localObject2 = new LinkedList();
        ((List)localObject2).add(((com.tencent.mm.ui.chatting.d.a)localObject1).getTalkerUserName());
        if (j != -2)
          break label218;
        if ((i == 0) || ((paramInt != 1) && (paramInt != 2)))
          break label166;
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SignallingComponent", "oreh old logic doDirectSend not support chatStatus:%d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(31702);
        break;
      }
      label166: com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SignallingComponent", "oreh old logic doDirectSend done chatStatus:%d", new Object[] { Integer.valueOf(paramInt) });
      Object localObject2 = new com.tencent.mm.modelsimple.f((List)localObject2, o.fZ(paramInt));
      aw.Rg().a((m)localObject2, 0);
      AppMethodBeat.o(31702);
      continue;
      label218: if ((i != 0) || (ad.aow(((com.tencent.mm.ui.chatting.d.a)localObject1).getTalkerUserName())) || (ad.aou(((com.tencent.mm.ui.chatting.d.a)localObject1).getTalkerUserName())) || (((com.tencent.mm.ui.chatting.d.a)localObject1).sRl.dsf()))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SignallingComponent", "oreh doDirectSend not support");
        AppMethodBeat.o(31702);
      }
      else
      {
        if (this.yRW == 0L)
        {
          localObject1 = ((v)this.cgL.aF(v.class)).dEK();
          if ((localObject1 != null) && (((List)localObject1).size() > 0))
            this.yRW = ((bi)((List)localObject1).get(0)).field_createTime;
        }
        long l = bo.gb(this.yRW);
        if ((j == -1) || (l > j * 1000L))
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SignallingComponent", "oreh doDirectSend interval too long: %d;  interval: %d", new Object[] { Long.valueOf(l / 1000L), Integer.valueOf(j) });
          AppMethodBeat.o(31702);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SignallingComponent", "oreh doDirectSend done chatStatus:%d, delt:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(l / 1000L) });
          localObject2 = new com.tencent.mm.modelsimple.f((List)localObject2, o.fZ(paramInt));
          aw.Rg().a((m)localObject2, 0);
          AppMethodBeat.o(31702);
        }
      }
    }
  }

  public final void a(h paramh, h.c paramc)
  {
    AppMethodBeat.i(31704);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SignallingComponent", "on msg notify change");
    if (this.cgL == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SignallingComponent", "[onNotifyChange] mChattingContext is null!");
      AppMethodBeat.o(31704);
    }
    while (true)
    {
      return;
      if ((this.cgL.getTalkerUserName().equals(paramc.talker)) && ("insert".equals(paramc.oqJ)) && (paramc.oqK.size() > 0) && (((bi)paramc.oqK.get(0)).field_isSend == 0))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SignallingComponent", "summerbadcr oreh onNotifyChange receive a new msg flag[%d], msgSeq[%d]", new Object[] { Integer.valueOf(((bi)paramc.oqK.get(0)).field_flag), Long.valueOf(((bi)paramc.oqK.get(0)).field_msgSeq) });
        this.yRW = bo.anU();
      }
      AppMethodBeat.o(31704);
    }
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(31705);
    super.a(parama);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SignallingComponent", "[onComponentInstall] hash:%s", new Object[] { this });
    aw.Rg().a(new bk(new bk.a()
    {
      public final void a(e paramAnonymouse)
      {
        AppMethodBeat.i(31696);
        if (paramAnonymouse == null)
          AppMethodBeat.o(31696);
        while (true)
        {
          return;
          aj.a(aj.this, paramAnonymouse);
          AppMethodBeat.o(31696);
        }
      }
    }), 0);
    AppMethodBeat.o(31705);
  }

  public final void dDh()
  {
    AppMethodBeat.i(31706);
    super.dDh();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SignallingComponent", "[onComponentUnInstall] hash:%s", new Object[] { this });
    this.handler.removeCallbacksAndMessages(null);
    aw.ZK();
    c.XO().a(this);
    aw.Rg().b(10, this);
    AppMethodBeat.o(31706);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31708);
    aw.ZK();
    c.XO().a(this);
    aw.Rg().b(10, this);
    AppMethodBeat.o(31708);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31707);
    aw.ZK();
    c.XO().a(this, Looper.getMainLooper());
    aw.Rg().a(10, this);
    AppMethodBeat.o(31707);
  }

  public final void keepSignalling()
  {
    AppMethodBeat.i(31700);
    if (this.yRU == -2)
      aw.Rg().a(new bk(new bk.a()
      {
        public final void a(e paramAnonymouse)
        {
          AppMethodBeat.i(31697);
          if (paramAnonymouse == null)
            AppMethodBeat.o(31697);
          while (true)
          {
            return;
            paramAnonymouse.keepSignalling();
            AppMethodBeat.o(31697);
          }
        }
      }), 0);
    AppMethodBeat.o(31700);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(31703);
    if (this.cgL == null)
      AppMethodBeat.o(31703);
    while (true)
    {
      return;
      this.cgL.dismissDialog();
      if (10 != paramm.getType())
      {
        AppMethodBeat.o(31703);
      }
      else
      {
        boolean bool1 = ((z)this.cgL.aF(z.class)).dES();
        boolean bool2 = ((z)this.cgL.aF(z.class)).dET();
        boolean bool3 = ((z)this.cgL.aF(z.class)).dEW();
        if ((bool3) || (bool2) || (bool1))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SignallingComponent", "[onSceneEnd] [%s|%s|%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          AppMethodBeat.o(31703);
        }
        else if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (com.tencent.mm.modelsimple.f)paramm;
          if ((paramString.fOt != null) && (paramString.fOt.equals(this.cgL.getTalkerUserName())))
          {
            if ((paramString.content == null) || (paramString.content.length != 4))
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.SignallingComponent", "unknown directsend op");
              AppMethodBeat.o(31703);
              continue;
            }
            paramInt1 = o.t(paramString.content, 0);
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SignallingComponent", "directsend: status=".concat(String.valueOf(paramInt1)));
          }
        }
        else
        {
          switch (paramInt1)
          {
          case 2:
          default:
            yRV = false;
            ((r)this.cgL.aF(r.class)).dEm();
            this.cgL.aWv();
            AppMethodBeat.o(31703);
            break;
          case 1:
            yRV = true;
            ((r)this.cgL.aF(r.class)).setMMTitle(2131298248);
            paramString = new Message();
            this.handler.sendMessageDelayed(paramString, 15000L);
            paramString = new nn();
            com.tencent.mm.sdk.b.a.xxA.m(paramString);
            AppMethodBeat.o(31703);
            break;
          case 3:
            yRV = true;
            ((r)this.cgL.aF(r.class)).setMMTitle(2131298249);
            paramString = new Message();
            this.handler.sendMessageDelayed(paramString, 15000L);
            AppMethodBeat.o(31703);
          }
        }
      }
    }
  }

  public final void stopSignalling()
  {
    AppMethodBeat.i(31701);
    aw.Rg().a(new bk(new aj.4(this)), 0);
    AppMethodBeat.o(31701);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.aj
 * JD-Core Version:    0.6.2
 */