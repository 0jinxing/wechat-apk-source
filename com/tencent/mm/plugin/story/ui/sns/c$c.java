package com.tencent.mm.plugin.story.ui.sns;

import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter$EntranceViewHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView;", "(Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView;)V", "onItemClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$DataObject;", "item", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "userList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "extInfoList", "", "EntranceViewHolder", "EntranceViewTipHolder", "EntranceViewUserHolder", "plugin-story_release"})
public final class c$c extends RecyclerView.a<c.c.a>
{
  m<? super Integer, ? super c.b, y> seN;
  final ArrayList<c.b> shw;

  public c$c()
  {
    AppMethodBeat.i(110279);
    this.shw = new ArrayList();
    AppMethodBeat.o(110279);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(110275);
    int i = this.shw.size();
    AppMethodBeat.o(110275);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(110277);
    paramInt = ((c.b)this.shw.get(paramInt)).type;
    AppMethodBeat.o(110277);
    return paramInt;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter$EntranceViewTipHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter$EntranceViewHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView;", "itemView", "Landroid/view/View;", "tipId", "", "(Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter;Landroid/view/View;I)V", "contentTv", "Landroid/widget/TextView;", "getContentTv", "()Landroid/widget/TextView;", "getTipId", "()I", "setTipId", "(I)V", "onBind", "", "position", "data", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$DataObject;", "plugin-story_release"})
  public final class b extends c.c.a
  {
    private final TextView gKl;
    private int shO;

    public b(int localObject)
    {
      super(localObject);
      AppMethodBeat.i(110271);
      int i;
      this.shO = i;
      this$1 = localObject.findViewById(2131821051);
      j.o(c.c.this, "itemView.findViewById(R.id.tip_tv)");
      this.gKl = ((TextView)c.c.this);
      localObject.setOnClickListener((View.OnClickListener)c.c.b.1.shP);
      AppMethodBeat.o(110271);
    }

    public final void a(c.b paramb)
    {
      AppMethodBeat.i(110270);
      j.p(paramb, "data");
      this.gKl.setText(this.shO);
      AppMethodBeat.o(110270);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.c.c
 * JD-Core Version:    0.6.2
 */