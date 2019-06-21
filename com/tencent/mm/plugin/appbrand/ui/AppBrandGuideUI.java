package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.model.o;
import com.tencent.mm.plugin.appbrand.report.model.o.a;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.widget.a.c.a;

@com.tencent.mm.ui.base.a(7)
public final class AppBrandGuideUI extends MMActivity
  implements com.tencent.mm.plugin.appbrand.ui.banner.f
{
  public final void bg(String paramString, int paramInt)
  {
    AppMethodBeat.i(132963);
    finish();
    AppMethodBeat.o(132963);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(132961);
    setTheme(2131492897);
    super.onCreate(paramBundle);
    ae.a(getWindow());
    paramBundle = com.tencent.mm.plugin.appbrand.app.f.auN();
    if (paramBundle == null)
    {
      super.finish();
      AppMethodBeat.o(132961);
    }
    while (true)
    {
      return;
      AppBrandStickyBannerLogic.b.d(this);
      c.a locala = new c.a(this);
      locala.PV(2131296613);
      ImageView localImageView = new ImageView(this);
      localImageView.setImageResource(2130837743);
      TextView localTextView = new TextView(this);
      localTextView.setText(2131296659);
      localTextView.setTextSize(2, 14.0F);
      localTextView.setTextColor(Color.argb(Math.round(137.70001F), 0, 0, 0));
      localTextView.setLineSpacing(0.0F, 1.2F);
      Object localObject = new LinearLayout(this);
      ((LinearLayout)localObject).setOrientation(1);
      ((LinearLayout)localObject).addView(localImageView, new LinearLayout.LayoutParams(-1, -2));
      ((LinearLayout)localObject).addView(localTextView, new LinearLayout.LayoutParams(-1, -2));
      ((ViewGroup.MarginLayoutParams)localTextView.getLayoutParams()).topMargin = com.tencent.mm.bz.a.fromDPToPix(this, 16);
      locala.fn((View)localObject);
      locala.a(new AppBrandGuideUI.1(this));
      locala.Qd(2131298338);
      locala.b(new AppBrandGuideUI.2(this));
      locala.Qc(2131296658);
      locala.a(false, new AppBrandGuideUI.3(this));
      locala.rc(false);
      locala.rd(true);
      localObject = locala.aMb();
      ((Dialog)localObject).setOnKeyListener(new AppBrandGuideUI.4(this));
      ((Dialog)localObject).show();
      o.a(o.a.iCr, paramBundle.iGE);
      paramBundle.iGD = false;
      paramBundle.iGE = null;
      AppMethodBeat.o(132961);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(132962);
    super.onDestroy();
    AppBrandStickyBannerLogic.b.c(this);
    AppMethodBeat.o(132962);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI
 * JD-Core Version:    0.6.2
 */