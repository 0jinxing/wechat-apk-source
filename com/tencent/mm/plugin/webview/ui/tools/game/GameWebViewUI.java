package com.tencent.mm.plugin.webview.ui.tools.game;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.content.b;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.game.d.dd;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.w;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton;
import com.tencent.mm.plugin.webview.ui.tools.j;
import com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GameWebViewUI extends GameBaseWebViewUI
{
  private static String uDU = "wx_fullscreen";
  private boolean mTC;
  public GameWebPerformanceInfo mUN;
  private ViewGroup mUO;
  private boolean mUP;
  private Object mUQ;
  private long mUZ;
  public g mVc;
  private boolean uDT;
  private HashMap<String, String> uDV;
  private Drawable uDW;
  private Drawable uDX;
  private String uDY;
  private Map<Integer, bbb> uDZ;
  public com.tencent.mm.plugin.wepkg.c uDe;
  private String uEa;
  private GameMenuImageButton uEb;
  private boolean uEc;
  private boolean uEd;
  private boolean uEe;
  private boolean uEf;
  private boolean uEg;

  public GameWebViewUI()
  {
    AppMethodBeat.i(8740);
    this.mTC = false;
    this.uDT = false;
    this.uDV = new HashMap();
    this.uDY = null;
    this.uDZ = new HashMap();
    this.uEd = false;
    this.mUP = false;
    this.mUQ = new Object();
    this.uEf = false;
    this.uEg = false;
    AppMethodBeat.o(8740);
  }

  private com.tencent.mm.ui.base.l dca()
  {
    AppMethodBeat.i(8743);
    com.tencent.mm.ui.base.l locall;
    try
    {
      List localList = com.tencent.mm.plugin.webview.ui.tools.game.menu.a.uEt;
      Object localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      ((Bundle)localObject).putString("game_hv_menu_appid", this.uEa);
      this.uDZ.clear();
      localObject = localList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        bbb localbbb = (bbb)((Iterator)localObject).next();
        this.uDZ.put(Integer.valueOf(localbbb.wFQ), localbbb);
      }
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.Wepkg.GameWebViewUI", "get cache hv game menu fail! exception:%s", new Object[] { localException.getMessage() });
      locall = null;
      AppMethodBeat.o(8743);
    }
    while (true)
    {
      return locall;
      locall = com.tencent.mm.plugin.webview.ui.tools.game.menu.c.c(this, locall);
      AppMethodBeat.o(8743);
    }
  }

  private void dcb()
  {
    AppMethodBeat.i(8762);
    if (this.uuY != null)
      this.uuY.setVisibility(0);
    AppMethodBeat.o(8762);
  }

  private void dcc()
  {
    AppMethodBeat.i(8764);
    this.uEf = false;
    this.uEg = false;
    al.n(new GameWebViewUI.7(this), 100L);
    AppMethodBeat.o(8764);
  }

  public final void aBS()
  {
    AppMethodBeat.i(8759);
    if (Build.VERSION.SDK_INT > 10)
      if (getForceOrientation() == -1)
      {
        this.ylk = getSharedPreferences(ah.doA(), 4).getBoolean("settings_landscape_mode", false);
        if (this.ylk)
        {
          setRequestedOrientation(2);
          AppMethodBeat.o(8759);
        }
      }
    while (true)
    {
      return;
      setRequestedOrientation(1);
      AppMethodBeat.o(8759);
      continue;
      setRequestedOrientation(getForceOrientation());
      AppMethodBeat.o(8759);
      continue;
      super.aBS();
      AppMethodBeat.o(8759);
    }
  }

  public final void aMh()
  {
    AppMethodBeat.i(8748);
    super.aMh();
    this.uEc = true;
    int i;
    if ((this.mTC) || (this.nft != null) || (this.nfs != 0))
      i = 0;
    while (true)
    {
      Object localObject1;
      if (i != 0)
      {
        localObject1 = com.tencent.mm.plugin.game.commlib.a.bDg();
        if ((localObject1 == null) || (bo.isNullOrNil(((dd)localObject1).color)));
      }
      try
      {
        this.nfs = Color.parseColor(((dd)localObject1).color);
        this.nft = ((dd)localObject1).mYo;
        dad();
        nO(true);
        localObject1 = getIntent();
        if ((localObject1 != null) && (((Intent)localObject1).getBooleanExtra("game_check_float", false)))
        {
          i = ((Intent)localObject1).getIntExtra("game_sourceScene", 0);
          this.uDY = ((Intent)localObject1).getStringExtra("game_transparent_float_url");
          if (bo.isNullOrNil(this.uDY))
          {
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("game_check_float", true);
            ((Intent)localObject1).putExtra("game_sourceScene", i);
            com.tencent.mm.bp.d.b(this, "game", ".ui.GameCenterUI", (Intent)localObject1);
            AppMethodBeat.o(8748);
            return;
            i = 1;
          }
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
        {
          ab.e("MicroMsg.Wepkg.GameWebViewUI", "parse color: " + localIllegalArgumentException.getMessage());
          continue;
          try
          {
            localObject1 = new android/os/Bundle;
            ((Bundle)localObject1).<init>();
            ((Bundle)localObject1).putInt("game_sourceScene", i);
            if (this.icy != null)
              this.icy.g(91, (Bundle)localObject1);
            if (this.uCU == null)
            {
              localObject1 = new com/tencent/mm/plugin/webview/ui/tools/game/a;
              ((a)localObject1).<init>(this, this.uvd, this.uDY);
              this.uCU = ((a)localObject1);
            }
            localObject1 = this.uCU;
            String str = this.uDY;
            ((a)localObject1).mUH = str;
            ((a)localObject1).uDe.bO(str, false);
            Object localObject2;
            if ((((a)localObject1).fow != null) && (((a)localObject1).fow.getParent() == null))
            {
              localObject2 = new android/view/ViewGroup$LayoutParams;
              ((ViewGroup.LayoutParams)localObject2).<init>(-1, -1);
              ((a)localObject1).SW.addView(((a)localObject1).fow, (ViewGroup.LayoutParams)localObject2);
            }
            if ((((a)localObject1).fow != null) && (((a)localObject1).uDf != null))
            {
              localObject2 = ((a)localObject1).fow;
              a.3 local3 = new com/tencent/mm/plugin/webview/ui/tools/game/a$3;
              local3.<init>((a)localObject1, str);
              ((MMWebView)localObject2).post(local3);
            }
            this.uDY = null;
            AppMethodBeat.o(8748);
          }
          catch (RemoteException localRemoteException)
          {
          }
          AppMethodBeat.o(8748);
        }
      }
    }
  }

  public boolean aYc()
  {
    AppMethodBeat.i(8763);
    getIntent().putExtra("minimize_secene", 2);
    AppMethodBeat.o(8763);
    return true;
  }

  public final void ac(Bundle paramBundle)
  {
    AppMethodBeat.i(8747);
    super.ac(paramBundle);
    AppMethodBeat.o(8747);
  }

  public final void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    AppMethodBeat.i(8750);
    if (this.uEc)
      super.addIconOptionMenu(paramInt1, paramInt2, paramOnMenuItemClickListener);
    AppMethodBeat.o(8750);
  }

  public final boolean afI(String paramString)
  {
    AppMethodBeat.i(8757);
    boolean bool = this.uDe.ahB(paramString);
    AppMethodBeat.o(8757);
    return bool;
  }

  public final WebViewUI.w as(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(8760);
    if (this.mUN.eCh == 0L)
      this.mUN.eCh = System.currentTimeMillis();
    if (this.mVc.uDO == 0L)
      this.mVc.uDO = System.currentTimeMillis();
    paramString = super.as(paramString, paramBoolean);
    AppMethodBeat.o(8760);
    return paramString;
  }

  public final void b(String paramString, Map<String, String> paramMap, boolean paramBoolean)
  {
    AppMethodBeat.i(8758);
    if (this.mUN.eCe == 0L)
      this.mUN.eCe = System.currentTimeMillis();
    if (this.uDe.dgi())
    {
      super.b(paramString, paramMap, false);
      AppMethodBeat.o(8758);
    }
    while (true)
    {
      return;
      super.b(paramString, paramMap, paramBoolean);
      AppMethodBeat.o(8758);
    }
  }

  public final int cWF()
  {
    AppMethodBeat.i(8746);
    int i = super.cWF();
    AppMethodBeat.o(8746);
    return i;
  }

  public final void cZM()
  {
    AppMethodBeat.i(8744);
    if (this.uwI.utH)
      this.uwI.cZL();
    if ((this.uEb == null) || (!this.uEb.uEu))
    {
      super.cZM();
      AppMethodBeat.o(8744);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.webview.ui.tools.game.menu.d locald = new com.tencent.mm.plugin.webview.ui.tools.game.menu.d(this.mController.ylL);
      locald.a(new GameWebViewUI.2(this));
      locald.uEJ = new GameWebViewUI.3(this);
      if (this.uvf)
        locald.uEO = true;
      for (locald.uEP = true; ; locald.uEP = false)
      {
        if ((this.uvj == null) || (!this.uvj.isShown()))
          break label168;
        this.uvj.hide();
        al.n(new GameWebViewUI.4(this, locald), 100L);
        AppMethodBeat.o(8744);
        break;
        locald.uEO = false;
      }
      label168: aqX();
      al.n(new GameWebViewUI.5(this, locald), 100L);
      AppMethodBeat.o(8744);
    }
  }

  public final void dE(String paramString, int paramInt)
  {
    AppMethodBeat.i(8745);
    super.dE(paramString, paramInt);
    AppMethodBeat.o(8745);
  }

  public final void dak()
  {
    AppMethodBeat.i(8756);
    super.dak();
    this.uEa = getIntent().getStringExtra("game_hv_menu_appid");
    if ((this.uvf) && (!bo.isNullOrNil(this.uEa)))
    {
      if (this.uve != null)
        this.uve.setVisibility(8);
      this.uEb.a(this.uvc, new GameWebViewUI.6(this));
    }
    AppMethodBeat.o(8756);
  }

  public final com.tencent.xweb.l dal()
  {
    try
    {
      AppMethodBeat.i(8742);
      if (this.uvO == null)
      {
        localObject1 = new com/tencent/mm/plugin/webview/ui/tools/game/GameWebViewUI$b;
        ((GameWebViewUI.b)localObject1).<init>(this);
        this.uvO = ((com.tencent.xweb.l)localObject1);
      }
      Object localObject1 = this.uvO;
      AppMethodBeat.o(8742);
      return localObject1;
    }
    finally
    {
    }
  }

  public final void daw()
  {
    AppMethodBeat.i(8761);
    if (this.mUN.eCi == 0L)
      this.mUN.eCi = System.currentTimeMillis();
    if (this.mVc.uDP == 0L)
      this.mVc.uDP = System.currentTimeMillis();
    this.uEf = true;
    if (this.uEg)
      dcc();
    AppMethodBeat.o(8761);
  }

  public final int getLayoutId()
  {
    AppMethodBeat.i(8754);
    this.mUN.eCb = System.currentTimeMillis();
    int i = super.getLayoutId();
    AppMethodBeat.o(8754);
    return i;
  }

  public void initView()
  {
    AppMethodBeat.i(8755);
    super.initView();
    this.uDW = new ColorDrawable(b.i(this, 2131689644));
    this.uDX = new ColorDrawable(b.i(this, 2131689644));
    this.mUN.eCc = System.currentTimeMillis();
    this.mVc.uDL = System.currentTimeMillis();
    AppMethodBeat.o(8755);
  }

  public final void nO(boolean paramBoolean)
  {
    AppMethodBeat.i(8749);
    super.nO(paramBoolean);
    nR(false);
    AppMethodBeat.o(8749);
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(8741);
    String str = getIntent().getStringExtra("rawUrl");
    ab.i("MicroMsg.Wepkg.GameWebViewUI", "rawUrl rid:%s, pkgId:%s", new Object[] { com.tencent.mm.plugin.wepkg.utils.d.aif(str), com.tencent.mm.plugin.wepkg.utils.d.aid(str) });
    if (getIntent().getLongExtra("gamecenterui_createtime", 0L) > 0L);
    for (this.mUN = GameWebPerformanceInfo.kU(str); ; this.mUN = GameWebPerformanceInfo.kV(str))
    {
      this.mUN.url = str;
      this.mUN.eBJ = ((hashCode() & 0x7FFFFFFF) + "_" + (cWL().hashCode() & 0x7FFFFFFF));
      this.mUN.eBT = getIntent().getLongExtra("gamecenterui_createtime", 0L);
      this.mUN.eBU = getIntent().getLongExtra("start_activity_time", System.currentTimeMillis());
      this.mUN.startTime = getIntent().getLongExtra("start_time", this.mUN.eBU);
      this.mUN.eBZ = System.currentTimeMillis();
      this.mUN.eBN = 1;
      ab.i("MicroMsg.Wepkg.GameWebViewUI", "onCreate, startTime: %d, gameCenterUICreate: %d, startWebUI: %d,webUICreate: %d", new Object[] { Long.valueOf(this.mUN.startTime), Long.valueOf(this.mUN.eBT), Long.valueOf(this.mUN.eBU), Long.valueOf(this.mUN.eBZ) });
      this.mVc = g.agg(str);
      this.mVc.startTime = System.currentTimeMillis();
      super.onCreate(paramBundle);
      paramBundle = getIntent();
      if ((paramBundle != null) && (paramBundle.getBooleanExtra("disable_progress_bar", false)))
      {
        this.uuX.iUj = false;
        dcb();
      }
      this.pzf.setWebViewClient(new GameWebViewUI.c(this, (byte)0));
      if (this.pzf.getIsX5Kernel())
        this.pzf.setWebViewClientExtension(new GameWebViewUI.a(this, this));
      this.uDe = new com.tencent.mm.plugin.wepkg.c();
      this.uDe.uVC = new GameWebViewUI.1(this, str);
      this.uEe = getIntent().getBooleanExtra("open_game_float", false);
      paramBundle = this.uDe;
      if (!this.uEe)
        bool = true;
      if (paramBundle.bO(str, bool))
      {
        ab.i("MicroMsg.Wepkg.GameWebViewUI", "current page use wepkg");
        this.uEd = true;
        dcb();
      }
      this.uEb = new GameMenuImageButton(this.mController.ylL);
      AppMethodBeat.o(8741);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(8753);
    super.onDestroy();
    this.uDe.ot(this.uEe);
    this.mUN.eCk = System.currentTimeMillis();
    com.tencent.mm.game.report.api.c.eBG.a(this.mUN);
    GameWebPerformanceInfo.kW(cWL());
    e.agf(this.cOG);
    g.agi(this.cOG);
    AppMethodBeat.o(8753);
  }

  public void onPause()
  {
    AppMethodBeat.i(8752);
    super.onPause();
    GameWebPerformanceInfo localGameWebPerformanceInfo = this.mUN;
    localGameWebPerformanceInfo.eCj += System.currentTimeMillis() - this.mUZ;
    AppMethodBeat.o(8752);
  }

  public void onResume()
  {
    AppMethodBeat.i(8751);
    super.onResume();
    if (this.mUN.eCa == 0L)
    {
      long l = System.currentTimeMillis();
      ab.i("MicroMsg.Wepkg.GameWebViewUI", "onResume: ".concat(String.valueOf(l)));
      this.mUN.eCa = l;
    }
    this.mUZ = System.currentTimeMillis();
    AppMethodBeat.o(8751);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI
 * JD-Core Version:    0.6.2
 */