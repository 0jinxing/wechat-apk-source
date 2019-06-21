package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.tools.e.b;

final class SnsOnlineVideoActivity$4
  implements e.b
{
  SnsOnlineVideoActivity$4(SnsOnlineVideoActivity paramSnsOnlineVideoActivity)
  {
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(39147);
    new ak().post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(39146);
        Intent localIntent = new Intent();
        localIntent.putExtra("sns_update_preview_video_del", SnsOnlineVideoActivity.q(SnsOnlineVideoActivity.4.this.rvf));
        SnsOnlineVideoActivity.4.this.rvf.setResult(-1, localIntent);
        SnsOnlineVideoActivity.4.this.rvf.finish();
        SnsOnlineVideoActivity.4.this.rvf.overridePendingTransition(0, 0);
        AppMethodBeat.o(39146);
      }
    });
    AppMethodBeat.o(39147);
  }

  public final void onAnimationStart()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.4
 * JD-Core Version:    0.6.2
 */