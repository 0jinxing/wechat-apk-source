package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class n
{
  protected int aaD = 8388611;
  private boolean aaK;
  private o.a aaL;
  PopupWindow.OnDismissListener aaN;
  private final int aat;
  private final int aau;
  private final boolean aav;
  private m aci;
  private final PopupWindow.OnDismissListener acj = new PopupWindow.OnDismissListener()
  {
    public final void onDismiss()
    {
      n.this.onDismiss();
    }
  };
  private final h lo;
  private final Context mContext;
  protected View pP;

  public n(Context paramContext, h paramh, View paramView, boolean paramBoolean)
  {
    this(paramContext, paramh, paramView, paramBoolean, 2130772133, 0);
  }

  public n(Context paramContext, h paramh, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    this.lo = paramh;
    this.pP = paramView;
    this.aav = paramBoolean;
    this.aat = paramInt1;
    this.aau = paramInt2;
  }

  final void b(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    m localm = gO();
    localm.setShowTitle(paramBoolean2);
    if (paramBoolean1)
    {
      int i = paramInt1;
      if ((d.getAbsoluteGravity(this.aaD, s.T(this.pP)) & 0x7) == 5)
        i = paramInt1 + this.pP.getWidth();
      localm.setHorizontalOffset(i);
      localm.setVerticalOffset(paramInt2);
      paramInt1 = (int)(this.mContext.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
      localm.ach = new Rect(i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt1 + paramInt2);
    }
    localm.show();
  }

  public final void c(o.a parama)
  {
    this.aaL = parama;
    if (this.aci != null)
      this.aci.a(parama);
  }

  public final void dismiss()
  {
    if (isShowing())
      this.aci.dismiss();
  }

  public final m gO()
  {
    Point localPoint;
    int i;
    if (this.aci == null)
    {
      localObject = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay();
      localPoint = new Point();
      if (Build.VERSION.SDK_INT < 17)
        break label164;
      ((Display)localObject).getRealSize(localPoint);
      if (Math.min(localPoint.x, localPoint.y) < this.mContext.getResources().getDimensionPixelSize(2131427938))
        break label172;
      i = 1;
      label74: if (i == 0)
        break label177;
    }
    label164: label172: label177: for (Object localObject = new e(this.mContext, this.pP, this.aat, this.aau, this.aav); ; localObject = new t(this.mContext, this.lo, this.pP, this.aat, this.aau, this.aav))
    {
      ((m)localObject).f(this.lo);
      ((m)localObject).setOnDismissListener(this.acj);
      ((m)localObject).setAnchorView(this.pP);
      ((m)localObject).a(this.aaL);
      ((m)localObject).setForceShowIcon(this.aaK);
      ((m)localObject).setGravity(this.aaD);
      this.aci = ((m)localObject);
      return this.aci;
      ((Display)localObject).getSize(localPoint);
      break;
      i = 0;
      break label74;
    }
  }

  public final boolean gP()
  {
    boolean bool = true;
    if (isShowing());
    while (true)
    {
      return bool;
      if (this.pP == null)
        bool = false;
      else
        b(0, 0, false, false);
    }
  }

  public final boolean isShowing()
  {
    if ((this.aci != null) && (this.aci.isShowing()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void onDismiss()
  {
    this.aci = null;
    if (this.aaN != null)
      this.aaN.onDismiss();
  }

  public final void setForceShowIcon(boolean paramBoolean)
  {
    this.aaK = paramBoolean;
    if (this.aci != null)
      this.aci.setForceShowIcon(paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.n
 * JD-Core Version:    0.6.2
 */