package com.tencent.mm.ui.statusbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.ae;

public class b extends FrameLayout
  implements c.a
{
  static final boolean zzH = c.zzP;
  private boolean anv;
  private int iJp;
  private final Activity mActivity;
  private final Paint mPaint;
  private int zzI;
  private int zzJ;
  private boolean zzK;
  private boolean zzL;
  private boolean zzM;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(67835);
    this.zzI = 0;
    this.zzJ = 0;
    this.zzK = false;
    this.anv = false;
    this.zzL = false;
    this.zzM = false;
    if (zzH)
    {
      this.mActivity = d.cY(paramContext);
      c.az(this.mActivity).a(this);
      this.mPaint = new Paint(0);
      this.mPaint.setStyle(Paint.Style.FILL);
      setWillNotDraw(false);
      AppMethodBeat.o(67835);
    }
    while (true)
    {
      return;
      this.mActivity = null;
      this.mPaint = null;
      AppMethodBeat.o(67835);
    }
  }

  private void PH(int paramInt)
  {
    AppMethodBeat.i(67836);
    ab.d("MicroMsg.DrawStatusBarFrameLayout", "applyStatusBarHeight height[%d] mFrozen[%b]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.anv) });
    this.iJp = Math.max(0, paramInt);
    if (this.anv)
    {
      this.zzL = true;
      AppMethodBeat.o(67836);
    }
    while (true)
    {
      return;
      try
      {
        if (this.zzK);
        for (paramInt = 0; ; paramInt = this.iJp)
        {
          setPadding(0, paramInt, 0, 0);
          dJn();
          AppMethodBeat.o(67836);
          break;
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        while (true)
          ab.w("MicroMsg.DrawStatusBarFrameLayout", "applyStatusBarHeight setPadding e=%s", new Object[] { localIllegalStateException.getMessage() });
      }
    }
  }

  private void dJn()
  {
    AppMethodBeat.i(67837);
    if (al.isMainThread())
    {
      invalidate();
      AppMethodBeat.o(67837);
    }
    while (true)
    {
      return;
      postInvalidate();
      AppMethodBeat.o(67837);
    }
  }

  public void K(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(67840);
    a(paramInt, paramBoolean, true);
    AppMethodBeat.o(67840);
  }

  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(67841);
    int i = this.zzI;
    int j = this.zzJ;
    this.zzI = paramInt;
    if (!zzH)
    {
      AppMethodBeat.o(67841);
      return;
    }
    Object localObject = this.mActivity.getWindow();
    d.a((Window)localObject);
    if (paramBoolean2)
    {
      if (!d.a((Window)localObject, paramBoolean1))
        break label114;
      label61: this.zzI = paramInt;
    }
    label160: label195: 
    while (true)
    {
      paramInt = 0;
      for (localObject = this; ; localObject = this)
      {
        ((b)localObject).zzJ = paramInt;
        label114: 
        do
        {
          if ((this.zzI != 0) || (this.zzJ != 0))
            break label160;
          setWillNotDraw(true);
          dJn();
          AppMethodBeat.o(67841);
          break;
          if (d.dJo())
            break label61;
        }
        while (Build.VERSION.SDK_INT < 21);
        int k = paramInt;
        if (paramBoolean1)
          k = ae.Jj(paramInt);
        this.zzI = k;
        if (!paramBoolean1)
          break label195;
        paramInt = Color.argb(51, 0, 0, 0);
      }
      if ((i != this.zzI) || (j != this.zzJ))
      {
        setWillNotDraw(false);
        dJn();
      }
      AppMethodBeat.o(67841);
      break;
    }
  }

  protected void dispatchDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(67842);
    if ((this.iJp <= 0) || (!zzH) || (this.zzK) || (willNotDraw()))
    {
      super.dispatchDraw(paramCanvas);
      if ((this.iJp > 0) && (zzH) && (this.zzK) && (!willNotDraw()))
        break label104;
      AppMethodBeat.o(67842);
    }
    while (true)
    {
      return;
      this.mPaint.setColor(this.zzI);
      paramCanvas.drawRect(0.0F, 0.0F, getWidth(), this.iJp, this.mPaint);
      break;
      label104: this.mPaint.setColor(this.zzJ);
      paramCanvas.drawRect(0.0F, 0.0F, getWidth(), this.iJp, this.mPaint);
      AppMethodBeat.o(67842);
    }
  }

  public void pO(int paramInt)
  {
    AppMethodBeat.i(67833);
    PH(paramInt);
    AppMethodBeat.o(67833);
  }

  public final void qM(boolean paramBoolean)
  {
    AppMethodBeat.i(67834);
    this.zzK = paramBoolean;
    PH(this.iJp);
    AppMethodBeat.o(67834);
  }

  public void requestLayout()
  {
    AppMethodBeat.i(67838);
    if (this.anv)
    {
      this.zzM = true;
      AppMethodBeat.o(67838);
    }
    while (true)
    {
      return;
      super.requestLayout();
      AppMethodBeat.o(67838);
    }
  }

  public void setLayoutFrozen(final boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(67843);
    if (!al.isMainThread())
    {
      post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(67832);
          b.this.setLayoutFrozen(paramBoolean);
          AppMethodBeat.o(67832);
        }
      });
      AppMethodBeat.o(67843);
      return;
    }
    ab.d("MicroMsg.DrawStatusBarFrameLayout", "setLayoutFrozen frozen[%b], mFrozen[%b], mDeferLayout[%b], mDeferInvalidate[%b]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.anv), Boolean.valueOf(this.zzM), Boolean.valueOf(this.zzL) });
    if (paramBoolean != this.anv);
    while (true)
    {
      this.anv = paramBoolean;
      if ((i != 0) && (!paramBoolean) && ((this.zzM) || (this.zzL)))
      {
        PH(this.iJp);
        this.zzM = false;
        this.zzL = false;
      }
      AppMethodBeat.o(67843);
      break;
      i = 0;
    }
  }

  public void setStatusBarColor(int paramInt)
  {
    AppMethodBeat.i(67839);
    if (!zzH)
      AppMethodBeat.o(67839);
    while (true)
    {
      return;
      K(paramInt, d.b(this.mActivity.getWindow()));
      AppMethodBeat.o(67839);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.statusbar.b
 * JD-Core Version:    0.6.2
 */