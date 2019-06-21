package com.tencent.mm.af.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class a
{
  public String appId;
  public String bQi;
  public String content;
  private String fjU;
  public int fjV;
  public int fjW;
  public String path;
  public String title;
  public int type;
  public String username;

  public static a mk(String paramString)
  {
    AppMethodBeat.i(51122);
    paramString = br.z(paramString, "sysmsg");
    a locala = new a();
    if (paramString == null)
      AppMethodBeat.o(51122);
    while (true)
    {
      return locala;
      locala.fjU = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.template"));
      locala.title = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.title"));
      locala.content = locala.fjU.replace("$wxaapp_view$", locala.title);
      locala.appId = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.appid"));
      locala.username = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.username"));
      locala.path = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.path"));
      locala.type = bo.getInt((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.type"), 0);
      locala.bQi = ((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.share_key"));
      locala.fjV = bo.getInt((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.forbids"), 0);
      locala.fjW = bo.getInt((String)paramString.get(".sysmsg.subscribesysmsg.content_template.link_list.link.wxaapp_type"), 1);
      AppMethodBeat.o(51122);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.a.a
 * JD-Core Version:    0.6.2
 */