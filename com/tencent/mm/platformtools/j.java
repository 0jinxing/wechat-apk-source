package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.HashMap;
import java.util.Map;

public final class j
{
  public static j ghe;
  private Map<String, String> ghf;

  static
  {
    AppMethodBeat.i(124534);
    ghe = new j();
    AppMethodBeat.o(124534);
  }

  public final Map<String, String> cl(Context paramContext)
  {
    AppMethodBeat.i(124533);
    try
    {
      paramContext = bo.I(paramContext.getAssets().open("config/EmailAddress.xml"));
      boolean bool = bo.isNullOrNil(paramContext);
      if (bool)
      {
        AppMethodBeat.o(124533);
        paramContext = null;
      }
      while (true)
      {
        return paramContext;
        Map localMap = br.z(paramContext, "config");
        if ((localMap == null) || (localMap.isEmpty()))
        {
          ab.d("MicroMsg.EmailFormater", "values null");
          AppMethodBeat.o(124533);
          paramContext = null;
        }
        else
        {
          int i;
          label96: Object localObject;
          if (this.ghf == null)
          {
            paramContext = new java/util/HashMap;
            paramContext.<init>();
            this.ghf = paramContext;
            i = 0;
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>(".config.format");
            if (i != 0)
              break label258;
          }
          label258: for (paramContext = ""; ; paramContext = Integer.valueOf(i))
          {
            paramContext = paramContext;
            if (localMap.get(paramContext) == null)
              break label267;
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            localObject = paramContext + ".emaildomain";
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            paramContext = paramContext + ".loginpage";
            localObject = (String)localMap.get(localObject);
            paramContext = (String)localMap.get(paramContext);
            if ((!bo.isNullOrNil((String)localObject)) && (!bo.isNullOrNil(paramContext)))
              this.ghf.put(localObject, paramContext);
            i++;
            break label96;
            paramContext = this.ghf;
            AppMethodBeat.o(124533);
            break;
          }
          label267: paramContext = this.ghf;
          AppMethodBeat.o(124533);
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.EmailFormater", "parse email failed:[%s]", new Object[] { paramContext.getMessage() });
        AppMethodBeat.o(124533);
        paramContext = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.j
 * JD-Core Version:    0.6.2
 */