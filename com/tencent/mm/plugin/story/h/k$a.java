package com.tencent.mm.plugin.story.h;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryInfoStorage$Companion;", "", "()V", "CON_FAVORITE", "", "CON_HISTORY", "CON_NOT_VISIBLE_SELF", "CON_OTHERS", "CON_STORY_ID", "CON_USER", "EventNotifyStoryInfoDelete", "", "INDEX_CREATE", "", "getINDEX_CREATE", "()[Ljava/lang/String;", "[Ljava/lang/String;", "NotifyStoryInfoDelete", "ORDER_BY_FAV_SEQ", "getORDER_BY_FAV_SEQ", "()Ljava/lang/String;", "setORDER_BY_FAV_SEQ", "(Ljava/lang/String;)V", "ORDER_BY_SEQ", "getORDER_BY_SEQ", "setORDER_BY_SEQ", "SQL_CREATE", "kotlin.jvm.PlatformType", "getSQL_CREATE", "STORYINFO_SELECT_BEGIN", "STORYINFO_SELECT_COUNT", "TABLE", "getTABLE", "TAG", "buildLimitString", "data", "", "col", "reverse", "", "getORIntRange", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "plugin-story_release"})
public final class k$a
{
  public static String b(List<Integer> paramList, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(109930);
    j.p(paramList, "data");
    j.p(paramString, "col");
    StringBuilder localStringBuilder = new StringBuilder("(");
    if (paramBoolean)
      localStringBuilder.append(paramString + " not in (");
    while (true)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localStringBuilder.append(((Number)paramList.next()).intValue());
        if (paramList.hasNext())
          localStringBuilder.append(",");
      }
      localStringBuilder.append(paramString + " in (");
    }
    localStringBuilder.append(")");
    localStringBuilder.append(")");
    paramList = localStringBuilder.toString();
    j.o(paramList, "sb.toString()");
    AppMethodBeat.o(109930);
    return paramList;
  }

  public static ArrayList<Integer> dm(List<Integer> paramList)
  {
    AppMethodBeat.i(109931);
    j.p(paramList, "data");
    Object localObject = new ArrayList((Collection)paramList);
    paramList = new HashSet();
    ArrayList localArrayList1 = new ArrayList();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Integer localInteger = (Integer)((Iterator)localObject).next();
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        j.o(localInteger, "i");
        localArrayList2.add(Integer.valueOf(i | localInteger.intValue()));
      }
      paramList.addAll((Collection)new HashSet((Collection)localArrayList2));
      paramList.add(localInteger);
    }
    paramList.add(Integer.valueOf(0));
    localArrayList1.addAll((Collection)paramList);
    AppMethodBeat.o(109931);
    return localArrayList1;
  }

  public static String f(List<Integer> paramList, String paramString)
  {
    AppMethodBeat.i(109929);
    j.p(paramList, "data");
    j.p(paramString, "col");
    paramList = b(paramList, paramString, false);
    AppMethodBeat.o(109929);
    return paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.k.a
 * JD-Core Version:    0.6.2
 */