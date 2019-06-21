package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m
  implements TbsDownloader.TbsDownloaderCallback
{
  m(Context paramContext, QbSdk.PreInitCallback paramPreInitCallback)
  {
  }

  public final void onNeedDownloadFinish(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(63990);
    if ((TbsShareManager.findCoreForThirdPartyApp(this.a) == 0) && (!TbsShareManager.getCoreDisabled()))
    {
      TbsShareManager.forceToLoadX5ForThirdApp(this.a, false);
      if ((!QbSdk.i) || (!TbsShareManager.isThirdPartyApp(this.a)))
        break label98;
      TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(this.a);
      AppMethodBeat.o(63990);
    }
    while (true)
    {
      return;
      if ((QbSdk.i) && (TbsShareManager.isThirdPartyApp(this.a)))
        TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(this.a);
      QbSdk.preInit(this.a, this.b);
      label98: AppMethodBeat.o(63990);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.m
 * JD-Core Version:    0.6.2
 */