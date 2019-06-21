package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class WalletScratchShakeView$b extends View
{
  Paint aKf;
  private int hQr = 0;
  private Bitmap maskBitmap;
  long mfT;
  int nfE;
  com.tencent.mm.pluginsdk.i.d oOS;
  private boolean tND = false;
  private Canvas tOa;
  Drawable tOb;
  Paint tOc;
  Paint tOd;
  Path tOe;
  Path tOf;
  private float tOg;
  private float tOh;
  private int[] tOi;
  private int tOj = -1;
  boolean tOk;
  boolean tOl;
  float tOm;
  float tOn;
  int tOo;
  private boolean tOp;
  boolean tOq;
  private float tOr = 0.9F;

  public WalletScratchShakeView$b(WalletScratchShakeView paramWalletScratchShakeView, Context paramContext)
  {
    super(paramContext);
  }

  static byte[] ab(Bitmap paramBitmap)
  {
    int i = 0;
    AppMethodBeat.i(47928);
    int[] arrayOfInt1 = new int[4];
    arrayOfInt1[0] = 30;
    arrayOfInt1[1] = (paramBitmap.getWidth() / 3);
    arrayOfInt1[2] = (paramBitmap.getWidth() - paramBitmap.getWidth() / 3);
    arrayOfInt1[3] = (paramBitmap.getWidth() - 30);
    int[] arrayOfInt2 = new int[2];
    arrayOfInt2[0] = 0;
    arrayOfInt2[1] = paramBitmap.getHeight();
    paramBitmap = ByteBuffer.allocate(92).order(ByteOrder.nativeOrder());
    paramBitmap.put((byte)1);
    paramBitmap.put((byte)4);
    paramBitmap.put((byte)2);
    paramBitmap.put((byte)9);
    paramBitmap.putInt(0);
    paramBitmap.putInt(0);
    paramBitmap.putInt(0);
    paramBitmap.putInt(0);
    paramBitmap.putInt(0);
    paramBitmap.putInt(0);
    paramBitmap.putInt(0);
    paramBitmap.putInt(arrayOfInt1[0]);
    paramBitmap.putInt(arrayOfInt1[1]);
    paramBitmap.putInt(arrayOfInt1[2]);
    paramBitmap.putInt(arrayOfInt1[3]);
    paramBitmap.putInt(arrayOfInt2[0]);
    paramBitmap.putInt(arrayOfInt2[1]);
    while (i < 9)
    {
      paramBitmap.putInt(1);
      i++;
    }
    paramBitmap = paramBitmap.array();
    AppMethodBeat.o(47928);
    return paramBitmap;
  }

  private boolean cSE()
  {
    boolean bool = true;
    AppMethodBeat.i(47929);
    if (this.tOn >= getHeight())
    {
      this.tOq = true;
      if (!this.tOl)
      {
        if (WalletScratchShakeView.a(this.tOs) != null)
          WalletScratchShakeView.a(this.tOs).cSD();
        this.tOl = true;
      }
      if (this.tOa != null)
      {
        this.tOf.reset();
        this.tOf.moveTo(0.0F, 0.0F);
        this.tOf.lineTo(getWidth(), 0.0F);
        this.tOf.lineTo(getWidth(), getHeight());
        this.tOf.lineTo(0.0F, getHeight());
        this.tOa.drawPath(this.tOf, this.tOd);
      }
      invalidate();
      AppMethodBeat.o(47929);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(47929);
    }
  }

  private void cSF()
  {
    AppMethodBeat.i(47930);
    if (this.tOa != null)
    {
      this.tOf.reset();
      this.tOf.moveTo(0.0F, this.tOn);
      this.tOf.cubicTo(getWidth() / 2, getHeight(), getWidth() / 2, 0.0F, getWidth(), this.tOm);
      this.tOf.lineTo(getWidth(), 0.0F);
      this.tOf.lineTo(0.0F, 0.0F);
      this.tOa.drawPath(this.tOf, this.tOd);
    }
    invalidate();
    AppMethodBeat.o(47930);
  }

  public final boolean K(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(47933);
    if ((this.maskBitmap != null) && ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 0)))
    {
      int i = getWidth();
      int j = getHeight();
      int k = (int)paramMotionEvent.getX();
      int m = (int)paramMotionEvent.getY();
      int n = m * i + k;
      int i1 = getWidth();
      int i2 = getHeight();
      ab.d("MicroMsg.WalletScratchShakeView", "checkIsTouchEraseArea, x: %s, y: %s, width: %s, height: %s, index: %s, len: %s", new Object[] { Float.valueOf(paramMotionEvent.getX()), Float.valueOf(paramMotionEvent.getY()), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(n), Integer.valueOf(i1 * i2) });
      if ((n > 0) && (k > 0) && (m > 0) && (k < getWidth()) && (m < getHeight()))
        if (this.maskBitmap.getPixel(k, m) == 0)
          AppMethodBeat.o(47933);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(47933);
      bool = false;
      continue;
      AppMethodBeat.o(47933);
      bool = false;
    }
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(47931);
    paramCanvas.save();
    if (this.maskBitmap == null)
    {
      int i = getWidth();
      int j = getHeight();
      ab.i("MicroMsg.WalletScratchShakeView", "createMasker width: %s, height: %s, waterMark: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), this.tOb });
      this.maskBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      this.tOa = new Canvas(this.maskBitmap);
      if (this.tOb != null)
      {
        Rect localRect = new Rect(0, 0, i, j);
        this.tOb.setBounds(localRect);
        this.tOb.draw(this.tOa);
      }
      this.tOi = new int[i * j];
    }
    paramCanvas.drawBitmap(this.maskBitmap, 0.0F, 0.0F, this.aKf);
    paramCanvas.restore();
    AppMethodBeat.o(47931);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(47932);
    if (!WalletScratchShakeView.b(this.tOs))
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(47932);
    }
    while (true)
    {
      return bool;
      int i = paramMotionEvent.getAction();
      int j = 0;
      switch (i)
      {
      default:
      case 0:
      case 2:
      case 1:
      case 3:
      }
      while (true)
      {
        if ((this.tOq) || (K(paramMotionEvent)) || (j == 0))
          break label369;
        AppMethodBeat.o(47932);
        break;
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        this.tOe.reset();
        this.tOe.moveTo(f1, f2);
        this.tOg = f1;
        this.tOh = f2;
        invalidate();
        if (!this.tOk)
        {
          al.n(new WalletScratchShakeView.b.3(this), 50L);
          this.tOk = true;
          j = 1;
          continue;
          f2 = paramMotionEvent.getX();
          f1 = paramMotionEvent.getY();
          if (this.tOa != null)
          {
            i = (int)Math.abs(f2 - this.tOg);
            j = (int)Math.abs(f1 - this.tOh);
            if ((i >= this.nfE) || (j >= this.nfE))
            {
              this.tOg = f2;
              this.tOh = f1;
              this.tOe.quadTo((this.tOg + f2) / 2.0F, (this.tOh + f1) / 2.0F, f2, f1);
              this.tOa.drawPath(this.tOe, this.tOc);
              this.tOe.reset();
              this.tOe.moveTo(this.tOg, this.tOh);
            }
          }
          invalidate();
          j = 1;
          continue;
          this.tOg = 0.0F;
          this.tOh = 0.0F;
          this.tOe.reset();
          com.tencent.mm.sdk.g.d.post(new WalletScratchShakeView.b.4(this), "ScratchShakeView_calcErasePercentAndCallEnd");
          invalidate();
        }
        else
        {
          j = 1;
        }
      }
      label369: bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(47932);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView.b
 * JD-Core Version:    0.6.2
 */