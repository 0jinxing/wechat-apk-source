package com.tencent.mm.ipcinvoker.wx_extension.a;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.kernel.g;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.d;

public final class a
{
  public static a PW()
  {
    return a.b.eGM;
  }

  public static com.tencent.mm.storage.c ll(String paramString)
  {
    AppMethodBeat.i(126211);
    if (paramString.length() == 0)
    {
      ab.i("MicroMsg.IPCNewABTest", "get ABTestItem by layerId failed, id is null.", new Object[] { paramString });
      AppMethodBeat.o(126211);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if (ah.bqo())
      {
        if ((!g.RQ().eKi.eKC) || (!g.RN().eJb))
        {
          ab.e("MicroMsg.IPCNewABTest", "kernel or account not ready.");
          AppMethodBeat.o(126211);
          paramString = null;
        }
        else
        {
          paramString = com.tencent.mm.model.c.c.abi().ll(paramString);
          AppMethodBeat.o(126211);
        }
      }
      else
        try
        {
          localObject = new com/tencent/mm/ipcinvoker/type/IPCString;
          ((IPCString)localObject).<init>(paramString);
          paramString = (Bundle)f.a("com.tencent.mm", (Parcelable)localObject, a.a.class);
          if (paramString == null)
          {
            AppMethodBeat.o(126211);
            paramString = null;
          }
        }
        catch (Exception paramString)
        {
          while (true)
          {
            ab.e("MicroMsg.IPCNewABTest", "invokeSync e = %s", new Object[] { paramString });
            paramString = null;
          }
          Object localObject = new com.tencent.mm.storage.c();
          ((com.tencent.mm.storage.c)localObject).field_layerId = paramString.getString("layerId");
          ((com.tencent.mm.storage.c)localObject).field_business = paramString.getString("business");
          ((com.tencent.mm.storage.c)localObject).field_expId = paramString.getString("expId");
          ((com.tencent.mm.storage.c)localObject).field_rawXML = paramString.getString("rawXML");
          ((com.tencent.mm.storage.c)localObject).field_startTime = paramString.getLong("startTime");
          ((com.tencent.mm.storage.c)localObject).field_endTime = paramString.getLong("endTime");
          ((com.tencent.mm.storage.c)localObject).field_sequence = paramString.getLong("sequence");
          ((com.tencent.mm.storage.c)localObject).field_prioritylevel = paramString.getInt("prioritylevel");
          ((com.tencent.mm.storage.c)localObject).field_needReport = paramString.getBoolean("needReport");
          AppMethodBeat.o(126211);
          paramString = (String)localObject;
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.wx_extension.a.a
 * JD-Core Version:    0.6.2
 */