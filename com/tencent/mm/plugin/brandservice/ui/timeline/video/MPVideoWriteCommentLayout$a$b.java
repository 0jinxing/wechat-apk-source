package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter$BizCommentViewHolder;", "", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter;Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getAvatar", "()Landroid/widget/ImageView;", "content", "Landroid/widget/LinearLayout;", "getContent", "()Landroid/widget/LinearLayout;", "endlineLayout", "getEndlineLayout", "setEndlineLayout", "(Landroid/widget/LinearLayout;)V", "fansContent", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter$BizCommentContent;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter;", "getFansContent", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter$BizCommentContent;", "setFansContent", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter$BizCommentContent;)V", "fansLayout", "getFansLayout", "setFansLayout", "update", "", "position", "", "info", "Lcom/tencent/mm/protocal/protobuf/BizComment;", "plugin-brandservice_release"})
public final class MPVideoWriteCommentLayout$a$b
{
  final ImageView gvq;
  private final LinearLayout jXf;
  private LinearLayout jXg;
  LinearLayout jXi;
  MPVideoWriteCommentLayout.a.a jYl;

  public MPVideoWriteCommentLayout$a$b(View paramView)
  {
    AppMethodBeat.i(15282);
    this.gvq = ((ImageView)((View)localObject).findViewById(2131826157));
    this.jXf = ((LinearLayout)((View)localObject).findViewById(2131826158));
    this.jXg = ((LinearLayout)((View)localObject).findViewById(2131826159));
    this.jXi = ((LinearLayout)((View)localObject).findViewById(2131826161));
    Object localObject = this.jXg;
    j.o(localObject, "fansLayout");
    this.jYl = new MPVideoWriteCommentLayout.a.a(paramView, (View)localObject);
    AppMethodBeat.o(15282);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.a.b
 * JD-Core Version:    0.6.2
 */