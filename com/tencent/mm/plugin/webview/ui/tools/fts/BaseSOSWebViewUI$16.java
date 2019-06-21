package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.z;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class BaseSOSWebViewUI$16
  implements Runnable
{
  BaseSOSWebViewUI$16(BaseSOSWebViewUI paramBaseSOSWebViewUI, BaseSOSWebViewUI.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8345);
    Object localObject;
    if (this.uAz.getJsapi() != null)
    {
      this.uAz.dbs();
      this.uAz.uAO = this.uAF.type;
      this.uAz.dbt();
      localObject = new Bundle();
      ((Bundle)localObject).putInt("type", this.uAz.uAO);
      ((Bundle)localObject).putBoolean("isHomePage", true);
      ((Bundle)localObject).putInt("scene", this.uAz.bFf());
    }
    while (true)
    {
      try
      {
        BaseSOSWebViewUI.a(this.uAz).p(4, (Bundle)localObject);
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        ((Map)localObject).put("isBackButtonClick", "1");
        ((Map)localObject).put("custom", this.uAz.getInEditTextQuery());
        this.uAz.getJsapi().a(this.uAz.getTotalQuery(), this.uAz.getInEditTextQuery(), this.uAz.dbB(), 1, this.uAF.uAJ);
        if (!TextUtils.isEmpty(this.uAz.getInEditTextQuery()))
          z.a(this.uAz.scene, this.uAz.cvF, this.uAz.cIy, true, this.uAz.getInEditTextQuery(), this.uAz.type);
        AppMethodBeat.o(8345);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        ab.e("MicroMsg.FTS.BaseSOSWebViewUI", "ex %s", new Object[] { localRemoteException.getMessage() });
      }
      AppMethodBeat.o(8345);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.16
 * JD-Core Version:    0.6.2
 */