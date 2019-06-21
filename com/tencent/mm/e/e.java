package com.tencent.mm.e;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.k;
import com.tencent.mm.b.c.1;
import com.tencent.mm.b.c.2;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

public final class e extends b<com.tencent.mm.cache.c>
{
  private boolean cjF;
  private boolean ckd;
  private TimerTask cke;
  private Rect ckf;
  private float ckg;
  private float ckh;
  private int cki;
  private int ckj;
  private boolean ckk;
  private com.tencent.mm.b.c ckl;
  public com.tencent.mm.ae.a ckm;
  boolean ckn;
  private Timer mTimer;
  Matrix uS;

  public e()
  {
    AppMethodBeat.i(116186);
    this.mTimer = new Timer();
    this.ckf = new Rect();
    this.ckd = false;
    this.cjF = false;
    this.ckg = 0.0F;
    this.ckh = 0.0F;
    this.cki = 0;
    this.ckj = 0;
    this.ckk = false;
    this.ckl = new com.tencent.mm.b.c(this);
    this.uS = new Matrix();
    this.ckn = false;
    AppMethodBeat.o(116186);
  }

  private com.tencent.mm.y.c C(float paramFloat1, float paramFloat2)
  {
    com.tencent.mm.y.c localc = null;
    AppMethodBeat.i(116191);
    if (CI() == null)
    {
      ab.e("MicroMsg.EmojiAndTextArtist", "[isContainsItem] getCache is null!");
      AppMethodBeat.o(116191);
      return localc;
    }
    ListIterator localListIterator = ((com.tencent.mm.cache.c)CI()).Jj();
    float[] arrayOfFloat;
    do
    {
      if (!localListIterator.hasPrevious())
        break;
      localc = (com.tencent.mm.y.c)localListIterator.previous();
      arrayOfFloat = A(paramFloat1, paramFloat2);
    }
    while (!localc.D(arrayOfFloat[0], arrayOfFloat[1]));
    while (true)
    {
      AppMethodBeat.o(116191);
      break;
      localc = null;
    }
  }

  private com.tencent.mm.y.c CW()
  {
    Object localObject1 = null;
    com.tencent.mm.y.c localc = null;
    AppMethodBeat.i(116192);
    Object localObject2 = (com.tencent.mm.cache.c)CI();
    if (localObject2 == null)
    {
      AppMethodBeat.o(116192);
      localObject1 = localc;
    }
    while (true)
    {
      return localObject1;
      localObject2 = ((com.tencent.mm.cache.c)localObject2).Jj();
      while (((ListIterator)localObject2).hasPrevious())
      {
        localc = (com.tencent.mm.y.c)((ListIterator)localObject2).previous();
        if (localc.ejw)
          localObject1 = localc;
        localc.setSelected(false);
      }
      AppMethodBeat.o(116192);
    }
  }

  private void CX()
  {
    AppMethodBeat.i(116193);
    ab.d("MicroMsg.EmojiAndTextArtist", "[registerFocusTask]");
    if (this.cke != null)
      this.cke.cancel();
    this.cke = new e.a(this, this);
    this.mTimer.schedule(this.cke, 1500L);
    AppMethodBeat.o(116193);
  }

  private void CY()
  {
    AppMethodBeat.i(116194);
    ab.d("MicroMsg.EmojiAndTextArtist", "[unRegisterFocusTask]");
    if (this.cke != null)
      this.cke.cancel();
    AppMethodBeat.o(116194);
  }

  public final a CG()
  {
    return a.ciY;
  }

  public final void CH()
  {
  }

