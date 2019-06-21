package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class x$b
{
  public boolean cNx;
  public int color;
  public int hOg;
  public boolean zfs;
  public int zfu;
  public int zfv;

  public static b y(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(33180);
    Object localObject = (String)paramMap.get(paramString + ".range");
    if (bo.isNullOrNil((String)localObject))
    {
      ab.e("MicroMsg.StyleNode", "parseFrom fail, range is null");
      AppMethodBeat.o(33180);
      paramMap = null;
    }
    while (true)
    {
      return paramMap;
      if ((((String)localObject).length() < 5) || (((String)localObject).charAt(0) != '{') || (((String)localObject).charAt(((String)localObject).length() - 1) != '}') || (!((String)localObject).contains(",")))
      {
        ab.e("MicroMsg.StyleNode", "parseFrom fail, range wrong format, range = ".concat(String.valueOf(localObject)));
        AppMethodBeat.o(33180);
        paramMap = null;
      }
      else
      {
        ab.d("MicroMsg.StyleNode", "parseFrom, range = ".concat(String.valueOf(localObject)));
        localObject = ((String)localObject).substring(1, ((String)localObject).length() - 1).split(",");
        if ((localObject != null) && (localObject.length == 2))
          break;
        ab.e("MicroMsg.StyleNode", "parseFrom fail, range wrong format, strs array length = " + localObject.length);
        AppMethodBeat.o(33180);
        paramMap = null;
      }
    }
    b localb = new b();
    while (true)
    {
      try
      {
        localb.zfu = bo.getInt(localObject[0], 0);
        int i = localb.zfu;
        localb.zfv = (bo.getInt(localObject[1], 0) + i);
        localObject = (String)paramMap.get(paramString + ".font");
        if (!bo.isNullOrNil((String)localObject))
          break label385;
        ab.d("MicroMsg.StyleNode", "parseFrom, font is null, use default value");
        localObject = "m";
        localb.cNx = x.cW((String)localObject);
        localb.zfs = x.xq((String)localObject);
        localb.hOg = x.arI((String)localObject);
        localb.color = x.arJ((String)paramMap.get(paramString + ".color"));
        AppMethodBeat.o(33180);
        paramMap = localb;
      }
      catch (Exception paramMap)
      {
        ab.e("MicroMsg.StyleNode", "parseFrom fail, ex = " + paramMap.getMessage());
        AppMethodBeat.o(33180);
        paramMap = null;
      }
      break;
      label385: localObject = ((String)localObject).toLowerCase();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.x.b
 * JD-Core Version:    0.6.2
 */