package com.tencent.mm.plugin.hp.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.hp.a.b;
import com.tencent.mm.plugin.hp.d.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class g$2
  implements Runnable
{
  g$2(g paramg, String[] paramArrayOfString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(90610);
    Object localObject1 = com.tencent.mm.compatible.util.e.eSn + "/Download/2017-07-28_19-43-39.apk";
    Object localObject2 = com.tencent.mm.compatible.util.e.eSn + "/Download/39-50-diff.apk";
    Object localObject3 = com.tencent.mm.compatible.util.e.eSn + "/Download/new_50.apk";
    String str = "ab099f75f740be5d88e178d662a36779";
    Object localObject4 = localObject1;
    if (this.ewE.length >= 3)
    {
      localObject4 = localObject1;
      if (!bo.isNullOrNil(this.ewE[2]))
        localObject4 = this.ewE[2];
    }
    localObject1 = localObject2;
    if (this.ewE.length >= 4)
    {
      localObject1 = localObject2;
      if (!bo.isNullOrNil(this.ewE[3]))
        localObject1 = this.ewE[3];
    }
    localObject2 = localObject3;
    if (this.ewE.length >= 5)
    {
      localObject2 = localObject3;
      if (!bo.isNullOrNil(this.ewE[4]))
        localObject2 = this.ewE[4];
    }
    localObject3 = str;
    if (this.ewE.length >= 6)
    {
      localObject3 = str;
      if (!bo.isNullOrNil(this.ewE[5]))
        localObject3 = this.ewE[5];
    }
    int i;
    if (!com.tencent.mm.a.e.ct((String)localObject2))
    {
      long l = System.currentTimeMillis();
      i = b.b((String)localObject4, (String)localObject1, (String)localObject2, (String)localObject3);
      ab.i("MicroMsg.Tinker.TinkerBootsCommand", "merge apk use :%d retCode：%d", new Object[] { Long.valueOf((System.currentTimeMillis() - l) / 1000L), Integer.valueOf(i) });
    }
    while (true)
    {
      if (i == 0)
      {
        ab.i("MicroMsg.Tinker.TinkerBootsCommand", "show dialog for install");
        ab.i("MicroMsg.Tinker.TinkerBootsCommand", "New Apk md5:%s", new Object[] { com.tencent.mm.a.g.cz((String)localObject2) });
        d.aC(ah.getContext(), (String)localObject2);
        ab.i("MicroMsg.Tinker.TinkerBootsCommand", "md5 is equal.");
        AppMethodBeat.o(90610);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.Tinker.TinkerBootsCommand", "merge apk failed.");
        AppMethodBeat.o(90610);
      }
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.g.2
 * JD-Core Version:    0.6.2
 */