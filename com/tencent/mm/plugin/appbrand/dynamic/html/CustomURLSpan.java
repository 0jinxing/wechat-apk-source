package com.tencent.mm.plugin.appbrand.dynamic.html;

import android.content.Intent;
import android.text.style.URLSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;

public class CustomURLSpan extends URLSpan
{
  private String mUrl;

  public CustomURLSpan(String paramString)
  {
    super(paramString);
    this.mUrl = paramString;
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(10813);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.mUrl);
    d.b(paramView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
    ab.d("MicroMsg.CustomURLSpan", "on custom url(%s) span clicked.", new Object[] { this.mUrl });
    AppMethodBeat.o(10813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.html.CustomURLSpan
 * JD-Core Version:    0.6.2
 */