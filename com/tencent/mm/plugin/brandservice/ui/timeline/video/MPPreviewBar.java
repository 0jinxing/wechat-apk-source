package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPPreviewBar;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "closeBtn", "Landroid/widget/Button;", "root", "Landroid/view/View;", "plugin-brandservice_release"})
public final class MPPreviewBar extends RelativeLayout
{
  private Button jWG;
  private View jWH;

  public MPPreviewBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(15225);
    View.inflate(paramContext, 2130970250, (ViewGroup)this);
    paramContext = findViewById(2131826163);
    j.o(paramContext, "findViewById(R.id.biz_video_close_btn)");
    this.jWG = ((Button)paramContext);
    paramContext = findViewById(2131826162);
    j.o(paramContext, "findViewById(R.id.biz_video_preview_layout)");
    this.jWH = paramContext;
    this.jWG.setOnClickListener((View.OnClickListener)new MPPreviewBar.1(this));
    AppMethodBeat.o(15225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPPreviewBar
 * JD-Core Version:    0.6.2
 */