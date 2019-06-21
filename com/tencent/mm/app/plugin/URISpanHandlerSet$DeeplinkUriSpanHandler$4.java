package com.tencent.mm.app.plugin;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.pluginsdk.e.a;
import com.tencent.mm.protocal.protobuf.ciq;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.t;

final class URISpanHandlerSet$DeeplinkUriSpanHandler$4
  implements e.a
{
  URISpanHandlerSet$DeeplinkUriSpanHandler$4(URISpanHandlerSet.DeeplinkUriSpanHandler paramDeeplinkUriSpanHandler, p paramp)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(15648);
    if ((this.cgI != null) && (this.cgI.isShowing()))
      this.cgI.dismiss();
    if ((paramm != null) && (paramInt1 != 0) && (paramInt2 != 0) && ((paramm instanceof z)))
    {
      paramString = ((z)paramm).ajE();
      if ((paramString != null) && (URISpanHandlerSet.a(this.cgG.cgy) != null))
        t.makeText(URISpanHandlerSet.a(this.cgG.cgy), URISpanHandlerSet.a(this.cgG.cgy).getString(2131297061) + " : " + bo.nullAsNil(paramString.xhy), 0).show();
    }
    AppMethodBeat.o(15648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler.4
 * JD-Core Version:    0.6.2
 */