package com.google.a.a;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class f
{
  private static void a(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    int i;
    Class localClass;
    int m;
    String str;
    Object localObject3;
    if (paramObject != null)
    {
      if (!(paramObject instanceof e))
        break label386;
      i = paramStringBuffer1.length();
      if (paramString != null)
      {
        paramStringBuffer2.append(paramStringBuffer1).append(bg(paramString)).append(" <\n");
        paramStringBuffer1.append("  ");
      }
      localClass = paramObject.getClass();
      for (Object localObject2 : localClass.getFields())
      {
        m = localObject2.getModifiers();
        str = localObject2.getName();
        if (((m & 0x1) == 1) && ((m & 0x8) != 8) && (!str.startsWith("_")) && (!str.endsWith("_")))
        {
          localObject3 = localObject2.getType();
          localObject2 = localObject2.get(paramObject);
          if ((((Class)localObject3).isArray()) && (((Class)localObject3).getComponentType() != Byte.TYPE))
          {
            if (localObject2 == null);
            for (m = 0; ; m = Array.getLength(localObject2))
              for (int n = 0; n < m; n++)
                a(str, Array.get(localObject2, n), paramStringBuffer1, paramStringBuffer2);
          }
          a(str, localObject2, paramStringBuffer1, paramStringBuffer2);
        }
      }
      localObject3 = localClass.getMethods();
      m = localObject3.length;
      ??? = 0;
    }
    while (true)
    {
      if (??? < m)
      {
        str = localObject3[???].getName();
        if (str.startsWith("set"))
          str = str.substring(3);
      }
      try
      {
        ??? = localClass.getMethod("has".concat(String.valueOf(str)), new Class[0]);
        if (((Boolean)((Method)???).invoke(paramObject, new Object[0])).booleanValue());
        try
        {
          ??? = localClass.getMethod("get".concat(String.valueOf(str)), new Class[0]);
          a(str, ((Method)???).invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
          label358: ???++;
          continue;
          if (paramString != null)
          {
            paramStringBuffer1.setLength(i);
            paramStringBuffer2.append(paramStringBuffer1).append(">\n");
          }
          return;
          label386: paramString = bg(paramString);
          paramStringBuffer2.append(paramStringBuffer1).append(paramString).append(": ");
          if ((paramObject instanceof String))
          {
            paramObject = (String)paramObject;
            paramString = paramObject;
            if (!paramObject.startsWith("http"))
            {
              paramString = paramObject;
              if (paramObject.length() > 200)
                paramString = paramObject.substring(0, 200) + "[...]";
            }
            paramString = escapeString(paramString);
            paramStringBuffer2.append("\"").append(paramString).append("\"");
          }
          while (true)
          {
            paramStringBuffer2.append("\n");
            break;
            if ((paramObject instanceof byte[]))
              a((byte[])paramObject, paramStringBuffer2);
            else
              paramStringBuffer2.append(paramObject);
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          break label358;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        break label358;
      }
    }
  }

  private static void a(byte[] paramArrayOfByte, StringBuffer paramStringBuffer)
  {
    if (paramArrayOfByte == null)
      paramStringBuffer.append("\"\"");
    while (true)
    {
      return;
      paramStringBuffer.append('"');
      int i = 0;
      if (i < paramArrayOfByte.length)
      {
        int j = paramArrayOfByte[i];
        if ((j == 92) || (j == 34))
          paramStringBuffer.append('\\').append((char)j);
        while (true)
        {
          i++;
          break;
          if ((j >= 32) && (j < 127))
            paramStringBuffer.append((char)j);
          else
            paramStringBuffer.append(String.format("\\%03o", new Object[] { Integer.valueOf(j) }));
        }
      }
      paramStringBuffer.append('"');
    }
  }

  private static String bg(String paramString)
  {
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
    return localStringBuffer.toString();
  }

  public static <T extends e> String c(T paramT)
  {
    StringBuffer localStringBuffer1 = new StringBuffer();
    try
    {
      StringBuffer localStringBuffer2 = new java/lang/StringBuffer;
      localStringBuffer2.<init>();
      a(null, paramT, localStringBuffer2, localStringBuffer1);
      paramT = localStringBuffer1.toString();
      return paramT;
    }
    catch (IllegalAccessException paramT)
    {
      while (true)
        paramT = "Error printing proto: " + paramT.getMessage();
    }
    catch (InvocationTargetException paramT)
    {
      while (true)
        paramT = "Error printing proto: " + paramT.getMessage();
    }
  }

  private static String escapeString(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(i);
    int j = 0;
    if (j < i)
    {
      char c = paramString.charAt(j);
      if ((c >= ' ') && (c <= '~') && (c != '"') && (c != '\''))
        localStringBuilder.append(c);
      while (true)
      {
        j++;
        break;
        localStringBuilder.append(String.format("\\u%04x", new Object[] { Integer.valueOf(c) }));
      }
    }
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.a.a.f
 * JD-Core Version:    0.6.2
 */