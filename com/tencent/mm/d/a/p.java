package com.tencent.mm.d.a;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.x;
import com.tencent.mm.sdk.platformtools.ab;

public final class p extends n
{
  public x cij;
  private final JavaVoidCallback cik;

  public p()
  {
    super("console");
    AppMethodBeat.i(113866);
    this.cik = new p.1(this);
    AppMethodBeat.o(113866);
  }

  protected final void a(l paraml, V8Object paramV8Object)
  {
    AppMethodBeat.i(113867);
    paramV8Object.registerJavaMethod(new p.2(this), "log");
    paramV8Object.registerJavaMethod(new p.3(this), "info");
    paramV8Object.registerJavaMethod(new JavaVoidCallback()
    {
      public final void invoke(V8Object paramAnonymousV8Object, V8Array paramAnonymousV8Array)
      {
        AppMethodBeat.i(113863);
        ab.w("MicroMsg.J2V8_Console", paramAnonymousV8Array.toString());
        AppMethodBeat.o(113863);
      }
    }
    , "warn");
    paramV8Object.registerJavaMethod(new JavaVoidCallback()
    {
      public final void invoke(V8Object paramAnonymousV8Object, V8Array paramAnonymousV8Array)
      {
        AppMethodBeat.i(113864);
        paramAnonymousV8Object = paramAnonymousV8Array.toString();
        ab.e("MicroMsg.J2V8_Console", paramAnonymousV8Object);
        if (p.this.cij != null)
          p.this.cij.onError(paramAnonymousV8Object);
        AppMethodBeat.o(113864);
      }
    }
    , "error");
    paramV8Object.registerJavaMethod(new p.6(this), "debug");
    paramV8Object.registerJavaMethod(this.cik, "assert");
    paramV8Object.registerJavaMethod(this.cik, "count");
    paramV8Object.registerJavaMethod(this.cik, "profile");
    paramV8Object.registerJavaMethod(this.cik, "profileEnd");
    paramV8Object.registerJavaMethod(this.cik, "time");
    paramV8Object.registerJavaMethod(this.cik, "timeEnd");
    paramV8Object.registerJavaMethod(this.cik, "timeStamp");
    paramV8Object.registerJavaMethod(this.cik, "takeHeapSnapshot");
    paramV8Object.registerJavaMethod(this.cik, "group");
    paramV8Object.registerJavaMethod(this.cik, "groupCollapsed");
    paramV8Object.registerJavaMethod(this.cik, "groupEnd");
    paramV8Object.registerJavaMethod(this.cik, "clear");
    paramV8Object.registerJavaMethod(this.cik, "dir");
    paramV8Object.registerJavaMethod(this.cik, "dirxml");
    paramV8Object.registerJavaMethod(this.cik, "table");
    paramV8Object.registerJavaMethod(this.cik, "trace");
    AppMethodBeat.o(113867);
  }

  public final void cleanup()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.p
 * JD-Core Version:    0.6.2
 */