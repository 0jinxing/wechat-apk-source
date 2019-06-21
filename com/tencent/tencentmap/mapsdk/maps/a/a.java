package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class a
{
  private static ClassLoader a = null;
  private static boolean b = true;

  public static Object a(String paramString, boolean paramBoolean, ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(98400);
    Iterator localIterator = a(paramString).iterator();
    paramString = null;
    Object localObject = null;
    String str1 = null;
    while (localIterator.hasNext())
    {
      paramString = b((String)localIterator.next(), paramBoolean, paramClassLoader);
      String str2;
      if ((paramString instanceof String))
      {
        if ("Array".equals((String)paramString))
        {
          if (str1 != null)
            break label284;
          paramString = Array.newInstance(Byte.class, 0);
        }
        else
        {
          if ("?".equals((String)paramString))
            break label284;
          if (str1 == null)
          {
            str2 = paramString;
            str1 = paramString;
            paramString = str2;
          }
          else
          {
            str2 = paramString;
            localObject = str1;
            str1 = paramString;
            paramString = str2;
          }
        }
      }
      else if ((paramString instanceof List))
      {
        if ((str1 != null) && ((str1 instanceof Byte)))
        {
          paramString = Array.newInstance(Byte.class, 1);
          Array.set(paramString, 0, str1);
        }
        else
        {
          if (str1 != null)
            ((List)paramString).add(str1);
          str1 = null;
        }
      }
      else
      {
        if ((paramString instanceof Map))
        {
          int i;
          if (str1 != null)
          {
            i = 1;
            label199: if (localObject == null)
              break label244;
          }
          label244: for (int j = 1; ; j = 0)
          {
            if ((j & i) != 0)
              ((Map)paramString).put(str1, localObject);
            localObject = null;
            str1 = null;
            break;
            i = 0;
            break label199;
          }
        }
        if (str1 == null)
        {
          str2 = paramString;
          str1 = paramString;
          paramString = str2;
        }
        else
        {
          localObject = str1;
          str1 = paramString;
        }
      }
    }
    label284: 
    while (true)
    {
      break;
      AppMethodBeat.o(98400);
      return paramString;
    }
  }

  public static String a(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(98399);
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramArrayList.size(); i++)
      paramArrayList.set(i, b((String)paramArrayList.get(i)));
    Collections.reverse(paramArrayList);
    i = 0;
    if (i < paramArrayList.size())
    {
      String str = (String)paramArrayList.get(i);
      if (str.equals("list"))
      {
        paramArrayList.set(i - 1, "<" + (String)paramArrayList.get(i - 1));
        paramArrayList.set(0, (String)paramArrayList.get(0) + ">");
      }
      while (true)
      {
        i++;
        break;
        if (str.equals("map"))
        {
          paramArrayList.set(i - 1, "<" + (String)paramArrayList.get(i - 1) + ",");
          paramArrayList.set(0, (String)paramArrayList.get(0) + ">");
        }
        else if (str.equals("Array"))
        {
          paramArrayList.set(i - 1, "<" + (String)paramArrayList.get(i - 1));
          paramArrayList.set(0, (String)paramArrayList.get(0) + ">");
        }
      }
    }
    Collections.reverse(paramArrayList);
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
      localStringBuffer.append((String)paramArrayList.next());
    paramArrayList = localStringBuffer.toString();
    AppMethodBeat.o(98399);
    return paramArrayList;
  }

  public static ArrayList<String> a(String paramString)
  {
    AppMethodBeat.i(98398);
    ArrayList localArrayList = new ArrayList();
    int i = paramString.indexOf("<");
    int j = 0;
    while (j < i)
    {
      a(localArrayList, paramString.substring(j, i));
      int k = i + 1;
      i = paramString.indexOf("<", k);
      int m = paramString.indexOf(",", k);
      int n = i;
      if (i == -1)
        n = m;
      i = n;
      j = k;
      if (m != -1)
      {
        i = n;
        j = k;
        if (m < n)
        {
          i = m;
          j = k;
        }
      }
    }
    a(localArrayList, paramString.substring(j, paramString.length()));
    AppMethodBeat.o(98398);
    return localArrayList;
  }

  private static void a(ArrayList<String> paramArrayList, String paramString)
  {
    AppMethodBeat.i(98397);
    int i = paramString.length();
    int j;
    do
    {
      j = i;
      if (paramString.charAt(i - 1) != '>')
        break;
      j = i - 1;
      i = j;
    }
    while (j != 0);
    paramArrayList.add(0, c(paramString.substring(0, j)));
    AppMethodBeat.o(98397);
  }

  public static Object b(String paramString, boolean paramBoolean, ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(98401);
    if (paramString.equals("java.lang.Integer"))
    {
      paramString = Integer.valueOf(0);
      AppMethodBeat.o(98401);
    }
    while (true)
    {
      return paramString;
      if (paramString.equals("java.lang.Boolean"))
      {
        paramString = Boolean.FALSE;
        AppMethodBeat.o(98401);
      }
      else if (paramString.equals("java.lang.Byte"))
      {
        paramString = Byte.valueOf((byte)0);
        AppMethodBeat.o(98401);
      }
      else if (paramString.equals("java.lang.Double"))
      {
        paramString = Double.valueOf(0.0D);
        AppMethodBeat.o(98401);
      }
      else if (paramString.equals("java.lang.Float"))
      {
        paramString = Float.valueOf(0.0F);
        AppMethodBeat.o(98401);
      }
      else if (paramString.equals("java.lang.Long"))
      {
        paramString = Long.valueOf(0L);
        AppMethodBeat.o(98401);
      }
      else if (paramString.equals("java.lang.Short"))
      {
        paramString = Short.valueOf((short)0);
        AppMethodBeat.o(98401);
      }
      else
      {
        if (paramString.equals("java.lang.Character"))
        {
          paramString = new IllegalArgumentException("can not support java.lang.Character");
          AppMethodBeat.o(98401);
          throw paramString;
        }
        if (paramString.equals("java.lang.String"))
        {
          paramString = "";
          AppMethodBeat.o(98401);
        }
        else if (paramString.equals("java.util.List"))
        {
          paramString = new ArrayList();
          AppMethodBeat.o(98401);
        }
        else if (paramString.equals("java.util.Map"))
        {
          paramString = new HashMap();
          AppMethodBeat.o(98401);
        }
        else if (paramString.equals("Array"))
        {
          paramString = "Array";
          AppMethodBeat.o(98401);
        }
        else if (paramString.equals("?"))
        {
          AppMethodBeat.o(98401);
        }
        else
        {
          if (paramClassLoader != null);
          try
          {
            paramString = Class.forName(paramString, paramBoolean, paramClassLoader);
            while (true)
            {
              paramString = paramString.getConstructor(new Class[0]).newInstance(new Object[0]);
              AppMethodBeat.o(98401);
              break;
              if (a != null)
                paramString = Class.forName(paramString, b, a);
              else
                paramString = Class.forName(paramString);
            }
          }
          catch (Exception paramString)
          {
            paramString = new b(paramString);
            AppMethodBeat.o(98401);
          }
        }
      }
    }
    throw paramString;
  }

  public static String b(String paramString)
  {
    AppMethodBeat.i(98402);
    if ((paramString.equals("java.lang.Integer")) || (paramString.equals("int")))
    {
      paramString = "int32";
      AppMethodBeat.o(98402);
    }
    while (true)
    {
      return paramString;
      if ((paramString.equals("java.lang.Boolean")) || (paramString.equals("boolean")))
      {
        paramString = "bool";
        AppMethodBeat.o(98402);
      }
      else if ((paramString.equals("java.lang.Byte")) || (paramString.equals("byte")))
      {
        paramString = "char";
        AppMethodBeat.o(98402);
      }
      else if ((paramString.equals("java.lang.Double")) || (paramString.equals("double")))
      {
        paramString = "double";
        AppMethodBeat.o(98402);
      }
      else if ((paramString.equals("java.lang.Float")) || (paramString.equals("float")))
      {
        paramString = "float";
        AppMethodBeat.o(98402);
      }
      else if ((paramString.equals("java.lang.Long")) || (paramString.equals("long")))
      {
        paramString = "int64";
        AppMethodBeat.o(98402);
      }
      else if ((paramString.equals("java.lang.Short")) || (paramString.equals("short")))
      {
        paramString = "short";
        AppMethodBeat.o(98402);
      }
      else
      {
        if (paramString.equals("java.lang.Character"))
        {
          paramString = new IllegalArgumentException("can not support java.lang.Character");
          AppMethodBeat.o(98402);
          throw paramString;
        }
        if (paramString.equals("java.lang.String"))
        {
          paramString = "string";
          AppMethodBeat.o(98402);
        }
        else if (paramString.equals("java.util.List"))
        {
          paramString = "list";
          AppMethodBeat.o(98402);
        }
        else if (paramString.equals("java.util.Map"))
        {
          paramString = "map";
          AppMethodBeat.o(98402);
        }
        else
        {
          AppMethodBeat.o(98402);
        }
      }
    }
  }

  public static String c(String paramString)
  {
    AppMethodBeat.i(98403);
    if (paramString.equals("int32"))
    {
      paramString = "java.lang.Integer";
      AppMethodBeat.o(98403);
    }
    while (true)
    {
      return paramString;
      if (paramString.equals("bool"))
      {
        paramString = "java.lang.Boolean";
        AppMethodBeat.o(98403);
      }
      else if (paramString.equals("char"))
      {
        paramString = "java.lang.Byte";
        AppMethodBeat.o(98403);
      }
      else if (paramString.equals("double"))
      {
        paramString = "java.lang.Double";
        AppMethodBeat.o(98403);
      }
      else if (paramString.equals("float"))
      {
        paramString = "java.lang.Float";
        AppMethodBeat.o(98403);
      }
      else if (paramString.equals("int64"))
      {
        paramString = "java.lang.Long";
        AppMethodBeat.o(98403);
      }
      else if (paramString.equals("short"))
      {
        paramString = "java.lang.Short";
        AppMethodBeat.o(98403);
      }
      else if (paramString.equals("string"))
      {
        paramString = "java.lang.String";
        AppMethodBeat.o(98403);
      }
      else if (paramString.equals("list"))
      {
        paramString = "java.util.List";
        AppMethodBeat.o(98403);
      }
      else if (paramString.equals("map"))
      {
        paramString = "java.util.Map";
        AppMethodBeat.o(98403);
      }
      else
      {
        AppMethodBeat.o(98403);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.a
 * JD-Core Version:    0.6.2
 */