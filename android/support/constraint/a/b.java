package android.support.constraint.a;

public class b
  implements e.a
{
  h fF = null;
  public float fG = 0.0F;
  boolean fH = false;
  public final a fI;
  public boolean fJ = false;

  public b(c paramc)
  {
    this.fI = new a(this, paramc);
  }

  public final b a(e parame, int paramInt)
  {
    this.fI.a(parame.t(paramInt), 1.0F);
    this.fI.a(parame.t(paramInt), -1.0F);
    return this;
  }

  public final b a(h paramh1, h paramh2, h paramh3, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt != 0)
    {
      i = j;
      j = paramInt;
      if (paramInt < 0)
      {
        j = paramInt * -1;
        i = 1;
      }
      this.fG = j;
    }
    if (i == 0)
    {
      this.fI.a(paramh1, -1.0F);
      this.fI.a(paramh2, 1.0F);
      this.fI.a(paramh3, 1.0F);
    }
    while (true)
    {
      return this;
      this.fI.a(paramh1, 1.0F);
      this.fI.a(paramh2, -1.0F);
      this.fI.a(paramh3, -1.0F);
    }
  }

  public final b a(h paramh1, h paramh2, h paramh3, h paramh4, float paramFloat)
  {
    this.fI.a(paramh1, -1.0F);
    this.fI.a(paramh2, 1.0F);
    this.fI.a(paramh3, paramFloat);
    this.fI.a(paramh4, -paramFloat);
    return this;
  }

  public final h a(boolean[] paramArrayOfBoolean)
  {
    return this.fI.a(paramArrayOfBoolean, null);
  }

  public final void a(e.a parama)
  {
    if ((parama instanceof b))
    {
      parama = (b)parama;
      this.fF = null;
      this.fI.clear();
      for (int i = 0; i < parama.fI.fu; i++)
      {
        h localh = parama.fI.r(i);
        float f = parama.fI.s(i);
        this.fI.a(localh, f, true);
      }
    }
  }

  public final h at()
  {
    return this.fF;
  }

  public final b b(h paramh1, h paramh2, h paramh3, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (paramInt != 0)
    {
      i = j;
      j = paramInt;
      if (paramInt < 0)
      {
        j = paramInt * -1;
        i = 1;
      }
      this.fG = j;
    }
    if (i == 0)
    {
      this.fI.a(paramh1, -1.0F);
      this.fI.a(paramh2, 1.0F);
      this.fI.a(paramh3, -1.0F);
    }
    while (true)
    {
      return this;
      this.fI.a(paramh1, 1.0F);
      this.fI.a(paramh2, -1.0F);
      this.fI.a(paramh3, 1.0F);
    }
  }

  public final b b(h paramh1, h paramh2, h paramh3, h paramh4, float paramFloat)
  {
    this.fI.a(paramh3, 0.5F);
    this.fI.a(paramh4, 0.5F);
    this.fI.a(paramh1, -0.5F);
    this.fI.a(paramh2, -0.5F);
    this.fG = (-paramFloat);
    return this;
  }

  final boolean c(h paramh)
  {
    boolean bool1 = false;
    a locala = this.fI;
    boolean bool2 = bool1;
    int i;
    if (locala.fC != -1)
      i = locala.fC;
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (i != -1)
      {
        bool2 = bool1;
        if (j < locala.fu)
        {
          if (locala.fz[i] != paramh.id)
            break label68;
          bool2 = true;
        }
      }
      return bool2;
      label68: i = locala.fA[i];
    }
  }

  public final void clear()
  {
    this.fI.clear();
    this.fF = null;
    this.fG = 0.0F;
  }

  final void d(h paramh)
  {
    if (this.fF != null)
    {
      this.fI.a(this.fF, -1.0F);
      this.fF = null;
    }
    float f = -1.0F * this.fI.a(paramh, true);
    this.fF = paramh;
    if (f == 1.0F);
    while (true)
    {
      return;
      this.fG /= f;
      a locala = this.fI;
      int i = locala.fC;
      for (int j = 0; (i != -1) && (j < locala.fu); j++)
      {
        paramh = locala.fB;
        paramh[i] /= f;
        i = locala.fA[i];
      }
    }
  }

  public void e(h paramh)
  {
    float f = 1.0F;
    if (paramh.gP == 1);
    while (true)
    {
      this.fI.a(paramh, f);
      return;
      if (paramh.gP == 2)
        f = 1000.0F;
      else if (paramh.gP == 3)
        f = 1000000.0F;
      else if (paramh.gP == 4)
        f = 1.0E+009F;
      else if (paramh.gP == 5)
        f = 1.0E+012F;
    }
  }

  public String toString()
  {
    String str;
    if (this.fF == null)
    {
      str = "" + "0";
      str = str + " = ";
      if (this.fG == 0.0F)
        break label368;
      str = str + this.fG;
    }
    label92: label362: label365: label368: for (int i = 1; ; i = 0)
    {
      int j = this.fI.fu;
      int k = 0;
      Object localObject;
      float f;
      if (k < j)
      {
        localObject = this.fI.r(k);
        if (localObject == null)
          break label365;
        f = this.fI.s(k);
        if (f == 0.0F)
          break label365;
        localObject = ((h)localObject).toString();
        if (i == 0)
        {
          if (f >= 0.0F)
            break label362;
          str = str + "- ";
          f *= -1.0F;
          if (f != 1.0F)
            break label298;
          str = str + (String)localObject;
          i = 1;
        }
      }
      while (true)
      {
        k++;
        break label92;
        str = "" + this.fF;
        break;
        if (f > 0.0F)
        {
          str = str + " + ";
          break label177;
        }
        str = str + " - ";
        f *= -1.0F;
        break label177;
        str = str + f + " " + (String)localObject;
        break label204;
        localObject = str;
        if (i == 0)
          localObject = str + "0.0";
        return localObject;
        break label177;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.b
 * JD-Core Version:    0.6.2
 */