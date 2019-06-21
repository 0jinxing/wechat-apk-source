package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.g.b.a.be;
import com.tencent.mm.protocal.protobuf.bwy;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class PhoneNumberAddUI$g$1
  implements Runnable
{
  PhoneNumberAddUI$g$1(PhoneNumberAddUI.g paramg, a.a parama)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    AppMethodBeat.i(134824);
    int i = ((bwy)this.iyb.fsy).status;
    Object localObject4 = g.ixv;
    if (i == g.aKE())
    {
      localObject1 = this.iya.ixX.ixV;
      if (localObject1 != null)
      {
        localObject4 = this.iya.ixX.ixV;
        localObject2 = localObject3;
        if (localObject4 != null)
          localObject2 = Long.valueOf(((be)localObject4).GH());
        if (localObject2 == null)
          j.dWJ();
        ((be)localObject1).cX(((Long)localObject2).longValue() + 1L);
        AppMethodBeat.o(134824);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134824);
      continue;
      localObject3 = g.ixv;
      if (i == g.aKF())
      {
        localObject3 = this.iya.ixX.ixV;
        if (localObject3 != null)
        {
          localObject4 = this.iya.ixX.ixV;
          localObject2 = localObject1;
          if (localObject4 != null)
            localObject2 = Long.valueOf(((be)localObject4).GI());
          if (localObject2 == null)
            j.dWJ();
          ((be)localObject3).cY(((Long)localObject2).longValue() + 1L);
        }
        localObject1 = this.iya.ixX;
        localObject2 = this.iya.ixX.dxU().getString(2131296649);
        j.o(localObject2, "context.getString(R.stri…er_send_verify_code_fail)");
        PhoneNumberAddUI.a((PhoneNumberAddUI)localObject1, (String)localObject2);
        AppMethodBeat.o(134824);
      }
      else
      {
        localObject1 = g.ixv;
        if (i != g.aKG())
          break;
        localObject1 = this.iya.ixX.ixV;
        if (localObject1 != null)
        {
          localObject3 = this.iya.ixX.ixV;
          if (localObject3 != null)
            localObject2 = Long.valueOf(((be)localObject3).GI());
          if (localObject2 == null)
            j.dWJ();
          ((be)localObject1).cY(((Long)localObject2).longValue() + 1L);
        }
        localObject1 = this.iya.ixX;
        localObject2 = this.iya.ixX.dxU().getString(2131296650);
        j.o(localObject2, "context.getString(R.stri…end_verify_code_frequent)");
        PhoneNumberAddUI.a((PhoneNumberAddUI)localObject1, (String)localObject2);
        AppMethodBeat.o(134824);
      }
    }
    localObject1 = this.iya.ixX.ixV;
    if (localObject1 != null)
    {
      localObject2 = this.iya.ixX.ixV;
      if (localObject2 == null)
        break label440;
    }
    label440: for (localObject2 = Long.valueOf(((be)localObject2).GI()); ; localObject2 = null)
    {
      if (localObject2 == null)
        j.dWJ();
      ((be)localObject1).cY(((Long)localObject2).longValue() + 1L);
      localObject2 = this.iya.ixX;
      localObject1 = this.iya.ixX.dxU().getString(2131296649);
      j.o(localObject1, "context.getString(R.stri…er_send_verify_code_fail)");
      PhoneNumberAddUI.a((PhoneNumberAddUI)localObject2, (String)localObject1);
      AppMethodBeat.o(134824);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI.g.1
 * JD-Core Version:    0.6.2
 */