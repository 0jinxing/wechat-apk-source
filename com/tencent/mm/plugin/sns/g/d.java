package com.tencent.mm.plugin.sns.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d
{
  public boolean cwB;
  public String nJy;
  public int qPO;
  public List<d.b> qPP;
  public String qPm;
  public String qPn;

  public d()
  {
    AppMethodBeat.i(36802);
    this.qPn = "";
    this.qPm = "";
    this.nJy = "";
    this.qPO = 0;
    this.qPP = new ArrayList();
    this.cwB = true;
    AppMethodBeat.o(36802);
  }

  public final boolean h(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(36803);
    this.qPn = paramString1;
    this.qPm = paramString2;
    if (paramMap == null)
      AppMethodBeat.o(36803);
    while (true)
    {
      return false;
      try
      {
        this.qPP.clear();
        this.nJy = bo.bc((String)paramMap.get("language"), "");
        if (!this.nJy.equals("zh_cn"))
          this.cwB = false;
        int i = bo.ank((String)paramMap.get("tipcount"));
        int j = bo.ank((String)paramMap.get("expertype"));
        for (int k = 0; k < i; k++)
        {
          d.b localb = new com/tencent/mm/plugin/sns/g/d$b;
          localb.<init>();
          localb.title = bo.bc((String)paramMap.get(String.format("tip_%d_basetextformat", new Object[] { Integer.valueOf(k) })), "");
          localb.qPT = bo.ank((String)paramMap.get(String.format("tip_%d_id", new Object[] { Integer.valueOf(k) })));
          localb.showType = bo.ank((String)paramMap.get(String.format("tip_%d_showtype", new Object[] { Integer.valueOf(k) })));
          int m = bo.ank((String)paramMap.get(String.format("tip_%d_button_count", new Object[] { Integer.valueOf(k) })));
          if (localb.showType >= 6)
            this.cwB = false;
          for (int n = 0; n < m; n++)
          {
            paramString2 = new com/tencent/mm/plugin/sns/g/d$a;
            paramString2.<init>();
            paramString2.index = bo.ank((String)paramMap.get(String.format("tip_%d_button_%d_index", new Object[] { Integer.valueOf(k), Integer.valueOf(n) })));
            paramString2.actionType = bo.ank((String)paramMap.get(String.format("tip_%d_button_%d_actiontype", new Object[] { Integer.valueOf(k), Integer.valueOf(n) })));
            paramString2.qPQ = bo.bc((String)paramMap.get(String.format("tip_%d_button_%d_basetextformat", new Object[] { Integer.valueOf(k), Integer.valueOf(n) })), "");
            paramString2.jumpUrl = bo.bc((String)paramMap.get(String.format("tip_%d_button_%d_jumpurl", new Object[] { Integer.valueOf(k), Integer.valueOf(n) })), "");
            paramString2.qPR = bo.bc((String)paramMap.get(String.format("tip_%d_button_%d_priortextformat", new Object[] { Integer.valueOf(k), Integer.valueOf(n) })), "");
            paramString2.qPS = bo.ank((String)paramMap.get(String.format("tip_%d_button_%d_nexttipviewid", new Object[] { Integer.valueOf(k), Integer.valueOf(n) })));
            if (paramString2.actionType >= 9)
              this.cwB = false;
            localb.hhZ.add(paramString2);
          }
          this.qPP.add(localb);
        }
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>("expertType ");
        ab.i("Micromsg.SnsABTestInfo", j + " " + paramString1);
        AppMethodBeat.o(36803);
      }
      catch (Exception paramString1)
      {
        while (true)
          ab.printErrStackTrace("Micromsg.SnsABTestInfo", paramString1, "feed xml error ", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.d
 * JD-Core Version:    0.6.2
 */