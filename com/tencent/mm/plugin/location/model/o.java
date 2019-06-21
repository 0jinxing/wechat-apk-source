package com.tencent.mm.plugin.location.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.location.model.a.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.bku;
import com.tencent.mm.protocal.protobuf.bqu;
import com.tencent.mm.protocal.protobuf.cie;
import com.tencent.mm.protocal.protobuf.cmj;
import com.tencent.mm.protocal.protobuf.yy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class o
  implements f, com.tencent.mm.bh.b
{
  public boolean cFy;
  public boolean chh;
  public b.a ecy;
  public com.tencent.mm.modelgeo.d fwu;
  ak mHandler;
  private String nJs;
  public double nJu;
  public double nJv;
  public int nJw;
  private int nKD;
  private int nKE;
  public i nKF;
  public HashSet<WeakReference<o.b>> nKG;
  public int nKH;
  public cmj nKI;
  public LocationInfo nKJ;
  public boolean nKK;
  public boolean nKL;
  public int nKM;
  public String nKN;
  boolean nKO;
  public o.a nKP;
  public int nKQ;
  public boolean nKR;
  public long nKS;
  long nKT;
  public i.a nKU;
  private int timestamp;

  public o()
  {
    AppMethodBeat.i(113385);
    this.nKD = 0;
    this.nKE = 1000;
    this.nKG = new HashSet();
    this.nKH = 1;
    this.nKJ = new LocationInfo((byte)0);
    this.nKK = false;
    this.nKL = false;
    this.cFy = false;
    this.nKM = this.nKH;
    this.nKN = "";
    this.chh = false;
    this.nKO = false;
    this.nKP = null;
    this.nKQ = -1;
    this.nKR = true;
    this.nKS = 0L;
    this.nKT = 0L;
    this.nJu = -1000.0D;
    this.nJv = -1000.0D;
    this.nJw = -1;
    this.mHandler = new o.1(this, Looper.getMainLooper());
    this.ecy = new b.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        AppMethodBeat.i(113384);
        if (!paramAnonymousBoolean)
        {
          paramAnonymousBoolean = false;
          AppMethodBeat.o(113384);
        }
        while (true)
        {
          return paramAnonymousBoolean;
          ab.d("MicorMsg.TrackRefreshManager", "onGetlocatoin fLongitude:%f, fLatitude:%f, locType:%d, speed:%f", new Object[] { Float.valueOf(paramAnonymousFloat1), Float.valueOf(paramAnonymousFloat2), Integer.valueOf(paramAnonymousInt), Double.valueOf(paramAnonymousDouble1) });
          if (o.this.nKR)
          {
            o.this.nKR = false;
            o.this.nKT = System.currentTimeMillis();
            long l = o.this.nKT - o.this.nKS;
            ab.d("MicorMsg.TrackRefreshManager", "locate time:%d", new Object[] { Long.valueOf(l) });
            h.pYm.e(10997, new Object[] { "10", "", Integer.valueOf(0), Long.valueOf(l) });
          }
          if ((o.this.nKI != null) && (o.this.nKI.xkm != null))
          {
            o.this.nKI.xkm.vNI = paramAnonymousFloat2;
            o.this.nKI.xkm.vNH = paramAnonymousFloat1;
          }
          paramAnonymousBoolean = true;
          AppMethodBeat.o(113384);
        }
      }
    };
    this.nKU = new o.3(this);
    AppMethodBeat.o(113385);
  }

  private void bJD()
  {
    AppMethodBeat.i(113390);
    ab.d("MicorMsg.TrackRefreshManager", "trigerRefresh");
    if (bJI())
    {
      ab.d("MicorMsg.TrackRefreshManager", "trigerRefresh, joinSuccess");
      this.fwu = com.tencent.mm.modelgeo.d.agz();
      this.fwu.b(this.ecy, true);
      if (this.nKF == null)
        this.nKF = l.bJA();
      this.nKF.a(this.nKU);
      bJH();
    }
    AppMethodBeat.o(113390);
  }

  private void cr(String paramString, int paramInt)
  {
    AppMethodBeat.i(113388);
    ab.d("MicorMsg.TrackRefreshManager", "exitTrack, scene=%d", new Object[] { Integer.valueOf(paramInt) });
    paramString = new com.tencent.mm.plugin.location.model.a.a(paramString);
    ((yy)paramString.ehh.fsG.fsP).Scene = paramInt;
    g.Rg().a(paramString, 0);
    this.nJs = "";
    AppMethodBeat.o(113388);
  }

  public final String akN()
  {
    return this.nKN;
  }

  public final boolean bJC()
  {
    AppMethodBeat.i(113387);
    boolean bool;
    if ((bJI()) && (this.nKK))
    {
      bool = true;
      AppMethodBeat.o(113387);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(113387);
    }
  }

  public final void bJE()
  {
    AppMethodBeat.i(113391);
    ab.d("MicorMsg.TrackRefreshManager", "resume refresh");
    this.nKO = false;
    bJD();
    AppMethodBeat.o(113391);
  }

  public final List<String> bJF()
  {
    AppMethodBeat.i(113392);
    LinkedList localLinkedList = l.bJz().tP(this.nKN);
    AppMethodBeat.o(113392);
    return localLinkedList;
  }

  public final void bJG()
  {
    if (this.nKH == 1)
      this.nKH = 3;
    while (true)
    {
      return;
      if (this.nKH == 3)
        this.nKH = 2;
    }
  }

  public final void bJH()
  {
    boolean bool = true;
    AppMethodBeat.i(113393);
    if ((!this.cFy) || (!this.nKK) || (this.nKJ == null))
    {
      localObject1 = new StringBuilder("error to exit refresh isStart: ").append(this.cFy).append(" isShared: ").append(this.nKK).append(" ");
      if (this.nKJ == null)
      {
        ab.e("MicorMsg.TrackRefreshManager", bool);
        AppMethodBeat.o(113393);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      if ((this.nKI != null) && (this.nKI.xkm.vNI != -1000.0D) && (this.nKI.xkm.vNH != -1000.0D))
        break label170;
      ab.e("MicorMsg.TrackRefreshManager", "error to get my location ");
      this.mHandler.sendEmptyMessageDelayed(1, this.nKE);
      AppMethodBeat.o(113393);
    }
    label170: Object localObject2 = r.Yz();
    Object localObject1 = new cie();
    ((cie)localObject1).wKW = this.nKJ.nJx;
    ((cie)localObject1).vNI = this.nKJ.nJu;
    ((cie)localObject1).vNH = this.nKJ.nJv;
    ((cie)localObject1).Name = ((String)localObject2);
    this.nKI.vHl = ((String)localObject2);
    this.nKI.xkm.wNP = l.bJA().bJr();
    localObject2 = new StringBuffer();
    ((StringBuffer)localObject2).append("refreshLoopImpl, [trackRoomId:" + this.nJs + "]");
    switch (this.nKH)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      ((StringBuffer)localObject2).append("[ mMyPosiItem " + this.nKI.xkm.vNI + " " + this.nKI.xkm.vNH + " " + this.nKI.xkm.wNP + " ]");
      ab.d("MicorMsg.TrackRefreshManager", ((StringBuffer)localObject2).toString());
      String str = this.nJs;
      int i = this.nKH;
      localObject2 = this.nKI;
      int j = this.timestamp + 1;
      this.timestamp = j;
      localObject1 = new c(str, i, (cmj)localObject2, j, (cie)localObject1);
      g.Rg().a((m)localObject1, 0);
      AppMethodBeat.o(113393);
      break;
      ((StringBuffer)localObject2).append("track upload_status  MMRefreshTrackRoomUpload ");
      continue;
      ((StringBuffer)localObject2).append("track upload_status  MMRefreshTrackRoomDownload ");
      continue;
      ((StringBuffer)localObject2).append("track upload_status  MMRefreshTrackRoomUploadAndDownLoad ");
      continue;
      ((StringBuffer)localObject2).append("track upload_status  MMRefreshTrackRoomFirstUpload ");
      ((StringBuffer)localObject2).append("[ trackItem " + ((cie)localObject1).vNI + " " + ((cie)localObject1).vNH + " ]");
    }
  }

  public final boolean bJI()
  {
    AppMethodBeat.i(113394);
    boolean bool;
    if (!bo.isNullOrNil(this.nJs))
    {
      bool = true;
      AppMethodBeat.o(113394);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(113394);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(113395);
    ab.d("MicorMsg.TrackRefreshManager", "onSceneEnd scene type %d errType %d errCode %d", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramm.getType() == 490)
      if ((paramInt2 == 0) || (paramInt2 >= 1000))
      {
        this.nJs = ((com.tencent.mm.plugin.location.model.a.b)paramm).nJs;
        l.bJz().PR(this.nJs);
        if (!bJI())
          break label1070;
        ab.i("MicorMsg.TrackRefreshManager", "join sucess %s", new Object[] { this.nJs });
        paramString = com.tencent.mm.bh.d.fUu.tP(this.nKN);
        paramString.add(r.Yz());
        if (this.nKJ != null)
          com.tencent.mm.bh.d.fUu.a(this.nKN, paramString, this.nKJ.nJu, this.nKJ.nJv, this.nKJ.nJx, "", "");
        while (this.nKG != null)
        {
          paramm = this.nKG.iterator();
          while (paramm.hasNext())
          {
            paramString = (WeakReference)paramm.next();
            if ((paramString != null) && (paramString.get() != null))
              ((o.b)paramString.get()).bJJ();
          }
          com.tencent.mm.bh.d.fUu.a(this.nKN, paramString, -1000.0D, -1000.0D, "", "", "");
        }
        bJH();
        AppMethodBeat.o(113395);
      }
    while (true)
    {
      return;
      Object localObject;
      if ((paramInt2 == 17) && (this.nKG != null))
      {
        paramString = this.nKG.iterator();
        while (paramString.hasNext())
        {
          localObject = (WeakReference)paramString.next();
          if ((localObject != null) && (((WeakReference)localObject).get() != null))
            ((o.b)((WeakReference)localObject).get()).bJK();
        }
      }
      if (this.nKG != null)
      {
        localObject = this.nKG.iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramString = (WeakReference)((Iterator)localObject).next();
          if ((paramString != null) && (paramString.get() != null))
            ((o.b)paramString.get()).onError(0, ((com.tencent.mm.plugin.location.model.a.b)paramm).hwA);
        }
        AppMethodBeat.o(113395);
        continue;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          if (paramm.getType() == 492)
          {
            this.nKD += 1;
            this.mHandler.removeMessages(1);
            if (this.nKD >= 10)
            {
              this.mHandler.removeMessages(1);
              if (this.nKG == null)
                break label1070;
              paramString = this.nKG.iterator();
              while (paramString.hasNext())
              {
                localObject = (WeakReference)paramString.next();
                if ((localObject != null) && (((WeakReference)localObject).get() != null))
                  ((o.b)((WeakReference)localObject).get()).onError(1, ((c)paramm).hwA);
              }
              AppMethodBeat.o(113395);
              continue;
            }
            if ((bJI()) && (!this.nKO))
            {
              paramString = ((c)paramm).nLe;
              if ((paramString != null) && (paramString.BaseResponse != null))
              {
                if (paramString.BaseResponse.Ret != 12)
                  break label700;
                this.chh = true;
                if (this.nKP != null)
                  this.nKP.ayR();
              }
              while (true)
              {
                ab.d("MicorMsg.TrackRefreshManager", "refresh track room, in error status, timeout = %b, ret = %d", new Object[] { Boolean.valueOf(this.chh), Integer.valueOf(paramString.BaseResponse.Ret) });
                if (!this.chh)
                  this.mHandler.sendEmptyMessageDelayed(1, this.nKE);
                AppMethodBeat.o(113395);
                break;
                label700: this.chh = false;
              }
            }
          }
        }
        else
        {
          if (paramm.getType() == 492)
          {
            paramString = ((c)paramm).nLe;
            if ((paramString != null) && (paramString.BaseResponse != null))
            {
              if (paramString.BaseResponse.Ret != 12)
                break label968;
              this.chh = true;
              if (this.nKP != null)
                this.nKP.ayR();
            }
            while (true)
            {
              ab.d("MicorMsg.TrackRefreshManager", "refresh track room, timeout = %b, ret = %d", new Object[] { Boolean.valueOf(this.chh), Integer.valueOf(paramString.BaseResponse.Ret) });
              if (this.nKD > 0)
                h.pYm.e(10997, new Object[] { "9", "", Integer.valueOf(this.nKD), Integer.valueOf(0) });
              this.nKD = 0;
              this.nKE = ((c)paramm).nLb;
              paramInt1 = ((c)paramm).nLf;
              if ((this.nKG == null) || ((paramInt1 != 2) && (paramInt1 != 1) && (paramInt1 != 3)))
                break;
              paramString = this.nKG.iterator();
              while (paramString.hasNext())
              {
                localObject = (WeakReference)paramString.next();
                if ((localObject != null) && (((WeakReference)localObject).get() != null))
                  ((o.b)((WeakReference)localObject).get()).a(((c)paramm).nLe);
              }
              label968: this.chh = false;
            }
            if (this.nKH == 1);
            for (paramInt1 = 1; ; paramInt1 = 0)
            {
              if (paramInt1 == 0)
                bJG();
              this.mHandler.removeMessages(1);
              if ((bJI()) && (!this.nKO) && (!this.chh))
                this.mHandler.sendEmptyMessageDelayed(1, this.nKE);
              AppMethodBeat.o(113395);
              break;
            }
          }
          if (paramm.getType() == 491)
            l.bJz().PR("");
        }
      }
      else
      {
        label1070: AppMethodBeat.o(113395);
      }
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(113386);
    ab.i("MicorMsg.TrackRefreshManager", "stop location");
    if (this.fwu != null)
      this.fwu.c(this.ecy);
    if (this.nKF != null)
      this.nKF.b(this.nKU);
    g.Rg().b(492, this);
    g.Rg().b(490, this);
    g.Rg().b(491, this);
    this.nKH = 1;
    this.cFy = false;
    this.nKQ = -1;
    AppMethodBeat.o(113386);
  }

  public final void xC(int paramInt)
  {
    AppMethodBeat.i(113389);
    ab.i("MicorMsg.TrackRefreshManager", "track endTrack");
    if (bJI())
      cr(this.nJs, paramInt);
    if (!bo.isNullOrNil(this.nKN))
    {
      com.tencent.mm.plugin.location.a.a locala = l.bJz().PQ(this.nKN);
      if (locala != null)
      {
        locala.cGh.remove(r.Yz());
        l.bJz().a(this.nKN, locala.cGh, locala.latitude, locala.longitude, locala.nJq, null, null);
      }
    }
    l.bJz().PR("");
    this.nJs = "";
    this.nKN = "";
    this.nKK = false;
    this.nKL = false;
    this.nJu = -1000.0D;
    this.nJv = -1000.0D;
    this.nJw = -1;
    this.nKQ = -1;
    AppMethodBeat.o(113389);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.o
 * JD-Core Version:    0.6.2
 */