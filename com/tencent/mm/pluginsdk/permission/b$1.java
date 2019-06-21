package com.tencent.mm.pluginsdk.permission;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$1
  implements DialogInterface.OnClickListener
{
  b$1(Activity paramActivity, String paramString, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(79411);
    paramDialogInterface.dismiss();
    paramDialogInterface = this.val$activity;
    String str = this.bRI;
    paramInt = this.val$requestCode;
    a.a(paramDialogInterface, new String[] { str }, paramInt);
    AppMethodBeat.o(79411);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.permission.b.1
 * JD-Core Version:    0.6.2
 */