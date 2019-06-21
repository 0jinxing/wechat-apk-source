package com.tencent.mm.plugin.voip;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.view.raw.FilterRawGet.GetInputStream;
import java.io.File;
import java.io.InputStream;

final class b$2
  implements FilterRawGet.GetInputStream
{
  b$2(b paramb)
  {
  }

  public final InputStream getInputStream(String paramString)
  {
    AppMethodBeat.i(4308);
    try
    {
      Object localObject = ah.getContext().getAssets();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("raw");
      localObject = ((AssetManager)localObject).open(File.separator + paramString);
      paramString = (String)localObject;
      AppMethodBeat.o(4308);
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.SubCoreVoip", "cannot find res %s", new Object[] { paramString });
        h.pYm.k(914L, 13L, 1L);
        paramString = null;
        AppMethodBeat.o(4308);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.b.2
 * JD-Core Version:    0.6.2
 */