package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public final class d extends a
{
  private static final Map<String, d> ijP;
  private final WeakReference<Context> atF;
  private final String ijQ;
  private final String ijR;

  static
  {
    AppMethodBeat.i(132073);
    ijP = new ConcurrentHashMap();
    AppMethodBeat.o(132073);
  }

  d(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(132071);
    this.ijQ = paramString;
    this.ijR = paramContext.getClass().getName();
    this.atF = new WeakReference(paramContext);
    this.ijC = paramBoolean;
    ijP.put(paramString, this);
    paramContext = new d.a(paramString);
    long l = TimeUnit.SECONDS.toMillis(300L);
    paramContext.ae(l, l);
    AppMethodBeat.o(132071);
  }

  public static d Cn(String paramString)
  {
    AppMethodBeat.i(132070);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(132070);
    }
    while (true)
    {
      return paramString;
      paramString = (d)ijP.remove(paramString);
      AppMethodBeat.o(132070);
    }
  }

  protected final String aHK()
  {
    return this.ijR;
  }

  protected final Context aHM()
  {
    AppMethodBeat.i(132072);
    Context localContext = (Context)this.atF.get();
    AppMethodBeat.o(132072);
    return localContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.d
 * JD-Core Version:    0.6.2
 */