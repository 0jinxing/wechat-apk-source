package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b;
import com.tencent.mm.pluginsdk.model.app.g;

final class m$3
  implements Runnable
{
  m$3(m paramm, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37103);
    g.a(this.qZO.context, this.val$intent, g.t(this.qZO.context, m.b(this.qZO).csB), new m.3.1(this));
    AppMethodBeat.o(37103);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.3
 * JD-Core Version:    0.6.2
 */