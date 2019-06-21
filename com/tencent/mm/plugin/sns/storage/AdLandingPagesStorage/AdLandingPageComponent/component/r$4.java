package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$4
  implements ac
{
  r$4(r paramr, Context paramContext)
  {
  }

  public final void lb(boolean paramBoolean)
  {
    AppMethodBeat.i(37207);
    Intent localIntent = new Intent("com.tencent.mm.adlanding.video_progressbar_change");
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localIntent.putExtra("show", i);
      d.S(this.val$context).c(localIntent);
      AppMethodBeat.o(37207);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r.4
 * JD-Core Version:    0.6.2
 */