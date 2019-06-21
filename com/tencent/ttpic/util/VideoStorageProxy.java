package com.tencent.ttpic.util;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class VideoStorageProxy
{
  private static final String COLON = ":";
  private static final String DEV_MOUNT = "dev_mount";
  private static final String READ_COMMAND = "cat /etc/vold.fstab";
  private static final String TAG;
  private static final String VOLD_FSTAB_FILE = "/etc/vold.fstab";

  static
  {
    AppMethodBeat.i(84228);
    TAG = VideoStorageProxy.class.getSimpleName();
    AppMethodBeat.o(84228);
  }

  public static ArrayList<String> getAvailableStorage(Context paramContext)
  {
    AppMethodBeat.i(84226);
    if (Build.VERSION.SDK_INT >= 11)
    {
      paramContext = getExternalStoragePathEx(paramContext);
      if ((paramContext != null) && (paramContext.size() != 0))
        break label45;
      paramContext = null;
      AppMethodBeat.o(84226);
    }
    while (true)
    {
      return paramContext;
      paramContext = readEtcFstabFile();
      break;
      label45: Iterator localIterator = paramContext.iterator();
      while (localIterator.hasNext())
        if (!new File((String)localIterator.next()).exists())
          localIterator.remove();
      AppMethodBeat.o(84226);
    }
  }

  private static ArrayList<String> getExternalStoragePathEx(Context paramContext)
  {
    AppMethodBeat.i(84225);
    Object localObject1 = (StorageManager)paramContext.getSystemService("storage");
    Object localObject2 = localObject1.getClass();
    paramContext = new ArrayList(5);
    try
    {
      localObject2 = (String[])((Class)localObject2).getMethod("getVolumePaths", null).invoke(localObject1, null);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("paths.size = ");
      ((StringBuilder)localObject1).append(localObject2.length);
      int i = localObject2.length;
      for (int j = 0; j < i; j++)
        paramContext.add(removePathColon(localObject2[j]));
      AppMethodBeat.o(84225);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(84225);
        paramContext = null;
      }
    }
  }

  private static ArrayList<String> readEtcFstabFile()
  {
    AppMethodBeat.i(84224);
    ArrayList<String> localArrayList;
    try
    {
      Object localObject1 = Runtime.getRuntime().exec("cat /etc/vold.fstab");
      BufferedReader localBufferedReader = new java/io/BufferedReader;
      Object localObject2 = new java/io/InputStreamReader;
      ((InputStreamReader)localObject2).<init>(((Process)localObject1).getInputStream());
      localBufferedReader.<init>((Reader)localObject2);
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>(5);
      while (true)
      {
        localObject1 = localBufferedReader.readLine();
        if (localObject1 == null)
          break;
        if ((!((String)localObject1).startsWith("#")) && (((String)localObject1).contains("dev_mount")))
        {
          localObject1 = ((String)localObject1).split("\\s+");
          if ((localObject1 != null) && (localObject1.length >= 3))
            ((ArrayList)localObject2).add(removePathColon(localObject1[2]));
        }
      }
    }
    catch (IOException localIOException)
    {
      localArrayList = null;
      AppMethodBeat.o(84224);
    }
    while (true)
    {
      return localArrayList;
      AppMethodBeat.o(84224);
    }
  }

  private static String removePathColon(String paramString)
  {
    AppMethodBeat.i(84227);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(84227);
    while (true)
    {
      return paramString;
      int i = paramString.indexOf(":");
      if (i != -1)
      {
        paramString = paramString.substring(0, i);
        AppMethodBeat.o(84227);
      }
      else
      {
        AppMethodBeat.o(84227);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoStorageProxy
 * JD-Core Version:    0.6.2
 */