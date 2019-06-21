package com.tencent.pb.common.c;

import java.util.Iterator;

public final class g
{
  public static String a(Iterable<?> paramIterable, String paramString1, String paramString2)
  {
    Iterator localIterator = paramIterable.iterator();
    paramIterable = new StringBuilder();
    while (localIterator.hasNext())
    {
      paramIterable.append(localIterator.next().toString().replace(paramString1, paramString2));
      if (localIterator.hasNext())
        paramIterable.append(paramString1);
    }
    return paramIterable.toString();
  }

  public static String atI(String paramString)
  {
    String str = paramString;
    if (isEmpty(paramString))
      str = "";
    return str;
  }

  public static boolean equals(String paramString1, String paramString2)
  {
    if ((paramString1 == paramString2) || ((paramString1 != null) && (paramString2 != null) && (paramString1.equals(paramString2))));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean iA(String paramString1, String paramString2)
  {
    boolean bool;
    if (paramString1 == null)
      if (paramString2 == null)
        bool = true;
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = paramString1.equals(paramString2);
    }
  }

  public static boolean isEmpty(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isNullOrEmpty(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString.trim())));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.c.g
 * JD-Core Version:    0.6.2
 */