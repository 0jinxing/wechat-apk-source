package com.tencent.mm.plugin.story.api;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.View.OnClickListener;

public abstract interface i
{
  public abstract void a(Canvas paramCanvas, boolean paramBoolean, int paramInt);

  public abstract void aR(View paramView);

  public abstract View.OnClickListener cwV();

  public abstract void dk(String paramString, int paramInt);

  public abstract void setOnClickListener(View.OnClickListener paramOnClickListener);

  public abstract void setOnDoubleClickListener(a parama);

  public abstract void setShowStoryHint(boolean paramBoolean);

  public abstract void setWeakContext(Context paramContext);

  public static abstract interface a
  {
    public abstract boolean ed(View paramView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.api.i
 * JD-Core Version:    0.6.2
 */