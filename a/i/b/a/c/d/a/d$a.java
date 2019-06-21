package a.i.b.a.c.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum d$a
{
  private final String BkM;
  private final boolean BkN;

  static
  {
    AppMethodBeat.i(119666);
    a locala1 = new a("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);
    BkI = locala1;
    a locala2 = new a("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);
    BkJ = locala2;
    a locala3 = new a("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);
    BkK = locala3;
    BkL = new a[] { locala1, locala2, locala3 };
    AppMethodBeat.o(119666);
  }

  private d$a(String paramString, boolean paramBoolean)
  {
    this.BkM = paramString;
    this.BkN = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.d.a
 * JD-Core Version:    0.6.2
 */