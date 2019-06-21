package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.tencent.mm.plugin.scanner.a.m;
import com.tencent.mm.plugin.scanner.util.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public abstract class i
{
  protected ProgressDialog ehJ = null;
  protected TextView iqU;
  GestureDetector lCs;
  protected Point lUF;
  protected boolean ovx;
  protected long qel;
  protected Rect qem;
  protected b qen;
  protected Point qeo;
  protected int qep;
  protected int qeq;
  protected int qer = 40;
  protected int qes = 20;
  protected i.b qet;
  protected int qeu;
  protected boolean qev;
  protected ak qew = new i.1(this);

  public i(i.b paramb, Point paramPoint)
  {
    this.qet = paramb;
    this.qeo = paramPoint;
  }

  public i(i.b paramb, Point paramPoint, byte paramByte)
  {
    this.qet = paramb;
    this.qeo = paramPoint;
    this.qer = 50;
  }

  protected Rect H(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    if ((this.qem == null) || (paramBoolean1))
    {
      i = this.qeo.x;
      j = this.qeo.y;
      if (paramBoolean2)
        break label161;
      k = i / 2 - this.qep / 2;
      m = i / 2 + this.qep / 2;
      n = j / 2 - this.qeq / 2;
      i1 = this.qeq + n;
    }
    while (true)
    {
      ab.d("MicroMsg.scanner.ScanMode", "framingRect: width = %s, height = %s; left = %s, right = %s, top = %s, bottom = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1) });
      this.qem = new Rect(k, n, m, i1);
      return this.qem;
      label161: if (i < j)
      {
        k = j / 2 - this.qep / 2;
        m = j / 2 + this.qep / 2;
        n = BackwardSupportUtil.b.b(this.qet.getContext(), this.qes);
        i1 = this.qeq + n;
      }
      else
      {
        k = i / 2 - this.qep / 2;
        m = i / 2 + this.qep / 2;
        n = BackwardSupportUtil.b.b(this.qet.getContext(), this.qes);
        i1 = this.qeq + n;
      }
    }
  }

  protected void a(byte[] paramArrayOfByte, Point paramPoint, int paramInt, Rect paramRect)
  {
    ab.i("MicroMsg.scanner.ScanMode", "decode count:" + m.pZK.pZN);
    if (cgO() != null)
    {
      cgO().a(paramArrayOfByte, paramPoint, paramInt, paramRect);
      if (m.pZK.pZN == 30)
        this.qet.chk();
    }
  }

  protected abstract void cgN();

  protected abstract b cgO();

  protected abstract int cgP();

  protected abstract int cgQ();

  protected abstract void cgR();

  protected abstract boolean cgS();

  protected abstract boolean cgT();

  public final i.b chu()
  {
    return this.qet;
  }

  protected void dw(View paramView)
  {
  }

  protected final void dx(View paramView)
  {
    this.lCs = new GestureDetector(new i.2(this));
    paramView.setOnTouchListener(new i.3(this));
  }

  public final void e(Point paramPoint)
  {
    this.qeo = paramPoint;
  }

  protected void f(Point paramPoint)
  {
    this.lUF = paramPoint;
  }

  protected final double fd(int paramInt1, int paramInt2)
  {
    Activity localActivity = this.qet.getContext();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localActivity.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    double d = localDisplayMetrics.densityDpi / 160.0D;
    ab.d("MicroMsg.scanner.ScanMode", "dpiLevel [%s]", new Object[] { Double.valueOf(d) });
    int i = (int)(this.qeo.x * 0.85F);
    int j = (int)(this.qeo.y * 0.85F);
    if (((this instanceof j)) || ((this instanceof c)))
    {
      i = (int)(this.qeo.y * 0.85F);
      j = (int)(this.qeo.x * 0.85F);
    }
    while (true)
    {
      float f1 = 1.0F;
      float f2;
      if (d > 1.2D)
      {
        f2 = f1;
        if (this.qeo.x + this.qeo.y > 3000)
        {
          f2 = f1;
          if (d < 2.4D)
            f2 = 1.6F;
        }
      }
      while (true)
      {
        this.qep = BackwardSupportUtil.b.b(this.qet.getContext(), paramInt1 * f2);
        this.qeq = BackwardSupportUtil.b.b(this.qet.getContext(), paramInt2 * f2);
        f1 = f2;
        if (this.qep <= i)
          if (this.qeq <= j)
            break label427;
        for (f1 = f2; (this.qep > i) || (this.qeq > j); f1 -= 0.1F)
        {
          this.qep = BackwardSupportUtil.b.b(this.qet.getContext(), paramInt1 * f1);
          this.qeq = BackwardSupportUtil.b.b(this.qet.getContext(), paramInt2 * f1);
        }
        if ((this.qeo != null) && (this.qeo.x + this.qeo.y > 1560))
          f2 = 1.7F;
        else if ((this.qeo != null) && (this.qeo.x + this.qeo.y > 1460))
          f2 = 1.1F;
        else
          f2 = 0.9F;
      }
      ab.i("MicroMsg.scanner.ScanMode", "final adjust ratio: %s", new Object[] { Float.valueOf(f1) });
      label427: if (this.qep % 2 == 1)
        this.qep += 1;
      if (this.qeq % 2 == 1)
        this.qeq += 1;
      ab.d("MicroMsg.scanner.ScanMode", "frame, width:%d, height:%d, visDisplayFrameRes:%s", new Object[] { Integer.valueOf(this.qep), Integer.valueOf(this.qeq), this.qeo });
      return d;
    }
  }

  protected abstract void j(Rect paramRect);

  protected final void kl(boolean paramBoolean)
  {
    if (this.iqU == null);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.iqU.setVisibility(4);
        this.qew.sendEmptyMessageDelayed(1, 210L);
      }
      else
      {
        this.qew.removeMessages(1);
        this.iqU.setVisibility(4);
      }
    }
  }

  protected Rect km(boolean paramBoolean)
  {
    return H(true, paramBoolean);
  }

  protected void kn(boolean paramBoolean)
  {
    this.ovx = paramBoolean;
  }

  public final void ko(boolean paramBoolean)
  {
    TextView localTextView;
    if (this.iqU != null)
    {
      localTextView = this.iqU;
      if (!paramBoolean)
        break label24;
    }
    label24: for (int i = 0; ; i = 4)
    {
      localTextView.setVisibility(i);
      return;
    }
  }

  protected abstract void onDestroy();

  protected void onPause()
  {
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
  }

  protected abstract void onResume();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.i
 * JD-Core Version:    0.6.2
 */