package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.f;
import com.tencent.mm.ui.e.b.c;
import java.util.Timer;

public class CropImageView extends ImageView
{
  int cDW;
  private View.OnTouchListener mNa;
  Bitmap mQQ;
  private long nOa;
  private float neG;
  private float neH;
  private Timer oGr;
  float riF;
  float riG;
  private boolean rst;
  private float translateX;
  private float translateY;
  private boolean yzp;
  private Drawable yzq;
  private CropImageView.b zBA;
  ak zBB;
  private CropImageView.a zBC;
  private boolean zBD;
  private boolean zBi;
  private boolean zBj;
  private float zBk;
  private float zBl;
  private PointF zBm;
  boolean zBn;
  private boolean zBo;
  private boolean zBp;
  private boolean zBq;
  private boolean zBr;
  private boolean zBs;
  private boolean zBt;
  private boolean zBu;
  private float zBv;
  private CropImageView.c zBw;
  private boolean zBx;
  Timer zBy;
  ak zBz;

  public CropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107606);
    this.zBi = true;
    this.zBj = false;
    this.zBm = new PointF();
    this.riF = 0.0F;
    this.riG = 0.0F;
    this.zBn = false;
    this.zBo = false;
    this.zBp = false;
    this.zBq = false;
    this.zBr = false;
    this.zBs = false;
    this.zBt = false;
    this.zBu = false;
    this.zBv = 1.0F;
    this.translateX = 0.0F;
    this.translateY = 0.0F;
    this.oGr = new Timer(true);
    this.zBw = null;
    this.zBx = false;
    this.rst = false;
    this.zBz = new CropImageView.1(this);
    this.zBA = null;
    this.zBB = new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(107601);
        if (paramAnonymousMessage.what == 4653)
          if ((CropImageView.a(CropImageView.this) != null) && (CropImageView.m(CropImageView.this) != null))
          {
            CropImageView.m(CropImageView.this).cancel();
            CropImageView.n(CropImageView.this);
          }
        while (true)
        {
          super.handleMessage(paramAnonymousMessage);
          AppMethodBeat.o(107601);
          return;
          CropImageView.o(CropImageView.this);
        }
      }
    };
    this.cDW = 0;
    this.zBD = true;
    this.mNa = new CropImageView.3(this);
    this.yzp = false;
    dJJ();
    AppMethodBeat.o(107606);
  }

  private void ctq()
  {
    AppMethodBeat.i(107610);
    float[] arrayOfFloat1 = new float[2];
    float[] arrayOfFloat2 = new float[2];
    float f = this.zBm.x;
    arrayOfFloat2[0] = f;
    arrayOfFloat1[0] = f;
    f = this.zBm.y;
    arrayOfFloat2[1] = f;
    arrayOfFloat1[1] = f;
    getImageMatrix().mapPoints(arrayOfFloat1);
    getImageMatrix().postScale(1.0666F, 1.0666F);
    getImageMatrix().mapPoints(arrayOfFloat2);
    getImageMatrix().postTranslate((arrayOfFloat1[0] - arrayOfFloat2[0]) / 2.0F, (arrayOfFloat1[1] - arrayOfFloat2[1]) / 2.0F);
    setImageBitmap(this.mQQ);
    invalidate();
    AppMethodBeat.o(107610);
  }

  private void ctr()
  {
    AppMethodBeat.i(107612);
    float[] arrayOfFloat1 = new float[2];
    float[] arrayOfFloat2 = new float[2];
    float f = this.zBm.x;
    arrayOfFloat2[0] = f;
    arrayOfFloat1[0] = f;
    f = this.zBm.y;
    arrayOfFloat2[1] = f;
    arrayOfFloat1[1] = f;
    getImageMatrix().mapPoints(arrayOfFloat1);
    getImageMatrix().postScale(0.9375F, 0.9375F);
    getImageMatrix().mapPoints(arrayOfFloat2);
    getImageMatrix().postTranslate((arrayOfFloat1[0] - arrayOfFloat2[0]) / 2.0F, (arrayOfFloat1[1] - arrayOfFloat2[1]) / 2.0F);
    setImageBitmap(this.mQQ);
    invalidate();
    AppMethodBeat.o(107612);
  }

  public final void dJJ()
  {
    AppMethodBeat.i(107608);
    setOnTouchListener(this.mNa);
    AppMethodBeat.o(107608);
  }

  public Bitmap getBmp()
  {
    return this.mQQ;
  }

  public int getGifHeight()
  {
    AppMethodBeat.i(107615);
    int i;
    if ((this.yzp) && (this.yzq != null))
    {
      i = this.yzq.getIntrinsicHeight();
      AppMethodBeat.o(107615);
    }
    while (true)
    {
      return i;
      i = getHeight();
      AppMethodBeat.o(107615);
    }
  }

  public int getGifWidth()
  {
    AppMethodBeat.i(107614);
    int i;
    if ((this.yzp) && (this.yzq != null))
    {
      i = this.yzq.getIntrinsicWidth();
      AppMethodBeat.o(107614);
    }
    while (true)
    {
      return i;
      i = getWidth();
      AppMethodBeat.o(107614);
    }
  }

  public int getRotateCount()
  {
    return this.cDW;
  }

  public void setEnableOprate(boolean paramBoolean)
  {
    this.zBD = paramBoolean;
  }

  public void setGifPath(String paramString)
  {
    AppMethodBeat.i(107613);
    try
    {
      this.yzp = true;
      this.yzq = c.io(paramString, paramString);
      setImageDrawable(this.yzq);
      AppMethodBeat.o(107613);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        this.yzp = false;
        AppMethodBeat.o(107613);
      }
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(107607);
    this.yzp = false;
    this.mQQ = paramBitmap;
    f.a(this.zBm, paramBitmap);
    super.setImageBitmap(paramBitmap);
    AppMethodBeat.o(107607);
  }

  public void setLimitZoomIn(boolean paramBoolean)
  {
    this.zBi = paramBoolean;
  }

  public void setOnShortClick(CropImageView.a parama)
  {
    this.zBC = parama;
  }

  public final void zoomIn()
  {
    AppMethodBeat.i(107609);
    this.zBv *= 1.0666F;
    if (1.0F <= this.zBv)
      this.zBq = false;
    if (1.6F < this.zBv)
    {
      this.zBp = true;
      if ((!this.zBi) || (4.0F >= this.zBv))
        break label87;
      this.zBv = 4.0F;
      AppMethodBeat.o(107609);
    }
    while (true)
    {
      return;
      this.zBp = false;
      break;
      label87: ctq();
      AppMethodBeat.o(107609);
    }
  }

  public final void zoomOut()
  {
    AppMethodBeat.i(107611);
    this.zBv *= 0.9375F;
    if (1.6F > this.zBv)
      this.zBp = false;
    if (1.0F > this.zBv)
    {
      this.zBq = true;
      if (0.4F <= this.zBv)
        break label80;
      this.zBv = 0.4F;
      AppMethodBeat.o(107611);
    }
    while (true)
    {
      return;
      this.zBq = false;
      break;
      label80: ctr();
      AppMethodBeat.o(107611);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageView
 * JD-Core Version:    0.6.2
 */