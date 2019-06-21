package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

final class b$3
  implements Runnable
{
  b$3(b.b paramb)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(17640);
    label322: label374: 
    while (true)
    {
      long l;
      Object localObject2;
      synchronized (b.aUg())
      {
        l = bo.anU();
        Iterator localIterator = b.aUg().entrySet().iterator();
        if (!localIterator.hasNext())
          break label322;
        localObject2 = (Map.Entry)localIterator.next();
        if (localObject2 == null)
          break label374;
        try
        {
          PByteArray localPByteArray = b.a((b)((Map.Entry)localObject2).getValue());
          if (localPByteArray != null)
          {
            if (b.aUh() != null)
            {
              b.aUh().j(((Integer)((Map.Entry)localObject2).getKey()).intValue(), localPByteArray.value);
              ab.i("MicroMsg.BackupBaseScene", "resendSceneMap sceneSeq[%d], type[%d], sceneBuf[%d]", new Object[] { ((Map.Entry)localObject2).getKey(), Integer.valueOf(((b)((Map.Entry)localObject2).getValue()).getType()), Integer.valueOf(localPByteArray.value.length) });
              i++;
              if ((i > 0) && (i % 5 == 0))
                this.jxo.fo(false);
              continue;
            }
            ab.e("MicroMsg.BackupBaseScene", "resendSceneMap engineSender null, sceneSeq[%d], type[%d], sceneBuf[%d]", new Object[] { ((Map.Entry)localObject2).getKey(), Integer.valueOf(((b)((Map.Entry)localObject2).getValue()).getType()), Integer.valueOf(localPByteArray.value.length) });
            continue;
          }
        }
        catch (Exception localException)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("req to buf fail: ");
          ab.printErrStackTrace("MicroMsg.BackupBaseScene", localException, localException.toString(), new Object[0]);
          continue;
        }
      }
      ab.e("MicroMsg.BackupBaseScene", "resendSceneMap sceneBuf null, sceneSeq[%d]", new Object[] { ((Map.Entry)localObject2).getKey() });
      continue;
      this.jxo.fo(true);
      ab.i("MicroMsg.BackupBaseScene", "resendSceneMap finish, sceneMap[%d], time[%d]", new Object[] { Integer.valueOf(b.aUg().size()), Long.valueOf(bo.gb(l)) });
      AppMethodBeat.o(17640);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.b.3
 * JD-Core Version:    0.6.2
 */