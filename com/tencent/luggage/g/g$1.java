package com.tencent.luggage.g;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$1
  implements DialogInterface.OnClickListener
{
  g$1(Activity paramActivity, String paramString, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(90906);
    paramDialogInterface.dismiss();
    paramDialogInterface = this.val$activity;
    String str = this.bRI;
    paramInt = this.val$requestCode;
    a.a(paramDialogInterface, new String[] { str }, paramInt);
    AppMethodBeat.o(90906);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.g.g.1
 * JD-Core Version:    0.6.2
 */