package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class ae
  implements Runnable
{
  ae(ad paramad)
  {
  }

  public void run()
  {
    AppMethodBeat.i(64199);
    if ((!TbsShareManager.forceLoadX5FromTBSDemo(ad.a(this.a).getContext())) && (TbsDownloader.needDownload(ad.a(this.a).getContext(), false)))
      TbsDownloader.startDownload(ad.a(this.a).getContext());
    AppMethodBeat.o(64199);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ae
 * JD-Core Version:    0.6.2
 */