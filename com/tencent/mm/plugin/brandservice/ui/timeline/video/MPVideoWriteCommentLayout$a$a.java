package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.neattextview.textview.view.NeatTextView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter$BizCommentContent;", "", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout$BizVideoMyCommentItemAdapter;Landroid/view/View;)V", "deleteTv", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getDeleteTv", "()Landroid/widget/TextView;", "setDeleteTv", "(Landroid/widget/TextView;)V", "desc", "Lcom/tencent/neattextview/textview/view/NeatTextView;", "getDesc", "()Lcom/tencent/neattextview/textview/view/NeatTextView;", "setDesc", "(Lcom/tencent/neattextview/textview/view/NeatTextView;)V", "likeTv", "getLikeTv", "setLikeTv", "nickName", "getNickName", "setNickName", "plugin-brandservice_release"})
public final class MPVideoWriteCommentLayout$a$a
{
  TextView jWY;
  TextView jWZ;
  NeatTextView jXa;
  TextView jXb;

  public MPVideoWriteCommentLayout$a$a(View paramView)
  {
    AppMethodBeat.i(15281);
    this.jWY = ((TextView)localObject.findViewById(2131826152));
    this.jWZ = ((TextView)localObject.findViewById(2131826154));
    this.jXa = ((NeatTextView)localObject.findViewById(2131826155));
    this.jXb = ((TextView)localObject.findViewById(2131826156));
    this.jWY.setTextColor(MPVideoWriteCommentLayout.a.a(paramView).getResources().getColor(2131690157));
    this.jXa.setTextColor(MPVideoWriteCommentLayout.a.a(paramView).getResources().getColor(2131689760));
    this.jXb.setTextColor(MPVideoWriteCommentLayout.a.a(paramView).getResources().getColor(2131690762));
    AppMethodBeat.o(15281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWriteCommentLayout.a.a
 * JD-Core Version:    0.6.2
 */