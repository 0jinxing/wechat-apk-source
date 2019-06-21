package com.tencent.mars;

import android.content.Context;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.Arrays;

public class Mars
{
  private static volatile boolean hasInitialized = false;
  private static ArrayList<String[]> libModules = new ArrayList();

  public static void checkLoadedModules(ArrayList<String> paramArrayList, String paramString)
  {
    if (paramArrayList == null)
      return;
    while (true)
      try
      {
        String[] arrayOfString = new String[0];
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("loaded modules: ");
        ab.i(paramString, Arrays.toString(paramArrayList.toArray(arrayOfString)));
        Arrays.sort(arrayOfString);
        libModules.add(arrayOfString);
        int i = 0;
        int j = 1;
        if (i < libModules.size())
        {
          if (!Arrays.equals((Object[])libModules.get(i), (Object[])libModules.get(0)))
          {
            j = 0;
            i++;
          }
        }
        else
        {
          i = j;
          if (j == 0)
          {
            int k = 0;
            i = j;
            if (k < libModules.size())
            {
              int m = k + 1;
              if (m < libModules.size())
              {
                if (!hasInterSection((String[])libModules.get(k), (String[])libModules.get(m)))
                {
                  i = 1;
                  j = i;
                  if (i == 0)
                    continue;
                  m++;
                  j = i;
                  continue;
                }
                i = 0;
                continue;
              }
              i = j;
              if (j != 0)
              {
                k++;
                continue;
              }
            }
          }
          if (i != 0)
            break;
          paramArrayList = new java/lang/IllegalStateException;
          paramArrayList.<init>("mars lib module custom made error, pls check your *.so.");
          throw paramArrayList;
        }
      }
      finally
      {
      }
  }

  private static boolean hasInterSection(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    boolean bool1 = false;
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfString1.length;
    for (int j = 0; j < i; j++)
      localArrayList.add(paramArrayOfString1[j]);
    i = paramArrayOfString2.length;
    for (j = 0; ; j++)
    {
      boolean bool2 = bool1;
      if (j < i)
      {
        if (localArrayList.contains(paramArrayOfString2[j]))
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  public static void init(Context paramContext, ak paramak)
  {
    PlatformComm.init(paramContext, paramak);
    hasInitialized = true;
  }

  public static void loadDefaultMarsLibrary()
  {
    try
    {
      System.loadLibrary("c++_shared");
      label5: return;
    }
    catch (Throwable localThrowable)
    {
      break label5;
    }
  }

  public static void onCreate(boolean paramBoolean)
  {
    if ((paramBoolean) && (hasInitialized))
      BaseEvent.onCreate();
    while (true)
    {
      return;
      if (paramBoolean)
        break;
      BaseEvent.onCreate();
    }
    throw new IllegalStateException("function MarsCore.init must be executed before Mars.onCreate when application firststartup.");
  }

  public static void onDestroy()
  {
    BaseEvent.onDestroy();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.Mars
 * JD-Core Version:    0.6.2
 */