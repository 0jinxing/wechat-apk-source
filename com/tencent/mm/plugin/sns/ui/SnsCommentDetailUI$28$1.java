package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.oi;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.i;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class SnsCommentDetailUI$28$1
  implements DialogInterface.OnClickListener
{
  SnsCommentDetailUI$28$1(SnsCommentDetailUI.28 param28)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(38810);
    ab.d("MicroMsg.SnsCommentDetailUI", "to del by localId " + SnsCommentDetailUI.k(this.rqX.rqN));
    paramDialogInterface = h.YT(SnsCommentDetailUI.k(this.rqX.rqN));
    if (paramDialogInterface == null)
    {
      ab.e("MicroMsg.SnsCommentDetailUI", "try to del item fail can not get snsinfo by localid %s", new Object[] { SnsCommentDetailUI.k(this.rqX.rqN) });
      AppMethodBeat.o(38810);
    }
    while (true)
    {
      return;
      if (!paramDialogInterface.DI(32))
        break;
      AppMethodBeat.o(38810);
    }
    label120: Object localObject;
    if (paramDialogInterface.field_snsId == 0L)
    {
      af.cnF().DL(paramDialogInterface.reX);
      localObject = new Intent();
      ((Intent)localObject).putExtra("sns_gallery_op_id", v.Zn(SnsCommentDetailUI.k(this.rqX.rqN)));
      this.rqX.rqN.setResult(-1, (Intent)localObject);
      if ((SnsCommentDetailUI.t(this.rqX.rqN)) && (!paramDialogInterface.isValid()))
        ((Intent)localObject).putExtra("sns_gallery_force_finish", true);
      localObject = paramDialogInterface.cqu();
      if (localObject != null)
        if (((TimeLineObject)localObject).xfH != null)
          break label372;
    }
    label372: for (paramDialogInterface = null; ; paramDialogInterface = ((TimeLineObject)localObject).xfH.Id)
    {
      if ((!bo.isNullOrNil(paramDialogInterface)) && (com.tencent.mm.plugin.sns.c.a.gkF.dk(paramDialogInterface)))
      {
        String str = com.tencent.mm.plugin.sns.c.a.gkF.df(paramDialogInterface);
        oi localoi = new oi();
        localoi.cKD.appId = paramDialogInterface;
        localoi.cKD.cKE = ((TimeLineObject)localObject).jBB;
        localoi.cKD.ceO = str;
        com.tencent.mm.sdk.b.a.xxA.m(localoi);
      }
      this.rqX.rqN.finish();
      AppMethodBeat.o(38810);
      break;
      af.cnE().km(paramDialogInterface.field_snsId);
      g.RQ();
      g.RO().eJo.a(new r(paramDialogInterface.field_snsId, 1), 0);
      af.cnF().delete(paramDialogInterface.field_snsId);
      af.cnK().ky(paramDialogInterface.field_snsId);
      i.kx(paramDialogInterface.field_snsId);
      break label120;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.28.1
 * JD-Core Version:    0.6.2
 */