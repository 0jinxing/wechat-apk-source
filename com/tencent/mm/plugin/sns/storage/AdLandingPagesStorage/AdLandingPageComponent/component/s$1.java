package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.k;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;

final class s$1
  implements View.OnClickListener
{
  s$1(s params, k paramk)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(37235);
    this.rbq.cpH();
    f localf = g.bT(this.rbp.qWm, true);
    if ((localf == null) || (TextUtils.isEmpty(localf.field_packageName)) || (!this.rbq.v(paramView.getContext(), localf.field_packageName, g.b(paramView.getContext(), localf, null))))
      this.rbq.cpJ();
    AppMethodBeat.o(37235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s.1
 * JD-Core Version:    0.6.2
 */