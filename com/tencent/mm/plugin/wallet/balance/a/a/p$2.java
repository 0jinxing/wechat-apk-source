package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.concurrent.locks.ReentrantLock;

final class p$2
  implements Runnable
{
  p$2(p paramp, byte[] paramArrayOfByte, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45247);
    if (this.nhK != null)
    {
      p.b(this.tfy).lock();
      if (this.tfz)
      {
        if (e.ct(p.access$200()))
          e.N(p.access$200(), true);
        e.tf(p.access$200());
        p.c(this.tfy);
        p.b(this.tfy).unlock();
      }
    }
    while (true)
    {
      try
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = System.currentTimeMillis();
        if (this.tfz)
        {
          localObject = p.access$200();
          ab.i("MicroMsg.LqtBindQueryInfoCache", "saveCacheToDisk, dir: %s, name: %s, save: %s", new Object[] { localObject, str, Boolean.valueOf(this.tfz) });
          long l = bo.yz();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          if (!this.tfz)
            continue;
          localObject = p.access$200();
          str = (String)localObject + str;
          localObject = this.nhK;
          e.b(str, (byte[])localObject, localObject.length);
          ab.i("MicroMsg.LqtBindQueryInfoCache", "finish saveCacheToDisk, used %sms", new Object[] { Long.valueOf(bo.az(l)) });
          AppMethodBeat.o(45247);
          return;
          if (e.ct(p.access$400()))
            e.N(p.access$400(), true);
          e.tf(p.access$400());
          p.d(this.tfy);
          break;
        }
        localObject = p.access$400();
        continue;
        localObject = p.access$400();
        continue;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", localException, "saveCacheToDisk error: %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(45247);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.p.2
 * JD-Core Version:    0.6.2
 */