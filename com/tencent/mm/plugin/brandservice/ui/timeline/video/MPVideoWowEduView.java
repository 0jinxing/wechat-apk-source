package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWowEduView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "root", "Landroid/view/View;", "setPosition", "", "position", "", "plugin-brandservice_release"})
public final class MPVideoWowEduView extends RelativeLayout
{
  private View jWH;

  public MPVideoWowEduView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(15274);
    View.inflate(paramContext, 2130970257, (ViewGroup)this);
    paramContext = findViewById(2131826193);
    j.o(paramContext, "findViewById(R.id.mp_video_wow_edu_root_layout)");
    this.jWH = paramContext;
    ((Button)findViewById(2131826194)).setOnClickListener((View.OnClickListener)new MPVideoWowEduView.1(this));
    AppMethodBeat.o(15274);
  }

  public final void setPosition(float paramFloat)
  {
    AppMethodBeat.i(15273);
    Object localObject = this.jWH.getParent();
    j.o(localObject, "root.parent");
    localObject = ((ViewParent)localObject).getParent();
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type android.view.ViewGroup");
      AppMethodBeat.o(15273);
      throw ((Throwable)localObject);
    }
    ((ViewGroup)localObject).setVisibility(0);
    this.jWH.setVisibility(0);
    localObject = getContext();
    j.o(localObject, "context");
    int i = ((Context)localObject).getResources().getDimensionPixelSize(2131427796);
    this.jWH.setPadding(0, (int)(paramFloat - i), 0, 0);
    postInvalidate();
    AppMethodBeat.o(15273);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWowEduView
 * JD-Core Version:    0.6.2
 */