package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.model.ai;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Locale;

public final class g$1 extends ai
{
  public g$1(g paramg)
  {
  }

  public final String getTag()
  {
    return "MicroMsg.AppBrandNewContactFixVersionStateTransfer";
  }

  public final boolean kw(int paramInt)
  {
    if ((paramInt >= 637863936) && (paramInt <= 637863988));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(129842);
    if (!kw(paramInt))
      AppMethodBeat.o(129842);
    while (true)
    {
      return;
      try
      {
        ab.d("MicroMsg.AppBrandNewContactFixVersionStateTransfer", "doFix()");
        Object localObject = f.auL();
        if (localObject != null)
        {
          localObject = ((f)localObject).auM();
          f.auO();
          ((h)localObject).hY("WxaAttributesTable", String.format(Locale.US, "update %s set %s='' where %s is null or %s=''", new Object[] { "WxaAttributesTable", "syncVersion", "versionInfo", "versionInfo" }));
          AppMethodBeat.o(129842);
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrandNewContactFixVersionStateTransfer", "doFix e = %s", new Object[] { localException });
        AppMethodBeat.o(129842);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.g.1
 * JD-Core Version:    0.6.2
 */