package com.tencent.mm.plugin.downloader;

import android.os.FileObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends FileObserver
{
  private String kJG;

  public a(String paramString)
  {
    super(paramString, 618);
    this.kJG = paramString;
  }

  public final void onEvent(int paramInt, String paramString)
  {
    AppMethodBeat.i(2270);
    if (paramString == null)
    {
      ab.e("DownloadsObserver", "path should be null");
      AppMethodBeat.o(2270);
      return;
    }
    paramString = this.kJG + paramString;
    switch (paramInt)
    {
    default:
    case 8:
    case 32:
    case 512:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(2270);
      break;
      ab.i("DownloadsObserver", "close write file: %s", new Object[] { paramString });
      AppMethodBeat.o(2270);
      break;
      ab.i("DownloadsObserver", "open file: %s", new Object[] { paramString });
      AppMethodBeat.o(2270);
      break;
      ab.i("DownloadsObserver", "delete file: %s", new Object[] { paramString });
      AppMethodBeat.o(2270);
      break;
      ab.i("DownloadsObserver", "move from file: %s", new Object[] { paramString });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.a
 * JD-Core Version:    0.6.2
 */