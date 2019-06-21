package com.tencent.tmassistantsdk.openSDK.QQDownloader;

import android.net.Uri;
import android.provider.BaseColumns;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AssistantStore$DownloadInfos
  implements BaseColumns
{
  public static final Uri CONTENT_URI;

  static
  {
    AppMethodBeat.i(75850);
    CONTENT_URI = Uri.parse("content://com.tencent.android.qqdownloader.provider/downloadsinfo?notify=true");
    AppMethodBeat.o(75850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos
 * JD-Core Version:    0.6.2
 */