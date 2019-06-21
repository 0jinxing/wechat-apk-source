package com.tencent.mm.plugin.story.ui.sns;

import a.l;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter$EntranceViewUserHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter$EntranceViewHolder;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter;", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$EntranceAdapter;Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "contentTv", "Landroid/widget/TextView;", "getContentTv", "()Landroid/widget/TextView;", "onBind", "", "position", "", "data", "Lcom/tencent/mm/plugin/story/ui/sns/StoryEntranceUI$DataObject;", "plugin-story_release"})
public final class StoryEntranceUI$c$c extends StoryEntranceUI.c.a
{
  private final TextView gKl;
  private final ImageView gvq;

  public StoryEntranceUI$c$c(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(110252);
    paramView = localObject.findViewById(2131821183);
    a.f.b.j.o(paramView, "itemView.findViewById(R.id.avatar_iv)");
    this.gvq = ((ImageView)paramView);
    paramView = localObject.findViewById(2131826146);
    a.f.b.j.o(paramView, "itemView.findViewById(R.id.user_name_tv)");
    this.gKl = ((TextView)paramView);
    localObject.setOnClickListener((View.OnClickListener)new StoryEntranceUI.c.c.1(this));
    AppMethodBeat.o(110252);
  }

  public final void a(StoryEntranceUI.b paramb)
  {
    AppMethodBeat.i(110251);
    a.f.b.j.p(paramb, "data");
    a.b.b(this.gvq, paramb.userName);
    Object localObject = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject, "MMKernel.service(IMessengerStorage::class.java)");
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().aoO(paramb.userName);
    if (localObject != null)
    {
      String str = ((ad)localObject).Oj();
      localObject = str;
      if (str != null);
    }
    else
    {
      localObject = paramb.userName;
    }
    localObject = com.tencent.mm.pluginsdk.ui.e.j.b(this.gKl.getContext(), (CharSequence)localObject, this.gKl.getTextSize());
    if (StoryEntranceUI.a(this.shy.shx).contains(paramb.userName))
      this.gKl.setTextColor(this.shy.shx.dxU().getResources().getColor(2131689483));
    while (true)
    {
      this.gKl.setText((CharSequence)localObject);
      AppMethodBeat.o(110251);
      return;
      this.gKl.setTextColor(this.shy.shx.dxU().getResources().getColor(2131689761));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.StoryEntranceUI.c.c
 * JD-Core Version:    0.6.2
 */