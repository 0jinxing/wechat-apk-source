package android.support.v7.d;

import android.graphics.Color;
import android.support.v4.a.b;
import java.util.Arrays;

public final class b$c
{
  private final int XO;
  private final int XP;
  private final int XQ;
  public final int XR;
  private boolean XS;
  private int XT;
  private int XU;
  private float[] XV;
  public final int Xw;

  public b$c(int paramInt1, int paramInt2)
  {
    this.XO = Color.red(paramInt1);
    this.XP = Color.green(paramInt1);
    this.XQ = Color.blue(paramInt1);
    this.XR = paramInt1;
    this.Xw = paramInt2;
  }

  private void fT()
  {
    int i;
    int j;
    if (!this.XS)
    {
      i = b.d(-1, this.XR, 4.5F);
      j = b.d(-1, this.XR, 3.0F);
      if ((i == -1) || (j == -1))
        break label63;
      this.XU = b.u(-1, i);
      this.XT = b.u(-1, j);
    }
    label63: int m;
    for (this.XS = true; ; this.XS = true)
    {
      return;
      k = b.d(-16777216, this.XR, 4.5F);
      m = b.d(-16777216, this.XR, 3.0F);
      if ((k == -1) || (m == -1))
        break;
      this.XU = b.u(-16777216, k);
      this.XT = b.u(-16777216, m);
    }
    if (i != -1)
    {
      k = b.u(-1, i);
      label139: this.XU = k;
      if (j == -1)
        break label178;
    }
    label178: for (int k = b.u(-1, j); ; k = b.u(-16777216, m))
    {
      this.XT = k;
      this.XS = true;
      break;
      k = b.u(-16777216, k);
      break label139;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        bool = false;
      }
      else
      {
        paramObject = (c)paramObject;
        if ((this.Xw != paramObject.Xw) || (this.XR != paramObject.XR))
          bool = false;
      }
    }
  }

  public final float[] fR()
  {
    if (this.XV == null)
      this.XV = new float[3];
    b.a(this.XO, this.XP, this.XQ, this.XV);
    return this.XV;
  }

  public final int fS()
  {
    fT();
    return this.XU;
  }

  public final int hashCode()
  {
    return this.XR * 31 + this.Xw;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(getClass().getSimpleName()).append(" [RGB: #").append(Integer.toHexString(this.XR)).append(']').append(" [HSL: ").append(Arrays.toString(fR())).append(']').append(" [Population: ").append(this.Xw).append(']').append(" [Title Text: #");
    fT();
    return Integer.toHexString(this.XT) + ']' + " [Body Text: #" + Integer.toHexString(fS()) + ']';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.d.b.c
 * JD-Core Version:    0.6.2
 */