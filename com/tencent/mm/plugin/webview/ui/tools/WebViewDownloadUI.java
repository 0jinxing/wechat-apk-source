package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.downloader.model.b;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;

public class WebViewDownloadUI extends MMActivity
{
  private long hxO;
  private TextView kGq;
  private int kNb;
  private Context mContext;
  private boolean ump;
  private Button utd;
  private TextView ute;
  private WebViewDownloadUI.a utf;
  private String utg;
  private TextView uth;
  private int uti;
  private k utj;

  public WebViewDownloadUI()
  {
    AppMethodBeat.i(7607);
    this.utj = new WebViewDownloadUI.4(this);
    AppMethodBeat.o(7607);
  }

  private void a(WebViewDownloadUI.a parama)
  {
    AppMethodBeat.i(7610);
    ab.i("MicroMsg.WebViewDownloadUI", "setDownloadState old=%s new=%s", new Object[] { this.utf, parama });
    this.utf = parama;
    switch (WebViewDownloadUI.5.utp[this.utf.ordinal()])
    {
    default:
      AppMethodBeat.o(7610);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      this.utd.setVisibility(0);
      this.kGq.setVisibility(8);
      this.ute.setVisibility(8);
      do
      {
        this.uth.setVisibility(8);
        break;
        this.utd.setVisibility(8);
        this.ute.setVisibility(0);
        this.kGq.setVisibility(0);
      }
      while (bo.isNullOrNil(this.utg));
      this.uth.setVisibility(0);
      AppMethodBeat.o(7610);
    }
  }

  public final int getLayoutId()
  {
    return 2130971212;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7608);
    super.onCreate(paramBundle);
    this.mContext = this;
    setMMTitle(getString(2131305547));
    setBackBtn(new WebViewDownloadUI.1(this));
    overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
    this.utd = ((Button)findViewById(2131829167));
    this.ute = ((TextView)findViewById(2131829169));
    TextView localTextView = (TextView)findViewById(2131829165);
    this.uth = ((TextView)findViewById(2131829166));
    ImageView localImageView = (ImageView)findViewById(2131829164);
    this.kGq = ((TextView)findViewById(2131829168));
    a(WebViewDownloadUI.a.utq);
    String str1 = getIntent().getStringExtra("task_name");
    String str2 = getIntent().getStringExtra("task_url");
    String str3 = getIntent().getStringExtra("alternative_url");
    long l = getIntent().getLongExtra("task_size", 0L);
    String str4 = getIntent().getStringExtra("file_md5");
    String str5 = getIntent().getStringExtra("extInfo");
    paramBundle = getIntent().getStringExtra("fileType");
    String str6 = getIntent().getStringExtra("appid");
    String str7 = getIntent().getStringExtra("package_name");
    String str8 = getIntent().getStringExtra("thumb_url");
    Object localObject = getIntent().getStringExtra("title");
    String str9 = getIntent().getStringExtra("page_url");
    int i = getIntent().getIntExtra("task_scene", 0);
    this.uti = getIntent().getIntExtra("page_scene", 0);
    com.tencent.mm.plugin.report.service.h.pYm.e(14217, new Object[] { str6, Integer.valueOf(1), str9, str2, Integer.valueOf(0) });
    this.kNb = bo.getInt(paramBundle, 1);
    paramBundle = (Bundle)localObject;
    if (bo.isNullOrNil((String)localObject))
      paramBundle = bo.nullAsNil(str1);
    if (!bo.isNullOrNil(paramBundle))
    {
      localTextView.setText(paramBundle);
      localTextView.setVisibility(0);
    }
    if (l > 0L)
    {
      this.utg = bo.my(l);
      this.uth.setText(this.utg);
      this.utd.setText(getString(2131305538, new Object[] { this.utg }));
    }
    localObject = o.ahp();
    paramBundle = new c.a();
    paramBundle.ePT = 2131232160;
    paramBundle.ePH = true;
    ((com.tencent.mm.at.a.a)localObject).a(str8, localImageView, paramBundle.ahG());
    this.utd.setOnClickListener(new WebViewDownloadUI.2(this, str2, str4, str5, str6, str3, str9, str1, str7, i));
    this.ute.setOnClickListener(new WebViewDownloadUI.3(this, str6, str9, str2));
    d.bij();
    b.a(this.utj);
    AppMethodBeat.o(7608);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(7609);
    super.onDestroy();
    ab.i("MicroMsg.WebViewDownloadUI", "onDestroy hasCallback=%b", new Object[] { Boolean.valueOf(this.ump) });
    if (!this.ump)
    {
      com.tencent.mm.g.a.h localh = new com.tencent.mm.g.a.h();
      localh.crX.crY = true;
      localh.crX.scene = this.uti;
      com.tencent.mm.sdk.b.a.xxA.m(localh);
      this.ump = true;
    }
    d.bij();
    b.b(this.utj);
    AppMethodBeat.o(7609);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI
 * JD-Core Version:    0.6.2
 */