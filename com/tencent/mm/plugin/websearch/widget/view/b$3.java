package com.tencent.mm.plugin.websearch.widget.view;

import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.f;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class b$3
  implements r
{
  b$3(b paramb)
  {
  }

  public final void a(String paramString1, boolean paramBoolean, String paramString2, String paramString3)
  {
    AppMethodBeat.i(91523);
    u.i("WidgetView", "on tap callback eventId %s, consume %b, errMsg %s", new Object[] { paramString1, Boolean.valueOf(paramBoolean), paramString2 });
    if ((paramString3.equals(this.uef.udO)) && (paramString1.equals(this.uef.udP)))
    {
      if (paramBoolean)
        break label85;
      b.b(this.uef);
    }
    while (true)
    {
      this.uef.udP = null;
      AppMethodBeat.o(91523);
      return;
      label85: ab.i("WidgetView", "click event %s consumed by widget", new Object[] { this.uef.udP });
    }
  }

  public final void adG(String paramString)
  {
    AppMethodBeat.i(91524);
    if (paramString.equals(this.uef.udO))
      b.c(this.uef);
    AppMethodBeat.o(91524);
  }

  public final void addView(View paramView)
  {
    AppMethodBeat.i(91519);
    this.uef.udM.removeAllViews();
    this.uef.udM.addView(paramView);
    AppMethodBeat.o(91519);
  }

  public final void cUV()
  {
    AppMethodBeat.i(91528);
    b.c(this.uef);
    AppMethodBeat.o(91528);
  }

  public final void dw(String paramString, int paramInt)
  {
    AppMethodBeat.i(91521);
    if (paramInt == 3)
    {
      if (this.uef.isRetry)
        break label122;
      this.uef.udL.setVisibility(0);
      this.uef.udM.setVisibility(8);
      this.uef.udR.setVisibility(8);
    }
    while (true)
    {
      if (paramInt != 1)
      {
        this.uef.isLoading = false;
        if (this.uef.udH != null)
          this.uef.udH.a(this.uef);
        if (!this.uef.gBF)
          this.uef.udN.onPause();
      }
      AppMethodBeat.o(91521);
      return;
      label122: this.uef.udL.setVisibility(8);
      this.uef.udM.setVisibility(8);
      this.uef.uec.setVisibility(0);
      this.uef.udR.setVisibility(8);
    }
  }

  public final void dx(String paramString, int paramInt)
  {
    AppMethodBeat.i(91527);
    this.uef.udY.ubt.height = paramInt;
    this.uef.udN.a(this.uef.udY, this.uef.udO);
    this.uef.mJs.a(a.fromDPToPix(this.uef.hwd.mController.ylL, paramInt + 131), this.uef);
    AppMethodBeat.o(91527);
  }

  public final void g(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(91526);
    if (paramString1.equals(this.uef.udO))
    {
      this.uef.K(paramString2, paramString3, paramInt);
      AppMethodBeat.o(91526);
    }
    while (true)
    {
      return;
      ab.e("WidgetView", "callback for expired widget %s", new Object[] { paramString1 });
      AppMethodBeat.o(91526);
    }
  }

  public final void g(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(91522);
    a(paramString1, paramBoolean, "", paramString2);
    AppMethodBeat.o(91522);
  }

  public final void gS(String paramString1, String paramString2)
  {
    AppMethodBeat.i(91525);
    ab.i("WidgetView", "onSearchWAWidgetDataPush %s", new Object[] { paramString1 });
    AppMethodBeat.o(91525);
  }

  public final void removeView(View paramView)
  {
    AppMethodBeat.i(91520);
    this.uef.udM.removeAllViews();
    AppMethodBeat.o(91520);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.b.3
 * JD-Core Version:    0.6.2
 */