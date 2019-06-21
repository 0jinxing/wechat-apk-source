package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

abstract class b<T extends d> extends a
{
  static final ThreadPoolExecutor hJE = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
  private final T hJD;

  public b(T paramT)
  {
    this.hJD = paramT;
    this.hJD.hJG = this;
  }

  public final void a(final c paramc, final JSONObject paramJSONObject, final int paramInt)
  {
    hJE.submit(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(102758);
        if (!paramc.isRunning())
          AppMethodBeat.o(102758);
        while (true)
        {
          return;
          f.a locala = b.a(b.this).c(paramc, paramJSONObject);
          paramc.M(paramInt, b.this.a(paramc, locala.aIm, locala.values));
          AppMethodBeat.o(102758);
        }
      }
    });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.b
 * JD-Core Version:    0.6.2
 */