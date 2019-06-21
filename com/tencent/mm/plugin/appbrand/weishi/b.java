package com.tencent.mm.plugin.appbrand.weishi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.launching.params.AppBrandWeishiParams;
import com.tencent.mm.plugin.appbrand.ui.q;
import com.tencent.mm.plugin.appbrand.widget.actionbar.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@SuppressLint({"ViewConstructor"})
public final class b extends FrameLayout
  implements q
{
  private i gPI;
  private com.tencent.mm.plugin.appbrand.widget.actionbar.b iFZ;
  private ImageView iTN;
  private View iTQ;

  public b(Context paramContext, i parami)
  {
    super(paramContext);
    AppMethodBeat.i(133630);
    this.gPI = parami;
    setClickable(true);
    setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    LayoutInflater.from(getContext()).inflate(2130968737, this);
    this.iTQ = findViewById(2131821385);
    this.iTN = ((ImageView)findViewById(2131821218));
    paramContext = (LinearLayout)findViewById(2131821386);
    this.iFZ = f.a.dh(getContext());
    paramContext.addView(this.iFZ.getActionView());
    this.iFZ.setNavResetStyleListener(new b.1(this));
    this.iFZ.setFullscreenMode(true);
    this.iFZ.setForegroundStyle(false);
    this.iFZ.eP(false);
    this.iFZ.aON();
    this.iFZ.setBackButtonClickListener(new b.2(this));
    if ((this.gPI != null) && ((this.gPI.yf() instanceof AppBrandInitConfigLU)))
    {
      parami = (AppBrandInitConfigLU)this.gPI.yf();
      paramContext = parami.bQj.thumbUrl;
      parami = parami.bQj.ijv;
      ab.i("MicroMsg.AppBrandThumbLoadingSplash", "showLaunchThumb, thumbUrl:%s, thumbPath:%s", new Object[] { paramContext, parami });
      if (!bo.isNullOrNil(paramContext))
      {
        cV(paramContext, "file://".concat(String.valueOf(parami)));
        AppMethodBeat.o(133630);
      }
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(parami))
        cV("file://".concat(String.valueOf(parami)), null);
      AppMethodBeat.o(133630);
    }
  }

  private void cV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(133631);
    ab.i("MicroMsg.AppBrandThumbLoadingSplash", "loadThumbImage:%s", new Object[] { paramString1 });
    com.tencent.mm.modelappbrand.a.b.abR().a(new b.3(this, paramString2), paramString1, null, null);
    AppMethodBeat.o(133631);
  }

  public final void aHS()
  {
    AppMethodBeat.i(133632);
    post(new b.4(this));
    AppMethodBeat.o(133632);
  }

  public final void aHT()
  {
  }

  public final void cz(String paramString1, String paramString2)
  {
  }

  public final View getView()
  {
    return this;
  }

  public final void setProgress(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.b
 * JD-Core Version:    0.6.2
 */