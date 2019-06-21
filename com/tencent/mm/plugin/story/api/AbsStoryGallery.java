package com.tencent.mm.plugin.story.api;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tencent.mm.ui.widget.listview.PullDownListView;

public abstract class AbsStoryGallery extends RelativeLayout
{
  public AbsStoryGallery(Context paramContext)
  {
    super(paramContext);
  }

  public AbsStoryGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AbsStoryGallery(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public abstract void AW(int paramInt);

  public abstract void EF(int paramInt);

  public abstract void EG(int paramInt);

  public abstract void K(boolean paramBoolean1, boolean paramBoolean2);

  public abstract void Pb();

  public abstract void a(PullDownListView paramPullDownListView);

  public abstract void cwK();

  public abstract void cwL();

  public abstract void lr(boolean paramBoolean);

  public abstract void onDestroy();

  public abstract void onPause();

  public abstract void onResume();

  public abstract void onStart();

  public abstract void onStop();

  public abstract void setCurrentHItem(int paramInt);

  public abstract void setCurrentVItem(int paramInt);

  public abstract void setDataSeed(Object paramObject);

  public abstract void setStoryBrowseUIListener(g paramg);

  public abstract boolean wY();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.api.AbsStoryGallery
 * JD-Core Version:    0.6.2
 */