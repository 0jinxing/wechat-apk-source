package com.tencent.mm.plugin.account.model;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class c
  implements f, com.tencent.mm.ai.g
{
  public Context context;
  public m cwn;
  public c.a gyH;
  private ak handler;
  public com.tencent.mm.ui.base.p tipDialog;

  public c(Context paramContext, c.a parama)
  {
    AppMethodBeat.i(124673);
    this.handler = new ak(Looper.getMainLooper());
    this.context = paramContext;
    this.gyH = parama;
    AppMethodBeat.o(124673);
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(124674);
    if (paramInt2 != 0);
    for (paramInt1 = (int)(paramInt1 * 100L / paramInt2); ; paramInt1 = 0)
    {
      this.handler.post(new c.2(this, paramInt1));
      AppMethodBeat.o(124674);
      return;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(124675);
    if (paramm.getType() == 139)
    {
      com.tencent.mm.kernel.g.Rg().b(139, this);
      if ((paramInt2 != 0) || (paramInt1 != 0))
        break label87;
      this.gyH.aqC();
    }
    while (true)
    {
      if (this.tipDialog != null)
        this.tipDialog.dismiss();
      AppMethodBeat.o(124675);
      return;
      if (paramm.getType() != 138)
        break;
      com.tencent.mm.kernel.g.Rg().b(138, this);
      break;
      label87: ab.e("MicroMsg.DoInit", "do init failed, err=" + paramInt1 + "," + paramInt2);
      this.gyH.aqC();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.c
 * JD-Core Version:    0.6.2
 */