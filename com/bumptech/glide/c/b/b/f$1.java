package com.bumptech.glide.c.b.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class f$1
  implements d.a
{
  f$1(Context paramContext, String paramString)
  {
  }

  public final File mW()
  {
    AppMethodBeat.i(91985);
    File localFile = this.val$context.getCacheDir();
    if (localFile == null)
    {
      localFile = null;
      AppMethodBeat.o(91985);
    }
    while (true)
    {
      return localFile;
      if (this.aDh != null)
      {
        localFile = new File(localFile, this.aDh);
        AppMethodBeat.o(91985);
      }
      else
      {
        AppMethodBeat.o(91985);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.b.f.1
 * JD-Core Version:    0.6.2
 */