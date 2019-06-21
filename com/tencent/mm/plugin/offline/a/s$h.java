package com.tencent.mm.plugin.offline.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class s$h
{
  public String cRb;
  public String cRc;
  public String cRd;
  public String cRe;
  public String cRf;
  public boolean oZd;

  public s$h(Map<String, String> paramMap)
  {
    AppMethodBeat.i(43422);
    Object localObject;
    this.cRb = ((String)localObject.get(".sysmsg.paymsg.guide_flag"));
    this.cRc = ((String)localObject.get(".sysmsg.paymsg.guide_wording"));
    this.cRd = ((String)localObject.get(".sysmsg.paymsg.left_button_wording"));
    this.cRe = ((String)localObject.get(".sysmsg.paymsg.right_button_wording"));
    this.cRf = ((String)localObject.get(".sysmsg.paymsg.upload_credit_url"));
    if ("1".equals(localObject.get(".sysmsg.paymsg.guide_block")));
    for (boolean bool = true; ; bool = false)
    {
      this.oZd = bool;
      AppMethodBeat.o(43422);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.s.h
 * JD-Core Version:    0.6.2
 */