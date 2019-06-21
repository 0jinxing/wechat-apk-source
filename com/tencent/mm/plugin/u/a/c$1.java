package com.tencent.mm.plugin.u.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.pluginsdk.n;

final class c$1
  implements DialogInterface.OnClickListener
{
  c$1(Intent paramIntent, h paramh, int paramInt1, int paramInt2, c.a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(80757);
    this.val$intent.putExtra("title", this.pAz.getTitle());
    this.val$intent.putExtra("rawUrl", this.pAz.aiT());
    if (this.pAA == 2)
      this.val$intent.putExtra("stastic_scene", 13);
    while (true)
    {
      this.val$intent.putExtra("pay_channel", c.Bx(this.jOj));
      this.val$intent.putExtra("geta8key_session_id", this.pAz.ajb());
      this.val$intent.putExtra("geta8key_cookie", this.pAz.ajc());
      com.tencent.mm.plugin.scanner.c.gkE.i(this.val$intent, this.pAB.getContext());
      AppMethodBeat.o(80757);
      return;
      if (this.pAA == 1)
        this.val$intent.putExtra("stastic_scene", 14);
      else
        this.val$intent.putExtra("stastic_scene", 11);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.c.1
 * JD-Core Version:    0.6.2
 */