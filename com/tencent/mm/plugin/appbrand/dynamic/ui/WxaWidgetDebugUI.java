package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.plugin.appbrand.dynamic.html.CustomURLSpan;
import com.tencent.mm.plugin.appbrand.widget.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class WxaWidgetDebugUI extends MMActivity
{
  String appId;
  int cBc;
  int gVu;
  MMSwitchBtn hpc;
  com.tencent.mm.plugin.appbrand.widget.l hpd;
  String id;

  public final int getLayoutId()
  {
    return 2130971249;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(11015);
    super.onCreate(paramBundle);
    setBackBtn(new WxaWidgetDebugUI.1(this));
    if (((e)g.K(e.class)).abz().abF());
    TextView localTextView;
    for (paramBundle = String.format("(%s)", new Object[] { com.tencent.mm.plugin.appbrand.dynamic.widget.b.aAm() }); ; paramBundle = "")
    {
      setMMTitle(getString(2131305743, new Object[] { paramBundle }));
      paramBundle = getIntent();
      this.id = paramBundle.getStringExtra("id");
      this.appId = paramBundle.getStringExtra("app_id");
      this.cBc = paramBundle.getIntExtra("pkg_type", 0);
      this.gVu = paramBundle.getIntExtra("pkg_version", 0);
      setMMSubTitle(String.format("(%s)", new Object[] { this.id }));
      this.hpc = ((MMSwitchBtn)findViewById(2131829240));
      this.hpd = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.K(com.tencent.mm.plugin.appbrand.widget.a.a.class)).auR().Ev(this.appId);
      if (this.hpd == null)
      {
        this.hpd = new com.tencent.mm.plugin.appbrand.widget.l();
        this.hpd.field_appId = this.appId;
      }
      this.hpc.setCheck(this.hpd.field_openDebug);
      this.hpc.setSwitchListener(new WxaWidgetDebugUI.2(this));
      localTextView = (TextView)findViewById(2131829241);
      Spanned localSpanned = Html.fromHtml(getString(2131305749), new com.tencent.mm.plugin.appbrand.dynamic.html.a(), new com.tencent.mm.plugin.appbrand.dynamic.html.b());
      paramBundle = localSpanned;
      if (!(localSpanned instanceof Spannable))
        break;
      int i = localSpanned.length();
      Spannable localSpannable = (Spannable)localSpanned;
      URLSpan[] arrayOfURLSpan = (URLSpan[])localSpannable.getSpans(0, i, URLSpan.class);
      paramBundle = new SpannableStringBuilder(localSpanned);
      int j = arrayOfURLSpan.length;
      for (i = 0; i < j; i++)
      {
        localSpanned = arrayOfURLSpan[i];
        paramBundle.removeSpan(localSpanned);
        paramBundle.setSpan(new CustomURLSpan(localSpanned.getURL()), localSpannable.getSpanStart(localSpanned), localSpannable.getSpanEnd(localSpanned), 34);
      }
    }
    localTextView.setText(paramBundle);
    localTextView.setMovementMethod(LinkMovementMethod.getInstance());
    findViewById(2131827404).setOnClickListener(new WxaWidgetDebugUI.3(this));
    paramBundle = findViewById(2131829242);
    if (((e)g.K(e.class)).abz().abF())
    {
      paramBundle.setVisibility(0);
      paramBundle.setOnClickListener(new WxaWidgetDebugUI.4(this));
      AppMethodBeat.o(11015);
    }
    while (true)
    {
      return;
      paramBundle.setVisibility(8);
      AppMethodBeat.o(11015);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetDebugUI
 * JD-Core Version:    0.6.2
 */