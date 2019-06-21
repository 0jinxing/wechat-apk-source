package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class u
  implements f
{
  Context context;
  com.tencent.mm.ui.base.p mzU;
  private ap ppI;
  h qhf;
  private String vlr;

  public u(Context paramContext)
  {
    AppMethodBeat.i(27723);
    this.ppI = new ap(new u.1(this), false);
    this.context = paramContext;
    AppMethodBeat.o(27723);
  }

  private void ajH(String paramString)
  {
    AppMethodBeat.i(27725);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.context.getString(2131298634, new Object[] { paramString }));
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("vertical_scroll", true);
    localIntent.putExtra("neverGetA8Key", true);
    d.b(this.context, "webview", ".ui.tools.ContactQZoneWebView", localIntent);
    AppMethodBeat.o(27725);
  }

  public final void ajG(String paramString)
  {
    AppMethodBeat.i(27724);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.ViewQZone", "go fail, qqNum is null");
      AppMethodBeat.o(27724);
    }
    while (true)
    {
      return;
      this.vlr = paramString;
      aw.ZK();
      String str1 = (String)c.Ry().get(46, null);
      aw.ZK();
      String str2 = bo.nullAsNil((String)c.Ry().get(72, null));
      ab.i("MicroMsg.ViewQZone", "get a2key:[%s], get new a2key:[%s]", new Object[] { str1, str2 });
      if ((bo.isNullOrNil(str1)) && (bo.isNullOrNil(str2)))
      {
        ajH(paramString);
        AppMethodBeat.o(27724);
      }
      else
      {
        aw.Rg().a(233, this);
        this.qhf = new h(com.tencent.mm.a.p.cB(paramString), (int)System.currentTimeMillis());
        aw.Rg().a(this.qhf, 0);
        this.ppI.ae(3000L, 3000L);
        AppMethodBeat.o(27724);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(27726);
    this.ppI.stopTimer();
    if (this.mzU != null)
      this.mzU.dismiss();
    aw.Rg().b(233, this);
    h localh;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localh = (h)paramm;
      paramString = localh.aiT();
      if ((paramString == null) || (paramString.length() == 0))
      {
        ajH(this.vlr);
        AppMethodBeat.o(27726);
      }
    }
    while (true)
    {
      return;
      paramm = new Intent();
      paramm.putExtra("rawUrl", paramString);
      paramm.putExtra("useJs", true);
      paramm.putExtra("vertical_scroll", true);
      paramm.putExtra("neverGetA8Key", true);
      paramm.putExtra("geta8key_session_id", localh.ajb());
      d.b(this.context, "webview", ".ui.tools.ContactQZoneWebView", paramm);
      AppMethodBeat.o(27726);
      continue;
      ab.e("MicroMsg.ViewQZone", "getA8Key fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
      ajH(this.vlr);
      AppMethodBeat.o(27726);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.u
 * JD-Core Version:    0.6.2
 */