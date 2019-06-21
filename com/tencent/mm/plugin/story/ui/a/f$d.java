package com.tencent.mm.plugin.story.ui.a;

import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$StoryCommentViewHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter;Landroid/view/View;)V", "opTv", "Landroid/widget/TextView;", "getOpTv", "()Landroid/widget/TextView;", "findMaskView", "onBind", "", "position", "", "comment", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "onBindOpTv", "plugin-story_release"})
public final class f$d extends f.a
{
  private final TextView rhT;

  public f$d(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(110124);
    paramView = localObject.findViewById(2131828071);
    a.f.b.j.o(paramView, "itemView.findViewById(R.…story_comment_item_op_tv)");
    this.rhT = ((TextView)paramView);
    AppMethodBeat.o(110124);
  }

  public final void a(int paramInt, com.tencent.mm.plugin.story.model.b.a parama)
  {
    AppMethodBeat.i(138859);
    a.f.b.j.p(parama, "comment");
    super.a(paramInt, parama);
    if (parama.rVi)
      b.f(this.seQ);
    Object localObject1;
    Object localObject2;
    if (!parama.rVi)
    {
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      boolean bool = bo.isEqual(j.a.cnk(), parama.cEV);
      this.rhT.setVisibility(0);
      if (bool)
      {
        this.rhT.setOnClickListener((View.OnClickListener)new f.d.b(this, parama));
        localObject1 = this.rhT;
        localObject2 = this.apJ;
        a.f.b.j.o(localObject2, "itemView");
        localObject2 = ((View)localObject2).getContext();
        a.f.b.j.o(localObject2, "itemView.context");
        ((TextView)localObject1).setText((CharSequence)((Context)localObject2).getResources().getString(2131305999));
        this.rhT.setTextColor(-1);
        b.f(this.rhT);
      }
    }
    while (true)
    {
      this.apJ.setOnClickListener((View.OnClickListener)new f.d.a(this, parama));
      AppMethodBeat.o(138859);
      return;
      if (com.tencent.mm.plugin.story.c.a.a.rQZ.cxi())
      {
        localObject1 = this.sfM.sfH;
        if ((localObject1 == null) || (((com.tencent.mm.plugin.story.h.j)localObject1).cBW() != true))
        {
          localObject1 = this.sfM.sfH;
          if ((localObject1 == null) || (((com.tencent.mm.plugin.story.h.j)localObject1).cBX()));
        }
        else
        {
          this.rhT.setOnClickListener((View.OnClickListener)new f.d.c(this, parama));
          localObject1 = this.rhT;
          localObject2 = this.apJ;
          a.f.b.j.o(localObject2, "itemView");
          localObject2 = ((View)localObject2).getContext();
          a.f.b.j.o(localObject2, "itemView.context");
          ((TextView)localObject1).setText((CharSequence)((Context)localObject2).getResources().getString(2131306000));
          this.rhT.setTextColor(-1);
          b.f(this.rhT);
        }
      }
      else
      {
        this.rhT.setVisibility(8);
      }
    }
  }

  public final View cCh()
  {
    AppMethodBeat.i(138858);
    View localView = this.apJ.findViewById(2131828066);
    a.f.b.j.o(localView, "itemView.findViewById(R.…mment_content_background)");
    AppMethodBeat.o(138858);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.f.d
 * JD-Core Version:    0.6.2
 */