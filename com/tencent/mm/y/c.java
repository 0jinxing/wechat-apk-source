package com.tencent.mm.y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.util.ArrayList;
import java.util.List;

public class c
  implements Cloneable
{
  private Rect eHc;
  public String eHf;
  public k eHg;
  public Bitmap eHh;
  public PointF eHi;
  private float eHj;
  public PointF eHk;
  private float eHl;
  private float eHm;
  public boolean eHn;
  List<PointF> eHo;
  private float eHp;
  private float eHq;
  public boolean ejw;
  protected Context mContext;
  private Matrix mMatrix;
  public int mRotation;
  public float mScale;

  public c(Context paramContext, Matrix paramMatrix, String paramString, Rect paramRect)
  {
    AppMethodBeat.i(116275);
    this.mRotation = 0;
    this.mScale = 1.0F;
    this.eHj = 1.0F;
    this.eHn = false;
    this.eHo = new ArrayList();
    this.eHf = paramString;
    this.mMatrix = paramMatrix;
    this.mContext = paramContext;
    this.eHc = paramRect;
    this.eHi = new PointF();
    this.eHk = new PointF();
    AppMethodBeat.o(116275);
  }

  public c(Context paramContext, Matrix paramMatrix, String paramString, k paramk, Rect paramRect)
  {
    AppMethodBeat.i(116274);
    this.mRotation = 0;
    this.mScale = 1.0F;
    this.eHj = 1.0F;
    this.eHn = false;
    this.eHo = new ArrayList();
    this.eHf = paramString;
    this.mMatrix = paramMatrix;
    this.eHg = paramk;
    this.mContext = paramContext;
    this.eHc = paramRect;
    this.eHi = new PointF();
    this.eHk = new PointF();
    AppMethodBeat.o(116274);
  }

  private int Qd()
  {
    AppMethodBeat.i(116282);
    int i;
    if (this.eHh != null)
    {
      i = this.eHh.getWidth();
      AppMethodBeat.o(116282);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(116282);
    }
  }

  private int Qe()
  {
    AppMethodBeat.i(116283);
    int i;
    if (this.eHh != null)
    {
      i = this.eHh.getHeight();
      AppMethodBeat.o(116283);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(116283);
    }
  }

  private PointF ac(float paramFloat)
  {
    AppMethodBeat.i(116287);
    float f = this.mScale / this.eHj / 2.0F;
    double d1 = Qd() * 1.0F / 2.0F * f;
    double d2 = f * (Qe() * 1.0F / 2.0F);
    this.eHq = ((float)Math.sqrt(d2 * d2 + d1 * d1));
    PointF localPointF = new PointF();
    d1 = (this.mRotation + paramFloat) * 3.141592653589793D / 180.0D;
    localPointF.x = (this.eHi.x + (float)(this.eHq * Math.cos(d1)));
    paramFloat = this.eHi.y;
    d2 = this.eHq;
    localPointF.y = (paramFloat + (float)(Math.sin(d1) * d2));
    AppMethodBeat.o(116287);
    return localPointF;
  }

  private Bitmap q(Bitmap paramBitmap)
  {
    AppMethodBeat.i(116285);
    int i = (int)(paramBitmap.getWidth() + 80.0F);
    int j = (int)(paramBitmap.getHeight() + 80.0F);
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawBitmap(paramBitmap, 40.0F, 40.0F, null);
    paramBitmap = BitmapFactory.decodeResource(this.mContext.getResources(), 2130838546).getNinePatchChunk();
    paramBitmap = new NinePatchDrawable(this.mContext.getResources(), BitmapFactory.decodeResource(this.mContext.getResources(), 2130838546), paramBitmap, new Rect(), null);
    paramBitmap.setBounds(0, 0, i, j);
    paramBitmap.draw(localCanvas);
    AppMethodBeat.o(116285);
    return localBitmap;
  }

  public final boolean D(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(116278);
    this.eHo.clear();
    this.eHo.add(ac(this.eHp - 180.0F));
    this.eHo.add(ac(-this.eHp));
    this.eHo.add(ac(this.eHp));
    this.eHo.add(ac(-this.eHp + 180.0F));
    c.a locala = new c.a(this, this.eHo);
    int i = locala.eHt - 1;
    int j = 0;
    boolean bool1 = false;
    if (j < locala.eHt)
    {
      if ((locala.eHs[j] >= paramFloat2) || (locala.eHs[i] < paramFloat2))
      {
        bool2 = bool1;
        if (locala.eHs[i] < paramFloat2)
        {
          bool2 = bool1;
          if (locala.eHs[j] < paramFloat2);
        }
      }
      else
      {
        float f1 = locala.eHr[j];
        float f2 = (paramFloat2 - locala.eHs[j]) / (locala.eHs[i] - locala.eHs[j]);
        bool2 = bool1;
        if ((locala.eHr[i] - locala.eHr[j]) * f2 + f1 < paramFloat1)
          if (bool1)
            break label274;
      }
      label274: for (boolean bool2 = true; ; bool2 = false)
      {
        i = j;
        j++;
        bool1 = bool2;
        break;
      }
    }
    AppMethodBeat.o(116278);
    return bool1;
  }

  public final boolean Qc()
  {
    AppMethodBeat.i(116277);
    ab.d("MicroMsg.EmojiItem", "[checkBitmap]");
    boolean bool;
    if ((this.eHh == null) || (this.eHh.isRecycled()))
    {
      this.eHh = q(Qf());
      bool = true;
      AppMethodBeat.o(116277);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(116277);
    }
  }

  protected Bitmap Qf()
  {
    AppMethodBeat.i(116284);
    if ((this.eHh == null) || (this.eHh.isRecycled()))
      this.eHh = this.eHg.w(this.mContext, 480);
    if (this.eHh == null)
    {
      ab.e("MicroMsg.EmojiItem", "[getEmojiBitmap] NULL!");
      new d();
      this.eHh = d.createBitmap(120, 120, Bitmap.Config.ARGB_4444);
      new Canvas(this.eHh).drawColor(-7829368);
    }
    Bitmap localBitmap = this.eHh;
    AppMethodBeat.o(116284);
    return localBitmap;
  }

  public final void Qg()
  {
    AppMethodBeat.i(116286);
    float f = this.eHj;
    double d1 = Qd() * 1.0F / 2.0F * f;
    double d2 = f * (Qe() * 1.0F / 2.0F);
    this.eHq = ((float)Math.sqrt(d1 * d1 + d2 * d2));
    this.eHp = ((float)Math.toDegrees(Math.atan(d2 / d1)));
    AppMethodBeat.o(116286);
  }

  // ERROR //
  public final c Qh()
  {
    // Byte code:
    //   0: ldc_w 277
    //   3: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokespecial 281	java/lang/Object:clone	()Ljava/lang/Object;
    //   10: checkcast 2	com/tencent/mm/y/c
    //   13: astore_1
    //   14: new 73	android/graphics/PointF
    //   17: astore_2
    //   18: aload_2
    //   19: aload_0
    //   20: getfield 76	com/tencent/mm/y/c:eHi	Landroid/graphics/PointF;
    //   23: getfield 123	android/graphics/PointF:x	F
    //   26: aload_0
    //   27: getfield 76	com/tencent/mm/y/c:eHi	Landroid/graphics/PointF;
    //   30: getfield 129	android/graphics/PointF:y	F
    //   33: invokespecial 284	android/graphics/PointF:<init>	(FF)V
    //   36: aload_1
    //   37: aload_2
    //   38: putfield 76	com/tencent/mm/y/c:eHi	Landroid/graphics/PointF;
    //   41: aload_1
    //   42: aload_0
    //   43: getfield 86	com/tencent/mm/y/c:eHg	Lcom/tencent/mm/api/k;
    //   46: putfield 86	com/tencent/mm/y/c:eHg	Lcom/tencent/mm/api/k;
    //   49: ldc_w 277
    //   52: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   55: aload_1
    //   56: areturn
    //   57: astore_2
    //   58: aconst_null
    //   59: astore_1
    //   60: ldc 224
    //   62: aload_2
    //   63: ldc_w 286
    //   66: iconst_0
    //   67: anewarray 4	java/lang/Object
    //   70: invokestatic 290	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: goto -24 -> 49
    //   76: astore_2
    //   77: goto -17 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   6	14	57	java/lang/CloneNotSupportedException
    //   14	49	76	java/lang/CloneNotSupportedException
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    AppMethodBeat.i(116276);
    this.eHh = q(Qf());
    this.eHl = (1.2F * this.eHc.width() / this.eHh.getWidth());
    this.eHm = (0.1F * this.eHc.width() / this.eHh.getWidth());
    this.eHj = paramFloat3;
    this.mRotation = paramInt;
    this.mScale *= paramFloat3;
    ab.i("MicroMsg.EmojiItem", "MAX_SCALE:%s MIN_SCALE:%s mInitScale:%s", new Object[] { Float.valueOf(this.eHl), Float.valueOf(this.eHm), Float.valueOf(this.eHj) });
    this.eHi.set(paramFloat1, paramFloat2);
    ab.d("MicroMsg.EmojiItem", "[setPoint] point:%s", new Object[] { this.eHi });
    Qg();
    AppMethodBeat.o(116276);
  }

  public final void b(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    AppMethodBeat.i(116279);
    this.eHi.offset(paramFloat1, paramFloat2);
    if (0.0F != paramFloat3)
      this.mScale = paramFloat3;
    this.mRotation = paramInt;
    AppMethodBeat.o(116279);
  }

  public final void clear()
  {
    AppMethodBeat.i(116280);
    ab.i("MicroMsg.EmojiItem", "[clear]");
    if ((this.eHh != null) && (!this.eHh.isRecycled()))
    {
      ab.i("MicroMsg.EmojiItem", "bitmap recycle %s", new Object[] { this.eHh.toString() });
      this.eHh.recycle();
      this.eHh = null;
    }
    AppMethodBeat.o(116280);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116281);
    if ((this.eHh == null) || (this.eHh.isRecycled()))
    {
      ab.w("MicroMsg.EmojiItem", "[draw] null == bitmap || bitmap isRecycled");
      AppMethodBeat.o(116281);
      return;
    }
    paramCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
    if (this.eHl < this.mScale * this.eHj)
    {
      this.mScale = (this.eHl / this.eHj);
      label81: paramCanvas.save();
      paramCanvas.translate(this.eHi.x, this.eHi.y);
      paramCanvas.rotate(this.mRotation);
      paramCanvas.scale(this.mScale, this.mScale);
      if (!this.ejw)
        break label208;
      paramCanvas.drawBitmap(this.eHh, -Qd() / 2, -Qe() / 2, null);
    }
    while (true)
    {
      paramCanvas.restore();
      paramCanvas.setDrawFilter(null);
      AppMethodBeat.o(116281);
      break;
      if (this.eHm <= this.mScale * this.eHj)
        break label81;
      this.mScale = (this.eHm / this.eHj);
      break label81;
      label208: paramCanvas.clipRect(-Qd() / 2 + 40.0F, -Qe() / 2 + 40.0F, this.eHh.getWidth() / 2 - 40.0F, this.eHh.getHeight() / 2 - 40.0F);
      paramCanvas.drawBitmap(this.eHh, -Qd() / 2, -Qe() / 2, null);
    }
  }

  public void setSelected(boolean paramBoolean)
  {
    this.ejw = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.c
 * JD-Core Version:    0.6.2
 */