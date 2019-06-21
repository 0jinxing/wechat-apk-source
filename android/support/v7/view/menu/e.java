package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.ab;
import android.support.v7.widget.aj;
import android.support.v7.widget.ak;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class e extends m
  implements o, View.OnKeyListener, PopupWindow.OnDismissListener
{
  private boolean TO;
  private final View.OnAttachStateChangeListener aaA = new View.OnAttachStateChangeListener()
  {
    public final void onViewAttachedToWindow(View paramAnonymousView)
    {
    }

    public final void onViewDetachedFromWindow(View paramAnonymousView)
    {
      if (e.a(e.this) != null)
      {
        if (!e.a(e.this).isAlive())
          e.a(e.this, paramAnonymousView.getViewTreeObserver());
        e.a(e.this).removeGlobalOnLayoutListener(e.b(e.this));
      }
      paramAnonymousView.removeOnAttachStateChangeListener(this);
    }
  };
  private final aj aaB = new aj()
  {
    public final void b(h paramAnonymoush, MenuItem paramAnonymousMenuItem)
    {
      e.this.aaw.removeCallbacksAndMessages(paramAnonymoush);
    }

    public final void c(final h paramAnonymoush, final MenuItem paramAnonymousMenuItem)
    {
      e.this.aaw.removeCallbacksAndMessages(null);
      int i = 0;
      int j = e.this.aay.size();
      if (i < j)
        if (paramAnonymoush != ((e.a)e.this.aay.get(i)).VK);
      while (true)
      {
        if (i == -1)
        {
          return;
          i++;
          break;
        }
        i++;
        if (i < e.this.aay.size());
        for (final e.a locala = (e.a)e.this.aay.get(i); ; locala = null)
        {
          paramAnonymousMenuItem = new Runnable()
          {
            public final void run()
            {
              if (locala != null)
              {
                e.this.aaO = true;
                locala.VK.U(false);
                e.this.aaO = false;
              }
              if ((paramAnonymousMenuItem.isEnabled()) && (paramAnonymousMenuItem.hasSubMenu()))
                paramAnonymoush.a(paramAnonymousMenuItem, null, 4);
            }
          };
          long l = SystemClock.uptimeMillis();
          e.this.aaw.postAtTime(paramAnonymousMenuItem, paramAnonymoush, l + 200L);
          break;
        }
        i = -1;
      }
    }
  };
  private int aaC = 0;
  private int aaD = 0;
  View aaE;
  private int aaF;
  private boolean aaG;
  private boolean aaH;
  private int aaI;
  private int aaJ;
  private boolean aaK;
  private o.a aaL;
  private ViewTreeObserver aaM;
  private PopupWindow.OnDismissListener aaN;
  boolean aaO;
  private final int aas;
  private final int aat;
  private final int aau;
  private final boolean aav;
  final Handler aaw;
  private final List<h> aax = new ArrayList();
  final List<a> aay = new ArrayList();
  private final ViewTreeObserver.OnGlobalLayoutListener aaz = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public final void onGlobalLayout()
    {
      Object localObject;
      if ((e.this.isShowing()) && (e.this.aay.size() > 0) && (!((e.a)e.this.aay.get(0)).aaU.amG))
      {
        localObject = e.this.aaE;
        if ((localObject != null) && (((View)localObject).isShown()))
          break label77;
        e.this.dismiss();
      }
      while (true)
      {
        return;
        label77: localObject = e.this.aay.iterator();
        while (((Iterator)localObject).hasNext())
          ((e.a)((Iterator)localObject).next()).aaU.show();
      }
    }
  };
  private final Context mContext;
  private View pP;

  public e(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.pP = paramView;
    this.aat = paramInt1;
    this.aau = paramInt2;
    this.aav = paramBoolean;
    this.aaK = false;
    this.aaF = gp();
    paramContext = paramContext.getResources();
    this.aas = Math.max(paramContext.getDisplayMetrics().widthPixels / 2, paramContext.getDimensionPixelSize(2131427361));
    this.aaw = new Handler();
  }

  private static MenuItem a(h paramh1, h paramh2)
  {
    int i = paramh1.size();
    int j = 0;
    MenuItem localMenuItem;
    if (j < i)
    {
      localMenuItem = paramh1.getItem(j);
      if ((!localMenuItem.hasSubMenu()) || (paramh2 != localMenuItem.getSubMenu()));
    }
    for (paramh1 = localMenuItem; ; paramh1 = null)
    {
      return paramh1;
      j++;
      break;
    }
  }

  private static View a(a parama, h paramh)
  {
    int i = 0;
    paramh = a(parama.VK, paramh);
    if (paramh == null)
    {
      parama = null;
      return parama;
    }
    ab localab = parama.aaU.amk;
    parama = localab.getAdapter();
    int j;
    if ((parama instanceof HeaderViewListAdapter))
    {
      parama = (HeaderViewListAdapter)parama;
      j = parama.getHeadersCount();
      parama = (g)parama.getWrappedAdapter();
      label58: int k = parama.getCount();
      label64: if (i >= k)
        break label142;
      if (paramh != parama.br(i))
        break label100;
    }
    while (true)
    {
      if (i == -1)
      {
        parama = null;
        break;
        parama = (g)parama;
        j = 0;
        break label58;
        label100: i++;
        break label64;
      }
      i = i + j - localab.getFirstVisiblePosition();
      if ((i < 0) || (i >= localab.getChildCount()))
      {
        parama = null;
        break;
      }
      parama = localab.getChildAt(i);
      break;
      label142: i = -1;
    }
  }

  private int bq(int paramInt)
  {
    ab localab = ((a)this.aay.get(this.aay.size() - 1)).aaU.amk;
    int[] arrayOfInt = new int[2];
    localab.getLocationOnScreen(arrayOfInt);
    Rect localRect = new Rect();
    this.aaE.getWindowVisibleDisplayFrame(localRect);
    if (this.aaF == 1)
    {
      int i = arrayOfInt[0];
      if (localab.getWidth() + i + paramInt > localRect.right)
        paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      continue;
      if (arrayOfInt[0] - paramInt < 0)
        paramInt = 1;
      else
        paramInt = 0;
    }
  }

  private void g(h paramh)
  {
    Object localObject1 = LayoutInflater.from(this.mContext);
    Object localObject2 = new g(paramh, (LayoutInflater)localObject1, this.aav);
    int i;
    ak localak;
    Object localObject3;
    label127: int j;
    int k;
    label159: int m;
    if ((!isShowing()) && (this.aaK))
    {
      ((g)localObject2).aaK = true;
      i = a((ListAdapter)localObject2, null, this.mContext, this.aas);
      localak = go();
      localak.setAdapter((ListAdapter)localObject2);
      localak.setContentWidth(i);
      localak.aaD = this.aaD;
      if (this.aay.size() <= 0)
        break label361;
      localObject2 = (a)this.aay.get(this.aay.size() - 1);
      localObject3 = a((a)localObject2, paramh);
      if (localObject3 == null)
        break label508;
      localak.jc();
      localak.jb();
      j = bq(i);
      if (j != 1)
        break label369;
      k = 1;
      this.aaF = j;
      if (Build.VERSION.SDK_INT < 26)
        break label375;
      localak.amx = ((View)localObject3);
      j = 0;
      m = 0;
      label186: if ((this.aaD & 0x5) != 5)
        break label480;
      if (k == 0)
        break label467;
      k = m + i;
      label208: localak.amm = k;
      localak.ja();
      localak.setVerticalOffset(j);
    }
    while (true)
    {
      localObject3 = new a(localak, paramh, this.aaF);
      this.aay.add(localObject3);
      localak.show();
      localObject3 = localak.amk;
      ((ListView)localObject3).setOnKeyListener(this);
      if ((localObject2 == null) && (this.TO) && (paramh.abz != null))
      {
        localObject1 = (FrameLayout)((LayoutInflater)localObject1).inflate(2130968601, (ViewGroup)localObject3, false);
        localObject2 = (TextView)((FrameLayout)localObject1).findViewById(16908310);
        ((FrameLayout)localObject1).setEnabled(false);
        ((TextView)localObject2).setText(paramh.abz);
        ((ListView)localObject3).addHeaderView((View)localObject1, null, false);
        localak.show();
      }
      return;
      if (!isShowing())
        break;
      ((g)localObject2).aaK = m.h(paramh);
      break;
      label361: localObject3 = null;
      localObject2 = null;
      break label127;
      label369: k = 0;
      break label159;
      label375: int[] arrayOfInt1 = new int[2];
      this.pP.getLocationOnScreen(arrayOfInt1);
      int[] arrayOfInt2 = new int[2];
      ((View)localObject3).getLocationOnScreen(arrayOfInt2);
      if ((this.aaD & 0x7) == 5)
      {
        arrayOfInt1[0] += this.pP.getWidth();
        arrayOfInt2[0] += ((View)localObject3).getWidth();
      }
      m = arrayOfInt2[0] - arrayOfInt1[0];
      j = arrayOfInt2[1] - arrayOfInt1[1];
      break label186;
      label467: k = m - ((View)localObject3).getWidth();
      break label208;
      label480: if (k != 0)
      {
        k = ((View)localObject3).getWidth() + m;
        break label208;
      }
      k = m - i;
      break label208;
      label508: if (this.aaG)
        localak.amm = this.aaI;
      if (this.aaH)
        localak.setVerticalOffset(this.aaJ);
      localak.ach = this.ach;
    }
  }

  private ak go()
  {
    ak localak = new ak(this.mContext, this.aat, this.aau);
    localak.amK = this.aaB;
    localak.amz = this;
    localak.setOnDismissListener(this);
    localak.amx = this.pP;
    localak.aaD = this.aaD;
    localak.setModal(true);
    localak.iZ();
    return localak;
  }

  private int gp()
  {
    int i = 1;
    if (s.T(this.pP) == 1)
      i = 0;
    return i;
  }

  public final void a(h paramh, boolean paramBoolean)
  {
    int i = this.aay.size();
    int j = 0;
    if (j < i)
      if (paramh == ((a)this.aay.get(j)).VK)
        label40: if (j >= 0)
          break label58;
    while (true)
    {
      return;
      j++;
      break;
      j = -1;
      break label40;
      label58: i = j + 1;
      if (i < this.aay.size())
        ((a)this.aay.get(i)).VK.U(false);
      a locala = (a)this.aay.remove(j);
      locala.VK.b(this);
      if (this.aaO)
      {
        ak localak = locala.aaU;
        if (Build.VERSION.SDK_INT >= 23)
          localak.amH.setExitTransition(null);
        locala.aaU.setAnimationStyle(0);
      }
      locala.aaU.dismiss();
      j = this.aay.size();
      if (j > 0);
      for (this.aaF = ((a)this.aay.get(j - 1)).position; ; this.aaF = gp())
      {
        if (j != 0)
          break label302;
        dismiss();
        if (this.aaL != null)
          this.aaL.a(paramh, true);
        if (this.aaM != null)
        {
          if (this.aaM.isAlive())
            this.aaM.removeGlobalOnLayoutListener(this.aaz);
          this.aaM = null;
        }
        this.aaE.removeOnAttachStateChangeListener(this.aaA);
        this.aaN.onDismiss();
        break;
      }
      label302: if (paramBoolean)
        ((a)this.aay.get(0)).VK.U(false);
    }
  }

  public final void a(o.a parama)
  {
    this.aaL = parama;
  }

  public final boolean a(u paramu)
  {
    Iterator localIterator = this.aay.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (paramu == locala.VK)
      {
        locala.aaU.amk.requestFocus();
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      if (paramu.hasVisibleItems())
      {
        f(paramu);
        if (this.aaL != null)
          this.aaL.d(paramu);
        bool = true;
      }
      else
      {
        bool = false;
      }
    }
  }

  public final boolean bt()
  {
    return false;
  }

  public final void dismiss()
  {
    int i = this.aay.size();
    if (i > 0)
    {
      a[] arrayOfa = (a[])this.aay.toArray(new a[i]);
      i--;
      while (i >= 0)
      {
        a locala = arrayOfa[i];
        if (locala.aaU.amH.isShowing())
          locala.aaU.dismiss();
        i--;
      }
    }
  }

  public final void f(h paramh)
  {
    paramh.a(this, this.mContext);
    if (isShowing())
      g(paramh);
    while (true)
    {
      return;
      this.aax.add(paramh);
    }
  }

  public final ListView getListView()
  {
    if (this.aay.isEmpty());
    for (Object localObject = null; ; localObject = ((a)this.aay.get(this.aay.size() - 1)).aaU.amk)
      return localObject;
  }

  protected final boolean gq()
  {
    return false;
  }

  public final boolean isShowing()
  {
    if ((this.aay.size() > 0) && (((a)this.aay.get(0)).aaU.amH.isShowing()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void n(boolean paramBoolean)
  {
    Iterator localIterator = this.aay.iterator();
    while (localIterator.hasNext())
      a(((a)localIterator.next()).aaU.amk.getAdapter()).notifyDataSetChanged();
  }

  public final void onDismiss()
  {
    int i = this.aay.size();
    int j = 0;
    a locala;
    if (j < i)
    {
      locala = (a)this.aay.get(j);
      if (locala.aaU.amH.isShowing());
    }
    while (true)
    {
      if (locala != null)
        locala.VK.U(false);
      return;
      j++;
      break;
      locala = null;
    }
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
    if (this.pP != paramView)
    {
      this.pP = paramView;
      this.aaD = d.getAbsoluteGravity(this.aaC, s.T(this.pP));
    }
  }

  public final void setForceShowIcon(boolean paramBoolean)
  {
    this.aaK = paramBoolean;
  }

  public final void setGravity(int paramInt)
  {
    if (this.aaC != paramInt)
    {
      this.aaC = paramInt;
      this.aaD = d.getAbsoluteGravity(paramInt, s.T(this.pP));
    }
  }

  public final void setHorizontalOffset(int paramInt)
  {
    this.aaG = true;
    this.aaI = paramInt;
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
    this.aaH = true;
    this.aaJ = paramInt;
  }

  public final void show()
  {
    if (isShowing());
    do
    {
      return;
      Iterator localIterator = this.aax.iterator();
      while (localIterator.hasNext())
        g((h)localIterator.next());
      this.aax.clear();
      this.aaE = this.pP;
    }
    while (this.aaE == null);
    if (this.aaM == null);
    for (int i = 1; ; i = 0)
    {
      this.aaM = this.aaE.getViewTreeObserver();
      if (i != 0)
        this.aaM.addOnGlobalLayoutListener(this.aaz);
      this.aaE.addOnAttachStateChangeListener(this.aaA);
      break;
    }
  }

  static final class a
  {
    public final h VK;
    public final ak aaU;
    public final int position;

    public a(ak paramak, h paramh, int paramInt)
    {
      this.aaU = paramak;
      this.VK = paramh;
      this.position = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.e
 * JD-Core Version:    0.6.2
 */