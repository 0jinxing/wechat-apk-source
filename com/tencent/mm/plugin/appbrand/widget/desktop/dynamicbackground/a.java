package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class a
{
  private a.b iYV;
  private a.a iYW;

  a()
  {
    AppMethodBeat.i(133962);
    this.iYV = new a.b(this);
    this.iYW = new a.a(this);
    this.iYV.iZb = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };
    this.iYV.iZc = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };
    this.iYW.iYX.iZb = qo(11064532);
    this.iYW.iYX.iZc = qo(2770276);
    this.iYW.iYY.iZb = qo(8553090);
    this.iYW.iYY.iZc = qo(0);
    this.iYW.iYZ.iZb = qo(5260629);
    this.iYW.iYZ.iZc = qo(0);
    AppMethodBeat.o(133962);
  }

  private static void a(float[] paramArrayOfFloat, a.b paramb1, a.b paramb2, int paramInt, float paramFloat)
  {
    AppMethodBeat.i(133964);
    if (paramInt == 0)
    {
      a(paramArrayOfFloat, paramb1.iZb, paramb2.iZb, paramFloat);
      AppMethodBeat.o(133964);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
        a(paramArrayOfFloat, paramb1.iZc, paramb2.iZc, paramFloat);
      AppMethodBeat.o(133964);
    }
  }

  private static void a(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, float paramFloat)
  {
    paramArrayOfFloat1[0] = (paramArrayOfFloat3[0] * paramFloat + paramArrayOfFloat2[0] * (1.0F - paramFloat));
    paramArrayOfFloat1[1] = (paramArrayOfFloat3[1] * paramFloat + paramArrayOfFloat2[1] * (1.0F - paramFloat));
    paramArrayOfFloat1[2] = (paramArrayOfFloat3[2] * paramFloat + paramArrayOfFloat2[2] * (1.0F - paramFloat));
    paramArrayOfFloat1[3] = (paramArrayOfFloat3[3] * paramFloat + paramArrayOfFloat2[3] * (1.0F - paramFloat));
  }

  public static int i(float[] paramArrayOfFloat)
  {
    int i = (int)(paramArrayOfFloat[0] * 255.0F);
    int j = (int)(paramArrayOfFloat[1] * 255.0F);
    int k = (int)(paramArrayOfFloat[2] * 255.0F);
    return ((i & 0xFF) << 16) + (((int)(paramArrayOfFloat[3] * 255.0F) & 0xFF) << 24) + ((j & 0xFF) << 8) + (k & 0xFF);
  }

  private static float[] qo(int paramInt)
  {
    return new float[] { ((0xFF0000 & paramInt) >> 16) / 255.0F, ((0xFF00 & paramInt) >> 8) / 255.0F, ((paramInt & 0xFF) >> 0) / 255.0F, 1.0F };
  }

  public final a.b aPx()
  {
    return this.iYV;
  }

  public final void aPy()
  {
    AppMethodBeat.i(133963);
    long l = System.currentTimeMillis() / 1000L;
    Object localObject = new GregorianCalendar();
    int i = ((Calendar)localObject).get(11);
    int j = ((Calendar)localObject).get(12);
    float f1 = (float)(l - (l - (((Calendar)localObject).get(13) + (i * 60 * 60 + j * 60)) + 36000L));
    float f2 = f1;
    if (f1 < 0.0F)
      f2 = f1 + 86400.0F;
    f2 = f2 * 1.0F / 28800.0F;
    a.b localb;
    if (f2 > 2.0F)
    {
      f2 -= 2.0F;
      localb = this.iYW.iYZ;
      localObject = this.iYW.iYX;
    }
    while (true)
    {
      a(this.iYV.iZb, localb, (a.b)localObject, 0, f2);
      a(this.iYV.iZc, localb, (a.b)localObject, 1, f2);
      AppMethodBeat.o(133963);
      return;
      if (f2 > 1.0F)
      {
        f2 -= 1.0F;
        localb = this.iYW.iYY;
        localObject = this.iYW.iYZ;
      }
      else
      {
        localb = this.iYW.iYX;
        localObject = this.iYW.iYY;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.a
 * JD-Core Version:    0.6.2
 */