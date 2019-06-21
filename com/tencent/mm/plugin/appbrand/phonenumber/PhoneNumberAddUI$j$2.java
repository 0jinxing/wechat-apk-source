package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class PhoneNumberAddUI$j$2
  implements Runnable
{
  PhoneNumberAddUI$j$2(PhoneNumberAddUI.j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134833);
    Object localObject1 = this.iye.ixX.ixV;
    if (localObject1 != null)
    {
      localObject2 = this.iye.ixX.ixV;
      if (localObject2 == null)
        break label102;
    }
    label102: for (Object localObject2 = Long.valueOf(((be)localObject2).GL()); ; localObject2 = null)
    {
      if (localObject2 == null)
        j.dWJ();
      ((be)localObject1).db(((Long)localObject2).longValue() + 1L);
      localObject2 = this.iye.ixX;
      localObject1 = this.iye.ixX.dxU().getString(2131296655);
      j.o(localObject1, "context.getString(R.stri…_number_verify_code_fail)");
      PhoneNumberAddUI.a((PhoneNumberAddUI)localObject2, (String)localObject1);
      AppMethodBeat.o(134833);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberAddUI.j.2
 * JD-Core Version:    0.6.2
 */