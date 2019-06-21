package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.ArrayList;
import java.util.List;

public class GameDetailAutoScrollView extends LinearLayout
{
  private int lfO;
  private ap neF;
  private ArrayList<String> nga;
  private ViewGroup ngb;
  private TextView ngc;
  private TextView ngd;
  private ViewGroup nge;
  private TextView ngf;
  private TextView ngg;
  private Animation ngh;
  private Animation ngi;

  public GameDetailAutoScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(111807);
    this.nga = new ArrayList();
    this.lfO = 0;
    this.neF = new ap(new GameDetailAutoScrollView.1(this), true);
    this.ngb = ((ViewGroup)LayoutInflater.from(paramContext).inflate(2130969689, this, false));
    this.ngc = ((TextView)this.ngb.findViewById(2131824443));
    this.ngd = ((TextView)this.ngb.findViewById(2131824444));
    addView(this.ngb);
    this.ngb.setVisibility(8);
    this.nge = ((ViewGroup)LayoutInflater.from(paramContext).inflate(2130969689, this, false));
    this.ngf = ((TextView)this.nge.findViewById(2131824443));
    this.ngg = ((TextView)this.nge.findViewById(2131824444));
    addView(this.nge);
    this.nge.setVisibility(8);
    this.ngh = AnimationUtils.loadAnimation(paramContext, 2131034260);
    this.ngi = AnimationUtils.loadAnimation(paramContext, 2131034268);
    AppMethodBeat.o(111807);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(111809);
    super.onDetachedFromWindow();
    this.neF.stopTimer();
    AppMethodBeat.o(111809);
  }

  public void setText(List<String> paramList)
  {
    AppMethodBeat.i(111808);
    this.nga.clear();
    this.neF.stopTimer();
    if ((paramList == null) || (paramList.size() == 0) || (paramList.size() % 2 != 0))
    {
      this.ngb.setVisibility(8);
      this.nge.setVisibility(8);
      AppMethodBeat.o(111808);
    }
    while (true)
    {
      return;
      this.nga.addAll(paramList);
      this.lfO = 0;
      paramList = j.b(getContext(), (CharSequence)this.nga.get(0), this.ngc.getTextSize());
      this.ngc.setText(paramList);
      this.ngd.setText((CharSequence)this.nga.get(1));
      this.ngb.setVisibility(0);
      this.nge.setVisibility(8);
      if (this.nga.size() / 2 == 1)
      {
        AppMethodBeat.o(111808);
      }
      else
      {
        this.neF.ae(5000L, 5000L);
        AppMethodBeat.o(111808);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView
 * JD-Core Version:    0.6.2
 */