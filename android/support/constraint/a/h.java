package android.support.constraint.a;

import java.util.Arrays;

public final class h
{
  private static int gJ = 1;
  private static int gK = 1;
  private static int gL = 1;
  private static int gM = 1;
  private static int gN = 1;
  int gO = -1;
  public int gP = 0;
  public float gQ;
  float[] gR = new float[7];
  h.a gS;
  b[] gT = new b[8];
  int gU = 0;
  public int gV = 0;
  public int id = -1;
  private String mName;

  public h(h.a parama)
  {
    this.gS = parama;
  }

  static void aB()
  {
    gK += 1;
  }

  public final void d(b paramb)
  {
    int i = 0;
    if (i < this.gU)
      if (this.gT[i] != paramb);
    while (true)
    {
      return;
      i++;
      break;
      if (this.gU >= this.gT.length)
        this.gT = ((b[])Arrays.copyOf(this.gT, this.gT.length * 2));
      this.gT[this.gU] = paramb;
      this.gU += 1;
    }
  }

  public final void e(b paramb)
  {
    int i = 0;
    int j = this.gU;
    for (int k = 0; ; k++)
      if (k < j)
      {
        if (this.gT[k] == paramb)
        {
          while (i < j - k - 1)
          {
            this.gT[(k + i)] = this.gT[(k + i + 1)];
            i++;
          }
          this.gU -= 1;
        }
      }
      else
        return;
  }

  public final void f(b paramb)
  {
    int i = this.gU;
    for (int j = 0; j < i; j++)
      this.gT[j].fI.a(this.gT[j], paramb);
    this.gU = 0;
  }

  public final void reset()
  {
    this.mName = null;
    this.gS = h.a.ha;
    this.gP = 0;
    this.id = -1;
    this.gO = -1;
    this.gQ = 0.0F;
    this.gU = 0;
    this.gV = 0;
  }

  public final String toString()
  {
    return "" + this.mName;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.h
 * JD-Core Version:    0.6.2
 */