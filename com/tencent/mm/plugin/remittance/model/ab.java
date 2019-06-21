package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class ab
{
  public static void VQ(String paramString)
  {
    AppMethodBeat.i(44799);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(44799);
    while (true)
    {
      return;
      Object localObject = cfr();
      com.tencent.mm.sdk.platformtools.ab.d("Micromsg.RemittanceLogic", "cur friendsListStr=".concat(String.valueOf(localObject)));
      StringBuilder localStringBuilder = new StringBuilder();
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = ((String)localObject).split(",");
        if (localObject != null)
        {
          int i = 0;
          int k;
          for (int j = 0; i < localObject.length; j = k)
          {
            k = j;
            if (!paramString.equals(localObject[i]))
            {
              localStringBuilder.append(localObject[i]);
              localStringBuilder.append(",");
              k = j + 1;
              if (k >= 4)
                break;
            }
            i++;
          }
        }
      }
      localStringBuilder.insert(0, ",");
      localStringBuilder.insert(0, paramString);
      localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
      com.tencent.mm.sdk.platformtools.ab.d("Micromsg.RemittanceLogic", "new friendsListStr=" + localStringBuilder.toString());
      g.RQ();
      g.RP().Ry().set(327733, localStringBuilder.toString());
      g.RQ();
      g.RP().Ry().dsb();
      AppMethodBeat.o(44799);
    }
  }

  public static String cfr()
  {
    AppMethodBeat.i(44800);
    g.RQ();
    String str = bo.nullAsNil((String)g.RP().Ry().get(327733, null));
    AppMethodBeat.o(44800);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.ab
 * JD-Core Version:    0.6.2
 */