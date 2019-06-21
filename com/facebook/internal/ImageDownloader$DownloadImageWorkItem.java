package com.facebook.internal;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ImageDownloader$DownloadImageWorkItem
  implements Runnable
{
  private Context context;
  private ImageDownloader.RequestKey key;

  ImageDownloader$DownloadImageWorkItem(Context paramContext, ImageDownloader.RequestKey paramRequestKey)
  {
    this.context = paramContext;
    this.key = paramRequestKey;
  }

  public void run()
  {
    AppMethodBeat.i(72371);
    ImageDownloader.access$200(this.key, this.context);
    AppMethodBeat.o(72371);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageDownloader.DownloadImageWorkItem
 * JD-Core Version:    0.6.2
 */