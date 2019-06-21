package com.tencent.pb.common.c;

import com.tencent.pb.talkroom.sdk.e;
import com.tencent.wecall.talkroom.model.f;

public final class c
{
  private static int ApT = 2;
  private static boolean ApU = false;
  public static int level = 0;

  private static String J(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0));
    StringBuffer localStringBuffer;
    for (paramArrayOfObject = ""; ; paramArrayOfObject = localStringBuffer.toString())
    {
      return paramArrayOfObject;
      int i = paramArrayOfObject.length;
      localStringBuffer = new StringBuffer(250);
      int j = 0;
      if (j < i)
      {
        Object localObject = paramArrayOfObject[j];
        if (localObject != null)
        {
          localStringBuffer.append("|");
          if (!(localObject instanceof Throwable))
            break label79;
          localStringBuffer.append(((Throwable)localObject).getMessage());
        }
        while (true)
        {
          j++;
          break;
          label79: localStringBuffer.append(localObject.toString());
        }
      }
    }
  }

  private static void N(int paramInt, String paramString1, String paramString2)
  {
    e locale = f.dTA();
    if (locale != null)
      locale.y(paramInt, "MTSDK".concat(String.valueOf(paramString1)), paramString2);
  }

  public static void d(String paramString, Object[] paramArrayOfObject)
  {
    if ((!ApU) || (ApT > 1));
    while (true)
    {
      return;
      if (paramString != null)
        N(1, paramString, " ".concat(String.valueOf(J(paramArrayOfObject))));
    }
  }

  public static void dPK()
  {
    ApT = 0;
    ApU = true;
  }

  public static void e(String paramString, Object[] paramArrayOfObject)
  {
    if ((!ApU) || (ApT > 4));
    while (true)
    {
      return;
      N(4, paramString, " ".concat(String.valueOf(J(paramArrayOfObject))));
    }
  }

  public static void i(String paramString, Object[] paramArrayOfObject)
  {
    if ((!ApU) || (ApT > 2));
    while (true)
    {
      return;
      N(2, paramString, " ".concat(String.valueOf(J(paramArrayOfObject))));
    }
  }

  public static void w(String paramString, Object[] paramArrayOfObject)
  {
    if ((!ApU) || (ApT > 3));
    while (true)
    {
      return;
      if (paramString != null)
        N(3, paramString, " ".concat(String.valueOf(J(paramArrayOfObject))));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.c.c
 * JD-Core Version:    0.6.2
 */