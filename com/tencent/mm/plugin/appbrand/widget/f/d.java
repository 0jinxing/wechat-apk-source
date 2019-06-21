package com.tencent.mm.plugin.appbrand.widget.f;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/prompt/AutoDismissRunner;", "Ljava/lang/Runnable;", "toast", "Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "(Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;)V", "ref", "Ljava/lang/ref/WeakReference;", "run", "", "plugin-appbrand-integration_release"})
final class d
  implements Runnable
{
  private final WeakReference<c> iuM;

  public d(c paramc)
  {
    AppMethodBeat.i(135267);
    this.iuM = new WeakReference(paramc);
    AppMethodBeat.o(135267);
  }

  public final void run()
  {
    AppMethodBeat.i(135266);
    c localc = (c)this.iuM.get();
    if (localc != null)
    {
      localc.dismiss();
      AppMethodBeat.o(135266);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135266);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.f.d
 * JD-Core Version:    0.6.2
 */