package com.tencent.mm.plugin.topstory.ui.home;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.e;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.te;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.topstory.a.e.a;
import com.tencent.mm.plugin.topstory.ui.c.b;
import com.tencent.mm.plugin.topstory.ui.webview.TopStoryWebView;
import com.tencent.mm.plugin.topstory.ui.webview.e.10;
import com.tencent.mm.plugin.topstory.ui.webview.e.2;
import com.tencent.mm.plugin.topstory.ui.webview.e.7;
import com.tencent.mm.plugin.topstory.ui.webview.e.9;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.websearch.api.j;
import com.tencent.mm.protocal.protobuf.chn;
import com.tencent.mm.protocal.protobuf.cht;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView.d;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class b
  implements a
{
  boolean cAY;
  protected chn cPu;
  private n fyJ;
  protected ThreeDotsLoadingView iNB;
  protected FrameLayout raJ;
  List<b.a> rsl;
  protected MMActivity sBH;
  protected boolean sBI;
  protected com.tencent.mm.plugin.topstory.ui.webview.c sBJ;
  protected TopStoryWebView sBK;
  protected com.tencent.mm.plugin.topstory.ui.webview.e sBL;
  protected View sBM;
  protected View sBN;
  protected List<c.b> sBO;
  View sBP;
  int sBQ;
  long sBR;
  boolean sBS;
  private LinearLayout sBT;
  TopStoryViewPager sBU;
  View sBV;
  int sBW;
  int sBX;
  boolean sBY;
  boolean sBZ;
  private boolean sCa;
  private boolean sCb;
  private boolean sCc;
  protected com.tencent.mm.sdk.b.c<te> sCd;
  protected e.a sCe;

  public b(MMActivity paramMMActivity, boolean paramBoolean)
  {
    AppMethodBeat.i(1601);
    this.sBO = new ArrayList();
    this.sBQ = 0;
    this.sBR = 0L;
    this.sBS = false;
    this.cAY = false;
    this.rsl = new ArrayList();
    this.sBW = -1;
    this.sBX = 0;
    this.sBY = false;
    this.sBZ = true;
    this.sCd = new b.5(this);
    this.sCe = new e.a()
    {
      public final void a(int paramAnonymousInt1, String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt2, int paramAnonymousInt3, String paramAnonymousString3)
      {
        AppMethodBeat.i(1578);
        if (b.this.sBL != null)
          b.this.sBL.c(paramAnonymousString1, paramAnonymousString2, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt1, paramAnonymousString3);
        paramAnonymousString1 = b.this.sBO.iterator();
        while (paramAnonymousString1.hasNext())
        {
          paramAnonymousString3 = (c.b)paramAnonymousString1.next();
          if (paramAnonymousString3.category == 110)
          {
            b.this.sBH.runOnUiThread(new b.6.1(this, paramAnonymousString3, paramAnonymousInt1, paramAnonymousString2));
            if (!b.this.cAY)
              an.a(((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEW(), 107, 2, paramAnonymousInt1, 0L, "");
          }
        }
        AppMethodBeat.o(1578);
      }

      public final void a(int paramAnonymousInt1, String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt2, int paramAnonymousInt3, String paramAnonymousString3, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(1580);
        if ((paramAnonymousBoolean) && (b.this.sBL != null))
          b.this.sBL.c(paramAnonymousString1, paramAnonymousString2, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt1, paramAnonymousString3);
        paramAnonymousString3 = b.this.sBO.iterator();
        while (paramAnonymousString3.hasNext())
        {
          paramAnonymousString1 = (c.b)paramAnonymousString3.next();
          if (paramAnonymousString1.category == 110)
          {
            b.this.sBH.runOnUiThread(new b.6.3(this, paramAnonymousString1, paramAnonymousInt1, paramAnonymousString2));
            if ((paramAnonymousInt1 > 0) && (!b.this.cAY))
            {
              an.a(((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEW(), 107, 2, paramAnonymousString1.sBv, 0L, "");
              AppMethodBeat.o(1580);
            }
          }
        }
        while (true)
        {
          return;
          AppMethodBeat.o(1580);
        }
      }

      public final void aby(String paramAnonymousString)
      {
        AppMethodBeat.i(1582);
        com.tencent.mm.plugin.topstory.ui.webview.e locale;
        JSONObject localJSONObject;
        if (b.this.sBL != null)
        {
          locale = b.this.sBL;
          localJSONObject = new JSONObject();
        }
        try
        {
          localJSONObject.put("params", paramAnonymousString);
          al.d(new e.2(locale, localJSONObject.toString()));
          AppMethodBeat.o(1582);
          return;
        }
        catch (JSONException paramAnonymousString)
        {
          while (true)
            ab.w("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebRecommendNotifyReddotExtMsg json exception: " + paramAnonymousString.getMessage());
        }
      }

      public final void as(String paramAnonymousString, long paramAnonymousLong)
      {
        AppMethodBeat.i(1579);
        if (b.this.sBL != null)
          b.this.sBL.aw(paramAnonymousString, paramAnonymousLong);
        Object localObject = b.this.sBO.iterator();
        if (((Iterator)localObject).hasNext())
        {
          localObject = (c.b)((Iterator)localObject).next();
          if (((c.b)localObject).category == 110)
          {
            b.this.sBH.runOnUiThread(new b.6.2(this, (c.b)localObject, paramAnonymousString));
            if ((!b.this.cAY) && (((c.b)localObject).sBv <= 0))
              an.a(((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEP(), 107, 1, 0, 0L, "");
          }
        }
        AppMethodBeat.o(1579);
      }

      public final void at(String paramAnonymousString, long paramAnonymousLong)
      {
        AppMethodBeat.i(1583);
        b.this.sBH.runOnUiThread(new b.6.5(this, paramAnonymousString, paramAnonymousLong));
        AppMethodBeat.o(1583);
      }

      public final void cFk()
      {
        AppMethodBeat.i(1581);
        Iterator localIterator = b.this.sBO.iterator();
        while (localIterator.hasNext())
        {
          c.b localb = (c.b)localIterator.next();
          if (localb.category == 110)
          {
            b.this.sBH.runOnUiThread(new b.6.4(this, localb));
            AppMethodBeat.o(1581);
          }
        }
        while (true)
        {
          return;
          AppMethodBeat.o(1581);
        }
      }
    };
    this.fyJ = new b.7(this);
    this.sBH = paramMMActivity;
    this.sBI = paramBoolean;
    AppMethodBeat.o(1601);
  }

  static Bitmap a(TopStoryWebView paramTopStoryWebView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1622);
    try
    {
      long l = System.currentTimeMillis();
      Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.RGB_565);
      Canvas localCanvas = new android/graphics/Canvas;
      localCanvas.<init>(localBitmap);
      paramTopStoryWebView.drawCanvas(localCanvas);
      paramTopStoryWebView = new java/lang/StringBuilder;
      paramTopStoryWebView.<init>("captureWebView success, cost:");
      ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", System.currentTimeMillis() - l);
      com.tencent.mm.plugin.topstory.a.a.b.cFr();
      paramTopStoryWebView = localBitmap;
      AppMethodBeat.o(1622);
      return paramTopStoryWebView;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        paramTopStoryWebView = null;
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryUIComponentImpl", localThrowable, "captureWebView error", new Object[0]);
        com.tencent.mm.plugin.topstory.a.a.b.cFr();
      }
    }
  }

  public final boolean FA(int paramInt)
  {
    AppMethodBeat.i(1605);
    boolean bool;
    if (paramInt == 4)
    {
      onBackBtnClick();
      bool = true;
      AppMethodBeat.o(1605);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1605);
    }
  }

  public final void a(com.tencent.mm.plugin.topstory.ui.webview.c paramc, TopStoryWebView paramTopStoryWebView, com.tencent.mm.plugin.topstory.ui.webview.e parame, chn paramchn)
  {
    AppMethodBeat.i(1619);
    this.sBJ = paramc;
    this.sBK = paramTopStoryWebView;
    this.sBL = parame;
    this.sBL.sHt = this;
    this.cPu = paramchn;
    paramc = this.sBJ;
    paramc.sHt = this;
    g.Rg().a(2582, paramc.sHA);
    g.Rg().a(2802, paramc.sEu);
    g.Rg().a(2906, paramc.sHz);
    paramc = new FrameLayout.LayoutParams(-1, -1);
    this.raJ.addView(this.sBK, paramc);
    AppMethodBeat.o(1619);
  }

  public final void abD(String paramString)
  {
    AppMethodBeat.i(1613);
    Iterator localIterator = this.rsl.iterator();
    while (localIterator.hasNext())
    {
      b.a locala = (b.a)localIterator.next();
      if (locala.sCw != null)
      {
        locala.sCx = 0;
        ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "invalid cache when onSearchDataReady");
      }
    }
    this.sCc = true;
    this.sBL.abD(paramString);
    AppMethodBeat.o(1613);
  }

  public final void abE(String paramString)
  {
    AppMethodBeat.i(1614);
    al.d(new e.7(this.sBL, paramString));
    AppMethodBeat.o(1614);
  }

  public final void abF(String paramString)
  {
    AppMethodBeat.i(1615);
    al.d(new e.10(this.sBL, paramString));
    AppMethodBeat.o(1615);
  }

  public final void abG(String paramString)
  {
    AppMethodBeat.i(1616);
    al.d(new e.9(this.sBL, paramString));
    AppMethodBeat.o(1616);
  }

  public final void al(int paramInt, boolean paramBoolean)
  {
    int i = 0;
    while (true)
    {
      Object localObject1;
      try
      {
        AppMethodBeat.i(1623);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("changeView, from ");
        Object localObject2;
        if (paramBoolean)
        {
          localObject2 = "viewpager";
          ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", (String)localObject2);
          if (paramInt == this.sBW)
          {
            ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "changeView return");
            AppMethodBeat.o(1623);
          }
        }
        else
        {
          localObject2 = "tab";
          continue;
        }
        if (paramInt == 0)
        {
          j = 1;
          this.sBW = paramInt;
          localObject2 = (b.a)this.rsl.get(j);
          if (this.sBV.getParent() != ((b.a)this.rsl.get(j)).sCv)
            break label296;
          if (((b.a)localObject2).sCx > 0)
            break label274;
          paramInt = 1;
          ((b.a)localObject2).sCx = 2;
          localObject1 = (c.b)this.sBO.get(this.sBW);
          this.sBZ = false;
          if (paramInt == 0)
            break label310;
          com.tencent.mm.sdk.g.a.e locale = com.tencent.mm.sdk.g.d.xDG;
          Runnable local8 = new com/tencent/mm/plugin/topstory/ui/home/b$8;
          local8.<init>(this, (b.a)localObject2, j, (c.b)localObject1);
          locale.b(local8, "CaptureWebViewTask");
          if (!bo.isNullOrNil(((c.b)localObject1).sBx))
            break label448;
          localObject2 = ((c.b)localObject1).sBw;
          an.b(((c.b)localObject1).category, this.sBQ, (String)localObject2, this.cPu.hlm, paramBoolean);
          AppMethodBeat.o(1623);
          continue;
        }
      }
      finally
      {
      }
      int j = 0;
      continue;
      label274: localObject3.sCw.setVisibility(0);
      ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "changeView cacheworked");
      paramInt = 0;
      continue;
      label296: localObject3.sCw.setVisibility(0);
      paramInt = i;
      continue;
      label310: if (this.sBV.getParent() != null)
      {
        ((ViewGroup)this.sBV.getParent()).removeView(this.sBV);
        ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "remove view from:".concat(String.valueOf(j)));
      }
      Object localObject4 = new android/widget/FrameLayout$LayoutParams;
      ((FrameLayout.LayoutParams)localObject4).<init>(-1, -1);
      ((b.a)this.rsl.get(this.sBW)).sCv.addView(this.sBV, (ViewGroup.LayoutParams)localObject4);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("add view to:");
      ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", this.sBW);
      this.sBL.aj(((c.b)localObject1).sBt, ((c.b)localObject1).sBu, ((c.b)localObject1).sBv);
      continue;
      label448: localObject4 = ((c.b)localObject1).sBx;
    }
  }

  final void av(String paramString, long paramLong)
  {
    AppMethodBeat.i(1620);
    this.sBP.setVisibility(0);
    cht localcht = new cht();
    localcht.cJb = paramString;
    localcht.xgz = paramLong;
    an.a(localcht, 107, 5, 0, 0L, "");
    AppMethodBeat.o(1620);
  }

  public final MMActivity bKU()
  {
    return this.sBH;
  }

  public final void cFA()
  {
    AppMethodBeat.i(1618);
    this.sBH.runOnUiThread(new b.4(this));
    AppMethodBeat.o(1618);
  }

  public final void cFB()
  {
    AppMethodBeat.i(1604);
    if ((this.sBZ) && (this.rsl.size() > 0))
    {
      int i = this.sBW;
      this.sBU.postDelayed(new b.16(this, i), 100L);
      AppMethodBeat.o(1604);
    }
    while (true)
    {
      return;
      this.sBZ = true;
      AppMethodBeat.o(1604);
    }
  }

  public final int cFC()
  {
    return this.sBX;
  }

  final void cFD()
  {
    AppMethodBeat.i(1607);
    if (this.sBL != null)
    {
      this.sBL.cHo();
      cFA();
    }
    AppMethodBeat.o(1607);
  }

  protected boolean cFE()
  {
    return true;
  }

  public final void cFy()
  {
    this.sCa = true;
  }

  public final void cFz()
  {
    AppMethodBeat.i(1612);
    this.sCb = true;
    al.d(new b.2(this));
    AppMethodBeat.o(1612);
  }

  public final void fQ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1617);
    this.sBH.runOnUiThread(new b.3(this, paramInt1, paramInt2));
    AppMethodBeat.o(1617);
  }

  public final void fR(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1603);
    an.l("", 0, 0, paramInt1);
    String str = com.tencent.mm.plugin.websearch.api.aa.HP(paramInt1);
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("topStoryScene", String.valueOf(this.cPu.scene));
      localHashMap.put("deviceName", URLEncoder.encode(com.tencent.mm.protocal.d.DEVICE_NAME, "utf8"));
      localHashMap.put("deviceBrand", URLEncoder.encode(Build.BRAND, "utf8"));
      localHashMap.put("deviceModel", URLEncoder.encode(Build.MODEL, "utf8"));
      localHashMap.put("from", URLEncoder.encode(this.sBH.getString(2131304085), "utf8"));
      g.RN();
      localHashMap.put("uin", com.tencent.mm.kernel.a.QG());
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localHashMap.put("timeZone", URLEncoder.encode(bo.dpA(), "utf8"));
      localHashMap.put("ostype", com.tencent.mm.protocal.d.vxk);
      localHashMap.put("subScene", String.valueOf(paramInt2));
      localHashMap.put("extInfo", ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFg());
      label232: ((j)g.K(j.class)).a(this.sBH, paramInt1, "", str, localHashMap, this.sBH.getResources().getString(2131304101), this.sBH.getResources().getColor(2131689495));
      AppMethodBeat.o(1603);
      return;
    }
    catch (Exception localException)
    {
      break label232;
    }
  }

  protected final void onBackBtnClick()
  {
    AppMethodBeat.i(1606);
    if (this.sBS)
    {
      cFD();
      AppMethodBeat.o(1606);
    }
    while (true)
    {
      return;
      if (this.sCb)
        com.tencent.mm.plugin.topstory.a.h.a(this.cPu, "uiBackBtnClick", System.currentTimeMillis());
      while (true)
      {
        an.Il(19);
        if (!this.sBI)
          break label134;
        this.sBH.finish();
        AppMethodBeat.o(1606);
        break;
        if (this.sCa)
        {
          if (this.sCc)
            com.tencent.mm.plugin.topstory.a.h.a(this.cPu, "uiBackBtnClickWithoutH5Ready", System.currentTimeMillis());
          else
            com.tencent.mm.plugin.topstory.a.h.a(this.cPu, "uiBackBtnClickWithoutDataReady", System.currentTimeMillis());
        }
        else
          com.tencent.mm.plugin.topstory.a.h.a(this.cPu, "uiBackBtnClickWithoutGetSearchData", System.currentTimeMillis());
      }
      label134: this.sBH.moveTaskToBack(true);
      AppMethodBeat.o(1606);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1602);
    ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "onCreate");
    this.sBH.getSupportActionBar().hide();
    this.cPu = new chn();
    TextView localTextView;
    View localView1;
    try
    {
      this.cPu.parseFrom(this.sBH.getIntent().getByteArrayExtra("key_context"));
      if (!bo.isNullOrNil(this.cPu.xgj))
      {
        ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "Create HomeContext Success %s", new Object[] { this.cPu.xgj });
        this.sBO = com.tencent.mm.plugin.topstory.ui.c.abB(this.sBH.getIntent().getStringExtra("key_tabconfig"));
        if (!this.sBO.isEmpty())
          ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().a(this.sCe);
        this.sCd.dnU();
        g.RO().a(this.fyJ);
        ((com.tencent.mm.plugin.topstory.ui.a)g.M(com.tencent.mm.plugin.topstory.ui.a.class)).setHaokanEventListener(new b.1(this));
        an.Il(17);
        this.sBV = LayoutInflater.from(this.sBH).inflate(2130970953, null);
        this.raJ = ((FrameLayout)this.sBV.findViewById(2131828327));
        if (((com.tencent.mm.plugin.topstory.ui.a)g.M(com.tencent.mm.plugin.topstory.ui.a.class)).getWebViewMgr() == null)
          break label821;
        if (!((com.tencent.mm.plugin.topstory.ui.a)g.M(com.tencent.mm.plugin.topstory.ui.a.class)).getWebViewMgr().sDf)
          ((com.tencent.mm.plugin.topstory.ui.a)g.M(com.tencent.mm.plugin.topstory.ui.a.class)).getWebViewMgr().a(this.cPu, true);
        ((com.tencent.mm.plugin.topstory.ui.a)g.M(com.tencent.mm.plugin.topstory.ui.a.class)).getWebViewMgr().b(this);
        this.sBM = this.sBV.findViewById(2131828328);
        this.iNB = ((ThreeDotsLoadingView)this.sBV.findViewById(2131821325));
        if ((Build.VERSION.SDK_INT >= 21) && (!com.tencent.mm.sdk.h.b.Mt()))
        {
          this.sBH.getWindow().setStatusBarColor(this.sBH.getResources().getColor(2131689495));
          this.sBH.dxW();
        }
        localTextView = (TextView)this.sBH.findViewById(2131828318);
        localView1 = this.sBH.findViewById(2131820973);
        View localView2 = this.sBH.findViewById(2131828321);
        this.sBP = this.sBH.findViewById(2131828322);
        paramBundle = this.sBH.findViewById(2131828315);
        this.sBN = this.sBH.findViewById(2131828316);
        this.sBU = ((TopStoryViewPager)this.sBH.findViewById(2131828317));
        this.sBT = ((LinearLayout)this.sBH.findViewById(2131828314));
        if (this.sBO.isEmpty())
          break label1314;
        localTabLayout = (TabLayout)this.sBH.findViewById(2131828320);
        localIterator = this.sBO.iterator();
        while (true)
        {
          if (!localIterator.hasNext())
            break label886;
          localb = (c.b)localIterator.next();
          localb.sBy = localTabLayout.cp();
          localb.sBy.aj(2130970952);
          localb.gne = ((TextView)localb.sBy.sQ.findViewById(2131828323));
          localb.sBz = localb.sBy.sQ.findViewById(2131828326);
          localb.sBA = ((TextView)localb.sBy.sQ.findViewById(2131828324));
          localb.sBB = localb.sBy.sQ.findViewById(2131828325);
          localb.gne.setText(localb.cEh);
          if (localb.sBv <= 0)
            break;
          paramBundle = localb.sBv;
          if (localb.sBv > 99)
            paramBundle = "99+";
          localb.sBA.setText(paramBundle);
          localb.sBA.setVisibility(0);
          localb.sBB.setVisibility(8);
          localTabLayout.a(localb.sBy, false);
        }
      }
    }
    catch (Exception localException)
    {
      TabLayout localTabLayout;
      while (true)
      {
        c.b localb;
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryUIComponentImpl", localException, "initData use intent", new Object[0]);
        if (paramBundle != null)
        {
          try
          {
            this.cPu.parseFrom(paramBundle.getByteArray("key_context"));
          }
          catch (IOException paramBundle)
          {
            ab.printErrStackTrace("MicroMsg.TopStory.TopStoryUIComponentImpl", paramBundle, "initData use savedInstanceState", new Object[0]);
          }
          continue;
          ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "Create HomeContext Fail");
          this.sBH.finish();
          continue;
          label821: paramBundle = new d();
          paramBundle.a(this.cPu, true);
          paramBundle.b(this);
          continue;
          if (localb.sBu > 0)
          {
            localb.sBA.setText("");
            localb.sBA.setVisibility(4);
            localb.sBB.setVisibility(0);
          }
        }
      }
      label886: localTabLayout.a(new b.12(this));
      this.sBU.setVisibility(0);
      for (int i = 0; i < this.sBO.size(); i++)
      {
        paramBundle = new b.a();
        paramBundle.sCu = LayoutInflater.from(this.sBH).inflate(2130970949, null);
        paramBundle.sCw = ((ImageView)paramBundle.sCu.findViewById(2131828313));
        paramBundle.sCv = ((FrameLayout)paramBundle.sCu.findViewById(2131828312));
        this.rsl.add(paramBundle);
      }
      this.sBU.setAdapter(new b.13(this));
      this.sBU.addOnPageChangeListener(new b.14(this, localTabLayout));
      this.sBK.zNv = new MMWebView.d()
      {
        public final void onWebViewScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
        {
          AppMethodBeat.i(1599);
          ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "onWebViewScrollChanged %s,   %s", new Object[] { Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt4) });
          b.a locala = (b.a)b.this.rsl.get(b.this.sBW);
          locala.sCx -= 1;
          AppMethodBeat.o(1599);
        }
      };
      i = this.sBH.getIntent().getIntExtra("key_chosetab", 0);
      Iterator localIterator = this.sBO.iterator();
      while (localIterator.hasNext())
      {
        paramBundle = (c.b)localIterator.next();
        if (paramBundle.category == i)
          paramBundle.sBy.select();
      }
      if (localTabLayout.getSelectedTabPosition() < 0)
        localTabLayout.ac(0).select();
      localTextView.setText("");
      paramBundle = com.tencent.mm.sdk.platformtools.aa.dor();
      if ((!paramBundle.equals("zh_TW")) && (!paramBundle.equals("zh_HK")) && (!paramBundle.equals("zh_CN")))
        this.sBH.findViewById(2131828319).setVisibility(8);
    }
    localView1.setOnClickListener(new b.10(this));
    ((ImageView)this.sBH.findViewById(2131820974)).getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    this.iNB.dKS();
    if (cFE())
    {
      paramBundle = ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFe();
      if (bo.isNullOrNil(paramBundle))
      {
        this.sBP.setVisibility(8);
        label1275: localException.setVisibility(0);
        localException.setOnClickListener(new b.11(this));
      }
    }
    while (true)
    {
      com.tencent.mm.plugin.topstory.ui.c.c(this.cPu, "uiOnCreate", System.currentTimeMillis());
      AppMethodBeat.o(1602);
      return;
      label1314: this.sBU.setVisibility(8);
      this.sBT.addView(this.sBV, -1, -1);
      localTextView.setText(this.cPu.xgm);
      localTextView.setTextColor(-16777216);
      paramBundle.setOnClickListener(new b.9(this));
      break;
      av(paramBundle, ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFf());
      break label1275;
      localException.setVisibility(8);
    }
  }

  protected final void onDestroy()
  {
    AppMethodBeat.i(1610);
    try
    {
      if ((this.cPu.cdf == 100) && (this.sBL != null))
        com.tencent.mm.plugin.topstory.ui.webview.a.a(this.sBL, "onWebCommendLeaveFromFindPage", "");
      if ((this.sBK.getParent() != null) && (this.sBK.getParent().equals(this.raJ)))
      {
        ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "webViewContainer remove topstoryWebview");
        this.raJ.removeView(this.sBK);
      }
      label84: if (this.sBK != null)
        this.sBK.onDestroy();
      Object localObject = this.cPu;
      long l = this.sBH.dyi();
      if (l > 0L)
      {
        localObject = String.format("%s,%s,%s,%s", new Object[] { Integer.valueOf(((chn)localObject).scene), Long.valueOf(l), Integer.valueOf(((chn)localObject).cdf), Integer.valueOf(((chn)localObject).xgl) });
        ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomePageBrowseTime 15018 %s", new Object[] { localObject });
        com.tencent.mm.plugin.report.service.h.pYm.X(15018, (String)localObject);
      }
      com.tencent.mm.plugin.topstory.a.h.a(this.cPu, "uiOnDestroy", System.currentTimeMillis());
      an.Il(18);
      localObject = this.sBJ;
      ((com.tencent.mm.plugin.topstory.ui.webview.c)localObject).sHt = null;
      ((com.tencent.mm.plugin.topstory.ui.webview.c)localObject).sHv = null;
      g.Rg().b(1943, (f)localObject);
      g.Rg().b(2582, ((com.tencent.mm.plugin.topstory.ui.webview.c)localObject).sHA);
      g.Rg().b(2802, ((com.tencent.mm.plugin.topstory.ui.webview.c)localObject).sEu);
      g.Rg().b(2906, ((com.tencent.mm.plugin.topstory.ui.webview.c)localObject).sHz);
      this.sCd.dead();
      g.RO().b(this.fyJ);
      ((com.tencent.mm.plugin.topstory.ui.a)g.M(com.tencent.mm.plugin.topstory.ui.a.class)).setHaokanEventListener(null);
      ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().b(this.sCe);
      AppMethodBeat.o(1610);
      return;
    }
    catch (Exception localException)
    {
      break label84;
    }
  }

  protected final void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(1611);
    chn localchn = new chn();
    try
    {
      localchn.parseFrom(paramIntent.getByteArrayExtra("key_context"));
      this.cPu.cvF = localchn.cvF;
      this.cPu.cIy = localchn.cIy;
      this.cPu.scene = localchn.scene;
      this.cPu.nQB = localchn.nQB;
      this.cPu.xgn = com.tencent.mm.plugin.websearch.api.aa.bVP();
      com.tencent.mm.plugin.topstory.a.h.a(this.cPu, "uiOnNewIntent", System.currentTimeMillis());
      an.Il(20);
      this.sBL.abN("onNewIntent");
      AppMethodBeat.o(1611);
      return;
    }
    catch (Exception paramIntent)
    {
      while (true)
        this.sBH.finish();
    }
  }

  protected final void onPause()
  {
    AppMethodBeat.i(1609);
    com.tencent.mm.plugin.topstory.a.h.a(this.cPu, "uiOnPause", System.currentTimeMillis());
    this.sBL.abN("onPause");
    if (this.sBK != null)
      this.sBK.onPause();
    this.cAY = true;
    AppMethodBeat.o(1609);
  }

  protected final void onResume()
  {
    AppMethodBeat.i(1608);
    com.tencent.mm.plugin.topstory.a.h.a(this.cPu, "uiOnResume", System.currentTimeMillis());
    this.sBL.abN("onResume");
    if (this.sBK != null)
      this.sBK.onResume();
    com.tencent.mm.cj.c.atF("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    Iterator localIterator = this.sBO.iterator();
    while (localIterator.hasNext())
    {
      c.b localb = (c.b)localIterator.next();
      if (localb.sBv > 0)
      {
        if (localb.category == 110)
          an.a(((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEW(), 107, 2, localb.sBv, 0L, "");
      }
      else if (localb.sBu > 0)
        if (localb.category == 110)
        {
          an.a(((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEP(), 107, 1, 0, 0L, "");
        }
        else if (localb.category == 100)
        {
          cht localcht = new cht();
          localcht.cJb = localb.sBw;
          an.a(localcht, 107, 3, 0, 0L, "");
        }
    }
    this.cAY = false;
    this.sBY = false;
    AppMethodBeat.o(1608);
  }

  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(1621);
    try
    {
      paramBundle.putByteArray("key_context", this.cPu.toByteArray());
      ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "onSaveInstanceState %s", new Object[] { this.cPu.xgj });
      AppMethodBeat.o(1621);
      return;
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryUIComponentImpl", paramBundle, "onSaveInstanceState", new Object[0]);
        AppMethodBeat.o(1621);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b
 * JD-Core Version:    0.6.2
 */