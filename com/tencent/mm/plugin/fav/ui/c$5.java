package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.snackbar.a.b;
import com.tencent.mm.ui.widget.snackbar.a.c;
import com.tencent.mm.ui.widget.snackbar.b;

final class c$5
  implements DialogInterface.OnClickListener
{
  c$5(DialogInterface.OnClickListener paramOnClickListener, Fragment paramFragment, a.b paramb, a.c paramc, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(73981);
    paramDialogInterface.dismiss();
    if (this.mif != null)
      this.mif.onClick(paramDialogInterface, -2);
    if (this.val$fragment != null)
    {
      b.a(this.val$fragment, this.val$fragment.getActivity().getString(2131299673), this.val$fragment.getActivity().getString(2131299590), this.mig, this.mih);
      AppMethodBeat.o(73981);
    }
    while (true)
    {
      return;
      b.a(this.val$activity, this.val$activity.getString(2131299673), this.val$activity.getString(2131299590), this.mig, this.mih);
      AppMethodBeat.o(73981);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.c.5
 * JD-Core Version:    0.6.2
 */