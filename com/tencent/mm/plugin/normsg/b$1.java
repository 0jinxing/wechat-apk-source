package com.tencent.mm.plugin.normsg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.normsg.b.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.net.Inet4Address;
import java.net.InetAddress;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10313);
    if (!g.RK())
      AppMethodBeat.o(10313);
    while (true)
    {
      return;
      try
      {
        long l1 = System.currentTimeMillis();
        Object localObject1 = ah.getContext().getApplicationInfo().sourceDir;
        g.RN();
        localObject1 = Normsg.b.Ak(a.QF());
        g.RN();
        Object localObject2 = Normsg.b.Al(a.QF());
        long l2 = System.currentTimeMillis();
        Object localObject3 = String.format("<k25>%s</k25>", new Object[] { d.v((byte[])localObject1, 0, localObject1.length) });
        localObject1 = localObject3;
        if (localObject2 != null)
        {
          if (localObject2.length != 8)
            break label359;
          int i = localObject2[0];
          localObject2[0] = ((byte)localObject2[3]);
          localObject2[3] = ((byte)i);
          i = localObject2[1];
          localObject2[1] = ((byte)localObject2[2]);
          localObject2[2] = ((byte)i);
          i = localObject2[4];
          localObject2[4] = ((byte)localObject2[7]);
          localObject2[7] = ((byte)i);
          i = localObject2[5];
          localObject2[5] = ((byte)localObject2[6]);
          localObject2[6] = ((byte)i);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = (String)localObject3 + String.format("<k28>%s</k28><k29>%s</k29>", new Object[] { d.v((byte[])localObject2, 0, 4), d.v((byte[])localObject2, 4, 8) });
        }
        try
        {
          while (true)
          {
            localObject2 = Inet4Address.getByName("mp.weixin.qq.com").getHostAddress();
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = (String)localObject1 + String.format("<k32>%s</k32>", new Object[] { bo.nullAsNil((String)localObject2) });
            localObject1 = localObject3;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("checkSoftType2 [time: ");
            ab.i("MicroMsg.NormsgSourceImpl", l2 - l1 + ", value: " + (String)localObject1 + "]");
            g.RP().Ry().set(79, localObject1);
            AppMethodBeat.o(10313);
            break;
            label359: localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = (String)localObject3 + String.format("<k27>%s</k27>", new Object[] { d.v((byte[])localObject2, 0, localObject2.length) });
          }
        }
        catch (Exception localException2)
        {
          while (true)
            ab.e("MicroMsg.NormsgSourceImpl", "exception:%s", new Object[] { bo.l(localException2) });
        }
      }
      catch (Exception localException1)
      {
        ab.printErrStackTrace("MicroMsg.NormsgSourceImpl", localException1, "Failed checkSoftType2.", new Object[0]);
        AppMethodBeat.o(10313);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(10314);
    String str = super.toString() + "|checkSoftTypeExtra";
    AppMethodBeat.o(10314);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.1
 * JD-Core Version:    0.6.2
 */