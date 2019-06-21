package com.tencent.mm.plugin.story.c.a;

import a.a.ad;
import a.h.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedHashMap;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryEntranceElementConfig$ShowEntranceType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "CONTACT_PAGE", "TIMELINE_LIKE", "TIMELINE_DETAIL", "TIMELINE_COMMENT", "TIMELINE_USER_HEAD", "CHATTING_ROOM", "MESSAGE_PAGE", "Companion", "plugin-story_release"})
public enum d$b
{
  private static final Map<Integer, b> map;
  public static final d.b.a rRy;
  private final int value;

  static
  {
    int i = 0;
    AppMethodBeat.i(108972);
    Object localObject1 = new b("DEFAULT", 0, -1);
    rRp = (b)localObject1;
    Object localObject2 = new b("CONTACT_PAGE", 1, 0);
    rRq = (b)localObject2;
    b localb1 = new b("TIMELINE_LIKE", 2, 1);
    rRr = localb1;
    b localb2 = new b("TIMELINE_DETAIL", 3, 2);
    rRs = localb2;
    b localb3 = new b("TIMELINE_COMMENT", 4, 3);
    rRt = localb3;
    b localb4 = new b("TIMELINE_USER_HEAD", 5, 4);
    rRu = localb4;
    b localb5 = new b("CHATTING_ROOM", 6, 5);
    rRv = localb5;
    b localb6 = new b("MESSAGE_PAGE", 7, 6);
    rRw = localb6;
    rRx = new b[] { localObject1, localObject2, localb1, localb2, localb3, localb4, localb5, localb6 };
    rRy = new d.b.a((byte)0);
    localObject1 = values();
    localObject2 = (Map)new LinkedHashMap(e.im(ad.SI(localObject1.length), 16));
    int j = localObject1.length;
    while (i < j)
    {
      localb4 = localObject1[i];
      ((Map)localObject2).put(Integer.valueOf(localb4.value), localb4);
      i++;
    }
    map = (Map)localObject2;
    AppMethodBeat.o(108972);
  }

  private d$b(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.c.a.d.b
 * JD-Core Version:    0.6.2
 */