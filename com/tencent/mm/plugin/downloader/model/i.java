package com.tencent.mm.plugin.downloader.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class i extends h
{
  public i(b paramb)
  {
    super(paramb);
  }

  public final long a(a parama)
  {
    return 0L;
  }

  public final long a(e parame)
  {
    long l = -1L;
    AppMethodBeat.i(2463);
    if (bo.isNullOrNil(parame.gUx))
      AppMethodBeat.o(2463);
    while (true)
    {
      return l;
      parame = new Intent("android.intent.action.VIEW", Uri.parse(parame.gUx));
      parame.addFlags(268435456);
      try
      {
        ah.getContext().startActivity(parame);
        l = 0L;
        AppMethodBeat.o(2463);
      }
      catch (Exception parame)
      {
        ab.e("MicroMsg.FileDownloaderImplNormal", "Add download task failed: " + parame.toString());
        AppMethodBeat.o(2463);
      }
    }
  }

  public final int hl(long paramLong)
  {
    return 1;
  }

  public final FileDownloadTaskInfo hm(long paramLong)
  {
    AppMethodBeat.i(2464);
    FileDownloadTaskInfo localFileDownloadTaskInfo = new FileDownloadTaskInfo();
    localFileDownloadTaskInfo.id = paramLong;
    localFileDownloadTaskInfo.status = -1;
    AppMethodBeat.o(2464);
    return localFileDownloadTaskInfo;
  }

  public final boolean hn(long paramLong)
  {
    return false;
  }

  public final boolean ho(long paramLong)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.i
 * JD-Core Version:    0.6.2
 */