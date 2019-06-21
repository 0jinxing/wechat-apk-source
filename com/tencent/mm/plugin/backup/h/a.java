package com.tencent.mm.plugin.backup.h;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedList;

public final class a
{
  public ak handler;
  LinkedList<a.a> jyk;

  public a()
  {
    AppMethodBeat.i(17685);
    this.jyk = new LinkedList();
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(17685);
  }

  public final boolean g(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(17686);
    this.handler.post(new a.1(this, paramInt, paramObject));
    AppMethodBeat.o(17686);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.h.a
 * JD-Core Version:    0.6.2
 */