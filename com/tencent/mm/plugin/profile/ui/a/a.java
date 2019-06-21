package com.tencent.mm.plugin.profile.ui.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.profile.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
  implements f
{
  Activity czX;
  com.tencent.mm.ui.base.p mzU;
  b ppH;
  private ap ppI;

  public a(Activity paramActivity)
  {
    AppMethodBeat.i(23797);
    this.ppI = new ap(new a.1(this), false);
    this.czX = paramActivity;
    AppMethodBeat.o(23797);
  }

  private void UW(String paramString)
  {
    AppMethodBeat.i(23800);
    this.ppI.stopTimer();
    if (this.mzU != null)
      this.mzU.dismiss();
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    paramString.putExtra("title", this.czX.getString(2131298752));
    paramString.putExtra("zoom", true);
    paramString.putExtra("vertical_scroll", false);
    d.b(this.czX, "webview", ".ui.tools.WebViewUI", paramString);
    AppMethodBeat.o(23800);
  }

  public final void fF(String paramString1, String paramString2)
  {
    AppMethodBeat.i(23798);
    if (paramString1 == null)
    {
      ab.e("MicroMsg.ViewTWeibo", "null weibo id");
      AppMethodBeat.o(23798);
    }
    while (true)
    {
      return;
      aw.Rg().a(205, this);
      this.ppH = new b(bo.nullAsNil(paramString1).replace("http://t.qq.com/", "").trim(), paramString2);
      aw.Rg().a(this.ppH, 0);
      this.ppI.ae(3000L, 3000L);
      AppMethodBeat.o(23798);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(23799);
    aw.Rg().b(205, this);
    paramString = (b)paramm;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      UW(paramString.getURL());
      AppMethodBeat.o(23799);
    }
    while (true)
    {
      return;
      if (paramInt1 != 4)
        ab.e("MicroMsg.ViewTWeibo", "view weibo failed: " + paramInt1 + ", " + paramInt2);
      UW("http://t.qq.com/" + paramString.pkH);
      AppMethodBeat.o(23799);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.a.a
 * JD-Core Version:    0.6.2
 */