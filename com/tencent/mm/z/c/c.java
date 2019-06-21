package com.tencent.mm.z.c;

import android.content.Context;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.z.d.a;
import java.util.Map;

public final class c
{
  c.a eIh;
  private a eIi;
  public d eIj;
  b eIk;

  public c(Context paramContext, e parame, a parama, b paramb)
  {
    AppMethodBeat.i(115304);
    this.eIh = new c.a(paramContext, parame);
    this.eIi = parama;
    this.eIk = paramb;
    AppMethodBeat.o(115304);
  }

  public final String c(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(115305);
    try
    {
      Object localObject = this.eIj;
      if (bo.isNullOrNil(paramString1))
      {
        localObject = null;
        if (localObject != null)
          break label65;
        paramString2 = this.eIk.lp(paramString1);
        paramString1 = paramString2;
        AppMethodBeat.o(115305);
      }
      while (true)
      {
        return paramString1;
        localObject = (com.tencent.mm.z.b.b)((d)localObject).eIp.get(paramString1);
        break;
        label65: b localb = this.eIk;
        c.a locala = this.eIh;
        a locala1 = this.eIi;
        c.1 local1 = new com/tencent/mm/z/c/c$1;
        local1.<init>(this, paramInt);
        paramString2 = localb.a(locala, locala1, (com.tencent.mm.z.b.b)localObject, paramString2, local1);
        paramString1 = paramString2;
        AppMethodBeat.o(115305);
      }
    }
    catch (Exception paramString2)
    {
      ab.e("MicroMsg.MiniJsApiCore", "Invoke JsApi error: %s, %s", new Object[] { paramString1, Log.getStackTraceString(paramString2) });
      AppMethodBeat.o(115305);
    }
    throw paramString2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.c.c
 * JD-Core Version:    0.6.2
 */