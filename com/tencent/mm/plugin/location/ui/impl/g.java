package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.r;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.model.o;
import com.tencent.mm.plugin.location.model.o.a;
import com.tencent.mm.plugin.location.model.o.b;
import com.tencent.mm.plugin.location.ui.MyLocationButton;
import com.tencent.mm.plugin.location.ui.ShareHeader;
import com.tencent.mm.plugin.location.ui.TipSayingWidget;
import com.tencent.mm.plugin.location.ui.VolumeMeter;
import com.tencent.mm.plugin.location.ui.k;
import com.tencent.mm.plugin.location.ui.l.a;
import com.tencent.mm.plugin.location.ui.m.a;
import com.tencent.mm.plugin.location.ui.n;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.awl;
import com.tencent.mm.protocal.protobuf.bku;
import com.tencent.mm.protocal.protobuf.cmj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class g extends i
  implements l.a
{
  private b.a ecy;
  private View nMJ;
  private m.a nOe;
  private Button nQD;
  MyLocationButton nQE;
  private TipSayingWidget nQF;
  com.tencent.mm.plugin.location.ui.m nQG;
  o nQH;
  com.tencent.mm.plugin.location.ui.l nQI;
  k nQJ;
  private com.tencent.mm.plugin.location.ui.i nQK;
  private com.tencent.mm.modelgeo.d nQL;
  private ShareHeader nQM;
  private String nQN;
  private long nQO;
  private long nQP;
  private o.b nQQ;
  private o.a nQR;
  private HashMap<String, cmj> nQS;
  private PowerManager.WakeLock wakeLock;

  public g(Activity paramActivity)
  {
    super(paramActivity);
    AppMethodBeat.i(113679);
    this.nQO = 0L;
    this.nQP = 0L;
    this.nOe = new g.1(this);
    this.nQQ = new g.2(this);
    this.nQR = new o.a()
    {
      public final void ayR()
      {
        AppMethodBeat.i(113672);
        g localg = g.this;
        c.a locala = new c.a(localg.activity);
        locala.PZ(2131304129);
        locala.Qc(2131296994).a(new g.9(localg));
        locala.aMb().show();
        AppMethodBeat.o(113672);
      }
    };
    this.ecy = new g.4(this);
    this.nQS = new HashMap();
    this.nQH = com.tencent.mm.plugin.location.model.l.bJy();
    this.nQL = com.tencent.mm.modelgeo.d.agz();
    AppMethodBeat.o(113679);
  }

  private void bKz()
  {
    AppMethodBeat.i(113687);
    aqX();
    this.nQG.iE(false);
    this.nQH.stop();
    this.nQH.xC(3);
    k.bKb();
    this.nQH.nKQ = this.nOL.nLY.getZoom();
    this.activity.finish();
    AppMethodBeat.o(113687);
  }

  public final void bKA()
  {
    AppMethodBeat.i(113692);
    super.bKA();
    if (this.nQG != null)
    {
      this.nQG.nNX = false;
      this.nQG.iD(false);
      this.nQE.bJO();
    }
    AppMethodBeat.o(113692);
  }

  protected final void bKB()
  {
    AppMethodBeat.i(113693);
    super.bKB();
    h.pYm.e(10997, new Object[] { "1", "", Integer.valueOf(0), Integer.valueOf(0) });
    AppMethodBeat.o(113693);
  }

  public final void bKd()
  {
    AppMethodBeat.i(113686);
    this.nQH.nKQ = this.nOL.nLY.getZoom();
    this.activity.finish();
    AppMethodBeat.o(113686);
  }

  public final void bKe()
  {
    AppMethodBeat.i(113688);
    this.nQG.iE(false);
    this.nQH.stop();
    this.nQH.xC(0);
    k.bKb();
    this.activity.finish();
    AppMethodBeat.o(113688);
  }

  protected final void bKl()
  {
    AppMethodBeat.i(113685);
    super.bKl();
    AppMethodBeat.o(113685);
  }

  final void bKm()
  {
    AppMethodBeat.i(113681);
    super.bKm();
    this.wakeLock = ((PowerManager)this.activity.getSystemService("power")).newWakeLock(26, "Track Lock");
    if (this.nRp != null)
    {
      localObject1 = this.nRp;
      ((n)localObject1).nOA.setVisibility(4);
      ((n)localObject1).isVisible = false;
    }
    findViewById(2131825945).setVisibility(8);
    this.nQE = ((MyLocationButton)findViewById(2131824674));
    this.nQE.setProgressBar(this.nOL.nLY);
    this.nQE.bJN();
    this.nQE.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(113674);
        g.this.nQE.bJN();
        g.this.nQG.nNX = true;
        g.this.nQG.a(g.this.nOL.nLY);
        g.this.nQG.iD(false);
        h.pYm.e(10997, new Object[] { "6", "", Integer.valueOf(0), Integer.valueOf(0) });
        AppMethodBeat.o(113674);
      }
    });
    this.nMJ = findViewById(2131827536);
    this.nQM = ((ShareHeader)findViewById(2131824684));
    this.nQM.setVisibility(0);
    this.nQK = new com.tencent.mm.plugin.location.ui.i(this.activity, this.nQM.getHeaderBar(), this.nMJ, this.nKN, this.nOL.nLY);
    this.nQK.nMP = new g.6(this);
    this.nQH.nKP = this.nQR;
    if (this.nQG == null)
      this.nQG = new com.tencent.mm.plugin.location.ui.m(this.activity, this.nOL.nLY, true);
    this.nQG.nOe = this.nOe;
    this.nQG.nNS = false;
    this.nQI = new com.tencent.mm.plugin.location.ui.l(this.activity, this);
    this.nQF = ((TipSayingWidget)findViewById(2131824680));
    this.nQD = ((Button)findViewById(2131828360));
    this.nQD.setVisibility(0);
    this.nQJ = new k(this.activity, this.nQD);
    this.nQJ.nNB = this.nQK;
    this.nQM.setOnLeftClickListener(new g.7(this));
    this.nQM.setOnRightClickListener(new g.8(this));
    ((LocationManager)this.activity.getSystemService("location")).isProviderEnabled("gps");
    Object localObject1 = this.nQH;
    Object localObject2 = this.nOJ;
    ((o)localObject1).nKS = System.currentTimeMillis();
    ((o)localObject1).fwu = com.tencent.mm.modelgeo.d.agz();
    ((o)localObject1).fwu.b(((o)localObject1).ecy, true);
    if (((o)localObject1).nKF == null)
      ((o)localObject1).nKF = com.tencent.mm.plugin.location.model.l.bJA();
    ((o)localObject1).nKF.a(((o)localObject1).nKU);
    if (localObject2 != null)
      ((o)localObject1).nKJ = ((LocationInfo)localObject2);
    o.b localb;
    if (((o)localObject1).cFy)
    {
      ab.i("MicorMsg.TrackRefreshManager", "start location " + ((o)localObject1).nKJ.nJu + " " + ((o)localObject1).nKJ.nJv);
      localObject1 = this.nQH;
      localb = this.nQQ;
      localObject2 = ((o)localObject1).nKG.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!((Iterator)localObject2).hasNext())
          break;
        localWeakReference = (WeakReference)((Iterator)localObject2).next();
      }
      while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((o.b)localWeakReference.get()).equals(localb)));
    }
    while (true)
    {
      this.nQN = this.activity.getIntent().getStringExtra("fromWhereShare");
      ab.d("MicroMsg.ShareMapUI", "fromWhere=%s", new Object[] { this.nQN });
      if (!this.nQH.bJC())
        break label826;
      ab.i("MicroMsg.ShareMapUI", "has join");
      this.nQG.iE(true);
      this.nQJ.bJY();
      AppMethodBeat.o(113681);
      return;
      ((o)localObject1).nKH = 1;
      ((o)localObject1).nKI = new cmj();
      ((o)localObject1).nKI.xkm = new bku();
      ((o)localObject1).nKI.xkm.vNI = -1000.0D;
      ((o)localObject1).nKI.xkm.vNH = -1000.0D;
      ab.i("MicorMsg.TrackRefreshManager", "start location imp " + ((o)localObject1).nKJ.nJu + " " + ((o)localObject1).nKJ.nJv);
      com.tencent.mm.kernel.g.Rg().a(492, (f)localObject1);
      com.tencent.mm.kernel.g.Rg().a(490, (f)localObject1);
      com.tencent.mm.kernel.g.Rg().a(491, (f)localObject1);
      ((o)localObject1).chh = false;
      ((o)localObject1).cFy = true;
      break;
      ((o)localObject1).nKG.add(new WeakReference(localb));
    }
    label826: localObject2 = this.nQH;
    localObject1 = this.nKN;
    int i;
    if (!bo.isNullOrNil(this.nQN))
      if (this.nQN.equals("fromBanner"))
      {
        i = 0;
        label862: ab.i("MicorMsg.TrackRefreshManager", "track join %s", new Object[] { localObject1 });
        ((o)localObject2).nKN = ((String)localObject1);
        localObject2 = r.Yz();
        if (!((String)localObject1).contains("@chatroom"))
          break label1019;
      }
    while (true)
    {
      localObject1 = new com.tencent.mm.plugin.location.model.a.b((String)localObject1);
      ((awl)((com.tencent.mm.plugin.location.model.a.b)localObject1).ehh.fsG.fsP).Scene = i;
      com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
      AppMethodBeat.o(113681);
      break;
      if (!this.nQN.equals("fromPluginLocation"))
      {
        if (this.nQN.equals("fromPluginTalk"))
        {
          i = 2;
          break label862;
        }
        if (this.nQN.equals("fromTrackButton"))
        {
          i = 3;
          break label862;
        }
        if (this.nQN.equals("fromMessage"))
        {
          i = 4;
          break label862;
        }
      }
      i = 1;
      break label862;
      label1019: if (((String)localObject2).compareTo((String)localObject1) > 0)
        localObject1 = (String)localObject1 + (String)localObject2;
      else
        localObject1 = (String)localObject2 + (String)localObject1;
    }
  }

  public final boolean bKn()
  {
    return true;
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(113691);
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    AppMethodBeat.o(113691);
    return bool;
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(113690);
    h.pYm.e(10997, new Object[] { "11", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    this.nQI.bKc();
    AppMethodBeat.o(113690);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(113680);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.ShareMapUI", "onCreate");
    this.nQO = System.currentTimeMillis();
    AppMethodBeat.o(113680);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(113684);
    super.onDestroy();
    o localo = this.nQH;
    o.b localb = this.nQQ;
    Object localObject = localo.nKG.iterator();
    while (((Iterator)localObject).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject).next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((o.b)localWeakReference.get()).equals(localb)))
        localo.nKG.remove(localWeakReference);
    }
    this.nQH.nKP = null;
    if (this.nQJ != null)
    {
      localObject = this.nQJ;
      ((k)localObject).nNA.b((com.tencent.mm.bg.d)localObject);
      localObject = ((k)localObject).nNn;
      ((VolumeMeter)localObject).nOg = true;
      ((VolumeMeter)localObject).fAA = false;
      if (((VolumeMeter)localObject).nOk != null)
      {
        ((VolumeMeter)localObject).nOk.getLooper().quit();
        ((VolumeMeter)localObject).nOk = null;
      }
    }
    if (this.nQG != null)
      this.nQG.destroy();
    if (this.nQE != null)
    {
      localObject = this.nQE;
      com.tencent.mm.modelgeo.d.agz().c(((MyLocationButton)localObject).ecy);
    }
    ab.i("MicroMsg.ShareMapUI", "onDestory");
    AppMethodBeat.o(113684);
  }

  public final void onPause()
  {
    AppMethodBeat.i(113683);
    ab.i("MicroMsg.ShareMapUI", "pause");
    super.onPause();
    this.wakeLock.release();
    Object localObject = this.nQH;
    ab.d("MicorMsg.TrackRefreshManager", "pause isShared:" + ((o)localObject).nKK);
    if (!((o)localObject).nKK)
    {
      ((o)localObject).fwu.c(((o)localObject).ecy);
      ((o)localObject).nKF.b(((o)localObject).nKU);
      ((o)localObject).nKL = true;
      ((o)localObject).nKR = true;
    }
    o localo = this.nQH;
    localObject = this.nOL.nLY;
    localo.nKM = localo.nKH;
    localo.nKH = 0;
    ab.d("MicorMsg.TrackRefreshManager", "saveStatus pause_save_upload_status: " + localo.nKM);
    if (localo.bJI())
    {
      localo.nJu = (((com.tencent.mm.plugin.k.d)localObject).getMapCenterX() * 1.0D / 1000000.0D);
      localo.nJv = (((com.tencent.mm.plugin.k.d)localObject).getMapCenterY() * 1.0D / 1000000.0D);
      localo.nJw = ((com.tencent.mm.plugin.k.d)localObject).getZoom();
    }
    h.pYm.e(10997, new Object[] { "17", Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis() - this.nQO) });
    this.nQO = System.currentTimeMillis();
    if (this.nQL != null)
      this.nQL.c(this.ecy);
    if (this.nQG != null)
      this.nQG.onPause();
    AppMethodBeat.o(113683);
  }

  public final void onResume()
  {
    AppMethodBeat.i(113682);
    ab.i("MicroMsg.ShareMapUI", "resume");
    super.onResume();
    this.wakeLock.acquire();
    Object localObject = this.nQH;
    ab.d("MicorMsg.TrackRefreshManager", "resume isPuase:" + ((o)localObject).nKL);
    if (((o)localObject).nKL)
    {
      ((o)localObject).nKS = System.currentTimeMillis();
      ((o)localObject).fwu.a(((o)localObject).ecy);
      ((o)localObject).nKF.a(((o)localObject).nKU);
    }
    ((o)localObject).nKL = false;
    ((o)localObject).bJE();
    o localo = this.nQH;
    localObject = this.nOL.nLY;
    localo.nKH = localo.nKM;
    ab.d("MicorMsg.TrackRefreshManager", "resumeStatus upload_status  " + localo.nKH + " %f %f %d ", new Object[] { Double.valueOf(localo.nJu), Double.valueOf(localo.nJv), Integer.valueOf(localo.nJw) });
    if ((localo.nJu != -1000.0D) && (localo.nJv != -1000.0D) && (localo.nJw != -1))
    {
      ((com.tencent.mm.plugin.k.d)localObject).getIController().setCenter(localo.nJu, localo.nJv);
      ((com.tencent.mm.plugin.k.d)localObject).getIController().setZoom(localo.nJw);
    }
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.nQE.setAnimToSelf(false);
        this.nQE.bJO();
        this.nQG.nNX = false;
        this.nQG.nNR = true;
      }
      localo = this.nQH;
      localObject = this.nOL.nLY;
      if (localo.nKQ != -1)
        ((com.tencent.mm.plugin.k.d)localObject).getIController().setZoom(localo.nKQ);
      if (this.nQL != null)
        this.nQL.a(this.ecy);
      if (this.nQG != null)
        this.nQG.onResume();
      AppMethodBeat.o(113682);
      return;
    }
  }

  public final void xD(int paramInt)
  {
    AppMethodBeat.i(113689);
    if (paramInt == 0)
    {
      h.pYm.e(10997, new Object[] { "8", "", Integer.valueOf(0), Integer.valueOf(0) });
      bKz();
      AppMethodBeat.o(113689);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        h.pYm.e(10997, new Object[] { "8", "", Integer.valueOf(0), Integer.valueOf(0) });
        bKz();
        AppMethodBeat.o(113689);
      }
      else
      {
        if (paramInt == 2)
          bKz();
        AppMethodBeat.o(113689);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.g
 * JD-Core Version:    0.6.2
 */