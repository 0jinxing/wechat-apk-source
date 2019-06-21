package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.f;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.Map;

public final class e
{
  private static e nvv = null;
  c gyU;
  public ArrayList<f> nvw;

  private e()
  {
    AppMethodBeat.i(21736);
    this.nvw = null;
    this.gyU = new e.1(this);
    AppMethodBeat.o(21736);
  }

  public static e bHj()
  {
    AppMethodBeat.i(21737);
    if (nvv == null)
      nvv = new e();
    e locale = nvv;
    AppMethodBeat.o(21737);
    return locale;
  }

  public final boolean aX(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21738);
    try
    {
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>(paramArrayOfByte);
      try
      {
        Map localMap = br.z((String)localObject1, "feedbackconfig");
        if (localMap == null)
          break label494;
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        i = 0;
        paramArrayOfByte = new java/lang/StringBuilder;
        paramArrayOfByte.<init>();
        localObject2 = paramArrayOfByte.append(".feedbackconfig.resourceslist.resources");
        if (i != 0)
          break label392;
        paramArrayOfByte = "";
        paramArrayOfByte = paramArrayOfByte;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject3 = (String)localMap.get(paramArrayOfByte + ".$langid");
        if (localObject3 == null)
          break label456;
        localObject2 = new com/tencent/mm/plugin/ipcall/a/g/f;
        ((f)localObject2).<init>();
        ((f)localObject2).nzA = ((String)localObject3);
        localObject3 = new java/util/ArrayList;
        ((ArrayList)localObject3).<init>();
        ((f)localObject2).nzB = ((ArrayList)localObject3);
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = paramArrayOfByte + ".string";
        j = 0;
        while (true)
        {
          com.tencent.mm.plugin.ipcall.a.g.e locale = new com/tencent/mm/plugin/ipcall/a/g/e;
          locale.<init>();
          paramArrayOfByte = new java/lang/StringBuilder;
          paramArrayOfByte.<init>();
          Object localObject4 = paramArrayOfByte.append((String)localObject3);
          if (j != 0)
            break;
          paramArrayOfByte = "";
          localObject4 = paramArrayOfByte;
          paramArrayOfByte = (String)localMap.get(localObject4);
          if (paramArrayOfByte == null)
            break label410;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject4 = (String)localMap.get((String)localObject4 + ".$id");
          if (localObject4 == null)
            break label410;
          j++;
          locale.Id = ((String)localObject4);
          locale.nzz = paramArrayOfByte;
          ((f)localObject2).nzB.add(locale);
        }
      }
      catch (Exception paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.IPCallFeedbackConfigUpdater", paramArrayOfByte, "", new Object[0]);
        ab.e("MicroMsg.IPCallFeedbackConfigUpdater", "parse ipcall feedback config error: %s", new Object[] { paramArrayOfByte.getMessage() });
        AppMethodBeat.o(21738);
        bool = false;
      }
      return bool;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        Object localObject1;
        int i;
        Object localObject2;
        int j;
        ab.printErrStackTrace("MicroMsg.IPCallFeedbackConfigUpdater", paramArrayOfByte, "", new Object[0]);
        ab.e("MicroMsg.IPCallFeedbackConfigUpdater", "parse ipcall feedback config new string error: %s", new Object[] { paramArrayOfByte.getMessage() });
        AppMethodBeat.o(21738);
        boolean bool = false;
        continue;
        label392: paramArrayOfByte = Integer.valueOf(i);
        continue;
        paramArrayOfByte = Integer.valueOf(j);
        continue;
        label410: ab.d("MicroMsg.IPCallFeedbackConfigUpdater", "feedbackResource parse id:%s,wording count:%d", new Object[] { ((f)localObject2).nzA, Integer.valueOf(((f)localObject2).nzB.size()) });
        ((ArrayList)localObject1).add(localObject2);
        i++;
        continue;
        label456: ab.i("MicroMsg.IPCallFeedbackConfigUpdater", "feedbackResource parse finished count:%d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
        this.nvw = ((ArrayList)localObject1);
        AppMethodBeat.o(21738);
        bool = true;
        continue;
        label494: ab.e("MicroMsg.IPCallFeedbackConfigUpdater", "parse xml feedbackconfig error");
        AppMethodBeat.o(21738);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.e
 * JD-Core Version:    0.6.2
 */