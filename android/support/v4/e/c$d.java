package android.support.v4.e;

abstract class c$d
  implements b
{
  private final c.c KR;

  c$d(c.c paramc)
  {
    this.KR = paramc;
  }

  public final boolean a(CharSequence paramCharSequence, int paramInt)
  {
    if ((paramCharSequence == null) || (paramInt < 0) || (paramCharSequence.length() - paramInt < 0))
      throw new IllegalArgumentException();
    boolean bool;
    if (this.KR == null)
      bool = ef();
    while (true)
    {
      return bool;
      switch (this.KR.b(paramCharSequence, paramInt))
      {
      default:
        bool = ef();
        break;
      case 0:
        bool = true;
        break;
      case 1:
        bool = false;
      }
    }
  }

  protected abstract boolean ef();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.e.c.d
 * JD-Core Version:    0.6.2
 */