package com.tencent.mm.plugin.brandservice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.axy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class b
{
  public static axy abJ()
  {
    AppMethodBeat.i(13828);
    try
    {
      g.RQ();
      Object localObject1 = (String)g.RP().Ry().get(67591, null);
      axy localaxy;
      if (localObject1 != null)
      {
        localaxy = new com/tencent/mm/protocal/protobuf/axy;
        localaxy.<init>();
        localObject1 = ((String)localObject1).split(",");
        localaxy.wfG = Integer.valueOf(localObject1[0]).intValue();
        localaxy.wfJ = Integer.valueOf(localObject1[1]).intValue();
        localaxy.vRq = (Integer.valueOf(localObject1[2]).intValue() / 1000000.0F);
        localaxy.vRp = (Integer.valueOf(localObject1[3]).intValue() / 1000000.0F);
        ab.i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is not null, %f, %f", new Object[] { Float.valueOf(localaxy.vRq), Float.valueOf(localaxy.vRp) });
        AppMethodBeat.o(13828);
      }
      while (true)
      {
        return localaxy;
        ab.i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is null, lbsContent is null!");
        AppMethodBeat.o(13828);
        localaxy = null;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is null, reason %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(13828);
        Object localObject2 = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.b
 * JD-Core Version:    0.6.2
 */