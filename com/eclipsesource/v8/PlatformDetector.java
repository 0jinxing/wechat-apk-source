package com.eclipsesource.v8;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public class PlatformDetector
{
  private static String normalize(String paramString)
  {
    AppMethodBeat.i(75021);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(75021);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
      AppMethodBeat.o(75021);
    }
  }

  private static String normalizeArch(String paramString)
  {
    AppMethodBeat.i(75020);
    paramString = normalize(paramString);
    if (paramString.matches("^(x8664|amd64|ia32e|em64t|x64)$"))
    {
      paramString = "x86_64";
      AppMethodBeat.o(75020);
    }
    while (true)
    {
      return paramString;
      if (paramString.matches("^(x8632|x86|i[3-6]86|ia32|x32)$"))
      {
        paramString = "x86_32";
        AppMethodBeat.o(75020);
      }
      else if (paramString.matches("^(ia64|itanium64)$"))
      {
        paramString = "itanium_64";
        AppMethodBeat.o(75020);
      }
      else if (paramString.matches("^(sparc|sparc32)$"))
      {
        paramString = "sparc_32";
        AppMethodBeat.o(75020);
      }
      else if (paramString.matches("^(sparcv9|sparc64)$"))
      {
        paramString = "sparc_64";
        AppMethodBeat.o(75020);
      }
      else if (paramString.matches("^(arm|arm32)$"))
      {
        paramString = "arm_32";
        AppMethodBeat.o(75020);
      }
      else if ("aarch64".equals(paramString))
      {
        paramString = "aarch_64";
        AppMethodBeat.o(75020);
      }
      else if (paramString.matches("^(ppc|ppc32)$"))
      {
        paramString = "ppc_32";
        AppMethodBeat.o(75020);
      }
      else if ("ppc64".equals(paramString))
      {
        paramString = "ppc_64";
        AppMethodBeat.o(75020);
      }
      else if ("ppc64le".equals(paramString))
      {
        paramString = "ppcle_64";
        AppMethodBeat.o(75020);
      }
      else if ("s390".equals(paramString))
      {
        paramString = "s390_32";
        AppMethodBeat.o(75020);
      }
      else if ("s390x".equals(paramString))
      {
        paramString = "s390_64";
        AppMethodBeat.o(75020);
      }
      else
      {
        paramString = "unknown";
        AppMethodBeat.o(75020);
      }
    }
  }

  private static String normalizeOs(String paramString)
  {
    AppMethodBeat.i(75019);
    paramString = normalize(paramString);
    if (paramString.startsWith("aix"))
    {
      paramString = "aix";
      AppMethodBeat.o(75019);
    }
    while (true)
    {
      return paramString;
      if (paramString.startsWith("hpux"))
      {
        paramString = "hpux";
        AppMethodBeat.o(75019);
      }
      else if ((paramString.startsWith("os400")) && ((paramString.length() <= 5) || (!Character.isDigit(paramString.charAt(5)))))
      {
        paramString = "os400";
        AppMethodBeat.o(75019);
      }
      else if (paramString.startsWith("android"))
      {
        paramString = "android";
        AppMethodBeat.o(75019);
      }
      else if (paramString.startsWith("linux"))
      {
        paramString = "linux";
        AppMethodBeat.o(75019);
      }
      else if (paramString.startsWith("nacl"))
      {
        paramString = "nacl";
        AppMethodBeat.o(75019);
      }
      else if ((paramString.startsWith("macosx")) || (paramString.startsWith("osx")))
      {
        paramString = "macosx";
        AppMethodBeat.o(75019);
      }
      else if (paramString.startsWith("freebsd"))
      {
        paramString = "freebsd";
        AppMethodBeat.o(75019);
      }
      else if (paramString.startsWith("openbsd"))
      {
        paramString = "openbsd";
        AppMethodBeat.o(75019);
      }
      else if (paramString.startsWith("netbsd"))
      {
        paramString = "netbsd";
        AppMethodBeat.o(75019);
      }
      else if ((paramString.startsWith("solaris")) || (paramString.startsWith("sunos")))
      {
        paramString = "sunos";
        AppMethodBeat.o(75019);
      }
      else if (paramString.startsWith("windows"))
      {
        paramString = "windows";
        AppMethodBeat.o(75019);
      }
      else
      {
        paramString = "unknown";
        AppMethodBeat.o(75019);
      }
    }
  }

  private static String normalizeOsReleaseValue(String paramString)
  {
    AppMethodBeat.i(75018);
    paramString = paramString.trim().replace("\"", "");
    AppMethodBeat.o(75018);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.PlatformDetector
 * JD-Core Version:    0.6.2
 */