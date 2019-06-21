package org.apache.commons.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

final class b
{
  private static final String[][] BWP;
  private static final String[][] BWQ;
  static final String[][] BWR;
  static final String[][] BWS;
  public static final b BWT;
  public static final b BWU;
  public static final b BWV;
  private final b.a BWW;

  static
  {
    AppMethodBeat.i(116935);
    Object localObject = { "amp", "38" };
    BWP = new String[][] { { "quot", "34" }, localObject, { "lt", "60" }, { "gt", "62" } };
    BWQ = new String[][] { { "apos", "39" } };
    BWR = new String[][] { { "nbsp", "160" }, { "iexcl", "161" }, { "cent", "162" }, { "pound", "163" }, { "curren", "164" }, { "yen", "165" }, { "brvbar", "166" }, { "sect", "167" }, { "uml", "168" }, { "copy", "169" }, { "ordf", "170" }, { "laquo", "171" }, { "not", "172" }, { "shy", "173" }, { "reg", "174" }, { "macr", "175" }, { "deg", "176" }, { "plusmn", "177" }, { "sup2", "178" }, { "sup3", "179" }, { "acute", "180" }, { "micro", "181" }, { "para", "182" }, { "middot", "183" }, { "cedil", "184" }, { "sup1", "185" }, { "ordm", "186" }, { "raquo", "187" }, { "frac14", "188" }, { "frac12", "189" }, { "frac34", "190" }, { "iquest", "191" }, { "Agrave", "192" }, { "Aacute", "193" }, { "Acirc", "194" }, { "Atilde", "195" }, { "Auml", "196" }, { "Aring", "197" }, { "AElig", "198" }, { "Ccedil", "199" }, { "Egrave", "200" }, { "Eacute", "201" }, { "Ecirc", "202" }, { "Euml", "203" }, { "Igrave", "204" }, { "Iacute", "205" }, { "Icirc", "206" }, { "Iuml", "207" }, { "ETH", "208" }, { "Ntilde", "209" }, { "Ograve", "210" }, { "Oacute", "211" }, { "Ocirc", "212" }, { "Otilde", "213" }, { "Ouml", "214" }, { "times", "215" }, { "Oslash", "216" }, { "Ugrave", "217" }, { "Uacute", "218" }, { "Ucirc", "219" }, { "Uuml", "220" }, { "Yacute", "221" }, { "THORN", "222" }, { "szlig", "223" }, { "agrave", "224" }, { "aacute", "225" }, { "acirc", "226" }, { "atilde", "227" }, { "auml", "228" }, { "aring", "229" }, { "aelig", "230" }, { "ccedil", "231" }, { "egrave", "232" }, { "eacute", "233" }, { "ecirc", "234" }, { "euml", "235" }, { "igrave", "236" }, { "iacute", "237" }, { "icirc", "238" }, { "iuml", "239" }, { "eth", "240" }, { "ntilde", "241" }, { "ograve", "242" }, { "oacute", "243" }, { "ocirc", "244" }, { "otilde", "245" }, { "ouml", "246" }, { "divide", "247" }, { "oslash", "248" }, { "ugrave", "249" }, { "uacute", "250" }, { "ucirc", "251" }, { "uuml", "252" }, { "yacute", "253" }, { "thorn", "254" }, { "yuml", "255" } };
    localObject = new String[] { "fnof", "402" };
    String[] arrayOfString1 = { "Omicron", "927" };
    String[] arrayOfString2 = { "Sigma", "931" };
    String[] arrayOfString3 = { "beta", "946" };
    String[] arrayOfString4 = { "mu", "956" };
    String[] arrayOfString5 = { "prime", "8242" };
    String[] arrayOfString6 = { "real", "8476" };
    String[] arrayOfString7 = { "trade", "8482" };
    String[] arrayOfString8 = { "larr", "8592" };
    String[] arrayOfString9 = { "darr", "8595" };
    String[] arrayOfString10 = { "and", "8743" };
    String[] arrayOfString11 = { "or", "8744" };
    String[] arrayOfString12 = { "int", "8747" };
    String[] arrayOfString13 = { "spades", "9824" };
    String[] arrayOfString14 = { "tilde", "732" };
    String[] arrayOfString15 = { "emsp", "8195" };
    String[] arrayOfString16 = { "thinsp", "8201" };
    String[] arrayOfString17 = { "sbquo", "8218" };
    String[] arrayOfString18 = { "Dagger", "8225" };
    BWS = new String[][] { localObject, { "Alpha", "913" }, { "Beta", "914" }, { "Gamma", "915" }, { "Delta", "916" }, { "Epsilon", "917" }, { "Zeta", "918" }, { "Eta", "919" }, { "Theta", "920" }, { "Iota", "921" }, { "Kappa", "922" }, { "Lambda", "923" }, { "Mu", "924" }, { "Nu", "925" }, { "Xi", "926" }, arrayOfString1, { "Pi", "928" }, { "Rho", "929" }, arrayOfString2, { "Tau", "932" }, { "Upsilon", "933" }, { "Phi", "934" }, { "Chi", "935" }, { "Psi", "936" }, { "Omega", "937" }, { "alpha", "945" }, arrayOfString3, { "gamma", "947" }, { "delta", "948" }, { "epsilon", "949" }, { "zeta", "950" }, { "eta", "951" }, { "theta", "952" }, { "iota", "953" }, { "kappa", "954" }, { "lambda", "955" }, arrayOfString4, { "nu", "957" }, { "xi", "958" }, { "omicron", "959" }, { "pi", "960" }, { "rho", "961" }, { "sigmaf", "962" }, { "sigma", "963" }, { "tau", "964" }, { "upsilon", "965" }, { "phi", "966" }, { "chi", "967" }, { "psi", "968" }, { "omega", "969" }, { "thetasym", "977" }, { "upsih", "978" }, { "piv", "982" }, { "bull", "8226" }, { "hellip", "8230" }, arrayOfString5, { "Prime", "8243" }, { "oline", "8254" }, { "frasl", "8260" }, { "weierp", "8472" }, { "image", "8465" }, arrayOfString6, arrayOfString7, { "alefsym", "8501" }, arrayOfString8, { "uarr", "8593" }, { "rarr", "8594" }, arrayOfString9, { "harr", "8596" }, { "crarr", "8629" }, { "lArr", "8656" }, { "uArr", "8657" }, { "rArr", "8658" }, { "dArr", "8659" }, { "hArr", "8660" }, { "forall", "8704" }, { "part", "8706" }, { "exist", "8707" }, { "empty", "8709" }, { "nabla", "8711" }, { "isin", "8712" }, { "notin", "8713" }, { "ni", "8715" }, { "prod", "8719" }, { "sum", "8721" }, { "minus", "8722" }, { "lowast", "8727" }, { "radic", "8730" }, { "prop", "8733" }, { "infin", "8734" }, { "ang", "8736" }, arrayOfString10, arrayOfString11, { "cap", "8745" }, { "cup", "8746" }, arrayOfString12, { "there4", "8756" }, { "sim", "8764" }, { "cong", "8773" }, { "asymp", "8776" }, { "ne", "8800" }, { "equiv", "8801" }, { "le", "8804" }, { "ge", "8805" }, { "sub", "8834" }, { "sup", "8835" }, { "sube", "8838" }, { "supe", "8839" }, { "oplus", "8853" }, { "otimes", "8855" }, { "perp", "8869" }, { "sdot", "8901" }, { "lceil", "8968" }, { "rceil", "8969" }, { "lfloor", "8970" }, { "rfloor", "8971" }, { "lang", "9001" }, { "rang", "9002" }, { "loz", "9674" }, arrayOfString13, { "clubs", "9827" }, { "hearts", "9829" }, { "diams", "9830" }, { "OElig", "338" }, { "oelig", "339" }, { "Scaron", "352" }, { "scaron", "353" }, { "Yuml", "376" }, { "circ", "710" }, arrayOfString14, { "ensp", "8194" }, arrayOfString15, arrayOfString16, { "zwnj", "8204" }, { "zwj", "8205" }, { "lrm", "8206" }, { "rlm", "8207" }, { "ndash", "8211" }, { "mdash", "8212" }, { "lsquo", "8216" }, { "rsquo", "8217" }, arrayOfString17, { "ldquo", "8220" }, { "rdquo", "8221" }, { "bdquo", "8222" }, { "dagger", "8224" }, arrayOfString18, { "permil", "8240" }, { "lsaquo", "8249" }, { "rsaquo", "8250" }, { "euro", "8364" } };
    localObject = new b();
    ((b)localObject).a(BWP);
    ((b)localObject).a(BWQ);
    BWT = (b)localObject;
    localObject = new b();
    ((b)localObject).a(BWP);
    ((b)localObject).a(BWR);
    BWU = (b)localObject;
    localObject = new b();
    ((b)localObject).a(BWP);
    ((b)localObject).a(BWR);
    ((b)localObject).a(BWS);
    BWV = (b)localObject;
    AppMethodBeat.o(116935);
  }

