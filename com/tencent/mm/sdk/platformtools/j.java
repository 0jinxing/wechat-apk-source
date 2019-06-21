package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import java.io.File;
import java.io.IOException;

public final class j
{
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(51980);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(51980);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      if (!paramString1.endsWith("/"))
      {
        AppMethodBeat.o(51980);
        paramString1 = localObject;
      }
      else
      {
        String str = "";
        if (paramInt == 1)
          str = amm(paramString3);
        while (true)
        {
          if (!bo.isNullOrNil(str))
            break label114;
          AppMethodBeat.o(51980);
          paramString1 = localObject;
          break;
          if (paramInt == 2)
            if (bo.isNullOrNil(paramString3))
              str = null;
            else
              str = amm(g.x(paramString3.getBytes()));
        }
        label114: paramString1 = paramString1 + str;
        if ((paramBoolean) && (!aih(paramString1)))
        {
          AppMethodBeat.o(51980);
          paramString1 = localObject;
        }
        else
        {
          paramString1 = paramString1 + bo.nullAsNil(paramString2) + paramString3 + bo.nullAsNil(paramString4);
          AppMethodBeat.o(51980);
        }
      }
    }
  }

  public static boolean aih(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(51979);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      if (!localFile.exists())
      {
        localFile.mkdirs();
        localFile = new java/io/File;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localFile.<init>(paramString + ".nomedia");
        boolean bool2 = localFile.exists();
        if (bool2);
      }
      try
      {
        localFile.createNewFile();
        bool1 = true;
        AppMethodBeat.o(51979);
        return bool1;
      }
      catch (IOException paramString)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.FilePathGenerator", paramString, "", new Object[0]);
      }
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(51979);
    }
  }

  private static String amm(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(51978);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(51978);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (paramString.length() <= 4)
      {
        AppMethodBeat.o(51978);
        paramString = localObject;
      }
      else
      {
        paramString = paramString.substring(0, 2) + "/" + paramString.substring(2, 4) + "/";
        AppMethodBeat.o(51978);
      }
    }
  }

  public static String b(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    AppMethodBeat.i(51981);
    paramString1 = a(paramString1, paramString2, paramString3, paramString4, paramInt, true);
    AppMethodBeat.o(51981);
    return paramString1;
  }

  public static String b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean)
  {
    AppMethodBeat.i(51982);
    String str = paramString1 + paramString3 + paramString4 + paramString5;
    paramString1 = a(paramString2, paramString3, paramString4, paramString5, 1, paramBoolean);
    if ((bo.isNullOrNil(str)) || (bo.isNullOrNil(paramString1)))
    {
      paramString1 = null;
      AppMethodBeat.o(51982);
    }
    while (true)
    {
      return paramString1;
      paramString2 = new File(paramString1);
      paramString3 = new File(str);
      if (paramString2.exists())
      {
        AppMethodBeat.o(51982);
      }
      else
      {
        if (paramString3.exists())
          m.C(str, paramString1, false);
        AppMethodBeat.o(51982);
      }
    }
  }

  public static String g(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(51983);
    paramString1 = b(paramString1, paramString2, paramString3, paramString4, paramString5, true);
    AppMethodBeat.o(51983);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.j
 * JD-Core Version:    0.6.2
 */