package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public class i extends BitmapDrawable
  implements d.a
{
  protected static final ak feP;
  private Paint aFY;
  private Path eAv;
  protected final Paint feO;
  private Runnable feR;
  protected boolean oxB;
  protected final i.a pqK;
  private Rect rect;
  protected String tag;
  protected boolean vhI;
  private int vhJ;
  private int vhK;
  protected boolean vhL;
  protected boolean vhM;
  protected float vhN;
  private PaintFlagsDrawFilter vhO;

  static
  {
    AppMethodBeat.i(79699);
    feP = new ak(Looper.getMainLooper());
    AppMethodBeat.o(79699);
  }

  public i(i.a parama, String paramString)
  {
    super(parama.AZ());
    AppMethodBeat.i(79692);
    this.feO = new Paint();
    this.oxB = false;
    this.vhI = false;
    this.vhJ = 0;
    this.vhK = 0;
    this.vhN = 1.0F;
    this.rect = new Rect();
    this.vhO = new PaintFlagsDrawFilter(0, 3);
    this.aFY = new Paint();
    this.aFY.setStyle(Paint.Style.STROKE);
    this.aFY.setFlags(1);
    this.aFY.setAntiAlias(true);
    this.eAv = new Path();
    this.feR = new i.1(this);
    this.feO.setAntiAlias(true);
    this.feO.setFilterBitmap(true);
    this.pqK = parama;
    this.tag = paramString;
    this.pqK.a(this);
    AppMethodBeat.o(79692);
  }

  public i(i.a parama, String paramString, byte paramByte)
  {
    super(parama.AZ());
    AppMethodBeat.i(79693);
    this.feO = new Paint();
    this.oxB = false;
    this.vhI = false;
    this.vhJ = 0;
    this.vhK = 0;
    this.vhN = 1.0F;
    this.rect = new Rect();
    this.vhO = new PaintFlagsDrawFilter(0, 3);
    this.aFY = new Paint();
    this.aFY.setStyle(Paint.Style.STROKE);
    this.aFY.setFlags(1);
    this.aFY.setAntiAlias(true);
    this.eAv = new Path();
    this.feR = new i.1(this);
    this.feO.setAntiAlias(true);
    this.feO.setFilterBitmap(true);
    this.oxB = false;
    this.pqK = parama;
    this.tag = paramString;
    this.pqK.a(this);
    AppMethodBeat.o(79693);
  }

  public final void diX()
  {
    this.vhL = true;
  }

  public final void diY()
  {
    AppMethodBeat.i(79697);
    if (!this.vhL)
      AppMethodBeat.o(79697);
    while (true)
    {
      return;
      this.vhL = false;
      if (this.vhM)
      {
        this.vhM = false;
        invalidateSelf();
      }
      AppMethodBeat.o(79697);
    }
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(79695);
    Bitmap localBitmap;
    if (this.vhI)
    {
      localBitmap = this.pqK.b(this.tag, paramCanvas.getWidth(), paramCanvas.getHeight(), 1);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
        break label208;
      localBitmap = this.pqK.AZ();
      if (!this.vhL)
        break label200;
      this.vhM = true;
    }
    while (true)
    {
      Rect localRect1 = getBounds();
      Rect localRect2 = null;
      if ((this.vhN > 1.0F) || (this.oxB))
      {
        int i = localBitmap.getHeight() / 15 / 2;
        int j = localBitmap.getWidth() / 15 / 2;
        localRect2 = new Rect(j, i, localBitmap.getWidth() - j, localBitmap.getHeight() - i);
      }
      paramCanvas.drawBitmap(localBitmap, localRect2, localRect1, this.feO);
      AppMethodBeat.o(79695);
      return;
      if (this.vhL)
      {
        localBitmap = this.pqK.cR(this.tag);
        break;
      }
      localBitmap = this.pqK.cQ(this.tag);
      break;
      label200: this.vhM = false;
      continue;
      label208: this.vhM = false;
    }
  }

  public void onScrollStateChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(79698);
    if (paramBoolean)
    {
      this.vhL = true;
      AppMethodBeat.o(79698);
    }
    while (true)
    {
      return;
      diY();
      AppMethodBeat.o(79698);
    }
  }

  public final void ox(boolean paramBoolean)
  {
    this.vhI = paramBoolean;
  }

  public void qj(String paramString)
  {
    AppMethodBeat.i(79696);
    if ((paramString == null) || (!paramString.equals(this.tag)))
      AppMethodBeat.o(79696);
    while (true)
    {
      return;
      ab.v("MicroMsg.SDK.LazyBitmapDrawable", "notifyChanged :%s", new Object[] { paramString });
      feP.post(this.feR);
      AppMethodBeat.o(79696);
    }
  }

  public final void setTag(String paramString)
  {
    AppMethodBeat.i(79694);
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(79694);
    while (true)
    {
      return;
      if (!paramString.equals(this.tag))
      {
        this.tag = paramString;
        feP.post(this.feR);
      }
      AppMethodBeat.o(79694);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.i
 * JD-Core Version:    0.6.2
 */