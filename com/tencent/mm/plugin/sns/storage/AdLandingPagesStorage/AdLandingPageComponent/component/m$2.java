package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e;
import com.tencent.mm.protocal.protobuf.qa;
import com.tencent.mm.protocal.protobuf.qc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;

final class m$2
  implements AdLandingPagesProxy.e
{
  m$2(m paramm)
  {
  }

  public final void ao(Object paramObject)
  {
  }

  public final void f(int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(37101);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      m.a(this.qZO).sendMessage(5);
      AppMethodBeat.o(37101);
    }
    while (true)
    {
      return;
      qc localqc = new qc();
      try
      {
        localqc.parseFrom((byte[])paramObject);
        if (!TextUtils.isEmpty(localqc.vGi))
        {
          ab.d("MicroMsg.AdLandingPageDownloadApkBtnComp", "opening url " + localqc.vGi);
          paramObject = new Intent();
          paramObject.putExtra("rawUrl", localqc.vGi);
          paramObject.putExtra("showShare", true);
          d.b(this.qZO.context, "webview", ".ui.tools.WebViewUI", paramObject);
          m.a(this.qZO).sendMessage(10);
          AppMethodBeat.o(37101);
        }
      }
      catch (IOException paramObject)
      {
        while (true)
          ab.e("MicroMsg.AdLandingPageDownloadApkBtnComp", bo.l(paramObject));
        if (localqc.vXh != null)
        {
          m.b(this.qZO).qVM = localqc.vXh.kKY;
          m.b(this.qZO).cvZ = localqc.vXh.kLL;
          m.b(this.qZO).downloadUrl = localqc.vXh.vXa;
          m.b(this.qZO).fileSize = localqc.vXh.vXd;
          m.a(this.qZO).sendMessage(6);
          AppMethodBeat.o(37101);
        }
        else
        {
          ab.i("MicroMsg.AdLandingPageDownloadApkBtnComp", "resp null");
          m.a(this.qZO).sendMessage(5);
          AppMethodBeat.o(37101);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m.2
 * JD-Core Version:    0.6.2
 */