package com.tencent.mm.plugin.story.ui.sns;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.model.f.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter$EntranceViewUserHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter$EntranceViewHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$EntranceAdapter;Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "contentTv", "Landroid/widget/TextView;", "getContentTv", "()Landroid/widget/TextView;", "reply", "getReply", "setReply", "(Landroid/widget/TextView;)V", "star", "getStar", "()Landroid/view/View;", "setStar", "(Landroid/view/View;)V", "onBind", "", "position", "", "data", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceView$DataObject;", "plugin-story_release"})
public final class c$c$c extends c.c.a
{
  private final TextView gKl;
  private final ImageView gvq;
  private View shQ;
  private TextView shR;

  public c$c$c(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(110274);
    paramView = localObject.findViewById(2131821183);
    a.f.b.j.o(paramView, "itemView.findViewById(R.id.avatar_iv)");
    this.gvq = ((ImageView)paramView);
    paramView = localObject.findViewById(2131826146);
    a.f.b.j.o(paramView, "itemView.findViewById(R.id.user_name_tv)");
    this.gKl = ((TextView)paramView);
    paramView = localObject.findViewById(2131828143);
    a.f.b.j.o(paramView, "itemView.findViewById(R.id.star)");
    this.shQ = paramView;
    paramView = localObject.findViewById(2131828142);
    a.f.b.j.o(paramView, "itemView.findViewById(R.id.reply_icon)");
    this.shR = ((TextView)paramView);
    localObject.setOnClickListener((View.OnClickListener)new c.c.c.1(this));
    AppMethodBeat.o(110274);
  }

  public final void a(c.b paramb)
  {
    int i = 0;
    AppMethodBeat.i(110273);
    a.f.b.j.p(paramb, "data");
    a.b.r(this.gvq, paramb.userName);
    Object localObject1 = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject1, "MMKernel.service(IMessengerStorage::class.java)");
    ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject1).XM().aoO(paramb.userName);
    if (localad != null)
    {
      localObject2 = localad.Oj();
      localObject1 = localObject2;
      if (localObject2 != null);
    }
    else
    {
      localObject1 = paramb.userName;
    }
    Object localObject2 = com.tencent.mm.pluginsdk.ui.e.j.b(this.gKl.getContext(), (CharSequence)localObject1, this.gKl.getTextSize());
    localObject1 = this.shQ;
    a.f.b.j.o(localad, "contact");
    if (localad.Oc())
    {
      j = 0;
      ((View)localObject1).setVisibility(j);
      this.gKl.setText((CharSequence)localObject2);
      localObject1 = this.shR;
      if (paramb.type != 5)
        break label202;
      this.shR.setText((CharSequence)String.valueOf(a.rWL.aaH(paramb.userName)));
    }
    label202: for (int j = i; ; j = 8)
    {
      ((TextView)localObject1).setVisibility(j);
      AppMethodBeat.o(110273);
      return;
      j = 4;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.c.c.c
 * JD-Core Version:    0.6.2
 */