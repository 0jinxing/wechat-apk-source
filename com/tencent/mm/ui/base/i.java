package com.tencent.mm.ui.base;

import android.app.Dialog;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class i extends Dialog
{
  public i(Context paramContext)
  {
    super(paramContext);
  }

  public i(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  public void dismiss()
  {
    AppMethodBeat.i(106525);
    try
    {
      super.dismiss();
      AppMethodBeat.o(106525);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMDialog", localException, "", new Object[0]);
        AppMethodBeat.o(106525);
      }
    }
  }

  public void show()
  {
    AppMethodBeat.i(106526);
    try
    {
      super.show();
      AppMethodBeat.o(106526);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMDialog", localException, "", new Object[0]);
        AppMethodBeat.o(106526);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.i
 * JD-Core Version:    0.6.2
 */