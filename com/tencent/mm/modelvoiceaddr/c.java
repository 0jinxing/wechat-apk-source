package com.tencent.mm.modelvoiceaddr;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.coe;
import com.tencent.mm.protocal.protobuf.cog;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public final class c extends a
  implements k
{
  private int eCL;
  private f ehi;
  private int fQx;
  private boolean fZa;
  private String filename;
  private boolean gaA;
  private int gaB;
  private bts gaC;
  private int gaD;
  private String[] gaE;
  private int gaF;
  private ak gaG;
  h gay;
  private boolean gaz;
  private int retCode;
  private int scene;

  public c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116675);
    this.retCode = 0;
    this.eCL = 120;
    this.fZa = false;
    this.gaz = false;
    this.gaA = false;
    this.fQx = 0;
    this.gaB = 0;
    this.filename = null;
    this.gaC = null;
    this.scene = 0;
    this.gaE = new String[0];
    this.gaF = 3960;
    this.gaG = new c.2(this, com.tencent.mm.kernel.g.RS().oAl.getLooper());
    this.filename = paramString1;
    this.gay = new h(paramString2);
    this.gaC = new bts().alV(paramString3);
    this.gaD = paramInt1;
    this.scene = paramInt2;
    ab.i("MicroMsg.NetSceneNewVoiceInput", "NetSceneNewVoiceInput filename:%s,session:%s,vadVersion:%s, langType:%d, scene:%s", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(116675);
  }

  private void amq()
  {
    AppMethodBeat.i(116681);
    ab.d("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.Mq());
    if (this.gaG != null)
      this.gaG.removeMessages(291);
    this.gaz = true;
    AppMethodBeat.o(116681);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(116677);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new coe();
    paramf.fsK = new cog();
    paramf.uri = "/cgi-bin/micromsg-bin/voicetrans";
    paramf.fsI = 235;
    paramf.fsL = 381;
    paramf.fsM = 1000000381;
    paramf = paramf.acD();
    paramf.acF().vyg = false;
    Object localObject1 = (coe)paramf.fsG.fsP;
    Object localObject2 = this.gay.mx(this.fQx);
    ((coe)localObject1).Scene = this.scene;
    if (localObject2 == null)
    {
      ((coe)localObject1).ptz = new SKBuiltinBuffer_t();
      ((coe)localObject1).vOq = this.fQx;
      ((coe)localObject1).xiM = "0";
      ((coe)localObject1).fJT = 1;
      ((coe)localObject1).xiO = 2;
      ((coe)localObject1).vPb = 0;
      ((coe)localObject1).xlF = this.gay.amx();
      if (((coe)localObject1).xlF == null);
      for (i = 0; ; i = ((coe)localObject1).xlF.size())
      {
        ((coe)localObject1).xlE = i;
        ((coe)localObject1).wUI = this.gaC;
        ((coe)localObject1).xlG = this.gaD;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("[");
        localObject1 = ((coe)localObject1).xlF.iterator();
        while (((Iterator)localObject1).hasNext())
          ((StringBuilder)localObject2).append(((bts)((Iterator)localObject1).next()).wVI).append(", ");
      }
      ((StringBuilder)localObject2).append("]");
      ab.d("MicroMsg.NetSceneNewVoiceInput", "send empty packet fetch %s time %s", new Object[] { ((StringBuilder)localObject2).toString(), Long.valueOf(System.currentTimeMillis()) });
      i = a(parame, paramf, this);
      AppMethodBeat.o(116677);
      return i;
    }
    ((h.a)localObject2).gbw = true;
    if (this.gaA)
    {
      ((h.a)localObject2).gbx = true;
      ((coe)localObject1).ptz = new SKBuiltinBuffer_t();
      ab.i("MicroMsg.NetSceneNewVoiceInput", "send last packet");
      ((coe)localObject1).vOq = this.fQx;
      ((coe)localObject1).xiM = ((h.a)localObject2).gbv;
      if (!((h.a)localObject2).gbx)
        break label807;
      i = 1;
      label394: ((coe)localObject1).fJT = i;
      ((coe)localObject1).xiO = 2;
      i = ((h.a)localObject2).gbz + 1;
      ((h.a)localObject2).gbz = i;
      ((coe)localObject1).vPb = i;
      ((coe)localObject1).xlF = this.gay.amx();
      if (((coe)localObject1).xlF != null)
        break label813;
    }
    label807: label813: for (int i = 0; ; i = ((coe)localObject1).xlF.size())
    {
      ((coe)localObject1).xlE = i;
      ((coe)localObject1).wUI = this.gaC;
      ((coe)localObject1).xlG = this.gaD;
      ab.d("MicroMsg.NetSceneNewVoiceInput", "%s, read filename: %s, voiceFileMarkEnd: %s, oldReadOffset: %s, canReadLen %s, getILen %s, isRequestEnd: %s, Seq %s, FetchVoiceIds %s, VadVersion %s, scene:%s", new Object[] { com.tencent.mm.compatible.util.g.Mq(), this.filename, Integer.valueOf(((h.a)localObject2).gby), Integer.valueOf(this.fQx), Integer.valueOf(this.gaB), Integer.valueOf(((coe)localObject1).ptz.getILen()), Boolean.valueOf(((h.a)localObject2).gbx), Integer.valueOf(((coe)localObject1).vPb), ((coe)localObject1).xlF, ((coe)localObject1).wUI, Integer.valueOf(((coe)localObject1).Scene) });
      i = this.fQx;
      this.fQx = (((coe)localObject1).ptz.getILen() + i);
      ab.i("MicroMsg.NetSceneNewVoiceInput", "clientId %s oldReadOffset %s", new Object[] { ((h.a)localObject2).gbv, Integer.valueOf(this.fQx) });
      if (((h.a)localObject2).gbz == 1)
        ab.i("MicroMsg.NetSceneNewVoiceInput", "time flee send seq 1 time = %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      ab.d("MicroMsg.NetSceneNewVoiceInput", "send dispatch packet time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      i = a(parame, paramf, this);
      AppMethodBeat.o(116677);
      break;
      if (this.gaB > this.gaF)
        this.gaB = this.gaF;
      for (((h.a)localObject2).gbx = false; ; ((h.a)localObject2).gbx = true)
        do
        {
          byte[] arrayOfByte = com.tencent.mm.vfs.e.e(this.filename, this.fQx, this.gaB);
          ((coe)localObject1).ptz = new SKBuiltinBuffer_t().setBuffer(arrayOfByte);
          break;
        }
        while ((this.gaB > this.gaF) || ((((h.a)localObject2).gby == 2147483647) && (!this.fZa)));
      i = 0;
      break label394;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(116679);
    ab.d("MicroMsg.NetSceneNewVoiceInput", "%s time:%s errType: %s, errCode: %s, errMsg: %s", new Object[] { com.tencent.mm.compatible.util.g.Mq(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 3) && (paramInt3 == -1))
      ab.i("MicroMsg.NetSceneNewVoiceInput", "getStack([ %s ]), ThreadID: %s", new Object[] { bo.dpG(), Long.valueOf(Thread.currentThread().getId()) });
    paramArrayOfByte = (coe)((b)paramq).fsG.fsP;
    paramq = (cog)((b)paramq).fsH.fsP;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.i("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.Mq() + " onGYNetEnd file: %s errType:%s errCode:%s", new Object[] { this.filename, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      amp();
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(116679);
      return;
    }
    ab.d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd voiceId = %s, seq = %s, time = %s", new Object[] { paramArrayOfByte.xiM, Integer.valueOf(paramArrayOfByte.vPb), Long.valueOf(System.currentTimeMillis()) });
    this.gay.am(paramq.xlJ);
    if ((this.gay.amy()) && (this.fZa))
    {
      ab.d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd isAllRespEnd && isRecordFinish");
      amq();
    }
    this.gaE = new String[] { this.gay.getResult() };
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (paramq.xlK <= 0)
    {
      paramInt1 = this.gaF;
      label335: this.gaF = paramInt1;
      if (paramq.wRe >= 0)
        break label406;
    }
    label406: for (paramInt1 = 120; ; paramInt1 = paramq.wRe)
    {
      this.eCL = paramInt1;
      ab.d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd max_send_byte_per_pack = %s, interval = %s", new Object[] { Integer.valueOf(this.gaF), Integer.valueOf(this.eCL) });
      AppMethodBeat.o(116679);
      break;
      paramInt1 = paramq.xlK;
      break label335;
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(116678);
    ab.w("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.Mq() + " setSecurityCheckError e: %s", new Object[] { parama });
    if (parama == m.a.ftr)
    {
      amp();
      this.ehi.onSceneEnd(3, -1, "SecurityCheckError", this);
    }
    AppMethodBeat.o(116678);
  }

  public final boolean acK()
  {
    return true;
  }

  public final int acn()
  {
    return 2000;
  }

  public final void amj()
  {
    this.fZa = true;
  }

  public final String[] amk()
  {
    return this.gaE;
  }

  public final long aml()
  {
    return 0L;
  }

  public final int amm()
  {
    return this.retCode;
  }

  public final List<String> amn()
  {
    AppMethodBeat.i(138328);
    h localh = this.gay;
    ArrayList localArrayList = new ArrayList();
    localh.gbt.readLock().lock();
    Iterator localIterator = localh.gbs.values().iterator();
    while (localIterator.hasNext())
    {
      h.a locala = (h.a)localIterator.next();
      if (locala.gbw)
        localArrayList.add(locala.gbv);
    }
    localh.gbt.readLock().unlock();
    AppMethodBeat.o(138328);
    return localArrayList;
  }

  public final boolean amo()
  {
    boolean bool = false;
    AppMethodBeat.i(116676);
    ab.d("MicroMsg.NetSceneNewVoiceInput", "preDoScene");
    this.gaG.removeMessages(291);
    if (((this.gay.amy()) && (this.fZa)) || (this.gaz))
    {
      ab.i("MicroMsg.NetSceneNewVoiceInput", "preDoScene return");
      AppMethodBeat.o(116676);
    }
    while (true)
    {
      return bool;
      h.a locala = this.gay.mx(this.fQx);
      if (locala != null)
      {
        long l1 = com.tencent.mm.vfs.e.asZ(this.filename);
        long l2 = Math.min(l1, locala.gby);
        ab.d("MicroMsg.NetSceneNewVoiceInput", "fileLength %s info.voiceFileMark %s nowMarkLen %s", new Object[] { Long.valueOf(l1), Integer.valueOf(locala.gby), Long.valueOf(l2) });
        if (l2 <= 0L)
        {
          ab.e("MicroMsg.NetSceneNewVoiceInput", "nowMarkLen <= 0 read failed :%s", new Object[] { this.filename });
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
          this.gaB = 0;
          amp();
          if (this.ehi != null)
            this.ehi.onSceneEnd(3, -1, "ReadFileLengthError", null);
          AppMethodBeat.o(116676);
        }
        else
        {
          this.gaB = ((int)(l2 - this.fQx));
          if (this.gaB < 0)
          {
            ab.i("MicroMsg.NetSceneNewVoiceInput", "canReadLen < 0 length:%s ", new Object[] { Integer.valueOf(this.gaB) });
            this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
            this.gaG.sendEmptyMessageDelayed(291, this.eCL * 2);
            AppMethodBeat.o(116676);
          }
          else
          {
            ab.d("MicroMsg.NetSceneNewVoiceInput", "can read length : %s,reqSeq:%s,interval:%s", new Object[] { Integer.valueOf(this.gaB), Integer.valueOf(locala.gbz), Integer.valueOf(this.eCL) });
            if ((this.gaB < 500) && (locala.gbz > 5))
            {
              ab.d("MicroMsg.NetSceneNewVoiceInput", "can read length : %s double interval", new Object[] { Integer.valueOf(this.gaB) });
              this.gaG.sendEmptyMessageDelayed(291, this.eCL * 2);
            }
            while (true)
            {
              AppMethodBeat.o(116676);
              bool = true;
              break;
              this.gaG.sendEmptyMessageDelayed(291, this.eCL);
            }
          }
        }
      }
      else
      {
        this.gaG.sendEmptyMessageDelayed(291, this.eCL * 2);
        AppMethodBeat.o(116676);
        bool = true;
      }
    }
  }

  public final void amp()
  {
    AppMethodBeat.i(116680);
    ab.d("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.Mq());
    if (this.gaA)
      AppMethodBeat.o(116680);
    while (true)
    {
      return;
      this.gaA = true;
      amq();
      com.tencent.mm.kernel.g.Rg().kX(hashCode());
      h.a locala = this.gay.mx(this.fQx);
      if (locala != null)
      {
        this.gaB = 0;
        com.tencent.mm.kernel.g.RS().aa(new c.1(this, locala));
      }
      AppMethodBeat.o(116680);
    }
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 235;
  }

  public final void mw(int paramInt)
  {
    AppMethodBeat.i(116682);
    ab.d("MicroMsg.NetSceneNewVoiceInput", "%s %s", new Object[] { com.tencent.mm.compatible.util.g.Mq(), Integer.valueOf(paramInt) });
    if (paramInt < 0)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException();
      AppMethodBeat.o(116682);
      throw localIllegalStateException;
    }
    this.gay.mw(paramInt);
    AppMethodBeat.o(116682);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.c
 * JD-Core Version:    0.6.2
 */