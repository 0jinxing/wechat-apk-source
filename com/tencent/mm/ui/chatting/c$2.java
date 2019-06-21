package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.pluginsdk.model.app.ah;
import com.tencent.mm.pluginsdk.model.app.y;

final class c$2
  implements DialogInterface.OnClickListener
{
  c$2(c paramc, j.b paramb, String paramString, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(30380);
    paramDialogInterface = new y(2, new ah(this.hWW.appId, "1"));
    c.a(this.yGH, paramDialogInterface);
    paramDialogInterface = a.a.bDb();
    if (paramDialogInterface != null)
    {
      c.a(this.yGH).yTx.getContext();
      paramDialogInterface.a(this.yGJ, this.hWW.appId, this.hWW.type, this.yGK, this.hWW.mediaTagName, 1);
    }
    AppMethodBeat.o(30380);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.2
 * JD-Core Version:    0.6.2
 */