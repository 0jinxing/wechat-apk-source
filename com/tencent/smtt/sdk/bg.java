package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;

class bg
{
  private DexLoader a = null;

  public bg(DexLoader paramDexLoader)
  {
    this.a = paramDexLoader;
  }

  public String a(Context paramContext)
  {
    AppMethodBeat.i(64632);
    if (this.a != null)
    {
      Object localObject = this.a.newInstance("com.tencent.tbs.utils.TbsVideoUtilsProxy", new Class[0], new Object[0]);
      if (localObject != null)
      {
        paramContext = this.a.invokeMethod(localObject, "com.tencent.tbs.utils.TbsVideoUtilsProxy", "getCurWDPDecodeType", new Class[] { Context.class }, new Object[] { paramContext });
        if (paramContext != null)
        {
          paramContext = String.valueOf(paramContext);
          AppMethodBeat.o(64632);
        }
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = "";
      AppMethodBeat.o(64632);
    }
  }

  public void a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(64631);
    if (this.a != null)
    {
      Object localObject = this.a.newInstance("com.tencent.tbs.utils.TbsVideoUtilsProxy", new Class[0], new Object[0]);
      if (localObject != null)
        this.a.invokeMethod(localObject, "com.tencent.tbs.utils.TbsVideoUtilsProxy", "deleteVideoCache", new Class[] { Context.class, String.class }, new Object[] { paramContext, paramString });
    }
    AppMethodBeat.o(64631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bg
 * JD-Core Version:    0.6.2
 */