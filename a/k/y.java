package a.k;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/text/SystemProperties;", "", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"})
final class y
{
  public static final y BPp;
  public static final String LINE_SEPARATOR;

  static
  {
    AppMethodBeat.i(56363);
    BPp = new y();
    String str = System.getProperty("line.separator");
    if (str == null)
      j.dWJ();
    LINE_SEPARATOR = str;
    AppMethodBeat.o(56363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.k.y
 * JD-Core Version:    0.6.2
 */