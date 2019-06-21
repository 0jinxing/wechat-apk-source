package com.tencent.tinker.loader.shareutil;

import com.tencent.tinker.loader.TinkerRuntimeException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShareResPatchInfo
{
  public String AEV = null;
  public String AEW = null;
  public ArrayList<String> AEX = new ArrayList();
  public ArrayList<String> AEY = new ArrayList();
  public ArrayList<String> AEZ = new ArrayList();
  public HashMap<String, File> AFa = new HashMap();
  public ArrayList<String> AFb = new ArrayList();
  public HashMap<String, LargeModeInfo> AFc = new HashMap();
  public HashSet<Pattern> AFd = new HashSet();

  public static void a(String paramString, ShareResPatchInfo paramShareResPatchInfo)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return;
    String[] arrayOfString = paramString.split("\n");
    int i = 0;
    label21: int j;
    if (i < arrayOfString.length)
    {
      paramString = arrayOfString[i];
      j = i;
      if (paramString != null)
      {
        j = i;
        if (paramString.length() > 0)
        {
          if (!paramString.startsWith("resources_out.zip"))
            break label90;
          paramString = paramString.split(",", 3);
          paramShareResPatchInfo.AEV = paramString[1];
          paramShareResPatchInfo.AEW = paramString[2];
          j = i;
        }
      }
    }
    label90: label224: 
    do
    {
      HashSet localHashSet;
      Object localObject;
      while (true)
      {
        i = j + 1;
        break label21;
        break;
        if (!paramString.startsWith("pattern:"))
          break label224;
        for (j = Integer.parseInt(paramString.split(":", 2)[1]); j > 0; j--)
        {
          localHashSet = paramShareResPatchInfo.AFd;
          localObject = arrayOfString[(i + 1)];
          paramString = (String)localObject;
          if (((String)localObject).contains("."))
            paramString = ((String)localObject).replaceAll("\\.", "\\\\.");
          localObject = paramString;
          if (paramString.contains("?"))
            localObject = paramString.replaceAll("\\?", "\\.");
          paramString = (String)localObject;
          if (((String)localObject).contains("*"))
            paramString = ((String)localObject).replace("*", ".*");
          localHashSet.add(Pattern.compile(paramString));
          i++;
        }
        j = i;
      }
      if (paramString.startsWith("add:"))
        for (k = Integer.parseInt(paramString.split(":", 2)[1]); ; k--)
        {
          j = i;
          if (k <= 0)
            break;
          paramShareResPatchInfo.AEX.add(arrayOfString[(i + 1)]);
          i++;
        }
      if (paramString.startsWith("modify:"))
        for (k = Integer.parseInt(paramString.split(":", 2)[1]); ; k--)
        {
          j = i;
          if (k <= 0)
            break;
          paramShareResPatchInfo.AEZ.add(arrayOfString[(i + 1)]);
          i++;
        }
      if (paramString.startsWith("large modify:"))
        for (k = Integer.parseInt(paramString.split(":", 2)[1]); ; k--)
        {
          j = i;
          if (k <= 0)
            break;
          paramString = arrayOfString[(i + 1)].split(",", 3);
          localHashSet = paramString[0];
          localObject = new LargeModeInfo();
          ((LargeModeInfo)localObject).cvZ = paramString[1];
          ((LargeModeInfo)localObject).AFe = Long.parseLong(paramString[2]);
          paramShareResPatchInfo.AFb.add(localHashSet);
          paramShareResPatchInfo.AFc.put(localHashSet, localObject);
          i++;
        }
      if (paramString.startsWith("delete:"))
        for (k = Integer.parseInt(paramString.split(":", 2)[1]); ; k--)
        {
          j = i;
          if (k <= 0)
            break;
          paramShareResPatchInfo.AEY.add(arrayOfString[(i + 1)]);
          i++;
        }
      j = i;
    }
    while (!paramString.startsWith("store:"));
    for (int k = Integer.parseInt(paramString.split(":", 2)[1]); ; k--)
    {
      j = i;
      if (k <= 0)
        break;
      paramShareResPatchInfo.AFa.put(arrayOfString[(i + 1)], null);
      i++;
    }
  }

  public static boolean a(ShareResPatchInfo paramShareResPatchInfo)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramShareResPatchInfo == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      paramShareResPatchInfo = paramShareResPatchInfo.AEW;
      bool2 = bool1;
      if (paramShareResPatchInfo != null)
      {
        bool2 = bool1;
        if (paramShareResPatchInfo.length() == 32)
          bool2 = true;
      }
    }
  }

  public static boolean a(HashSet<Pattern> paramHashSet, String paramString)
  {
    if (!paramHashSet.isEmpty())
    {
      paramHashSet = paramHashSet.iterator();
      do
        if (!paramHashSet.hasNext())
          break;
      while (!((Pattern)paramHashSet.next()).matcher(paramString).matches());
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void b(String paramString, ShareResPatchInfo paramShareResPatchInfo)
  {
    if ((paramString == null) || (paramString.length() == 0));
    while (true)
    {
      return;
      String str = paramString.split("\n")[0];
      if ((str == null) || (str.length() <= 0))
        throw new TinkerRuntimeException("res meta Corrupted:".concat(String.valueOf(paramString)));
      paramString = str.split(",", 3);
      paramShareResPatchInfo.AEV = paramString[1];
      paramShareResPatchInfo.AEW = paramString[2];
    }
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("resArscMd5:" + this.AEW + "\n");
    localStringBuffer.append("arscBaseCrc:" + this.AEV + "\n");
    Object localObject1 = this.AFd.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Pattern)((Iterator)localObject1).next();
      localStringBuffer.append("pattern:" + localObject2 + "\n");
    }
    Object localObject2 = this.AEX.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      localStringBuffer.append("addedSet:" + (String)localObject1 + "\n");
    }
    localObject2 = this.AEZ.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      localStringBuffer.append("modifiedSet:" + (String)localObject1 + "\n");
    }
    localObject1 = this.AFb.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localStringBuffer.append("largeModifiedSet:" + (String)localObject2 + "\n");
    }
    localObject1 = this.AEY.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localStringBuffer.append("deletedSet:" + (String)localObject2 + "\n");
    }
    localObject2 = this.AFa.keySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      localStringBuffer.append("storeSet:" + (String)localObject1 + "\n");
    }
    return localStringBuffer.toString();
  }

  public static class LargeModeInfo
  {
    public long AFe;
    public String cvZ = null;
    public File file = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.ShareResPatchInfo
 * JD-Core Version:    0.6.2
 */