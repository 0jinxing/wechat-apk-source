package com.tencent.mm.plugin.masssend.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ap;

final class b$2
  implements j.a
{
  b$2(b paramb)
  {
  }

  public final void onError()
  {
    AppMethodBeat.i(22768);
    this.ooz.oos.reset();
    this.ooz.gci.stopTimer();
    this.ooz.miP.stopTimer();
    aj.amB("keep_app_silent");
    this.ooz.oor.bvH();
    ab.v("MicroMsg.MassSendFooterEventImpl", "record stop on error");
    Toast.makeText(this.ooz.ooq, this.ooz.ooq.getString(2131298207), 0).show();
    AppMethodBeat.o(22768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.b.2
 * JD-Core Version:    0.6.2
 */