package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.sns.storage.x;
import com.tencent.mm.plugin.sns.storage.y;
import com.tencent.mm.protocal.protobuf.adx;
import com.tencent.mm.protocal.protobuf.ala;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class SnsAdNativeLandingPagesPreviewUI$1
  implements w.a
{
  SnsAdNativeLandingPagesPreviewUI$1(SnsAdNativeLandingPagesPreviewUI paramSnsAdNativeLandingPagesPreviewUI, View paramView, int paramInt, String paramString1, String paramString2, long paramLong, Intent paramIntent)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(38607);
    this.val$progressBar.setVisibility(8);
    if ((paramInt1 != 0) || (paramInt2 != 0))
      if (this.rnB == 1)
        ab.e("SnsAdNativeLandingPagesPreviewUI", "cgi fail canvas id %s, canvas ext %s, errType %d,errCode %s", new Object[] { this.rnC, this.rnD, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    label81: String str1;
    label225: String str2;
    do
    {
      this.rnE.finish();
      AppMethodBeat.o(38607);
      while (true)
      {
        return 0;
        ab.e("SnsAdNativeLandingPagesPreviewUI", "cgi fail page id %d, errType %d,errCode %d", new Object[] { Long.valueOf(this.reR), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        break;
        if (this.rnB != 1)
          break label353;
        str1 = ((ala)paramb.fsH.fsP).wqz.dlY();
        ab.i("SnsAdNativeLandingPagesPreviewUI", "getCanvasInfo canvasid %s, canvasext %s, xml %s", new Object[] { this.rnC, this.rnD, str1 });
        if (TextUtils.isEmpty(str1))
          break;
        this.val$intent.putExtra("sns_landing_pages_xml", str1);
        if (SnsAdNativeLandingPagesPreviewUI.h(this.val$intent, str1))
          break label225;
        this.rnE.finish();
        AppMethodBeat.o(38607);
      }
      SnsAdNativeLandingPagesPreviewUI.a(this.rnE, this.val$intent, str1);
      paramm = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.m.cqn();
      paramb = this.rnC;
      str2 = this.rnD;
    }
    while ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(paramb)));
    if (!bo.isNullOrNil(str2));
    for (paramString = paramb + str2; ; paramString = paramb)
    {
      paramm.reP.put(paramString, str1);
      paramString = new x();
      paramString.field_canvasId = paramb;
      paramString.field_canvasXml = str1;
      paramString.field_canvasExt = str2;
      paramm.reO.a(paramString);
      break;
      label353: paramString = (adx)paramb.fsH.fsP;
      ab.i("SnsAdNativeLandingPagesPreviewUI", "getCanvasInfo pageid %d ,xml %s", new Object[] { Long.valueOf(this.reR), paramString.wlW });
      if (TextUtils.isEmpty(paramString.wlW))
        break;
      this.val$intent.putExtra("sns_landing_pages_xml", paramString.wlW);
      if (!SnsAdNativeLandingPagesPreviewUI.h(this.val$intent, paramString.wlW))
      {
        this.rnE.finish();
        AppMethodBeat.o(38607);
        break label81;
      }
      SnsAdNativeLandingPagesPreviewUI.a(this.rnE, this.val$intent, paramString.wlW);
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.m.cqn().u(this.reR, paramString.wlW);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI.1
 * JD-Core Version:    0.6.2
 */