package com.tencent.tinker.loader;

import android.annotation.TargetApi;
import android.content.Intent;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TinkerDexLoader
{
  private static boolean ABr = ShareTinkerInternals.dSp();
  private static final ArrayList<ShareDexDiffPatchInfo> ACy = new ArrayList();
  private static HashSet<ShareDexDiffPatchInfo> ACz = new HashSet();

  private static String a(ShareDexDiffPatchInfo paramShareDexDiffPatchInfo)
  {
    if (ABr);
    for (paramShareDexDiffPatchInfo = paramShareDexDiffPatchInfo.ADP; ; paramShareDexDiffPatchInfo = paramShareDexDiffPatchInfo.ADO)
      return paramShareDexDiffPatchInfo;
  }

  @TargetApi(14)
  public static boolean a(TinkerApplication paramTinkerApplication, String paramString1, String paramString2, Intent paramIntent, boolean paramBoolean)
  {
    if ((ACy.isEmpty()) && (ACz.isEmpty()))
      paramBoolean = true;
    while (true)
    {
      return paramBoolean;
      PathClassLoader localPathClassLoader = (PathClassLoader)TinkerDexLoader.class.getClassLoader();
      Object localObject1;
      ArrayList localArrayList;
      Iterator localIterator;
      if (localPathClassLoader != null)
      {
        new StringBuilder("classloader: ").append(localPathClassLoader.toString());
        localObject1 = paramString1 + "/dex/";
        localArrayList = new ArrayList();
        localIterator = ACy.iterator();
      }
      Object localObject2;
      Object localObject3;
      long l;
      while (true)
      {
        if (!localIterator.hasNext())
          break label261;
        localObject2 = (ShareDexDiffPatchInfo)localIterator.next();
        if (!b((ShareDexDiffPatchInfo)localObject2))
        {
          localObject3 = new File((String)localObject1 + ((ShareDexDiffPatchInfo)localObject2).eBb);
          if (paramTinkerApplication.isTinkerLoadVerifyFlag())
          {
            l = System.currentTimeMillis();
            if (!SharePatchFileUtil.h((File)localObject3, a((ShareDexDiffPatchInfo)localObject2)))
            {
              ShareIntentUtil.b(paramIntent, -13);
              paramIntent.putExtra("intent_patch_mismatch_dex_path", ((File)localObject3).getAbsolutePath());
              paramBoolean = false;
              break;
              ShareIntentUtil.b(paramIntent, -12);
              paramBoolean = false;
              break;
            }
            new StringBuilder("verify dex file:").append(((File)localObject3).getPath()).append(" md5, use time: ").append(System.currentTimeMillis() - l);
          }
          localArrayList.add(localObject3);
        }
      }
      label261: if ((ABr) && (!ACz.isEmpty()))
      {
        localObject1 = new File((String)localObject1 + "tinker_classN.apk");
        l = System.currentTimeMillis();
        if (paramTinkerApplication.isTinkerLoadVerifyFlag())
        {
          localObject2 = ACz.iterator();
          while (true)
            if (((Iterator)localObject2).hasNext())
            {
              localObject3 = (ShareDexDiffPatchInfo)((Iterator)localObject2).next();
              if (!SharePatchFileUtil.b((File)localObject1, ((ShareDexDiffPatchInfo)localObject3).ADN, ((ShareDexDiffPatchInfo)localObject3).ADP))
              {
                ShareIntentUtil.b(paramIntent, -13);
                paramIntent.putExtra("intent_patch_mismatch_dex_path", ((File)localObject1).getAbsolutePath());
                paramBoolean = false;
                break;
              }
            }
        }
        new StringBuilder("verify dex file:").append(((File)localObject1).getPath()).append(" md5, use time: ").append(System.currentTimeMillis() - l);
        localArrayList.add(localObject1);
      }
      paramString2 = new File(paramString1 + "/" + paramString2);
      if (paramBoolean)
      {
        localObject2 = new boolean[1];
        localObject2[0] = 1;
        localObject3 = new Throwable[1];
        try
        {
          localObject1 = ShareTinkerInternals.dSs();
          aul(paramString1);
          paramString2 = new File(paramString1 + "/interpet");
          TinkerDexOptimizer.a(localArrayList, paramString2, true, (String)localObject1, new TinkerDexOptimizer.ResultCallback()
          {
            long start;

            public final void ai(File paramAnonymousFile)
            {
              this.start = System.currentTimeMillis();
              new StringBuilder("start to optimize dex:").append(paramAnonymousFile.getPath());
            }

            public final void b(File paramAnonymousFile, Throwable paramAnonymousThrowable)
            {
              this.ACA[0] = false;
              this.ACB[0] = paramAnonymousThrowable;
              new StringBuilder("fail to optimize dex ").append(paramAnonymousFile.getPath()).append(", use time ").append(System.currentTimeMillis() - this.start);
            }

            public final void i(File paramAnonymousFile1, File paramAnonymousFile2)
            {
              new StringBuilder("success to optimize dex ").append(paramAnonymousFile1.getPath()).append(", use time ").append(System.currentTimeMillis() - this.start);
            }
          });
          if (localObject2[0] != 0)
            break label607;
          paramIntent.putExtra("intent_patch_interpret_exception", localObject3[0]);
          ShareIntentUtil.b(paramIntent, -16);
          paramBoolean = false;
        }
        catch (Throwable paramTinkerApplication)
        {
          new StringBuilder("getCurrentInstructionSet fail:").append(paramTinkerApplication);
          aul(paramString1);
          paramIntent.putExtra("intent_patch_interpret_exception", paramTinkerApplication);
          ShareIntentUtil.b(paramIntent, -15);
          paramBoolean = false;
        }
      }
      else
      {
        try
        {
          label607: SystemClassLoaderAdder.a(paramTinkerApplication, localPathClassLoader, paramString2, localArrayList);
          paramBoolean = true;
        }
        catch (Throwable paramTinkerApplication)
        {
          paramIntent.putExtra("intent_patch_exception", paramTinkerApplication);
          ShareIntentUtil.b(paramIntent, -14);
          paramBoolean = false;
        }
      }
    }
  }

  public static boolean a(String paramString1, ShareSecurityCheck paramShareSecurityCheck, String paramString2, Intent paramIntent)
  {
    Object localObject = (String)paramShareSecurityCheck.AFg.get("assets/dex_meta.txt");
    boolean bool;
    if (localObject == null)
      bool = true;
    while (true)
    {
      return bool;
      ACy.clear();
      ACz.clear();
      paramShareSecurityCheck = new ArrayList();
      ShareDexDiffPatchInfo.o((String)localObject, paramShareSecurityCheck);
      if (paramShareSecurityCheck.isEmpty())
      {
        bool = true;
      }
      else
      {
        HashMap localHashMap = new HashMap();
        Iterator localIterator = paramShareSecurityCheck.iterator();
        paramShareSecurityCheck = null;
        while (true)
        {
          if (!localIterator.hasNext())
            break label228;
          localObject = (ShareDexDiffPatchInfo)localIterator.next();
          if (!b((ShareDexDiffPatchInfo)localObject))
          {
            if (!ShareDexDiffPatchInfo.c((ShareDexDiffPatchInfo)localObject))
            {
              paramIntent.putExtra("intent_patch_package_patch_check", -3);
              ShareIntentUtil.b(paramIntent, -8);
              bool = false;
              break;
            }
            if ((ABr) && (((ShareDexDiffPatchInfo)localObject).ADN.startsWith("test.dex")))
            {
              paramShareSecurityCheck = (ShareSecurityCheck)localObject;
            }
            else if ((ABr) && (ShareConstants.ADM.matcher(((ShareDexDiffPatchInfo)localObject).eBb).matches()))
            {
              ACz.add(localObject);
            }
            else
            {
              localHashMap.put(((ShareDexDiffPatchInfo)localObject).eBb, a((ShareDexDiffPatchInfo)localObject));
              ACy.add(localObject);
            }
          }
        }
        label228: if ((ABr) && ((paramShareSecurityCheck != null) || (!ACz.isEmpty())))
        {
          if (paramShareSecurityCheck != null)
            ACz.add(ShareTinkerInternals.a(paramShareSecurityCheck, ACz.size() + 1));
          localHashMap.put("tinker_classN.apk", "");
        }
        paramShareSecurityCheck = paramString1 + "/dex/";
        localObject = new File(paramShareSecurityCheck);
        if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
        {
          ShareIntentUtil.b(paramIntent, -9);
          bool = false;
        }
        else
        {
          paramString2 = new File(paramString1 + "/" + paramString2 + "/");
          paramString1 = localHashMap.keySet().iterator();
          while (true)
            if (paramString1.hasNext())
            {
              localObject = (String)paramString1.next();
              localObject = new File(paramShareSecurityCheck + (String)localObject);
              if (!SharePatchFileUtil.ap((File)localObject))
              {
                paramIntent.putExtra("intent_patch_missing_dex_path", ((File)localObject).getAbsolutePath());
                ShareIntentUtil.b(paramIntent, -10);
                bool = false;
                break;
              }
              localObject = new File(SharePatchFileUtil.k((File)localObject, paramString2));
              if ((!SharePatchFileUtil.ap((File)localObject)) && (!SharePatchFileUtil.aq((File)localObject)))
              {
                paramIntent.putExtra("intent_patch_missing_dex_path", ((File)localObject).getAbsolutePath());
                ShareIntentUtil.b(paramIntent, -11);
                bool = false;
                break;
              }
            }
          paramIntent.putExtra("intent_patch_dexes_path", localHashMap);
          bool = true;
        }
      }
    }
  }

  private static void aul(String paramString)
  {
    SharePatchFileUtil.cu(paramString + "/odex/");
    if (ShareTinkerInternals.dSr())
      SharePatchFileUtil.cu(paramString + "/dex/oat/");
  }

  private static boolean b(ShareDexDiffPatchInfo paramShareDexDiffPatchInfo)
  {
    boolean bool = false;
    if (ABr);
    while (true)
    {
      return bool;
      if (paramShareDexDiffPatchInfo.ADO.equals("0"))
        bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.TinkerDexLoader
 * JD-Core Version:    0.6.2
 */