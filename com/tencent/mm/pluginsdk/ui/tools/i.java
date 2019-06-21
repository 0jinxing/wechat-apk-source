package com.tencent.mm.pluginsdk.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class i
{
  private static void a(Bundle paramBundle, BaseResp paramBaseResp, f paramf)
  {
    AppMethodBeat.i(79949);
    paramBaseResp.toBundle(paramBundle);
    paramBaseResp = new MMessageActV2.Args();
    paramBaseResp.targetPkgName = paramf.field_packageName;
    paramBaseResp.bundle = paramBundle;
    p.at(paramBundle);
    p.au(paramBundle);
    MMessageActV2.send(ah.getContext(), paramBaseResp);
    AppMethodBeat.o(79949);
  }

  public static boolean c(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    boolean bool = true;
    AppMethodBeat.i(79948);
    f localf = g.bT(paramString3, true);
    if (localf == null)
    {
      ab.e("MicroMsg.OpenBusinessViewUtil", "launchBackApp info is null");
      bool = false;
      AppMethodBeat.o(79948);
    }
    while (true)
    {
      return bool;
      Bundle localBundle = new Bundle();
      paramString3 = new WXOpenBusinessView.Resp(localBundle);
      paramString3.extMsg = paramString2;
      paramString3.errStr = paramString4;
      paramString3.openId = localf.field_openId;
      paramString3.errCode = paramInt;
      paramString3.businessType = paramString1;
      a(localBundle, paramString3, localf);
      AppMethodBeat.o(79948);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.i
 * JD-Core Version:    0.6.2
 */