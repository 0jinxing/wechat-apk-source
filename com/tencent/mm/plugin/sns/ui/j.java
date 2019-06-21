package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.pluginsdk.ui.e.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public class j
  implements o.a
{
  Activity activity;
  public int cvd = 0;
  private ae rhQ;

  public j(Activity paramActivity, int paramInt, ae paramae)
  {
    this.activity = paramActivity;
    this.cvd = paramInt;
    this.rhQ = paramae;
  }

  public void a(View paramView, Object paramObject)
  {
    AppMethodBeat.i(38198);
    Object localObject1 = new Intent();
    if (this.activity == null)
      AppMethodBeat.o(38198);
    label72: com.tencent.mm.plugin.sns.storage.n localn;
    label132: label153: SnsAdClick localSnsAdClick;
    while (true)
    {
      return;
      if (!(paramObject instanceof com.tencent.mm.plugin.sns.data.a))
        break label676;
      localObject2 = (com.tencent.mm.plugin.sns.data.a)paramObject;
      paramView = new StringBuilder("onClick : ").append(((com.tencent.mm.plugin.sns.data.a)localObject2).userName).append(" activity: ");
      if (this.activity == null)
      {
        bool = true;
        ab.d("Micro.ClickableCallBack", bool);
        localn = af.cnF().YT(((com.tencent.mm.plugin.sns.data.a)localObject2).czD);
        if (!((com.tencent.mm.plugin.sns.data.a)localObject2).qFG)
          break label479;
        paramObject = localn.cqo();
        if (localn == null)
          break label349;
        if (this.cvd != 2)
          break label340;
        paramView = localn.cqr();
        paramView = paramView.hnw;
        int i = this.cvd;
        if (this.cvd != 0)
          break label354;
        j = 1;
        localSnsAdClick = new SnsAdClick(i, j, localn.crd().field_snsId, 2, 0);
        i.a(localSnsAdClick);
        if ((paramObject == null) || (paramObject.qUq != 1) || (bo.isNullOrNil(paramObject.qUr)))
          break label366;
        localObject1 = paramObject.qUr;
        ab.i("Micro.ClickableCallBack", "headClickParam url " + (String)localObject1 + " " + paramObject.qUs);
        localObject2 = new Intent();
        if (paramObject.qUs != 0)
          break label360;
      }
      label340: label349: label354: label360: for (boolean bool = true; ; bool = false)
      {
        ((Intent)localObject2).putExtra("KsnsViewId", paramView);
        ((Intent)localObject2).putExtra("KRightBtn", bool);
        ((Intent)localObject2).putExtra("jsapiargs", new Bundle());
        ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
        ((Intent)localObject2).putExtra("useJs", true);
        com.tencent.mm.plugin.sns.c.a.gkE.i((Intent)localObject2, this.activity);
        AppMethodBeat.o(38198);
        break;
        bool = false;
        break label72;
        paramView = localn.cqq();
        break label132;
        paramView = null;
        break label132;
        j = 2;
        break label153;
      }
      label366: this.rhQ.cnj().a(localn, false);
      if (!((com.tencent.mm.plugin.sns.data.a)localObject2).userName.endsWith("@ad"))
        break;
      AppMethodBeat.o(38198);
    }
    ((Intent)localObject1).putExtra("Contact_User", ((com.tencent.mm.plugin.sns.data.a)localObject2).userName);
    ((Intent)localObject1).putExtra("KSnsAdTag", localSnsAdClick);
    ((Intent)localObject1).putExtra("Contact_Scene", 37);
    if (this.cvd == 0);
    for (int j = 6; ; j = 1)
    {
      ((Intent)localObject1).putExtra("CONTACT_INFO_UI_SOURCE", j);
      com.tencent.mm.plugin.sns.c.a.gkE.c((Intent)localObject1, this.activity);
      AppMethodBeat.o(38198);
      break;
    }
    label479: Object localObject2 = ((com.tencent.mm.plugin.sns.data.a)localObject2).userName;
    if (this.cvd == 0)
    {
      paramView = com.tencent.mm.modelsns.b.lY(719);
      label500: paramView.tx(i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx((String)localObject2);
      paramView.ajK();
      if (this.cvd != 0)
        break label666;
      paramView = com.tencent.mm.modelsns.b.lY(746);
      label560: paramObject = r.Yz();
      paramView.tx((String)localObject2).cS(((String)localObject2).endsWith(paramObject));
      paramView.b((Intent)localObject1, "intent_key_StatisticsOplog");
      paramObject = localObject2;
      if (this.cvd == 0)
      {
        this.rhQ.cnj().a(localn, false);
        paramObject = localObject2;
      }
    }
    while (true)
    {
      ((Intent)localObject1).putExtra("Contact_User", paramObject);
      ((Intent)localObject1).putExtra("CONTACT_INFO_UI_SOURCE", this.cvd);
      com.tencent.mm.plugin.sns.c.a.gkE.c((Intent)localObject1, this.activity);
      AppMethodBeat.o(38198);
      break;
      paramView = com.tencent.mm.modelsns.b.lZ(719);
      break label500;
      label666: paramView = com.tencent.mm.modelsns.b.lZ(746);
      break label560;
      label676: paramObject = (String)paramObject;
      paramView = paramObject;
      if (paramObject.contains("@"))
        paramView = paramObject.replace("@", "");
      g.RQ();
      paramObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM(paramView);
      if ((paramObject != null) && (paramObject.dsf()))
      {
        ((Intent)localObject1).putExtra("Contact_User", paramView);
        ((Intent)localObject1).putExtra("Contact_Scene", 37);
        ((Intent)localObject1).putExtra("CONTACT_INFO_UI_SOURCE", this.cvd);
        com.tencent.mm.plugin.sns.c.a.gkE.c((Intent)localObject1, this.activity);
        AppMethodBeat.o(38198);
        break;
      }
      paramObject = paramView;
      if (this.cvd == 0)
      {
        paramObject = new com.tencent.mm.plugin.sns.storage.n();
        paramObject.field_userName = paramView;
        this.rhQ.cnj().a(paramObject, false);
        paramObject = paramView;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.j
 * JD-Core Version:    0.6.2
 */