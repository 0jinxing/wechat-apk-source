package a.i.b.a.c.d.b.a;

import a.a.ad;
import a.h.e;
import a.i.b.a.c.e.b.a.d;
import a.i.b.a.c.e.b.a.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a
{
  public final a Bsc;
  public final g Bsd;
  private final d Bse;
  public final String[] Bsf;
  public final String[] Bsg;
  private final String Bsh;
  private final int Bsi;
  private final String packageName;
  public final String[] strings;

  public a(a parama, g paramg, d paramd, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(120342);
    this.Bsc = parama;
    this.Bsd = paramg;
    this.Bse = paramd;
    this.Bsf = paramArrayOfString1;
    this.Bsg = paramArrayOfString2;
    this.strings = paramArrayOfString3;
    this.Bsh = paramString1;
    this.Bsi = paramInt;
    this.packageName = paramString2;
    AppMethodBeat.o(120342);
  }

  public final String ecv()
  {
    String str = this.Bsh;
    int i;
    if (this.Bsc == a.Bso)
    {
      i = 1;
      if (i == 0)
        break label28;
    }
    while (true)
    {
      return str;
      i = 0;
      break;
      label28: str = null;
    }
  }

  public final boolean ecw()
  {
    if ((this.Bsi & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(120341);
    String str = this.Bsc + " version=" + this.Bsd;
    AppMethodBeat.o(120341);
    return str;
  }

  public static enum a
  {
    private static final Map<Integer, a> Bsq;
    public static final a.a.a Bsr;
    private final int id;

    static
    {
      int i = 0;
      AppMethodBeat.i(120337);
      a locala1 = new a("UNKNOWN", 0, 0);
      Bsj = locala1;
      a locala2 = new a("CLASS", 1, 1);
      Bsk = locala2;
      a locala3 = new a("FILE_FACADE", 2, 2);
      Bsl = locala3;
      Object localObject1 = new a("SYNTHETIC_CLASS", 3, 3);
      Bsm = (a)localObject1;
      a locala4 = new a("MULTIFILE_CLASS", 4, 4);
      Bsn = locala4;
      Object localObject2 = new a("MULTIFILE_CLASS_PART", 5, 5);
      Bso = (a)localObject2;
      Bsp = new a[] { locala1, locala2, locala3, localObject1, locala4, localObject2 };
      Bsr = new a.a.a((byte)0);
      localObject1 = values();
      localObject2 = (Map)new LinkedHashMap(e.im(ad.SI(localObject1.length), 16));
      int j = localObject1.length;
      while (i < j)
      {
        locala1 = localObject1[i];
        ((Map)localObject2).put(Integer.valueOf(locala1.id), locala1);
        i++;
      }
      Bsq = (Map)localObject2;
      AppMethodBeat.o(120337);
    }

    private a(int paramInt)
    {
      this.id = paramInt;
    }

    public static final a SO(int paramInt)
    {
      AppMethodBeat.i(120340);
      a locala1 = (a)Bsq.get(Integer.valueOf(paramInt));
      a locala2 = locala1;
      if (locala1 == null)
        locala2 = Bsj;
      AppMethodBeat.o(120340);
      return locala2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.a.a
 * JD-Core Version:    0.6.2
 */