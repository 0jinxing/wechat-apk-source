package com.google.firebase;

import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c
  implements BackgroundDetector.BackgroundStateChangeListener
{
  public final void onBackgroundStateChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(10639);
    a.uu();
    AppMethodBeat.o(10639);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.firebase.c
 * JD-Core Version:    0.6.2
 */