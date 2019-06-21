package com.tencent.mm.plugin.sns.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class h
{
  public boolean cwB;
  public String nJy;
  public int qPO;
  public List<a> qPP;
  public String qPm;
  public String qPn;
  public String qQb;
  public int[] qQc;

  public h()
  {
    AppMethodBeat.i(36812);
    this.qPn = "";
    this.qPm = "";
    this.nJy = "";
    this.qQb = "";
    this.qPO = 0;
    this.qPP = new ArrayList();
    this.cwB = true;
    AppMethodBeat.o(36812);
  }

  public final boolean coC()
  {
    AppMethodBeat.i(36813);
    boolean bool;
    if ((this.cwB) && (this.qPP != null) && (this.qPP.size() > 0))
    {
      bool = true;
      AppMethodBeat.o(36813);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36813);
    }
  }

  public final boolean h(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(36814);
    this.qPn = paramString1;
    this.qPm = paramString2;
    if (paramMap == null)
      AppMethodBeat.o(36814);
    while (true)
    {
      return false;
      try
      {
        this.qPP.clear();
        this.nJy = bo.bc((String)paramMap.get("language"), "");
        this.qQb = bo.bc((String)paramMap.get("first_step_order"), "");
        paramString2 = this.qQb.split("\\|");
        this.qQc = new int[paramString2.length];
        if (this.qQc.length == 0)
          this.cwB = false;
        for (int i = 0; i < paramString2.length; i++)
        {
          this.qQc[i] = bo.ank(paramString2[i]);
          if ((this.qQc[i] <= 0) || (this.qQc[i] > 3))
            this.cwB = false;
        }
        int j = bo.ank((String)paramMap.get("wording_count"));
        int k = bo.ank((String)paramMap.get("expertype"));
        for (i = 0; i < j; i++)
        {
          paramString2 = new com/tencent/mm/plugin/sns/g/a;
          paramString2.<init>();
          paramString2.qOF = bo.ank((String)paramMap.get(String.format("wording_%d_id", new Object[] { Integer.valueOf(i + 1) })));
          paramString2.qOG = bo.bc((String)paramMap.get(String.format("wording_%d_zh_CN", new Object[] { Integer.valueOf(i + 1) })), "");
          paramString2.qOH = bo.bc((String)paramMap.get(String.format("wording_%d_zh_TW", new Object[] { Integer.valueOf(i + 1) })), "");
          paramString2.qOI = bo.bc((String)paramMap.get(String.format("wording_%d_en", new Object[] { Integer.valueOf(i + 1) })), "");
          paramString2.qOJ = bo.ank((String)paramMap.get(String.format("wording_%d_action_type", new Object[] { Integer.valueOf(i + 1) })));
          this.qPP.add(paramString2);
        }
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>("expertType ");
        ab.i("MicroMsg.SnsAdAbTestInfo", k + " " + paramString1 + " " + this.qQb);
        AppMethodBeat.o(36814);
      }
      catch (Exception paramString1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.SnsAdAbTestInfo", paramString1, "feed xml error ", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.h
 * JD-Core Version:    0.6.2
 */