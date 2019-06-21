package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.ak;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class t extends m
  implements o, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private boolean TO;
  private final View.OnAttachStateChangeListener aaA = new View.OnAttachStateChangeListener()
  {
    public final void onViewAttachedToWindow(View paramAnonymousView)
    {
    }

    public final void onViewDetachedFromWindow(View paramAnonymousView)
    {
      if (t.a(t.this) != null)
      {
        if (!t.a(t.this).isAlive())
          t.a(t.this, paramAnonymousView.getViewTreeObserver());
        t.a(t.this).removeGlobalOnLayoutListener(t.b(t.this));
      }
      paramAnonymousView.removeOnAttachStateChangeListener(this);
    }
  };
  private int aaD = 0;
  View aaE;
  private o.a aaL;
  private ViewTreeObserver aaM;
  private PopupWindow.OnDismissListener aaN;
  private final int aat;
  private final int aau;
  private final boolean aav;
  private final ViewTreeObserver.OnGlobalLayoutListener aaz = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public final void onGlobalLayout()
    {
      if ((t.this.isShowing()) && (!t.this.acn.amG))
      {
        View localView = t.this.aaE;
        if ((localView != null) && (localView.isShown()))
          break label50;
        t.this.dismiss();
      }
      while (true)
      {
        return;
        label50: t.this.acn.show();
      }
    }
  };
  private final g acl;
  private final int acm;
  final ak acn;
  private boolean aco;
  private boolean acp;
  private int acq;
  private final h lo;
  private final Context mContext;
  private View pP;

  public t(Context paramContext, h paramh, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.lo = paramh;
    this.aav = paramBoolean;
    this.acl = new g(paramh, LayoutInflater.from(paramContext), this.aav);
    this.aat = paramInt1;
    this.aau = paramInt2;
    Resources localResources = paramContext.getResources();
    this.acm = Math.max(localResources.getDisplayMetrics().widthPixels / 2, localResources.getDimensionPixelSize(2131427361));
    this.pP = paramView;
    this.acn = new ak(this.mContext, this.aat, this.aau);
    paramh.a(this, paramContext);
  }

  public final void a(h paramh, boolean paramBoolean)
  {
    if (paramh != this.lo);
    while (true)
    {
      return;
      dismiss();
      if (this.aaL != null)
        this.aaL.a(paramh, paramBoolean);
    }
  }

  public final void a(o.a parama)
  {
    this.aaL = parama;
  }

  public final boolean a(u paramu)
  {
    n localn;
    int i;
    int j;
    if (paramu.hasVisibleItems())
    {
      localn = new n(this.mContext, paramu, this.aaE, this.aav, this.aat, this.aau);
      localn.c(this.aaL);
      localn.setForceShowIcon(m.h(paramu));
      localn.aaD = this.aaD;
      localn.aaN = this.aaN;
      this.aaN = null;
      this.lo.U(false);
      i = this.acn.amm;
      j = this.acn.getVerticalOffset();
      if (localn.isShowing())
      {
        j = 1;
        if (j == 0)
          break label165;
        if (this.aaL != null)
          this.aaL.d(paramu);
      }
    }
    label165: for (boolean bool = true; ; bool = false)
    {
      return bool;
      if (localn.pP == null)
      {
        j = 0;
        break;
      }
      localn.b(i, j, true, true);
      j = 1;
      break;
    }
  }

  public final boolean bt()
  {
    return false;
  }

  public final void dismiss()
  {
    if (isShowing())
      this.acn.dismiss();
  }

  public final void f(h paramh)
  {
  }

  public final ListView getListView()
  {
    return this.acn.amk;
  }

  public final boolean isShowing()
  {
    if ((!this.aco) && (this.acn.amH.isShowing()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void n(boolean paramBoolean)
  {
    this.acp = false;
    if (this.acl != null)
      this.acl.notifyDataSetChanged();
  }

  public final void onDismiss()
  {
    this.aco = true;
    this.lo.close();
    if (this.aaM != null)
    {
      if (!this.aaM.isAlive())
        this.aaM = this.aaE.getViewTreeObserver();
      this.aaM.removeGlobalOnLayoutListener(this.aaz);
      this.aaM = null;
    }
    this.aaE.removeOnAttachStateChangeListener(this.aaA);
    if (this.aaN != null)
      this.aaN.onDismiss();
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
      dismiss();
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
  }

  public final Parcelable onSaveInstanceState()
  {
    return null;
  }

  public final void setAnchorView(View paramView)
  {
    this.pP = paramView;
  }

  public final void setForceShowIcon(boolean paramBoolean)
  {
    this.acl.aaK = paramBoolean;
  }

  public final void setGravity(int paramInt)
  {
    this.aaD = paramInt;
  }

  public final void setHorizontalOffset(int paramInt)
  {
    this.acn.amm = paramInt;
  }

  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.aaN = paramOnDismissListener;
  }

  public final void setShowTitle(boolean paramBoolean)
  {
    this.TO = paramBoolean;
  }

  public final void setVerticalOffset(int paramInt)
  {
    this.acn.setVerticalOffset(paramInt);
  }

  public final void show()
  {
    int i = 1;
    int j;
    if (isShowing())
      j = i;
    while (j == 0)
    {
      throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
      if ((this.aco) || (this.pP == null))
      {
        j = 0;
      }
      else
      {
        this.aaE = this.pP;
        this.acn.setOnDismissListener(this);
        this.acn.amz = this;
        this.acn.setModal(true);
        Object localObject = this.aaE;
        if (this.aaM == null);
        for (j = 1; ; j = 0)
        {
          this.aaM = ((View)localObject).getViewTreeObserver();
          if (j != 0)
            this.aaM.addOnGlobalLayoutListener(this.aaz);
          ((View)localObject).addOnAttachStateChangeListener(this.aaA);
          this.acn.amx = ((View)localObject);
          this.acn.aaD = this.aaD;
          if (!this.acp)
          {
            this.acq = a(this.acl, null, this.mContext, this.acm);
            this.acp = true;
          }
          this.acn.setContentWidth(this.acq);
          this.acn.iZ();
          this.acn.ach = this.ach;
          this.acn.show();
          localObject = this.acn.amk;
          ((ListView)localObject).setOnKeyListener(this);
          if ((this.TO) && (this.lo.abz != null))
          {
            FrameLayout localFrameLayout = (FrameLayout)LayoutInflater.from(this.mContext).inflate(2130968601, (ViewGroup)localObject, false);
            TextView localTextView = (TextView)localFrameLayout.findViewById(16908310);
            if (localTextView != null)
              localTextView.setText(this.lo.abz);
            localFrameLayout.setEnabled(false);
            ((ListView)localObject).addHeaderView(localFrameLayout, null, false);
          }
          this.acn.setAdapter(this.acl);
          this.acn.show();
          j = i;
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.t
 * JD-Core Version:    0.6.2
 */