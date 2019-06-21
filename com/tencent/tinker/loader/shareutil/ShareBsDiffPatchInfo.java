package com.tencent.tinker.loader.shareutil;

import java.util.ArrayList;

public class ShareBsDiffPatchInfo
{
  public String ADL;
  public String cdy;
  public String cvZ;
  public String name;
  public String path;

  private ShareBsDiffPatchInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.name = paramString1;
    this.cvZ = paramString2;
    this.ADL = paramString4;
    this.cdy = paramString5;
    this.path = paramString3;
  }

  public static boolean a(ShareBsDiffPatchInfo paramShareBsDiffPatchInfo)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramShareBsDiffPatchInfo == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      String str = paramShareBsDiffPatchInfo.name;
      paramShareBsDiffPatchInfo = paramShareBsDiffPatchInfo.cvZ;
      bool2 = bool1;
      if (str != null)
      {
        bool2 = bool1;
        if (str.length() > 0)
        {
          bool2 = bool1;
          if (paramShareBsDiffPatchInfo != null)
          {
            bool2 = bool1;
            if (paramShareBsDiffPatchInfo.length() == 32)
              bool2 = true;
          }
        }
      }
    }
  }

  public static void n(String paramString, ArrayList<ShareBsDiffPatchInfo> paramArrayList)
  {
    if ((paramString == null) || (paramString.length() == 0));
    while (true)
    {
      return;
      for (String[] arrayOfString : paramString.split("\n"))
        if ((arrayOfString != null) && (arrayOfString.length() > 0))
        {
          arrayOfString = arrayOfString.split(",", 5);
          if ((arrayOfString != null) && (arrayOfString.length >= 5))
          {
            String str1 = arrayOfString[0].trim();
            String str2 = arrayOfString[1].trim();
            paramArrayList.add(new ShareBsDiffPatchInfo(str1, arrayOfString[2].trim(), str2, arrayOfString[3].trim(), arrayOfString[4].trim()));
          }
        }
    }
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.name);
    localStringBuffer.append(",");
    localStringBuffer.append(this.path);
    localStringBuffer.append(",");
    localStringBuffer.append(this.cvZ);
    localStringBuffer.append(",");
    localStringBuffer.append(this.ADL);
    localStringBuffer.append(",");
    localStringBuffer.append(this.cdy);
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo
 * JD-Core Version:    0.6.2
 */