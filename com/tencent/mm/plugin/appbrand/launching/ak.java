package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ak extends af<Pair<WxaAttributes, Boolean>>
{
  private String appId;
  private final int cDB;
  private final int har;
  private final String hgC;
  private final int iiE;
  private boolean iiF = false;
  private boolean iiG = false;
  private y.a iiH = y.a.ihK;
  private int iiI = -1;
  private String username;

  ak(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3)
  {
    this.username = paramString1;
    this.appId = paramString2;
    this.har = paramInt1;
    this.iiE = paramInt2;
    this.cDB = paramInt3;
    this.hgC = paramString3;
  }

  private WxaAttributes aHB()
  {
    AppMethodBeat.i(131987);
    WxaAttributes localWxaAttributes;
    if (!bo.isNullOrNil(this.username))
    {
      localWxaAttributes = f.auO().d(this.username, new String[0]);
      AppMethodBeat.o(131987);
    }
    while (true)
    {
      return localWxaAttributes;
      localWxaAttributes = f.auO().e(this.appId, new String[0]);
      AppMethodBeat.o(131987);
    }
  }

  private static boolean f(WxaAttributes paramWxaAttributes)
  {
    boolean bool = true;
    AppMethodBeat.i(131988);
    if (bo.isNullOrNil(paramWxaAttributes.field_appId))
    {
      ab.e("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "invalid appID in contact(%s)", new Object[] { paramWxaAttributes.field_username });
      AppMethodBeat.o(131988);
    }
    while (true)
    {
      return bool;
      if (paramWxaAttributes.ayL() == null)
      {
        ab.e("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "NULL versionInfo(%s) in contact(%s)", new Object[] { paramWxaAttributes.field_versionInfo, paramWxaAttributes.field_username });
        AppMethodBeat.o(131988);
      }
      else if (paramWxaAttributes.ayJ() == null)
      {
        ab.e("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "NULL appInfo(%s) in contact(%s)", new Object[] { paramWxaAttributes.field_appInfo, paramWxaAttributes.field_username });
        AppMethodBeat.o(131988);
      }
      else if ((paramWxaAttributes.ayL().bQl == 0) && (bo.isNullOrNil(paramWxaAttributes.ayL().hii)))
      {
        ab.e("MicroMsg.AppBrand.PrepareStepGetWxaAttrs", "invalid versionMD5 in contact(%s)", new Object[] { paramWxaAttributes.field_username });
        AppMethodBeat.o(131988);
      }
      else
      {
        AppMethodBeat.o(131988);
        bool = false;
      }
    }
  }

  final String getTag()
  {
    return "MicroMsg.AppBrand.PrepareStepGetWxaAttrs";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ak
 * JD-Core Version:    0.6.2
 */