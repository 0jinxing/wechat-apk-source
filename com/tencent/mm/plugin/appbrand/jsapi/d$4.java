package com.tencent.mm.plugin.appbrand.jsapi;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class d$4 extends y
{
  d$4(d paramd, String paramString, m paramm, int paramInt)
  {
  }

  private void AJ(String paramString)
  {
    AppMethodBeat.i(91014);
    this.hwo = paramString;
    this.hvO.M(this.eIl, paramString);
    AppMethodBeat.o(91014);
  }

  private String aCe()
  {
    AppMethodBeat.i(91013);
    while (true)
    {
      try
      {
        Object localObject = d.AI(this.hvS);
        if (localObject == null)
        {
          localObject = this.gML.j("fail:invalid data", null);
          d locald = this.hvO;
          m localm = this.gML;
          String str2 = this.hvS;
          int i = this.eIl;
          if (locald.hvM != null)
            locald.hvM.a(localm, str2, i, (String)localObject);
          AppMethodBeat.o(91013);
          return localObject;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        com.tencent.luggage.g.d.e("MicroMsg.AppBrandComponentImpl", "invokeImpl() parseDataStr oom, api[%s], data_length[%d]", new Object[] { this.gML.getName(), Integer.valueOf(bo.nullAsNil(this.hvS).length()) });
        AppMethodBeat.o(91013);
        throw localOutOfMemoryError;
      }
      String str1 = this.hvO.a(this.gML, localOutOfMemoryError, this.eIl);
    }
  }

  public final void AH(String paramString)
  {
    AppMethodBeat.i(91016);
    if (!TextUtils.isEmpty(this.hwo))
      AppMethodBeat.o(91016);
    while (true)
    {
      return;
      if (!TextUtils.isEmpty(paramString))
        AJ(paramString);
      AppMethodBeat.o(91016);
    }
  }

  public final void proceed()
  {
    AppMethodBeat.i(91015);
    if (!TextUtils.isEmpty(this.hwo))
    {
      AppMethodBeat.o(91015);
      return;
    }
    boolean bool = this.hvO.isRunning();
    if (!bool)
      com.tencent.luggage.g.d.e("MicroMsg.AppBrandComponentImpl", "invoke handler.proceed() log[%s] api[%s], callbackId[%d], component not running", new Object[] { this.hvO.auc(), this.gML, Integer.valueOf(this.eIl) });
    if (bool);
    for (String str = aCe(); ; str = this.gML.j("fail:interrupted", null))
    {
      if (!TextUtils.isEmpty(str))
        AJ(str);
      AppMethodBeat.o(91015);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.4
 * JD-Core Version:    0.6.2
 */