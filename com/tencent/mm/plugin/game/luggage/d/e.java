package com.tencent.mm.plugin.game.luggage.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.game.d.dd;
import com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI;
import com.tencent.mm.plugin.game.luggage.b.1;
import com.tencent.mm.plugin.webview.ui.tools.game.c.a;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton;
import com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class e extends com.tencent.mm.plugin.webview.luggage.d
{
  public boolean mTI;
  protected GameWebPerformanceInfo mUN;
  private View mUV;
  private GameMenuImageButton mUW;
  private String mUX;
  public com.tencent.mm.plugin.webview.ui.tools.game.c mUY;
  private long mUZ;
  private boolean mVa;
  private boolean mVb;
  private com.tencent.mm.plugin.webview.ui.tools.game.g mVc;

  public e(com.tencent.luggage.d.g paramg, com.tencent.luggage.d.k paramk, Bundle paramBundle)
  {
    super(paramg, paramk, paramBundle);
    AppMethodBeat.i(135968);
    this.mTI = false;
    this.mUY = new e.1(this);
    ab.i("MicroMsg.GameWebPage", "initWebPageEnd, __Time__， time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    paramg = paramBundle.getString("rawUrl");
    this.mUN = GameWebPerformanceInfo.kU(paramg);
    this.mUN.eBJ = bDI();
    this.mUN.eCc = System.currentTimeMillis();
    this.mVc = NR(paramg);
    AppMethodBeat.o(135968);
  }

  private void n(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(135990);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.GameWebPage", "fullUrl is null, return");
      AppMethodBeat.o(135990);
    }
    while (true)
    {
      return;
      this.mHandler.post(new e.4(this, paramMap, paramString));
      AppMethodBeat.o(135990);
    }
  }

  public final void NN(String paramString)
  {
    AppMethodBeat.i(135988);
    super.NN(paramString);
    if (this.mVc.uDO == 0L)
      this.mVc.uDO = System.currentTimeMillis();
    AppMethodBeat.o(135988);
  }

  public final boolean NQ(String paramString)
  {
    AppMethodBeat.i(135981);
    boolean bool = ((d)this.uhQ).NQ(paramString);
    AppMethodBeat.o(135981);
    return bool;
  }

  protected com.tencent.mm.plugin.webview.ui.tools.game.g NR(String paramString)
  {
    AppMethodBeat.i(135971);
    paramString = com.tencent.mm.plugin.webview.ui.tools.game.g.agh(paramString);
    AppMethodBeat.o(135971);
    return paramString;
  }

  public boolean NS(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(135972);
    if ((NQ(paramString)) && (com.tencent.mm.plugin.game.luggage.b.bDp()))
    {
      ab.i("MicroMsg.GameWebPage", "isWePkg and has valid cache");
      if (this.mUN.eCh == 0L)
        this.mUN.eBO = 1;
      this.mVb = true;
      AppMethodBeat.o(135972);
    }
    while (true)
    {
      return bool;
      this.mVb = false;
      if ((paramString.equals(cWL())) && (this.mUN.eCh == 0L))
      {
        this.mUN.eCh = System.currentTimeMillis();
        ab.i("MicroMsg.GameWebPage", "startGetA8Key, url: %s, time: %d", new Object[] { paramString, Long.valueOf(this.mUN.eCh) });
      }
      bool = super.NS(paramString);
      AppMethodBeat.o(135972);
    }
  }

  public final void NT(String paramString)
  {
    AppMethodBeat.i(135985);
    super.NT(paramString);
    if (this.mUN.eCe == 0L)
      this.mUN.eCe = System.currentTimeMillis();
    AppMethodBeat.o(135985);
  }

  public final View bDD()
  {
    AppMethodBeat.i(135970);
    this.uhT = new c(this);
    com.tencent.mm.plugin.webview.luggage.k localk = this.uhT;
    AppMethodBeat.o(135970);
    return localk;
  }

  public final void bDE()
  {
    AppMethodBeat.i(135979);
    if (!this.uio)
    {
      this.uiq = this.bPP.getInt("customize_status_bar_color");
      if (this.uiq == 0)
        break label55;
      this.uir = this.bPP.getString("status_bar_style");
    }
    while (true)
    {
      bDF();
      AppMethodBeat.o(135979);
      return;
      label55: dd localdd = com.tencent.mm.plugin.game.commlib.a.bDg();
      if ((localdd != null) && (!bo.isNullOrNil(localdd.color)))
        try
        {
          this.uiq = Color.parseColor(localdd.color);
          if (this.uiq == 0)
            this.uiq = android.support.v4.content.b.i(this.mContext, 2131689639);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          while (true)
            ab.e("MicroMsg.GameWebPage", "parse color: " + localIllegalArgumentException.getMessage());
          this.uir = localdd.mYo;
        }
    }
  }

  public final void bDF()
  {
    AppMethodBeat.i(135980);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      this.mHandler.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(135965);
          e.this.bDF();
          AppMethodBeat.o(135965);
        }
      });
      AppMethodBeat.o(135980);
    }
    while (true)
    {
      return;
      if ((this.mContext instanceof LuggageGameWebViewUI))
      {
        if (((LuggageGameWebViewUI)this.mContext).W(this.uiq, bo.nullAsNil(this.uir).equals("black")))
        {
          cWE();
          AppMethodBeat.o(135980);
        }
        else
        {
          this.uiq = this.mContext.getResources().getColor(2131689913);
          this.uir = "";
          cWE();
          AppMethodBeat.o(135980);
        }
      }
      else if (com.tencent.mm.plugin.webview.luggage.c.a.a(this.mContext, this.uiq, this.uir))
      {
        cWE();
        AppMethodBeat.o(135980);
      }
      else
      {
        this.uiq = this.mContext.getResources().getColor(2131689913);
        this.uir = "";
        cWE();
        AppMethodBeat.o(135980);
      }
    }
  }

  public final void bDG()
  {
    AppMethodBeat.i(135983);
    this.mUV.setVisibility(8);
    AppMethodBeat.o(135983);
  }

  public final com.tencent.mm.plugin.wepkg.c bDH()
  {
    AppMethodBeat.i(135991);
    com.tencent.mm.plugin.wepkg.c localc = ((d)this.uhQ).getWePkgPlugin();
    AppMethodBeat.o(135991);
    return localc;
  }

  public final String bDI()
  {
    AppMethodBeat.i(135992);
    String str = (hashCode() & 0x7FFFFFFF) + "_" + (cWL().hashCode() & 0x7FFFFFFF);
    AppMethodBeat.o(135992);
    return str;
  }

  public void bDv()
  {
    AppMethodBeat.i(135982);
    this.mUV.setVisibility(0);
    AppMethodBeat.o(135982);
  }

  public final void bDy()
  {
    AppMethodBeat.i(135973);
    this.uhT.bDy();
    AppMethodBeat.o(135973);
  }

  public final void bE(String paramString)
  {
    AppMethodBeat.i(135986);
    long l = System.currentTimeMillis();
    ab.i("MicroMsg.GameWebPage", "onUrlLoadingStarted, url = %s, __Time__, time = %d", new Object[] { paramString, Long.valueOf(l) });
    super.bE(paramString);
    if (this.mUN.eCf == 0L)
      this.mUN.eCf = l;
    if (this.mVc.uDM == 0L)
      this.mVc.uDM = l;
    paramString = bo.anh(paramString);
    if ((this.mVb) || ((paramString != null) && (paramString.equals("game.weixin.qq.com"))));
    for (this.bPN.bPC = com.tencent.luggage.d.a.a.bPT; ; this.bPN.bPC = this.uik)
    {
      this.mUY.uDp.dbY();
      AppMethodBeat.o(135986);
      return;
    }
  }

  public void bF(String paramString)
  {
    AppMethodBeat.i(135987);
    long l = System.currentTimeMillis();
    ab.i("MicroMsg.GameWebPage", "onUrlLoadingFinished, url = %s, __Time__, time = %d", new Object[] { paramString, Long.valueOf(l) });
    super.bF(paramString);
    if (this.mUN.eCg == 0L)
      this.mUN.eCg = l;
    if (this.mVc.uDN == 0L)
      this.mVc.uDN = l;
    if (this.mVb)
    {
      paramString = this.bPN;
      if (paramString != null)
      {
        if (com.tencent.mm.plugin.game.luggage.b.mHeaders != null)
        {
          String str1 = "." + bo.anB(com.tencent.mm.plugin.game.luggage.b.mTH);
          String str2 = bo.anB(com.tencent.mm.plugin.game.luggage.b.mTH);
          com.tencent.xweb.c.jx(ah.getContext());
          com.tencent.xweb.b localb = com.tencent.xweb.b.dTR();
          Iterator localIterator = com.tencent.mm.plugin.game.luggage.b.mHeaders.keySet().iterator();
          while (localIterator.hasNext())
          {
            String str3 = (String)localIterator.next();
            localb.setCookie(str2, str3 + "=" + (String)com.tencent.mm.plugin.game.luggage.b.mHeaders.get(str3));
          }
          localb.setCookie(str2, "httponly");
          localb.setCookie(str1, "httponly");
          com.tencent.xweb.c.dTT();
          com.tencent.xweb.c.sync();
          ab.i("MicroMsg.LuggageGameUinKeyHolder", "cookies:%s", new Object[] { localb.getCookie(str2) });
          com.tencent.mm.plugin.game.luggage.b.mTI = true;
        }
        paramString.a(new b.1());
      }
    }
    while (true)
    {
      this.mUY.uDp.dbZ();
      AppMethodBeat.o(135987);
      return;
      if ((this.mVa) && (NQ(paramString)))
        n(this.mTH, this.uil);
    }
  }

  public void e(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(135989);
    super.e(paramString1, paramString2, paramMap);
    d locald = (d)this.bPN.xr();
    locald.mTH = paramString2;
    locald.mUG = paramMap;
    if (bo.isNullOrNil(paramString2))
      ab.i("MicroMsg.LuggageGameUinKeyHolder", "setFullUrlAndHeaders, fullUrl is null");
    while (true)
    {
      long l = System.currentTimeMillis();
      if (paramString1.equals(cWL()))
      {
        ab.i("MicroMsg.GameWebPage", "getA8Key end, __Time__, time: %d", new Object[] { Long.valueOf(l) });
        this.mUN.eCi = l;
      }
      if (this.mUN.eCe == 0L)
        this.mUN.eCe = l;
      if (this.mVc.uDP == 0L)
        this.mVc.uDP = System.currentTimeMillis();
      if (NQ(paramString1))
        n(paramString2, paramMap);
      AppMethodBeat.o(135989);
      return;
      if (!Uri.parse(paramString2).getHost().equals("game.weixin.qq.com"))
      {
        ab.i("MicroMsg.LuggageGameUinKeyHolder", "setFullUrlAndHeaders, host is not wxgame");
      }
      else
      {
        com.tencent.mm.plugin.game.luggage.b.mTH = paramString2;
        com.tencent.mm.plugin.game.luggage.b.mHeaders = paramMap;
        com.tencent.mm.plugin.game.luggage.b.JQ = System.currentTimeMillis() / 1000L;
      }
    }
  }

  public void g(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(135984);
    ab.i("MicroMsg.GameWebPage", "load url, __Time__, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    if (this.mVc.uDL == 0L)
      this.mVc.uDL = System.currentTimeMillis();
    super.g(paramString, paramBundle);
    AppMethodBeat.o(135984);
  }

  public void hK(boolean paramBoolean)
  {
    AppMethodBeat.i(135978);
    super.hK(paramBoolean);
    if (isFullScreen())
    {
      this.mUX = this.bPP.getString("game_hv_menu_appid");
      if (!bo.isNullOrNil(this.mUX))
      {
        if (this.mUW == null)
        {
          this.mUW = new GameMenuImageButton(this.mContext);
          this.mUW.a(this.odV, new e.2(this));
        }
        this.uhZ.setVisibility(8);
        AppMethodBeat.o(135978);
      }
    }
    while (true)
    {
      return;
      this.uhZ.setVisibility(0);
      AppMethodBeat.o(135978);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(135976);
    ab.i("MicroMsg.GameWebPage", "onDestroy, __Time__, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    super.onDestroy();
    com.tencent.mm.plugin.webview.ui.tools.game.c.a(this.mUY.uDp.uDq);
    Object localObject = this.mUN;
    ((GameWebPerformanceInfo)localObject).eCj += System.currentTimeMillis() - this.mUZ;
    this.mUN.eCk = System.currentTimeMillis();
    if (!this.bPP.getBoolean("from_bag", false))
    {
      localObject = com.tencent.mm.game.report.api.c.eBG;
      if (localObject != null)
        ((com.tencent.mm.game.report.api.c)localObject).a(this.mUN);
      com.tencent.mm.plugin.webview.ui.tools.game.e.agf(cWL());
    }
    GameWebPerformanceInfo.kW(cWL());
    com.tencent.mm.plugin.webview.ui.tools.game.g.agi(cWL());
    AppMethodBeat.o(135976);
  }

  public final void reload()
  {
    AppMethodBeat.i(135977);
    this.mVa = true;
    super.reload();
    AppMethodBeat.o(135977);
  }

  public final boolean wD(int paramInt)
  {
    AppMethodBeat.i(135993);
    boolean bool;
    if (this.bPN.xp() == com.tencent.luggage.d.a.a.bPT)
    {
      bool = true;
      AppMethodBeat.o(135993);
    }
    while (true)
    {
      return bool;
      if (this.bPN.xp() == com.tencent.luggage.d.a.a.bPU)
      {
        bool = false;
        AppMethodBeat.o(135993);
      }
      else
      {
        bool = super.wD(paramInt);
        AppMethodBeat.o(135993);
      }
    }
  }

  public View wR()
  {
    AppMethodBeat.i(135969);
    View localView = super.wR();
    this.mUV = LayoutInflater.from(this.mContext).inflate(2130969744, this.uia, false);
    this.mUV.setVisibility(8);
    this.uia.addView(this.mUV, new FrameLayout.LayoutParams(-2, -2, 17));
    ab.i("MicroMsg.GameWebPage", "create vie end, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    AppMethodBeat.o(135969);
    return localView;
  }

  public void wU()
  {
    AppMethodBeat.i(135974);
    ab.i("MicroMsg.GameWebPage", "onForeground, __Time__, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    if (this.mUN.eCa == 0L)
      this.mUN.eCa = System.currentTimeMillis();
    this.mUZ = System.currentTimeMillis();
    this.mUY.uDp.onResume();
    super.wU();
    AppMethodBeat.o(135974);
  }

  public final void wW()
  {
    AppMethodBeat.i(135975);
    ab.i("MicroMsg.GameWebPage", "onBackground, __Time__, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    GameWebPerformanceInfo localGameWebPerformanceInfo = this.mUN;
    localGameWebPerformanceInfo.eCj += System.currentTimeMillis() - this.mUZ;
    this.mUZ = System.currentTimeMillis();
    this.mUY.uDp.onPause();
    int i = this.bPe.xh().indexOf(this);
    if ((i > 1) && (((com.tencent.luggage.d.e)this.bPe.xh().get(i - 1) instanceof a)))
      AppMethodBeat.o(135975);
    while (true)
    {
      return;
      super.wW();
      AppMethodBeat.o(135975);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.e
 * JD-Core Version:    0.6.2
 */