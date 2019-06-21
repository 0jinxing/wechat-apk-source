package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.gdpr.c;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class af$c$4
  implements n.a
{
  public af$c$4(Context paramContext, String paramString, af.d paramd, long paramLong, int paramInt1, Bundle paramBundle, d paramd1, af.b paramb, int paramInt2)
  {
  }

  public final void f(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(6666);
    ab.i("MicroMsg.OauthAuthorizeLogic", "WebAuthorizeDialog#onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      this.umg.goBack();
      AppMethodBeat.o(6666);
    case 1:
      while (true)
      {
        return;
        c.a(this.val$context, com.tencent.mm.model.gdpr.a.fom, this.umh, new af.c.4.1(this, paramBundle));
        AppMethodBeat.o(6666);
      }
    case 2:
    case 3:
    }
    Object localObject = this.umk;
    af.d locald = this.umg;
    d locald1 = this.ulK;
    af.b localb = this.umf;
    paramInt = this.uml;
    ab.i("MicroMsg.OauthAuthorizeLogic", "doRejectLogic");
    localObject = ((Bundle)localObject).getString("oauth_url");
    if (paramBundle == null)
    {
      paramBundle = new ArrayList();
      label154: af.c.a(locald1, (String)localObject, 2, paramBundle, localb, false, paramInt);
      locald.goBack();
      paramBundle = com.tencent.mm.plugin.webview.e.a.uKJ;
      if (this.umh != null)
        break label225;
    }
    label225: for (paramBundle = ""; ; paramBundle = this.umh)
    {
      com.tencent.mm.plugin.webview.e.a.a(paramBundle, this.fEG, 0, 1, 0, 1, this.crd);
      AppMethodBeat.o(6666);
      break;
      paramBundle = (ArrayList)paramBundle.getSerializable("key_scope");
      break label154;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af.c.4
 * JD-Core Version:    0.6.2
 */