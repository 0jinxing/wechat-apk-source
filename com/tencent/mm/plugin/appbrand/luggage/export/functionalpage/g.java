package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.q;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.statusbar.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalLoadingSplash;", "Lcom/tencent/mm/ui/statusbar/DrawStatusBarFrameLayout;", "Lcom/tencent/mm/plugin/appbrand/ui/IAppBrandLoadingSplash;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "progresDialog", "Lcom/tencent/mm/ui/base/MMProgressDialog;", "animateHide", "", "getView", "Landroid/view/View;", "hideNavBtn", "onAttachedToWindow", "onDetachedFromWindow", "onViewAdded", "child", "setAppInfo", "icon", "", "name", "setProgress", "progress", "", "plugin-appbrand-integration_release"})
public final class g extends b
  implements q
{
  private p iku;

  public g(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(134746);
    K(0, true);
    setBackgroundColor(0);
    AppMethodBeat.o(134746);
  }

  public final void aHS()
  {
  }

  public final void aHT()
  {
  }

  public final void cz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(134745);
    j.p(paramString1, "icon");
    j.p(paramString2, "name");
    AppMethodBeat.o(134745);
  }

  public final View getView()
  {
    return (View)this;
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(134743);
    super.onAttachedToWindow();
    Context localContext = getContext();
    getResources().getString(2131297061);
    this.iku = h.b(localContext, getResources().getString(2131300968), false, null);
    AppMethodBeat.o(134743);
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(134744);
    super.onDetachedFromWindow();
    p localp = this.iku;
    if (localp != null)
    {
      localp.dismiss();
      AppMethodBeat.o(134744);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134744);
    }
  }

  public final void onViewAdded(View paramView)
  {
    AppMethodBeat.i(134742);
    super.onViewAdded(paramView);
    if (paramView != null)
    {
      if (paramView.getId() == 2131821483)
      {
        ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
        Object localObject = localLayoutParams;
        if (!(localLayoutParams instanceof FrameLayout.LayoutParams))
          localObject = null;
        localObject = (FrameLayout.LayoutParams)localObject;
        if (localObject != null)
          ((FrameLayout.LayoutParams)localObject).gravity = 17;
        paramView.setLayoutParams(paramView.getLayoutParams());
      }
      AppMethodBeat.o(134742);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134742);
    }
  }

  public final void setProgress(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.g
 * JD-Core Version:    0.6.2
 */