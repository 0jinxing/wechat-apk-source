package com.tencent.mm.plugin.ipcall.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.b.a;
import com.tencent.mm.plugin.ipcall.a.c.b;
import com.tencent.mm.plugin.ipcall.a.d.k;
import com.tencent.mm.plugin.ipcall.a.d.o;
import com.tencent.mm.plugin.ipcall.a.f.e;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.blu;
import com.tencent.mm.protocal.protobuf.bly;
import com.tencent.mm.protocal.protobuf.bma;
import com.tencent.mm.protocal.protobuf.bmb;
import com.tencent.mm.protocal.protobuf.bmc;
import com.tencent.mm.protocal.protobuf.bmd;
import com.tencent.mm.protocal.protobuf.bme;
import com.tencent.mm.protocal.protobuf.bmh;
import com.tencent.mm.protocal.protobuf.bmj;
import com.tencent.mm.protocal.protobuf.bmk;
import com.tencent.mm.protocal.protobuf.bml;
import com.tencent.mm.protocal.protobuf.cok;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
  implements a.a, b.a
{
  public boolean cJn;
  public int nvA;
  public int nvB;
  public boolean nvC;
  public boolean nvD;
  public g.a nvE;
  public com.tencent.mm.plugin.ipcall.a.f.d nvF;
  com.tencent.mm.plugin.ipcall.a.f.i nvG;
  com.tencent.mm.plugin.ipcall.a.f.a nvH;
  com.tencent.mm.plugin.ipcall.a.f.h nvI;
  com.tencent.mm.plugin.ipcall.a.f.c nvJ;
  public e nvK;
  com.tencent.mm.plugin.ipcall.a.f.g nvL;
  com.tencent.mm.plugin.ipcall.a.f.f nvM;
  public com.tencent.mm.plugin.ipcall.a.a.c nvN;
  public boolean nvO;
  public boolean nvP;
  com.tencent.mm.network.n nvQ;
  public int nvz;

  public g()
  {
    AppMethodBeat.i(21744);
    this.nvz = 0;
    this.nvA = 0;
    this.nvB = 0;
    this.nvC = false;
    this.nvD = false;
    this.nvO = false;
    this.cJn = false;
    this.nvP = false;
    this.nvQ = new g.1(this);
    this.nvF = new com.tencent.mm.plugin.ipcall.a.f.d();
    this.nvG = new com.tencent.mm.plugin.ipcall.a.f.i();
    this.nvH = new com.tencent.mm.plugin.ipcall.a.f.a();
    this.nvI = new com.tencent.mm.plugin.ipcall.a.f.h();
    this.nvJ = new com.tencent.mm.plugin.ipcall.a.f.c();
    this.nvK = new e();
    this.nvL = new com.tencent.mm.plugin.ipcall.a.f.g();
    this.nvM = new com.tencent.mm.plugin.ipcall.a.f.f();
    AppMethodBeat.o(21744);
  }

  private boolean c(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21759);
    boolean bool;
    if ((this.nvN == null) || (paramObject == null))
    {
      ab.e("MicroMsg.IPCallSvrLogic", "callInfo = null or result = null");
      bool = true;
      AppMethodBeat.o(21759);
      return bool;
    }
    label84: Object localObject;
    label476: label608: com.tencent.mm.plugin.ipcall.a.a.d locald;
    switch (paramInt1)
    {
    case 7:
    default:
    case 1:
    case 3:
    case 4:
    case 8:
      label666: label847: 
      do
      {
        while (true)
        {
          bool = false;
          AppMethodBeat.o(21759);
          break;
          if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.i))
          {
            ab.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited result error");
            bool = true;
            AppMethodBeat.o(21759);
            break;
          }
          localObject = (com.tencent.mm.plugin.ipcall.a.d.i)paramObject;
          paramObject = ((com.tencent.mm.plugin.ipcall.a.d.i)localObject).nyx;
          if (this.nvN.nwx != ((com.tencent.mm.plugin.ipcall.a.d.i)localObject).nyw.wOQ)
          {
            ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", new Object[] { Integer.valueOf(this.nvN.nwx), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.i)localObject).nyw.wOQ) });
            bool = true;
            AppMethodBeat.o(21759);
            break;
          }
          ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished invite id:%d", new Object[] { Integer.valueOf(this.nvN.nwx) });
          i.bHs().ep(this.nvN.nwx, paramInt3);
          if ((paramInt2 == 0) && (paramInt3 == 0))
          {
            if (this.nvN != null)
            {
              this.nvN.nwu = paramObject.wem;
              this.nvN.nwv = paramObject.wen;
              this.nvN.nww = paramObject.wOS;
              this.nvN.nwC = paramObject.wPb;
              this.nvN.nwE = (paramObject.wPc * 1000);
              this.nvN.nwL = paramObject.nwL;
              this.nvN.nwM = paramObject.nwM;
              this.nvN.jud = paramObject.vIO;
              this.nvN.nwS = paramObject.wPd;
              this.nvN.nwX = paramObject.wPe;
              if (paramObject.nwT > 0)
                this.nvN.nwT = paramObject.nwT;
              this.nvN.nwN = paramObject.nwN;
              this.nvN.nwO = paramObject.nwO;
              this.nvN.nwK = paramObject.wPg;
              if (paramObject.nwQ > 0)
              {
                this.nvN.nwQ = (paramObject.nwQ - 1);
                ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got encryptStrategy[" + this.nvN.nwQ + "] from Invite resp");
                this.nvN.nwR = paramObject.wPf;
                ab.d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo NextInvite:%d", new Object[] { Integer.valueOf(paramObject.nwF) });
                if (paramObject.nwF <= 0)
                  break label608;
                this.nvN.nwJ = false;
              }
              for (this.nvN.nwF = paramObject.nwF; ; this.nvN.nwF = 0)
              {
                this.nvN.nwB = paramObject.nwB;
                this.nvN.nwA = paramObject.nwA;
                this.nvN.luT = paramInt3;
                this.nvN.luU = bo.nullAsNil(aa.a(paramObject.BaseResponse.ErrMsg));
                break;
                ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got no encryptStrategy from Invite resp");
                this.nvN.nwQ = 2;
                break label476;
                this.nvN.nwJ = true;
              }
            }
          }
          else
          {
            ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invite failed");
            if (paramObject.BaseResponse != null)
            {
              if (paramInt3 == 433)
              {
                ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo account overdue");
                this.nvN.nwG = true;
                if (paramObject.nwF <= 0)
                  break label847;
                this.nvN.nwJ = false;
              }
              for (this.nvN.nwF = paramObject.nwF; ; this.nvN.nwF = 0)
              {
                this.nvN.nwB = paramObject.nwB;
                this.nvN.nwA = paramObject.nwA;
                this.nvN.luT = paramInt3;
                if (paramObject.getBaseResponse() == null)
                  break;
                this.nvN.luU = bo.nullAsNil(aa.a(paramObject.BaseResponse.ErrMsg));
                ab.d("MicroMsg.IPCallSvrLogic", "ErrLevel:%d,ErrCode:%d,ErrMsg:%s", new Object[] { Integer.valueOf(paramObject.nwA), Integer.valueOf(paramInt3), this.nvN.luU });
                break;
                if (paramInt3 == 434)
                {
                  ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo restrict call");
                  this.nvN.nwH = true;
                  break label666;
                }
                if (paramInt3 != 435)
                  break label666;
                ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo phonenumber invalid");
                this.nvN.nwI = true;
                break label666;
                this.nvN.nwJ = true;
              }
            }
            this.nvN.nwB = "";
            this.nvN.nwA = 2;
            this.nvN.luU = ah.getContext().getString(2131297771);
            this.nvN.luT = paramInt3;
            continue;
            if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.a))
            {
              ab.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel result error");
              bool = true;
              AppMethodBeat.o(21759);
              break;
            }
            ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished errType:%d,errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
            paramObject = (com.tencent.mm.plugin.ipcall.a.d.a)paramObject;
            if (this.nvN.nwx != paramObject.nyf.wOQ)
            {
              ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", new Object[] { Integer.valueOf(this.nvN.nwx), Integer.valueOf(paramObject.nyf.wOQ) });
              bool = true;
              AppMethodBeat.o(21759);
              break;
              if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.n))
              {
                ab.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown result error");
                bool = true;
                AppMethodBeat.o(21759);
                break;
              }
              paramObject = (com.tencent.mm.plugin.ipcall.a.d.n)paramObject;
              if (this.nvN.nwu != paramObject.nyG.wem)
              {
                ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.nvN.nwu), Integer.valueOf(paramObject.nyG.wem) });
                bool = true;
                AppMethodBeat.o(21759);
                break;
              }
              if ((paramInt2 == 0) && (paramInt3 == 0))
              {
                ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown success!");
                this.nvN.hGH = 5;
              }
              else
              {
                ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown failed");
              }
            }
          }
        }
        if (!(paramObject instanceof bmc))
        {
          ab.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify result error");
          bool = true;
          AppMethodBeat.o(21759);
          break;
        }
        ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify finished");
        paramObject = (bmc)paramObject;
        if (this.nvN.nwu != paramObject.wem)
        {
          ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.nvN.nwu), Integer.valueOf(paramObject.wem) });
          bool = true;
          AppMethodBeat.o(21759);
          break;
        }
      }
      while ((paramInt2 != 0) || (paramInt3 != 0));
      this.nvN.nwP = paramObject.nwP;
      ab.d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo updateNotifyCallInfo, UserStatuslist.size: %d", new Object[] { Integer.valueOf(paramObject.wPh.size()) });
      paramObject = paramObject.wPh.iterator();
      while (paramObject.hasNext())
      {
        localObject = (bml)paramObject.next();
        if (this.nvN.nwC != ((bml)localObject).wPq)
          break label1548;
        ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update self userStatus, memberId: %d, status: %d, syncKey: %d", new Object[] { Integer.valueOf(this.nvN.nwC), Integer.valueOf(((bml)localObject).wPr), Integer.valueOf(((bml)localObject).wPs) });
        if (((bml)localObject).wPs > this.nvN.nwD)
        {
          this.nvN.nwD = ((bml)localObject).wPs;
          if (((bml)localObject).wPr != 0)
            this.nvN.hGH = ((bml)localObject).wPr;
        }
        label1459: if ((((bml)localObject).luT == 404) || (((bml)localObject).luT == 484))
        {
          ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify phonenumber invalid");
          this.nvN.nwI = true;
        }
        this.nvN.luU = ((bml)localObject).luU;
        this.nvN.luT = ((bml)localObject).luT;
        this.nvN.nwA = ((bml)localObject).nwA;
        this.nvN.nwB = ((bml)localObject).nwB;
      }
      label1548: ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update others userStatus, memberId: %d, status: %d, syncKey: %d", new Object[] { Integer.valueOf(((bml)localObject).wPq), Integer.valueOf(((bml)localObject).wPr), Integer.valueOf(((bml)localObject).wPs) });
      paramInt1 = 0;
      Iterator localIterator = this.nvN.nwU.iterator();
      label1607: if (localIterator.hasNext())
      {
        locald = (com.tencent.mm.plugin.ipcall.a.a.d)localIterator.next();
        if (locald.kyZ != ((bml)localObject).wPq)
          break label2574;
        if (((bml)localObject).wPs > locald.nwD)
        {
          locald.nwD = ((bml)localObject).wPs;
          if (((bml)localObject).wPr != 0)
            locald.eIV = ((bml)localObject).wPr;
        }
        paramInt1 = 1;
      }
      break;
    case 6:
    case 2:
    case 5:
    }
    label2313: label2571: label2572: label2574: 
    while (true)
    {
      break label1607;
      if (paramInt1 != 0)
        break label1459;
      locald = new com.tencent.mm.plugin.ipcall.a.a.d();
      locald.kyZ = ((bml)localObject).wPq;
      locald.eIV = ((bml)localObject).wPr;
      locald.nwD = ((bml)localObject).wPs;
      this.nvN.nwU.add(locald);
      break label1459;
      if (!(paramObject instanceof k))
      {
        ab.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect result error");
        bool = true;
        AppMethodBeat.o(21759);
        break;
      }
      paramObject = (k)paramObject;
      localObject = paramObject.nyB;
      if (this.nvN.nwu != paramObject.nyA.wem)
      {
        ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.nvN.nwu), Integer.valueOf(paramObject.nyA.wem) });
        bool = true;
        AppMethodBeat.o(21759);
        break;
      }
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect success");
        this.nvN.jud = ((bme)localObject).vIO;
        this.nvN.nwS = ((bme)localObject).wPd;
        break label84;
      }
      ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect failed");
      break label84;
      if (!(paramObject instanceof o))
      {
        ab.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync result error");
        bool = true;
        AppMethodBeat.o(21759);
        break;
      }
      ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished errType:%d,errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      localObject = (o)paramObject;
      paramObject = ((o)localObject).nyJ;
      if (this.nvN.nwu != ((o)localObject).nyI.wem)
      {
        ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.nvN.nwu), Integer.valueOf(((o)localObject).nyI.wem) });
        bool = true;
        AppMethodBeat.o(21759);
        break;
      }
      if ((paramInt2 != 0) || (paramInt3 != 0))
        break label84;
      ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync roomId: %d, status: %d, memberId: %d, syncKey: %d", new Object[] { Integer.valueOf(paramObject.wem), Integer.valueOf(paramObject.wPp), Integer.valueOf(paramObject.wPq), Integer.valueOf(paramObject.wPn) });
      if ((paramObject.wem != this.nvN.nwu) || (paramObject.wen != this.nvN.nwv))
        break label84;
      if (paramObject.wPq == this.nvN.nwC)
      {
        ab.d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync update self status");
        if (paramObject.wPn > this.nvN.nwD)
        {
          this.nvN.nwD = paramObject.wPn;
          if (paramObject.wPp != 0)
            this.nvN.hGH = paramObject.wPp;
        }
      }
      while (true)
      {
        label2197: if ((paramObject.luT == 404) || (paramObject.luT == 484))
        {
          ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync phonenumber invalid");
          this.nvN.nwI = true;
        }
        this.nvN.luU = paramObject.luU;
        this.nvN.luT = paramObject.luT;
        this.nvN.nwA = paramObject.nwA;
        this.nvN.nwB = paramObject.nwB;
        this.nvN.nwP = paramObject.nwP;
        break label84;
        ab.d("MicroMsg.IPCallSvrLogic", " handleServiceResultCallInfosync update others status");
        localObject = this.nvN.nwU.iterator();
        paramInt1 = 0;
        if (((Iterator)localObject).hasNext())
        {
          locald = (com.tencent.mm.plugin.ipcall.a.a.d)((Iterator)localObject).next();
          if (locald.kyZ != paramObject.wPq)
            break label2571;
          if (paramObject.wPn > locald.nwD)
          {
            locald.nwD = paramObject.wPn;
            if (paramObject.wPp != 0)
              locald.eIV = paramObject.wPp;
          }
          paramInt1 = 1;
        }
        while (true)
        {
          break label2313;
          if (paramInt1 != 0)
            break label2572;
          localObject = new com.tencent.mm.plugin.ipcall.a.a.d();
          ((com.tencent.mm.plugin.ipcall.a.a.d)localObject).kyZ = paramObject.wPq;
          ((com.tencent.mm.plugin.ipcall.a.a.d)localObject).eIV = paramObject.wPp;
          ((com.tencent.mm.plugin.ipcall.a.a.d)localObject).nwD = paramObject.wPn;
          this.nvN.nwU.add(localObject);
          break label2197;
          if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.h))
          {
            ab.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat result error");
            bool = true;
            AppMethodBeat.o(21759);
            break;
          }
          ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished errType:%d,errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          paramObject = (com.tencent.mm.plugin.ipcall.a.d.h)paramObject;
          if (this.nvN.nwu == paramObject.nyu.wem)
            break label84;
          ab.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.nvN.nwu), Integer.valueOf(paramObject.nyu.wem) });
          bool = true;
          AppMethodBeat.o(21759);
          break;
        }
      }
    }
  }

  private void ij(boolean paramBoolean)
  {
    AppMethodBeat.i(21747);
    ab.i("MicroMsg.IPCallSvrLogic", "handleInvite, success: %b, isLaunchCancel: %b, isLaunchShutdown: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.nvC), Boolean.valueOf(this.nvD) });
    if ((this.nvC) || (this.nvD))
    {
      ab.i("MicroMsg.IPCallSvrLogic", "handleInvite, ignore this");
      AppMethodBeat.o(21747);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        if (this.nvE != null)
        {
          if (this.nvN.nwJ)
            break label132;
          this.nvE.bGO();
        }
        while (true)
        {
          ab.i("MicroMsg.IPCallSvrLogic", "start sync");
          this.nvG.a(this.nvN);
          AppMethodBeat.o(21747);
          break;
          label132: this.nvE.bGJ();
        }
      }
      if (this.nvE != null)
      {
        if (this.nvN.nwG)
        {
          this.nvE.B(this.nvN.nwB, this.nvN.luU, this.nvN.nwA);
          AppMethodBeat.o(21747);
        }
        else if (this.nvN.nwH)
        {
          this.nvE.C(this.nvN.nwB, this.nvN.luU, this.nvN.nwA);
          AppMethodBeat.o(21747);
        }
        else if (this.nvN.nwI)
        {
          this.nvE.D(this.nvN.nwB, this.nvN.luU, this.nvN.nwA);
          AppMethodBeat.o(21747);
        }
        else if (!this.nvN.nwJ)
        {
          this.nvE.bGO();
          AppMethodBeat.o(21747);
        }
        else
        {
          this.nvE.A(this.nvN.nwB, this.nvN.luU, this.nvN.nwA);
        }
      }
      else
        AppMethodBeat.o(21747);
    }
  }

  private void ik(boolean paramBoolean)
  {
    AppMethodBeat.i(21748);
    ab.i("MicroMsg.IPCallSvrLogic", "handleHeartbeat, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      this.nvz += 1;
      if (this.nvz < 2)
        break label99;
      ab.e("MicroMsg.IPCallSvrLogic", "heartbeat failed twice!");
      this.nvJ.stop();
      if ((!i.bHu().bHn()) || (this.nvE == null))
        break label99;
      this.nvE.bGN();
      AppMethodBeat.o(21748);
    }
    while (true)
    {
      return;
      this.nvz = 0;
      label99: AppMethodBeat.o(21748);
    }
  }

  private void il(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(21751);
    ab.i("MicroMsg.IPCallSvrLogic", "handleSync, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((paramBoolean) && (i.bHr().nxA))
      i.bHr().xk(this.nvN.nwP);
    if (!paramBoolean)
    {
      ab.e("MicroMsg.IPCallSvrLogic", "sync failed!");
      this.nvG.stop();
      if (i.bHu().mCurrentState == 3)
      {
        if ((i != 0) && (this.nvE != null))
          this.nvE.cp(this.nvN.luU, this.nvN.nwA);
        AppMethodBeat.o(21751);
      }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      if ((this.nvN != null) && (paramBoolean))
        xj(this.nvN.bHH());
      AppMethodBeat.o(21751);
    }
  }

  private void im(boolean paramBoolean)
  {
    AppMethodBeat.i(21752);
    ab.i("MicroMsg.IPCallSvrLogic", "handleNotify, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((paramBoolean) && (i.bHr().nxA))
      i.bHr().xk(this.nvN.nwP);
    if ((this.nvN != null) && (paramBoolean))
    {
      int i = this.nvN.bHH();
      if ((i == 2) || (i == 1))
      {
        if (!this.nvP)
        {
          o localo = new o(this.nvN.nwu, this.nvN.nwv, this.nvN.bHG(), this.nvN.nww, false);
          aw.Rg().a(localo, 0);
        }
      }
      else
        xj(this.nvN.bHH());
    }
    else
    {
      AppMethodBeat.o(21752);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.IPCallSvrLogic", "current status has jni accepted, ignore notify accept");
      AppMethodBeat.o(21752);
    }
  }

  private void in(boolean paramBoolean)
  {
    Object localObject1 = null;
    AppMethodBeat.i(21754);
    ab.i("MicroMsg.IPCallSvrLogic", "handleRedirect, isSuccess: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.plugin.ipcall.a.c.a locala;
    com.tencent.mm.plugin.ipcall.a.a.c localc;
    if (paramBoolean)
    {
      locala = i.bHr();
      localc = this.nvN;
      ab.i("MicroMsg.IPCallEngineManager", "redirectSvrAddr");
      if ((localc == null) || (localc.jud == null) || (localc.jud.size() <= 0))
        break label150;
    }
    label150: for (cok localcok = com.tencent.mm.plugin.ipcall.b.c.af(localc.jud); ; localcok = null)
    {
      Object localObject2 = localObject1;
      if (localc != null)
      {
        localObject2 = localObject1;
        if (localc.nwS != null)
        {
          localObject2 = localObject1;
          if (localc.nwS.size() > 0)
            localObject2 = com.tencent.mm.plugin.ipcall.b.c.af(localc.nwS);
        }
      }
      locala.nxx.a(localcok, localcok, (cok)localObject2, 0, 0);
      AppMethodBeat.o(21754);
      return;
    }
  }

  private void u(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(21749);
    ab.i("MicroMsg.IPCallSvrLogic", "handleCancel, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((!paramBoolean) && (paramInt < 0) && (this.nvB <= 0))
    {
      this.nvB += 1;
      ab.i("MicroMsg.IPCallSvrLogic", "cancel failed, retry count: %d", new Object[] { Integer.valueOf(this.nvB) });
      this.nvH.a(this.nvN);
      AppMethodBeat.o(21749);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(21749);
    }
  }

  private void v(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(21750);
    ab.i("MicroMsg.IPCallSvrLogic", "handleUserSelfShutdown, success: %b, isFromNotify: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.nvI.nzs) });
    if ((!paramBoolean) && (paramInt < 0) && (this.nvA <= 0))
    {
      this.nvA += 1;
      ab.i("MicroMsg.IPCallSvrLogic", "shutdown failed, retry count: %d, isFromNotify: %b", new Object[] { Integer.valueOf(this.nvA), Boolean.valueOf(this.nvI.nzs) });
      this.nvI.a(this.nvN);
      AppMethodBeat.o(21750);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(21750);
    }
  }

  public final void a(int paramInt1, m paramm, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21757);
    if (c(paramInt1, paramm, paramInt2, paramInt3))
    {
      ab.i("MicroMsg.IPCallSvrLogic", "onTimerSuccess different room ignore");
      AppMethodBeat.o(21757);
      return;
    }
    switch (paramInt1)
    {
    case 3:
    case 4:
    default:
    case 2:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(21757);
      break;
      il(true);
      AppMethodBeat.o(21757);
      break;
      ik(true);
    }
  }

  public final void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21755);
    if (c(paramInt1, paramObject, paramInt2, paramInt3))
    {
      ab.i("MicroMsg.IPCallSvrLogic", "onServiceResult different room ignore");
      AppMethodBeat.o(21755);
      return;
    }
    switch (paramInt1)
    {
    case 2:
    case 5:
    case 7:
    default:
    case 1:
    case 3:
    case 4:
    case 8:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(21755);
      break;
      ij(true);
      AppMethodBeat.o(21755);
      break;
      u(true, paramInt3);
      AppMethodBeat.o(21755);
      break;
      v(true, paramInt3);
      AppMethodBeat.o(21755);
      break;
      im(true);
      AppMethodBeat.o(21755);
      break;
      in(true);
    }
  }

  public final void b(int paramInt1, m paramm, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21758);
    if (c(paramInt1, paramm, paramInt2, paramInt3))
    {
      ab.i("MicroMsg.IPCallSvrLogic", "onTimerFailed different room ignore");
      AppMethodBeat.o(21758);
      return;
    }
    switch (paramInt1)
    {
    case 3:
    case 4:
    default:
    case 2:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(21758);
      break;
      il(false);
      AppMethodBeat.o(21758);
      break;
      ik(false);
    }
  }

  public final void b(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21756);
    if (c(paramInt1, paramObject, paramInt2, paramInt3))
    {
      ab.i("MicroMsg.IPCallSvrLogic", "onServiceFailed different room ignore");
      AppMethodBeat.o(21756);
      return;
    }
    switch (paramInt1)
    {
    case 2:
    case 5:
    case 7:
    default:
    case 1:
    case 3:
    case 4:
    case 8:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(21756);
      break;
      ij(false);
      AppMethodBeat.o(21756);
      break;
      u(false, paramInt3);
      AppMethodBeat.o(21756);
      break;
      v(false, paramInt3);
      AppMethodBeat.o(21756);
      break;
      im(false);
      AppMethodBeat.o(21756);
      break;
      in(false);
    }
  }

  public final void bHo()
  {
    AppMethodBeat.i(21745);
    if (this.nvN.nwZ)
      ab.e("MicroMsg.IPCallSvrLogic", "cancelIPCall, already accept");
    this.nvC = true;
    ab.i("MicroMsg.IPCallSvrLogic", "cancelIPCall, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(this.nvN.nwu), Integer.valueOf(this.nvN.nwx) });
    this.nvJ.stop();
    this.nvG.stop();
    this.nvH.a(this.nvN);
    this.nvL.a(this.nvN);
    AppMethodBeat.o(21745);
  }

  public final void xi(int paramInt)
  {
    AppMethodBeat.i(21746);
    if (!this.nvN.nwZ)
      ab.e("MicroMsg.IPCallSvrLogic", "shutdownIPCall, user not accept");
    ab.i("MicroMsg.IPCallSvrLogic", "shutdownIPCall, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(this.nvN.nwu), Integer.valueOf(this.nvN.nwx) });
    this.nvD = true;
    this.nvJ.stop();
    this.nvG.stop();
    this.nvI.nzs = false;
    this.nvI.nzr = paramInt;
    this.nvI.a(this.nvN);
    this.nvL.a(this.nvN);
    AppMethodBeat.o(21746);
  }

  public final boolean xj(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(21753);
    switch (paramInt)
    {
    default:
      ab.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, do nothing:%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(21753);
      bool = false;
    case 2:
    case 3:
    case 1:
    case 5:
    case 4:
    case 7:
    case 8:
    case 6:
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user accept, isLaunchCancel: %b, isLaunchShutdown: %b", new Object[] { Boolean.valueOf(this.nvC), Boolean.valueOf(this.nvD) });
      if ((this.nvC) || (this.nvD))
      {
        AppMethodBeat.o(21753);
      }
      else
      {
        this.nvG.stop();
        if (!this.cJn)
        {
          this.cJn = true;
          if (this.nvN != null)
            this.nvN.nwZ = true;
          if (this.nvE != null)
            this.nvE.bGL();
          this.nvJ.a(this.nvN);
        }
        AppMethodBeat.o(21753);
        continue;
        ab.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user busy");
        this.nvG.stop();
        this.nvJ.stop();
        if (this.nvE != null)
          this.nvE.co(this.nvN.luU, this.nvN.nwA);
        AppMethodBeat.o(21753);
        continue;
        ab.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user ringing");
        if (!this.nvO)
        {
          this.nvO = true;
          if (this.nvE != null)
            this.nvE.bGK();
        }
        AppMethodBeat.o(21753);
        continue;
        ab.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, other side user shutdown");
        if (this.nvE != null)
          this.nvE.bGM();
        AppMethodBeat.o(21753);
        continue;
        ab.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user unavailable");
        if (this.nvN.nwI)
          if (this.nvE != null)
            this.nvE.D(this.nvN.nwB, this.nvN.luU, this.nvN.nwA);
        while (true)
        {
          AppMethodBeat.o(21753);
          break;
          if (this.nvE != null)
            this.nvE.cn(this.nvN.luU, this.nvN.nwA);
        }
        ab.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, shutdown overdue");
        this.nvN.nwG = true;
        if (this.nvE != null)
          this.nvE.B(this.nvN.nwB, this.nvN.luU, this.nvN.nwA);
        AppMethodBeat.o(21753);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g
 * JD-Core Version:    0.6.2
 */