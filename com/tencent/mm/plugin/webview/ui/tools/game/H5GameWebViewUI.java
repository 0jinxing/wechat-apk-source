package com.tencent.mm.plugin.webview.ui.tools.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.k;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.widget.MMWebView;

@a(19)
public class H5GameWebViewUI extends GameWebViewUI
{
  private int otH;

  public final boolean aYc()
  {
    return false;
  }

  public final boolean dab()
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(8777);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.H5GameWebViewUI", "onCreate");
    this.uvn = false;
    this.otH = this.screenOrientation;
    AppMethodBeat.o(8777);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(8778);
    ab.i("MicroMsg.H5GameWebViewUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    boolean bool = getIntent().getBooleanExtra("show_full_screen", false);
    setIntent(paramIntent);
    paramIntent = paramIntent.getStringExtra("rawUrl");
    ab.d("MicroMsg.H5GameWebViewUI", "url = ".concat(String.valueOf(paramIntent)));
    if (!this.uvm.equals(paramIntent))
    {
      if (paramIntent.startsWith("http://game.weixin.qq.com/cgi-bin/h5/static/gameloading/index.html"))
        this.uvm = paramIntent;
      if (!this.cOG.equals(paramIntent))
      {
        this.cOG = paramIntent;
        this.screenOrientation = getIntent().getIntExtra("screen_orientation", -1);
        this.uvR.jVi = this.cOG;
        if (this.icz == null)
        {
          this.icz = new k((JsapiPermissionWrapper)getIntent().getParcelableExtra("hardcode_jspermission"), (GeneralControlWrapper)getIntent().getParcelableExtra("hardcode_general_ctrl"), new H5GameWebViewUI.1(this));
          this.pzf.loadUrl("about:blank");
          as(this.cOG, false);
          AppMethodBeat.o(8778);
        }
      }
    }
    while (true)
    {
      return;
      this.icz.a(paramIntent, null, null);
      break;
      this.screenOrientation = this.otH;
      getIntent().putExtra("show_full_screen", bool);
      dak();
      AppMethodBeat.o(8778);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(8779);
    aBS();
    super.onResume();
    AppMethodBeat.o(8779);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.H5GameWebViewUI
 * JD-Core Version:    0.6.2
 */