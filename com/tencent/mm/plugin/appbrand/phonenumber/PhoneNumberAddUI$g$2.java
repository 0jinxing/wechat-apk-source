package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class PhoneNumberAddUI$g$2
  implements Runnable
{
  PhoneNumberAddUI$g$2(PhoneNumberAddUI.g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134825);
    Object localObject1 = this.iya.ixX.ixV;
    if (localObject1 != null)
    {
      localObject2 = this.iya.ixX.ixV;
      if (localObject2 == null)
        break label102;
    }
    label102: for (Object localObject2 = Long.valueOf(((be)localObject2).GI()); ; localObject2 = null)
    {
      if (localObject2 == null)
        j.dWJ();
      ((be)localObject1).cY(((Long)localObject2).longValue() + 1L);
      localObject1 = this.iya.ixX;
      localObject2 = this.iya.ixX.dxU().getString(2131296649);
      j.o(localObject2, "context.getString(R.stri…er_send_verify_code_fail)");
      PhoneNumberAddUI.a((PhoneNumberAddUI)localObject1, (String)localObject2);
      AppMethodBeat.o(134825);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI.g.2
 * JD-Core Version:    0.6.2
 */