package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/MPVideoImageAnimationHelper;", "", "()V", "TAG", "", "animationEnd", "", "getAnimationEnd", "()Z", "setAnimationEnd", "(Z)V", "animationView", "Landroid/view/View;", "appMsgGetDone", "getAppMsgGetDone", "setAppMsgGetDone", "bg", "duration", "", "enable", "getEnable", "setEnable", "imagePreviewAnimation", "Lcom/tencent/mm/ui/tools/ImagePreviewAnimation;", "isAnimated", "mHeight", "mLeft", "mTop", "mWidth", "handleAnimation", "", "savedInstanceState", "Landroid/os/Bundle;", "callBack", "Lcom/tencent/mm/ui/tools/ImagePreviewAnimation$ICallback;", "hideAnimationView", "init", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "view", "showAnimationView", "plugin-brandservice_release"})
public final class f
{
  public final String TAG = "MicroMsg.MPVideoImageAnimationHelper";
  int duration = 300;
  public boolean enable = true;
  public boolean jYD;
  public e jYE;
  public View jYF;
  public View jYG;
  public boolean jYH;
  public boolean jYI;
  public int mHeight;
  public int mWidth;
  public int xJ;
  public int xL;

  public final void a(Intent paramIntent, Context paramContext, View paramView1, View paramView2)
  {
    AppMethodBeat.i(15333);
    j.p(paramIntent, "intent");
    j.p(paramContext, "context");
    j.p(paramView1, "view");
    this.jYE = new e(paramContext);
    this.jYF = paramView1;
    this.jYG = paramView2;
    this.xL = paramIntent.getIntExtra("img_gallery_top", 0);
    this.xJ = paramIntent.getIntExtra("img_gallery_left", 0);
    this.mWidth = paramIntent.getIntExtra("img_gallery_width", 0);
    this.mHeight = paramIntent.getIntExtra("img_gallery_height", 0);
    AppMethodBeat.o(15333);
  }

  public final void aYP()
  {
    AppMethodBeat.i(15334);
    if (((this.jYI) && (this.jYH)) || (!this.enable))
    {
      View localView = this.jYF;
      if (localView == null)
        j.avw("animationView");
      localView.setVisibility(8);
    }
    AppMethodBeat.o(15334);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f
 * JD-Core Version:    0.6.2
 */