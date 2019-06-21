package com.tencent.mm.plugin.sns.ui.d;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.MaskImageButton;

final class b$38
  implements View.OnClickListener
{
  b$38(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool = false;
    int i = 1;
    int j = 1;
    AppMethodBeat.i(40300);
    Object localObject1 = (String)paramView.getTag();
    ab.d("MicroMsg.TimelineClickListener", "onCommentClick:".concat(String.valueOf(localObject1)));
    Object localObject2 = new Intent();
    Object localObject3;
    int k;
    int m;
    if (((paramView instanceof MaskImageButton)) && (((MaskImageButton)paramView).eSe != null))
    {
      paramView = (String)((MaskImageButton)paramView).eSe;
      paramView = af.cnF().YT(paramView);
      if (paramView.DI(32))
      {
        localObject3 = paramView.cqo();
        k = this.rKt.cvd;
        if (this.rKt.cvd == 0);
        for (m = 1; ; m = 2)
        {
          i.a(new SnsAdClick(k, m, paramView.field_snsId, 1, 0));
          if ((localObject3 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUq != 1) || (bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.b)localObject3).qUr)))
            break;
          localObject2 = ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUr;
          ab.i("MicroMsg.TimelineClickListener", "headClickParam url " + (String)localObject2 + " " + ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUs);
          localObject1 = new Intent();
          if (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUs == 0)
            bool = true;
          ((Intent)localObject1).putExtra("KsnsViewId", b.a(this.rKt, paramView).hnw);
          ((Intent)localObject1).putExtra("KRightBtn", bool);
          ((Intent)localObject1).putExtra("jsapiargs", new Bundle());
          ((Intent)localObject1).putExtra("rawUrl", (String)localObject2);
          ((Intent)localObject1).putExtra("useJs", true);
          com.tencent.mm.plugin.sns.c.a.gkE.i((Intent)localObject1, this.rKt.activity);
          AppMethodBeat.o(40300);
          return;
        }
        m = 1;
      }
    }
    while (true)
    {
      if (((String)localObject1).endsWith("@ad"))
      {
        AppMethodBeat.o(40300);
        break;
      }
      if (paramView != null)
      {
        if (this.rKt.cvd != 0)
          break label540;
        if (paramView.DI(32))
        {
          k = 722;
          label364: localObject3 = com.tencent.mm.modelsns.b.lY(k);
          ((com.tencent.mm.modelsns.b)localObject3).tx(i.j(paramView)).mb(paramView.field_type).cS(paramView.DI(32)).tx(paramView.crc()).tx((String)localObject1);
          ((com.tencent.mm.modelsns.b)localObject3).ajK();
        }
      }
      else
      {
        if (m == 0)
          break label578;
        k = this.rKt.cvd;
        if (this.rKt.cvd != 0)
          break label572;
      }
      label540: label572: for (m = 1; ; m = 2)
      {
        paramView = new SnsAdClick(k, m, paramView.field_snsId, 1, 0);
        ((Intent)localObject2).putExtra("Contact_User", (String)localObject1);
        ((Intent)localObject2).putExtra("KSnsAdTag", paramView);
        m = j;
        if (this.rKt.cvd == 0)
          m = 6;
        ((Intent)localObject2).putExtra("CONTACT_INFO_UI_SOURCE", m);
        com.tencent.mm.plugin.sns.c.a.gkE.c((Intent)localObject2, this.rKt.activity);
        AppMethodBeat.o(40300);
        break;
        k = 721;
        break label364;
        if (paramView.DI(32));
        for (k = 722; ; k = 721)
        {
          localObject3 = com.tencent.mm.modelsns.b.lZ(k);
          break;
        }
      }
      label578: this.rKt.rhQ.cnj().a(paramView, true);
      if (this.rKt.cvd == 0);
      for (paramView = com.tencent.mm.modelsns.b.lY(746); ; paramView = com.tencent.mm.modelsns.b.lZ(746))
      {
        localObject3 = r.Yz();
        paramView.tx((String)localObject1).cS(((String)localObject1).endsWith((String)localObject3));
        paramView.b((Intent)localObject2, "intent_key_StatisticsOplog");
        m = i;
        if (this.rKt.cvd == 0)
          m = 6;
        ((Intent)localObject2).putExtra("CONTACT_INFO_UI_SOURCE", m);
        ((Intent)localObject2).putExtra("Contact_User", (String)localObject1);
        com.tencent.mm.plugin.sns.c.a.gkE.c((Intent)localObject2, this.rKt.activity);
        AppMethodBeat.o(40300);
        break;
      }
      m = 0;
      continue;
      paramView = null;
      m = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.38
 * JD-Core Version:    0.6.2
 */