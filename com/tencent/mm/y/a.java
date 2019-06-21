package com.tencent.mm.y;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
  implements Cloneable
{
  private static int eGR;
  private static int eGS;
  public static float eGT;
  public static float eGU;
  public static Path eGV;
  public static Path eGW;
  public static Paint eGX;
  public static Paint eGY;
  public static Paint eGZ;
  public static Paint eHa;
  public static Paint eHb;
  public static Rect oT;
  public Rect cch;
  public Rect eHc;
  public Rect eHd;
  public Matrix mMatrix;

  static
  {
    AppMethodBeat.i(116269);
    eGR = (int)ah.getResources().getDimension(2131428143);
    eGS = (int)ah.getResources().getDimension(2131428142);
    eGT = ah.getResources().getDimension(2131428255);
    eGU = ah.getResources().getDimension(2131428254);
    eGV = new Path();
    eGW = new Path();
    eGX = new Paint();
    eGY = new Paint();
    eGZ = new Paint();
    eHa = new Paint();
    eHb = new Paint();
    oT = new Rect();
    eGZ.setColor(-16777216);
    eGX.setColor(-1);
    eGX.setStrokeWidth(eGR);
    eGX.setStyle(Paint.Style.STROKE);
    eGX.setAntiAlias(true);
    eHa.set(eGX);
    eHa.setStrokeWidth(eGS);
    eHb.set(eGX);
    eHb.setStrokeWidth(eGT);
    eGY.set(eGX);
    eGY.setStrokeWidth(eGR * 7);
    eGY.setColor(549174203);
    AppMethodBeat.o(116269);
  }

  public a()
  {
    AppMethodBeat.i(116265);
    this.eHc = new Rect();
    this.eHd = new Rect();
    this.mMatrix = new Matrix();
    AppMethodBeat.o(116265);
  }

  public a(Rect paramRect)
  {
    AppMethodBeat.i(116264);
    this.eHc = new Rect();
    this.eHd = new Rect();
    this.mMatrix = new Matrix();
    this.cch = paramRect;
    AppMethodBeat.o(116264);
  }

  public static void jA(int paramInt)
  {
    AppMethodBeat.i(116267);
    eGZ.setAlpha((int)(0.9019608F * paramInt));
    AppMethodBeat.o(116267);
  }

  public static void jz(int paramInt)
  {
    AppMethodBeat.i(116266);
    eHb.setAlpha(paramInt);
    eGX.setAlpha(paramInt);
    eHa.setAlpha((int)(0.7058824F * paramInt));
    AppMethodBeat.o(116266);
  }

  public final Object clone()
  {
    AppMethodBeat.i(116268);
    Object localObject = super.clone();
    AppMethodBeat.o(116268);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.a
 * JD-Core Version:    0.6.2
 */