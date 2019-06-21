package com.tencent.mm.plugin.appbrand.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.statusbar.b;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.vending.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"runIfDrawStatusBarLayoutPresent", "", "activity", "Lcom/tencent/mm/ui/MMActivity;", "function", "Lcom/tencent/mm/vending/functional/Functional;", "Ljava/lang/Void;", "Lcom/tencent/mm/ui/statusbar/DrawStatusBarFrameLayout;", "plugin-appbrand-integration_release"})
public final class o
{
  public static final void a(MMActivity paramMMActivity, a<Void, b> parama)
  {
    AppMethodBeat.i(135002);
    paramMMActivity = paramMMActivity.getSwipeBackLayout();
    if (paramMMActivity != null)
    {
      paramMMActivity = paramMMActivity.getTargetContentView();
      MMActivity localMMActivity = paramMMActivity;
      if (!(paramMMActivity instanceof b))
        localMMActivity = null;
      paramMMActivity = (b)localMMActivity;
      if (paramMMActivity == null)
        break label58;
      parama.call(paramMMActivity);
      AppMethodBeat.o(135002);
    }
    while (true)
    {
      return;
      paramMMActivity = null;
      break;
      label58: AppMethodBeat.o(135002);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.o
 * JD-Core Version:    0.6.2
 */