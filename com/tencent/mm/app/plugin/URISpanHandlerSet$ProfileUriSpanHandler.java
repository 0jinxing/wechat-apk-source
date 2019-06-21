package com.tencent.mm.app.plugin;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.e;

@URISpanHandlerSet.a
class URISpanHandlerSet$ProfileUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$ProfileUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 3 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15687);
    boolean bool;
    if (paramm.type == 3)
    {
      if (paramg != null)
        paramg.a(paramm);
      String str = (String)paramm.au(String.class);
      Intent localIntent = new Intent();
      localIntent.addFlags(268435456);
      localIntent.putExtra("Contact_User", str);
      aw.ZK();
      ad localad = c.XM().aoO(str);
      if ((localad != null) && ((int)localad.ewQ > 0) && (a.jh(localad.field_type)))
        e.a(localIntent, str);
      if (bo.nullAsNil(str).length() > 0)
        d.b(URISpanHandlerSet.a(this.cgy), "profile", ".ui.ContactInfoUI", localIntent);
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15687);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15687);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    paramBoolean = true;
    AppMethodBeat.i(15688);
    if (paramString.startsWith("weixin://contacts/profile/"))
    {
      paramString = paramString.trim().replace("weixin://contacts/profile/", "").replace("/", "");
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.URISpanHandlerSet", "jumpToActivity fail, user is null");
        AppMethodBeat.o(15688);
      }
    }
    while (true)
    {
      return paramBoolean;
      paramv = new Intent();
      paramv.addFlags(268435456);
      paramv.putExtra("Contact_User", paramString);
      aw.ZK();
      paramBundle = c.XM().aoO(paramString);
      if ((paramBundle != null) && ((int)paramBundle.ewQ > 0) && (a.jh(paramBundle.field_type)))
        e.a(paramv, paramString);
      d.b(URISpanHandlerSet.a(this.cgy), "profile", ".ui.ContactInfoUI", paramv);
      AppMethodBeat.o(15688);
      continue;
      paramBoolean = false;
      AppMethodBeat.o(15688);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15686);
    if (paramString.trim().startsWith("weixin://contacts/profile/"))
    {
      paramString = new m(paramString, 3, paramString.trim().replace("weixin://contacts/profile/", "").replace("/", ""));
      AppMethodBeat.o(15686);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(15686);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.ProfileUriSpanHandler
 * JD-Core Version:    0.6.2
 */