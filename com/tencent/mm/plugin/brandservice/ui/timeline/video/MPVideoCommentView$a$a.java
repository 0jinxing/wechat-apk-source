package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.neattextview.textview.view.NeatTextView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter$BizCommentContent;", "", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter;Landroid/view/View;)V", "authorPrefixIv", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getAuthorPrefixIv", "()Landroid/widget/ImageView;", "setAuthorPrefixIv", "(Landroid/widget/ImageView;)V", "deleteTv", "Landroid/widget/TextView;", "getDeleteTv", "()Landroid/widget/TextView;", "setDeleteTv", "(Landroid/widget/TextView;)V", "desc", "Lcom/tencent/neattextview/textview/view/NeatTextView;", "getDesc", "()Lcom/tencent/neattextview/textview/view/NeatTextView;", "setDesc", "(Lcom/tencent/neattextview/textview/view/NeatTextView;)V", "likeTv", "getLikeTv", "setLikeTv", "nickName", "getNickName", "setNickName", "plactTopTv", "getPlactTopTv", "setPlactTopTv", "plugin-brandservice_release"})
public final class MPVideoCommentView$a$a
{
  TextView jWY;
  TextView jWZ;
  NeatTextView jXa;
  TextView jXb;
  TextView jXc;
  ImageView jXd;

  public MPVideoCommentView$a$a(View paramView)
  {
    AppMethodBeat.i(15227);
    this.jWY = ((TextView)localObject.findViewById(2131826152));
    this.jWZ = ((TextView)localObject.findViewById(2131826154));
    this.jXa = ((NeatTextView)localObject.findViewById(2131826155));
    this.jXb = ((TextView)localObject.findViewById(2131826156));
    this.jXc = ((TextView)localObject.findViewById(2131826153));
    this.jXd = ((ImageView)localObject.findViewById(2131826151));
    AppMethodBeat.o(15227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoCommentView.a.a
 * JD-Core Version:    0.6.2
 */