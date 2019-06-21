package com.tencent.mm.plugin.story.f;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.g;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/MultiUserGalleryPresenter$UserData;", "", "username", "", "state", "", "items", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;ILjava/util/ArrayList;)V", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getState", "()I", "setState", "(I)V", "getUsername", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "plugin-story_release"})
public final class i$a
{
  ArrayList<g> cHb;
  int state;
  final String username;

  public i$a(String paramString, ArrayList<g> paramArrayList)
  {
    AppMethodBeat.i(109589);
    this.username = paramString;
    this.state = 0;
    this.cHb = paramArrayList;
    AppMethodBeat.o(109589);
  }

  public final void V(ArrayList<g> paramArrayList)
  {
    AppMethodBeat.i(109588);
    j.p(paramArrayList, "<set-?>");
    this.cHb = paramArrayList;
    AppMethodBeat.o(109588);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(109592);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof a))
        break label83;
      paramObject = (a)paramObject;
      if (!j.j(this.username, paramObject.username))
        break label83;
      if (this.state == paramObject.state)
      {
        i = 1;
        if ((i == 0) || (!j.j(this.cHb, paramObject.cHb)))
          break label83;
      }
    }
    else
    {
      AppMethodBeat.o(109592);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label83: AppMethodBeat.o(109592);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(109591);
    Object localObject = this.username;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      int k = this.state;
      localObject = this.cHb;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(109591);
      return (j * 31 + k) * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(109590);
    String str = "UserData(username=" + this.username + ", state=" + this.state + ", items=" + this.cHb + ")";
    AppMethodBeat.o(109590);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.i.a
 * JD-Core Version:    0.6.2
 */