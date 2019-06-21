package com.tencent.mm.pluginsdk.ui.preference;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;

final class NormalUserHeaderPreference$6
  implements Runnable
{
  NormalUserHeaderPreference$6(NormalUserHeaderPreference paramNormalUserHeaderPreference)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(28079);
    NormalUserHeaderPreference.f(this.vrk);
    NormalUserHeaderPreference.g(this.vrk);
    NormalUserHeaderPreference.h(this.vrk);
    FMessageListView localFMessageListView;
    if (NormalUserHeaderPreference.i(this.vrk) != null)
    {
      localFMessageListView = NormalUserHeaderPreference.i(this.vrk);
      if (a.jh(NormalUserHeaderPreference.a(this.vrk).field_type))
        break label75;
    }
    label75: for (boolean bool = true; ; bool = false)
    {
      localFMessageListView.setReplyBtnVisible(bool);
      AppMethodBeat.o(28079);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference.6
 * JD-Core Version:    0.6.2
 */