package com.tencent.mm.plugin.messenger.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class b
{
  public static ArrayList<b.a> RF(String paramString)
  {
    AppMethodBeat.i(136941);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.SysMsgTemplateParser", "hy: null text!!");
      paramString = null;
      AppMethodBeat.o(136941);
    }
    while (true)
    {
      return paramString;
      ArrayList localArrayList = new ArrayList();
      String[] arrayOfString = paramString.split("\\$");
      int i = 0;
      if (i < arrayOfString.length)
      {
        if (i % 2 == 0);
        for (paramString = new b.a(0, arrayOfString[i]); ; paramString = new b.a(1, arrayOfString[i]))
        {
          localArrayList.add(paramString);
          i++;
          break;
        }
      }
      AppMethodBeat.o(136941);
      paramString = localArrayList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.b.b
 * JD-Core Version:    0.6.2
 */