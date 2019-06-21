package com.tencent.mm.ui.base;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class t$a
{
  private static Toast mMP = null;
  public static int yyc = 0;

  public static void az(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(106878);
    paramContext = paramContext.getApplicationContext();
    if (yyc != paramInt)
    {
      mMP = null;
      yyc = paramInt;
    }
    if (mMP == null)
      mMP = Toast.makeText(paramContext, "", 1);
    paramContext = View.inflate(paramContext, 2130970557, null);
    if (paramInt == 1)
      ((TextView)paramContext.findViewById(2131827243)).setText(2131301420);
    while (true)
    {
      mMP.setView(paramContext);
      mMP.show();
      AppMethodBeat.o(106878);
      return;
      if (paramInt == 3)
        ((TextView)paramContext.findViewById(2131827243)).setText(2131301421);
      else
        ((TextView)paramContext.findViewById(2131827243)).setText(2131301422);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.t.a
 * JD-Core Version:    0.6.2
 */