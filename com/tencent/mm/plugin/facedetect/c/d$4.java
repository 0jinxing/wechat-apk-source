package com.tencent.mm.plugin.facedetect.c;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class d$4
  implements View.OnClickListener
{
  d$4(d paramd, Bundle paramBundle, int paramInt, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(137);
    if (bo.isNullOrNil(this.lTu.lTr))
    {
      ab.e("MicroMsg.FaceDetectMpController", "alvinluo feedback url is null");
      AppMethodBeat.o(137);
    }
    while (true)
    {
      return;
      if ((this.lTu.lTc != null) && (this.lTu.lTc.get() != null))
        ((f)this.lTu.lTc.get()).bsp();
      paramView = null;
      if (this.lTq != null)
        paramView = this.lTq.getString("verify_result");
      try
      {
        Object localObject;
        label111: int i;
        if (this.lTu.appId != null)
        {
          localObject = this.lTu.appId;
          i = this.crd;
          if (paramView == null)
            break label240;
        }
        while (true)
        {
          paramView = q.encode(String.format("appid=%s;errcode=%d;identifyid=%s", new Object[] { localObject, Integer.valueOf(i), paramView }), "UTF-8");
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          paramView = this.lTu.lTr + "?customInfo=" + paramView;
          ab.i("MicroMsg.FaceDetectMpController", "alvinluo feedback url: %s", new Object[] { paramView });
          localObject = new android/content/Intent;
          ((Intent)localObject).<init>();
          ((Intent)localObject).putExtra("rawUrl", paramView);
          com.tencent.mm.bp.d.b(this.val$context, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
          AppMethodBeat.o(137);
          break;
          localObject = "";
          break label111;
          label240: paramView = "";
        }
      }
      catch (Exception paramView)
      {
        ab.printErrStackTrace("MicroMsg.FaceDetectMpController", paramView, "alvinluo start feedback webview exception", new Object[0]);
        AppMethodBeat.o(137);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.c.d.4
 * JD-Core Version:    0.6.2
 */