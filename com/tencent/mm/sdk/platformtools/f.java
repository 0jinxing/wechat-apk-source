package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.a;

public final class f
{
  public static String BUILD_TAG;
  public static String CLIENT_VERSION;
  public static String COMMAND;
  public static boolean DEBUG;
  public static boolean ENABLE_FPS_ANALYSE;
  public static boolean ENABLE_MATRIX;
  public static boolean ENABLE_MATRIX_TRACE;
  public static boolean EX_DEVICE_LOGIN;
  public static String HOSTNAME;
  public static boolean IS_FLAVOR_PURPLE;
  public static boolean IS_FLAVOR_RED;
  public static String OWNER;
  public static boolean PRE_RELEASE;
  public static boolean REDESIGN_ENTRANCE;
  public static String REV;
  public static String SVNPATH;
  public static String TIME;
  public static int xxY;
  public static final s xxZ;

  static
  {
    AppMethodBeat.i(115170);
    xxZ = new s();
    AppMethodBeat.o(115170);
  }

  public static String aZm()
  {
    AppMethodBeat.i(115169);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(String.format("[b.ver] %s\n", new Object[] { a.hQ(CLIENT_VERSION, a.CLIENT_VERSION) }));
    localStringBuilder.append(String.format("[tag  ] %s\n", new Object[] { a.hQ(BUILD_TAG, a.BUILD_TAG) }));
    localStringBuilder.append(String.format("[by   ] %s\n", new Object[] { a.hQ(OWNER, a.OWNER) }));
    localStringBuilder.append(String.format("[host ] %s\n", new Object[] { a.hQ(HOSTNAME, a.HOSTNAME) }));
    localStringBuilder.append(String.format("[time ] %s\n", new Object[] { a.hQ(TIME, a.TIME) }));
    localStringBuilder.append(String.format("[cmd  ] %s\n", new Object[] { a.hQ(COMMAND, a.COMMAND) }));
    localStringBuilder.append(String.format("[path ] %s\n", new Object[] { a.hQ(a.hP(SVNPATH, "MicroMsg_proj"), a.hP(a.SVNPATH, "MicroMsg_proj")) }));
    localStringBuilder.append(String.format("[rev  ] %s\n", new Object[] { a.hQ(REV, a.REV) }));
    if (a.Um());
    for (String str = a.Uk(); ; str = "disabled")
    {
      localStringBuilder.append(String.format("[p.rev] %s\n", new Object[] { str }));
      localStringBuilder.append(String.format("[feature_id] %s\n", new Object[] { xxZ.getString("FEATURE_ID") }));
      str = localStringBuilder.toString();
      AppMethodBeat.o(115169);
      return str;
    }
  }

  static final class a
  {
    public static String hP(String paramString1, String paramString2)
    {
      AppMethodBeat.i(115167);
      if (paramString1 == null)
      {
        paramString1 = null;
        AppMethodBeat.o(115167);
      }
      while (true)
      {
        return paramString1;
        int i = paramString1.indexOf(paramString2);
        if (i < 0)
        {
          AppMethodBeat.o(115167);
        }
        else
        {
          paramString1 = paramString1.substring(i);
          AppMethodBeat.o(115167);
        }
      }
    }

    public static String hQ(String paramString1, String paramString2)
    {
      AppMethodBeat.i(115168);
      if (paramString1 == null)
      {
        paramString1 = null;
        AppMethodBeat.o(115168);
      }
      while (true)
      {
        return paramString1;
        if (paramString1.equals(paramString2))
        {
          AppMethodBeat.o(115168);
        }
        else
        {
          paramString1 = String.format("%s(%s)", new Object[] { paramString1, paramString2 });
          AppMethodBeat.o(115168);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.f
 * JD-Core Version:    0.6.2
 */