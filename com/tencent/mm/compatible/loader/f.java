package com.tencent.mm.compatible.loader;

import android.app.Application;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class f
{
  public static e c(Application paramApplication, String paramString)
  {
    AppMethodBeat.i(93038);
    try
    {
      ClassLoader localClassLoader = ah.getContext().getClassLoader();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramString = (e)localClassLoader.loadClass(ah.doz() + paramString).newInstance();
      paramString.b(paramApplication);
      AppMethodBeat.o(93038);
      paramApplication = paramString;
      return paramApplication;
    }
    catch (Exception paramApplication)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ProfileFactoryImpl", paramApplication, "", new Object[0]);
        paramApplication = null;
        AppMethodBeat.o(93038);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.f
 * JD-Core Version:    0.6.2
 */