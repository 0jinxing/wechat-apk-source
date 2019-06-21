package com.tencent.mm.plugin.sns.ui.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.oi;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.sns.ui.au.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$11$1
  implements DialogInterface.OnClickListener
{
  b$11$1(b.11 param11, View paramView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(40257);
    if (!(this.mqd.getTag() instanceof String))
      AppMethodBeat.o(40257);
    n localn;
    label159: Object localObject2;
    while (true)
    {
      return;
      paramDialogInterface = (String)this.mqd.getTag();
      ab.d("MicroMsg.TimelineClickListener", "onItemDelClick:".concat(String.valueOf(paramDialogInterface)));
      localn = af.cnF().YT(paramDialogInterface);
      if (localn == null)
      {
        ab.d("MicroMsg.TimelineClickListener", "can not get snsinfo by localid %s then return it", new Object[] { paramDialogInterface });
        AppMethodBeat.o(40257);
      }
      else
      {
        if (localn.cqW())
        {
          ab.i("MicroMsg.TimelineClickListener", "dead item");
          af.cnF().DL(localn.reX);
          if (this.rKx.rKt.rKo != null)
            this.rKx.rKt.rKo.cud();
          if (this.rKx.rKt.cvd == 0)
          {
            localObject1 = com.tencent.mm.modelsns.b.lY(739);
            localObject2 = ((com.tencent.mm.modelsns.b)localObject1).tx(com.tencent.mm.plugin.sns.data.i.j(localn)).mb(localn.field_type);
            if (!localn.cqW())
              break label234;
            paramDialogInterface = "2";
          }
          while (true)
          {
            ((com.tencent.mm.modelsns.b)localObject2).tx(paramDialogInterface);
            ((com.tencent.mm.modelsns.b)localObject1).ajK();
            if (localn.field_type == 21)
              com.tencent.mm.plugin.sns.lucky.a.g.cmv().cmx();
            AppMethodBeat.o(40257);
            break;
            localObject1 = com.tencent.mm.modelsns.b.lZ(739);
            break label159;
            label234: if (localn.field_snsId == 0L)
              paramDialogInterface = "1";
            else
              paramDialogInterface = "0";
          }
        }
        if (!localn.cnn())
          break;
        ab.i("MicroMsg.TimelineClickListener", "cancel item " + localn.cqU());
        af.cnB().u(localn);
        this.rKx.rKt.crE();
        AppMethodBeat.o(40257);
      }
    }
    ab.i("MicroMsg.TimelineClickListener", "delete by server");
    paramDialogInterface = localn.cqA();
    af.cnE().km(v.Zm(paramDialogInterface));
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(new r(v.Zm(paramDialogInterface), 1), 0);
    af.cnF().delete(v.Zm(paramDialogInterface));
    af.cnK().ky(v.Zm(paramDialogInterface));
    com.tencent.mm.plugin.sns.storage.i.kx(v.Zm(paramDialogInterface));
    this.rKx.rKt.crE();
    Object localObject1 = localn.cqu();
    if (localObject1 != null)
    {
      if (((TimeLineObject)localObject1).xfH != null)
        break label583;
      paramDialogInterface = null;
      label420: if ((!bo.isNullOrNil(paramDialogInterface)) && (com.tencent.mm.plugin.sns.c.a.gkF.dk(paramDialogInterface)))
      {
        String str = com.tencent.mm.plugin.sns.c.a.gkF.df(paramDialogInterface);
        localObject2 = new oi();
        ((oi)localObject2).cKD.appId = paramDialogInterface;
        ((oi)localObject2).cKD.cKE = ((TimeLineObject)localObject1).jBB;
        ((oi)localObject2).cKD.ceO = str;
        ((oi)localObject2).cKD.mediaTagName = ((TimeLineObject)localObject1).xfM;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
      }
    }
    if (this.rKx.rKt.cvd == 0)
    {
      localObject1 = com.tencent.mm.modelsns.b.lY(739);
      label534: localObject2 = ((com.tencent.mm.modelsns.b)localObject1).tx(com.tencent.mm.plugin.sns.data.i.j(localn)).mb(localn.field_type);
      if (!localn.cqW())
        break label606;
      paramDialogInterface = "2";
    }
    while (true)
    {
      ((com.tencent.mm.modelsns.b)localObject2).tx(paramDialogInterface);
      ((com.tencent.mm.modelsns.b)localObject1).ajK();
      AppMethodBeat.o(40257);
      break;
      label583: paramDialogInterface = ((TimeLineObject)localObject1).xfH.Id;
      break label420;
      localObject1 = com.tencent.mm.modelsns.b.lZ(739);
      break label534;
      label606: if (localn.field_snsId == 0L)
        paramDialogInterface = "1";
      else
        paramDialogInterface = "0";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.11.1
 * JD-Core Version:    0.6.2
 */