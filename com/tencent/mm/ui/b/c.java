package com.tencent.mm.ui.b;

import android.app.Activity;
import android.support.v7.view.i;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends i
{
  private Activity mActivity;

  public c(Window.Callback paramCallback, Activity paramActivity)
  {
    super(paramCallback);
    this.mActivity = paramActivity;
  }

  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    AppMethodBeat.i(106157);
    paramCallback = this.mActivity.onWindowStartingActionMode(paramCallback);
    AppMethodBeat.o(106157);
    return paramCallback;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.c
 * JD-Core Version:    0.6.2
 */