package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.jv;
import com.tencent.mm.i.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public class n
  implements at
{
  public HashMap<String, n.a> fWm;
  private c<jv> fWn;

  public n()
  {
    AppMethodBeat.i(50757);
    this.fWn = new n.3(this);
    this.fWm = new HashMap();
    a.xxA.c(this.fWn);
    AppMethodBeat.o(50757);
  }

  public static n alj()
  {
    AppMethodBeat.i(50758);
    n localn = (n)q.Y(n.class);
    AppMethodBeat.o(50758);
    return localn;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void a(d paramd, String paramString)
  {
    AppMethodBeat.i(50760);
    if ((paramd == null) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(50760);
    while (true)
    {
      return;
      g.RS().aa(new n.1(this, paramString, paramd));
      AppMethodBeat.o(50760);
    }
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50759);
    n.a locala1 = (n.a)this.fWm.get(paramString2);
    n.a locala2 = locala1;
    if (locala1 == null)
      locala2 = new n.a(this);
    locala2.fWz = paramString1;
    locala2.fWA = paramString2;
    locala2.toUser = paramString3;
    locala2.dqJ = paramString4;
    locala2.fWB = paramString5;
    locala2.fWD = paramInt1;
    locala2.fWC = paramInt2;
    locala2.startTime = bo.anU();
    this.fWm.put(paramString2, locala2);
    ab.i("MicroMsg.SubCoreMediaRpt", "note video upload path[%s, %s] toUser %s msgSource %s snsInfoId %s sendScene %d cpStatus %d", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(50759);
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.n
 * JD-Core Version:    0.6.2
 */