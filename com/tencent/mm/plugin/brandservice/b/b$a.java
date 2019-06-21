package com.tencent.mm.plugin.brandservice.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.aj;
import com.tencent.mm.g.a.aj.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI;
import com.tencent.mm.protocal.protobuf.mh;
import com.tencent.mm.sdk.platformtools.ab;

public final class b$a
  implements f
{
  private Context context;
  private String ctj;
  private long ctk;
  private boolean ctl;
  private int fromScene;
  private aj jKt;
  private int offset;
  private String title;

  public b$a(Context paramContext, String paramString1, long paramLong, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean, aj paramaj)
  {
    this.context = paramContext;
    this.ctj = paramString1;
    this.ctk = paramLong;
    this.offset = paramInt1;
    this.fromScene = paramInt2;
    this.title = paramString2;
    this.ctl = paramBoolean;
    this.jKt = paramaj;
  }

  private void fx(boolean paramBoolean)
  {
    AppMethodBeat.i(13827);
    g.Rg().b(1071, this);
    if ((this.jKt != null) && (this.jKt.cth.ctm != null))
    {
      this.jKt.cti.ctn = paramBoolean;
      this.jKt.cth.ctm.run();
    }
    AppMethodBeat.o(13827);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(13826);
    ab.i("MicroMsg.BrandService.BrandServiceLogic", "errType (%d) , errCode (%d) , errMsg (errMsg)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      fx(false);
      AppMethodBeat.o(13826);
    }
    while (true)
    {
      return;
      if (paramm == null)
      {
        ab.e("MicroMsg.BrandService.BrandServiceLogic", "scene is null.");
        fx(false);
        AppMethodBeat.o(13826);
      }
      else if (paramm.getType() != 1071)
      {
        ab.i("MicroMsg.BrandService.BrandServiceLogic", "The NetScene is not a instanceof BizSearchDetailPage.");
        AppMethodBeat.o(13826);
      }
      else
      {
        ab.i("MicroMsg.BrandService.BrandServiceLogic", "BizSearchDetailPage.");
        paramm = ((h)paramm).aVX();
        if ((paramm == null) || (paramm.naO == null))
        {
          ab.e("MicroMsg.BrandService.BrandServiceLogic", "response or BusinessContent or itemList is null.");
          fx(false);
          AppMethodBeat.o(13826);
        }
        else
        {
          ab.d("MicroMsg.BrandService.BrandServiceLogic", "searchId : %s.", new Object[] { paramm.vQg });
          paramString = new Intent(this.context, BizSearchDetailPageUI.class);
          paramString.putExtra("addContactScene", 35);
          paramString.putExtra("fromScene", this.fromScene);
          paramString.putExtra("keyword", this.ctj);
          paramString.putExtra("businessType", this.ctk);
          paramString.putExtra("offset", this.offset);
          paramString.putExtra("title", this.title);
          paramString.putExtra("showEditText", this.ctl);
          try
          {
            paramString.putExtra("result", paramm.toByteArray());
            if (!(this.context instanceof Activity))
              paramString.addFlags(268435456);
            fx(true);
            AppMethodBeat.o(13826);
          }
          catch (Exception paramString)
          {
            fx(false);
            ab.printErrStackTrace("MicroMsg.BrandService.BrandServiceLogic", paramString, "", new Object[0]);
            AppMethodBeat.o(13826);
          }
          finally
          {
            AppMethodBeat.o(13826);
          }
        }
      }
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.b.a
 * JD-Core Version:    0.6.2
 */