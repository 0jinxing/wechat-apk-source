package com.tencent.mm.plugin.webview.ui.tools;

import android.os.RemoteException;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.webkit.WebView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.h;
import com.tencent.mm.plugin.webview.modeltools.h.c;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView.b;
import com.tencent.xweb.b;

public final class i extends a
  implements View.OnCreateContextMenuListener
{
  String icB;
  int icC;
  int icD;
  h icE;
  WebView.b icF;
  WebView.b icG;
  private h.c icL;

  public i(WebViewUI paramWebViewUI)
  {
    super(paramWebViewUI);
    AppMethodBeat.i(7633);
    this.icL = new i.1(this);
    AppMethodBeat.o(7633);
  }

  private boolean a(ContextMenu paramContextMenu, final String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(7638);
    boolean bool2;
    if (cZu())
    {
      AppMethodBeat.o(7638);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        bool2 = cZv().icy.isSDCardAvailable();
        if (!bool2)
        {
          AppMethodBeat.o(7638);
          bool2 = true;
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          ab.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu fail, ex = " + localException1.getMessage());
          bool2 = false;
        }
        paramContextMenu.setHeaderTitle(2131305710);
        try
        {
          bool2 = cZv().icy.cZd();
          boolean bool3 = cZv().icz.cZT().dmn();
          boolean bool4 = cZv().icz.cZT().dmo();
          ab.i("MicroMsg.WebViewLongClickHelper", "hasSetAcc = %b, canShareImage = %b, canFavImage = %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
          if ((bool2) && (bool3))
            paramContextMenu.add(0, 0, 0, cZv().getString(2131302133)).setOnMenuItemClickListener(new i.2(this, paramString));
          paramContextMenu.add(0, 0, 0, cZv().getString(2131302711)).setOnMenuItemClickListener(new i.3(this, paramString));
          if ((bool2) && (bool4))
            paramContextMenu.add(0, 0, 0, cZv().getString(2131301955)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
            {
              public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
              {
                AppMethodBeat.i(7631);
                try
                {
                  boolean bool = i.this.cZv().icy.isSDCardAvailable();
                  paramAnonymousMenuItem = paramString.replaceAll("tp=webp", "");
                  WebViewUI localWebViewUI = i.this.cZv();
                  String str = b.dTR().getCookie(paramAnonymousMenuItem);
                  i.4.1 local1 = new com/tencent/mm/plugin/webview/ui/tools/i$4$1;
                  local1.<init>(this);
                  u.a(localWebViewUI, paramAnonymousMenuItem, str, bool, local1);
                  AppMethodBeat.o(7631);
                  return true;
                }
                catch (Exception paramAnonymousMenuItem)
                {
                  while (true)
                    ab.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + paramAnonymousMenuItem.getMessage());
                }
              }
            });
          if (this.icB != null)
          {
            String str3 = this.icB;
            if (!com.tencent.mm.plugin.scanner.a.BR(this.icC))
              if (com.tencent.mm.plugin.scanner.a.ba(this.icC, this.icB))
              {
                String str1 = cZv().getString(2131302188);
                if (!bo.isNullOrNil(str1))
                  paramContextMenu.add(0, 0, 0, str1).setOnMenuItemClickListener(new i.5(this, str3, paramString));
                this.icB = null;
                AppMethodBeat.o(7638);
                bool2 = true;
              }
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            ab.e("MicroMsg.WebViewLongClickHelper", "get has setuin failed : %s", new Object[] { localException2.getMessage() });
            bool2 = false;
            continue;
            String str2;
            if (com.tencent.mm.plugin.scanner.a.BQ(this.icC))
              str2 = cZv().getString(2131302186);
            else
              str2 = cZv().getString(2131302187);
          }
          AppMethodBeat.o(7638);
          bool2 = bool1;
        }
      }
    }
  }

  private boolean cWZ()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(7635);
    int i = cZv().afH(bo.nullAsNil(cZv().uwi));
    if ((i == 53) || (i == 52))
    {
      ab.i("MicroMsg.WebViewLongClickHelper", "isAllowScanQRCode open link not allow to ScanQRCode");
      AppMethodBeat.o(7635);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      try
      {
        if (cZv().icy == null)
        {
          ab.w("MicroMsg.WebViewLongClickHelper", "invoker is null");
          AppMethodBeat.o(7635);
          bool1 = bool2;
          continue;
        }
        bool2 = cZv().icy.cZo();
        bool1 = bool2;
        AppMethodBeat.o(7635);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          ab.e("MicroMsg.WebViewLongClickHelper", "unable get config for Scan QRCode" + localRemoteException.getMessage());
      }
    }
  }

  protected final void a(ContextMenu paramContextMenu, WebView.b paramb)
  {
    AppMethodBeat.i(7636);
    if ((!a(paramContextMenu, paramb.mExtra)) && (cZv().icz.cZT().dml()) && (cWZ()))
    {
      this.icG = paramb;
      this.icE = new h();
      this.icE.a(cZv().pzf, this.icL);
    }
    AppMethodBeat.o(7636);
  }

  protected final void b(ContextMenu paramContextMenu, WebView.b paramb)
  {
    AppMethodBeat.i(7637);
    if ((!a(paramContextMenu, paramb.mExtra)) && (cZv().icz.cZT().dml()) && (cWZ()))
    {
      this.icF = paramb;
      this.icE = new h();
      this.icE.a(cZv().pzf, this.icL);
    }
    AppMethodBeat.o(7637);
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(7634);
    if (cZu())
      AppMethodBeat.o(7634);
    while (true)
    {
      return;
      try
      {
        if (!(paramView instanceof WebView))
          break label112;
        paramView = cZv().pzf.getHitTestResult();
        if (paramView == null)
        {
          AppMethodBeat.o(7634);
          continue;
        }
        if ((paramView.mType == 5) || (paramView.mType == 8))
          b(paramContextMenu, paramView);
        AppMethodBeat.o(7634);
      }
      catch (Exception paramContextMenu)
      {
        ab.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu exp %s", new Object[] { paramContextMenu.getMessage() });
        AppMethodBeat.o(7634);
      }
      continue;
      label112: if ((paramView instanceof MMWebView))
      {
        paramView = ((MMWebView)paramView).getHitTestResult();
        if (paramView == null)
          AppMethodBeat.o(7634);
        else if ((paramView.mType == 5) || (paramView.mType == 8))
          a(paramContextMenu, paramView);
      }
      else
      {
        AppMethodBeat.o(7634);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.i
 * JD-Core Version:    0.6.2
 */