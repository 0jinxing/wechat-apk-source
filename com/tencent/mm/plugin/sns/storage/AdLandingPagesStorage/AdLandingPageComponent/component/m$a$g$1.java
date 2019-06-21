package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$a$g$1
  implements Runnable
{
  m$a$g$1(m.a.g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37129);
    if (m.e(this.rag.raa.qZO) == null)
    {
      m.a(this.rag.raa.qZO, new m.b(this.rag.raa.qZO, (byte)0));
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.PACKAGE_ADDED");
      localIntentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
      localIntentFilter.addDataScheme("package");
      this.rag.raa.qZO.context.registerReceiver(m.e(this.rag.raa.qZO), localIntentFilter);
    }
    AppMethodBeat.o(37129);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.g.1
 * JD-Core Version:    0.6.2
 */