package com.tencent.tmassistantsdk.openSDK.QQDownloader;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

class QQDownloaderInstalled$1 extends Thread
{
  QQDownloaderInstalled$1(QQDownloaderInstalled paramQQDownloaderInstalled, Context paramContext)
  {
  }

  public void run()
  {
    AppMethodBeat.i(75851);
    if (this.this$0.mListener != null)
      this.this$0.mListener.onQQDownloaderInstalled(this.val$context);
    AppMethodBeat.o(75851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled.1
 * JD-Core Version:    0.6.2
 */