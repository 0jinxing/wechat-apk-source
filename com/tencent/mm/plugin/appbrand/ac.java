package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.a.a;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.c;
import java.util.Map;

public final class ac
{
  private static volatile Boolean gQv = null;

  public static boolean aux()
  {
    AppMethodBeat.i(129142);
    boolean bool1;
    boolean bool2;
    if (gQv == null)
    {
      Object localObject = a.b.eGM;
      localObject = a.ll("100400");
      if ((localObject == null) || (!((c)localObject).isValid()))
        break label153;
      if (bo.getInt((String)((c)localObject).dru().get("openIsolateContext"), 0) <= 0)
        break label143;
      bool1 = true;
      int i = bo.getInt((String)((c)localObject).dru().get("isolateContextLibVersion"), 2147483647);
      if ((!bool1) || (i > WxaCommLibRuntimeReader.avQ().gVu))
        break label148;
      bool2 = true;
      label91: gQv = Boolean.valueOf(bool2);
      ab.i("MicroMsg.AppBrand.MultiContextABTests", "openLibraryIsolateContext exp(%b, %d), result %b", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(i), gQv });
    }
    while (true)
    {
      bool1 = gQv.booleanValue();
      AppMethodBeat.o(129142);
      return bool1;
      label143: bool1 = false;
      break;
      label148: bool2 = false;
      break label91;
      label153: gQv = Boolean.FALSE;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ac
 * JD-Core Version:    0.6.2
 */