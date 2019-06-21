package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class w
  implements t
{
  m cwn;
  public Context mContext;
  public com.tencent.mm.ui.base.p tipDialog;
  public w.a vcm;

  public w(Context paramContext, w.a parama)
  {
    this.mContext = paramContext;
    this.vcm = parama;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    AppMethodBeat.i(79365);
    ab.i("MicroMsg.LoadAppInfoAfterLogin", "OnScenEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    a.bYM().b(7, this);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if (this.vcm != null)
      this.vcm.arL();
    p.dhI();
    AppMethodBeat.o(79365);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.w
 * JD-Core Version:    0.6.2
 */