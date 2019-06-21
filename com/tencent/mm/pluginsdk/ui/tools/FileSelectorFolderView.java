package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class FileSelectorFolderView extends LinearLayout
  implements AdapterView.OnItemClickListener
{
  boolean aej;
  private FrameLayout mQA;
  private View mQB;
  private ListView mQC;
  private boolean mQE;
  private FileSelectorFolderView.a vui;
  private FileSelectorFolderView.b vuj;

  public FileSelectorFolderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(28164);
    this.vui = null;
    this.aej = false;
    this.mQE = false;
    init();
    AppMethodBeat.o(28164);
  }

  public FileSelectorFolderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(28165);
    this.vui = null;
    this.aej = false;
    this.mQE = false;
    init();
    AppMethodBeat.o(28165);
  }

  private void init()
  {
    AppMethodBeat.i(28167);
    setOrientation(1);
    this.mQA = new FrameLayout(getContext());
    Object localObject = new LinearLayout.LayoutParams(-1, -1);
    this.mQA.setVisibility(8);
    addView(this.mQA, (ViewGroup.LayoutParams)localObject);
    this.mQB = new View(getContext());
    this.mQB.setBackgroundColor(-872415232);
    this.mQB.setOnClickListener(new FileSelectorFolderView.3(this));
    localObject = new FrameLayout.LayoutParams(-1, -1);
    this.mQA.addView(this.mQB, (ViewGroup.LayoutParams)localObject);
    this.mQC = new ListView(getContext());
    this.mQC.setCacheColorHint(0);
    this.mQC.setBackgroundResource(2131690304);
    this.mQC.setSelector(2130839563);
    this.mQC.setOnItemClickListener(this);
    int i = getResources().getDimensionPixelSize(2131427812);
    this.mQC.setPadding(i, i / 3, i, 0);
    localObject = new FrameLayout.LayoutParams(-1, -2);
    ((FrameLayout.LayoutParams)localObject).topMargin = getResources().getDimensionPixelSize(2131427563);
    ((FrameLayout.LayoutParams)localObject).gravity = 80;
    this.mQA.addView(this.mQC, (ViewGroup.LayoutParams)localObject);
    this.vuj = new FileSelectorFolderView.b(getContext());
    this.mQC.setAdapter(this.vuj);
    AppMethodBeat.o(28167);
  }

  final void hE(boolean paramBoolean)
  {
    AppMethodBeat.i(28166);
    if (this.aej == paramBoolean)
    {
      ab.d("MicroMsg.FileSelectorFolderView", "want to expand, but same status, expanded %B", new Object[] { Boolean.valueOf(this.aej) });
      AppMethodBeat.o(28166);
    }
    while (true)
    {
      return;
      if (this.mQE)
      {
        ab.d("MicroMsg.FileSelectorFolderView", "want to expand[%B], but now in animation", new Object[] { Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(28166);
      }
      else
      {
        Animation localAnimation;
        if (this.aej)
        {
          this.mQE = true;
          localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034227);
          localAnimation.setAnimationListener(new FileSelectorFolderView.1(this));
          this.mQC.startAnimation(localAnimation);
          localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034181);
          this.mQB.startAnimation(localAnimation);
          AppMethodBeat.o(28166);
        }
        else
        {
          this.mQE = true;
          this.mQA.setVisibility(0);
          localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034180);
          this.mQB.startAnimation(localAnimation);
          localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034229);
          localAnimation.setAnimationListener(new FileSelectorFolderView.2(this));
          this.mQC.startAnimation(localAnimation);
          AppMethodBeat.o(28166);
        }
      }
    }
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(28168);
    if (this.vui != null)
      this.vui.Ls(paramInt);
    this.mQB.performClick();
    AppMethodBeat.o(28168);
  }

  public void setListener(FileSelectorFolderView.a parama)
  {
    this.vui = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView
 * JD-Core Version:    0.6.2
 */