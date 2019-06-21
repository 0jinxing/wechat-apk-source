package a.k;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.charset.Charset;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/text/Charsets;", "", "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"})
public final class d
{
  public static final d BOP;
  public static final Charset ISO_8859_1;
  public static final Charset US_ASCII;
  public static final Charset UTF_16;
  public static final Charset UTF_16BE;
  public static final Charset UTF_16LE;
  public static final Charset UTF_8;

  static
  {
    AppMethodBeat.i(56267);
    BOP = new d();
    Charset localCharset = Charset.forName("UTF-8");
    j.o(localCharset, "Charset.forName(\"UTF-8\")");
    UTF_8 = localCharset;
    localCharset = Charset.forName("UTF-16");
    j.o(localCharset, "Charset.forName(\"UTF-16\")");
    UTF_16 = localCharset;
    localCharset = Charset.forName("UTF-16BE");
    j.o(localCharset, "Charset.forName(\"UTF-16BE\")");
    UTF_16BE = localCharset;
    localCharset = Charset.forName("UTF-16LE");
    j.o(localCharset, "Charset.forName(\"UTF-16LE\")");
    UTF_16LE = localCharset;
    localCharset = Charset.forName("US-ASCII");
    j.o(localCharset, "Charset.forName(\"US-ASCII\")");
    US_ASCII = localCharset;
    localCharset = Charset.forName("ISO-8859-1");
    j.o(localCharset, "Charset.forName(\"ISO-8859-1\")");
    ISO_8859_1 = localCharset;
    AppMethodBeat.o(56267);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.k.d
 * JD-Core Version:    0.6.2
 */