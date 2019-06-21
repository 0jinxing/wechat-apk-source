package com.tencent.mm.z.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;

final class c$a
  implements a
{
  e eIn;
  v.b eIo;
  Context mContext;

  c$a(Context paramContext, e parame)
  {
    AppMethodBeat.i(115303);
    this.mContext = paramContext;
    this.eIn = parame;
    this.eIo = new v.b();
    AppMethodBeat.o(115303);
  }

  public final v.b Qy()
  {
    return this.eIo;
  }

  public final Context getContext()
  {
    return this.mContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.c.c.a
 * JD-Core Version:    0.6.2
 */