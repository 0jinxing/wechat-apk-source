package com.tencent.mm.plugin.game.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;

final class e$2
  implements Runnable
{
  e$2(Context paramContext, f paramf, WXMediaMessage paramWXMediaMessage, aj paramaj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111197);
    g.a(this.val$context, this.kNP.field_packageName, this.kNQ, this.kNP.field_appId, this.kNP.field_openId, 0, this.kNO, null);
    AppMethodBeat.o(111197);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.e.2
 * JD-Core Version:    0.6.2
 */