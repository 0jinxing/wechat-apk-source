package android.support.v4.e;

public final class c
{
  public static final b KH = new c.e(null, false);
  public static final b KI = new c.e(null, true);
  public static final b KJ = new c.e(c.b.KQ, false);
  public static final b KK = new c.e(c.b.KQ, true);
  public static final b KL = new c.e(a.KO, false);
  public static final b KM = c.f.KT;

  static int aA(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = 2;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      continue;
      paramInt = 0;
    }
  }

  static int aB(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = 2;
    case 0:
    case 14:
    case 15:
    case 1:
    case 2:
    case 16:
    case 17:
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      continue;
      paramInt = 0;
    }
  }

  static final class a
    implements c.c
  {
    static final a KO = new a(true);
    static final a KP = new a(false);
    private final boolean KN;

    private a(boolean paramBoolean)
    {
      this.KN = paramBoolean;
    }

    public final int b(CharSequence paramCharSequence, int paramInt)
    {
      int i = 1;
      int j = 0;
      int k = 0;
      while (true)
        if (j < paramInt + 0)
          switch (c.aA(Character.getDirectionality(paramCharSequence.charAt(j))))
          {
          default:
            j++;
            break;
          case 0:
            if (this.KN)
              k = 0;
            break;
          case 1:
          }
      while (true)
      {
        return k;
        k = 1;
        break;
        k = i;
        if (this.KN)
        {
          k = 1;
          break;
          if (k != 0)
          {
            k = i;
            if (!this.KN)
              k = 0;
          }
          else
          {
            k = 2;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.e.c
 * JD-Core Version:    0.6.2
 */