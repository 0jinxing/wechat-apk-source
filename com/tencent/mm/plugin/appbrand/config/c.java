package com.tencent.mm.plugin.appbrand.config;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends j<b>
{
  public static final String[] fjY;
  public final e gTC;

  static
  {
    AppMethodBeat.i(101788);
    fjY = new String[] { j.a(b.fjX, "AppBrandCommonKVData") };
    AppMethodBeat.o(101788);
  }

  public c(e parame)
  {
    super(parame, b.fjX, "AppBrandCommonKVData", null);
    this.gTC = parame;
  }

  public final boolean bG(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(101784);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(101784);
    while (true)
    {
      return bool;
      b localb = new b();
      localb.field_key = paramString1;
      localb.field_value = paramString2;
      if (bo.isNullOrNil(localb.field_value))
      {
        if (!super.a(localb, new String[0]))
        {
          bool = true;
          AppMethodBeat.o(101784);
        }
        else
        {
          AppMethodBeat.o(101784);
        }
      }
      else
      {
        bool = super.a(localb);
        AppMethodBeat.o(101784);
      }
    }
  }

  public final String get(String paramString1, String paramString2)
  {
    AppMethodBeat.i(101785);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(101785);
    while (true)
    {
      return paramString2;
      b localb = new b();
      localb.field_key = paramString1;
      if (super.b(localb, new String[0]))
      {
        paramString2 = localb.field_value;
        AppMethodBeat.o(101785);
      }
      else
      {
        AppMethodBeat.o(101785);
      }
    }
  }

  public final boolean pI(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(101786);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(101786);
    while (true)
    {
      return bool;
      b localb = new b();
      localb.field_key = paramString;
      localb.field_value = get(paramString, "");
      if ((TextUtils.isEmpty(localb.field_value)) || (super.a(localb, new String[0])))
      {
        bool = true;
        AppMethodBeat.o(101786);
      }
      else
      {
        AppMethodBeat.o(101786);
      }
    }
  }

  public final void yW(String paramString)
  {
    AppMethodBeat.i(101787);
    super.hY("AppBrandCommonKVData", String.format("delete from %s where %s like '%s%%'", new Object[] { "AppBrandCommonKVData", "key", paramString }));
    AppMethodBeat.o(101787);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.c
 * JD-Core Version:    0.6.2
 */