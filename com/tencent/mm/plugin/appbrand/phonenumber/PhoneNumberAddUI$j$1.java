package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.g.b.a.be;
import com.tencent.mm.protocal.protobuf.se;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.vending.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class PhoneNumberAddUI$j$1
  implements Runnable
{
  PhoneNumberAddUI$j$1(PhoneNumberAddUI.j paramj, a.a parama)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    AppMethodBeat.i(134832);
    int i = ((se)this.iyb.fsy).status;
    Object localObject4 = g.ixv;
    String str;
    if (i == g.aKH())
    {
      localObject1 = this.iye.ixX.ixV;
      if (localObject1 != null)
      {
        localObject2 = this.iye.ixX.ixV;
        if (localObject2 != null)
        {
          localObject2 = Long.valueOf(((be)localObject2).GK());
          if (localObject2 == null)
            a.f.b.j.dWJ();
          ((be)localObject1).da(((Long)localObject2).longValue() + 1L);
        }
      }
      else
      {
        localObject1 = ((se)this.iyb.fsy).ixJ;
        localObject4 = ((se)this.iyb.fsy).biC;
        str = ((se)this.iyb.fsy).vZw;
        MMSwitchBtn localMMSwitchBtn = this.iye.ixX.ixT;
        localObject2 = localObject3;
        if (localMMSwitchBtn != null)
          localObject2 = Boolean.valueOf(localMMSwitchBtn.dKD());
        if (localObject2 == null)
          a.f.b.j.dWJ();
        if (!((Boolean)localObject2).booleanValue())
          break label243;
        new f(this.iye.ixX.appId, this.iye.ixX.cFl, 0).acy().h((a)new PhoneNumberAddUI.j.1.1(this, str, (String)localObject1, (String)localObject4));
        AppMethodBeat.o(134832);
      }
    }
    while (true)
    {
      return;
      localObject2 = null;
      break;
      label243: localObject2 = j.ixQ;
      localObject3 = this.iye.ixX.cFl;
      a.f.b.j.o(str, "showMobile");
      a.f.b.j.o(localObject1, "encryptedData");
      a.f.b.j.o(localObject4, "iv");
      ((j.a)localObject2).a(new PhoneItem((String)localObject3, str, (String)localObject1, (String)localObject4));
      this.iye.ixX.finish();
      AppMethodBeat.o(134832);
      continue;
      localObject3 = g.ixv;
      if (i == g.aKI())
      {
        localObject3 = this.iye.ixX.ixV;
        if (localObject3 != null)
        {
          localObject4 = this.iye.ixX.ixV;
          localObject2 = localObject1;
          if (localObject4 != null)
            localObject2 = Long.valueOf(((be)localObject4).GL());
          if (localObject2 == null)
            a.f.b.j.dWJ();
          ((be)localObject3).db(((Long)localObject2).longValue() + 1L);
        }
        localObject3 = this.iye.ixX;
        localObject2 = this.iye.ixX.dxU().getString(2131296650);
        a.f.b.j.o(localObject2, "context.getString(R.stri…end_verify_code_frequent)");
        PhoneNumberAddUI.a((PhoneNumberAddUI)localObject3, (String)localObject2);
        AppMethodBeat.o(134832);
      }
      else
      {
        localObject3 = g.ixv;
        if (i != g.aKJ())
          break label546;
        localObject3 = this.iye.ixX.ixV;
        if (localObject3 != null)
        {
          localObject1 = this.iye.ixX.ixV;
          if (localObject1 != null)
            localObject2 = Long.valueOf(((be)localObject1).GL());
          if (localObject2 == null)
            a.f.b.j.dWJ();
          ((be)localObject3).db(((Long)localObject2).longValue() + 1L);
        }
        h.a((Context)this.iye.ixX.dxU(), this.iye.ixX.dxU().getString(2131296652), "", false, (DialogInterface.OnClickListener)PhoneNumberAddUI.j.1.2.iyj);
        AppMethodBeat.o(134832);
      }
    }
    label546: localObject3 = this.iye.ixX.ixV;
    if (localObject3 != null)
    {
      localObject2 = this.iye.ixX.ixV;
      if (localObject2 == null)
        break label645;
    }
    label645: for (localObject2 = Long.valueOf(((be)localObject2).GL()); ; localObject2 = null)
    {
      if (localObject2 == null)
        a.f.b.j.dWJ();
      ((be)localObject3).db(((Long)localObject2).longValue() + 1L);
      localObject2 = this.iye.ixX;
      localObject3 = this.iye.ixX.dxU().getString(2131296655);
      a.f.b.j.o(localObject3, "context.getString(R.stri…_number_verify_code_fail)");
      PhoneNumberAddUI.a((PhoneNumberAddUI)localObject2, (String)localObject3);
      AppMethodBeat.o(134832);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI.j.1
 * JD-Core Version:    0.6.2
 */