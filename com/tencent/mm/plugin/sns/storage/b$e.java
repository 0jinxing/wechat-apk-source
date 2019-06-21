package com.tencent.mm.plugin.sns.storage;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class b$e
{
  public String appVersion;
  public String cBb;
  public String csu;
  public String qTA;
  public List<b.h> qVt;

  public b$e()
  {
    AppMethodBeat.i(36902);
    this.qTA = "";
    this.qVt = new ArrayList();
    AppMethodBeat.o(36902);
  }

  public final void r(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(36903);
    this.qTA = bo.bc((String)paramMap.get(paramString + ".adxml.adTurnActionLink"), "");
    String str = (String)paramMap.get(paramString + ".adxml.adTurnActionExtWeApp.appUserName");
    if (!TextUtils.isEmpty(str))
    {
      this.cBb = str;
      this.appVersion = ((String)paramMap.get(paramString + ".adxml.adTurnActionExtWeApp.appVersion"));
      this.csu = ((String)paramMap.get(paramString + ".adxml.adTurnActionExtWeApp.relativePagePath"));
    }
    str = paramString + ".adxml.adTurnInfo.materialInfo";
    int i = 0;
    if (i > 0);
    for (paramString = str + i; ; paramString = str)
    {
      if ((paramMap.get(paramString + ".displayType") != null) && (((String)paramMap.get(paramString + ".displayType")).length() > 0))
      {
        b.h localh = new b.h();
        localh.title = bo.bc((String)paramMap.get(paramString + ".title"), "");
        localh.desc = bo.bc((String)paramMap.get(paramString + ".desc"), "");
        localh.qVk = bo.ank((String)paramMap.get(paramString + ".displayType"));
        this.qVt.add(localh);
        i++;
        break;
      }
      AppMethodBeat.o(36903);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.b.e
 * JD-Core Version:    0.6.2
 */