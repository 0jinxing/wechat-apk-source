package com.tencent.mm.plugin.webview.luggage;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.webkit.WebView;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.plugin.scanner.a;
import com.tencent.mm.plugin.webview.luggage.c.c.b;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key;
import com.tencent.mm.plugin.webview.modeltools.h;
import com.tencent.mm.plugin.webview.modeltools.h.c;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.snackbar.a.b;
import com.tencent.xweb.WebView.b;

public final class g
  implements View.OnCreateContextMenuListener
{
  j icA;
  String icB;
  int icC;
  int icD;
  h icE;
  WebView.b icF;
  WebView.b icG;
  private h.c icL;
  private a.b mUw;
  d uiI;

  public g(d paramd)
  {
    AppMethodBeat.i(6144);
    this.icL = new h.c()
    {
      public final void BY(String paramAnonymousString)
      {
        AppMethodBeat.i(6120);
        Bundle localBundle = new Bundle();
        localBundle.putInt("type", 1);
        localBundle.putString("img_path", paramAnonymousString);
        com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", localBundle, g.c.class, new c()
        {
        });
        AppMethodBeat.o(6120);
      }
    };
    this.mUw = new g.8(this);
    this.uiI = paramd;
    this.icA = new j(paramd.mContext);
    this.icA.a(paramd.getWebView(), this, null);
    this.icA.e(new g.2(this));
    AppMethodBeat.o(6144);
  }

  private boolean a(ContextMenu paramContextMenu, String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(6146);
    boolean bool2;
    if (!com.tencent.mm.compatible.util.f.Mn())
    {
      ab.e("MicroMsg.GameWebViewMenuListHelper", "SD card unavailable");
      AppMethodBeat.o(6146);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label44: Object localObject;
      if (ah.bqo())
      {
        bool2 = com.tencent.mm.kernel.g.RK();
        paramContextMenu.setHeaderTitle(2131305710);
        ab.i("MicroMsg.GameWebViewMenuListHelper", "hasSetAcc = %b", new Object[] { Boolean.valueOf(bool2) });
        if (bool2)
          paramContextMenu.add(0, 0, 0, this.uiI.mContext.getString(2131302133)).setOnMenuItemClickListener(new g.4(this, paramString));
        paramContextMenu.add(0, 0, 0, this.uiI.mContext.getString(2131302711)).setOnMenuItemClickListener(new g.5(this, paramString));
        if (bool2)
          paramContextMenu.add(0, 0, 0, this.uiI.mContext.getString(2131301955)).setOnMenuItemClickListener(new g.6(this, paramString));
        if (this.icB == null)
          break label372;
        localObject = this.icB;
        if (a.BR(this.icC))
          break label355;
        if (!a.ba(this.icC, this.icB))
          break label328;
        paramString = this.uiI.mContext.getString(2131302188);
      }
      while (true)
      {
        if (!bo.isNullOrNil(paramString))
          paramContextMenu.add(0, 0, 0, paramString).setOnMenuItemClickListener(new g.7(this, (String)localObject));
        this.icB = null;
        AppMethodBeat.o(6146);
        bool2 = bool1;
        break;
        localObject = (Bundle)com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", null, c.b.class);
        if (localObject != null)
        {
          bool2 = ((Bundle)localObject).getBoolean("has_set_uin", false);
          break label44;
        }
        bool2 = true;
        break label44;
        label328: if (a.BQ(this.icC))
          paramString = this.uiI.mContext.getString(2131302186);
        else
          label355: paramString = this.uiI.mContext.getString(2131302187);
      }
      label372: AppMethodBeat.o(6146);
      bool2 = false;
    }
  }

  private static boolean cWZ()
  {
    AppMethodBeat.i(6149);
    IPCBoolean localIPCBoolean = (IPCBoolean)com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", null, g.b.class);
    boolean bool;
    if (localIPCBoolean != null)
    {
      bool = localIPCBoolean.value;
      AppMethodBeat.o(6149);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(6149);
    }
  }

  final void a(ContextMenu paramContextMenu, WebView.b paramb)
  {
    AppMethodBeat.i(6147);
    if ((!a(paramContextMenu, paramb.mExtra)) && (this.uiI.cWM().aej(this.uiI.getUrl()).dml()) && (cWZ()))
    {
      this.icG = paramb;
      this.icE = new h();
      this.icE.a(this.uiI.getWebView(), this.icL);
    }
    AppMethodBeat.o(6147);
  }

  final void b(ContextMenu paramContextMenu, WebView.b paramb)
  {
    AppMethodBeat.i(6148);
    if ((!a(paramContextMenu, paramb.mExtra)) && (this.uiI.cWM().aej(this.uiI.getUrl()).dml()) && (cWZ()))
    {
      this.icF = paramb;
      this.icE = new h();
      this.icE.a(this.uiI.getWebView(), this.icL);
    }
    AppMethodBeat.o(6148);
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(6145);
    ab.d("MicroMsg.GameWebViewMenuListHelper", "onCreateContextMenu");
    if ((paramView instanceof WebView))
    {
      paramView = this.uiI.getWebView().getHitTestResult();
      if (paramView == null)
        AppMethodBeat.o(6145);
    }
    while (true)
    {
      return;
      if ((paramView.mType == 5) || (paramView.mType == 8))
        b(paramContextMenu, paramView);
      AppMethodBeat.o(6145);
      continue;
      paramView = this.uiI.getWebView().getHitTestResult();
      if (paramView == null)
      {
        AppMethodBeat.o(6145);
      }
      else
      {
        if ((paramView.mType == 5) || (paramView.mType == 8))
          a(paramContextMenu, paramView);
        AppMethodBeat.o(6145);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g
 * JD-Core Version:    0.6.2
 */