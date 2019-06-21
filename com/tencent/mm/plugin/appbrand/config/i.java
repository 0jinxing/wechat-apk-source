package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public enum i
{
  public static int yZ(String paramString)
  {
    AppMethodBeat.i(101815);
    s.ayO();
    WxaAttributes localWxaAttributes = s.zB(paramString);
    if (localWxaAttributes == null)
    {
      i = -1;
      ab.i("MicroMsg.AppServiceSettingMMManager", "readAppFileStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", new Object[] { paramString, Integer.valueOf(i) });
      if (localWxaAttributes == null)
        break label81;
    }
    label81: for (int i = localWxaAttributes.ayK().hib.bQM; ; i = 5)
    {
      AppMethodBeat.o(101815);
      return i * 1048576;
      i = localWxaAttributes.ayK().hib.bQM;
      break;
    }
  }

  public static int za(String paramString)
  {
    AppMethodBeat.i(101816);
    s.ayO();
    WxaAttributes localWxaAttributes = s.zB(paramString);
    if (localWxaAttributes == null)
    {
      i = -1;
      ab.i("MicroMsg.AppServiceSettingMMManager", "readAppOpendataLocalStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", new Object[] { paramString, Integer.valueOf(i) });
      if (localWxaAttributes == null)
        break label81;
    }
    label81: for (int i = localWxaAttributes.ayK().hib.hid; ; i = 5)
    {
      AppMethodBeat.o(101816);
      return i * 1048576;
      i = localWxaAttributes.ayK().hib.hid;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.i
 * JD-Core Version:    0.6.2
 */