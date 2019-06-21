package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.i;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SupportErrorDialogFragment extends DialogFragment
{
  private Dialog mDialog = null;
  private DialogInterface.OnCancelListener zzap = null;

  public static SupportErrorDialogFragment newInstance(Dialog paramDialog)
  {
    AppMethodBeat.i(60474);
    paramDialog = newInstance(paramDialog, null);
    AppMethodBeat.o(60474);
    return paramDialog;
  }

  public static SupportErrorDialogFragment newInstance(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(60475);
    SupportErrorDialogFragment localSupportErrorDialogFragment = new SupportErrorDialogFragment();
    paramDialog = (Dialog)Preconditions.checkNotNull(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    localSupportErrorDialogFragment.mDialog = paramDialog;
    if (paramOnCancelListener != null)
      localSupportErrorDialogFragment.zzap = paramOnCancelListener;
    AppMethodBeat.o(60475);
    return localSupportErrorDialogFragment;
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(60473);
    if (this.zzap != null)
      this.zzap.onCancel(paramDialogInterface);
    AppMethodBeat.o(60473);
  }

  public Dialog onCreateDialog(Bundle paramBundle)
  {
    AppMethodBeat.i(60472);
    if (this.mDialog == null)
      setShowsDialog(false);
    paramBundle = this.mDialog;
    AppMethodBeat.o(60472);
    return paramBundle;
  }

  public void show(i parami, String paramString)
  {
    AppMethodBeat.i(60476);
    super.show(parami, paramString);
    AppMethodBeat.o(60476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SupportErrorDialogFragment
 * JD-Core Version:    0.6.2
 */