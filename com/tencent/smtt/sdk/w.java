package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

class w
  implements Runnable
{
  w(v paramv)
  {
  }

  public void run()
  {
    AppMethodBeat.i(64115);
    if ((!TbsShareManager.forceLoadX5FromTBSDemo(v.a(this.a).getContext())) && (TbsDownloader.needDownload(v.a(this.a).getContext(), false)))
      TbsDownloader.startDownload(v.a(this.a).getContext());
    AppMethodBeat.o(64115);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.w
 * JD-Core Version:    0.6.2
 */