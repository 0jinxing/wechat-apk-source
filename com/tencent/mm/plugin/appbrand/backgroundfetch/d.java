package com.tencent.mm.plugin.appbrand.backgroundfetch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public class d extends j<c>
{
  public static final String[] fjY;

  static
  {
    AppMethodBeat.i(129776);
    fjY = new String[] { j.a(c.hcb, "AppBrandBackgroundFetchData") };
    AppMethodBeat.o(129776);
  }

  public d(e parame)
  {
    super(parame, c.hcb, "AppBrandBackgroundFetchData", null);
  }

  private AppBrandBackgroundFetchDataParcel aP(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(129772);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(129772);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      c localc = new c();
      localc.field_username = paramString;
      localc.field_fetchType = paramInt;
      if (super.b(localc, new String[] { "username", "fetchType" }))
      {
        paramString = new AppBrandBackgroundFetchDataParcel();
        paramString.username = localc.field_username;
        paramString.hca = localc.field_fetchType;
        paramString.path = localc.field_path;
        paramString.query = localc.field_query;
        paramString.data = localc.field_data;
        paramString.scene = localc.field_scene;
        paramString.updateTime = localc.field_updateTime;
        AppMethodBeat.o(129772);
      }
      else
      {
        AppMethodBeat.o(129772);
        paramString = localObject;
      }
    }
  }

  public final boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(129771);
    boolean bool;
    if (bo.isNullOrNil(paramString1))
    {
      bool = true;
      AppMethodBeat.o(129771);
    }
    while (true)
    {
      return bool;
      c localc = new c();
      localc.field_username = paramString1;
      localc.field_fetchType = paramInt1;
      localc.field_data = paramString2;
      localc.field_path = paramString3;
      localc.field_query = paramString4;
      localc.field_scene = paramInt2;
      localc.field_updateTime = paramLong;
      if (!bo.isNullOrNil(paramString1))
      {
        paramString2 = new c();
        paramString2.field_username = paramString1;
        paramString2.field_fetchType = paramInt1;
        if (!super.b(paramString2, new String[] { "username", "fetchType" }));
      }
      for (paramString1 = paramString2; ; paramString1 = null)
      {
        if (paramString1 != null)
          break label152;
        bool = super.b(localc);
        AppMethodBeat.o(129771);
        break;
      }
      label152: bool = super.c(localc, new String[] { "username", "fetchType" });
      AppMethodBeat.o(129771);
    }
  }

  public final long aQ(String paramString, int paramInt)
  {
    AppMethodBeat.i(129774);
    paramString = aP(paramString, paramInt);
    long l;
    if (paramString != null)
    {
      l = paramString.updateTime;
      AppMethodBeat.o(129774);
    }
    while (true)
    {
      return l;
      l = 0L;
      AppMethodBeat.o(129774);
    }
  }

  public final AppBrandBackgroundFetchDataParcel aR(String paramString, int paramInt)
  {
    AppMethodBeat.i(129775);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(129775);
    }
    while (true)
    {
      return paramString;
      paramString = aP(p.zo(paramString), paramInt);
      AppMethodBeat.o(129775);
    }
  }

  public final boolean ao(String paramString, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(129773);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(129773);
    while (true)
    {
      return bool;
      c localc = new c();
      localc.field_username = paramString;
      localc.field_fetchType = paramInt;
      bool = super.a(localc, new String[] { "username", "fetchType" });
      AppMethodBeat.o(129773);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.d
 * JD-Core Version:    0.6.2
 */