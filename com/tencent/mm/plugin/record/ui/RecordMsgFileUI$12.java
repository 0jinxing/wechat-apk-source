package com.tencent.mm.plugin.record.ui;

import android.graphics.Bitmap;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.plugin.record.b.l;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class RecordMsgFileUI$12
  implements e.a
{
  RecordMsgFileUI$12(RecordMsgFileUI paramRecordMsgFileUI)
  {
  }

  public final void EA()
  {
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24268);
    RecordMsgFileUI.i(this.pKI).stop();
    if (RecordMsgFileUI.j(this.pKI))
      AppMethodBeat.o(24268);
    while (true)
    {
      return;
      RecordMsgFileUI.k(this.pKI);
      Bitmap localBitmap = RecordMsgFileUI.l(this.pKI).b(RecordMsgFileUI.a(this.pKI), RecordMsgFileUI.b(this.pKI));
      String str = RecordMsgFileUI.i(this.pKI).getVideoPath();
      b.A(Base64.encodeToString((d.ckW() + "[RecordMsgFileUI] on play sight error, what=" + paramInt1 + ", extra=" + paramInt2 + ", path=" + bo.bc(str, "")).getBytes(), 2), "FullScreenPlaySight");
      al.d(new RecordMsgFileUI.12.1(this, localBitmap, str));
      AppMethodBeat.o(24268);
    }
  }

  public final void pL()
  {
    AppMethodBeat.i(24267);
    ab.d("MicroMsg.RecordMsgFileUI", g.Mp() + " onPrepared");
    RecordMsgFileUI.i(this.pKI).setLoop(true);
    RecordMsgFileUI.i(this.pKI).start();
    AppMethodBeat.o(24267);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.12
 * JD-Core Version:    0.6.2
 */