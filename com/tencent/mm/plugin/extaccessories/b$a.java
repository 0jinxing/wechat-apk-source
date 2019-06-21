package com.tencent.mm.plugin.extaccessories;

import com.samsung.android.sdk.look.writingbuddy.SlookWritingBuddy;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nz;
import com.tencent.mm.g.a.nz.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class b$a extends c<nz>
{
  public b$a()
  {
    AppMethodBeat.i(20465);
    this.xxI = nz.class.getName().hashCode();
    AppMethodBeat.o(20465);
  }

  private boolean a(nz paramnz)
  {
    boolean bool = false;
    AppMethodBeat.i(20466);
    if (!(paramnz instanceof nz))
    {
      ab.f("MicroMsg.extaccessories.SubCoreExtAccessories", "mismatched event");
      AppMethodBeat.o(20466);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.extaccessories.SubCoreExtAccessories", "RegistSpenBuddyEvent");
      if ((paramnz.cKo != null) && (paramnz.cKo.cKq != null) && (paramnz.cKo.cKp != null));
      try
      {
        SlookWritingBuddy localSlookWritingBuddy = new com/samsung/android/sdk/look/writingbuddy/SlookWritingBuddy;
        localSlookWritingBuddy.<init>(paramnz.cKo.cKq);
        SubCoreExtAccessories.RegistSpenBuddyEventListener.1 local1 = new com/tencent/mm/plugin/extaccessories/SubCoreExtAccessories$RegistSpenBuddyEventListener$1;
        local1.<init>(this, paramnz);
        localSlookWritingBuddy.setImageWritingListener(local1);
        AppMethodBeat.o(20466);
        bool = true;
      }
      catch (Exception paramnz)
      {
        while (true)
          ab.e("MicroMsg.extaccessories.SubCoreExtAccessories", "exception in writingBuddy %s", new Object[] { paramnz.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extaccessories.b.a
 * JD-Core Version:    0.6.2
 */