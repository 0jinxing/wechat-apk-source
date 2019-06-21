package com.tencent.mm.plugin.ext.provider;

import android.database.MatrixCursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fl;
import com.tencent.mm.g.a.fl.b;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.fr.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class ExtControlProviderMsg$1
  implements Runnable
{
  ExtControlProviderMsg$1(ExtControlProviderMsg paramExtControlProviderMsg, int paramInt, long paramLong, com.tencent.mm.pluginsdk.d.a.b paramb, String[] paramArrayOfString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20348);
    Object localObject1;
    Object localObject2;
    if (this.jOk == 1)
    {
      com.tencent.mm.plugin.ext.b.bry();
      localObject1 = com.tencent.mm.plugin.ext.b.ig(this.lQm);
      if ((localObject1 == null) || ((int)((com.tencent.mm.n.a)localObject1).ewQ <= 0))
      {
        this.lQn.vf(3);
        this.jDX.countDown();
        AppMethodBeat.o(20348);
      }
      while (true)
      {
        return;
        localObject2 = new fl();
        ((fl)localObject2).czk.op = 1;
        ((fl)localObject2).czk.username = ((ap)localObject1).field_username;
        if (com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2))
          break;
        this.lQn.vf(4);
        this.jDX.countDown();
        AppMethodBeat.o(20348);
      }
      ExtControlProviderMsg.a(this.lQn, new MatrixCursor(ExtControlProviderMsg.brO()));
      if ((localObject1 != null) && ((int)((com.tencent.mm.n.a)localObject1).ewQ > 0) && (((fl)localObject2).czl.cvi))
      {
        ExtControlProviderMsg.a(this.lQn).addRow(new Object[] { this.ewE[1], Integer.valueOf(1), "0" });
        this.lQn.vf(0);
        label204: ab.d("MicroMsg.ExtControlProviderMsg", "start record, ret=[%s], fileName=[%s]", new Object[] { Boolean.valueOf(((fl)localObject2).czl.cvi), ((fl)localObject2).czl.fileName });
      }
    }
    while (true)
    {
      this.jDX.countDown();
      AppMethodBeat.o(20348);
      break;
      ExtControlProviderMsg.a(this.lQn).addRow(new Object[] { this.ewE[1], Integer.valueOf(2), "0" });
      this.lQn.vf(3);
      break label204;
      if (this.jOk == 2)
      {
        localObject1 = new fl();
        ((fl)localObject1).czk.op = 2;
        if (!com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1))
        {
          this.lQn.vf(4);
          this.jDX.countDown();
          AppMethodBeat.o(20348);
          break;
        }
        localObject2 = ((fl)localObject1).czl.fileName;
        ExtControlProviderMsg.a(this.lQn, new MatrixCursor(ExtControlProviderMsg.brO()));
        fr localfr = new fr();
        localfr.czG.fileName = ((String)localObject2);
        if (!com.tencent.mm.sdk.b.a.xxA.m(localfr))
        {
          this.lQn.vf(4);
          ExtControlProviderMsg.a(this.lQn).close();
          this.jDX.countDown();
          AppMethodBeat.o(20348);
          break;
        }
        ab.d("MicroMsg.ExtControlProviderMsg", "stop record, msgId=[%s]", new Object[] { Long.valueOf(localfr.czH.cvx) });
        long l = localfr.czH.cvx;
        if (l > 0L)
        {
          try
          {
            if (!((fl)localObject1).czl.cvi)
              break label641;
            if ((ah.getContext() == null) || (!at.isConnected(ah.getContext())))
              break label591;
            ExtControlProviderMsg.a(this.lQn).addRow(new Object[] { this.ewE[1], Integer.valueOf(1), com.tencent.mm.plugin.ext.a.a.ii(l) });
            this.lQn.vf(0);
          }
          catch (Exception localException)
          {
            ab.w("MicroMsg.ExtControlProviderMsg", localException.getMessage());
            ab.printErrStackTrace("MicroMsg.ExtControlProviderMsg", localException, "", new Object[0]);
            this.lQn.vf(4);
          }
          continue;
          label591: ExtControlProviderMsg.a(this.lQn).addRow(new Object[] { this.ewE[1], Integer.valueOf(6), com.tencent.mm.plugin.ext.a.a.ii(l) });
          this.lQn.vf(4);
          continue;
          label641: ExtControlProviderMsg.a(this.lQn).addRow(new Object[] { this.ewE[1], Integer.valueOf(4), com.tencent.mm.plugin.ext.a.a.ii(l) });
          this.lQn.vf(4);
        }
        else
        {
          this.lQn.vf(3);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg.1
 * JD-Core Version:    0.6.2
 */