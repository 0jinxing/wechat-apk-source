package com.tencent.mm.plugin.appbrand.share.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3$1
  implements Runnable
{
  a$3$1(a.3 param3, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132741);
    String str = this.cgJ.getString("delay_load_img_path");
    this.iDS.iDQ.setImageUrl(str);
    ab.i("MicroMsg.WxaShareMessageService", "onLoadImageFinishedAction(%s)", new Object[] { str });
    a.a(this.iDS.iDR);
    AppMethodBeat.o(132741);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.share.a.a.3.1
 * JD-Core Version:    0.6.2
 */