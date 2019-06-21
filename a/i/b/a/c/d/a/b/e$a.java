package a.i.b.a.c.d.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum e$a
{
  public final boolean BmG;
  public final boolean BmH;

  static
  {
    AppMethodBeat.i(119797);
    BmC = new a("NON_STABLE_DECLARED", 0, false, false);
    BmD = new a("STABLE_DECLARED", 1, true, false);
    BmE = new a("NON_STABLE_SYNTHESIZED", 2, false, true);
    BmF = new a("STABLE_SYNTHESIZED", 3, true, true);
    BmI = new a[] { BmC, BmD, BmE, BmF };
    AppMethodBeat.o(119797);
  }

  private e$a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.BmG = paramBoolean1;
    this.BmH = paramBoolean2;
  }

  public static a ap(boolean paramBoolean1, boolean paramBoolean2)
  {
    a locala;
    if (paramBoolean1)
      if (paramBoolean2)
        locala = BmF;
    while (true)
    {
      return locala;
      locala = BmD;
      continue;
      if (paramBoolean2)
        locala = BmE;
      else
        locala = BmC;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.b.e.a
 * JD-Core Version:    0.6.2
 */