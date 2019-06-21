package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoErrorView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "errIv", "Landroid/widget/ImageView;", "errTv", "Landroid/widget/TextView;", "root", "Landroid/view/View;", "init", "", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "aniHelper", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/MPVideoImageAnimationHelper;", "setCigError", "errMsg", "errCode", "", "setPlayError", "plugin-brandservice_release"})
public final class MPVideoErrorView extends RelativeLayout
{
  private final String TAG;
  View jWH;
  TextView jXp;
  ImageView jXq;

  public MPVideoErrorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(15250);
    this.TAG = "MicroMsg.MPVideoErrorView";
    View.inflate(paramContext, 2130970254, (ViewGroup)this);
    paramContext = findViewById(2131826174);
    j.o(paramContext, "findViewById(R.id.biz_video_play_err_info_tv)");
    this.jXp = ((TextView)paramContext);
    paramContext = findViewById(2131826173);
    j.o(paramContext, "findViewById(R.id.biz_video_play_err_info_iv)");
    this.jXq = ((ImageView)paramContext);
    paramContext = findViewById(2131820987);
    j.o(paramContext, "findViewById(R.id.root)");
    this.jWH = paramContext;
    AppMethodBeat.o(15250);
  }

  public final void setCigError$505cff1c(String paramString)
  {
    AppMethodBeat.i(138519);
    this.jXq.setBackgroundResource(2130837961);
    if (!bo.isNullOrNil(paramString))
      this.jXp.setText((CharSequence)(getContext().getString(2131305924) + ' ' + paramString));
    while (true)
    {
      this.jWH.setClickable(true);
      AppMethodBeat.o(138519);
      return;
      this.jXp.setText((CharSequence)getContext().getString(2131305924));
    }
  }

  public final void setPlayError$505cff1c(String paramString)
  {
    AppMethodBeat.i(15248);
    this.jXq.setBackgroundResource(2130837955);
    this.jXp.setText((CharSequence)paramString);
    this.jWH.setClickable(false);
    AppMethodBeat.o(15248);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoErrorView
 * JD-Core Version:    0.6.2
 */