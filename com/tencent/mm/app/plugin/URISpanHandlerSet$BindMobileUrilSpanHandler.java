package com.tencent.mm.app.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.ui.MMWizardActivity;

@URISpanHandlerSet.a
class URISpanHandlerSet$BindMobileUrilSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$BindMobileUrilSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 5 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15637);
    boolean bool;
    if (paramm.type == 5)
    {
      if (paramg != null)
        paramg.a(paramm);
      MMWizardActivity.J(URISpanHandlerSet.a(this.cgy), new Intent(URISpanHandlerSet.a(this.cgy), BindMContactIntroUI.class));
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15637);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15637);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    AppMethodBeat.i(15638);
    if (paramString.equals("weixin://setting/bindphone"))
    {
      paramString = new Intent(URISpanHandlerSet.a(this.cgy), BindMContactIntroUI.class);
      if ((URISpanHandlerSet.a(this.cgy) instanceof Service))
        paramString.addFlags(268435456);
      MMWizardActivity.J(URISpanHandlerSet.a(this.cgy), paramString);
      paramBoolean = true;
      AppMethodBeat.o(15638);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(15638);
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15636);
    if (paramString.trim().startsWith("weixin://setting/bindphone"))
    {
      paramString = new m(paramString, 5, null);
      AppMethodBeat.o(15636);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15636);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.BindMobileUrilSpanHandler
 * JD-Core Version:    0.6.2
 */