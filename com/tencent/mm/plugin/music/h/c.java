package com.tencent.mm.plugin.music.h;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.plugin.music.e.a;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  public static boolean L(e parame)
  {
    boolean bool = false;
    AppMethodBeat.i(137697);
    if (parame == null)
      AppMethodBeat.o(137697);
    while (true)
    {
      return bool;
      if (TextUtils.isEmpty(parame.protocol))
      {
        AppMethodBeat.o(137697);
      }
      else
      {
        ab.d("MicroMsg.Music.MusicPlayerSupport", "protocol:%s", new Object[] { parame.protocol });
        if ("hls".equalsIgnoreCase(parame.protocol))
        {
          AppMethodBeat.o(137697);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(137697);
        }
      }
    }
  }

  public static boolean zX(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(137696);
    switch (paramInt)
    {
    default:
      a locala = k.bUf().oLX;
      if ((locala != null) && (locala.zF(paramInt)))
        AppMethodBeat.o(137696);
      break;
    case 10:
    case 11:
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137696);
      continue;
      bool = false;
      AppMethodBeat.o(137696);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.h.c
 * JD-Core Version:    0.6.2
 */