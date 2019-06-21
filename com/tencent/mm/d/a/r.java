package com.tencent.mm.d.a;

import android.os.HandlerThread;
import android.util.SparseArray;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Context;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class r extends n
{
  int cin;
  final SparseArray<b> cio;
  volatile al cip;
  private final boolean ciq;

  r()
  {
    AppMethodBeat.i(113882);
    this.cin = 0;
    this.cio = new SparseArray();
    this.cip = null;
    this.ciq = false;
    AppMethodBeat.o(113882);
  }

  static int dt(String paramString)
  {
    int i = -2147483648;
    AppMethodBeat.i(113883);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
      {
        AppMethodBeat.o(113883);
        j = i;
      }
      while (true)
      {
        return j;
        j = Integer.decode(paramString).intValue();
        AppMethodBeat.o(113883);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.J2V8.V8DirectApiTimer", paramString, "", new Object[0]);
        AppMethodBeat.o(113883);
        int j = i;
      }
    }
  }

  protected final void a(l paraml, V8Object paramV8Object)
  {
    AppMethodBeat.i(113884);
    if (!(paraml.chO instanceof b))
      this.cip = new al("MicroMsg.J2V8.V8DirectApiTimer");
    paramV8Object.registerJavaMethod(new r.1(this, paraml), "setTimeout");
    paramV8Object.registerJavaMethod(new r.2(this, paraml), "setInterval");
    paramV8Object.registerJavaMethod(new r.3(this), "clearTimeout");
    paramV8Object.registerJavaMethod(new JavaVoidCallback()
    {
      public final void invoke(V8Object paramAnonymousV8Object, V8Array paramAnonymousV8Array)
      {
        AppMethodBeat.i(113873);
        if ((paramAnonymousV8Array.length() <= 0) || (paramAnonymousV8Array.getType(0) != 1))
          AppMethodBeat.o(113873);
        while (true)
        {
          return;
          r.a(r.this, paramAnonymousV8Array.getInteger(0));
          AppMethodBeat.o(113873);
        }
      }
    }
    , "clearInterval");
    AppMethodBeat.o(113884);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(113885);
    for (int i = 0; i < this.cio.size(); i++)
      ((b)this.cio.valueAt(i)).cancel();
    this.cio.clear();
    al localal = this.cip;
    if (localal != null)
    {
      localal.oAl.quit();
      this.cip = null;
    }
    AppMethodBeat.o(113885);
  }

  abstract class b
  {
    l ciw;
    V8Function cix;
    int id;

    b(l paramInt, int paramV8Function, V8Function arg4)
    {
      this.ciw = paramInt;
      Object localObject;
      this.cix = localObject;
      this.id = paramV8Function;
    }

    final void a(V8Array paramV8Array)
    {
      if ((!this.cix.isReleased()) && (!this.ciw.CB().isReleased()))
        this.cix.call(this.ciw.CB().getGlobalObject(), paramV8Array);
    }

    void cancel()
    {
      cleanup();
    }

    void cleanup()
    {
      r.this.cio.remove(this.id);
      this.cix.release();
    }

    final boolean isValid()
    {
      if ((!this.cix.isReleased()) && (!this.ciw.CB().isReleased()));
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    abstract void schedule();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.r
 * JD-Core Version:    0.6.2
 */