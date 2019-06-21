package android.support.v7.d;

final class b$1
  implements b.b
{
  public final boolean d(float[] paramArrayOfFloat)
  {
    boolean bool = true;
    int i;
    if (paramArrayOfFloat[2] >= 0.95F)
    {
      i = 1;
      if (i != 0)
        break label82;
      if (paramArrayOfFloat[2] > 0.05F)
        break label72;
      i = 1;
      label28: if (i != 0)
        break label82;
      if ((paramArrayOfFloat[0] < 10.0F) || (paramArrayOfFloat[0] > 37.0F) || (paramArrayOfFloat[1] > 0.82F))
        break label77;
      i = 1;
      label61: if (i != 0)
        break label82;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label72: i = 0;
      break label28;
      label77: i = 0;
      break label61;
      label82: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.d.b.1
 * JD-Core Version:    0.6.2
 */