package a.i.b.a.c.l;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ba
{
  private final boolean BKl;
  public final boolean BKm;
  private final int BKn;
  public final String label;

  static
  {
    AppMethodBeat.i(122707);
    ba localba1 = new ba("INVARIANT", 0, "", true, true, 0);
    BKh = localba1;
    ba localba2 = new ba("IN_VARIANCE", 1, "in", true, false, -1);
    BKi = localba2;
    ba localba3 = new ba("OUT_VARIANCE", 2, "out", false, true, 1);
    BKj = localba3;
    BKk = new ba[] { localba1, localba2, localba3 };
    AppMethodBeat.o(122707);
  }

  private ba(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(122708);
    this.label = paramString;
    this.BKl = paramBoolean1;
    this.BKm = paramBoolean2;
    this.BKn = paramInt;
    AppMethodBeat.o(122708);
  }

  public final String toString()
  {
    return this.label;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.ba
 * JD-Core Version:    0.6.2
 */