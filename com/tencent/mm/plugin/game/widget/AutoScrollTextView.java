package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.ArrayList;
import java.util.List;

public class AutoScrollTextView extends LinearLayout
{
  private int lfO;
  private ap neF;
  private ArrayList<String> nga;
  private Animation ngh;
  private Animation ngi;
  private TextView nnU;
  private TextView nnV;

  public AutoScrollTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112366);
    this.nga = new ArrayList();
    this.lfO = 0;
    this.neF = new ap(new AutoScrollTextView.1(this), true);
    this.nnU = new TextView(paramContext, paramAttributeSet);
    this.nnU.setVisibility(8);
    this.nnV = new TextView(paramContext, paramAttributeSet);
    this.nnV.setVisibility(8);
    addView(this.nnU);
    addView(this.nnV);
    setOrientation(1);
    setGravity(17);
    setPadding(0, 0, 0, 0);
    this.ngh = AnimationUtils.loadAnimation(paramContext, 2131034260);
    this.ngi = AnimationUtils.loadAnimation(paramContext, 2131034268);
    AppMethodBeat.o(112366);
  }

  private void b(TextView paramTextView, String paramString)
  {
    AppMethodBeat.i(112368);
    paramTextView.setText(new SpannableString(j.b(getContext(), paramString, paramTextView.getTextSize())));
    AppMethodBeat.o(112368);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(112369);
    super.onDetachedFromWindow();
    this.neF.stopTimer();
    AppMethodBeat.o(112369);
  }

  public void setText(List<String> paramList)
  {
    AppMethodBeat.i(112367);
    this.nga.clear();
    this.neF.stopTimer();
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.nnU.setVisibility(8);
      this.nnV.setVisibility(8);
      AppMethodBeat.o(112367);
    }
    while (true)
    {
      return;
      this.nga.addAll(paramList);
      b(this.nnU, (String)this.nga.get(0));
      this.nnU.setVisibility(0);
      this.lfO = 0;
      if (this.nga.size() == 1)
      {
        AppMethodBeat.o(112367);
      }
      else
      {
        this.neF.ae(5000L, 5000L);
        AppMethodBeat.o(112367);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.widget.AutoScrollTextView
 * JD-Core Version:    0.6.2
 */