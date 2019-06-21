package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzacf
{
  private static void zza(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    AppMethodBeat.i(3517);
    int m;
    if (paramObject != null)
    {
      if ((paramObject instanceof zzace))
      {
        int i = paramStringBuffer1.length();
        if (paramString != null)
        {
          paramStringBuffer2.append(paramStringBuffer1).append(zzfn(paramString)).append(" <\n");
          paramStringBuffer1.append("  ");
        }
        Class localClass = paramObject.getClass();
        Object localObject3;
        for (Object localObject2 : localClass.getFields())
        {
          m = localObject2.getModifiers();
          localObject3 = localObject2.getName();
          if ((!"cachedSize".equals(localObject3)) && ((m & 0x1) == 1) && ((m & 0x8) != 8) && (!((String)localObject3).startsWith("_")) && (!((String)localObject3).endsWith("_")))
          {
            localObject4 = localObject2.getType();
            localObject2 = localObject2.get(paramObject);
            if ((((Class)localObject4).isArray()) && (((Class)localObject4).getComponentType() != Byte.TYPE))
            {
              if (localObject2 == null);
              for (m = 0; ; m = Array.getLength(localObject2))
                for (int n = 0; n < m; n++)
                  zza((String)localObject3, Array.get(localObject2, n), paramStringBuffer1, paramStringBuffer2);
            }
            zza((String)localObject3, localObject2, paramStringBuffer1, paramStringBuffer2);
          }
        }
        Object localObject4 = localClass.getMethods();
        m = localObject4.length;
        ??? = 0;
        while (true)
          if (??? < m)
          {
            localObject3 = localObject4[???].getName();
            if (((String)localObject3).startsWith("set"))
              ??? = ((String)localObject3).substring(3);
            try
            {
              localObject3 = String.valueOf(???);
              if (((String)localObject3).length() != 0)
              {
                localObject3 = "has".concat((String)localObject3);
                label320: localObject3 = localClass.getMethod((String)localObject3, new Class[0]);
                if (!((Boolean)((Method)localObject3).invoke(paramObject, new Object[0])).booleanValue());
              }
            }
            catch (NoSuchMethodException localNoSuchMethodException1)
            {
              try
              {
                localObject3 = String.valueOf(???);
                if (((String)localObject3).length() != 0);
                label406: String str;
                for (localObject3 = "get".concat((String)localObject3); ; str = new String("get"))
                {
                  localObject3 = localClass.getMethod((String)localObject3, new Class[0]);
                  zza((String)???, ((Method)localObject3).invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
                  while (true)
                  {
                    ???++;
                    break;
                    localObject3 = new String("has");
                    break label320;
                    localNoSuchMethodException1 = localNoSuchMethodException1;
                  }
                }
              }
              catch (NoSuchMethodException localNoSuchMethodException2)
              {
                break label406;
              }
            }
          }
        if (paramString != null)
        {
          paramStringBuffer1.setLength(i);
          paramStringBuffer2.append(paramStringBuffer1).append(">\n");
        }
        AppMethodBeat.o(3517);
        return;
      }
      paramString = zzfn(paramString);
      paramStringBuffer2.append(paramStringBuffer1).append(paramString).append(": ");
      if (!(paramObject instanceof String))
        break label687;
      paramObject = (String)paramObject;
      paramString = paramObject;
      if (!paramObject.startsWith("http"))
      {
        paramString = paramObject;
        if (paramObject.length() > 200)
          paramString = String.valueOf(paramObject.substring(0, 200)).concat("[...]");
      }
      m = paramString.length();
      paramObject = new StringBuilder(m);
      ??? = 0;
      if (??? < m)
      {
        char c = paramString.charAt(???);
        if ((c >= ' ') && (c <= '~') && (c != '"') && (c != '\''))
          paramObject.append(c);
        while (true)
        {
          ???++;
          break;
          paramObject.append(String.format("\\u%04x", new Object[] { Integer.valueOf(c) }));
        }
      }
      paramString = paramObject.toString();
      paramStringBuffer2.append("\"").append(paramString).append("\"");
    }
    while (true)
    {
      paramStringBuffer2.append("\n");
      AppMethodBeat.o(3517);
      break;
      label687: if ((paramObject instanceof byte[]))
      {
        paramString = (byte[])paramObject;
        if (paramString == null)
        {
          paramStringBuffer2.append("\"\"");
        }
        else
        {
          paramStringBuffer2.append('"');
          ??? = 0;
          if (??? < paramString.length)
          {
            m = paramString[???] & 0xFF;
            if ((m == 92) || (m == 34))
              paramStringBuffer2.append('\\').append((char)m);
            while (true)
            {
              ???++;
              break;
              if ((m >= 32) && (m < 127))
                paramStringBuffer2.append((char)m);
              else
                paramStringBuffer2.append(String.format("\\%03o", new Object[] { Integer.valueOf(m) }));
            }
          }
          paramStringBuffer2.append('"');
        }
      }
      else
      {
        paramStringBuffer2.append(paramObject);
      }
    }
  }

  public static <T extends zzace> String zzc(T paramT)
  {
    AppMethodBeat.i(3516);
    if (paramT == null)
    {
      paramT = "";
      AppMethodBeat.o(3516);
    }
    while (true)
    {
      return paramT;
      StringBuffer localStringBuffer1 = new StringBuffer();
      try
      {
        StringBuffer localStringBuffer2 = new java/lang/StringBuffer;
        localStringBuffer2.<init>();
        zza(null, paramT, localStringBuffer2, localStringBuffer1);
        paramT = localStringBuffer1.toString();
        AppMethodBeat.o(3516);
      }
      catch (IllegalAccessException paramT)
      {
        paramT = String.valueOf(paramT.getMessage());
        if (paramT.length() != 0)
        {
          paramT = "Error printing proto: ".concat(paramT);
          AppMethodBeat.o(3516);
        }
        else
        {
          paramT = new String("Error printing proto: ");
          AppMethodBeat.o(3516);
        }
      }
      catch (InvocationTargetException paramT)
      {
        paramT = String.valueOf(paramT.getMessage());
        if (paramT.length() != 0)
        {
          paramT = "Error printing proto: ".concat(paramT);
          AppMethodBeat.o(3516);
        }
        else
        {
          paramT = new String("Error printing proto: ");
          AppMethodBeat.o(3516);
        }
      }
    }
  }

  private static String zzfn(String paramString)
  {
    AppMethodBeat.i(3518);
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    if (i < paramString.length())
    {
      char c = paramString.charAt(i);
      if (i == 0)
        localStringBuffer.append(Character.toLowerCase(c));
      while (true)
      {
        i++;
        break;
        if (Character.isUpperCase(c))
          localStringBuffer.append('_').append(Character.toLowerCase(c));
        else
          localStringBuffer.append(c);
      }
    }
    paramString = localStringBuffer.toString();
    AppMethodBeat.o(3518);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzacf
 * JD-Core Version:    0.6.2
 */