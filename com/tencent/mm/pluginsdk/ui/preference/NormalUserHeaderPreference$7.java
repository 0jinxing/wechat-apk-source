package com.tencent.mm.pluginsdk.ui.preference;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bv;

final class NormalUserHeaderPreference$7
  implements Runnable
{
  NormalUserHeaderPreference$7(NormalUserHeaderPreference paramNormalUserHeaderPreference, bv parambv)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(28080);
    if ((NormalUserHeaderPreference.a(this.vrk) != null) && (this.plA != null) && (NormalUserHeaderPreference.a(this.vrk).field_username.equals(this.plA.field_encryptUsername)))
    {
      NormalUserHeaderPreference.a(this.vrk).iz(this.plA.field_conRemark);
      if (!NormalUserHeaderPreference.j(this.vrk))
      {
        ab.e("MicroMsg.ContactInfoHeader", "initView : bindView = " + NormalUserHeaderPreference.k(this.vrk) + "contact = " + NormalUserHeaderPreference.a(this.vrk).field_username);
        AppMethodBeat.o(28080);
      }
    }
    while (true)
    {
      return;
      NormalUserHeaderPreference.f(this.vrk);
      AppMethodBeat.o(28080);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference.7
 * JD-Core Version:    0.6.2
 */