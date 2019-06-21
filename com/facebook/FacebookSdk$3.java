package com.facebook;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.concurrent.Callable;

final class FacebookSdk$3
  implements Callable<File>
{
  public final File call()
  {
    AppMethodBeat.i(71600);
    File localFile = FacebookSdk.access$000().getCacheDir();
    AppMethodBeat.o(71600);
    return localFile;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.FacebookSdk.3
 * JD-Core Version:    0.6.2
 */