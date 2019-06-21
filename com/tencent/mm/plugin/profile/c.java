package com.tencent.mm.plugin.profile;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class c
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private volatile com.tencent.mm.plugin.profile.ui.newbizinfo.d.a pkw;
  private o pkx;

  static
  {
    AppMethodBeat.i(23250);
    eaA = new HashMap();
    b.a(new com.tencent.mm.plugin.profile.ui.newbizinfo.a.a(), new String[] { "//usenewprofile" });
    eaA.put(Integer.valueOf("NEW_BIZINFO_PROFILE_INFO_TABLE".hashCode()), new c.1());
    AppMethodBeat.o(23250);
  }

  public c()
  {
    AppMethodBeat.i(23244);
    this.pkx = new c.2(this);
    AppMethodBeat.o(23244);
  }

  public static int am(Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(23249);
    if (paramIntent != null)
    {
      i = paramIntent.getIntExtra("CONTACT_INFO_UI_SOURCE", 0);
      ab.d("MicroMsg.SubCoreProfile", "[getPrefixAddScene] source:".concat(String.valueOf(i)));
      AppMethodBeat.o(23249);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(23249);
    }
  }

  public static com.tencent.mm.plugin.profile.ui.newbizinfo.d.a cap()
  {
    AppMethodBeat.i(23245);
    g.RN().QU();
    if (caq().pkw == null)
    {
      localObject = caq();
      aw.ZK();
      ((c)localObject).pkw = new com.tencent.mm.plugin.profile.ui.newbizinfo.d.a(com.tencent.mm.model.c.Ru());
    }
    Object localObject = caq().pkw;
    AppMethodBeat.o(23245);
    return localObject;
  }

  private static c caq()
  {
    AppMethodBeat.i(23246);
    aw.ZE();
    c localc1 = (c)bw.oJ("plugin.profile");
    c localc2 = localc1;
    if (localc1 == null)
    {
      ab.w("MicroMsg.SubCoreProfile", "not found in MMCore, new one");
      localc2 = new c();
      aw.ZE().a("plugin.freewifi", localc2);
    }
    AppMethodBeat.o(23246);
    return localc2;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(23247);
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("NewXmlOpenIMFriReqAcceptedInWxWork", this.pkx);
    AppMethodBeat.o(23247);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(23248);
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("NewXmlOpenIMFriReqAcceptedInWxWork", this.pkx);
    AppMethodBeat.o(23248);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.c
 * JD-Core Version:    0.6.2
 */