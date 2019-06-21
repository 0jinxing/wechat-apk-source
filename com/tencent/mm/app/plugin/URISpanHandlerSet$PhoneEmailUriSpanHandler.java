package com.tencent.mm.app.plugin;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.a.b;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.ui.e.l;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.bo;

@URISpanHandlerSet.a
class URISpanHandlerSet$PhoneEmailUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$PhoneEmailUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 25, 24 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15683);
    Bundle localBundle;
    if (paramm.type == 25)
    {
      paramg = paramm.username;
      localBundle = new Bundle();
      if ((paramg != null) && (!paramg.equals(r.Yz())))
      {
        localBundle.putString("Contact_User", paramg);
        paramg = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(paramg);
        if ((paramg == null) || (bo.isNullOrNil(paramg.Aq())))
          break label164;
      }
    }
    label164: for (paramg = bo.nullAsNil(paramg.apG()).replace(" ", ""); ; paramg = null)
    {
      localBundle.putString("Contact_Mobile_MD5", paramg);
      localBundle.putInt("fromScene", 1);
      l.a(URISpanHandlerSet.a(this.cgy), paramm.url, null, localBundle);
      AppMethodBeat.o(15683);
      boolean bool = true;
      while (true)
      {
        return bool;
        if (paramm.type == 24)
          l.b(URISpanHandlerSet.a(this.cgy), paramm.url, null);
        bool = false;
        AppMethodBeat.o(15683);
      }
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.PhoneEmailUriSpanHandler
 * JD-Core Version:    0.6.2
 */