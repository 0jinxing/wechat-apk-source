package com.tencent.mm.plugin.sns.ui.d;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$36
  implements View.OnClickListener
{
  b$36(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40298);
    if (!(paramView.getTag() instanceof String))
      AppMethodBeat.o(40298);
    while (true)
    {
      return;
      paramView = (String)paramView.getTag();
      paramView = af.cnF().YT(paramView);
      if (paramView == null)
      {
        AppMethodBeat.o(40298);
      }
      else if (paramView.DI(32))
      {
        ab.i("MicroMsg.TimelineClickListener", "click the ad tailLink button");
        com.tencent.mm.plugin.sns.storage.a locala = b.a(this.rKt, paramView);
        if (locala == null)
        {
          ab.e("MicroMsg.TimelineClickListener", "the adInfo is null");
          AppMethodBeat.o(40298);
        }
        else if (bo.isNullOrNil(locala.qTH))
        {
          ab.e("MicroMsg.TimelineClickListener", "the adActionExtTailLink is null");
          AppMethodBeat.o(40298);
        }
        else
        {
          ab.i("MicroMsg.TimelineClickListener", "open webview url : " + locala.qTH);
          paramView = new Intent();
          paramView.putExtra("jsapiargs", new Bundle());
          paramView.putExtra("useJs", true);
          paramView.putExtra("rawUrl", locala.qTH);
          com.tencent.mm.plugin.sns.c.a.gkE.i(paramView, this.rKt.activity);
          AppMethodBeat.o(40298);
        }
      }
      else
      {
        AppMethodBeat.o(40298);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.36
 * JD-Core Version:    0.6.2
 */