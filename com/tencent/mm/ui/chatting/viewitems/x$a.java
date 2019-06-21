package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class x$a
  implements Comparable<a>
{
  public boolean cNx;
  public int color;
  public int hOg;
  public int offset;
  public boolean zfs;
  public String zft;

  public static a x(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(33178);
    a locala = new a();
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      locala.offset = bo.getInt((String)paramMap.get(paramString + ".offset"), 0);
      localObject = (String)paramMap.get(paramString + ".font");
      if (bo.isNullOrNil((String)localObject))
      {
        ab.d("MicroMsg.LineNode", "parseFrom, font is null, use default value");
        localObject = "m";
        locala.cNx = x.cW((String)localObject);
        locala.zfs = x.xq((String)localObject);
        locala.hOg = x.arI((String)localObject);
        locala.color = x.arJ((String)paramMap.get(paramString + ".color"));
        locala.zft = ((String)paramMap.get(paramString + ".chars"));
        if (!bo.isNullOrNil(locala.zft))
          break label257;
        ab.e("MicroMsg.LineNode", "parseFrom fail, chars is null");
        AppMethodBeat.o(33178);
        paramMap = null;
        return paramMap;
      }
    }
    catch (Exception paramMap)
    {
      while (true)
      {
        ab.e("MicroMsg.LineNode", "parseFrom fail, ex = " + paramMap.getMessage());
        AppMethodBeat.o(33178);
        paramMap = null;
        continue;
        Object localObject = ((String)localObject).toLowerCase();
        continue;
        label257: AppMethodBeat.o(33178);
        paramMap = locala;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.x.a
 * JD-Core Version:    0.6.2
 */