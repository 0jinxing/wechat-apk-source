package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jv;
import com.tencent.mm.g.a.jv.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class n$3 extends c<jv>
{
  n$3(n paramn)
  {
    AppMethodBeat.i(50754);
    this.xxI = jv.class.getName().hashCode();
    AppMethodBeat.o(50754);
  }

  private boolean a(jv paramjv)
  {
    AppMethodBeat.i(50755);
    ab.d("MicroMsg.SubCoreMediaRpt", "get media info report event.");
    if (paramjv == null)
      AppMethodBeat.o(50755);
    while (true)
    {
      return false;
      String str1 = paramjv.cEU.path;
      String str2 = str1;
      String str3 = str1;
      try
      {
        if (str1.endsWith(".tmp"))
        {
          str3 = str1;
          str2 = str1.substring(0, str1.lastIndexOf(".tmp"));
          str3 = str2;
          ab.i("MicroMsg.SubCoreMediaRpt", "media info event path[%s, %s]", new Object[] { str2, paramjv.cEU.path });
        }
        str3 = str2;
        label91: n localn = this.fWp;
        str2 = paramjv.cEU.cEV;
        String str4 = paramjv.cEU.cEW;
        int i = paramjv.cEU.cEX;
        str1 = paramjv.cEU.fileId;
        String str5 = paramjv.cEU.cEZ;
        long l1 = paramjv.cEU.startTime;
        long l2 = paramjv.cEU.endTime;
        String[] arrayOfString = paramjv.cEU.cEY;
        int j = paramjv.cEU.cFa;
        int k = paramjv.cEU.cFb;
        paramjv = paramjv.cEU.cFc;
        g.RS().aa(new n.2(localn, str3, arrayOfString, str2, str4, i, str1, str5, l1, l2, j, k, paramjv));
        AppMethodBeat.o(50755);
      }
      catch (Exception localException)
      {
        break label91;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.n.3
 * JD-Core Version:    0.6.2
 */