  public b()
  {
    AppMethodBeat.i(116931);
    this.BWW = new b.b();
    AppMethodBeat.o(116931);
  }

  private void a(Writer paramWriter, String paramString, int paramInt)
  {
    AppMethodBeat.i(116934);
    paramWriter.write(paramString, 0, paramInt);
    int i = paramString.length();
    int j;
    int m;
    int n;
    label105: String str;
    if (paramInt < i)
    {
      j = paramString.charAt(paramInt);
      if (j == 38)
      {
        int k = paramInt + 1;
        m = paramString.indexOf(';', k);
        if (m == -1)
          paramWriter.write(j);
        while (true)
        {
          paramInt++;
          break;
          n = paramString.indexOf('&', paramInt + 1);
          if ((n == -1) || (n >= m))
            break label105;
          paramWriter.write(j);
        }
        str = paramString.substring(k, m);
        paramInt = str.length();
        if (paramInt <= 0)
          break label289;
        if (str.charAt(0) == '#')
        {
          if (paramInt <= 1)
            break label289;
          switch (str.charAt(1))
          {
          default:
          case 'X':
          case 'x':
          }
        }
      }
    }
    while (true)
    {
      try
      {
        n = Integer.parseInt(str.substring(1), 10);
        paramInt = n;
        if (n > 65535)
          paramInt = -1;
        if (paramInt != -1)
          break label265;
        paramWriter.write(38);
        paramWriter.write(str);
        paramWriter.write(59);
        paramInt = m;
        break;
        n = Integer.parseInt(str.substring(2), 16);
        continue;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        paramInt = -1;
        continue;
      }
      paramInt = this.BWW.awK(str);
      continue;
      label265: paramWriter.write(paramInt);
      continue;
      paramWriter.write(j);
      break;
      AppMethodBeat.o(116934);
      return;
      label289: paramInt = -1;
    }
  }

  private void a(String[][] paramArrayOfString)
  {
    AppMethodBeat.i(116932);
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      String str = paramArrayOfString[i][0];
      int j = Integer.parseInt(paramArrayOfString[i][1]);
      this.BWW.h(str, j);
    }
    AppMethodBeat.o(116932);
  }

  public final String unescape(String paramString)
  {
    AppMethodBeat.i(116933);
    int i = paramString.indexOf('&');
    if (i < 0)
      AppMethodBeat.o(116933);
    while (true)
    {
      return paramString;
      StringWriter localStringWriter = new StringWriter((int)(paramString.length() + paramString.length() * 0.1D));
      try
      {
        a(localStringWriter, paramString, i);
        paramString = localStringWriter.toString();
        AppMethodBeat.o(116933);
      }
      catch (IOException paramString)
      {
        paramString = new g(paramString);
        AppMethodBeat.o(116933);
      }
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.b
 * JD-Core Version:    0.6.2
 */