package com.tencent.mm.svg.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

public final class b
{
  private static boolean eMP = false;
  private static String mPackageName = "";
  private static boolean ydt = false;
  private static boolean ydu = false;

  private static final Object aqy(String paramString)
  {
    AppMethodBeat.i(70123);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = Class.forName(mPackageName + ".svg.SVGBuildConfig");
      paramString = ((Class)localObject).getDeclaredField(paramString);
      paramString.setAccessible(true);
      paramString = paramString.get(localObject);
      AppMethodBeat.o(70123);
      return paramString;
    }
    catch (NoSuchFieldException paramString)
    {
      while (true)
      {
        c.printErrStackTrace("MicroMSG.WeChatSVGConfig", paramString, "NoSuchFieldException", new Object[0]);
        paramString = null;
        AppMethodBeat.o(70123);
      }
    }
    catch (IllegalArgumentException paramString)
    {
      while (true)
        c.printErrStackTrace("MicroMSG.WeChatSVGConfig", paramString, "IllegalArgumentException", new Object[0]);
    }
    catch (ClassNotFoundException paramString)
    {
      while (true)
        c.printErrStackTrace("MicroMSG.WeChatSVGConfig", paramString, "ClassNotFoundException", new Object[0]);
    }
    catch (IllegalAccessException paramString)
    {
      while (true)
        c.printErrStackTrace("MicroMSG.WeChatSVGConfig", paramString, "IllegalAccessException", new Object[0]);
    }
  }

  public static void cY(String paramString)
  {
    mPackageName = paramString;
  }

  public static final boolean dvJ()
  {
    return ydu;
  }

  public static final boolean dvK()
  {
    AppMethodBeat.i(70124);
    Object localObject;
    if (!eMP)
    {
      localObject = aqy("WxSVGCode");
      if (localObject == null)
      {
        ydt = false;
        c.i("MicroMSG.WeChatSVGConfig", "Initialized mUsingWeChatSVGCode %s", new Object[] { Boolean.valueOf(ydt) });
        eMP = true;
      }
    }
    else
    {
      if (ydt)
        break label77;
      AppMethodBeat.o(70124);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      ydt = ((Boolean)localObject).booleanValue();
      break;
      label77: AppMethodBeat.o(70124);
    }
  }

  public static final Class<?> dvL()
  {
    AppMethodBeat.i(70125);
    Object localObject = aqy("WxSVGRawClass");
    if (localObject != null)
    {
      localObject = (Class)localObject;
      AppMethodBeat.o(70125);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(70125);
    }
  }

  public static long dvM()
  {
    AppMethodBeat.i(70126);
    long l = System.nanoTime();
    AppMethodBeat.o(70126);
    return l;
  }

  public static long mW(long paramLong)
  {
    AppMethodBeat.i(70127);
    paramLong = (System.nanoTime() - paramLong) / 1000L;
    AppMethodBeat.o(70127);
    return paramLong;
  }

  public static final void pu(boolean paramBoolean)
  {
    ydu = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.svg.b.b
 * JD-Core Version:    0.6.2
 */