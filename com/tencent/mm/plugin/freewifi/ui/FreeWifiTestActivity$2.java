package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class FreeWifiTestActivity$2
  implements View.OnClickListener
{
  FreeWifiTestActivity$2(FreeWifiTestActivity paramFreeWifiTestActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21109);
    h.a(this.mAq, "t12345", "t54331", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    }
    , null);
    AppMethodBeat.o(21109);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiTestActivity.2
 * JD-Core Version:    0.6.2
 */