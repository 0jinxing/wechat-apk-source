package com.tencent.mm.plugin.freewifi.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class FreeWifiTestActivity$1
  implements View.OnClickListener
{
  FreeWifiTestActivity$1(FreeWifiTestActivity paramFreeWifiTestActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21108);
    Toast.makeText(ah.getContext(), "test message", 0).show();
    AppMethodBeat.o(21108);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiTestActivity.1
 * JD-Core Version:    0.6.2
 */