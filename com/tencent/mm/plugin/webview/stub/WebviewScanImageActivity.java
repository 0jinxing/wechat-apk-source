package com.tencent.mm.plugin.webview.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.am;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

@com.tencent.mm.ui.base.a(7)
public class WebviewScanImageActivity extends Activity
{
  private int cvn;
  private int cvo;
  private String ffl;
  private String riC;
  private c riJ;
  private boolean uqS;
  private String uqT;
  private String url;

  public WebviewScanImageActivity()
  {
    AppMethodBeat.i(7336);
    this.uqS = false;
    this.riC = null;
    this.riJ = new WebviewScanImageActivity.1(this);
    AppMethodBeat.o(7336);
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7337);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.WebviewScanImageActivity", "hy: on create");
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().addFlags(-2147483648);
      getWindow().setStatusBarColor(0);
    }
    setContentView(2130969926);
    AppMethodBeat.o(7337);
  }

  protected void onPause()
  {
    AppMethodBeat.i(7339);
    super.onPause();
    ab.i("MicroMsg.WebviewScanImageActivity", "hy: on pause");
    am localam = new am();
    localam.ctA.activity = this;
    localam.ctA.ctB = this.riC;
    com.tencent.mm.sdk.b.a.xxA.m(localam);
    com.tencent.mm.sdk.b.a.xxA.d(this.riJ);
    finish();
    AppMethodBeat.o(7339);
  }

  protected void onStart()
  {
    AppMethodBeat.i(7338);
    super.onStart();
    ab.i("MicroMsg.WebviewScanImageActivity", "hy: on start");
    if ((!this.uqS) && (getIntent() != null))
    {
      this.riC = getIntent().getStringExtra("key_string_for_scan");
      this.cvn = getIntent().getIntExtra("key_codetype_for_scan", 0);
      this.cvo = getIntent().getIntExtra("key_codeversion_for_scan", 0);
      this.url = getIntent().getStringExtra("key_string_for_url");
      this.ffl = getIntent().getStringExtra("key_string_for_image_url");
      this.uqT = getIntent().getStringExtra("key_string_for_wxapp_id");
      if (this.riC != null)
      {
        com.tencent.mm.sdk.b.a.xxA.c(this.riJ);
        cf localcf = new cf();
        localcf.cvm.activity = this;
        localcf.cvm.ctB = this.riC;
        localcf.cvm.cvo = this.cvo;
        localcf.cvm.cvn = this.cvn;
        localcf.cvm.cvp = 6;
        localcf.cvm.imagePath = this.ffl;
        localcf.cvm.scene = 40;
        Bundle localBundle = new Bundle();
        localBundle.putString("stat_app_id", this.uqT);
        localBundle.putString("stat_url", this.url);
        localBundle.putInt("stat_scene", 4);
        localcf.cvm.cvs = localBundle;
        com.tencent.mm.sdk.b.a.xxA.m(localcf);
      }
    }
    this.uqS = true;
    AppMethodBeat.o(7338);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity
 * JD-Core Version:    0.6.2
 */