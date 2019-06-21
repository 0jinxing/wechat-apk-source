package com.tencent.mm.plugin.story.model;

import a.f.b.j;
import a.k.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cej;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryTimelineConvert$Companion;", "", "()V", "INVALID_TAG", "", "getINVALID_TAG", "()Ljava/lang/String;", "setINVALID_TAG", "(Ljava/lang/String;)V", "TAG", "filterId", "s", "filterNull", "isNumeric", "", "str", "pullTimeLineXml", "timeLine", "Lcom/tencent/mm/protocal/protobuf/StoryTimelineObject;", "editor", "Lcom/tencent/mm/protocal/protobuf/StoryMediaEditorInfo;", "plugin-story_release"})
public final class p$a
{
  private static String YE(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  private static String YF(String paramString)
  {
    AppMethodBeat.i(109136);
    j.p(paramString, "s");
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(109136);
    }
    while (true)
    {
      return paramString;
      if (isNumeric(paramString))
      {
        AppMethodBeat.o(109136);
      }
      else
      {
        paramString = "";
        AppMethodBeat.o(109136);
      }
    }
  }

  public static String a(cfb paramcfb, cej paramcej)
  {
    AppMethodBeat.i(109135);
    j.p(paramcfb, "timeLine");
    p.b localb = new p.b();
    HashMap localHashMap = new HashMap();
    localb.Fi("StoryObject");
    localb.Fi("id");
    if ((paramcfb.Id == null) || (paramcfb.Id.equals("")))
      localb.setText("0");
    Object localObject;
    while (true)
    {
      localb.Fj("id");
      if (paramcfb.jBB != null)
      {
        localb.Fi("username");
        localb.aaD(paramcfb.jBB);
        localb.Fj("username");
      }
      localb.Fi("createTime");
      localb.aaD(String.valueOf(paramcfb.pcX));
      localb.Fj("createTime");
      localb.Fi("scope");
      localb.setText(paramcfb.xeC);
      localb.Fj("scope");
      localb.Fi("featured");
      localb.setText(paramcfb.xeD);
      localb.Fj("featured");
      localb.Fi("report");
      localb.Fi("publish_obj_id");
      String str = paramcfb.xeB;
      localObject = str;
      if (str == null)
        localObject = "";
      localb.aaD((String)localObject);
      localb.Fj("publish_obj_id");
      ab.i("czf", "report ".concat(String.valueOf(paramcej)));
      if (paramcej == null)
        break label508;
      localb.Fi("music");
      if (paramcej.xef)
      {
        localb.Fi("req_id");
        localb.aaD(String.valueOf(paramcej.xee));
        localb.Fj("req_id");
        localb.Fi("id");
        localb.setText(paramcej.rTW);
        localb.Fj("id");
        localb.Fi("index");
        localb.setText(paramcej.xdZ);
        localb.Fj("index");
      }
      localb.Fj("music");
      localb.Fi("emojiList");
      localObject = paramcej.xeg;
      j.o(localObject, "editor.emojiMd5");
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        str = (String)((Iterator)localObject).next();
        localb.Fi("emoji");
        j.o(str, "it");
        localb.aaD(str);
        localb.Fj("emoji");
      }
      localb.setText(paramcfb.Id);
    }
    localb.Fj("emojiList");
    localb.Fi("wordList");
    paramcej = paramcej.xeh;
    j.o(paramcej, "editor.wordText");
    paramcej = ((Iterable)paramcej).iterator();
    while (paramcej.hasNext())
    {
      localObject = (String)paramcej.next();
      localb.Fi("word");
      j.o(localObject, "it");
      localb.aaD((String)localObject);
      localb.Fj("word");
    }
    localb.Fj("wordList");
    label508: localb.Fj("report");
    localb.Fi("ContentObject");
    localb.Fi("title");
    localb.aaD(YE(paramcfb.xeA.Title));
    localb.Fj("title");
    if (paramcfb.xeA.wbK.size() > 0)
    {
      localb.Fi("mediaList");
      paramcej = paramcfb.xeA.wbK.iterator();
      if (paramcej.hasNext())
      {
        paramcfb = (cek)paramcej.next();
        localb.Fi("media");
        localb.Fi("id");
        localObject = paramcfb.Id;
        j.o(localObject, "media.Id");
        if (j.j(YF((String)localObject), ""))
          localb.aaD("0");
        while (true)
        {
          localb.Fj("id");
          localb.Fi("type");
          localb.aaD(String.valueOf(paramcfb.jCt));
          localb.Fj("type");
          localb.Fi("duration");
          float f = paramcfb.duration;
          localb.jvt.append(f);
          localb.Fj("duration");
          localHashMap.clear();
          ((Map)localHashMap).put("type", String.valueOf(paramcfb.wEG));
          if (!bo.isNullOrNil(paramcfb.cvZ))
            ((Map)localHashMap).put("md5", paramcfb.cvZ);
          if (!bo.isNullOrNil(paramcfb.wFc))
            ((Map)localHashMap).put("videomd5", paramcfb.wFc);
          localb.m("url", (Map)localHashMap);
          localb.aaD(YE(paramcfb.Url));
          localb.Fj("url");
          if ((paramcfb.wEH != null) && (!paramcfb.wEH.equals("")))
          {
            localHashMap.clear();
            ((Map)localHashMap).put("type", String.valueOf(paramcfb.wEI));
            localb.m("thumb", (Map)localHashMap);
            localb.aaD(YE(paramcfb.wEH));
            localb.Fj("thumb");
          }
          if (paramcfb.cuu > 0)
          {
            localb.Fi("subType");
            localb.aaD(String.valueOf(paramcfb.cuu));
            localb.Fj("subType");
          }
          localb.Fj("media");
          break;
          localObject = paramcfb.Id;
          j.o(localObject, "media.Id");
          localb.aaD(YF((String)localObject));
        }
      }
      localb.Fj("mediaList");
    }
    localb.Fj("ContentObject");
    localb.Fj("StoryObject");
    paramcfb = localb.jvt.toString();
    j.o(paramcfb, "sb.toString()");
    ab.d(p.access$getTAG$cp(), "xmlContent: ".concat(String.valueOf(paramcfb)));
    if (br.z(paramcfb, "StoryObject") == null)
    {
      ab.e(p.access$getTAG$cp(), "xml is error");
      paramcfb = "";
      AppMethodBeat.o(109135);
    }
    while (true)
    {
      return paramcfb;
      AppMethodBeat.o(109135);
    }
  }

  private static boolean isNumeric(String paramString)
  {
    AppMethodBeat.i(109137);
    j.p(paramString, "str");
    paramString = (CharSequence)paramString;
    boolean bool = new k("\\d*").aq(paramString);
    AppMethodBeat.o(109137);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.p.a
 * JD-Core Version:    0.6.2
 */