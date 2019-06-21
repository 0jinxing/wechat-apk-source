package com.tencent.mm.plugin.sns.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class b$a
{
  public List<b.b> list;

  public b$a()
  {
    AppMethodBeat.i(36900);
    this.list = new LinkedList();
    AppMethodBeat.o(36900);
  }

  public final a q(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(36901);
    String str1 = paramString + ".adxml.feedbackInfo.feedbackList.item";
    int i = 0;
    if (i > 0);
    for (paramString = str1 + i; ; paramString = str1)
    {
      String str2 = paramString + ".url";
      if ((paramMap.get(str2) != null) && (((String)paramMap.get(str2)).length() > 0))
      {
        b.b localb = new b.b();
        localb.url = bo.bc((String)paramMap.get(str2), "");
        localb.qVi = bo.bc((String)paramMap.get(paramString + ".Wording.zh"), "");
        localb.qOI = bo.bc((String)paramMap.get(paramString + ".Wording.en"), "");
        localb.qVj = bo.bc((String)paramMap.get(paramString + ".Wording.tw"), "");
        if (localb.qVi.length() + localb.qOI.length() + localb.qVj.length() > 0)
          this.list.add(localb);
        i++;
        break;
      }
      AppMethodBeat.o(36901);
      return this;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.b.a
 * JD-Core Version:    0.6.2
 */