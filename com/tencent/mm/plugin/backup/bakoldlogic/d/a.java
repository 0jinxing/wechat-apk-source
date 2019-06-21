package com.tencent.mm.plugin.backup.bakoldlogic.d;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedList;

public final class a
{
  ak handler;
  public LinkedList<a> jyk;

  public a()
  {
    AppMethodBeat.i(18000);
    this.jyk = new LinkedList();
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(18000);
  }

  public final boolean g(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(18001);
    this.handler.post(new a.1(this, paramInt, paramObject));
    AppMethodBeat.o(18001);
    return true;
  }

  public final class a
  {
    public Object obj;
    public int type;

    public a(int paramObject, Object arg3)
    {
      this.type = paramObject;
      Object localObject;
      this.obj = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.a
 * JD-Core Version:    0.6.2
 */