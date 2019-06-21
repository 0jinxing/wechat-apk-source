package com.tencent.mm.plugin.story.ui.view;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import java.util.Random;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allColorDrawable", "Landroid/graphics/drawable/Drawable;", "blackView", "Landroid/widget/ImageView;", "insetSize", "onColorSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "color", "", "getOnColorSelected", "()Lkotlin/jvm/functions/Function1;", "setOnColorSelected", "(Lkotlin/jvm/functions/Function1;)V", "randomRoot", "randomText", "Landroid/widget/TextView;", "randomView", "selectedColor", "getSelectedColor", "()I", "setSelectedColor", "(I)V", "strokeWidth", "whiteView", "createAllColorDrawable", "Landroid/graphics/drawable/GradientDrawable;", "createDrawable", "insetDrawable", "Landroid/graphics/drawable/InsetDrawable;", "origin", "notifyView", "randowmColor", "plugin-story_release"})
public final class StoryCommentColorSelector extends LinearLayout
{
  private int lnx;
  private final int siV;
  private final Drawable siW;
  private final ImageView siX;
  private final ImageView siY;
  private final ImageView siZ;
  private final LinearLayout sja;
  private final TextView sjb;
  private b<? super Integer, y> sjc;
  private final int strokeWidth;

  public StoryCommentColorSelector(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110386);
    AppMethodBeat.o(110386);
  }

  public StoryCommentColorSelector(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110385);
    this.lnx = -1;
    View.inflate(paramContext, 2130970865, (ViewGroup)this);
    setOrientation(0);
    paramAttributeSet = findViewById(2131828050);
    j.o(paramAttributeSet, "findViewById(R.id.story_…ent_color_selector_white)");
    this.siX = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828051);
    j.o(paramAttributeSet, "findViewById(R.id.story_…ent_color_selector_black)");
    this.siY = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828053);
    j.o(paramAttributeSet, "findViewById(R.id.story_…lor_selector_random_icon)");
    this.siZ = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828052);
    j.o(paramAttributeSet, "findViewById(R.id.story_…nt_color_selector_random)");
    this.sja = ((LinearLayout)paramAttributeSet);
    paramAttributeSet = findViewById(2131828054);
    j.o(paramAttributeSet, "findViewById(R.id.story_…lor_selector_random_text)");
    this.sjb = ((TextView)paramAttributeSet);
    this.siX.setOnClickListener((View.OnClickListener)new StoryCommentColorSelector.1(this));
    this.siY.setOnClickListener((View.OnClickListener)new StoryCommentColorSelector.2(this));
    this.sja.setOnClickListener((View.OnClickListener)new StoryCommentColorSelector.3(this));
    this.strokeWidth = a.fromDPToPix(paramContext, 2);
    this.siV = a.fromDPToPix(paramContext, 4);
    paramContext = new GradientDrawable();
    paramContext.setColors(new int[] { -372399, -352965, -15616, -7220480, -16268960, -15683841, -15432210, -10197008, -372399 });
    paramContext.setGradientType(2);
    paramContext.setStroke(this.strokeWidth, -1);
    paramContext.setShape(1);
    paramContext = (Drawable)paramContext;
    j.p(paramContext, "origin");
    this.siW = ((Drawable)new InsetDrawable(paramContext, this.siV));
    cCm();
    AppMethodBeat.o(110385);
  }

  private final void cCm()
  {
    AppMethodBeat.i(110383);
    switch (this.lnx)
    {
    default:
      this.siX.setSelected(false);
      this.siY.setSelected(false);
      Object localObject = this.siZ;
      int i = this.lnx;
      GradientDrawable localGradientDrawable = new GradientDrawable();
      localGradientDrawable.setColor(i);
      localGradientDrawable.setStroke(this.strokeWidth, -1);
      localGradientDrawable.setShape(1);
      ((ImageView)localObject).setImageDrawable((Drawable)localGradientDrawable);
      this.sjb.setVisibility(0);
      localObject = this.sjc;
      if (localObject != null)
      {
        ((b)localObject).am(Integer.valueOf(this.lnx));
        AppMethodBeat.o(110383);
      }
      break;
    case -1:
    case -16777216:
    }
    while (true)
    {
      return;
      this.siX.setSelected(true);
      this.siY.setSelected(false);
      this.siZ.setImageDrawable(this.siW);
      this.sjb.setVisibility(8);
      break;
      this.siX.setSelected(false);
      this.siY.setSelected(true);
      this.siZ.setImageDrawable(this.siW);
      this.sjb.setVisibility(8);
      break;
      AppMethodBeat.o(110383);
    }
  }

  public static int cCn()
  {
    AppMethodBeat.i(110384);
    Object localObject = new Random();
    StoryCommentView.a locala = StoryCommentView.sjO;
    int i = ((Random)localObject).nextInt(StoryCommentView.cCo().length);
    localObject = StoryCommentView.sjO;
    i = StoryCommentView.cCo()[i];
    AppMethodBeat.o(110384);
    return i;
  }

  public final b<Integer, y> getOnColorSelected()
  {
    return this.sjc;
  }

  public final int getSelectedColor()
  {
    return this.lnx;
  }

  public final void setOnColorSelected(b<? super Integer, y> paramb)
  {
    this.sjc = paramb;
  }

  public final void setSelectedColor(int paramInt)
  {
    this.lnx = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector
 * JD-Core Version:    0.6.2
 */