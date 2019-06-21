package com.tencent.mm.plugin.appbrand.page;

import a.f.b.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.actionbar.b;
import com.tencent.mm.plugin.appbrand.widget.i.a;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/page/AppBrandDecorWidgetFactoryWC;", "Lcom/tencent/mm/plugin/appbrand/page/PageDecorWidgetFactory$DefaultFactory;", "()V", "mScreenAdaptiveViews", "", "Ljava/lang/Class;", "Landroid/view/ViewGroup;", "[Ljava/lang/Class;", "contains", "", "array", "objectToFind", "", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "onCreateWidget", "WIDGET", "Landroid/view/View;", "context", "Landroid/content/Context;", "clazz", "(Landroid/content/Context;Ljava/lang/Class;)Landroid/view/View;", "plugin-appbrand-integration_release"})
public final class d extends ap.a
{
  private final Class<? extends ViewGroup>[] iqS;

  public d()
  {
    AppMethodBeat.i(134758);
    this.iqS = new Class[] { b.class, a.class };
    AppMethodBeat.o(134758);
  }

  public final <WIDGET extends View> WIDGET b(Context paramContext, Class<WIDGET> paramClass)
  {
    int i = 0;
    AppMethodBeat.i(134757);
    j.p(paramContext, "context");
    j.p(paramClass, "clazz");
    Class[] arrayOfClass = this.iqS;
    int j = arrayOfClass.length;
    int k = 0;
    int m = i;
    if (k < j)
    {
      if (j.j(arrayOfClass[k], paramClass))
        m = 1;
    }
    else
    {
      if (m == 0)
        break label93;
      paramContext = super.b((Context)new com.tencent.mm.plugin.appbrand.ui.l(paramContext), paramClass);
      AppMethodBeat.o(134757);
    }
    while (true)
    {
      return paramContext;
      k++;
      break;
      label93: paramContext = super.b(paramContext, paramClass);
      AppMethodBeat.o(134757);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.d
 * JD-Core Version:    0.6.2
 */