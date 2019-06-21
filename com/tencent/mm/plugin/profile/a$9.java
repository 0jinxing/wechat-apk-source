package com.tencent.mm.plugin.profile;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.alp;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

final class a$9
  implements f
{
  a$9(a parama)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(23214);
    paramm.ftk = true;
    paramString = (com.tencent.mm.plugin.profile.b.a)paramm;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramString.pkG == null)
        paramString.pkG = ((alp)paramString.ehh.fsH.fsP);
      String str = paramString.pkG.wqR;
      paramString = null;
      try
      {
        paramm = Uri.parse(str);
        paramString = paramm;
        paramString = new Intent("android.intent.action.VIEW", paramString);
        this.pkl.jiE.startActivityForResult(paramString, 111);
        ab.i("MicroMsg.NewContactWidgetNormal", "goToWework() success! openurl:%s", new Object[] { str });
        AppMethodBeat.o(23214);
        return;
      }
      catch (Exception paramm)
      {
        while (true)
          ab.i("MicroMsg.NewContactWidgetNormal", "goToWework() Exception:%s", new Object[] { paramm.getMessage() });
      }
    }
    ab.i("MicroMsg.NewContactWidgetNormal", "goToWework() fail!");
    if (paramString.pkG == null)
      paramString.pkG = ((alp)paramString.ehh.fsH.fsP);
    if ((paramString.pkG.BaseResponse != null) && (paramString.pkG.BaseResponse.ErrMsg != null));
    for (paramString = bo.nullAsNil(paramString.pkG.BaseResponse.ErrMsg.wVI); ; paramString = paramString.aIm)
    {
      paramm = paramString;
      if (bo.isNullOrNil(paramString))
        paramm = this.pkl.jiE.getString(2131301889);
      h.b(this.pkl.jiE, paramm, this.pkl.jiE.getString(2131304077), false);
      AppMethodBeat.o(23214);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.9
 * JD-Core Version:    0.6.2
 */