  public final void a(SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116195);
    ab.i("MicroMsg.EmojiAndTextArtist", "[addItem] text:%s", new Object[] { paramSpannableString });
    if (bo.ac(paramSpannableString))
      AppMethodBeat.o(116195);
    while (true)
    {
      return;
      com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)CI();
      if (localc == null)
      {
        ab.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
        AppMethodBeat.o(116195);
      }
      else
      {
        CY();
        CW();
        bk(false);
        Object localObject = getBoardRect();
        paramSpannableString = new com.tencent.mm.y.e(ah.getContext(), getMainMatrix(), localc.ac(true), (Rect)localObject, paramSpannableString, paramInt1, paramInt2);
        paramSpannableString.setSelected(true);
        paramSpannableString.eHn = true;
        localObject = A(((Rect)localObject).centerX(), ((Rect)localObject).centerY());
        paramSpannableString.a(localObject[0], localObject[1], this.cjc.getInitScale() / this.cjc.getCurScale(), (int)getRotation());
        localc.a(paramSpannableString);
        CP();
        CX();
        AppMethodBeat.o(116195);
      }
    }
  }

  public final void a(com.tencent.mm.y.e parame, SpannableString paramSpannableString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116197);
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)CI();
    if (localc == null)
    {
      ab.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
      AppMethodBeat.o(116197);
      return;
    }
    String str = parame.eHf;
    ab.i("MicroMsg.EmojiAndTextCache", "[delete] id:%s", new Object[] { str });
    Object localObject;
    if ((localc.efp != null) && (localc.efp.size() > 0))
    {
      localObject = (com.tencent.mm.y.c)localc.efp.peek();
      if (!((com.tencent.mm.y.c)localObject).eHf.equalsIgnoreCase(str))
        break label268;
      localc.efp.pop();
    }
    while (true)
    {
      parame.setSelected(true);
      parame.eHn = true;
      CY();
      CW();
      bk(true);
      if (!bo.ac(paramSpannableString))
      {
        localObject = getBoardRect();
        paramSpannableString = new com.tencent.mm.y.e(ah.getContext(), getMainMatrix(), localc.ac(true), (Rect)localObject, paramSpannableString, paramInt1, paramInt2);
        paramSpannableString.setSelected(true);
        localObject = parame.eHi;
        paramSpannableString.a(((PointF)localObject).x, ((PointF)localObject).y, this.cjc.getInitScale() / this.cjc.getCurScale(), parame.mRotation);
        paramSpannableString.mScale = parame.mScale;
        localc.a(paramSpannableString);
      }
      CP();
      CX();
      AppMethodBeat.o(116197);
      break;
      label268: ab.e("MicroMsg.EmojiAndTextCache", "[delete] id:%s emojiItem:%s", new Object[] { str, localObject });
    }
  }

  public final void b(k paramk)
  {
    AppMethodBeat.i(116196);
    ab.i("MicroMsg.EmojiAndTextArtist", "[addEmojiItem] item:%s", new Object[] { paramk });
    com.tencent.mm.cache.c localc = (com.tencent.mm.cache.c)CI();
    if (localc == null)
    {
      ab.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
      AppMethodBeat.o(116196);
    }
    while (true)
    {
      return;
      CY();
      CW();
      bk(false);
      Object localObject = getBoardRect();
      paramk = new com.tencent.mm.y.c(ah.getContext(), getMainMatrix(), localc.ac(true), paramk, (Rect)localObject);
      paramk.setSelected(true);
      localObject = A(((Rect)localObject).centerX(), ((Rect)localObject).centerY());
      paramk.a(localObject[0], localObject[1], this.cjc.getInitScale() / this.cjc.getCurScale(), (int)getRotation());
      localc.a(paramk);
      CP();
      CX();
      AppMethodBeat.o(116196);
    }
  }

  public final boolean o(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(116189);
    boolean bool;
    label69: Object localObject1;
    switch (paramMotionEvent.getActionMasked())
    {
    case 3:
    case 4:
    default:
      super.o(paramMotionEvent);
      bool = this.ckd;
      AppMethodBeat.o(116189);
      return bool;
    case 0:
      CY();
      localObject1 = C(paramMotionEvent.getX(), paramMotionEvent.getY());
      if (localObject1 == null)
      {
        this.ckd = false;
        if (CI() == null)
          bool = false;
      }
      break;
    case 5:
    case 6:
    case 2:
    case 1:
    }
    while (bool)
    {
      CW();
      bk(false);
      CP();
      break;
      localObject1 = ((com.tencent.mm.cache.c)CI()).Ji();
      if (localObject1 != null)
      {
        bool = ((com.tencent.mm.y.c)localObject1).ejw;
        continue;
        bool = ((com.tencent.mm.y.c)localObject1).eHn;
        CW();
        this.ckd = true;
        ((com.tencent.mm.y.c)localObject1).setSelected(true);
        ((com.tencent.mm.y.c)localObject1).eHn = bool;
        ((com.tencent.mm.y.c)localObject1).eHk.set(((com.tencent.mm.y.c)localObject1).eHi);
        ((com.tencent.mm.cache.c)CI()).b((com.tencent.mm.y.c)localObject1);
        bk(true);
        CP();
        break;
        if (this.ckd)
        {
          this.ckg = p(paramMotionEvent);
          this.cki = ((int)Math.toDegrees(Math.atan2(q(paramMotionEvent)[0], q(paramMotionEvent)[1])));
          localObject1 = ((com.tencent.mm.cache.c)CI()).Ji();
          if ((localObject1 == null) || (!((com.tencent.mm.y.c)localObject1).ejw))
            break;
          this.ckj = ((com.tencent.mm.y.c)localObject1).mRotation;
          this.ckh = ((com.tencent.mm.y.c)localObject1).mScale;
          break;
        }
        localObject1 = new int[2];
        if (paramMotionEvent.getPointerCount() > 1)
        {
          localObject1[0] = ((int)(paramMotionEvent.getX(0) + paramMotionEvent.getX(1)) / 2);
          localObject1[1] = ((int)(paramMotionEvent.getY(0) + paramMotionEvent.getY(1)) / 2);
        }
        localObject1 = C(localObject1[0], localObject1[1]);
        if (localObject1 == null)
          break;
        bool = ((com.tencent.mm.y.c)localObject1).eHn;
        CW();
        ((com.tencent.mm.y.c)localObject1).eHn = bool;
        this.ckd = true;
        ((com.tencent.mm.y.c)localObject1).setSelected(true);
        ((com.tencent.mm.cache.c)CI()).b((com.tencent.mm.y.c)localObject1);
        this.ckg = p(paramMotionEvent);
        this.cki = ((int)Math.toDegrees(Math.atan2(q(paramMotionEvent)[0], q(paramMotionEvent)[1])));
        if ((localObject1 != null) && (((com.tencent.mm.y.c)localObject1).ejw))
        {
          this.ckj = ((com.tencent.mm.y.c)localObject1).mRotation;
          this.ckh = ((com.tencent.mm.y.c)localObject1).mScale;
        }
        bk(true);
        CP();
        break;
        this.ckk = true;
        break;
        if (this.ckk)
        {
          this.ckk = false;
          bool = true;
          AppMethodBeat.o(116189);
          break label69;
        }
        if ((!this.ckd) || (!s(paramMotionEvent)))
          break;
        if ((!this.cjF) && (this.ckm != null))
          this.ckm.onShow();
        localObject1 = new int[2];
        localObject1[0] = ((int)(paramMotionEvent.getX(0) - this.cjj.x));
        localObject1[1] = ((int)(paramMotionEvent.getY(0) - this.cjj.y));
        float f1 = 1.0F;
        int i = 0;
        if (paramMotionEvent.getPointerCount() > 1)
        {
          if (0.0F != this.ckg)
            f1 = p(paramMotionEvent) / this.ckg;
          i = this.cki - (int)Math.toDegrees(Math.atan2(q(paramMotionEvent)[0], q(paramMotionEvent)[1]));
        }
        while (true)
        {
          float f2 = localObject1[0];
          float f3 = localObject1[1];
          float f4 = this.ckh;
          int j = this.ckj;
          int k = paramMotionEvent.getPointerCount();
          localObject1 = ((com.tencent.mm.cache.c)CI()).Ji();
          Object localObject2;
          Object localObject3;
          if (localObject1 != null)
          {
            this.uS.reset();
            this.uS.postRotate(-getRotation());
            localObject2 = this.uS;
            localObject3 = new Matrix();
            ((Matrix)localObject2).invert((Matrix)localObject3);
            localObject2 = new float[2];
            localObject2[0] = f2;
            localObject2[1] = f3;
            ((Matrix)localObject3).mapPoints((float[])localObject2);
            if (k <= 1)
              break label880;
            ((com.tencent.mm.y.c)localObject1).b(0.0F, 0.0F, f1 * f4, (i + j) % 360);
            label771: ((com.tencent.mm.y.c)localObject1).Qg();
            localObject3 = ((com.tencent.mm.y.c)localObject1).eHi;
            localObject3 = B(((PointF)localObject3).x, ((PointF)localObject3).y);
            if (this.ckf.top > localObject3[1])
              break label910;
            if (this.ckm != null)
              this.ckm.ae((localObject3[1] - this.ckf.top) / this.ckf.height());
          }
          for (this.ckn = true; ; this.ckn = false)
          {
            if ((localObject1 instanceof com.tencent.mm.y.e))
              ((com.tencent.mm.y.c)localObject1).eHn = false;
            this.cjF = true;
            CP();
            break;
            label880: ((com.tencent.mm.y.c)localObject1).b(localObject2[0] / getScale(), localObject2[1] / getScale(), 0.0F, ((com.tencent.mm.y.c)localObject1).mRotation);
            break label771;
            label910: if ((this.ckm != null) && (this.ckn))
              this.ckm.Ta();
          }
          if (!isAlive())
          {
            ab.e("MicroMsg.EmojiAndTextArtist", "[ACTION_UP] is not alive!");
            bool = false;
            AppMethodBeat.o(116189);
            break label69;
          }
          if (CI() == null)
          {
            ab.e("MicroMsg.EmojiAndTextArtist", "[getCache] is null!");
            bool = false;
            AppMethodBeat.o(116189);
            break label69;
          }
          localObject1 = ((com.tencent.mm.cache.c)CI()).Ji();
          if (localObject1 != null)
          {
            if (!this.cje.contains((int)((com.tencent.mm.y.c)localObject1).eHi.x, (int)((com.tencent.mm.y.c)localObject1).eHi.y))
            {
              this.ckl.cco = true;
              localObject3 = this.ckl;
              ((com.tencent.mm.b.c)localObject3).ccq = ((com.tencent.mm.y.c)localObject1);
              ((com.tencent.mm.b.c)localObject3).ccf = (((com.tencent.mm.y.c)localObject1).eHk.x - ((com.tencent.mm.y.c)localObject1).eHi.x);
              ((com.tencent.mm.b.c)localObject3).ccg = (((com.tencent.mm.y.c)localObject1).eHk.y - ((com.tencent.mm.y.c)localObject1).eHi.y);
              ((com.tencent.mm.b.c)localObject3).ccr = ((com.tencent.mm.y.c)localObject1).eHf;
              localObject3 = this.ckl;
              if (((com.tencent.mm.b.b)localObject3).cco)
              {
                ((com.tencent.mm.b.c)localObject3).rD = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, ((com.tencent.mm.b.c)localObject3).ccg }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, ((com.tencent.mm.b.c)localObject3).ccf }) });
                ((com.tencent.mm.b.c)localObject3).rD.addUpdateListener(new c.1((com.tencent.mm.b.c)localObject3));
                ((com.tencent.mm.b.c)localObject3).rD.addListener(new c.2((com.tencent.mm.b.c)localObject3));
                ((com.tencent.mm.b.c)localObject3).rD.setInterpolator(new LinearInterpolator());
                ((com.tencent.mm.b.c)localObject3).rD.setDuration(100L);
                ((com.tencent.mm.b.c)localObject3).rD.start();
              }
            }
            if ((localObject1 instanceof com.tencent.mm.y.e))
            {
              localObject3 = (com.tencent.mm.y.e)localObject1;
              if ((!((com.tencent.mm.y.c)localObject3).ejw) || (!((com.tencent.mm.y.c)localObject3).eHn))
                break label1431;
              if (this.ckm != null)
                this.ckm.a((com.tencent.mm.y.e)localObject3);
            }
          }
          while (true)
          {
            localObject3 = ((com.tencent.mm.y.c)localObject1).eHi;
            localObject3 = B(((PointF)localObject3).x, ((PointF)localObject3).y);
            ab.i("MicroMsg.EmojiAndTextArtist", "mRubbishRect:%s pointF:%s", new Object[] { this.ckf, Float.valueOf(localObject3[1]) });
            if ((((com.tencent.mm.y.c)localObject1).ejw) && (this.ckf.top <= localObject3[1]) && (this.ckd) && (this.ckm != null))
            {
              ((com.tencent.mm.cache.c)CI()).Jh();
              CP();
            }
            CX();
            if ((this.cjF) && (this.ckm != null))
              this.ckm.onHide();
            this.cjF = false;
            break;
            label1431: if (((com.tencent.mm.y.c)localObject3).ejw)
              ((com.tencent.mm.y.c)localObject3).eHn = true;
          }
          f1 = 1.0F;
        }
      }
      bool = false;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(116190);
    super.onDestroy();
    CY();
    AppMethodBeat.o(116190);
  }

  public final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116188);
    a(paramCanvas);
    Object localObject = (com.tencent.mm.cache.c)CI();
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.cache.c)localObject).Ji();
      if ((localObject != null) && (((com.tencent.mm.y.c)localObject).ejw))
        ((com.tencent.mm.y.c)localObject).draw(paramCanvas);
    }
    AppMethodBeat.o(116188);
  }

  public final void zC()
  {
    AppMethodBeat.i(116187);
    super.zC();
    int i = (int)ah.getResources().getDimension(2131428611);
    this.ckf.set(0, getBoardRect().height() - i, getBoardRect().width(), getBoardRect().height());
    AppMethodBeat.o(116187);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.e
 * JD-Core Version:    0.6.2
 */