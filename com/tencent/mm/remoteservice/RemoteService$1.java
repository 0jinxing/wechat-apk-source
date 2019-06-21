package com.tencent.mm.remoteservice;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Constructor;

final class RemoteService$1 extends c.a
{
  RemoteService$1(RemoteService paramRemoteService)
  {
  }

  public final void a(String paramString1, String paramString2, Bundle paramBundle, b paramb)
  {
    AppMethodBeat.i(80224);
    try
    {
      Object localObject = this.xtY.getClassLoader().loadClass(paramString1);
      paramString1 = ((Class)localObject).getConstructors();
      if (paramString1.length > 0)
      {
        localObject = new Object[paramString1[0].getParameterTypes().length];
        localObject[0] = null;
      }
      for (paramString1 = (a)paramString1[0].newInstance((Object[])localObject); ; paramString1 = (a)((Class)localObject).newInstance())
      {
        paramString1.xtV = paramb;
        paramString1.xtU = this.xtY;
        paramString1.onCallback(paramString2, paramBundle, false);
        AppMethodBeat.o(80224);
        return;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.RemoveService", "exception:%s", new Object[] { bo.l(paramString1) });
        AppMethodBeat.o(80224);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.remoteservice.RemoteService.1
 * JD-Core Version:    0.6.2
 */