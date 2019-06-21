package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class ay$1
  implements DialogInterface.OnDismissListener
{
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(39833);
    g.RQ();
    int i = bo.a((Integer)g.RP().Ry().get(68385, null), 0);
    g.RQ();
    g.RP().Ry().set(68385, Integer.valueOf(i + 1));
    AppMethodBeat.o(39833);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ay.1
 * JD-Core Version:    0.6.2
 */