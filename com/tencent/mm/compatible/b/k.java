package com.tencent.mm.compatible.b;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public final class k extends MediaPlayer
{
  public k()
  {
    AppMethodBeat.i(92899);
    g.iP(hashCode());
    AppMethodBeat.o(92899);
  }

  public static k d(Context paramContext, Uri paramUri)
  {
    AppMethodBeat.i(92900);
    try
    {
      k localk = new com/tencent/mm/compatible/b/k;
      localk.<init>();
      localk.setDataSource(paramContext, paramUri);
      localk.prepare();
      AppMethodBeat.o(92900);
      paramContext = localk;
      return paramContext;
    }
    catch (IOException paramContext)
    {
      while (true)
      {
        ab.d("MicroMsg.MediaPlayerWrapper", "create failed:", new Object[] { paramContext });
        paramContext = null;
        AppMethodBeat.o(92900);
      }
    }
    catch (IllegalArgumentException paramContext)
    {
      while (true)
        ab.d("MicroMsg.MediaPlayerWrapper", "create failed:", new Object[] { paramContext });
    }
    catch (SecurityException paramContext)
    {
      while (true)
        ab.d("MicroMsg.MediaPlayerWrapper", "create failed:", new Object[] { paramContext });
    }
  }

  public final void release()
  {
    AppMethodBeat.i(92901);
    super.release();
    g.iQ(hashCode());
    AppMethodBeat.o(92901);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.k
 * JD-Core Version:    0.6.2
 */