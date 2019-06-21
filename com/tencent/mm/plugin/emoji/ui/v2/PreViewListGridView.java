package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.emoji.PopEmojiView;
import com.tencent.mm.sdk.platformtools.ak;

public class PreViewListGridView extends ListView
{
  private WindowManager lca;
  private boolean lgk;
  private WindowManager.LayoutParams lgq;
  private int lgr;
  private int lgs;
  private int lgt;
  private boolean lgu;
  private volatile int lgv;
  private String lgw;
  private PopEmojiView lgx;
  private a lgy;
  private ak mHandler;
  private int mOrientation;

  public PreViewListGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(53848);
    this.lgk = true;
    this.mHandler = new ak();
    this.lgv = -1;
    init(paramContext);
    AppMethodBeat.o(53848);
  }

  public PreViewListGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(53849);
    this.lgk = true;
    this.mHandler = new ak();
    this.lgv = -1;
    init(paramContext);
    AppMethodBeat.o(53849);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(53850);
    this.lgx = new PopEmojiView(getContext());
    this.lgr = paramContext.getResources().getDimensionPixelSize(2131428376);
    this.lca = ((WindowManager)paramContext.getSystemService("window"));
    this.lgq = new WindowManager.LayoutParams(-1, -1, 2, 8, 1);
    this.lgq.width = this.lgr;
    this.lgq.height = this.lgr;
    this.lgq.gravity = 17;
    this.mOrientation = getResources().getConfiguration().orientation;
    if (this.mOrientation == 2)
    {
      this.lgs = this.lca.getDefaultDisplay().getHeight();
      this.lgt = this.lca.getDefaultDisplay().getWidth();
      AppMethodBeat.o(53850);
    }
    while (true)
    {
      return;
      this.lgs = this.lca.getDefaultDisplay().getWidth();
      this.lgt = this.lca.getDefaultDisplay().getHeight();
      AppMethodBeat.o(53850);
    }
  }

  public final void bmt()
  {
    AppMethodBeat.i(53853);
    if (this.lgu)
    {
      this.lca.removeView(this.lgx);
      this.lgu = false;
    }
    this.lgw = "";
    AppMethodBeat.o(53853);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(53852);
    boolean bool;
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(53852);
    case 1:
    case 3:
    }
    while (true)
    {
      return bool;
      if (!this.lgu)
        break;
      bmt();
      bool = true;
      AppMethodBeat.o(53852);
    }
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(53851);
    super.setAdapter(paramListAdapter);
    this.lgy = ((a)paramListAdapter);
    AppMethodBeat.o(53851);
  }

  public void setEnablePreView(boolean paramBoolean)
  {
    this.lgk = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.PreViewListGridView
 * JD-Core Version:    0.6.2
 */