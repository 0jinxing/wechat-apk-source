package com.tencent.mm.ui.base;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class q extends ProgressDialog
{
  public q(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  public void dismiss()
  {
    AppMethodBeat.i(106763);
    try
    {
      super.dismiss();
      AppMethodBeat.o(106763);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSafeProgressDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(106763);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.q
 * JD-Core Version:    0.6.2
 */