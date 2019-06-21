package com.tencent.mm.plugin.fts.ui.widget;

import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

final class c$2
  implements VoiceInputLayout.a
{
  c$2(c paramc)
  {
  }

  public final void bBI()
  {
    AppMethodBeat.i(62177);
    c localc = this.mMT;
    if (localc.mMP != null)
      localc.mMP.cancel();
    localc.mMP = Toast.makeText(localc.crP, localc.crP.getResources().getString(2131300141), 0);
    localc.mMP.setGravity(17, 0, 0);
    localc.mMP.show();
    this.mMT.mMG.a(true, false, "");
    AppMethodBeat.o(62177);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.c.2
 * JD-Core Version:    0.6.2
 */