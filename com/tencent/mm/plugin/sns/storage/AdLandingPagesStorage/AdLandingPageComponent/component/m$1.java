package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$1
  implements View.OnClickListener
{
  m$1(m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37100);
    m.a(this.qZO).sendMessage(0);
    this.qZO.cpH();
    AppMethodBeat.o(37100);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.1
 * JD-Core Version:    0.6.2
 */