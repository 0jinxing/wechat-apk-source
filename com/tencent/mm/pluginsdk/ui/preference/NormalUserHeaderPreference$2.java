package com.tencent.mm.pluginsdk.ui.preference;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.story.api.n;

final class NormalUserHeaderPreference$2
  implements View.OnClickListener
{
  NormalUserHeaderPreference$2(NormalUserHeaderPreference paramNormalUserHeaderPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(28072);
    n.aT(NormalUserHeaderPreference.b(this.vrk), NormalUserHeaderPreference.a(this.vrk).field_username);
    AppMethodBeat.o(28072);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference.2
 * JD-Core Version:    0.6.2
 */