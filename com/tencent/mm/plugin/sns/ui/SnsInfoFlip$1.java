package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MMGestureGallery.f;

final class SnsInfoFlip$1
  implements MMGestureGallery.f
{
  SnsInfoFlip$1(SnsInfoFlip paramSnsInfoFlip, Context paramContext)
  {
  }

  public final void bcX()
  {
    AppMethodBeat.i(38967);
    if ((this.val$context instanceof SnsBrowseUI))
    {
      ((SnsBrowseUI)this.val$context).bcW();
      AppMethodBeat.o(38967);
    }
    while (true)
    {
      return;
      if (SnsInfoFlip.a(this.rsU))
      {
        ((MMActivity)this.val$context).finish();
        AppMethodBeat.o(38967);
      }
      else
      {
        SnsInfoFlip.c(this.rsU).post(new SnsInfoFlip.1.1(this));
        AppMethodBeat.o(38967);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsInfoFlip.1
 * JD-Core Version:    0.6.2
 */