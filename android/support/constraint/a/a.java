package android.support.constraint.a;

import java.util.Arrays;

public final class a
{
  int[] fA = new int[this.fx];
  float[] fB = new float[this.fx];
  int fC = -1;
  private int fD = -1;
  private boolean fE = false;
  int fu = 0;
  final b fv;
  final c fw;
  private int fx = 8;
  private h fy = null;
  int[] fz = new int[this.fx];

  a(b paramb, c paramc)
  {
    this.fv = paramb;
    this.fw = paramc;
  }

  static boolean a(h paramh)
  {
    boolean bool = true;
    if (paramh.gV <= 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final float a(h paramh, boolean paramBoolean)
  {
    float f1 = 0.0F;
    if (this.fy == paramh)
      this.fy = null;
    float f2;
    if (this.fC == -1)
    {
      f2 = f1;
      return f2;
    }
    int i = this.fC;
    int j = 0;
    int k = -1;
    while (true)
    {
      f2 = f1;
      if (i == -1)
        break;
      f2 = f1;
      if (j >= this.fu)
        break;
      if (this.fz[i] == paramh.id)
      {
        if (i == this.fC)
          this.fC = this.fA[i];
        while (true)
        {
          if (paramBoolean)
            paramh.e(this.fv);
          paramh.gV -= 1;
          this.fu -= 1;
          this.fz[i] = -1;
          if (this.fE)
            this.fD = i;
          f2 = this.fB[i];
          break;
          int[] arrayOfInt = this.fA;
          arrayOfInt[k] = arrayOfInt[i];
        }
      }
      int m = this.fA[i];
      j++;
      k = i;
      i = m;
    }
  }

  final h a(boolean[] paramArrayOfBoolean, h paramh)
  {
    int i = this.fC;
    Object localObject1 = null;
    float f1 = 0.0F;
    int j = 0;
    while ((i != -1) && (j < this.fu))
    {
      float f2 = f1;
      Object localObject2 = localObject1;
      if (this.fB[i] < 0.0F)
      {
        h localh = this.fw.fM[this.fz[i]];
        if (paramArrayOfBoolean != null)
        {
          f2 = f1;
          localObject2 = localObject1;
          if (paramArrayOfBoolean[localh.id] != 0);
        }
        else
        {
          f2 = f1;
          localObject2 = localObject1;
          if (localh != paramh)
            if (localh.gS != h.a.gY)
            {
              f2 = f1;
              localObject2 = localObject1;
              if (localh.gS != h.a.gZ);
            }
            else
            {
              float f3 = this.fB[i];
              f2 = f1;
              localObject2 = localObject1;
              if (f3 < f1)
              {
                f2 = f3;
                localObject2 = localh;
              }
            }
        }
      }
      i = this.fA[i];
      j++;
      f1 = f2;
      localObject1 = localObject2;
    }
    return localObject1;
  }

  final void a(b paramb1, b paramb2)
  {
    int i = this.fC;
    int j = 0;
    while ((i != -1) && (j < this.fu))
      if (this.fz[i] == paramb2.fF.id)
      {
        float f = this.fB[i];
        a(paramb2.fF, false);
        a locala = (a)paramb2.fI;
        i = locala.fC;
        for (j = 0; (i != -1) && (j < locala.fu); j++)
        {
          a(this.fw.fM[locala.fz[i]], locala.fB[i] * f, false);
          i = locala.fA[i];
        }
        paramb1.fG += paramb2.fG * f;
        i = this.fC;
        j = 0;
      }
      else
      {
        i = this.fA[i];
        j++;
      }
  }

  final void a(b paramb, b[] paramArrayOfb)
  {
    int i = this.fC;
    int j = 0;
    while ((i != -1) && (j < this.fu))
    {
      Object localObject = this.fw.fM[this.fz[i]];
      if (((h)localObject).gO != -1)
      {
        float f = this.fB[i];
        a((h)localObject, true);
        localObject = paramArrayOfb[localObject.gO];
        if (!((b)localObject).fJ)
        {
          a locala = (a)((b)localObject).fI;
          i = locala.fC;
          for (j = 0; (i != -1) && (j < locala.fu); j++)
          {
            a(this.fw.fM[locala.fz[i]], locala.fB[i] * f, true);
            i = locala.fA[i];
          }
        }
        paramb.fG += ((b)localObject).fG * f;
        ((b)localObject).fF.e(paramb);
        i = this.fC;
        j = 0;
      }
      else
      {
        i = this.fA[i];
        j++;
      }
    }
  }

  public final void a(h paramh, float paramFloat)
  {
    if (paramFloat == 0.0F)
      a(paramh, true);
    while (true)
    {
      return;
      if (this.fC != -1)
        break;
      this.fC = 0;
      this.fB[this.fC] = paramFloat;
      this.fz[this.fC] = paramh.id;
      this.fA[this.fC] = -1;
      paramh.gV += 1;
      paramh.d(this.fv);
      this.fu += 1;
      if (!this.fE)
      {
        this.fD += 1;
        if (this.fD >= this.fz.length)
        {
          this.fE = true;
          this.fD = (this.fz.length - 1);
        }
      }
    }
    int i = this.fC;
    int j = 0;
    int k = -1;
    while (true)
    {
      if ((i == -1) || (j >= this.fu))
        break label213;
      if (this.fz[i] == paramh.id)
      {
        this.fB[i] = paramFloat;
        break;
      }
      if (this.fz[i] < paramh.id)
        k = i;
      i = this.fA[i];
      j++;
    }
    label213: i = this.fD + 1;
    label245: int m;
    if (this.fE)
    {
      if (this.fz[this.fD] == -1)
        i = this.fD;
    }
    else
    {
      j = i;
      if (i >= this.fz.length)
      {
        j = i;
        if (this.fu < this.fz.length)
        {
          m = 0;
          label275: j = i;
          if (m < this.fz.length)
          {
            if (this.fz[m] != -1)
              break label537;
            j = m;
          }
        }
      }
      i = j;
      if (j >= this.fz.length)
      {
        i = this.fz.length;
        this.fx *= 2;
        this.fE = false;
        this.fD = (i - 1);
        this.fB = Arrays.copyOf(this.fB, this.fx);
        this.fz = Arrays.copyOf(this.fz, this.fx);
        this.fA = Arrays.copyOf(this.fA, this.fx);
      }
      this.fz[i] = paramh.id;
      this.fB[i] = paramFloat;
      if (k == -1)
        break label543;
      int[] arrayOfInt = this.fA;
      arrayOfInt[i] = arrayOfInt[k];
      this.fA[k] = i;
    }
    while (true)
    {
      paramh.gV += 1;
      paramh.d(this.fv);
      this.fu += 1;
      if (!this.fE)
        this.fD += 1;
      if (this.fu >= this.fz.length)
        this.fE = true;
      if (this.fD < this.fz.length)
        break;
      this.fE = true;
      this.fD = (this.fz.length - 1);
      break;
      i = this.fz.length;
      break label245;
      label537: m++;
      break label275;
      label543: this.fA[i] = this.fC;
      this.fC = i;
    }
  }

  final void a(h paramh, float paramFloat, boolean paramBoolean)
  {
    if (paramFloat == 0.0F);
    while (true)
    {
      return;
      if (this.fC != -1)
        break;
      this.fC = 0;
      this.fB[this.fC] = paramFloat;
      this.fz[this.fC] = paramh.id;
      this.fA[this.fC] = -1;
      paramh.gV += 1;
      paramh.d(this.fv);
      this.fu += 1;
      if (!this.fE)
      {
        this.fD += 1;
        if (this.fD >= this.fz.length)
        {
          this.fE = true;
          this.fD = (this.fz.length - 1);
        }
      }
    }
    int i = this.fC;
    int j = 0;
    int k = -1;
    Object localObject;
    while (true)
    {
      if ((i == -1) || (j >= this.fu))
        break label320;
      if (this.fz[i] == paramh.id)
      {
        localObject = this.fB;
        localObject[i] += paramFloat;
        if (this.fB[i] != 0.0F)
          break;
        if (i == this.fC)
          this.fC = this.fA[i];
        while (true)
        {
          if (paramBoolean)
            paramh.e(this.fv);
          if (this.fE)
            this.fD = i;
          paramh.gV -= 1;
          this.fu -= 1;
          break;
          localObject = this.fA;
          localObject[k] = localObject[i];
        }
      }
      if (this.fz[i] < paramh.id)
        k = i;
      i = this.fA[i];
      j++;
    }
    label320: i = this.fD + 1;
    label354: int m;
    if (this.fE)
    {
      if (this.fz[this.fD] == -1)
        i = this.fD;
    }
    else
    {
      j = i;
      if (i >= this.fz.length)
      {
        j = i;
        if (this.fu < this.fz.length)
        {
          m = 0;
          label387: j = i;
          if (m < this.fz.length)
          {
            if (this.fz[m] != -1)
              break label641;
            j = m;
          }
        }
      }
      i = j;
      if (j >= this.fz.length)
      {
        i = this.fz.length;
        this.fx *= 2;
        this.fE = false;
        this.fD = (i - 1);
        this.fB = Arrays.copyOf(this.fB, this.fx);
        this.fz = Arrays.copyOf(this.fz, this.fx);
        this.fA = Arrays.copyOf(this.fA, this.fx);
      }
      this.fz[i] = paramh.id;
      this.fB[i] = paramFloat;
      if (k == -1)
        break label647;
      localObject = this.fA;
      localObject[i] = localObject[k];
      this.fA[k] = i;
    }
    while (true)
    {
      paramh.gV += 1;
      paramh.d(this.fv);
      this.fu += 1;
      if (!this.fE)
        this.fD += 1;
      if (this.fD < this.fz.length)
        break;
      this.fE = true;
      this.fD = (this.fz.length - 1);
      break;
      i = this.fz.length;
      break label354;
      label641: m++;
      break label387;
      label647: this.fA[i] = this.fC;
      this.fC = i;
    }
  }

  public final float b(h paramh)
  {
    int i = this.fC;
    int j = 0;
    if ((i != -1) && (j < this.fu))
      if (this.fz[i] != paramh.id);
    for (float f = this.fB[i]; ; f = 0.0F)
    {
      return f;
      i = this.fA[i];
      j++;
      break;
    }
  }

  public final void clear()
  {
    int i = this.fC;
    for (int j = 0; (i != -1) && (j < this.fu); j++)
    {
      h localh = this.fw.fM[this.fz[i]];
      if (localh != null)
        localh.e(this.fv);
      i = this.fA[i];
    }
    this.fC = -1;
    this.fD = -1;
    this.fE = false;
    this.fu = 0;
  }

  final h r(int paramInt)
  {
    int i = this.fC;
    int j = 0;
    if ((i != -1) && (j < this.fu))
      if (j != paramInt);
    for (h localh = this.fw.fM[this.fz[i]]; ; localh = null)
    {
      return localh;
      i = this.fA[i];
      j++;
      break;
    }
  }

  final float s(int paramInt)
  {
    int i = this.fC;
    int j = 0;
    if ((i != -1) && (j < this.fu))
      if (j != paramInt);
    for (float f = this.fB[i]; ; f = 0.0F)
    {
      return f;
      i = this.fA[i];
      j++;
      break;
    }
  }

  public final String toString()
  {
    String str = "";
    int i = this.fC;
    for (int j = 0; (i != -1) && (j < this.fu); j++)
    {
      str = str + " -> ";
      str = str + this.fB[i] + " : ";
      str = str + this.fw.fM[this.fz[i]];
      i = this.fA[i];
    }
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a
 * JD-Core Version:    0.6.2
 */