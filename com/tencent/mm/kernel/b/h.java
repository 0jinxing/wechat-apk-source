package com.tencent.mm.kernel.b;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.d;
import com.tencent.mm.ci.a;
import com.tencent.mm.ci.a.a;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.tinker.entry.ApplicationLifeCycle;
import com.tencent.tinker.entry.ApplicationLike;

public final class h extends g
{
  public a<ApplicationLifeCycle> eMA;
  public ApplicationLike eMz;
  public d ecL;
  public e mProfileCompat;

  public h(String paramString, Application paramApplication, ApplicationLike paramApplicationLike)
  {
    super(paramString, paramApplication);
    AppMethodBeat.i(58081);
    this.eMA = new a();
    ah.ce(paramString);
    this.eMz = paramApplicationLike;
    AppMethodBeat.o(58081);
  }

  public final String getPackageName()
  {
    AppMethodBeat.i(138428);
    String str = ah.getPackageName();
    AppMethodBeat.o(138428);
    return str;
  }

  public final void onCreate()
  {
    AppMethodBeat.i(58082);
    this.eMA.a(new a.a()
    {
    });
    AppMethodBeat.o(58082);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.b.h
 * JD-Core Version:    0.6.2
 */