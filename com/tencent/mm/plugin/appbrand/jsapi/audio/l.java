package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing;
import com.tencent.mm.plugin.appbrand.appstorage.s;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public class l extends k
{
  public final String f(c paramc, String paramString)
  {
    AppMethodBeat.i(74739);
    try
    {
      if ((paramc.asE() instanceof s))
      {
        Object localObject = ((IWxaFileSystemWithModularizing)((s)paramc.asE()).ae(IWxaFileSystemWithModularizing.class)).findAppropriateModuleInfo(paramString);
        if (localObject != null)
        {
          localObject = ((ao)localObject).gUc.getAbsolutePath();
          paramc = (c)localObject;
          AppMethodBeat.o(74739);
          return paramc;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        d.e("MicroMsg.JsApiSetAudioStateWxaApp", "getPkgPath with audioSrc(%s), e=%s", new Object[] { paramString, localException });
        paramc = (h)paramc.aa(h.class);
        if (paramc == null)
        {
          ab.e("MicroMsg.WxaAudioUtils", "service.getRuntime().getSysConfig() is null");
          paramc = "";
          AppMethodBeat.o(74739);
        }
        else if (paramc.hhd == null)
        {
          ab.e("MicroMsg.WxaAudioUtils", "service.getRuntime().getSysConfig().appPkgInfo is null");
          paramc = "";
          AppMethodBeat.o(74739);
        }
        else
        {
          ab.d("MicroMsg.WxaAudioUtils", "getPkgPath:%s", new Object[] { paramc.hhd.gSP });
          paramc = paramc.hhd.gSP;
          AppMethodBeat.o(74739);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.l
 * JD-Core Version:    0.6.2
 */