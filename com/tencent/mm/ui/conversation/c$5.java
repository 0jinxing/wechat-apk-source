package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.pointers.PBool;

final class c$5
  implements DialogInterface.OnCancelListener
{
  c$5(PBool paramPBool)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.zqU.value = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.c.5
 * JD-Core Version:    0.6.2
 */