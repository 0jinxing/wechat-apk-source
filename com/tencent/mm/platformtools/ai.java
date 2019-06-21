package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ai
{
  public static boolean a(Context paramContext, ArrayList<ai.c> paramArrayList, boolean paramBoolean)
  {
    AppMethodBeat.i(16711);
    if (paramArrayList.size() == 0)
    {
      paramBoolean = false;
      AppMethodBeat.o(16711);
      return paramBoolean;
    }
    Iterator localIterator = paramArrayList.iterator();
    label28: ai.c localc;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i;
    while (true)
      if (localIterator.hasNext())
      {
        localc = (ai.c)localIterator.next();
        if (!TextUtils.isEmpty(localc.ceO))
        {
          localObject1 = localc.ceO;
          localObject2 = new ArrayList();
          localObject3 = paramContext.getPackageResourcePath();
          if (Build.VERSION.SDK_INT >= 21)
          {
            paramArrayList = ((String)localObject3).split("/");
            if (paramArrayList != null)
            {
              i = 0;
              label104: if (i >= paramArrayList.length)
                break label843;
              if (!paramArrayList[i].contains(paramContext.getPackageName()))
                break label599;
            }
          }
        }
      }
    label259: label390: label796: label810: label830: label843: for (paramArrayList = paramArrayList[i]; ; paramArrayList = "")
    {
      if (!TextUtils.isEmpty(paramArrayList))
      {
        String str = ((String)localObject3).replace(paramArrayList, (String)localObject1 + "-1");
        if (new File(str).exists())
          ((List)localObject2).add(str);
        paramArrayList = ((String)localObject3).replace(paramArrayList, (String)localObject1 + "-2");
        if (new File(paramArrayList).exists())
          ((List)localObject2).add(paramArrayList);
      }
      label240: if (((List)localObject2).size() <= 0)
        break label28;
      localObject2 = ((List)localObject2).iterator();
      while (true)
        while (true)
        {
          if (!((Iterator)localObject2).hasNext())
            break label830;
          localObject1 = new File((String)((Iterator)localObject2).next());
          if (((File)localObject1).exists())
          {
            paramArrayList = "";
            try
            {
              long l = System.currentTimeMillis();
              label354: boolean bool;
              label489: int j;
              if (paramBoolean)
              {
                localObject1 = paramContext.getPackageManager().getPackageInfo(localc.ceO, 64);
                if (((PackageInfo)localObject1).signatures.length > 0)
                  paramArrayList = ag.ck(localObject1.signatures[(localObject1.signatures.length - 1)].toCharsString());
                localObject3 = localc.ceO;
                localObject1 = localc.gjJ;
                if ((!TextUtils.isEmpty(paramArrayList)) && (paramArrayList.equalsIgnoreCase(localc.gjJ)))
                {
                  bool = true;
                  ab.i("MicroMsg.YYBMarketVerify", "summertoken containLowerMarket usesSystemApi[%b], infopkg[%s], infoMD5[%s], sigMD5[%s], equal[%b], takes[%d]ms", new Object[] { Boolean.valueOf(paramBoolean), localObject3, localObject1, paramArrayList, Boolean.valueOf(bool), Long.valueOf(System.currentTimeMillis() - l) });
                  if ((TextUtils.isEmpty(paramArrayList)) || (!paramArrayList.equalsIgnoreCase(localc.gjJ)))
                    continue;
                  l = System.currentTimeMillis();
                  if (!paramBoolean)
                    break label796;
                  i = paramContext.getPackageManager().getPackageInfo(localc.ceO, 0).versionCode;
                  paramArrayList = localc.ceO;
                  j = localc.gjI;
                  if (i > localc.gjI)
                    break label810;
                }
              }
              else
              {
                for (bool = true; ; bool = false)
                {
                  ab.i("MicroMsg.YYBMarketVerify", "summertoken containLowerMarket usesSystemApi[%b], infopkg[%s], infovc[%d], versionCode[%d], less[%b], takes[%d]ms", new Object[] { Boolean.valueOf(paramBoolean), paramArrayList, Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(bool), Long.valueOf(System.currentTimeMillis() - l) });
                  j = localc.gjI;
                  if (i > j)
                    break label259;
                  paramBoolean = true;
                  AppMethodBeat.o(16711);
                  break;
                  label599: i++;
                  break label104;
                  localObject3 = ((String)localObject3).split("/");
                  if (localObject3 == null)
                    break label240;
                  paramArrayList = new StringBuilder();
                  for (i = 0; i < localObject3.length; i++)
                    if (i != localObject3.length - 1)
                    {
                      paramArrayList.append(localObject3[i]);
                      paramArrayList.append("/");
                    }
                  paramArrayList = paramArrayList.toString();
                  localObject3 = paramArrayList + (String)localObject1 + "-1.apk";
                  if (new File((String)localObject3).exists())
                    ((List)localObject2).add(localObject3);
                  paramArrayList = paramArrayList + (String)localObject1 + "-2.apk";
                  if (!new File(paramArrayList).exists())
                    break label240;
                  ((List)localObject2).add(paramArrayList);
                  break label240;
                  paramArrayList = ai.b.A(((File)localObject1).getAbsoluteFile());
                  break label354;
                  bool = false;
                  break label390;
                  i = ai.a.N(paramContext, localc.ceO);
                  break label489;
                }
              }
            }
            catch (Exception paramArrayList)
            {
              ab.printErrStackTrace("MicroMsg.YYBMarketVerify", paramArrayList, "", new Object[0]);
            }
          }
        }
      break label28;
      paramBoolean = false;
      AppMethodBeat.o(16711);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ai
 * JD-Core Version:    0.6.2
 */