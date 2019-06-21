package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;

final class q
  implements HelperHeaderPreference.a
{
  private Context context;

  public q(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void a(HelperHeaderPreference paramHelperHeaderPreference)
  {
    AppMethodBeat.i(23616);
    if ((r.YK() & 0x2000) == 0);
    for (boolean bool = true; ; bool = false)
    {
      paramHelperHeaderPreference.jR(bool);
      AppMethodBeat.o(23616);
      return;
    }
  }

  public final CharSequence getHint()
  {
    AppMethodBeat.i(23615);
    String str = this.context.getString(2131298521);
    AppMethodBeat.o(23615);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.q
 * JD-Core Version:    0.6.2
 */