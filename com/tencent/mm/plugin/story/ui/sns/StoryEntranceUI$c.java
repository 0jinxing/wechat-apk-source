package com.tencent.mm.plugin.story.ui.sns;

import a.f.a.m;
import a.l;
import a.y;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter$EntranceViewHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI;", "(Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI;)V", "onItemClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$DataObject;", "item", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "userList", "Ljava/util/ArrayList;", "getItemCount", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "extinfoList", "", "EntranceViewHolder", "EntranceViewTipHolder", "EntranceViewUserHolder", "plugin-story_release"})
public final class StoryEntranceUI$c extends RecyclerView.a<StoryEntranceUI.c.a>
{
  m<? super Integer, ? super StoryEntranceUI.b, y> seN;
  final ArrayList<StoryEntranceUI.b> shw;

  public StoryEntranceUI$c()
  {
    AppMethodBeat.i(110257);
    this.shw = new ArrayList();
    AppMethodBeat.o(110257);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(110253);
    int i = this.shw.size();
    AppMethodBeat.o(110253);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(110255);
    paramInt = ((StoryEntranceUI.b)this.shw.get(paramInt)).type;
    AppMethodBeat.o(110255);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.StoryEntranceUI.c
 * JD-Core Version:    0.6.2
 */