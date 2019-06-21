package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import java.lang.ref.WeakReference;

final class b$j
  implements Runnable
{
  private b$j(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37429);
    if ((b.e(this.rct) < 0) || (b.j(this.rct) == null) || (b.j(this.rct).get() == null))
      AppMethodBeat.o(37429);
    while (true)
    {
      return;
      String str = SightVideoJNI.getVideoInfo(b.e(this.rct));
      ((TextView)b.j(this.rct).get()).setText(str);
      AppMethodBeat.o(37429);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.j
 * JD-Core Version:    0.6.2
 */