package com.tencent.tinker.loader.shareutil;

import com.tencent.tinker.loader.TinkerRuntimeException;
import java.util.ArrayList;

public class ShareDexDiffPatchInfo
{
  public final String ADN;
  public final String ADO;
  public final String ADP;
  public final String ADQ;
  public final String ADR;
  public final String ADS;
  public final String ADT;
  public final boolean ADU;
  public final String eBb;
  public final String path;

  public ShareDexDiffPatchInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.ADN = paramString1;
    this.path = paramString2;
    this.ADO = paramString3;
    this.ADP = paramString4;
    this.ADS = paramString5;
    this.ADQ = paramString6;
    this.ADR = paramString7;
    this.ADT = paramString8;
    if (paramString8.equals("jar"))
    {
      this.ADU = true;
      if (SharePatchFileUtil.aut(paramString1))
        this.eBb = (paramString1 + ".jar");
    }
    while (true)
    {
      return;
      this.eBb = paramString1;
      continue;
      if (!paramString8.equals("raw"))
        break;
      this.ADU = false;
      this.eBb = paramString1;
    }
    throw new TinkerRuntimeException("can't recognize dex mode:".concat(String.valueOf(paramString8)));
  }

  public static boolean c(ShareDexDiffPatchInfo paramShareDexDiffPatchInfo)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramShareDexDiffPatchInfo == null)
    {
      bool2 = bool1;
      return bool2;
    }
    String str = paramShareDexDiffPatchInfo.ADN;
    if (ShareTinkerInternals.dSp());
    for (paramShareDexDiffPatchInfo = paramShareDexDiffPatchInfo.ADP; ; paramShareDexDiffPatchInfo = paramShareDexDiffPatchInfo.ADO)
    {
      bool2 = bool1;
      if (str == null)
        break;
      bool2 = bool1;
      if (str.length() <= 0)
        break;
      bool2 = bool1;
      if (paramShareDexDiffPatchInfo == null)
        break;
      bool2 = bool1;
      if (paramShareDexDiffPatchInfo.length() != 32)
        break;
      bool2 = true;
      break;
    }
  }

  public static void o(String paramString, ArrayList<ShareDexDiffPatchInfo> paramArrayList)
  {
    if ((paramString == null) || (paramString.length() == 0));
    while (true)
    {
      return;
      for (String[] arrayOfString : paramString.split("\n"))
        if ((arrayOfString != null) && (arrayOfString.length() > 0))
        {
          arrayOfString = arrayOfString.split(",", 8);
          if ((arrayOfString != null) && (arrayOfString.length >= 8))
            paramArrayList.add(new ShareDexDiffPatchInfo(arrayOfString[0].trim(), arrayOfString[1].trim(), arrayOfString[2].trim(), arrayOfString[3].trim(), arrayOfString[4].trim(), arrayOfString[5].trim(), arrayOfString[6].trim(), arrayOfString[7].trim()));
        }
    }
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.ADN);
    localStringBuffer.append(",");
    localStringBuffer.append(this.path);
    localStringBuffer.append(",");
    localStringBuffer.append(this.ADO);
    localStringBuffer.append(",");
    localStringBuffer.append(this.ADP);
    localStringBuffer.append(",");
    localStringBuffer.append(this.ADQ);
    localStringBuffer.append(",");
    localStringBuffer.append(this.ADR);
    localStringBuffer.append(",");
    localStringBuffer.append(this.ADS);
    localStringBuffer.append(",");
    localStringBuffer.append(this.ADT);
    return localStringBuffer.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo
 * JD-Core Version:    0.6.2
 */