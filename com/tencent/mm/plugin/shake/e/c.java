package com.tencent.mm.plugin.shake.e;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class c
{
  public static c.a WN(String paramString)
  {
    c.a locala = null;
    AppMethodBeat.i(24953);
    if (paramString == null)
    {
      AppMethodBeat.o(24953);
      paramString = locala;
    }
    while (true)
    {
      return paramString;
      Map localMap = br.z(paramString, "tv");
      if (localMap == null)
      {
        AppMethodBeat.o(24953);
        paramString = locala;
      }
      else
      {
        locala = new c.a();
        locala.field_id = bo.nullAsNil((String)localMap.get("" + ".tv.id"));
        locala.field_topic = bo.nullAsNil((String)localMap.get("" + ".tv.topic"));
        locala.field_title = bo.nullAsNil((String)localMap.get("" + ".tv.title"));
        locala.field_subtitle = bo.nullAsNil((String)localMap.get("" + ".tv.subtitle"));
        locala.field_thumburl = bo.nullAsNil((String)localMap.get("" + ".tv.thumburl"));
        locala.field_shareurl = bo.nullAsNil((String)localMap.get("" + ".tv.shareurl"));
        locala.field_playurl = bo.nullAsNil((String)localMap.get("" + ".tv.playurl"));
        locala.field_playstatid = bo.nullAsNil((String)localMap.get("" + ".tv.playurl$statid"));
        locala.field_source = bo.nullAsNil((String)localMap.get("" + ".tv.source"));
        locala.qiL = a.l(localMap, "" + ".tv");
        locala.field_xml = paramString;
        AppMethodBeat.o(24953);
        paramString = locala;
      }
    }
  }

  public static String a(Context paramContext, c.a parama)
  {
    AppMethodBeat.i(24955);
    j.b localb = new j.b();
    localb.title = parama.field_title;
    if (!bo.isNullOrNil(parama.field_topic));
    for (localb.description = parama.field_topic; ; localb.description = parama.field_subtitle)
    {
      localb.type = 20;
      localb.url = parama.field_shareurl;
      localb.action = "";
      if (k.cjQ())
      {
        localb.appName = paramContext.getString(2131302788);
        localb.appId = "wxaf060266bfa9a35c";
      }
      localb.thumburl = parama.field_thumburl;
      localb.fgT = b(parama);
      paramContext = j.b.a(localb, null, null);
      AppMethodBeat.o(24955);
      return paramContext;
    }
  }

  public static String b(c.a parama)
  {
    AppMethodBeat.i(24954);
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append("<tv>");
    if (!bo.isNullOrNil(parama.field_id))
      localStringBuilder.append("<id>" + bo.ani(parama.field_id) + "</id>");
    localStringBuilder.append("<title>" + bo.ani(parama.field_title) + "</title>");
    localStringBuilder.append("<subtitle>" + bo.ani(parama.field_subtitle) + "</subtitle>");
    localStringBuilder.append("<topic>" + bo.ani(parama.field_topic) + "</topic>");
    localStringBuilder.append("<thumburl>" + bo.ani(parama.field_thumburl) + "</thumburl>");
    localStringBuilder.append("<shareurl>" + bo.ani(parama.field_shareurl) + "</shareurl>");
    if (!bo.isNullOrNil(parama.field_playstatid))
      localStringBuilder.append("<playurl statid=\"" + parama.field_playstatid + "\">" + bo.ani(parama.field_playurl) + "</playurl>");
    while (true)
    {
      localStringBuilder.append("<source>" + bo.ani(parama.field_source) + "</source>");
      localStringBuilder.append("</tv>");
      parama = localStringBuilder.toString();
      AppMethodBeat.o(24954);
      return parama;
      localStringBuilder.append("<playurl>" + bo.ani(parama.field_playurl) + "</playurl>");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.e.c
 * JD-Core Version:    0.6.2
 */