package org.apache.commons.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public final class f
{
  public static final String AbP;
  public static final String BXA;
  public static final String BXB;
  public static final String BXC;
  public static final String BXD;
  public static final String BXE;
  public static final String BXF;
  public static final String BXG;
  public static final String BXH;
  public static final String BXI;
  public static final String BXJ;
  public static final String BXK;
  public static final String BXL;
  public static final String BXM;
  public static final String BXN;
  public static final String BXO;
  public static final String BXP;
  public static final float BXQ;
  public static final int BXR;
  public static final boolean BXS;
  public static final boolean BXT;
  public static final boolean BXU;
  public static final boolean BXV;
  public static final boolean BXW;
  public static final boolean BXX;
  public static final boolean BXY;
  public static final boolean BXZ;
  public static final String BXe;
  public static final String BXf;
  public static final String BXg;
  public static final String BXh;
  public static final String BXi;
  public static final String BXj;
  public static final String BXk;
  public static final String BXl;
  public static final String BXm;
  public static final String BXn;
  public static final String BXo;
  public static final String BXp;
  public static final String BXq;
  public static final String BXr;
  public static final String BXs;
  public static final String BXt;
  public static final String BXu;
  public static final String BXv;
  public static final String BXw;
  public static final String BXx;
  public static final String BXy;
  public static final String BXz;
  public static final boolean BYa;
  public static final boolean BYb;
  public static final boolean BYc;
  public static final boolean BYd;
  public static final boolean BYe;
  public static final boolean BYf;
  public static final boolean BYg;
  public static final boolean BYh;
  public static final boolean BYi;
  public static final boolean BYj;
  public static final boolean BYk;
  public static final boolean BYl;
  public static final boolean BYm;
  public static final boolean BYn;
  public static final boolean BYo;
  public static final boolean BYp;
  public static final boolean BYq;
  public static final boolean BYr;
  public static final String LINE_SEPARATOR;
  public static final String bIL;
  public static final String vxl;
  public static final String vxm;

  static
  {
    boolean bool1 = false;
    AppMethodBeat.i(116964);
    BXe = getSystemProperty("awt.toolkit");
    BXf = getSystemProperty("file.encoding");
    AbP = getSystemProperty("file.separator");
    BXg = getSystemProperty("java.awt.fonts");
    BXh = getSystemProperty("java.awt.graphicsenv");
    BXi = getSystemProperty("java.awt.headless");
    BXj = getSystemProperty("java.awt.printerjob");
    BXk = getSystemProperty("java.class.path");
    BXl = getSystemProperty("java.class.version");
    BXm = getSystemProperty("java.compiler");
    BXn = getSystemProperty("java.endorsed.dirs");
    BXo = getSystemProperty("java.ext.dirs");
    BXp = getSystemProperty("java.home");
    BXq = getSystemProperty("java.io.tmpdir");
    BXr = getSystemProperty("java.library.path");
    BXs = getSystemProperty("java.runtime.name");
    BXt = getSystemProperty("java.runtime.version");
    BXu = getSystemProperty("java.specification.name");
    BXv = getSystemProperty("java.specification.vendor");
    BXw = getSystemProperty("java.specification.version");
    BXx = getSystemProperty("java.util.prefs.PreferencesFactory");
    BXy = getSystemProperty("java.vendor");
    BXz = getSystemProperty("java.vendor.url");
    BXA = getSystemProperty("java.version");
    BXB = getSystemProperty("java.vm.info");
    BXC = getSystemProperty("java.vm.name");
    BXD = getSystemProperty("java.vm.specification.name");
    BXE = getSystemProperty("java.vm.specification.vendor");
    BXF = getSystemProperty("java.vm.specification.version");
    BXG = getSystemProperty("java.vm.vendor");
    BXH = getSystemProperty("java.vm.version");
    LINE_SEPARATOR = getSystemProperty("line.separator");
    BXI = getSystemProperty("os.arch");
    vxl = getSystemProperty("os.name");
    vxm = getSystemProperty("os.version");
    BXJ = getSystemProperty("path.separator");
    int i;
    if (getSystemProperty("user.country") == null)
    {
      localObject = getSystemProperty("user.region");
      BXK = (String)localObject;
      BXL = getSystemProperty("user.dir");
      BXM = getSystemProperty("user.home");
      BXN = getSystemProperty("user.language");
      bIL = getSystemProperty("user.name");
      BXO = getSystemProperty("user.timezone");
      if (BXA == null)
        break label771;
      i = 0;
      label363: if (i >= BXA.length())
        break label771;
      j = BXA.charAt(i);
      if ((j < 48) || (j > 57))
        break label765;
    }
    boolean bool2;
    label771: for (Object localObject = BXA.substring(i); ; localObject = null)
    {
      BXP = (String)localObject;
      BXQ = M(awO(BXA));
      localObject = awO(BXA);
      if (localObject != null)
        break label776;
      j = 0;
      BXR = j;
      BXS = awM("1.1");
      BXT = awM("1.2");
      BXU = awM("1.3");
      BXV = awM("1.4");
      BXW = awM("1.5");
      BXX = awM("1.6");
      BXY = awM("1.7");
      BXZ = awN("AIX");
      BYa = awN("HP-UX");
      BYb = awN("Irix");
      if ((!awN("Linux")) && (!awN("LINUX")))
        break label826;
      bool2 = true;
      label545: BYc = bool2;
      BYd = awN("Mac");
      BYe = awN("Mac OS X");
      BYf = awN("OS/2");
      BYg = awN("Solaris");
      BYh = awN("SunOS");
      if ((!BXZ) && (!BYa) && (!BYb) && (!BYc) && (!BYe) && (!BYg))
      {
        bool2 = bool1;
        if (!BYh);
      }
      else
      {
        bool2 = true;
      }
      BYi = bool2;
      BYj = awN("Windows");
      BYk = jk("Windows", "5.0");
      BYl = jk("Windows 9", "4.0");
      BYm = jk("Windows 9", "4.1");
      BYn = jk("Windows", "4.9");
      BYo = awN("Windows NT");
      BYp = jk("Windows", "5.1");
      BYq = jk("Windows", "6.0");
      BYr = jk("Windows", "6.1");
      AppMethodBeat.o(116964);
      return;
      localObject = getSystemProperty("user.country");
      break;
      label765: i++;
      break label363;
    }
    label776: int k = localObject.length;
    if (k > 0);
    for (int j = localObject[0] * 100; ; j = 0)
    {
      i = j;
      if (k >= 2)
        i = j + localObject[1] * 10;
      j = i;
      if (k < 3)
        break;
      j = i + localObject[2];
      break;
      label826: bool2 = false;
      break label545;
    }
  }

  private static float M(int[] paramArrayOfInt)
  {
    int i = 1;
    AppMethodBeat.i(116963);
    float f;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      AppMethodBeat.o(116963);
      f = 0.0F;
    }
    while (true)
    {
      return f;
      if (paramArrayOfInt.length == 1)
      {
        f = paramArrayOfInt[0];
        AppMethodBeat.o(116963);
      }
      else
      {
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append(paramArrayOfInt[0]);
        localStringBuffer.append('.');
        while (i < paramArrayOfInt.length)
        {
          localStringBuffer.append(paramArrayOfInt[i]);
          i++;
        }
        try
        {
          f = Float.parseFloat(localStringBuffer.toString());
          AppMethodBeat.o(116963);
        }
        catch (Exception paramArrayOfInt)
        {
          AppMethodBeat.o(116963);
          f = 0.0F;
        }
      }
    }
  }

  private static boolean awM(String paramString)
  {
    AppMethodBeat.i(116958);
    String str = BXP;
    boolean bool;
    if (str == null)
    {
      bool = false;
      AppMethodBeat.o(116958);
    }
    while (true)
    {
      return bool;
      bool = str.startsWith(paramString);
      AppMethodBeat.o(116958);
    }
  }

  private static boolean awN(String paramString)
  {
    AppMethodBeat.i(116960);
    String str = vxl;
    boolean bool;
    if (str == null)
    {
      bool = false;
      AppMethodBeat.o(116960);
    }
    while (true)
    {
      return bool;
      bool = str.startsWith(paramString);
      AppMethodBeat.o(116960);
    }
  }

  private static int[] awO(String paramString)
  {
    AppMethodBeat.i(116962);
    if (paramString == null)
    {
      paramString = a.bxu;
      AppMethodBeat.o(116962);
    }
    while (true)
    {
      return paramString;
      label28: Object localObject;
      int i;
      int j;
      label41: String str;
      int k;
      if (paramString == null)
      {
        paramString = null;
        localObject = new int[Math.min(3, paramString.length)];
        i = 0;
        j = 0;
        if ((i >= paramString.length) || (j >= 3))
          break label374;
        str = paramString[i];
        k = j;
        if (str.length() <= 0);
      }
      try
      {
        localObject[j] = Integer.parseInt(str);
        k = j + 1;
        i++;
        j = k;
        break label41;
        int m = paramString.length();
        if (m == 0)
        {
          paramString = a.EMPTY_STRING_ARRAY;
          break label28;
        }
        localObject = new ArrayList();
        if ("._- ".length() == 1)
        {
          int n = "._- ".charAt(0);
          j = 0;
          i = 0;
          k = 0;
          i1 = 1;
          while (k < m)
            if (paramString.charAt(k) == n)
            {
              if (j == 0)
                break label436;
              i2 = i1 + 1;
              j = k;
              if (i1 == -1)
                j = m;
              ((List)localObject).add(paramString.substring(i, j));
              i = 0;
              k = i2;
              i2 = j;
              j = i2 + 1;
              i2 = j;
              i1 = k;
              k = j;
              j = i;
              i = i2;
            }
            else
            {
              k++;
              j = 1;
            }
          if (j != 0)
            ((List)localObject).add(paramString.substring(i, k));
          paramString = (String[])((List)localObject).toArray(new String[((List)localObject).size()]);
          break label28;
          while (true)
          {
            if (k >= m)
              break label430;
            if ("._- ".indexOf(paramString.charAt(k)) >= 0)
            {
              if (j == 0)
                break;
              i2 = i + 1;
              j = k;
              if (i == -1)
                j = m;
              ((List)localObject).add(paramString.substring(i1, j));
              i = 0;
              k = i2;
              i2 = j;
              j = i2 + 1;
              i1 = j;
              i2 = k;
              k = j;
              j = i;
              i = i2;
            }
            else
            {
              k++;
              j = 1;
            }
          }
          label374: if (localObject.length > j)
          {
            paramString = new int[j];
            System.arraycopy(localObject, 0, paramString, 0, j);
            AppMethodBeat.o(116962);
          }
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          k = j;
          continue;
          paramString = (String)localObject;
          continue;
          int i1 = i;
          int i2 = k;
          i = j;
          k = i1;
          continue;
          label430: i = i1;
          continue;
          label436: i2 = k;
          i = j;
          k = i1;
          continue;
          j = 0;
          i1 = 0;
          k = 0;
          i = 1;
        }
      }
    }
  }

  private static String getSystemProperty(String paramString)
  {
    AppMethodBeat.i(116961);
    try
    {
      String str = System.getProperty(paramString);
      paramString = str;
      AppMethodBeat.o(116961);
      return paramString;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
      {
        System.err.println("Caught a SecurityException reading the system property '" + paramString + "'; the SystemUtils property value will default to null.");
        paramString = null;
        AppMethodBeat.o(116961);
      }
    }
  }

  private static boolean jk(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(116959);
    String str1 = vxl;
    String str2 = vxm;
    if ((str1 == null) || (str2 == null))
      AppMethodBeat.o(116959);
    while (true)
    {
      return bool;
      if ((str1.startsWith(paramString1)) && (str2.startsWith(paramString2)))
      {
        bool = true;
        AppMethodBeat.o(116959);
      }
      else
      {
        AppMethodBeat.o(116959);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.apache.commons.b.f
 * JD-Core Version:    0.6.2
 */