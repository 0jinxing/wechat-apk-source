package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gs;
import com.tencent.mm.g.a.gs.b;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.a.b.f;
import com.tencent.mm.plugin.sns.lucky.a.m;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pluginsdk.model.t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.e.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class SnsBrowseUI extends SnsBaseGalleryUI
  implements s.a
{
  private int cBt;
  private String czD;
  private int ieu;
  private int iev;
  Bundle jWy;
  private boolean jYD;
  com.tencent.mm.ui.tools.e jYE;
  private int kkq;
  private int kkr;
  private int kks;
  private int kkt;
  private com.tencent.mm.sdk.platformtools.ak mHandler;
  private ImageView mmX;
  private int rpA;
  private int rpB;
  private int rpr;
  private boolean rps;
  private boolean rpt;
  private boolean rpu;
  private t rpv;
  private int rpw;
  private int rpx;
  private int rpy;
  private float rpz;

  public SnsBrowseUI()
  {
    AppMethodBeat.i(38759);
    this.rpr = 0;
    this.cBt = 0;
    this.rps = false;
    this.rpt = false;
    this.rpu = false;
    this.jYD = false;
    this.ieu = 0;
    this.iev = 0;
    this.kkq = 0;
    this.kkr = 0;
    this.kks = 0;
    this.kkt = 0;
    this.mHandler = new com.tencent.mm.sdk.platformtools.ak();
    this.rpy = 0;
    this.rpz = 1.0F;
    this.rpA = 0;
    this.rpB = 0;
    AppMethodBeat.o(38759);
  }

  private void D(n paramn)
  {
    AppMethodBeat.i(38767);
    this.rpq = ((Button)findViewById(2131827691));
    int i = com.tencent.mm.ui.ak.fr(this);
    Object localObject = (ViewGroup.MarginLayoutParams)this.rpq.getLayoutParams();
    ((ViewGroup.MarginLayoutParams)localObject).bottomMargin = (i + getResources().getDimensionPixelSize(2131428665));
    this.rpq.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localObject = paramn.cqu();
    if (localObject != null)
    {
      paramn = ((TimeLineObject)localObject).qNO;
      av localav = new av();
      af.a(this, localav, ((TimeLineObject)localObject).qNO);
      if (!localav.rBh)
        break label146;
      this.rpq.setVisibility(0);
      this.rpq.setText(localav.rBi);
      this.rpq.setOnClickListener(new SnsBrowseUI.2(this, paramn, (TimeLineObject)localObject));
      AppMethodBeat.o(38767);
    }
    while (true)
    {
      return;
      paramn = null;
      break;
      label146: this.rpq.setVisibility(8);
      AppMethodBeat.o(38767);
    }
  }

  public final void bcW()
  {
    AppMethodBeat.i(38768);
    int i = this.kks;
    int j = this.kkt;
    int k = this.kkr;
    int m = this.kkq;
    if (!this.rpt)
    {
      localObject = new gs();
      ((gs)localObject).cBr.cBu = this.rpp.getGallery().getSelectedItemPosition();
      ((gs)localObject).cBr.cBt = this.cBt;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      i = ((gs)localObject).cBs.ctV;
      j = ((gs)localObject).cBs.ctW;
      k = ((gs)localObject).cBs.ctT;
      m = ((gs)localObject).cBs.ctU;
    }
    this.rpw = this.rpp.getWidth();
    this.rpx = this.rpp.getHeight();
    com.tencent.mm.plugin.sns.model.af.cnC();
    Object localObject = g.C(this.rpp.getCntMedia());
    int n = j;
    if (localObject != null)
    {
      localObject = d.amj((String)localObject);
      float f = this.rpw / ((BitmapFactory.Options)localObject).outWidth;
      this.rpx = ((int)(((BitmapFactory.Options)localObject).outHeight * f));
      n = j;
      if (this.rpx > this.rpp.getHeight())
      {
        n = j;
        if (this.rpx < this.rpp.getHeight() * 2.5D)
        {
          this.rpy = (this.rpx - this.rpp.getHeight());
          n = j;
          if (this.rpp.getCount() == 1)
          {
            n = j * this.rpp.getHeight() / this.rpx;
            this.rpy = 0;
          }
        }
        this.rpx = this.rpp.getHeight();
      }
    }
    this.jYE.hw(this.rpw, this.rpx);
    this.jYE.L(k, m, i, n);
    if (this.rpz != 1.0D)
    {
      this.jYE.zEZ = (1.0F / this.rpz);
      if ((this.rpA != 0) || (this.rpB != 0))
      {
        n = (int)(this.rpp.getWidth() / 2 * (1.0F - this.rpz));
        k = this.rpA;
        j = (int)(this.rpp.getHeight() / 2 + this.rpB - this.rpx / 2 * this.rpz);
        this.jYE.hy(n + k, j);
      }
    }
    this.jYE.zFd = this.rpy;
    this.jYE.a(this.rpp, this.mmX, new SnsBrowseUI.4(this), new e.a()
    {
      public final void F(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        AppMethodBeat.i(38756);
        if ((SnsBrowseUI.this.rpp.getGallery() != null) && (Build.VERSION.SDK_INT >= 18))
          SnsBrowseUI.this.rpp.getGallery().setClipBounds(new Rect(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4));
        AppMethodBeat.o(38756);
      }
    });
    AppMethodBeat.o(38768);
  }

  public final void crM()
  {
  }

  public final void csT()
  {
    AppMethodBeat.i(38769);
    Gallery localGallery = this.rpp.getGallery();
    if ((localGallery instanceof MMGestureGallery))
      ((MMGestureGallery)localGallery).setGalleryScaleListener(new SnsBrowseUI.6(this, localGallery));
    AppMethodBeat.o(38769);
  }

  public final void dg(String paramString, int paramInt)
  {
    AppMethodBeat.i(38770);
    ab.i("MicroMsg.SnsPopMediasUI", "[notifyData] opType:%s reset:%s localId;%s", new Object[] { Integer.valueOf(paramInt), Boolean.TRUE, paramString });
    if (this.rpp != null)
      this.rpp.btt();
    AppMethodBeat.o(38770);
  }

  public final void dh(String paramString, int paramInt)
  {
    this.rpr = paramInt;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(38765);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.SnsPopMediasUI", "dispatchKeyEvent");
      setResult(-1, new Intent());
      bcW();
      bool = true;
      AppMethodBeat.o(38765);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(38765);
    }
  }

  public final int getForceOrientation()
  {
    return 2;
  }

  public final int getLayoutId()
  {
    return 2130970748;
  }

  public final void initView()
  {
    AppMethodBeat.i(38766);
    this.jYE = new com.tencent.mm.ui.tools.e(this.mController.ylL);
    this.jYD = false;
    Object localObject1 = bo.bc(getIntent().getStringExtra("sns_gallery_userName"), "");
    this.czD = bo.bc(getIntent().getStringExtra("sns_gallery_localId"), "");
    this.rpr = getIntent().getIntExtra("sns_gallery_position", 0);
    this.cBt = getIntent().getIntExtra("sns_position", 0);
    this.rps = getIntent().getBooleanExtra("k_is_from_sns_main_timeline", false);
    this.rpt = getIntent().getBooleanExtra("k_is_from_sns_msg_ui", false);
    this.rpu = getIntent().getBooleanExtra("sns_soon_enter_photoedit_ui", false);
    n localn = com.tencent.mm.plugin.sns.model.af.cnF().YT(this.czD);
    this.mmX = ((ImageView)findViewById(2131822079));
    this.mmX.setLayerType(2, null);
    this.rpp = new SnsInfoFlip(this);
    this.rpp.setLayerType(2, null);
    this.rpp.setIsFromMainTimeline(this.rps);
    this.rpp.setNeedScanImage(true);
    Object localObject2 = aj.Ya(this.czD);
    this.rpp.setShowPageControl(true);
    this.rpp.setOreitaion(true);
    this.rpp.setTouchFinish(true);
    this.rpp.setInfoType(localn.field_type);
    this.rpp.setIsSoonEnterPhotoEditUI(this.rpu);
    this.rpp.a((List)localObject2, (String)localObject1, this.rpr, this.rpk, this);
    localObject1 = this.rpp;
    localObject2 = az.dtg();
    ((az)localObject2).oyB = localn.field_createTime;
    ((SnsInfoFlip)localObject1).setFromScene((az)localObject2);
    addView(this.rpp);
    if ((localn != null) && (localn.DI(32)))
      this.rpp.setIsAd(true);
    D(localn);
    if (!m.k(localn))
    {
      ab.e("MicroMsg.SnsPopMediasUI", "error see photo !! " + localn.field_userName + " " + localn.field_snsId);
      finish();
      AppMethodBeat.o(38766);
    }
    while (true)
    {
      return;
      if ((localn.field_type == 21) && (!localn.field_userName.equals(r.Yz())))
      {
        this.rpv = new t(com.tencent.mm.compatible.util.e.eSl + "/Pictures/Screenshots/", new SnsBrowseUI.1(this));
        this.rpv.start();
      }
      AppMethodBeat.o(38766);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(38771);
    ab.i("MicroMsg.SnsPopMediasUI", "onAcvityResult requestCode:".concat(String.valueOf(paramInt1)));
    if (paramInt2 != -1)
      AppMethodBeat.o(38771);
    while (true)
    {
      return;
      AppMethodBeat.o(38771);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38760);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    getIntent().setExtrasClassLoader(getClass().getClassLoader());
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().setFlags(134218752, 134218752);
      getWindow().addFlags(67108864);
    }
    dya();
    initView();
    this.jWy = paramBundle;
    AppMethodBeat.o(38760);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38761);
    int i;
    int j;
    SnsInfoFlip localSnsInfoFlip;
    if (this.rpp != null)
    {
      i = getIntent().getIntExtra("K_ad_scene", -1);
      j = getIntent().getIntExtra("K_ad_source", 0);
      localSnsInfoFlip = this.rpp;
      localObject1 = this.czD;
      if (localSnsInfoFlip.qFG)
      {
        if (i >= 0)
          break label195;
        ab.i("MicroMsg.SnsInfoFlip", "pass by scene ".concat(String.valueOf(i)));
      }
    }
    label195: n localn;
    do
    {
      localObject1 = com.tencent.mm.modelsns.b.u(getIntent());
      if (localObject1 != null)
      {
        this.rpp.getSelectCount();
        k = this.rpp.getNumOfFileExist();
        ((com.tencent.mm.modelsns.b)localObject1).mb(this.rpp.getCount()).mb(k);
        ((com.tencent.mm.modelsns.b)localObject1).update();
        ((com.tencent.mm.modelsns.b)localObject1).ajK();
      }
      this.rpp.ctm();
      this.rpp.onDestroy();
      com.tencent.mm.plugin.sns.model.af.cnC().ab(this);
      if (this.rps)
        this.rpp.cto();
      if (this.rpv != null)
        this.rpv.stop();
      super.onDestroy();
      AppMethodBeat.o(38761);
      return;
      localn = com.tencent.mm.plugin.sns.model.af.cnF().YT((String)localObject1);
    }
    while (localn == null);
    long l1;
    long l2;
    if (localSnsInfoFlip.rsO >= 0)
    {
      if (!localSnsInfoFlip.rsq.containsKey(Integer.valueOf(localSnsInfoFlip.rsO)))
        break label610;
      l1 = ((Long)localSnsInfoFlip.rsq.get(Integer.valueOf(localSnsInfoFlip.rsO))).longValue();
      if (l1 > 0L)
      {
        if (!localSnsInfoFlip.rsr.containsKey(Integer.valueOf(localSnsInfoFlip.rsO)))
          break label616;
        l2 = ((Long)localSnsInfoFlip.rsr.get(Integer.valueOf(localSnsInfoFlip.rsO))).longValue();
        label302: l1 = bo.az(l1);
        l2 += l1;
        localSnsInfoFlip.rsr.put(Integer.valueOf(localSnsInfoFlip.rsO), Long.valueOf(l2));
        ab.i("MicroMsg.SnsInfoFlip", "lastSelectPosition " + localSnsInfoFlip.rsO + " curtime " + l2 + " passtime " + l1);
      }
    }
    com.tencent.mm.plugin.sns.storage.e locale = localn.crd();
    label402: StringBuffer localStringBuffer1;
    StringBuffer localStringBuffer2;
    label443: int m;
    if (j == 2)
    {
      localn.cqr();
      localStringBuffer1 = new StringBuffer();
      localStringBuffer2 = new StringBuffer();
      localStringBuffer1.append("<desc>");
      localObject1 = localSnsInfoFlip.rsp.keySet().iterator();
      if (!((Iterator)localObject1).hasNext())
        break label637;
      localObject2 = (Integer)((Iterator)localObject1).next();
      m = ((Integer)localSnsInfoFlip.rsp.get(localObject2)).intValue();
      if (!localSnsInfoFlip.rsr.containsKey(localObject2))
        break label631;
    }
    label610: label616: label631: for (int k = (int)(((Long)localSnsInfoFlip.rsr.get(localObject2)).longValue() * 1L); ; k = 0)
    {
      localStringBuffer1.append(String.format("<item><id>%d</id><duration>%d</duration><count>%d</count></item>", new Object[] { localObject2, Integer.valueOf(k), Integer.valueOf(m) }));
      localStringBuffer2.append(String.format("%d|%d|%d", new Object[] { localObject2, Integer.valueOf(k), Integer.valueOf(m) }) + "&");
      break label443;
      l1 = 0L;
      break;
      l2 = 0L;
      break label302;
      localn.cqq();
      break label402;
    }
    label637: localStringBuffer1.append("</desc>");
    Object localObject2 = localStringBuffer2.toString();
    Object localObject1 = localObject2;
    if (((String)localObject2).endsWith("&"))
      localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - 1);
    if ((localn == null) || (!localn.coX()))
      com.tencent.mm.plugin.sns.model.af.cnz().e(12014, new Object[] { f.a(localn.field_snsId, new Object[] { com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId), localn.crc(), Integer.valueOf(i), Long.valueOf(localSnsInfoFlip.rsG), Long.valueOf(System.currentTimeMillis()), localObject1, Integer.valueOf(localSnsInfoFlip.getCount()) }) });
    if (!locale.cqo().coP())
      if (j != 0)
        break label919;
    label919: for (k = 1; ; k = 2)
    {
      com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(j, k, localn.field_snsId, 6, 0));
      localObject2 = com.tencent.mm.modelsns.b.lY(729);
      ((com.tencent.mm.modelsns.b)localObject2).tx(com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId)).tx(localn.crc()).mb(i).tx(localSnsInfoFlip.rsG).tx(System.currentTimeMillis()).tx((String)localObject1).mb(localSnsInfoFlip.getCount());
      ((com.tencent.mm.modelsns.b)localObject2).ajK();
      break;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(38762);
    if (this.rpp != null)
      this.rpp.onPause();
    super.onPause();
    com.tencent.mm.plugin.webview.ui.tools.widget.o.JV(2);
    AppMethodBeat.o(38762);
  }

  public void onResume()
  {
    AppMethodBeat.i(38763);
    super.onResume();
    if (this.rpp != null)
      this.rpp.btt();
    com.tencent.mm.plugin.webview.ui.tools.widget.o.JV(1);
    AppMethodBeat.o(38763);
  }

  public void onStart()
  {
    AppMethodBeat.i(38764);
    Bundle localBundle = this.jWy;
    if (!this.jYD)
    {
      this.jYD = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.kkq = getIntent().getIntExtra("img_gallery_top", 0);
        this.kkr = getIntent().getIntExtra("img_gallery_left", 0);
        this.kks = getIntent().getIntExtra("img_gallery_width", 0);
        this.kkt = getIntent().getIntExtra("img_gallery_height", 0);
        this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
        if (localBundle == null)
          this.rpp.getViewTreeObserver().addOnPreDrawListener(new SnsBrowseUI.3(this));
      }
    }
    super.onStart();
    ab.d("MicroMsg.SnsPopMediasUI", "onStart ");
    AppMethodBeat.o(38764);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsBrowseUI
 * JD-Core Version:    0.6.2
 */