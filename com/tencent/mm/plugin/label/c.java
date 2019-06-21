package com.tencent.mm.plugin.label;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class c
{
  public static String cf(List<String> paramList)
  {
    AppMethodBeat.i(22508);
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramList != null) && (paramList.size() > 0))
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        localStringBuilder.append((String)paramList.get(j));
        if (j < i - 1)
          localStringBuilder.append(",");
      }
      localStringBuilder.append("");
    }
    paramList = localStringBuilder.toString();
    AppMethodBeat.o(22508);
    return paramList;
  }

  public static String eR(String paramString1, String paramString2)
  {
    AppMethodBeat.i(22506);
    ab.d("MicroMsg.Label.LabelUtils", "original:%s,waitToAddLabel:%s", new Object[] { paramString1, paramString2 });
    if (bo.isNullOrNil(paramString2))
      AppMethodBeat.o(22506);
    while (true)
    {
      return paramString1;
      if (bo.isNullOrNil(paramString1))
      {
        paramString1 = paramString2 + "";
        AppMethodBeat.o(22506);
      }
      else
      {
        String str = paramString1;
        if (paramString1.endsWith(""))
          str = paramString1.replace("", "");
        if (bo.P(str.split(",")).contains(paramString2))
        {
          paramString1 = str + "";
          AppMethodBeat.o(22506);
        }
        else
        {
          paramString1 = str + "," + paramString2 + "";
          AppMethodBeat.o(22506);
        }
      }
    }
  }

  public static String eS(String paramString1, String paramString2)
  {
    AppMethodBeat.i(22507);
    ab.d("MicroMsg.Label.LabelUtils", "original:%s,waitToDelLabel:%s", new Object[] { paramString1, paramString2 });
    if (bo.isNullOrNil(paramString2))
      AppMethodBeat.o(22507);
    while (true)
    {
      return paramString1;
      if (bo.isNullOrNil(paramString1))
      {
        paramString1 = "";
        AppMethodBeat.o(22507);
      }
      else
      {
        String str = paramString1;
        if (paramString1.endsWith(""))
          str = paramString1.replace("", "");
        paramString1 = bo.P(str.split(","));
        if (paramString1.contains(paramString2))
        {
          paramString1.remove(paramString2);
          paramString1 = cf(paramString1);
          AppMethodBeat.o(22507);
        }
        else
        {
          AppMethodBeat.o(22507);
          paramString1 = str;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.c
 * JD-Core Version:    0.6.2
 */