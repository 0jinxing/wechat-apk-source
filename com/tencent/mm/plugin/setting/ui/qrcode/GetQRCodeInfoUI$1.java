package com.tencent.mm.plugin.setting.ui.qrcode;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.pluginsdk.n;

final class GetQRCodeInfoUI$1
  implements bk.a
{
  GetQRCodeInfoUI$1(GetQRCodeInfoUI paramGetQRCodeInfoUI)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(126902);
    if (parame == null)
    {
      this.qkv.finish();
      AppMethodBeat.o(126902);
    }
    while (true)
    {
      return;
      if ((g.RK()) && (!a.QT()))
      {
        GetQRCodeInfoUI.a(this.qkv, this.qkv.getIntent().getDataString());
        AppMethodBeat.o(126902);
      }
      else
      {
        b.gkE.p(new Intent(), this.qkv);
        this.qkv.finish();
        AppMethodBeat.o(126902);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI.1
 * JD-Core Version:    0.6.2
 */