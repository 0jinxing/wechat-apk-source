package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecentAppBrandView extends RecyclerView
  implements GestureDetector.OnGestureListener
{
  private RecyclerView.a Yq;
  List<AppBrandDesktopView.c> iJL;
  private int iWJ;
  private b iXE;
  private boolean iYA;
  List<AppBrandDesktopView.c> iYF;
  private ArrayList<RecyclerView.v> iYG;
  private GridLayoutManager iYH;
  private int iYI;
  private f iYJ;
  int iYK;
  boolean iYL;
  private b iYM;
  private boolean iYN;
  private GestureDetector iay;

  public RecentAppBrandView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(133936);
    this.iJL = new ArrayList();
    this.iYF = new ArrayList();
    this.iYG = new ArrayList();
    this.iWJ = 0;
    this.Yq = null;
    this.iYH = null;
    this.iYI = 0;
    this.iYK = 10;
    this.iYL = true;
    this.iYA = false;
    this.iYN = false;
    init(paramContext);
    AppMethodBeat.o(133936);
  }

  public RecentAppBrandView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(133937);
    this.iJL = new ArrayList();
    this.iYF = new ArrayList();
    this.iYG = new ArrayList();
    this.iWJ = 0;
    this.Yq = null;
    this.iYH = null;
    this.iYI = 0;
    this.iYK = 10;
    this.iYL = true;
    this.iYA = false;
    this.iYN = false;
    init(paramContext);
    AppMethodBeat.o(133937);
  }

  private void a(MotionEvent paramMotionEvent, boolean paramBoolean)
  {
    AppMethodBeat.i(133941);
    if (paramBoolean == this.iYN)
    {
      AppMethodBeat.o(133941);
      return;
    }
    paramMotionEvent = x(paramMotionEvent.getX(), paramMotionEvent.getY());
    if (paramMotionEvent != null)
    {
      paramMotionEvent = bm(paramMotionEvent);
      if (paramMotionEvent != null)
      {
        paramMotionEvent.apJ.setPressed(paramBoolean);
        if (!paramBoolean)
          break label87;
        ab.i("MicroMsg.RecentAppBrandView", "alvinluo add pressed item");
        this.iYG.add(paramMotionEvent);
      }
    }
    while (true)
    {
      this.iYN = paramBoolean;
      AppMethodBeat.o(133941);
      break;
      label87: ab.i("MicroMsg.RecentAppBrandView", "alvinluo remove pressed item");
      this.iYG.remove(paramMotionEvent);
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(133939);
    this.iYH = new GridLayoutManager(4, (byte)0);
    setLayoutManager(this.iYH);
    this.Yq = new RecentAppBrandView.a(this);
    setAdapter(this.Yq);
    this.iay = new GestureDetector(paramContext, this);
    this.iYJ = new f();
    this.iYJ.Yq = this.Yq;
    setItemAnimator(this.iYJ);
    AppMethodBeat.o(133939);
  }

  public final void aPw()
  {
    AppMethodBeat.i(133945);
    if (getAdapter() != null)
      getAdapter().aop.notifyChanged();
    AppMethodBeat.o(133945);
  }

  public boolean canScrollHorizontally(int paramInt)
  {
    return false;
  }

  public int getDataCount()
  {
    AppMethodBeat.i(133947);
    int i = this.iJL.size();
    AppMethodBeat.o(133947);
    return i;
  }

  public List<AppBrandDesktopView.c> getDataList()
  {
    return this.iJL;
  }

  public int getShowCount()
  {
    AppMethodBeat.i(133946);
    int i = this.iYF.size();
    AppMethodBeat.o(133946);
    return i;
  }

  public List<AppBrandDesktopView.c> getShowList()
  {
    return this.iYF;
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(133942);
    ab.i("MicroMsg.RecentAppBrandView", "alvinluo RecentAppBrandView onDown");
    AppMethodBeat.o(133942);
    return false;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(133944);
    this.iYA = true;
    a(paramMotionEvent, false);
    AppMethodBeat.o(133944);
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(133943);
    paramMotionEvent = x(paramMotionEvent.getX(), paramMotionEvent.getY());
    if (paramMotionEvent != null)
    {
      paramMotionEvent = bm(paramMotionEvent);
      if (paramMotionEvent != null)
        paramMotionEvent.apJ.performClick();
    }
    AppMethodBeat.o(133943);
    return false;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(133940);
    if (paramMotionEvent.getAction() == 0)
    {
      this.iYA = false;
      a(paramMotionEvent, true);
      this.iay.onTouchEvent(paramMotionEvent);
      if (this.iYA)
        break label102;
      AppMethodBeat.o(133940);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      if (paramMotionEvent.getAction() == 2)
        break;
      Iterator localIterator = this.iYG.iterator();
      while (localIterator.hasNext())
        ((RecyclerView.v)localIterator.next()).apJ.setPressed(false);
      this.iYG.clear();
      break;
      label102: AppMethodBeat.o(133940);
    }
  }

  public final AppBrandDesktopView.c qn(int paramInt)
  {
    AppMethodBeat.i(133948);
    AppBrandDesktopView.c localc = (AppBrandDesktopView.c)this.iJL.get(paramInt);
    AppMethodBeat.o(133948);
    return localc;
  }

  public void setDataList(List<AppBrandDesktopView.c> paramList)
  {
    int i = 4;
    AppMethodBeat.i(133938);
    this.iJL = paramList;
    this.iYF.clear();
    if (this.iJL.size() == 4);
    while (true)
    {
      for (int j = 0; (j < this.iJL.size()) && (j < i); j++)
        this.iYF.add(this.iJL.get(j));
      i = 3;
    }
    this.iYL = true;
    ab.i("MicroMsg.RecentAppBrandView", "alvinluo RecentAppBrandView mDataList: %d, showList: %d", new Object[] { Integer.valueOf(this.iJL.size()), Integer.valueOf(this.iYF.size()) });
    AppMethodBeat.o(133938);
  }

  public void setItemPadding(int paramInt)
  {
    this.iWJ = paramInt;
  }

  public void setOnItemClickListener(b paramb)
  {
    this.iYM = paramb;
  }

  public void setReporter(b paramb)
  {
    this.iXE = paramb;
  }

  public static abstract interface b
  {
    public abstract void a(AppBrandDesktopView.c paramc, int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.RecentAppBrandView
 * JD-Core Version:    0.6.2
 */