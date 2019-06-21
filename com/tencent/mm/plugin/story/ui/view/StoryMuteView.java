package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.story.api.AbsStoryMuteView;
import com.tencent.mm.ui.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/StoryMuteView;", "Lcom/tencent/mm/plugin/story/api/AbsStoryMuteView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MUTE_IN_BG_PADDING", "MUTE_OUT_BG_PADDING", "mMuteBg", "Landroid/widget/ImageView;", "mMuteTv", "Landroid/widget/TextView;", "muteDrawable", "Landroid/graphics/drawable/Drawable;", "initViews", "", "measureDimension", "defaultSize", "parentMeasureSpec", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "triggerMuteIn", "triggerMuteOut", "plugin-story_release"})
public final class StoryMuteView extends AbsStoryMuteView
{
  private final int sjU;
  private final int sjV;
  private Drawable sjW;
  private TextView sjX;
  private ImageView sjY;

  public StoryMuteView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(110446);
    this.sjU = 30;
    cCp();
    AppMethodBeat.o(110446);
  }

  public StoryMuteView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(110447);
    this.sjU = 30;
    cCp();
    AppMethodBeat.o(110447);
  }

  public StoryMuteView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110448);
    this.sjU = 30;
    cCp();
    AppMethodBeat.o(110448);
  }

  private final void cCp()
  {
    AppMethodBeat.i(110441);
    LayoutInflater.from(getContext()).inflate(2130970897, (ViewGroup)this);
    this.sjX = ((TextView)findViewById(2131828177));
    this.sjY = ((ImageView)findViewById(2131828176));
    Object localObject = getContext();
    j.o(localObject, "context");
    this.sjW = ah.e(((Context)localObject).getResources().getDrawable(2131231494), -1);
    localObject = this.sjW;
    if (localObject == null)
      j.dWJ();
    ((Drawable)localObject).setBounds(0, 0, a.fromDPToPix(getContext(), 48), a.fromDPToPix(getContext(), 48));
    localObject = this.sjX;
    if (localObject != null)
      ((TextView)localObject).setCompoundDrawables(null, this.sjW, null, null);
    localObject = this.sjX;
    if (localObject != null)
    {
      Context localContext = getContext();
      j.o(localContext, "context");
      ((TextView)localObject).setText((CharSequence)localContext.getResources().getString(2131303946));
    }
    localObject = this.sjY;
    if (localObject != null)
    {
      ((ImageView)localObject).setPadding(this.sjV, this.sjU, this.sjU, this.sjV);
      AppMethodBeat.o(110441);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110441);
    }
  }

  private static int fO(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110442);
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    if (i == 1073741824)
      paramInt2 = j;
    while (true)
    {
      AppMethodBeat.o(110442);
      return paramInt2;
      paramInt2 = paramInt1;
      if (i == -2147483648)
        paramInt2 = Math.min(paramInt1, j);
    }
  }

  public final void cwM()
  {
    AppMethodBeat.i(110444);
    ImageView localImageView = this.sjY;
    if (localImageView != null)
    {
      localImageView.setPadding(this.sjV, this.sjV, this.sjV, this.sjV);
      AppMethodBeat.o(110444);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110444);
    }
  }

  public final void cwN()
  {
    AppMethodBeat.i(110445);
    ImageView localImageView = this.sjY;
    if (localImageView != null)
    {
      localImageView.setPadding(this.sjV, this.sjU, this.sjU, this.sjV);
      AppMethodBeat.o(110445);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110445);
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110443);
    int i = fO(a.am(getContext(), 2131428602), paramInt1);
    int j = fO(a.am(getContext(), 2131428602), paramInt2);
    super.onMeasure(paramInt1, paramInt2);
    setMeasuredDimension(i, j);
    AppMethodBeat.o(110443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryMuteView
 * JD-Core Version:    0.6.2
 */