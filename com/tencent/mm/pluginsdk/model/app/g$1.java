package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req;

final class g$1
  implements Runnable
{
  g$1(ShowMessageFromWX.Req paramReq, String paramString, Context paramContext, aj paramaj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79255);
    Bundle localBundle = new Bundle();
    this.vbU.toBundle(localBundle);
    p.at(localBundle);
    p.au(localBundle);
    MMessageActV2.Args localArgs = new MMessageActV2.Args();
    localArgs.targetPkgName = this.II;
    localArgs.bundle = localBundle;
    boolean bool = MMessageActV2.send(this.val$context, localArgs);
    if (this.kNO != null)
      this.kNO.dR(bool);
    AppMethodBeat.o(79255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.g.1
 * JD-Core Version:    0.6.2
 */