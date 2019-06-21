package com.tencent.mm.plugin.nearlife.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.axx;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.tools.o;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseLifeUI extends MMActivity
  implements f
{
  boolean eVT = false;
  boolean ecu = false;
  private o elS;
  protected boolean fBD = true;
  boolean gxV = false;
  protected String hlm = "";
  private int nJK = 1;
  public int nPQ = -1;
  private boolean nPX;
  MMLoadMoreListView nPi;
  protected String nQB = "";
  private boolean oQo = false;
  private View oRA;
  private TextView oRB;
  private TextView oRC;
  private com.tencent.mm.modelgeo.d oRD = com.tencent.mm.modelgeo.d.agz();
  private com.tencent.mm.plugin.nearlife.b.c oRE;
  private int oRF;
  private List<axx> oRG;
  protected axx oRH = null;
  protected float oRI = 0.0F;
  protected float oRJ = 0.0F;
  protected int oRK = 0;
  protected float oRL = 0.0F;
  protected long oRM = -1L;
  protected long oRN = -1L;
  protected long oRO = -1L;
  protected int oRP = 0;
  protected boolean oRQ = false;
  protected int oRR = -1;
  protected boolean oRS = false;
  boolean oRT = false;
  protected boolean oRU = true;
  private View.OnClickListener oRV = new BaseLifeUI.1(this);
  private View.OnClickListener oRW = new BaseLifeUI.2(this);
  private b.a oRX = new BaseLifeUI.7(this);
  private String oRi = "";
  private View oRw;
  private NearLifeErrorContent oRx;
  private a oRy;
  private a oRz;
  int sceneType = 0;

  private void Ae(int paramInt)
  {
    this.nPi.removeFooterView(this.oRw);
    this.nPi.removeFooterView(this.oRA);
    this.nPi.dzQ();
    this.oRA.setVisibility(paramInt);
    this.oRB.setVisibility(paramInt);
    this.oRC.setVisibility(paramInt);
    if (paramInt == 0)
      this.nPi.addFooterView(this.oRA);
    while (true)
    {
      return;
      this.nPi.dzM();
      this.nPi.addFooterView(this.oRw);
    }
  }

  private void bVp()
  {
    if (!this.gxV)
      ab.i("MicroMsg.BaseLifeUI", "is not Search mode pass createpoi");
    while (true)
    {
      return;
      try
      {
        int i = Integer.valueOf(com.tencent.mm.m.g.Nu().getValue("POICreateForbiden")).intValue();
        ab.i("MicroMsg.BaseLifeUI", "getDynamicConfig createpoi %d", new Object[] { Integer.valueOf(i) });
        if (i == 1)
          continue;
        label56: if (!this.oRz.TD(this.oRz.bVk()))
        {
          String str = String.format(getResources().getString(2131301710), new Object[] { this.oRz.bVk() });
          this.oRB.setText(str);
          Ae(0);
          continue;
        }
        Ae(8);
      }
      catch (Exception localException)
      {
        break label56;
      }
    }
  }

  private boolean jB(boolean paramBoolean)
  {
    axx localaxx;
    label129: 
    do
    {
      if (this.oRE != null)
        ab.d("MicroMsg.BaseLifeUI", "scene is doing...");
      for (paramBoolean = false; ; paramBoolean = false)
      {
        return paramBoolean;
        if (this.oRG.size() - 1 > this.oRF)
          break;
        this.oRF = -1;
        ab.i("MicroMsg.BaseLifeUI", "index inc to end, ret");
      }
      this.oRF += 1;
      localaxx = (axx)this.oRG.get(this.oRF);
      if (this.oRF == 0)
        this.oRP += 1;
      if (!this.gxV)
        break;
      i = this.oRz.b(new BackwardSupportUtil.ExifHelper.LatLongData(localaxx.vRq, localaxx.vRp));
    }
    while (i <= 0);
    SKBuiltinBuffer_t localSKBuiltinBuffer_t;
    if (this.gxV)
    {
      localSKBuiltinBuffer_t = this.oRz.a(new BackwardSupportUtil.ExifHelper.LatLongData(localaxx.vRq, localaxx.vRp));
      label164: if (!this.gxV)
        break label243;
    }
    label243: for (int i = 1; ; i = 0)
    {
      if (com.tencent.mm.plugin.nearlife.b.c.Ab(i))
        break label248;
      this.oRF = -1;
      paramBoolean = false;
      break;
      i = this.oRy.b(new BackwardSupportUtil.ExifHelper.LatLongData(localaxx.vRq, localaxx.vRp));
      break label129;
      localSKBuiltinBuffer_t = this.oRy.a(new BackwardSupportUtil.ExifHelper.LatLongData(localaxx.vRq, localaxx.vRp));
      break label164;
    }
    label248: if (-1L == this.oRM)
      this.oRM = System.currentTimeMillis();
    int j = this.sceneType;
    float f1 = localaxx.vRp;
    float f2 = localaxx.vRq;
    int k = localaxx.wfG;
    int m = localaxx.wfJ;
    String str1 = localaxx.wfH;
    String str2 = localaxx.wfI;
    if (this.gxV);
    for (String str3 = this.oRz.bVk(); ; str3 = "")
    {
      this.oRE = new com.tencent.mm.plugin.nearlife.b.c(i, j, f1, f2, k, m, str1, str2, localSKBuiltinBuffer_t, str3, this.nPQ, paramBoolean, false);
      aw.Rg().a(this.oRE, 0);
      ab.i("MicroMsg.BaseLifeUI", "start get lbs life list, index:%d, lat:%f, long:%f", new Object[] { Integer.valueOf(this.oRF), Float.valueOf(localaxx.vRq), Float.valueOf(localaxx.vRp) });
      paramBoolean = true;
      break;
    }
  }

  protected final void a(int paramInt, boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    String str1 = paramString;
    if (paramString != null)
    {
      str1 = paramString;
      if (paramString.startsWith("mm_"))
        str1 = "";
    }
    String str2 = "";
    int i;
    int j;
    label63: Object localObject1;
    Object localObject2;
    if (paramInt >= 0)
      if (paramBoolean1)
        if (paramBoolean2)
        {
          i = 43;
          if (this.oRS)
          {
            paramString = h.pYm;
            if (!paramBoolean1)
              break label403;
            j = 5;
            paramString.e(11139, new Object[] { Integer.valueOf(j) });
          }
          if (!paramBoolean1)
            break label409;
          localObject1 = this.oRz.Ad(paramInt).nQA;
          paramString = (String)localObject1;
          if (this.oRz.getCount() <= 0)
            break label545;
          localObject2 = this.oRz.Ad(1).nQB;
          paramString = (String)localObject1;
          localObject1 = localObject2;
        }
    while (true)
    {
      label132: j = i;
      localObject2 = localObject1;
      str2 = paramString;
      if (bo.isNullOrNil((String)localObject1))
      {
        localObject2 = this.nQB;
        str2 = paramString;
        j = i;
      }
      if (this.oRH == null);
      for (paramString = "null/null"; ; paramString = String.format("%f/%f", new Object[] { Float.valueOf(this.oRH.vRq), Float.valueOf(this.oRH.vRp) }))
      {
        ab.d("MicroMsg.BaseLifeUI", "index: %s, bid: %s, index: %s, searchId: %s, requestId: %s", new Object[] { Integer.valueOf(paramInt + 1), str1, Integer.valueOf(paramInt), str2, localObject2 });
        h.pYm.e(11135, new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt + 1), Long.valueOf(this.oRM), Long.valueOf(this.oRO), Long.valueOf(System.currentTimeMillis()), Long.valueOf(this.oRN), Integer.valueOf(this.oRP), paramString, str1, Integer.valueOf(this.nPQ), str2, q.LK(), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), localObject2 });
        return;
        i = 3;
        break;
        if (paramBoolean2)
        {
          i = 41;
          break;
        }
        i = 1;
        break;
        label403: j = 4;
        break label63;
        label409: localObject2 = this.oRy.Ad(paramInt).nQA;
        paramString = (String)localObject2;
        if (this.oRy.getCount() <= 0)
          break label545;
        localObject1 = this.oRy.Ad(1).nQB;
        paramString = (String)localObject2;
        break label132;
        if (this.oRQ)
          if (paramBoolean2)
            i = 44;
        while (true)
        {
          localObject2 = "";
          j = i;
          break;
          i = 4;
          continue;
          if (paramBoolean2)
            i = 42;
          else
            i = 2;
        }
      }
      label545: localObject1 = "";
    }
  }

  public abstract a bVm();

  public abstract a bVn();

  public void bVo()
  {
    ab.d("MicroMsg.BaseLifeUI", "init header");
    this.oRA = View.inflate(this, 2130969252, null);
    this.oRB = ((TextView)this.oRA.findViewById(2131823167));
    this.oRC = ((TextView)this.oRA.findViewById(2131823166));
    this.oRA.setOnClickListener(this.oRW);
    this.oRw = View.inflate(this, 2130970372, null);
    this.nPi.addFooterView(this.oRw);
    this.oRw.setVisibility(8);
  }

  public int getLayoutId()
  {
    return 2130970285;
  }

  public final void initView()
  {
    this.nPi = ((MMLoadMoreListView)findViewById(2131826292));
    this.nPi.setFooterTips(getString(2131301612));
    this.oRx = ((NearLifeErrorContent)findViewById(2131826293));
    bVo();
    this.oRy = bVm();
    this.oRz = bVn();
    this.nPi.setAdapter(this.oRy);
    this.oRx.setListView(this.nPi);
    this.oRy.notifyDataSetChanged();
    setBackBtn(new BaseLifeUI.3(this));
    new BaseLifeUI.4(this);
    this.elS = new o((byte)0);
    this.elS.zHa = new BaseLifeUI.5(this);
    this.nPi.setOnLoadMoreListener(new MMLoadMoreListView.a()
    {
      public final void KB()
      {
        AppMethodBeat.i(22946);
        BaseLifeUI.a(BaseLifeUI.this);
        AppMethodBeat.o(22946);
      }
    });
    this.nPi.dzN();
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.d("MicroMsg.BaseLifeUI", "onActivityResult requestCode %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1)
      switch (paramInt1)
      {
      default:
      case 1:
      }
    while (true)
    {
      return;
      setResult(-1, paramIntent);
      finish();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.oRU = getIntent().getBooleanExtra("poi_show_none", true);
    this.nPQ = ((int)(System.currentTimeMillis() / 1000L));
    com.tencent.mm.plugin.nearlife.b.c.clear();
    aw.Rg().a(603, this);
    this.sceneType = getIntent().getIntExtra("near_life_scene", 0);
    this.nQB = getIntent().getStringExtra("request_id");
    this.oRG = new ArrayList();
    initView();
  }

  public void onDestroy()
  {
    aw.Rg().b(603, this);
    super.onDestroy();
    if (this.oRD != null)
      this.oRD.c(this.oRX);
  }

  public void onPause()
  {
    super.onPause();
    this.oRD.c(this.oRX);
  }

  public void onResume()
  {
    super.onResume();
    this.oRy.notifyDataSetChanged();
    this.nPi.dzP();
    if (this.oRD != null)
      this.oRD.a(this.oRX, true);
    this.eVT = false;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    if (paramm.getType() != 603)
      return;
    this.nPi.dzO();
    com.tencent.mm.plugin.nearlife.b.c localc = (com.tencent.mm.plugin.nearlife.b.c)paramm;
    LogoImageView localLogoImageView;
    Object localObject;
    if (!bo.isNullOrNil(localc.oRi))
    {
      this.oRi = localc.oRi;
      localLogoImageView = (LogoImageView)this.oRw.findViewById(2131826563);
      localObject = this.oRi;
      aw.ZK();
      localLogoImageView.imagePath = com.tencent.mm.model.c.XX();
      localLogoImageView.url = ((String)localObject);
      localLogoImageView.eTi = 0;
      localLogoImageView.eTj = 0;
      if ((localObject != null) && (((String)localObject).length() != 0))
        break label170;
      localLogoImageView.setVisibility(8);
    }
    int i;
    while (true)
    {
      this.hlm = localc.hlm;
      this.nJK = localc.nJK;
      i = ((com.tencent.mm.plugin.nearlife.b.c)paramm).czE;
      com.tencent.mm.plugin.nearlife.b.c.Ac(i);
      if (this.oRE != null)
        break label383;
      ab.d("MicroMsg.BaseLifeUI", "scene is null");
      break;
      label170: if (((String)localObject).startsWith("http"))
      {
        Bitmap localBitmap = BitmapFactory.decodeFile(localLogoImageView.imagePath + com.tencent.mm.a.g.x(((String)localObject).getBytes()));
        if (localBitmap != null)
        {
          localObject = localBitmap;
          if (localLogoImageView.eTi > 0)
          {
            localObject = localBitmap;
            if (localLogoImageView.eTj > 0)
              localObject = com.tencent.mm.sdk.platformtools.d.a(localBitmap, localLogoImageView.eTi, localLogoImageView.eTj, true, false);
          }
          localLogoImageView.setImageBitmap((Bitmap)localObject);
        }
        else
        {
          com.tencent.mm.sdk.g.d.post(new LogoImageView.a((String)localObject, localLogoImageView.handler), "LogoImageView_download");
        }
      }
      else if (!com.tencent.mm.a.e.ct((String)localObject))
      {
        localLogoImageView.setVisibility(8);
      }
      else
      {
        if ((localLogoImageView.eTi <= 0) || (localLogoImageView.eTj <= 0));
        for (localObject = com.tencent.mm.sdk.platformtools.d.aml((String)localObject); ; localObject = com.tencent.mm.sdk.platformtools.d.d((String)localObject, localLogoImageView.eTi, localLogoImageView.eTj, true))
        {
          if (localObject != null)
            break label373;
          localLogoImageView.setVisibility(8);
          break;
        }
        label373: localLogoImageView.setImageBitmap((Bitmap)localObject);
      }
    }
    label383: ab.i("MicroMsg.BaseLifeUI", "onSceneEnd: index:%d, errType=%d, errCode=%d, errMsg=%s opcde %d ", new Object[] { Integer.valueOf(this.oRF), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
    if ((paramInt2 == 0) || (paramInt2 == 101))
    {
      i = 1;
      label444: if ((paramInt1 == 0) || (i != 0))
        break label542;
      ab.d("MicroMsg.BaseLifeUI", "error");
      if (!this.gxV)
        break label534;
      paramString = this.oRz;
      label473: if ((this.oRG.size() - 1 == this.oRF) && (paramString.getCount() == 0))
      {
        paramString.oRv = 1;
        this.oRx.Af(paramString.oRv);
      }
    }
    while (true)
    {
      this.oRE = null;
      jB(false);
      break;
      i = 0;
      break label444;
      label534: paramString = this.oRy;
      break label473;
      label542: if (-1L == this.oRN)
        this.oRN = System.currentTimeMillis();
      this.oRO = System.currentTimeMillis();
      paramm = localc.oRj;
      paramString = (axx)this.oRG.get(this.oRF);
      localObject = new BackwardSupportUtil.ExifHelper.LatLongData(paramString.vRq, paramString.vRp);
      if ((this.gxV) && (!this.oRE.oRk))
        this.oRz.bVj();
      if (this.gxV)
      {
        this.oRz.a((BackwardSupportUtil.ExifHelper.LatLongData)localObject, localc.bVi(), localc.bVh());
        label658: if ((paramm != null) && (paramm.size() != 0))
          break label832;
        if (!this.gxV)
          break label824;
      }
      label824: for (paramString = this.oRz; ; paramString = this.oRy)
      {
        if (this.oRG.size() - 1 == this.oRF)
        {
          if (paramString.getCount() == 0)
            this.oRx.Af(paramString.oRv);
          this.nPi.dzO();
          if ((!paramString.bVl()) && (paramInt2 != 101))
            bVp();
        }
        if ((!this.oRy.bVl()) && (this.oRw != null) && (!this.gxV))
          this.oRw.setVisibility(0);
        if ((this.oRw == null) || (this.gxV))
          break label930;
        this.oRw.setVisibility(0);
        break;
        this.oRy.a((BackwardSupportUtil.ExifHelper.LatLongData)localObject, localc.bVi(), localc.bVh());
        break label658;
      }
      label832: if (this.gxV);
      for (paramString = this.oRz; ; paramString = this.oRy)
      {
        this.nPi.setVisibility(0);
        paramString.oRv = 0;
        this.oRx.Af(this.oRz.oRv);
        paramString.a((BackwardSupportUtil.ExifHelper.LatLongData)localObject, paramm);
        paramString.notifyDataSetChanged();
        if ((this.oRG.size() - 1 != this.oRF) || (paramString.bVl()))
          break;
        this.nPi.dzO();
        bVp();
        break;
      }
      label930: if (this.oRw != null)
        this.oRw.setVisibility(8);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public abstract void p(double paramDouble1, double paramDouble2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.BaseLifeUI
 * JD-Core Version:    0.6.2
 */