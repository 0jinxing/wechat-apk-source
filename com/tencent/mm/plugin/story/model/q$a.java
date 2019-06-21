package com.tencent.mm.plugin.story.model;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.LinkedList;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryTimelineHelper$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "fillContentObj", "Lcom/tencent/mm/protocal/protobuf/StoryTimelineObject;", "maps", "", "timeLine", "fillLocation", "getMediaObj", "Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;", "srcMedia", "id", "mediaType", "", "mediaUrl", "mediaThumb", "mediaUrlType", "mediaThumbType", "desc", "isPrivated", "getNewTimeline", "parserFloat", "", "src", "parserFromXml", "xml", "parserInt", "parserLong", "", "parserString", "plugin-story_release"})
public final class q$a
{
  private static cfb a(cfb paramcfb)
  {
    AppMethodBeat.i(109146);
    cei localcei = new cei();
    localcei.vRp = 0.0F;
    localcei.vRq = 0.0F;
    localcei.guP = "";
    localcei.wCE = 0;
    localcei.wCC = "";
    localcei.rki = 0;
    localcei.rkg = "";
    localcei.eUu = "";
    localcei.wCF = 1;
    localcei.wCH = "";
    localcei.country = "";
    paramcfb.xez = localcei;
    AppMethodBeat.o(109146);
    return paramcfb;
  }

