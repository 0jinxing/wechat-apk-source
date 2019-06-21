package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends ClickableSpan
{
  private String hCv;
  private int hCw;

  public a(String paramString)
  {
    AppMethodBeat.i(130896);
    this.hCw = ah.getContext().getResources().getColor(2131690135);
    this.hCv = paramString;
    AppMethodBeat.o(130896);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(130898);
    if (bo.isNullOrNil(this.hCv))
    {
      ab.e("MicroMsg.ExposeSpan", "exposeUrl is null, return");
      AppMethodBeat.o(130898);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", this.hCv);
      localIntent.putExtra("forceHideShare", true);
      d.b(paramView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
      ab.d("MicroMsg.ExposeSpan", "expose click, exposeUrl:%s", new Object[] { this.hCv });
      AppMethodBeat.o(130898);
    }
  }

  public final void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(130897);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setColor(this.hCw);
    paramTextPaint.setUnderlineText(false);
    AppMethodBeat.o(130897);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.a.a
 * JD-Core Version:    0.6.2
 */