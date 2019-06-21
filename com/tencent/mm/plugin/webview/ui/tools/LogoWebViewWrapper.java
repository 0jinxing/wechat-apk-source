package com.tencent.mm.plugin.webview.ui.tools;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;

public class LogoWebViewWrapper extends LinearLayout
{
  private Context context;
  WebView ejN;
  private int mTouchSlop;
  private int startY;
  private boolean urA;
  private boolean urB;
  private int urC;
  FrameLayout uro;
  private boolean urp;
  private int urq;
  private int urr;
  private LogoWebViewWrapper.c urs;
  private int urt;
  boolean uru;
  private boolean urv;
  private int urw;
  LogoWebViewWrapper.a urx;
  LogoWebViewWrapper.b ury;
  private boolean urz;

  public LogoWebViewWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(7395);
    this.urp = false;
    this.urt = 0;
    this.uru = false;
    this.urv = false;
    this.urw = 0;
    this.urz = false;
    this.urA = false;
    this.urB = false;
    this.urC = -1;
    this.context = paramContext;
    init();
    AppMethodBeat.o(7395);
  }

  @TargetApi(11)
  public LogoWebViewWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(7396);
    this.urp = false;
    this.urt = 0;
    this.uru = false;
    this.urv = false;
    this.urw = 0;
    this.urz = false;
    this.urA = false;
    this.urB = false;
    this.urC = -1;
    this.context = paramContext;
    init();
    AppMethodBeat.o(7396);
  }

  private int getLogoHeight()
  {
    AppMethodBeat.i(7402);
    if (this.urC < 0)
      this.urC = ((int)TypedValue.applyDimension(1, 60.0F, this.context.getResources().getDisplayMetrics()));
    int i = this.urC;
    AppMethodBeat.o(7402);
    return i;
  }

  private int getOverScrollDistance()
  {
    AppMethodBeat.i(7403);
    int i = getHeight();
    AppMethodBeat.o(7403);
    return i;
  }

  private long getScrollBackDuration()
  {
    AppMethodBeat.i(7401);
    long l1 = Math.abs(getScrollY());
    long l2 = Math.abs(l1 - Math.abs(this.urw));
    if (l2 >= l1)
    {
      l2 = 300L;
      AppMethodBeat.o(7401);
    }
    while (true)
    {
      return l2;
      l2 = ()((float)l2 / (float)l1 * 300.0F);
      AppMethodBeat.o(7401);
    }
  }

  private void init()
  {
    AppMethodBeat.i(7397);
    setOrientation(1);
    this.mTouchSlop = ViewConfiguration.get(this.context).getScaledTouchSlop();
    AppMethodBeat.o(7397);
  }

  public final void Ji(int paramInt)
  {
    AppMethodBeat.i(7404);
    int i = getOverScrollDistance();
    scrollTo(0, Math.min(i, Math.max(-i, paramInt)));
    AppMethodBeat.o(7404);
  }

  public WebView getWebView()
  {
    return this.ejN;
  }

  public FrameLayout getWebViewContainer()
  {
    AppMethodBeat.i(7398);
    int i;
    if (this.uro == null)
      i = getChildCount();
    for (int j = 0; ; j++)
    {
      Object localObject;
      if (j < i)
      {
        localObject = getChildAt(j);
        if (((localObject instanceof FrameLayout)) && (((View)localObject).getId() == 2131823603))
          this.uro = ((FrameLayout)localObject);
      }
      else
      {
        localObject = this.uro;
        AppMethodBeat.o(7398);
        return localObject;
      }
    }
  }

  public final void nM(boolean paramBoolean)
  {
    this.uru = paramBoolean;
    if (this.uru)
    {
      this.urp = false;
      this.urt = 0;
    }
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(7399);
    if ((this.uru) && (!this.urz))
      AppMethodBeat.o(7399);
    int i;
    while (true)
    {
      return bool;
      i = paramMotionEvent.getAction();
      if ((i == 3) || (i == 1))
      {
        this.urp = false;
        this.urt = 0;
        this.urA = false;
        AppMethodBeat.o(7399);
      }
      else
      {
        if ((i != 2) || (!this.urp))
          break;
        AppMethodBeat.o(7399);
        bool = true;
      }
    }
    switch (i)
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    while (true)
    {
      bool = this.urp;
      AppMethodBeat.o(7399);
      break;
      if (this.ejN.isOverScrollStart())
      {
        this.urq = ((int)paramMotionEvent.getY());
        this.startY = ((int)paramMotionEvent.getY());
        this.urr = ((int)paramMotionEvent.getX());
        this.urp = false;
        this.urt = 0;
        this.urz = true;
        this.urA = true;
        continue;
        if (this.ejN.isOverScrollStart())
        {
          if (!this.urA)
          {
            this.urq = ((int)paramMotionEvent.getY());
            this.startY = ((int)paramMotionEvent.getY());
            this.urr = ((int)paramMotionEvent.getX());
            this.urp = false;
            this.urt = 0;
            this.urz = true;
            this.urA = true;
            bool = this.urp;
            AppMethodBeat.o(7399);
            break;
          }
          int j = (int)paramMotionEvent.getY();
          int k = (int)paramMotionEvent.getX();
          int m = j - this.urq;
          i = this.urr;
          if ((Math.abs(m) > this.mTouchSlop) && (Math.abs(m) > Math.abs(k - i)) && (m > 0))
          {
            this.urq = j;
            this.urr = k;
            if (this.urt == 1)
            {
              this.urp = true;
              this.urA = false;
              ab.i("MicroMsg.LogoWebViewWrapper", "Competitor wins in onTouchEvent");
              if (this.urx != null)
                this.urx.cZy();
            }
            else
            {
              this.urt += 1;
            }
          }
        }
      }
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(7400);
    if ((this.uru) && (!this.urz))
      AppMethodBeat.o(7400);
    while (true)
    {
      return bool;
      if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
      {
        AppMethodBeat.o(7400);
      }
      else
      {
        switch (paramMotionEvent.getAction())
        {
        default:
        case 0:
        case 2:
        case 1:
        case 3:
        }
        do
        {
          do
          {
            do
            {
              AppMethodBeat.o(7400);
              break;
              this.urz = true;
            }
            while (!this.ejN.isOverScrollStart());
            this.urq = ((int)paramMotionEvent.getY());
            this.startY = ((int)paramMotionEvent.getY());
            this.urr = ((int)paramMotionEvent.getX());
            this.urB = true;
            AppMethodBeat.o(7400);
            bool = true;
            break;
          }
          while (!this.urp);
          if (!this.urB)
          {
            this.urq = ((int)paramMotionEvent.getY());
            this.startY = ((int)paramMotionEvent.getY());
            this.urr = ((int)paramMotionEvent.getX());
            this.urB = true;
            AppMethodBeat.o(7400);
            bool = true;
            break;
          }
          this.urq = ((int)paramMotionEvent.getY());
          this.urr = ((int)paramMotionEvent.getX());
          int i = Math.min(this.startY - this.urq, 0) >> 1;
          int j = getOverScrollDistance();
          int k = (int)Math.sqrt((getLogoHeight() >> 1) * Math.abs(i)) << 1;
          if (k > Math.abs(i))
          {
            k = i;
            if (Math.abs(i) <= j);
          }
          for (k = -j; ; k = -k)
          {
            Ji(k);
            if (this.ury != null)
              this.ury.as(k, true);
            AppMethodBeat.o(7400);
            bool = true;
            break;
          }
          this.urB = false;
        }
        while ((!this.urp) && (!this.urz));
        this.urp = false;
        z(-this.urw, getScrollBackDuration());
        post(new LogoWebViewWrapper.1(this));
        AppMethodBeat.o(7400);
        bool = true;
      }
    }
  }

  public void setFastScrollBack(boolean paramBoolean)
  {
    this.urv = paramBoolean;
  }

  public void setMMOverScrollListener(LogoWebViewWrapper.a parama)
  {
    this.urx = parama;
  }

  public void setMMOverScrollOffsetListener(LogoWebViewWrapper.b paramb)
  {
    this.ury = paramb;
  }

  public void setReleaseTargetHeight(int paramInt)
  {
    this.urw = paramInt;
  }

  public final void z(int paramInt, long paramLong)
  {
    AppMethodBeat.i(7405);
    if (this.urs != null)
      this.urs.stop();
    int i = getScrollY();
    ab.i("MicroMsg.LogoWebViewWrapper", "smoothScrollTo oldScrollValue = %s, newScrollValue = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
    if (i != paramInt)
    {
      this.urs = new LogoWebViewWrapper.c(this, i, paramInt, paramLong);
      post(this.urs);
    }
    AppMethodBeat.o(7405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper
 * JD-Core Version:    0.6.2
 */