package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l
  implements TbsListener
{
  l(Context paramContext, QbSdk.PreInitCallback paramPreInitCallback)
  {
  }

  public final void onDownloadFinish(int paramInt)
  {
  }

  public final void onDownloadProgress(int paramInt)
  {
  }

  public final void onInstallFinish(int paramInt)
  {
    AppMethodBeat.i(63989);
    QbSdk.preInit(this.a, this.b);
    AppMethodBeat.o(63989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.l
 * JD-Core Version:    0.6.2
 */