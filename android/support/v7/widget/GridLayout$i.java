package android.support.v7.widget;

public class GridLayout$i
{
  static final i akQ = GridLayout.im();
  final GridLayout.f ajL;
  final boolean akR;
  final GridLayout.a akS;
  final float weight;

  GridLayout$i(boolean paramBoolean, int paramInt1, int paramInt2, GridLayout.a parama, float paramFloat)
  {
    this(paramBoolean, new GridLayout.f(paramInt1, paramInt1 + paramInt2), parama, paramFloat);
  }

  private GridLayout$i(boolean paramBoolean, GridLayout.f paramf, GridLayout.a parama, float paramFloat)
  {
    this.akR = paramBoolean;
    this.ajL = paramf;
    this.akS = parama;
    this.weight = paramFloat;
  }

  final i a(GridLayout.f paramf)
  {
    return new i(this.akR, paramf, this.akS, this.weight);
  }

  public final GridLayout.a ag(boolean paramBoolean)
  {
    GridLayout.a locala;
    if (this.akS != GridLayout.ajw)
      locala = this.akS;
    while (true)
    {
      return locala;
      if (this.weight == 0.0F)
      {
        if (paramBoolean)
          locala = GridLayout.ajB;
        else
          locala = GridLayout.ajG;
      }
      else
        locala = GridLayout.ajH;
    }
  }

  public boolean equals(Object paramObject)
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
        paramObject = (i)paramObject;
        if (!this.akS.equals(paramObject.akS))
          bool = false;
        else if (!this.ajL.equals(paramObject.ajL))
          bool = false;
      }
    }
  }

  public int hashCode()
  {
    return this.ajL.hashCode() * 31 + this.akS.hashCode();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayout.i
 * JD-Core Version:    0.6.2
 */