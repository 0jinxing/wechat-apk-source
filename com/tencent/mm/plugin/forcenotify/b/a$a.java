package com.tencent.mm.plugin.forcenotify.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class a$a
  implements Runnable
{
  a$a(a parama, cm paramcm)
  {
  }

  public final void run()
  {
    String str1 = null;
    AppMethodBeat.i(51025);
    if (a.a(this.msV))
    {
      localObject = com.tencent.mm.plugin.forcenotify.d.a.mth;
      com.tencent.mm.plugin.forcenotify.d.a.bya();
    }
    Object localObject = this.msW;
    if (localObject != null)
    {
      localObject = ((cm)localObject).vEG;
      localObject = br.z((String)localObject, "ForcePushId");
      if (localObject == null)
        break label88;
      localObject = (String)((Map)localObject).get(".ForcePushId");
      label61: if (localObject != null)
        break label93;
      ab.i(this.msV.TAG, "not a forcePush msg");
      AppMethodBeat.o(51025);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label88: localObject = null;
      break label61;
      label93: String str2 = this.msV.TAG;
      cm localcm = this.msW;
      if (localcm != null)
        str1 = localcm.vEG;
      ab.i(str2, "%s %s %s", new Object[] { str1, this.msW.vEB, localObject });
      str1 = aa.a(this.msW.vEB);
      if (((j.j(r.Yz(), str1) ^ true)) && (!a.b(this.msV).contains(str1)))
      {
        localObject = com.tencent.mm.plugin.forcenotify.d.a.mth;
        j.o(str1, "fromUser");
        if (com.tencent.mm.plugin.forcenotify.d.a.Mp(str1))
        {
          a.b(this.msV).add(str1);
          a.c(this.msV).post((Runnable)new a.a.1(this, str1));
        }
      }
      AppMethodBeat.o(51025);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.b.a.a
 * JD-Core Version:    0.6.2
 */