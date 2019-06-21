package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ay.a;
import com.tencent.mm.ay.a.a;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;
import java.util.Map;

public final class k extends a
{
  public k(Map<String, String> paramMap, bi parambi)
  {
    super(paramMap, parambi);
  }

  public static void Yu()
  {
    AppMethodBeat.i(11236);
    a.a.a("biz_services_mute", new k.1());
    AppMethodBeat.o(11236);
  }

  public final boolean Yt()
  {
    AppMethodBeat.i(11235);
    if (this.values == null)
      AppMethodBeat.o(11235);
    while (true)
    {
      return false;
      if (!this.TYPE.equals("biz_services_mute"))
      {
        AppMethodBeat.o(11235);
      }
      else
      {
        String str1 = (String)this.values.get(".sysmsg.biz_services_mute.text");
        String str2 = (String)this.values.get(".sysmsg.biz_services_mute.link.text");
        str1 = str1 + str2;
        this.fKY.add(str2);
        this.fKZ.addFirst(Integer.valueOf(str1.length() - str2.length()));
        this.fLa.add(Integer.valueOf(str1.length()));
        this.fKW = str1;
        AppMethodBeat.o(11235);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.k
 * JD-Core Version:    0.6.2
 */