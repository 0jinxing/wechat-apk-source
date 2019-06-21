package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.axr;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class z extends j<aa>
{
  public static final String ihX;

  static
  {
    AppMethodBeat.i(131920);
    ihX = j.a(aa.gSs, "LaunchWxaAppRespTable");
    AppMethodBeat.o(131920);
  }

  public z(e parame)
  {
    super(parame, aa.gSs, "LaunchWxaAppRespTable", aa.diI);
  }

  private boolean a(aa paramaa, boolean paramBoolean)
  {
    AppMethodBeat.i(131914);
    paramaa.field_appIdHash = paramaa.field_appId.hashCode();
    super.a(paramaa, paramBoolean);
    paramBoolean = a(paramaa, new String[] { "appId" });
    ab.i("MicroMsg.LaunchWxaAppCacheStorage", "insertNotify appId %s ret %B", new Object[] { paramaa.field_appId, Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(131914);
    return paramBoolean;
  }

  private boolean a(aa paramaa, boolean paramBoolean, String[] paramArrayOfString)
  {
    AppMethodBeat.i(131912);
    if (!bo.Q(paramArrayOfString));
    for (int i = 0; ; i++)
      if (i < paramArrayOfString.length)
      {
        if (paramArrayOfString[i].equals("appId"))
        {
          paramArrayOfString[i] = "appIdHash";
          paramaa.field_appIdHash = paramaa.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.a(paramaa, paramBoolean, paramArrayOfString);
        AppMethodBeat.o(131912);
        return paramBoolean;
      }
  }

  private boolean b(aa paramaa, boolean paramBoolean, String[] paramArrayOfString)
  {
    AppMethodBeat.i(131915);
    if (!bo.Q(paramArrayOfString));
    for (int i = 0; ; i++)
      if (i < paramArrayOfString.length)
      {
        if (paramArrayOfString[i].equals("appId"))
        {
          paramArrayOfString[i] = "appIdHash";
          paramaa.field_appIdHash = paramaa.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.b(paramaa, paramBoolean, paramArrayOfString);
        ab.i("MicroMsg.LaunchWxaAppCacheStorage", "updateNotify appId %s, ret %B", new Object[] { paramaa.field_appId, Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(131915);
        return paramBoolean;
      }
  }

  public final aa a(String paramString, axr paramaxr)
  {
    AppMethodBeat.i(131910);
    if ((bo.isNullOrNil(paramString)) || (paramaxr == null))
    {
      paramString = null;
      AppMethodBeat.o(131910);
    }
    while (true)
    {
      return paramString;
      aa localaa = new aa();
      localaa.a(paramaxr);
      localaa.field_appId = paramString;
      paramaxr = new aa();
      paramaxr.field_appId = paramString;
      boolean bool1;
      label76: boolean bool2;
      if (!a(paramaxr, new String[] { "appId" }))
      {
        bool1 = true;
        if ((!bool1) && (paramaxr.equals(localaa)))
          break label178;
        bool2 = true;
        label92: ab.i("MicroMsg.LaunchWxaAppCacheStorage", "flush resp, appId %s, apply %B, insert %B", new Object[] { paramString, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        if (bool2)
        {
          if (!bool1)
            break label184;
          a(localaa, false);
        }
      }
      while (true)
      {
        if (!bool2)
          break label203;
        if (!a(paramaxr, new String[] { "appId" }))
          break label203;
        AppMethodBeat.o(131910);
        paramString = paramaxr;
        break;
        bool1 = false;
        break label76;
        label178: bool2 = false;
        break label92;
        label184: b(localaa, false, new String[] { "appId" });
      }
      label203: AppMethodBeat.o(131910);
      paramString = localaa;
    }
  }

  public final boolean a(aa paramaa, String[] paramArrayOfString)
  {
    AppMethodBeat.i(131913);
    if (!bo.Q(paramArrayOfString));
    for (int i = 0; ; i++)
      if (i < paramArrayOfString.length)
      {
        if (paramArrayOfString[i].equals("appId"))
        {
          paramArrayOfString[i] = "appIdHash";
          paramaa.field_appIdHash = paramaa.field_appId.hashCode();
        }
      }
      else
      {
        boolean bool = super.b(paramaa, paramArrayOfString);
        AppMethodBeat.o(131913);
        return bool;
      }
  }

  public final boolean pI(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(131911);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(131911);
    while (true)
    {
      return bool;
      aa localaa = new aa();
      localaa.field_appId = paramString;
      bool = a(localaa, false, new String[] { "appId" });
      AppMethodBeat.o(131911);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.z
 * JD-Core Version:    0.6.2
 */