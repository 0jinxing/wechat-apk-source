package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "adapter", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView$BizCommentItemAdapter;", "enable", "", "isFans", "isTmpUrl", "()I", "setTmpUrl", "(I)V", "onlyFansCanComment", "", "recyclerView", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView;", "selectedCommentTv", "Landroid/widget/TextView;", "writeCommentLayout", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout;", "writeTv", "onDeleteComment", "", "req", "Lcom/tencent/mm/protocal/protobuf/AppMsgOperateCommentReq;", "openId", "setListView", "header", "Landroid/view/View;", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "setWriteComment", "setWriteCommentLayout", "layout", "updateData", "resp", "Lcom/tencent/mm/protocal/protobuf/AppMsgCommentListResp;", "updateViewStatus", "BizCommentItemAdapter", "plugin-brandservice_release"})
public final class MPVideoCommentView extends RelativeLayout
{
  private final String TAG;
  int erD;
  MRecyclerView jWJ;
  TextView jWK;
  TextView jWL;
  MPVideoCommentView.a jWM;
  private MPVideoWriteCommentLayout jWN;
  int jWO;
  boolean jWP;
  int jWQ;

  public MPVideoCommentView(final Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(15245);
    this.TAG = "MicroMsg.MPVideoView_back";
    this.erD = 1;
    this.jWO = 1;
    View.inflate(paramContext, 2130970253, (ViewGroup)this);
    paramAttributeSet = findViewById(2131826172);
    j.o(paramAttributeSet, "findViewById(R.id.biz_video_write_comment_tv)");
    this.jWK = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131826171);
    j.o(paramAttributeSet, "findViewById(R.id.biz_video_selected_comment_tv)");
    this.jWL = ((TextView)paramAttributeSet);
    this.jWK.setOnClickListener((View.OnClickListener)new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(15226);
        if (this.jWR.jWQ == 1)
        {
          h.a(paramContext, paramContext.getString(2131305926), "", paramContext.getString(2131296994), null);
          AppMethodBeat.o(15226);
        }
        while (true)
        {
          return;
          if (MPVideoCommentView.a(this.jWR) != null)
            MPVideoCommentView.a(this.jWR).fA(false);
          AppMethodBeat.o(15226);
        }
      }
    });
    AppMethodBeat.o(15245);
  }

  public final void setTmpUrl(int paramInt)
  {
    this.jWQ = paramInt;
  }

  public final void setWriteCommentLayout(MPVideoWriteCommentLayout paramMPVideoWriteCommentLayout)
  {
    AppMethodBeat.i(15244);
    j.p(paramMPVideoWriteCommentLayout, "layout");
    this.jWN = paramMPVideoWriteCommentLayout;
    AppMethodBeat.o(15244);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoCommentView
 * JD-Core Version:    0.6.2
 */