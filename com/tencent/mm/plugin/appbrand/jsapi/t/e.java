package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.a;
import com.tencent.mm.plugin.webview.modeltools.h;
import com.tencent.mm.plugin.webview.modeltools.h.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView.b;

public class e
  implements View.OnCreateContextMenuListener, c.b
{
  private j icA;
  private String icB;
  int icC;
  int icD;
  h icE;
  WebView.b icF;
  WebView.b icG;
  private final com.tencent.mm.plugin.webview.modeltools.d icH;
  final c.c icI;
  private com.tencent.mm.plugin.webview.ui.tools.jsapi.d icJ;
  private m icK;
  private h.c icL;
  private String icl;
  MMWebViewWithJsApi icv;
  private b icw;
  private e.a icx;
  private com.tencent.mm.plugin.webview.stub.d icy;
  private com.tencent.mm.plugin.webview.ui.tools.k icz;

  public e(c.c paramc)
  {
    AppMethodBeat.i(17053);
    this.icH = new com.tencent.mm.plugin.webview.modeltools.d();
    this.icK = new e.1(this);
    this.icL = new h.c()
    {
      public final void BY(String paramAnonymousString)
      {
        AppMethodBeat.i(17035);
        try
        {
          if (e.i(e.this) != null)
          {
            e.i(e.this).a(paramAnonymousString, new int[] { 3 }, 0, 0);
            AppMethodBeat.o(17035);
          }
          while (true)
          {
            return;
            ab.i("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "viewCaptureCallback, invoker is null");
            AppMethodBeat.o(17035);
          }
        }
        catch (RemoteException paramAnonymousString)
        {
          while (true)
          {
            ab.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "recog failed");
            AppMethodBeat.o(17035);
          }
        }
      }
    };
    this.icI = paramc;
    this.icv = ((MMWebViewWithJsApi)paramc.getWebView());
    this.icw = new b(this.icv);
    this.icx = new e.a(this, this.icv);
    this.icv.setWebViewClient(this.icw);
    this.icv.setWebChromeClient(this.icx);
    this.icv.setCleanOnDetached(true);
    this.icA = new j(this.icv.getContext());
    this.icA.a(this.icv, this, null);
    this.icA.e(new e.2(this));
    AppMethodBeat.o(17053);
  }

  private void a(ContextMenu paramContextMenu, WebView.b paramb)
  {
    AppMethodBeat.i(17059);
    if ((!a(paramContextMenu, paramb.mExtra)) && (this.icz.cZT().dml()))
    {
      this.icG = paramb;
      this.icE = new h();
      this.icE.a(this.icv, this.icL);
    }
    AppMethodBeat.o(17059);
  }

  private boolean a(ContextMenu paramContextMenu, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(17058);
    try
    {
      bool2 = this.icy.isSDCardAvailable();
      if (!bool2)
      {
        AppMethodBeat.o(17058);
        bool2 = true;
        return bool2;
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onCreateContextMenu fail, ex = " + localException1.getMessage());
        boolean bool2 = false;
        continue;
        if (this.icz == null)
        {
          AppMethodBeat.o(17058);
          bool2 = true;
        }
        else
        {
          paramContextMenu.setHeaderTitle(2131305710);
          try
          {
            bool2 = this.icy.cZd();
            boolean bool3 = this.icz.cZT().dmn();
            boolean bool4 = this.icz.cZT().dmo();
            ab.i("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "hasSetAcc = %b, canShareImage = %b, canFavImage = %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
            if ((bool2) && (bool3))
              paramContextMenu.add(0, 0, 0, this.icv.getContext().getString(2131302133)).setOnMenuItemClickListener(new e.3(this, paramString));
            paramContextMenu.add(0, 0, 0, this.icv.getContext().getString(2131302711)).setOnMenuItemClickListener(new e.4(this, paramString));
            if ((bool2) && (bool4))
              paramContextMenu.add(0, 0, 0, this.icv.getContext().getString(2131301955)).setOnMenuItemClickListener(new e.5(this, paramString));
            if (this.icB == null)
              break label425;
            if (!a.ba(this.icC, this.icB))
            {
              this.icB = null;
              AppMethodBeat.o(17058);
              bool2 = true;
            }
          }
          catch (Exception localException2)
          {
            while (true)
            {
              ab.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "get has setuin failed : %s", new Object[] { localException2.getMessage() });
              bool2 = false;
            }
            String str = this.icB;
            paramContextMenu.add(0, 0, 0, this.icv.getContext().getString(2131302188)).setOnMenuItemClickListener(new e.6(this, str, paramString));
            this.icB = null;
            AppMethodBeat.o(17058);
            bool2 = true;
          }
          continue;
          label425: AppMethodBeat.o(17058);
          bool2 = bool1;
        }
      }
    }
  }

  private void b(ContextMenu paramContextMenu, WebView.b paramb)
  {
    AppMethodBeat.i(17060);
    if ((!a(paramContextMenu, paramb.mExtra)) && (this.icz.cZT().dml()))
    {
      this.icF = paramb;
      this.icE = new h();
      this.icE.a(this.icv, this.icL);
    }
    AppMethodBeat.o(17060);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(17054);
    this.icw.cleanup();
    this.icv.destroy();
    AppMethodBeat.o(17054);
  }

  public final void k(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(17055);
    ab.i("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "notifyKeyboardStateChanged, shown[%b], height[%d]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = this.icJ;
    if (locald != null)
      if (!paramBoolean)
        break label57;
    while (true)
    {
      locald.JM(paramInt);
      AppMethodBeat.o(17055);
      return;
      label57: paramInt = 0;
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(17061);
    if ((paramView instanceof android.webkit.WebView))
    {
      paramView = this.icv.getHitTestResult();
      if (paramView == null)
        AppMethodBeat.o(17061);
    }
    while (true)
    {
      return;
      if ((paramView.mType == 5) || (paramView.mType == 8))
        b(paramContextMenu, paramView);
      AppMethodBeat.o(17061);
      continue;
      if ((paramView instanceof MMWebView))
      {
        paramView = ((MMWebView)paramView).getHitTestResult();
        if (paramView == null)
          AppMethodBeat.o(17061);
        else if ((paramView.mType == 5) || (paramView.mType == 8))
          a(paramContextMenu, paramView);
      }
      else
      {
        AppMethodBeat.o(17061);
      }
    }
  }

  public final void wU()
  {
    AppMethodBeat.i(17056);
    if (this.icw.uDd != null)
      this.icw.uDd.nN(true);
    AppMethodBeat.o(17056);
  }

  public final void wW()
  {
    AppMethodBeat.i(17057);
    if (this.icw.uDd != null)
      this.icw.uDd.nN(false);
    AppMethodBeat.o(17057);
  }

  final class b extends com.tencent.mm.plugin.webview.ui.tools.widget.k
  {
    b(MMWebView arg2)
    {
      super();
    }

    public final String BZ(String paramString)
    {
      AppMethodBeat.i(17049);
      if ((e.c(e.this) != null) && (e.c(e.this).equals(paramString)))
      {
        paramString = "";
        AppMethodBeat.o(17049);
      }
      while (true)
      {
        return paramString;
        paramString = e.c(e.this);
        AppMethodBeat.o(17049);
      }
    }

    public final void a(com.tencent.mm.plugin.webview.stub.d paramd, com.tencent.mm.plugin.webview.ui.tools.k paramk)
    {
      AppMethodBeat.i(17043);
      e.a(e.this, paramd);
      e.a(e.this, paramk);
      try
      {
        paramk = new android/os/Bundle;
        paramk.<init>();
        paramk.putString("key_webview_container_env", "miniProgram");
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putBundle("jsapiargs", paramk);
        paramd.a(20, localBundle, this.fow.hashCode());
        AppMethodBeat.o(17043);
        return;
      }
      catch (RemoteException paramd)
      {
        while (true)
        {
          ab.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onServiceConnected, invoke AC_SET_INITIAL_ARGS, ex = " + paramd.getMessage());
          AppMethodBeat.o(17043);
        }
      }
    }

    public final void a(com.tencent.mm.plugin.webview.ui.tools.jsapi.d paramd)
    {
      AppMethodBeat.i(17052);
      super.a(paramd);
      if ((paramd != null) && (e.b(e.this) != null))
        paramd.uqT = e.b(e.this).getAppId();
      e.a(e.this, paramd);
      AppMethodBeat.o(17052);
    }

    public final void a(com.tencent.xweb.WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      AppMethodBeat.i(17051);
      e.b(e.this).m(paramString2, paramInt, paramString1);
      AppMethodBeat.o(17051);
    }

    public final void a(com.tencent.xweb.WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      AppMethodBeat.i(17045);
      e.a(e.this, paramString);
      e.b(e.this).BW(paramString);
      AppMethodBeat.o(17045);
    }

    public final m aGt()
    {
      AppMethodBeat.i(17042);
      m localm = e.a(e.this);
      AppMethodBeat.o(17042);
      return localm;
    }

    public final int aGu()
    {
      AppMethodBeat.i(17047);
      int i;
      if (e.b(e.this).aGr())
      {
        i = 55;
        AppMethodBeat.o(17047);
      }
      while (true)
      {
        return i;
        i = 49;
        AppMethodBeat.o(17047);
      }
    }

    public final int aGv()
    {
      AppMethodBeat.i(17048);
      int i;
      if (e.b(e.this).aGr())
      {
        i = 55;
        AppMethodBeat.o(17048);
      }
      while (true)
      {
        return i;
        i = 49;
        AppMethodBeat.o(17048);
      }
    }

    public final void e(com.tencent.xweb.WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(17046);
      e.a(e.this, paramString);
      e.b(e.this).bF(paramString);
      AppMethodBeat.o(17046);
    }

    public final void g(Bundle paramBundle, String paramString)
    {
      AppMethodBeat.i(17050);
      super.g(paramBundle, paramString);
      paramBundle.putString("geta8key_data_appid", e.b(e.this).getAppId());
      AppMethodBeat.o(17050);
    }

    public final boolean oZ(String paramString)
    {
      boolean bool = true;
      AppMethodBeat.i(17044);
      if (paramString.startsWith("file:///android_asset"))
      {
        ab.w("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "handleUrlLoading found %s", new Object[] { paramString });
        AppMethodBeat.o(17044);
      }
      while (true)
      {
        return bool;
        Intent localIntent;
        if (paramString.startsWith("tel:"))
        {
          localIntent = new Intent("android.intent.action.DIAL");
          localIntent.setData(Uri.parse(paramString));
          this.fow.getContext().startActivity(localIntent);
          AppMethodBeat.o(17044);
        }
        else if ((paramString.startsWith("sms:")) || (paramString.startsWith("smsto:")))
        {
          localIntent = new Intent("android.intent.action.SENDTO");
          localIntent.setData(Uri.parse(paramString));
          this.fow.getContext().startActivity(localIntent);
          AppMethodBeat.o(17044);
        }
        else
        {
          if ((URLUtil.isHttpUrl(paramString)) || (URLUtil.isHttpsUrl(paramString)) || (bo.nullAsNil(paramString).startsWith("weixin")));
          for (int i = 1; ; i = 0)
          {
            if (i != 0)
              break label209;
            ab.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "handleUrlLoading found unacceptable %s", new Object[] { paramString });
            AppMethodBeat.o(17044);
            break;
          }
          label209: AppMethodBeat.o(17044);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e
 * JD-Core Version:    0.6.2
 */