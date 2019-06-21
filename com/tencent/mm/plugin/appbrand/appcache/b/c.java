package com.tencent.mm.plugin.appbrand.appcache.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/PreDownloadServiceExportImpl;", "Lcom/tencent/mm/plugin/appbrand/service/IWxaPreDownloadServiceExport;", "Lcom/tencent/mm/kernel/service/IServiceLifeCycle;", "()V", "TAG", "", "onRegister", "", "onUnregister", "triggerPreDownload", "username", "plugin-appbrand-integration_release"})
public final class c
  implements com.tencent.mm.kernel.c.b, h
{
  private final String TAG = "MicroMsg.AppBrand.PreDownloadServiceExportImpl";

  public final void SH()
  {
  }

  public final void SI()
  {
  }

  public final void xO(String paramString)
  {
    AppMethodBeat.i(134473);
    String[] arrayOfString = AppBrandGlobalSystemConfig.ayC().hgh;
    if (arrayOfString == null)
      arrayOfString = new String[0];
    while (true)
    {
      int i = arrayOfString.length;
      int j = 0;
      int k;
      if (j < i)
      {
        String str = arrayOfString[j];
        CharSequence localCharSequence = (CharSequence)str;
        if ((localCharSequence == null) || (localCharSequence.length() == 0))
        {
          k = 1;
          label64: if ((k != 0) || (!str.equals(paramString)))
            break label118;
          ab.i(this.TAG, "username[" + paramString + "] blacklist, just return");
          AppMethodBeat.o(134473);
        }
      }
      while (true)
      {
        return;
        k = 0;
        break label64;
        label118: j++;
        break;
        new b(paramString).acy().h((a)new c.a(this)).dMk();
        AppMethodBeat.o(134473);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.c
 * JD-Core Version:    0.6.2
 */