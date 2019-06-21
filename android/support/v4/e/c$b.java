package android.support.v4.e;

final class c$b
  implements c.c
{
  static final b KQ = new b();

  public final int b(CharSequence paramCharSequence, int paramInt)
  {
    int i = 0;
    int j = 2;
    while ((i < paramInt + 0) && (j == 2))
    {
      j = c.aB(Character.getDirectionality(paramCharSequence.charAt(i)));
      i++;
    }
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.e.c.b
 * JD-Core Version:    0.6.2
 */