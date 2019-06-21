package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b;
import com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar;

final class m$a$g$2
  implements Runnable
{
  m$a$g$2(m.a.g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37130);
    m.c(this.rag.raa.qZO).setVisibility(8);
    m.d(this.rag.raa.qZO).setVisibility(0);
    m.d(this.rag.raa.qZO).setText(m.b(this.rag.raa.qZO).title);
    AppMethodBeat.o(37130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.a.g.2
 * JD-Core Version:    0.6.2
 */