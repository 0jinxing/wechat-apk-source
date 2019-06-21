package com.tencent.mm.pluginsdk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.pluginsdk.model.app.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class i
  implements t
{
  public static boolean vbc = false;
  private static i vbd;
  public i.a vbe;

  public static b aiA(String paramString)
  {
    AppMethodBeat.i(27299);
    if (paramString == null)
    {
      AppMethodBeat.o(27299);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = br.z(paramString, "PersonalAppSetting");
      if (paramString == null)
      {
        AppMethodBeat.o(27299);
        paramString = null;
      }
      else
      {
        String str = (String)paramString.get(".PersonalAppSetting.OpenID");
        if (bo.isNullOrNil(str))
        {
          AppMethodBeat.o(27299);
          paramString = null;
        }
        else
        {
          paramString = new b();
          paramString.vbf = str;
          AppMethodBeat.o(27299);
        }
      }
    }
  }

  public static i dgZ()
  {
    AppMethodBeat.i(27296);
    if (vbd == null)
      vbd = new i();
    i locali = vbd;
    AppMethodBeat.o(27296);
    return locali;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    AppMethodBeat.i(27298);
    if (!aw.RK())
      AppMethodBeat.o(27298);
    while (true)
    {
      return;
      ab.d("MicroMsg.GetUserInfoInAppLogic", "onSceneEnd errType=%s errCode=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramx != null)
        break;
      ab.e("MicroMsg.GetUserInfoInAppLogic", "scene == null");
      AppMethodBeat.o(27298);
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
      switch (paramx.getType())
      {
      default:
      case 14:
      }
    while (true)
    {
      AppMethodBeat.o(27298);
      break;
      if ((ah.getContext() == null) || (a.a.bYQ() == null))
      {
        ab.e("MicroMsg.GetUserInfoInAppLogic", "wrong environment");
        AppMethodBeat.o(27298);
        break;
      }
      ab.e("MicroMsg.GetUserInfoInAppLogic", "NetSceneGetUserInfoInApp come back", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = (l)paramx;
      if (this.vbe != null)
        this.vbe.a(paramString);
    }
  }

  public final void dha()
  {
    AppMethodBeat.i(27297);
    if (!aw.RK())
      AppMethodBeat.o(27297);
    while (true)
    {
      return;
      am.bYM().a(14, this);
      vbc = true;
      AppMethodBeat.o(27297);
    }
  }

  public static final class b
  {
    public String vbf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.i
 * JD-Core Version:    0.6.2
 */