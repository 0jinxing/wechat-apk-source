package com.tencent.mm.plugin.fav.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Map;

public final class c
{
  public static String a(abs paramabs)
  {
    int i = 0;
    AppMethodBeat.i(102757);
    if ((paramabs == null) || ((paramabs.wiJ.isEmpty()) && (paramabs.wiI.isEmpty())))
    {
      ab.v("MicroMsg.FavTagParser", "tag list toXml data list empty");
      paramabs = "";
      AppMethodBeat.o(102757);
    }
    while (true)
    {
      return paramabs;
      StringBuffer localStringBuffer = new StringBuffer();
      int j = paramabs.wiJ.size();
      localStringBuffer.append("<taglist count='").append(j).append("'>");
      for (int k = 0; k < j; k++)
        localStringBuffer.append("<tag>").append(bo.ani((String)paramabs.wiJ.get(k))).append("</tag>");
      localStringBuffer.append("</taglist>");
      j = paramabs.wiI.size();
      localStringBuffer.append("<recommendtaglist count='").append(j).append("'>");
      for (k = i; k < j; k++)
        localStringBuffer.append("<tag>").append(bo.ani((String)paramabs.wiI.get(k))).append("</tag>");
      localStringBuffer.append("</recommendtaglist>");
      paramabs = localStringBuffer.toString();
      AppMethodBeat.o(102757);
    }
  }

  public static void a(Map<String, String> paramMap, abs paramabs)
  {
    AppMethodBeat.i(102756);
    if ((paramMap == null) || (paramabs == null))
    {
      ab.w("MicroMsg.FavTagParser", "maps is null or item is null");
      AppMethodBeat.o(102756);
    }
    while (true)
    {
      return;
      paramabs.wiJ.clear();
      int i = 0;
      StringBuilder localStringBuilder;
      Object localObject;
      if (i < 1024)
      {
        localStringBuilder = new StringBuilder(".favitem.taglist.tag");
        if (i > 0);
        for (localObject = Integer.valueOf(i); ; localObject = "")
        {
          localObject = (String)paramMap.get(localObject);
          if (localObject == null)
            break label110;
          paramabs.wiJ.add(localObject);
          i++;
          break;
        }
      }
      label110: if (!paramabs.wiJ.isEmpty())
        ab.d("MicroMsg.FavTagParser", "user def tag not empty, res=%s", new Object[] { paramabs.wiJ });
      paramabs.wiI.clear();
      i = 0;
      if (i < 1024)
      {
        localStringBuilder = new StringBuilder(".favitem.recommendtaglist.tag");
        if (i > 0);
        for (localObject = Integer.valueOf(i); ; localObject = "")
        {
          localObject = (String)paramMap.get(localObject);
          if (localObject == null)
            break label222;
          paramabs.wiI.add(localObject);
          i++;
          break;
        }
      }
      label222: if (!paramabs.wiI.isEmpty())
        ab.d("MicroMsg.FavTagParser", "recommended tag not empty, res=%s", new Object[] { paramabs.wiI });
      AppMethodBeat.o(102756);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.a.c
 * JD-Core Version:    0.6.2
 */