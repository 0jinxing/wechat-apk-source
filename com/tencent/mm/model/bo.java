package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ay.a;
import com.tencent.mm.ay.a.a;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;
import java.util.Map;

public final class bo extends a
{
  public bo(Map<String, String> paramMap, bi parambi)
  {
    super(paramMap, parambi);
  }

  public static void Yu()
  {
    AppMethodBeat.i(11239);
    a.a.a("reportbizlocation", new bo.1());
    AppMethodBeat.o(11239);
  }

  public final boolean Yt()
  {
    AppMethodBeat.i(11238);
    if (this.values == null)
      AppMethodBeat.o(11238);
    while (true)
    {
      return false;
      if (!this.TYPE.equals("reportbizlocation"))
      {
        AppMethodBeat.o(11238);
      }
      else
      {
        String str1 = (String)this.values.get(".sysmsg.reportbizlocation.text");
        String str2 = (String)this.values.get(".sysmsg.reportbizlocation.link.text");
        str1 = str1 + str2;
        this.fKY.add(str2);
        this.fKZ.addFirst(Integer.valueOf(str1.length() - str2.length()));
        this.fLa.add(Integer.valueOf(str1.length()));
        this.fKW = str1;
        AppMethodBeat.o(11238);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bo
 * JD-Core Version:    0.6.2
 */