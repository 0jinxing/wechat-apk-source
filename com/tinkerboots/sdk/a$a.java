package com.tinkerboots.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.c.a;
import com.tencent.tinker.lib.d.c;
import com.tencent.tinker.lib.d.d;
import com.tencent.tinker.lib.service.AbstractResultService;
import com.tencent.tinker.loader.TinkerRuntimeException;

public final class a$a
{
  public com.tencent.tinker.lib.b.b ABD;
  public c ABE;
  public d ABF;
  public a ATV;
  public Class<? extends AbstractResultService> ATW;
  public com.tinkerboots.sdk.a.a.b ATX;
  public final ApplicationLike cdV;
  public final Context context;

  public a$a(ApplicationLike paramApplicationLike)
  {
    AppMethodBeat.i(65519);
    if (paramApplicationLike == null)
    {
      paramApplicationLike = new TinkerRuntimeException("applicationLike must not be null.");
      AppMethodBeat.o(65519);
      throw paramApplicationLike;
    }
    this.context = paramApplicationLike.getApplication();
    this.cdV = paramApplicationLike;
    AppMethodBeat.o(65519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.a.a
 * JD-Core Version:    0.6.2
 */