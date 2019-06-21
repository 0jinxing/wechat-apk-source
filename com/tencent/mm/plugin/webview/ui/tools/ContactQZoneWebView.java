package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.a.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;

public class ContactQZoneWebView extends WebViewUI
{
  private String phw = "";
  private boolean ura = false;
  private String urb = "";

  final void afr(String paramString)
  {
    AppMethodBeat.i(7352);
    if (this.ura)
      AppMethodBeat.o(7352);
    while (true)
    {
      return;
      this.ura = true;
      Object localObject = paramString.substring(19);
      ab.d("MicroMsg.ContactQZoneWebView", "get url :".concat(String.valueOf(localObject)));
      paramString = new Intent();
      paramString.putExtra("nowUrl", (String)localObject);
      paramString.putExtra("tweetid", bo.nullAsNil(getIntent().getStringExtra("tweetid")));
      paramString.putExtra("htmlData", this.urb);
      paramString.putExtra("type", getIntent().getIntExtra("type", 0));
      localObject = new Bundle();
      ((Bundle)localObject).putInt("stat_scene", 4);
      ((Bundle)localObject).putString("stat_url", dae());
      paramString.putExtra("_stat_obj", (Bundle)localObject);
      startActivity(paramString);
      a.gkE.q(paramString, this);
      AppMethodBeat.o(7352);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7350);
    super.onCreate(paramBundle);
    setMMTitle(getString(2131305701));
    this.pzf.setWebViewClient(new ContactQZoneWebView.1(this));
    this.pzf.loadUrl(this.cOG);
    ab.d("MicroMsg.ContactQZoneWebView", "loadUrl:loadUrl, url = " + this.cOG);
    AppMethodBeat.o(7350);
  }

  public void onResume()
  {
    AppMethodBeat.i(7351);
    super.onResume();
    this.ura = false;
    AppMethodBeat.o(7351);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.ContactQZoneWebView
 * JD-Core Version:    0.6.2
 */