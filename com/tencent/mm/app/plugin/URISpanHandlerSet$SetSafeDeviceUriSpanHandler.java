package com.tencent.mm.app.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;

@URISpanHandlerSet.a
class URISpanHandlerSet$SetSafeDeviceUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$SetSafeDeviceUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[0];
  }

  final boolean a(m paramm, g paramg)
  {
    return false;
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15690);
    if (paramString.equals("weixin://setting/account/safedevice"))
    {
      aw.ZK();
      paramString = (String)c.Ry().get(6, "");
      aw.ZK();
      paramv = (String)c.Ry().get(4097, "");
      if (!bo.isNullOrNil(paramString))
      {
        paramString = new Intent();
        if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
          paramString.addFlags(268435456);
        d.H(URISpanHandlerSet.a(this.cgy), "account", ".security.ui.MySafeDeviceListUI");
        AppMethodBeat.o(15690);
        paramBoolean = true;
      }
    }
    while (true)
    {
      return paramBoolean;
      if (!bo.isNullOrNil(paramv))
      {
        paramString = new Intent(URISpanHandlerSet.a(this.cgy), BindMContactIntroUI.class);
        paramString.putExtra("bind_scene", 1);
        if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
          paramString.addFlags(268435456);
        MMWizardActivity.J(URISpanHandlerSet.a(this.cgy), paramString);
        break;
      }
      paramString = new Intent();
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      d.a(URISpanHandlerSet.a(this.cgy), "account", ".security.ui.BindSafeDeviceUI", paramString);
      break;
      paramBoolean = false;
      AppMethodBeat.o(15690);
    }
  }

  final m dr(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.SetSafeDeviceUriSpanHandler
 * JD-Core Version:    0.6.2
 */