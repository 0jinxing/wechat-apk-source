package com.tencent.mm.plugin.setting.ui.fixtools;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.model.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class FixToolsUpLogUploadingUI$3
  implements a.a
{
  FixToolsUpLogUploadingUI$3(FixToolsUpLogUploadingUI paramFixToolsUpLogUploadingUI)
  {
  }

  public final void Ci(int paramInt)
  {
    AppMethodBeat.i(126888);
    ab.i("MicroMsg.FixToolsUpLogUploadingUI", "fixToolsUplogProgressCallback percent:%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt < 0)
    {
      h.pYm.a(873L, 18L, 1L, false);
      FixToolsUpLogUploadingUI.c(this.qkn).setImageResource(2131231303);
      FixToolsUpLogUploadingUI.d(this.qkn).setText(2131299890);
      this.qkn.qkm.setVisibility(8);
      FixToolsUpLogUploadingUI.e(this.qkn).setVisibility(0);
      AppMethodBeat.o(126888);
    }
    while (true)
    {
      return;
      if (paramInt >= 100)
      {
        h.pYm.a(873L, 17L, 1L, false);
        FixToolsUpLogUploadingUI.c(this.qkn).setImageResource(2131231304);
        FixToolsUpLogUploadingUI.d(this.qkn).setText(2131299891);
        this.qkn.qkm.setVisibility(8);
        FixToolsUpLogUploadingUI.e(this.qkn).setVisibility(0);
        AppMethodBeat.o(126888);
      }
      else
      {
        this.qkn.qkm.setProgress(paramInt);
        AppMethodBeat.o(126888);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI.3
 * JD-Core Version:    0.6.2
 */