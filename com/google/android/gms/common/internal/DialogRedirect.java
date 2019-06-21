package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public abstract class DialogRedirect
  implements DialogInterface.OnClickListener
{
  public static DialogRedirect getInstance(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    return new zzb(paramIntent, paramActivity, paramInt);
  }

  public static DialogRedirect getInstance(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    return new zzc(paramIntent, paramFragment, paramInt);
  }

  public static DialogRedirect getInstance(LifecycleFragment paramLifecycleFragment, Intent paramIntent, int paramInt)
  {
    return new zzd(paramIntent, paramLifecycleFragment, paramInt);
  }

  // ERROR //
  public void onClick(android.content.DialogInterface paramDialogInterface, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 37	com/google/android/gms/common/internal/DialogRedirect:redirect	()V
    //   4: aload_1
    //   5: invokeinterface 42 1 0
    //   10: return
    //   11: astore_3
    //   12: aload_1
    //   13: invokeinterface 42 1 0
    //   18: goto -8 -> 10
    //   21: astore_3
    //   22: aload_1
    //   23: invokeinterface 42 1 0
    //   28: aload_3
    //   29: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	4	11	android/content/ActivityNotFoundException
    //   0	4	21	finally
  }

  protected abstract void redirect();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.DialogRedirect
 * JD-Core Version:    0.6.2
 */