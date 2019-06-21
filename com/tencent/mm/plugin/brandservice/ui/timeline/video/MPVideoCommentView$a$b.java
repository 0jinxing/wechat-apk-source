package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter$BizCommentViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter;Landroid/view/View;)V", "authorContent", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter$BizCommentContent;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter;", "getAuthorContent", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter$BizCommentContent;", "setAuthorContent", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter$BizCommentContent;)V", "authorLayout", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "getAuthorLayout", "()Landroid/widget/LinearLayout;", "setAuthorLayout", "(Landroid/widget/LinearLayout;)V", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "content", "getContent", "endlineLayout", "getEndlineLayout", "setEndlineLayout", "fansContent", "getFansContent", "setFansContent", "fansLayout", "getFansLayout", "setFansLayout", "update", "", "position", "", "info", "Lcom/tencent/mm/protocal/protobuf/BizComment;", "plugin-brandservice_release"})
public final class MPVideoCommentView$a$b extends RecyclerView.v
{
  final ImageView gvq;
  private final LinearLayout jXf;
  private LinearLayout jXg;
  LinearLayout jXh;
  LinearLayout jXi;
  MPVideoCommentView.a.a jXj;
  MPVideoCommentView.a.a jXk;

  public MPVideoCommentView$a$b(View paramView)
  {
    super((View)localObject);
    AppMethodBeat.i(15228);
    this.gvq = ((ImageView)((View)localObject).findViewById(2131826157));
    this.jXf = ((LinearLayout)((View)localObject).findViewById(2131826158));
    this.jXg = ((LinearLayout)((View)localObject).findViewById(2131826159));
    this.jXh = ((LinearLayout)((View)localObject).findViewById(2131826160));
    this.jXi = ((LinearLayout)((View)localObject).findViewById(2131826161));
    Object localObject = this.jXg;
    j.o(localObject, "fansLayout");
    this.jXj = new MPVideoCommentView.a.a(paramView, (View)localObject);
    localObject = this.jXh;
    j.o(localObject, "authorLayout");
    this.jXk = new MPVideoCommentView.a.a(paramView, (View)localObject);
    AppMethodBeat.o(15228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoCommentView.a.b
 * JD-Core Version:    0.6.2
 */