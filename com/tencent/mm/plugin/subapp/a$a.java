package com.tencent.mm.plugin.subapp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.fq;
import com.tencent.mm.g.a.fq.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.clu;
import com.tencent.mm.protocal.protobuf.cof;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.cc;
import com.tencent.mm.storage.cd;
import java.util.HashMap;
import java.util.Map;

public final class a$a extends com.tencent.mm.sdk.b.c<fq>
  implements f
{
  private String cEV;
  private int czO;
  private int czP;
  private boolean eDk;
  private boolean hjA;
  private com.tencent.mm.plugin.subapp.ui.voicetranstext.a srJ;
  private com.tencent.mm.plugin.subapp.ui.voicetranstext.c srK;
  private com.tencent.mm.plugin.subapp.ui.voicetranstext.b srL;
  private com.tencent.mm.modelvoice.b srM;
  private com.tencent.mm.modelvoice.p srN;
  private volatile boolean srO;
  boolean srP;
  private ap srQ;
  private fq srR;
  private int srS;
  private Map<String, String> srT;
  private int srU;
  private boolean srV;
  private long srW;
  private long srX;
  private String toUser;

  public a$a()
  {
    AppMethodBeat.i(25162);
    this.srO = false;
    this.srP = false;
    this.srV = true;
    this.srW = 0L;
    this.eDk = false;
    this.srT = new HashMap();
    this.xxI = fq.class.getName().hashCode();
    AppMethodBeat.o(25162);
  }

  private void a(String paramString, a.a.a parama)
  {
    AppMethodBeat.i(25166);
    ab.i("MicroMsg.SubCoreSubapp", "finishWithResult mstate:%s", new Object[] { parama });
    if (this.srQ != null)
      this.srQ.stopTimer();
    aw.Rg().b(546, this);
    aw.Rg().b(547, this);
    aw.Rg().b(548, this);
    if (this.srR != null)
    {
      if (bo.isNullOrNil(paramString))
        break label289;
      this.srT.put(this.srR.czB.fileName, paramString);
      if (((a.srD == null) || (bo.isNullOrNil(a.srD.field_content))) && (this.srR.czB.from == 1))
        com.tencent.mm.modelvoice.m.amb().a(abi(paramString));
      this.srR.czC.bcU = true;
      this.srR.czC.content = paramString;
      if (parama != a.a.a.ssg)
        break label334;
    }
    for (this.srR.czC.state = 1; ; this.srR.czC.state = 2)
      label289: label334: 
      do
      {
        ab.d("MicroMsg.SubCoreSubapp", "finishWithResult result : %s", new Object[] { paramString });
        if (this.srR.czB.czF != null)
          this.srR.czB.czF.run();
        b(paramString, parama);
        this.srJ = null;
        this.srK = null;
        this.srL = null;
        this.srR = null;
        this.hjA = false;
        this.srP = false;
        this.srO = false;
        this.srS = 20;
        a.srD = null;
        cDh();
        AppMethodBeat.o(25166);
        return;
        if (parama != a.a.a.sse)
          break;
        ab.i("MicroMsg.SubCoreSubapp", "finishWithResult State.FINISH id:%s", new Object[] { this.srR.czB.czD });
        this.srR.czC.state = 2;
        break;
      }
      while ((parama != a.a.a.ssi) && (parama != a.a.a.ssj));
  }

  private boolean a(fq paramfq)
  {
    AppMethodBeat.i(25163);
    boolean bool;
    if (!(paramfq instanceof fq))
    {
      ab.f("MicroMsg.SubCoreSubapp", "mismatched event");
      AppMethodBeat.o(25163);
      bool = false;
    }
    String str1;
    String str2;
    Object localObject;
    while (true)
    {
      return bool;
      if (paramfq.czB.czE == 2)
      {
        a(a.a.a.ssg);
        this.srT.clear();
        ab.i("MicroMsg.SubCoreSubapp", "Have clear the cache of the translate voice results.");
        AppMethodBeat.o(25163);
        bool = true;
      }
      else if (paramfq.czB.czE == 1)
      {
        a(a.a.a.ssg);
        ab.i("MicroMsg.SubCoreSubapp", "Have cancel translate voice action.");
        AppMethodBeat.o(25163);
        bool = true;
      }
      else if (paramfq.czB.czE == 3)
      {
        a(a.a.a.ssh);
        ab.i("MicroMsg.SubCoreSubapp", "alvinluo Have cancel translate voice action by user.");
        AppMethodBeat.o(25163);
        bool = true;
      }
      else if (paramfq.czB.czE != 0)
      {
        ab.i("MicroMsg.SubCoreSubapp", "The opCode(%d) is out of range.", new Object[] { Integer.valueOf(this.srR.czB.czE) });
        AppMethodBeat.o(25163);
        bool = false;
      }
      else if (this.hjA)
      {
        ab.w("MicroMsg.SubCoreSubapp", "The Event handler is busy.");
        AppMethodBeat.o(25163);
        bool = false;
      }
      else if (com.tencent.mm.modelvoice.m.ama() == null)
      {
        ab.e("MicroMsg.SubCoreSubapp", "SubCoreVoice.getVoiceStg() == null" + bo.dpG());
        AppMethodBeat.o(25163);
        bool = false;
      }
      else
      {
        this.srR = paramfq;
        str1 = this.srR.czB.czD;
        str2 = this.srR.czB.fileName;
        if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)))
        {
          ab.e("MicroMsg.SubCoreSubapp", "The localId(%s) is null or fileName(%s) is null.", new Object[] { str1, str2 });
          a(a.a.a.ssi);
          AppMethodBeat.o(25163);
          bool = false;
        }
        else
        {
          cDh();
          localObject = (String)this.srT.get(str2);
          if (!bo.isNullOrNil((String)localObject))
          {
            ab.i("MicroMsg.SubCoreSubapp", "finish With Cache localId:%s,fileName:%s", new Object[] { str1, str2 });
            a((String)localObject, a.a.a.sse);
            AppMethodBeat.o(25163);
            bool = true;
          }
          else
          {
            localObject = com.tencent.mm.modelvoice.m.amb().aqb(str2);
            a.srD = (cc)localObject;
            if ((localObject == null) || (bo.isNullOrNil(a.srD.field_content)))
              break;
            ab.i("MicroMsg.SubCoreSubapp", "finish With DB localId:%s,fileName:%s", new Object[] { str1, str2 });
            a(a.srD.field_content, a.a.a.sse);
            AppMethodBeat.o(25163);
            bool = true;
          }
        }
      }
    }
    ab.i("MicroMsg.SubCoreSubapp", "alvinluo transform test voice scene: %d", new Object[] { Integer.valueOf(paramfq.czB.scene) });
    this.srN = com.tencent.mm.modelvoice.m.ama().uZ(str2);
    while (true)
    {
      try
      {
        if (this.srN == null)
        {
          ab.i("MicroMsg.SubCoreSubapp", "alvinluo the VoiceInfo do not exist. (localId : %s, fileName : %s)", new Object[] { str1, str2 });
          localObject = new com/tencent/mm/modelvoice/p;
          ((com.tencent.mm.modelvoice.p)localObject).<init>();
          this.srN = ((com.tencent.mm.modelvoice.p)localObject);
          this.srN.fileName = str2;
          this.srN.createTime = (System.currentTimeMillis() / 1000L);
          this.srN.clientId = str2;
          this.srN.fXb = (System.currentTimeMillis() / 1000L);
          this.srN.status = 1;
          if (paramfq.czB.scene == 8)
          {
            this.srN.fXe = -1;
            int i = o.uj(str2);
            ab.i("MicroMsg.SubCoreSubapp", "size : %d", new Object[] { Integer.valueOf(i) });
            this.srN.frO = i;
          }
        }
        else
        {
          if (this.srN.fXe >= 0)
            break label844;
          ab.i("MicroMsg.SubCoreSubapp", "alvinluo voiceInfo msgLocalId < 0");
          this.srU = this.srR.czB.scene;
          ab.d("MicroMsg.SubCoreSubapp", "alvinluo VoiceTransformText fromUser: %s, toUser: %s, scene: %d", new Object[] { this.cEV, this.toUser, Integer.valueOf(this.srU) });
          this.srM = q.uN(this.srN.fileName);
          this.hjA = true;
          this.srS = 20;
          a(a.a.a.ssa);
          AppMethodBeat.o(25163);
          bool = true;
          break;
        }
        this.srN.fXe = Integer.valueOf(str1).intValue();
        continue;
      }
      catch (Exception paramfq)
      {
        ab.printErrStackTrace("MicroMsg.SubCoreSubapp", paramfq, "alvinluo set voiceInfo exception", new Object[0]);
        a(a.a.a.ssi);
        AppMethodBeat.o(25163);
        bool = true;
      }
      break;
      label844: paramfq = ((j)g.K(j.class)).bOr().jf(this.srN.fXe);
      if (paramfq.field_isSend == 1)
      {
        this.cEV = r.Yz();
        if ((this.srR.czB.scene == 4) || (this.srR.czB.scene == 5))
        {
          paramfq = ((com.tencent.mm.api.h)g.K(com.tencent.mm.api.h.class)).aK(paramfq.field_bizChatId);
          if (paramfq != null)
            this.toUser = paramfq.field_bizChatServId;
          else
            this.toUser = "";
        }
        else
        {
          this.toUser = paramfq.field_talker;
        }
      }
      else if (paramfq.field_isSend == 0)
      {
        this.toUser = r.Yz();
        if ((this.srR.czB.scene == 4) || (this.srR.czB.scene == 5))
        {
          paramfq = ((com.tencent.mm.api.h)g.K(com.tencent.mm.api.h.class)).aK(paramfq.field_bizChatId);
          if (paramfq != null)
            this.cEV = paramfq.field_bizChatServId;
          else
            this.cEV = "";
        }
        else
        {
          this.cEV = paramfq.field_talker;
        }
      }
    }
  }

  private cc abi(String paramString)
  {
    AppMethodBeat.i(25168);
    ab.i("MicroMsg.SubCoreSubapp", "createVoiceTT localId(%s) , fileName(%s).", new Object[] { this.srR.czB.czD, this.srR.czB.fileName });
    cc localcc = new cc();
    localcc.field_msgId = Long.valueOf(this.srR.czB.czD).longValue();
    localcc.aqa(this.srR.czB.fileName);
    localcc.field_content = paramString;
    AppMethodBeat.o(25168);
    return localcc;
  }

  private void b(String paramString, a.a.a parama)
  {
    AppMethodBeat.i(25167);
    if (!this.eDk)
      AppMethodBeat.o(25167);
    while (true)
    {
      return;
      if (this.srN != null)
        break;
      AppMethodBeat.o(25167);
    }
    int i;
    label45: int j;
    if (paramString != null)
    {
      i = paramString.length();
      if (parama != a.a.a.sse)
        break label177;
      if (bo.isNullOrNil(paramString))
        break label159;
      j = 1;
    }
    while (true)
    {
      ab.i("MicroMsg.SubCoreSubapp", "alvinluo transformTextResult voiceId: %s, wordCount: %d, waitTime: %d, animationTime: %d, transformResult: %d", new Object[] { this.srN.clientId, Integer.valueOf(i), Integer.valueOf(this.czO), Integer.valueOf(this.czP), Integer.valueOf(j) });
      if (j != 0)
        com.tencent.mm.plugin.subapp.d.b.b(this.srN.clientId, i, this.czO, this.czP, j);
      AppMethodBeat.o(25167);
      break;
      i = 0;
      break label45;
      label159: this.czO = 0;
      this.czP = 0;
      i = 0;
      j = 3;
      continue;
      label177: this.czO = 0;
      this.czP = 0;
      if (parama == a.a.a.ssg)
      {
        j = 5;
        i = 0;
      }
      else if (parama == a.a.a.ssj)
      {
        i = 0;
        j = 3;
      }
      else if (parama == a.a.a.ssi)
      {
        j = 4;
        i = 0;
      }
      else if (parama == a.a.a.ssk)
      {
        i = 0;
        j = 2;
      }
      else
      {
        i = 0;
        j = 0;
      }
    }
  }

  private void cDh()
  {
    this.srV = true;
    this.srW = 0L;
    this.srX = 0L;
    this.czO = 0;
    this.czP = 0;
    this.eDk = false;
  }

  private void cDi()
  {
    AppMethodBeat.i(25165);
    if (this.srV)
    {
      this.srV = false;
      this.srW = System.currentTimeMillis();
      this.czO = ((int)(this.srW - this.srX));
    }
    AppMethodBeat.o(25165);
  }

  final void a(a.a.a parama)
  {
    AppMethodBeat.i(25164);
    switch (a.1.srI[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      AppMethodBeat.o(25164);
      while (true)
      {
        return;
        ab.i("MicroMsg.SubCoreSubapp", "net check");
        if (this.srN.cKK > 0L)
          ab.i("MicroMsg.SubCoreSubapp", "has msg svr id: %d", new Object[] { Long.valueOf(this.srN.cKK) });
        for (this.srJ = new com.tencent.mm.plugin.subapp.ui.voicetranstext.a(this.srN.clientId, this.srN.frO, this.srM.getFormat(), this.srN.cKK, this.srN.fileName, this.srU, this.cEV, this.toUser); ; this.srJ = new com.tencent.mm.plugin.subapp.ui.voicetranstext.a(this.srN.clientId, this.srN.frO, this.srN.fileName, this.srU, this.cEV, this.toUser))
        {
          aw.Rg().a(this.srJ, 0);
          aw.Rg().a(this.srJ.getType(), this);
          this.srX = System.currentTimeMillis();
          AppMethodBeat.o(25164);
          break;
          ab.i("MicroMsg.SubCoreSubapp", "not existex msg svr id: %d", new Object[] { Long.valueOf(this.srN.cKK) });
        }
        ab.i("MicroMsg.SubCoreSubapp", "net upload");
        if (this.srJ == null)
        {
          ab.w("MicroMsg.SubCoreSubapp", "request upload must after check!");
          AppMethodBeat.o(25164);
        }
        else
        {
          this.srK = new com.tencent.mm.plugin.subapp.ui.voicetranstext.c(this.srN.clientId, this.srJ.svS, this.srM.getFormat(), this.srN.fileName, this.srU, this.cEV, this.toUser);
          aw.Rg().a(this.srK, 0);
          aw.Rg().a(this.srK.getType(), this);
          AppMethodBeat.o(25164);
          continue;
          ab.i("MicroMsg.SubCoreSubapp", "net upload more");
          if (this.srK == null)
          {
            ab.w("MicroMsg.SubCoreSubapp", "upload more need has upload netScene!");
            AppMethodBeat.o(25164);
          }
          else
          {
            this.srK = new com.tencent.mm.plugin.subapp.ui.voicetranstext.c(this.srK);
            aw.Rg().a(this.srK, 0);
            aw.Rg().a(this.srK.getType(), this);
            AppMethodBeat.o(25164);
            continue;
            if (this.srO)
            {
              ab.i("MicroMsg.SubCoreSubapp", "pulling so pass");
              AppMethodBeat.o(25164);
            }
            else
            {
              ab.i("MicroMsg.SubCoreSubapp", "net get");
              if (this.srJ == null)
              {
                ab.w("MicroMsg.SubCoreSubapp", "request get must after check!");
                AppMethodBeat.o(25164);
              }
              else
              {
                this.srO = true;
                this.srL = new com.tencent.mm.plugin.subapp.ui.voicetranstext.b(this.srN.clientId);
                aw.Rg().a(this.srL, 0);
                aw.Rg().a(this.srL.getType(), this);
                AppMethodBeat.o(25164);
                continue;
                this.srP = true;
                AppMethodBeat.o(25164);
                continue;
                aw.Rg().c(this.srJ);
                aw.Rg().c(this.srK);
                aw.Rg().c(this.srL);
                this.eDk = true;
                a(null, a.a.a.ssg);
                AppMethodBeat.o(25164);
                continue;
                this.eDk = true;
                a(null, parama);
                AppMethodBeat.o(25164);
              }
            }
          }
        }
      }
      this.eDk = true;
      a(null, parama);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    paramString = null;
    Object localObject = null;
    AppMethodBeat.i(25169);
    ab.i("MicroMsg.SubCoreSubapp", "onSceneEnd errType(%d) , errCode(%d).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramm.getType())
      {
      default:
        AppMethodBeat.o(25169);
      case 546:
      case 547:
      case 548:
      }
    while (true)
    {
      return;
      if (this.srJ.mState == com.tencent.mm.plugin.subapp.ui.voicetranstext.a.svQ)
      {
        ab.i("MicroMsg.SubCoreSubapp", "check result: done");
        a(a.a.a.sse);
        cDi();
        this.czP = 0;
        this.eDk = true;
        paramString = localObject;
        if (this.srJ.cDR())
          paramString = this.srJ.svR.xlH;
        a(paramString, a.a.a.sse);
        AppMethodBeat.o(25169);
      }
      else if (this.srJ.mState == com.tencent.mm.plugin.subapp.ui.voicetranstext.a.svP)
      {
        if (this.srJ.svR != null)
          bo.isNullOrNil(this.srJ.svR.xlH);
        ab.i("MicroMsg.SubCoreSubapp", "check result: processing");
        a(a.a.a.ssd);
        AppMethodBeat.o(25169);
      }
      else if (this.srJ.mState == com.tencent.mm.plugin.subapp.ui.voicetranstext.a.svO)
      {
        ab.i("MicroMsg.SubCoreSubapp", "check result: not exist");
        a(a.a.a.ssb);
        AppMethodBeat.o(25169);
      }
      else if (this.srJ.svT != null)
      {
        AppMethodBeat.o(25169);
        continue;
        if (this.srK.cDT())
        {
          ab.i("MicroMsg.SubCoreSubapp", "succeed upload");
          a(a.a.a.ssd);
          AppMethodBeat.o(25169);
        }
        else
        {
          ab.d("MicroMsg.SubCoreSubapp", "start upload more: start:%d, len:%d", new Object[] { Integer.valueOf(this.srK.svS.ptx), Integer.valueOf(this.srK.svS.pty) });
          a(a.a.a.ssc);
          AppMethodBeat.o(25169);
          continue;
          paramInt2 = this.srL.svV;
          ab.i("MicroMsg.SubCoreSubapp", "get mIntervalSec:%ds", new Object[] { Integer.valueOf(paramInt2) });
          this.srO = false;
          cDi();
          if ((!this.srL.isComplete()) && (this.srL.cDR()))
          {
            ab.i("MicroMsg.SubCoreSubapp", "refreshResult result");
            paramm = this.srL.svR.xlH;
            if (this.srR != null)
            {
              this.srR.czC.bcU = false;
              this.srR.czC.content = paramm;
              ab.i("MicroMsg.SubCoreSubapp", "refreshResult result is null ? : %s", new Object[] { Boolean.valueOf(bo.isNullOrNil(paramm)) });
              if (this.srR.czB.czF != null)
                this.srR.czB.czF.run();
            }
          }
          while (true)
          {
            if (!this.srL.isComplete())
              break label636;
            ab.i("MicroMsg.SubCoreSubapp", "succeed get");
            if (this.srL.cDR())
              paramString = this.srL.svR.xlH;
            a(a.a.a.sse);
            this.czP = ((int)(System.currentTimeMillis() - this.srW));
            this.eDk = true;
            a(paramString, a.a.a.sse);
            AppMethodBeat.o(25169);
            break;
            if (!this.srL.cDR())
              ab.d("MicroMsg.SubCoreSubapp", "result not valid");
          }
          label636: ab.i("MicroMsg.SubCoreSubapp", "do get again after:%ds", new Object[] { Integer.valueOf(paramInt2) });
          if (!this.srP)
          {
            paramInt1 = this.srS - 1;
            this.srS = paramInt1;
            if (paramInt1 < 0)
            {
              ab.e("MicroMsg.SubCoreSubapp", "Has try to translate delay for %d times.", new Object[] { Integer.valueOf(20) });
              a(a.a.a.ssj);
              AppMethodBeat.o(25169);
            }
            else
            {
              if (this.srQ == null)
                this.srQ = new ap(new a.a.1(this, paramInt2), false);
              paramString = this.srQ;
              long l = paramInt2 * 1000;
              paramString.ae(l, l);
            }
          }
          else
          {
            AppMethodBeat.o(25169);
            continue;
            if (paramInt1 == 2)
            {
              a(a.a.a.ssk);
              AppMethodBeat.o(25169);
            }
            else
            {
              a(a.a.a.ssj);
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(25169);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.a.a
 * JD-Core Version:    0.6.2
 */