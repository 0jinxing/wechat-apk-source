package android.support.constraint.a.a;

import java.util.Arrays;

public class j extends f
{
  protected int hn = 0;
  protected f[] kh = new f[4];

  public final void bd()
  {
    this.hn = 0;
  }

  public final void e(f paramf)
  {
    if (this.hn + 1 > this.kh.length)
      this.kh = ((f[])Arrays.copyOf(this.kh, this.kh.length * 2));
    this.kh[this.hn] = paramf;
    this.hn += 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.j
 * JD-Core Version:    0.6.2
 */