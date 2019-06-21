package com.tencent.mm.plugin.fts.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Pattern;

public final class c$a
{
  public static final Pattern mCA;
  public static final Pattern mCB;
  public static final Pattern mCC;
  public static final Pattern mCD;
  public static final Pattern mCE;
  public static final Pattern mCF;
  public static final Pattern mCG;
  public static final Pattern mCy;
  public static final Pattern mCz;

  static
  {
    AppMethodBeat.i(114186);
    mCy = Pattern.compile(";");
    mCz = Pattern.compile(" ");
    mCA = Pattern.compile("​");
    mCB = Pattern.compile("‌");
    Pattern localPattern = Pattern.compile("‍");
    mCC = localPattern;
    mCD = localPattern;
    mCE = Pattern.compile("\\s+");
    mCF = Pattern.compile(",");
    mCG = Pattern.compile("[A-Za-z]+");
    AppMethodBeat.o(114186);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.c.a
 * JD-Core Version:    0.6.2
 */