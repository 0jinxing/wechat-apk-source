package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.model.aq.e;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.b.c;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.64;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.plugin.webview.ui.tools.k;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.HashMap;
import java.util.Map;

final class GameWebViewUI$2
  implements b.c
{
  GameWebViewUI$2(GameWebViewUI paramGameWebViewUI)
  {
  }

  public final void f(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(8725);
    Object localObject = (bbb)GameWebViewUI.l(this.uEh).get(Integer.valueOf(paramMenuItem.getItemId()));
    if (localObject == null)
    {
      AppMethodBeat.o(8725);
      return;
    }
    switch (GameWebViewUI.8.uEk[com.tencent.mm.plugin.webview.ui.tools.game.menu.c.a.JI(localObject.wkB).ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      AppMethodBeat.o(8725);
      break;
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("rawUrl", ((bbb)localObject).wkC);
      com.tencent.mm.bp.d.b(this.uEh.mController.ylL, "webview", ".ui.tools.game.GameWebViewUI", paramMenuItem);
      AppMethodBeat.o(8725);
      break;
      paramMenuItem = GameWebViewUI.n(this.uEh).cYc();
      paramMenuItem.une = new Object[] { this.uEh.cOG, Integer.valueOf(32), Integer.valueOf(1) };
      paramMenuItem.b(GameWebViewUI.m(this.uEh));
      if (!GameWebViewUI.o(this.uEh))
      {
        this.uEh.finish();
        AppMethodBeat.o(8725);
        break;
        String str = this.uEh.getIntent().getStringExtra("KPublisherId");
        localObject = this.uEh.getIntent().getStringExtra("KAppId");
        paramMenuItem = this.uEh.getIntent().getStringExtra("srcUsername");
        aq.e locale = GameWebViewUI.q(this.uEh).cYc();
        locale.une = new Object[] { this.uEh.cOG, Integer.valueOf(1), Integer.valueOf(1), str, localObject, paramMenuItem };
        locale.b(GameWebViewUI.p(this.uEh));
        GameWebViewUI.b(this.uEh, GameWebViewUI.r(this.uEh).cZT().dmm());
        GameWebViewUI.s(this.uEh);
        AppMethodBeat.o(8725);
        break;
        paramMenuItem = GameWebViewUI.u(this.uEh).cYc();
        paramMenuItem.une = new Object[] { this.uEh.cOG, Integer.valueOf(3), Integer.valueOf(1) };
        paramMenuItem.b(GameWebViewUI.t(this.uEh));
        h.pYm.a(157L, 6L, 1L, false);
        GameWebViewUI.c(this.uEh, GameWebViewUI.v(this.uEh).cZT().dmm());
        GameWebViewUI.w(this.uEh);
        AppMethodBeat.o(8725);
        break;
        paramMenuItem = GameWebViewUI.y(this.uEh).cYc();
        paramMenuItem.une = new Object[] { this.uEh.cOG, Integer.valueOf(10), Integer.valueOf(1) };
        paramMenuItem.b(GameWebViewUI.x(this.uEh));
        if (GameWebViewUI.z(this.uEh) != null)
        {
          GameWebViewUI.A(this.uEh).reload();
          AppMethodBeat.o(8725);
          break;
          paramMenuItem = GameWebViewUI.C(this.uEh).cYc();
          paramMenuItem.une = new Object[] { this.uEh.cOG, Integer.valueOf(31), Integer.valueOf(1) };
          paramMenuItem.b(GameWebViewUI.B(this.uEh));
          GameWebViewUI.D(this.uEh);
          AppMethodBeat.o(8725);
          break;
          paramMenuItem = GameWebViewUI.F(this.uEh).cYc();
          paramMenuItem.une = new Object[] { this.uEh.cOG, Integer.valueOf(11), Integer.valueOf(1) };
          paramMenuItem.b(GameWebViewUI.E(this.uEh));
          GameWebViewUI.G(this.uEh);
          AppMethodBeat.o(8725);
          break;
          if (GameWebViewUI.H(this.uEh) != null)
          {
            paramMenuItem = GameWebViewUI.I(this.uEh);
            int i = ((bbb)localObject).wFQ;
            ab.i("MicroMsg.JsApiHandler", "onCustomGameMenuClicked");
            localObject = new HashMap();
            ((HashMap)localObject).put("itemId", Integer.valueOf(i));
            al.d(new d.64(paramMenuItem, i.a.b("onCustomGameMenuClicked", (Map)localObject, paramMenuItem.uFv, paramMenuItem.uFw)));
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI.2
 * JD-Core Version:    0.6.2
 */