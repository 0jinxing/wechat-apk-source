package com.tencent.mm.ay;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bi;
import java.util.LinkedList;
import java.util.Map;

public final class c extends a
{
  public c(Map<String, String> paramMap, bi parambi)
  {
    super(paramMap, parambi);
  }

  protected final boolean Yt()
  {
    AppMethodBeat.i(5555);
    if (this.values == null)
      AppMethodBeat.o(5555);
    while (true)
    {
      return false;
      if (!this.TYPE.equals("chatroommuteexpt"))
      {
        AppMethodBeat.o(5555);
      }
      else
      {
        String str1 = (String)this.values.get(".sysmsg.chatroommuteexpt.text");
        String str2 = (String)this.values.get(".sysmsg.chatroommuteexpt.link.text");
        str1 = str1 + str2;
        this.fKY.add(str2);
        this.fKZ.addFirst(Integer.valueOf(str1.length() - str2.length()));
        this.fLa.add(Integer.valueOf(str1.length()));
        this.fKW = str1;
        AppMethodBeat.o(5555);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ay.c
 * JD-Core Version:    0.6.2
 */