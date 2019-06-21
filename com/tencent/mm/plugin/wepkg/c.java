package com.tencent.mm.plugin.wepkg;

import android.os.Bundle;
import android.webkit.ConsoleMessage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.wepkg.model.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView;
import com.tencent.xweb.o;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
{
  private static final Pattern hnu;
  private long aIv;
  private ap che;
  private String mUH;
  private GameWebPerformanceInfo mUN;
  private String mXy;
  private boolean uVA;
  private boolean uVB;
  public com.tencent.mm.plugin.wepkg.event.b uVC;
  private boolean uVD;
  private Set<String> uVE;
  private long uVF;
  public boolean uVv;
  private f uVw;
  private WepkgVersion uVx;
  private com.tencent.mm.plugin.wepkg.event.a uVy;
  private com.tencent.mm.plugin.wepkg.model.d uVz;

  static
  {
    AppMethodBeat.i(63385);
    hnu = Pattern.compile(".*#.*wechat_redirect");
    AppMethodBeat.o(63385);
  }

  public c()
  {
    AppMethodBeat.i(63368);
    this.aIv = 0L;
    this.uVv = false;
    this.uVA = false;
    this.uVB = false;
    this.uVD = false;
    this.uVE = new HashSet();
    this.che = new ap(new c.3(this), false);
    b.dgd();
    this.uVz = new com.tencent.mm.plugin.wepkg.model.d();
    b.dge();
    this.uVy = new c.1(this);
    com.tencent.mm.plugin.wepkg.event.c.a(this.uVy);
    AppMethodBeat.o(63368);
  }

  private void b(WebView paramWebView, boolean paramBoolean)
  {
    AppMethodBeat.i(63376);
    ab.i("MicroMsg.Wepkg.WePkgPlugin", "useWepkg:".concat(String.valueOf(paramBoolean)));
    al.d(new c.2(this, paramWebView, paramBoolean));
    AppMethodBeat.o(63376);
  }

  public static String dgk()
  {
    AppMethodBeat.i(138664);
    String str = a.dgb();
    AppMethodBeat.o(138664);
    return str;
  }

  public final void a(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(63373);
    this.uVB = true;
    if (paramConsoleMessage != null);
    for (paramConsoleMessage = paramConsoleMessage.message(); ; paramConsoleMessage = null)
    {
      if ((!bo.isNullOrNil(paramConsoleMessage)) && (paramConsoleMessage.equalsIgnoreCase("weixin://whiteScreenEnd")))
      {
        ab.i("MicroMsg.Wepkg.WePkgPlugin", "mIsReceivedWhiteScreenEnd: true");
        this.uVA = true;
      }
      AppMethodBeat.o(63373);
      return;
    }
  }

  public final o ahA(String paramString)
  {
    AppMethodBeat.i(63374);
    ab.i("MicroMsg.Wepkg.WePkgPlugin", "onRequestIntercept, url: ".concat(String.valueOf(paramString)));
    String str = b.ahy(paramString);
    if (str != null)
    {
      ab.i("MicroMsg.Wepkg.WePkgPlugin", "onRequestIntercept, rid: ".concat(String.valueOf(str)));
      localo = a.ahu(str);
      if (localo != null)
      {
        AppMethodBeat.o(63374);
        paramString = localo;
        return paramString;
      }
      if (!str.equals(this.mXy))
        this.uVz.ahR(paramString);
    }
    if (this.uVv)
      if (this.uVw == null)
        break label176;
    label176: for (o localo = this.uVw.ahS(com.tencent.mm.plugin.wepkg.utils.d.aif(paramString)); ; localo = null)
    {
      if (localo != null)
      {
        if (this.uVx != null)
          com.tencent.mm.plugin.wepkg.utils.a.b("RequestHook", paramString, this.uVx.eBS, this.uVx.version, 1L, 0L, null);
        AppMethodBeat.o(63374);
        paramString = localo;
        break;
      }
      paramString = this.uVz.ahS(com.tencent.mm.plugin.wepkg.utils.d.aif(paramString));
      AppMethodBeat.o(63374);
      break;
    }
  }

  public final boolean ahB(String paramString)
  {
    AppMethodBeat.i(63378);
    boolean bool;
    if (hnu.matcher(bo.nullAsNil(paramString)).find())
    {
      bool = false;
      AppMethodBeat.o(63378);
    }
    while (true)
    {
      return bool;
      bool = this.uVv;
      AppMethodBeat.o(63378);
    }
  }

  public final boolean bO(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(63369);
    this.mUH = paramString;
    this.mXy = com.tencent.mm.plugin.wepkg.utils.d.aid(paramString);
    this.uVw = b.bN(paramString, paramBoolean);
    if ((this.uVw != null) && (this.uVw.uWY != null))
    {
      this.uVv = true;
      this.uVx = this.uVw.uWY;
      com.tencent.mm.plugin.wepkg.utils.a.b("EnterWeb", this.mUH, this.uVx.eBS, this.uVx.version, 1L, 0L, null);
    }
    ab.i("MicroMsg.Wepkg.WePkgPlugin", "wepkgAvailable:%s, pkgId:%s", new Object[] { Boolean.valueOf(this.uVv), this.mXy });
    if (this.mUN == null)
    {
      this.mUN = GameWebPerformanceInfo.kU(paramString);
      this.mUN.eBS = com.tencent.mm.plugin.wepkg.utils.d.aid(paramString);
      paramString = this.mUN;
      if (!this.uVv)
        break label196;
    }
    label196: for (int i = 1; ; i = 0)
    {
      paramString.eBL = i;
      this.mUN.eCn = a.dgb();
      this.mUN.eCo = dgj();
      paramBoolean = this.uVv;
      AppMethodBeat.o(63369);
      return paramBoolean;
    }
  }

  public final boolean dgi()
  {
    if ((this.uVx == null) || (!this.uVx.uXG));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String dgj()
  {
    if (this.uVx != null);
    for (String str = this.uVx.version; ; str = "")
      return str;
  }

  public final void j(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(63371);
    ab.d("MicroMsg.Wepkg.WePkgPlugin", "onPageStarted, url = %s", new Object[] { paramString });
    this.aIv = System.currentTimeMillis();
    b(paramWebView, ahB(paramString));
    AppMethodBeat.o(63371);
  }

  public final void k(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(63372);
    ab.d("MicroMsg.Wepkg.WePkgPlugin", "onPageFinished, url = %s", new Object[] { paramString });
    long l;
    String str;
    if (this.aIv != 0L)
    {
      l = System.currentTimeMillis() - this.aIv;
      str = com.tencent.mm.plugin.wepkg.utils.d.aid(paramString);
      if (!bo.isNullOrNil(str))
        break label137;
      com.tencent.mm.plugin.wepkg.utils.a.b("PageLoadTime", paramString, "", null, 2L, l, null);
    }
    while (true)
    {
      this.aIv = 0L;
      if ((this.uVv) && (this.uVw != null) && (this.uVw.ahT(paramString)))
      {
        ab.i("MicroMsg.Wepkg.WePkgPlugin", "startTimer");
        this.che.ae(1000L, 1000L);
      }
      b(paramWebView, ahB(paramString));
      AppMethodBeat.o(63372);
      return;
      label137: if ((this.uVv) && (this.uVx != null))
        com.tencent.mm.plugin.wepkg.utils.a.b("PageLoadTime", paramString, this.uVx.eBS, this.uVx.version, 1L, l, null);
      else
        com.tencent.mm.plugin.wepkg.utils.a.b("PageLoadTime", paramString, str, null, 0L, l, null);
    }
  }

  public final Object onMiscCallBack(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(63375);
    boolean bool;
    if (paramBundle == null)
    {
      bool = true;
      ab.i("MicroMsg.Wepkg.WePkgPlugin", "method = %s, bundler == null ? %b", new Object[] { paramString, Boolean.valueOf(bool) });
      if ((!bo.isNullOrNil(paramString)) && (paramBundle != null))
        break label61;
      AppMethodBeat.o(63375);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      bool = false;
      break;
      label61: if ((this.uVv) && (this.uVw != null) && (paramString.equalsIgnoreCase("shouldInterceptMediaUrl")))
      {
        paramString = paramBundle.getString("url");
        ab.i("MicroMsg.Wepkg.WePkgPlugin", "onMiscCallBack origin mediaUrl:".concat(String.valueOf(paramString)));
        if (!bo.isNullOrNil(paramString))
        {
          ab.i("MicroMsg.Wepkg.WePkgPlugin", "onMiscCallBack replace localPath");
          paramString = this.uVw.Kl(com.tencent.mm.plugin.wepkg.utils.d.aif(paramString));
          if (!bo.isNullOrNil(paramString))
          {
            ab.i("MicroMsg.Wepkg.WePkgPlugin", "localFile:".concat(String.valueOf(paramString)));
            h.pYm.a(859L, 14L, 1L, false);
            AppMethodBeat.o(63375);
          }
        }
      }
      else
      {
        AppMethodBeat.o(63375);
        paramString = null;
      }
    }
  }

  public final void ot(boolean paramBoolean)
  {
    AppMethodBeat.i(63370);
    this.che.stopTimer();
    if ((paramBoolean) && (!bo.isNullOrNil(this.mXy)))
    {
      b.Dp(this.mXy);
      com.tencent.mm.plugin.wepkg.model.b.dgz().dP(this.mXy, 2);
    }
    b.dgg();
    com.tencent.mm.plugin.wepkg.event.c.b(this.uVy);
    AppMethodBeat.o(63370);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.c
 * JD-Core Version:    0.6.2
 */