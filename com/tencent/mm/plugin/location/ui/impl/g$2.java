package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location.model.o;
import com.tencent.mm.plugin.location.model.o.b;
import com.tencent.mm.plugin.location.ui.k;
import com.tencent.mm.plugin.location.ui.l;
import com.tencent.mm.plugin.location.ui.l.5;
import com.tencent.mm.plugin.location.ui.m;
import com.tencent.mm.protocal.protobuf.bqu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class g$2
  implements o.b
{
  g$2(g paramg)
  {
  }

  public final void a(bqu parambqu)
  {
    AppMethodBeat.i(113669);
    g.a(this.nQT, parambqu);
    AppMethodBeat.o(113669);
  }

  public final void bJJ()
  {
    AppMethodBeat.i(113668);
    ab.i("MicroMsg.ShareMapUI", "onJoinSucess");
    o localo = this.nQT.nQH;
    localo.nKK = true;
    localo.bJG();
    localo.bJH();
    this.nQT.nQG.iE(true);
    if (this.nQT.nQJ != null)
      this.nQT.nQJ.bJY();
    AppMethodBeat.o(113668);
  }

  public final void bJK()
  {
    AppMethodBeat.i(113671);
    this.nQT.nQG.iE(false);
    this.nQT.nQH.stop();
    this.nQT.nQH.xC(3);
    k.bKb();
    this.nQT.activity.finish();
    this.nQT.activity.overridePendingTransition(2131034228, 2131034230);
    AppMethodBeat.o(113671);
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(113670);
    ab.v("MicroMsg.ShareMapUI", "onError type %d msg %s", new Object[] { Integer.valueOf(paramInt), paramString });
    com.tencent.mm.plugin.report.service.h.pYm.e(10997, new Object[] { "7", "", Integer.valueOf(0), Integer.valueOf(0) });
    l locall = this.nQT.nQI;
    ab.d("MicroMsg.TrackPoiDialogMgr", "showErrorDialog, errMsg=%s", new Object[] { paramString });
    Context localContext = ah.getContext();
    Object localObject = null;
    if (bo.isNullOrNil(paramString))
      if (paramInt == 0)
        paramString = localContext.getString(2131300977);
    while (true)
    {
      com.tencent.mm.ui.base.h.a(locall.mContext, paramString, "", locall.mResources.getString(2131296994), false, new l.5(locall, paramInt));
      AppMethodBeat.o(113670);
      return;
      if (paramInt == 1)
      {
        paramString = localContext.getString(2131300982);
      }
      else
      {
        paramString = localObject;
        if (paramInt == 2)
          paramString = localContext.getString(2131300983);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.g.2
 * JD-Core Version:    0.6.2
 */