  private static cfb a(Map<String, String> paramMap, cfb paramcfb)
  {
    AppMethodBeat.i(109147);
    if (paramcfb.xeA == null)
      paramcfb.xeA = new cea();
    paramcfb.xeA.Title = tB((String)paramMap.get("contTitle"));
    int i = 0;
    Object localObject1;
    Object localObject2;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    Object localObject3;
    Object localObject4;
    if (i != 0)
    {
      localObject1 = new StringBuilder();
      localObject2 = q.d.rTL;
      localObject1 = ((StringBuilder)localObject1).append(q.d.cyH());
      localObject2 = q.b.rTm;
      localObject2 = ((StringBuilder)localObject1).append(q.b.cyr());
      localObject1 = q.c.rTD;
      localObject2 = ((StringBuilder)localObject2).append(q.c.cys()).append(i);
      localObject1 = q.c.rTD;
      str1 = q.c.cyt();
      localObject2 = new StringBuilder();
      localObject1 = q.d.rTL;
      localObject1 = ((StringBuilder)localObject2).append(q.d.cyH());
      localObject2 = q.b.rTm;
      localObject1 = ((StringBuilder)localObject1).append(q.b.cyr());
      localObject2 = q.c.rTD;
      localObject1 = ((StringBuilder)localObject1).append(q.c.cys()).append(i);
      localObject2 = q.c.rTD;
      str2 = q.c.cyu();
      localObject1 = new StringBuilder();
      localObject2 = q.d.rTL;
      localObject2 = ((StringBuilder)localObject1).append(q.d.cyH());
      localObject1 = q.b.rTm;
      localObject2 = ((StringBuilder)localObject2).append(q.b.cyr());
      localObject1 = q.c.rTD;
      localObject2 = ((StringBuilder)localObject2).append(q.c.cys()).append(i);
      localObject1 = q.c.rTD;
      str3 = q.c.cyv();
      localObject1 = new StringBuilder();
      localObject2 = q.d.rTL;
      localObject2 = ((StringBuilder)localObject1).append(q.d.cyH());
      localObject1 = q.b.rTm;
      localObject1 = ((StringBuilder)localObject2).append(q.b.cyr());
      localObject2 = q.c.rTD;
      localObject2 = ((StringBuilder)localObject1).append(q.c.cys()).append(i);
      localObject1 = q.c.rTD;
      str4 = q.c.cyw();
      localObject1 = new StringBuilder();
      localObject2 = q.d.rTL;
      localObject2 = ((StringBuilder)localObject1).append(q.d.cyH());
      localObject1 = q.b.rTm;
      localObject2 = ((StringBuilder)localObject2).append(q.b.cyr());
      localObject1 = q.c.rTD;
      localObject1 = ((StringBuilder)localObject2).append(q.c.cys()).append(i);
      localObject2 = q.c.rTD;
      str5 = q.c.cyy();
      localObject2 = new StringBuilder();
      localObject1 = q.d.rTL;
      localObject1 = ((StringBuilder)localObject2).append(q.d.cyH());
      localObject2 = q.b.rTm;
      localObject1 = ((StringBuilder)localObject1).append(q.b.cyr());
      localObject2 = q.c.rTD;
      localObject1 = ((StringBuilder)localObject1).append(q.c.cys()).append(i);
      localObject2 = q.c.rTD;
      str6 = q.c.cyx();
      localObject1 = new StringBuilder();
      localObject2 = q.d.rTL;
      localObject2 = ((StringBuilder)localObject1).append(q.d.cyH());
      localObject1 = q.b.rTm;
      localObject1 = ((StringBuilder)localObject2).append(q.b.cyr());
      localObject2 = q.c.rTD;
      localObject1 = ((StringBuilder)localObject1).append(q.c.cys()).append(i);
      localObject2 = q.c.rTD;
      str7 = q.c.cyz();
      localObject1 = new StringBuilder();
      localObject2 = q.d.rTL;
      localObject2 = ((StringBuilder)localObject1).append(q.d.cyH());
      localObject1 = q.b.rTm;
      localObject2 = ((StringBuilder)localObject2).append(q.b.cyr());
      localObject1 = q.c.rTD;
      localObject1 = ((StringBuilder)localObject2).append(q.c.cys()).append(i);
      localObject2 = q.c.rTD;
      str8 = q.c.cyA();
      localObject2 = new StringBuilder();
      localObject1 = q.d.rTL;
      localObject1 = ((StringBuilder)localObject2).append(q.d.cyH());
      localObject2 = q.b.rTm;
      localObject1 = ((StringBuilder)localObject1).append(q.b.cyr());
      localObject2 = q.c.rTD;
      localObject2 = ((StringBuilder)localObject1).append(q.c.cys()).append(i);
      localObject1 = q.c.rTD;
      localObject1 = q.c.cyB();
      localObject2 = new StringBuilder();
      localObject3 = q.d.rTL;
      localObject2 = ((StringBuilder)localObject2).append(q.d.cyH());
      localObject3 = q.b.rTm;
      localObject2 = ((StringBuilder)localObject2).append(q.b.cyr());
      localObject3 = q.c.rTD;
      ((StringBuilder)localObject2).append(q.c.cys()).append(i);
      localObject2 = new StringBuilder();
      localObject3 = q.d.rTL;
      localObject2 = ((StringBuilder)localObject2).append(q.d.cyH());
      localObject3 = q.b.rTm;
      localObject3 = ((StringBuilder)localObject2).append(q.b.cyr());
      localObject2 = q.c.rTD;
      localObject2 = ((StringBuilder)localObject3).append(q.c.cys()).append(i);
      localObject3 = q.c.rTD;
      localObject3 = q.c.cyC();
      localObject2 = new StringBuilder();
      localObject4 = q.d.rTL;
      localObject4 = ((StringBuilder)localObject2).append(q.d.cyH());
      localObject2 = q.b.rTm;
      localObject2 = ((StringBuilder)localObject4).append(q.b.cyr());
      localObject4 = q.c.rTD;
      localObject4 = ((StringBuilder)localObject2).append(q.c.cys()).append(i);
      localObject2 = q.c.rTD;
      localObject2 = q.c.cyD();
      label886: str1 = (String)paramMap.get(str1);
      str2 = (String)paramMap.get(str2);
      if (str2 != null)
        break label2087;
      str2 = "";
    }
    label2087: 
    while (true)
    {
      str3 = (String)paramMap.get(str3);
      if (str3 == null)
        str3 = "";
      while (true)
      {
        str5 = (String)paramMap.get(str5);
        if (str5 == null)
          str5 = "";
        while (true)
        {
          str4 = (String)paramMap.get(str4);
          if (str4 == null)
            str4 = "";
          while (true)
          {
            str6 = (String)paramMap.get(str6);
            if (str6 == null)
              str6 = "";
            while (true)
            {
              str7 = (String)paramMap.get(str7);
              if (str7 == null)
                str7 = "";
              while (true)
              {
                str8 = (String)paramMap.get(str8);
                if (str8 == null)
                  str8 = "";
                while (true)
                {
                  paramMap.get(localObject1);
                  localObject1 = (String)paramMap.get(localObject3);
                  if (localObject1 == null)
                    localObject1 = "";
                  while (true)
                  {
                    localObject3 = (String)paramMap.get(localObject2);
                    localObject2 = localObject3;
                    if (localObject3 == null)
                      localObject2 = "";
                    if ((str2 == null) || (str1 == null))
                    {
                      AppMethodBeat.o(109147);
                      return paramcfb;
                      localObject1 = new StringBuilder();
                      localObject2 = q.d.rTL;
                      localObject2 = ((StringBuilder)localObject1).append(q.d.cyH());
                      localObject1 = q.b.rTm;
                      localObject2 = ((StringBuilder)localObject2).append(q.b.cyr());
                      localObject1 = q.c.rTD;
                      localObject2 = ((StringBuilder)localObject2).append(q.c.cys());
                      localObject1 = q.c.rTD;
                      str1 = q.c.cyt();
                      localObject2 = new StringBuilder();
                      localObject1 = q.d.rTL;
                      localObject2 = ((StringBuilder)localObject2).append(q.d.cyH());
                      localObject1 = q.b.rTm;
                      localObject1 = ((StringBuilder)localObject2).append(q.b.cyr());
                      localObject2 = q.c.rTD;
                      localObject2 = ((StringBuilder)localObject1).append(q.c.cys());
                      localObject1 = q.c.rTD;
                      str2 = q.c.cyu();
                      localObject1 = new StringBuilder();
                      localObject2 = q.d.rTL;
                      localObject1 = ((StringBuilder)localObject1).append(q.d.cyH());
                      localObject2 = q.b.rTm;
                      localObject2 = ((StringBuilder)localObject1).append(q.b.cyr());
                      localObject1 = q.c.rTD;
                      localObject2 = ((StringBuilder)localObject2).append(q.c.cys());
                      localObject1 = q.c.rTD;
                      str3 = q.c.cyv();
                      localObject2 = new StringBuilder();
                      localObject1 = q.d.rTL;
                      localObject2 = ((StringBuilder)localObject2).append(q.d.cyH());
                      localObject1 = q.b.rTm;
                      localObject2 = ((StringBuilder)localObject2).append(q.b.cyr());
                      localObject1 = q.c.rTD;
                      localObject1 = ((StringBuilder)localObject2).append(q.c.cys());
                      localObject2 = q.c.rTD;
                      str4 = q.c.cyw();
                      localObject1 = new StringBuilder();
                      localObject2 = q.d.rTL;
                      localObject2 = ((StringBuilder)localObject1).append(q.d.cyH());
                      localObject1 = q.b.rTm;
                      localObject1 = ((StringBuilder)localObject2).append(q.b.cyr());
                      localObject2 = q.c.rTD;
                      localObject2 = ((StringBuilder)localObject1).append(q.c.cys());
                      localObject1 = q.c.rTD;
                      str5 = q.c.cyy();
                      localObject1 = new StringBuilder();
                      localObject2 = q.d.rTL;
                      localObject2 = ((StringBuilder)localObject1).append(q.d.cyH());
                      localObject1 = q.b.rTm;
                      localObject2 = ((StringBuilder)localObject2).append(q.b.cyr());
                      localObject1 = q.c.rTD;
                      localObject1 = ((StringBuilder)localObject2).append(q.c.cys());
                      localObject2 = q.c.rTD;
                      str6 = q.c.cyx();
                      localObject2 = new StringBuilder();
                      localObject1 = q.d.rTL;
                      localObject1 = ((StringBuilder)localObject2).append(q.d.cyH());
                      localObject2 = q.b.rTm;
                      localObject2 = ((StringBuilder)localObject1).append(q.b.cyr());
                      localObject1 = q.c.rTD;
                      localObject2 = ((StringBuilder)localObject2).append(q.c.cys());
                      localObject1 = q.c.rTD;
                      str7 = q.c.cyz();
                      localObject1 = new StringBuilder();
                      localObject2 = q.d.rTL;
                      localObject1 = ((StringBuilder)localObject1).append(q.d.cyH());
                      localObject2 = q.b.rTm;
                      localObject2 = ((StringBuilder)localObject1).append(q.b.cyr());
                      localObject1 = q.c.rTD;
                      localObject1 = ((StringBuilder)localObject2).append(q.c.cys());
                      localObject2 = q.c.rTD;
                      str8 = q.c.cyA();
                      localObject1 = new StringBuilder();
                      localObject2 = q.d.rTL;
                      localObject2 = ((StringBuilder)localObject1).append(q.d.cyH());
                      localObject1 = q.b.rTm;
                      localObject1 = ((StringBuilder)localObject2).append(q.b.cyr());
                      localObject2 = q.c.rTD;
                      localObject2 = ((StringBuilder)localObject1).append(q.c.cys());
                      localObject1 = q.c.rTD;
                      localObject1 = q.c.cyB();
                      localObject3 = new StringBuilder();
                      localObject2 = q.d.rTL;
                      localObject3 = ((StringBuilder)localObject3).append(q.d.cyH());
                      localObject2 = q.b.rTm;
                      localObject2 = ((StringBuilder)localObject3).append(q.b.cyr());
                      localObject3 = q.c.rTD;
                      ((StringBuilder)localObject2).append(q.c.cys());
                      localObject3 = new StringBuilder();
                      localObject2 = q.d.rTL;
                      localObject3 = ((StringBuilder)localObject3).append(q.d.cyH());
                      localObject2 = q.b.rTm;
                      localObject2 = ((StringBuilder)localObject3).append(q.b.cyr());
                      localObject3 = q.c.rTD;
                      localObject3 = ((StringBuilder)localObject2).append(q.c.cys());
                      localObject2 = q.c.rTD;
                      localObject3 = q.c.cyC();
                      localObject2 = new StringBuilder();
                      localObject4 = q.d.rTL;
                      localObject4 = ((StringBuilder)localObject2).append(q.d.cyH());
                      localObject2 = q.b.rTm;
                      localObject4 = ((StringBuilder)localObject4).append(q.b.cyr());
                      localObject2 = q.c.rTD;
                      localObject2 = ((StringBuilder)localObject4).append(q.c.cys());
                      localObject4 = q.c.rTD;
                      localObject2 = q.c.cyD();
                      break label886;
                    }
                    localObject3 = new cek();
                    ((cek)localObject3).Id = tB(str1);
                    ((cek)localObject3).jCt = bo.getInt(str2, 0);
                    ((cek)localObject3).Url = tB(str3);
                    ((cek)localObject3).wEG = bo.getInt(str6, 0);
                    ((cek)localObject3).wEH = tB(str5);
                    ((cek)localObject3).wEI = bo.getInt(str7, 0);
                    ((cek)localObject3).cuu = bo.getInt(str8, 0);
                    ((cek)localObject3).cvZ = tB((String)localObject1);
                    ((cek)localObject3).wFc = tB(str4);
                    if (localObject2 == null);
                    for (float f = 0.0F; ; f = bo.getFloat((String)localObject2, 0.0F))
                    {
                      ((cek)localObject3).duration = f;
                      paramcfb.xeA.wbK.add(localObject3);
                      i++;
                      break;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public static cfb aaE(String paramString)
  {
    AppMethodBeat.i(109149);
    j.p(paramString, "xml");
    Map localMap = br.z(paramString, "StoryObject");
    if (localMap != null)
    {
      paramString = cyq();
      q.d locald = q.d.rTL;
      paramString.Id = tB((String)localMap.get(q.d.cyE()));
      locald = q.d.rTL;
      paramString.jBB = tB((String)localMap.get(q.d.cyF()));
      locald = q.d.rTL;
      paramString.pcX = bo.getInt((String)localMap.get(q.d.cyG()), 0);
      locald = q.d.rTL;
      paramString.xeC = bo.getInt((String)localMap.get(q.d.cyI()), 0);
      paramString = a(localMap, a(paramString));
      AppMethodBeat.o(109149);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(109149);
    }
  }

  public static cfb cyq()
  {
    AppMethodBeat.i(109148);
    cfb localcfb = new cfb();
    cea localcea = new cea();
    cei localcei = new cei();
    localcei.vRq = 0.0F;
    localcei.vRp = 0.0F;
    localcfb.xez = localcei;
    localcfb.xeA = localcea;
    localcfb.Id = "";
    localcfb.pcX = 0;
    AppMethodBeat.o(109148);
    return localcfb;
  }

  private static String tB(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.q.a
 * JD-Core Version:    0.6.2
 */