package com.tencent.mm.remoteservice;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements Runnable
{
  a$1(a parama, Object[] paramArrayOfObject, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(80216);
    Bundle localBundle = this.xtW.objectsToBundle(this.qIL);
    a.a(this.xtW).a(this.xtW, this.uqb, localBundle);
    AppMethodBeat.o(80216);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.a.1
 * JD-Core Version:    0.6.2
 */