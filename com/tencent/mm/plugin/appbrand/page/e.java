package com.tencent.mm.plugin.appbrand.page;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.plugin.appbrand.config.a.b;
import com.tencent.mm.plugin.appbrand.widget.g;

@SuppressLint({"ViewConstructor"})
public final class e extends LinearLayout
{
  private ImageView iqT;
  private TextView iqU;
  private Button iqV;

  public e(Context paramContext, com.tencent.luggage.sdk.b.b paramb)
  {
    super(paramContext);
    AppMethodBeat.i(102213);
    inflate(getContext(), 2130968679, this);
    this.iqT = ((ImageView)findViewById(2131821109));
    this.iqU = ((TextView)findViewById(2131821172));
    this.iqV = ((Button)findViewById(2131821173));
    this.iqU.setText(getResources().getString(2131301226, new Object[] { paramb.xZ().cwz }));
    paramContext = (LinearLayout.LayoutParams)this.iqT.getLayoutParams();
    if ((paramb.getAppConfig() != null) && (paramb.getAppConfig().heS != null) && (paramb.getAppConfig().heS.ayx()));
    while (true)
    {
      if (i != 0)
      {
        paramContext.topMargin = com.tencent.mm.bz.a.am(getContext(), 2131427997);
        this.iqT.setLayoutParams(paramContext);
        requestLayout();
      }
      paramContext = new ColorMatrix();
      paramContext.setSaturation(0.0F);
      paramContext = new ColorMatrixColorFilter(paramContext);
      this.iqT.setColorFilter(paramContext);
      com.tencent.mm.modelappbrand.a.b.abR().a(this.iqT, paramb.xZ().hgW, ((g)paramb.K(g.class)).aOG(), f.fqH);
      this.iqV.setVisibility(8);
      setBackgroundColor(-1);
      AppMethodBeat.o(102213);
      return;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.e
 * JD-Core Version:    0.6.2
 */