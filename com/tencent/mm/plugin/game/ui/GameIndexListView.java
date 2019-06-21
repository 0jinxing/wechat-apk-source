package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.plugin.game.d.bb;
import com.tencent.mm.plugin.game.d.bc;
import com.tencent.mm.sdk.platformtools.ab;

public class GameIndexListView extends LoadMoreRecyclerView
{
  private static boolean nfC = true;
  private static boolean nfG;
  private static int nfI = 0;
  private static int nja = 0;
  private static int njj = 0;
  private View abB;
  private Context mContext;
  private Scroller mScroller;
  private float nfD;
  private int nfE;
  private boolean nfH;
  private ImageView nfJ;
  private ImageView nfK;
  GameIndexListView.b njg;
  private bc njh;
  private boolean nji = true;

  public GameIndexListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  private void bFn()
  {
    AppMethodBeat.i(111981);
    Object localObject1 = new b.a();
    Object localObject2 = new bb();
    if (this.njh != null)
    {
      localObject3 = this.njh.nbV;
      ((bb)localObject2).nbT = ((com.tencent.mm.bt.b)localObject3);
      ((b.a)localObject1).fsJ = ((a)localObject2);
      ((b.a)localObject1).fsK = new bc();
      ((b.a)localObject1).uri = "/cgi-bin/mmgame-bin/getgameindex4feedslist";
      ((b.a)localObject1).fsI = 2943;
      ((b.a)localObject1).fsL = 0;
      ((b.a)localObject1).fsM = 0;
      localObject1 = ((b.a)localObject1).acD();
      localObject2 = new GameIndexListView.2(this);
      if (!(this.mContext instanceof com.tencent.mm.vending.e.b))
        break label131;
    }
    label131: for (Object localObject3 = (com.tencent.mm.vending.e.b)this.mContext; ; localObject3 = null)
    {
      w.a((com.tencent.mm.ai.b)localObject1, (w.a)localObject2, false, (com.tencent.mm.vending.e.b)localObject3);
      AppMethodBeat.o(111981);
      return;
      localObject3 = null;
      break;
    }
  }

  public static int getSourceScene()
  {
    return nja;
  }

  public static void setCanPulldown(boolean paramBoolean)
  {
    nfG = paramBoolean;
  }

  public static void setDefaultPadding(int paramInt)
  {
    nfI = paramInt;
  }

  public static void setInitPadding(int paramInt)
  {
    njj = paramInt;
    nfC = true;
  }

  public static void setSourceScene(int paramInt)
  {
    nja = paramInt;
  }

  public void computeScroll()
  {
    AppMethodBeat.i(111984);
    if (this.abB == null)
      AppMethodBeat.o(111984);
    while (true)
    {
      return;
      if (this.mScroller.computeScrollOffset())
      {
        int i = this.mScroller.getCurrY();
        ab.d("MicroMsg.GameIndexListView", "computeScroll, currY = ".concat(String.valueOf(i)));
        this.abB.setPadding(0, i, 0, 0);
        float f = (nfI - i) / nfI * 255.0F;
        int j = (int)f;
        i = (int)f;
        this.nfK.setAlpha(255 - j);
        this.nfJ.setAlpha(i);
        invalidate();
      }
      AppMethodBeat.o(111984);
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(111983);
    boolean bool;
    if ((!nfG) || (this.abB == null))
    {
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(111983);
    }
    while (true)
    {
      return bool;
      switch (paramMotionEvent.getAction())
      {
      case 1:
      default:
      case 0:
      case 2:
      }
      int i;
      label146: label148: 
      do
      {
        do
        {
          while (true)
          {
            bool = super.dispatchTouchEvent(paramMotionEvent);
            AppMethodBeat.o(111983);
            break;
            this.nfH = false;
            this.nfD = paramMotionEvent.getRawY();
            continue;
            if ((((LinearLayoutManager)getLayoutManager()).iQ() == 0) && (this.abB != null) && (this.abB.getTop() == 0));
            for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label146;
              if (!this.nfH)
                break label148;
              AppMethodBeat.o(111983);
              bool = true;
              break;
            }
          }
          i = (int)(paramMotionEvent.getRawY() - this.nfD);
          if (this.abB.getPaddingTop() > nfI + this.nfE)
            break label257;
        }
        while ((i <= 0) || (Math.abs(i) < this.nfE));
        this.nfH = true;
        this.mScroller.startScroll(0, this.abB.getPaddingTop(), 0, -this.abB.getPaddingTop(), 500);
        this.nfJ.setClickable(true);
        invalidate();
        paramMotionEvent.setAction(3);
        super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(111983);
        bool = true;
        break;
      }
      while ((this.abB.getPaddingTop() < -this.nfE) || (i >= 0) || (Math.abs(i) < this.nfE));
      label257: this.nfH = true;
      this.mScroller.startScroll(0, 0, 0, nfI, 500);
      invalidate();
      paramMotionEvent.setAction(3);
      super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(111983);
      bool = true;
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111980);
    super.onFinishInflate();
    ab.d("MicroMsg.GameIndexListView", "onFinishInflate");
    this.nfE = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
    this.mScroller = new Scroller(this.mContext);
    getContext();
    setLayoutManager(new LinearLayoutManager());
    this.njg = new GameIndexListView.b(this);
    setAdapter(this.njg);
    b(new GameIndexListView.a(this, getResources()));
    setLoadingView(2130969708);
    setOnLoadingStateChangedListener(new GameIndexListView.1(this));
    fh(true);
    bFn();
    AppMethodBeat.o(111980);
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(111982);
    ab.d("MicroMsg.GameIndexListView", "onLayout, changed = ".concat(String.valueOf(paramBoolean)));
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((nfC) || (this.abB == null) || (this.nfK == null) || (this.nfJ == null))
    {
      this.abB = getChildAt(0);
      if (this.abB != null)
      {
        this.abB.setPadding(0, njj, 0, 0);
        this.nfK = ((ImageView)this.abB.findViewById(2131824535));
        this.nfJ = ((ImageView)this.abB.findViewById(2131824486));
      }
      nfC = false;
    }
    AppMethodBeat.o(111982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameIndexListView
 * JD-Core Version:    0.6.2
 */