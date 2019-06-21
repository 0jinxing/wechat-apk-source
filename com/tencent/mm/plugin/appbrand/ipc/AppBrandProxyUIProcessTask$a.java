package com.tencent.mm.plugin.appbrand.ipc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Constructor;

final class AppBrandProxyUIProcessTask$a
{
  static <_Model extends AppBrandProxyUIProcessTask> _Model AG(String paramString)
  {
    AppMethodBeat.i(73152);
    try
    {
      Object localObject = Class.forName(paramString).getDeclaredConstructor(new Class[0]);
      ((Constructor)localObject).setAccessible(true);
      localObject = (AppBrandProxyUIProcessTask)((Constructor)localObject).newInstance(new Object[0]);
      AppMethodBeat.o(73152);
      paramString = (String)localObject;
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.IpcProxyUIModelFactory", "create mode object using className(%s), exp = %s", new Object[] { paramString, bo.l(localException) });
        paramString = null;
        AppMethodBeat.o(73152);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.a
 * JD-Core Version:    0.6.2
 */