package com.tencent.mm.plugin.setting.ui.qrcode;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.model.i;

final class ShareToQQUI$5 extends i
{
  ShareToQQUI$5(ShareToQQUI paramShareToQQUI)
  {
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(126924);
    super.onError(paramInt, paramString);
    if (paramInt == 3)
      ShareToQQUI.d(this.qkA);
    AppMethodBeat.o(126924);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(126923);
    super.p(paramBundle);
    AppMethodBeat.o(126923);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI.5
 * JD-Core Version:    0.6.2
 */