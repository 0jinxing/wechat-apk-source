package com.tencent.mm.compatible.util;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.a.a;

public final class b
{
  b.b euH;
  private final String euI;
  Context mContext;

  public b(Context paramContext)
  {
    AppMethodBeat.i(93060);
    this.mContext = null;
    this.euH = null;
    this.euI = "audio_lock";
    this.mContext = paramContext;
    a.a(8, new b.1(this));
    AppMethodBeat.o(93060);
  }

  public final boolean Mm()
  {
    AppMethodBeat.i(93062);
    try
    {
      boolean bool;
      if (this.euH == null)
        bool = false;
      while (true)
      {
        return bool;
        bool = this.euH.Mm();
        AppMethodBeat.o(93062);
      }
    }
    finally
    {
      AppMethodBeat.o(93062);
    }
  }

  public final void a(b.a parama)
  {
    AppMethodBeat.i(93063);
    if (this.euH != null)
      this.euH.a(parama);
    AppMethodBeat.o(93063);
  }

  public final boolean requestFocus()
  {
    AppMethodBeat.i(93061);
    try
    {
      boolean bool;
      if (this.euH == null)
        bool = false;
      while (true)
      {
        return bool;
        bool = this.euH.requestFocus();
        AppMethodBeat.o(93061);
      }
    }
    finally
    {
      AppMethodBeat.o(93061);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.b
 * JD-Core Version:    0.6.2
 */