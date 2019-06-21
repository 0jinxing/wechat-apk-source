package android.support.constraint.a.a;

import java.util.ArrayList;

public final class p
{
  int iJ;
  int iK;
  ArrayList<p.a> ku = new ArrayList();
  int mHeight;
  int mWidth;

  public p(f paramf)
  {
    this.iJ = paramf.getX();
    this.iK = paramf.getY();
    this.mWidth = paramf.getWidth();
    this.mHeight = paramf.getHeight();
    paramf = paramf.aT();
    int i = paramf.size();
    for (int j = 0; j < i; j++)
    {
      e locale = (e)paramf.get(j);
      this.ku.add(new p.a(locale));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.p
 * JD-Core Version:    0.6.2
 */