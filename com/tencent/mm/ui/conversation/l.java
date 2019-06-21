package com.tencent.mm.ui.conversation;

import android.os.HandlerThread;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;

public final class l
{
  d ein;
  ListView zqz;
  h zrd;
  boolean zvp;
  private al zvq;
  private Runnable zvr;
  int zvs;

  public l()
  {
    AppMethodBeat.i(34576);
    this.zvp = false;
    this.zvs = -1;
    this.ein = new d(new l.1(this));
    AppMethodBeat.o(34576);
  }

  final void dIV()
  {
    AppMethodBeat.i(34577);
    if (!this.zvp)
    {
      ab.d("MicroMsg.PreLoadHelper", "Jacks cancel PreLoad.");
      this.zvp = true;
    }
    if ((this.zvq != null) && (this.zvr != null))
      this.zvq.doN().removeCallbacks(this.zvr);
    if (this.zvq != null)
    {
      this.zvq.oAl.quit();
      this.zvq = null;
    }
    AppMethodBeat.o(34577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.l
 * JD-Core Version:    0.6.2
 */