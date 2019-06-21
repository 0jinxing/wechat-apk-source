package com.tencent.qqvideo.proxy.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqvideo.proxy.api.IPlayManager;
import com.tencent.qqvideo.proxy.api.IUtils;
import com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade;

public class PlayManagerImp
  implements IPlayManager
{
  private static String TAG = "TV_Httpproxy";
  private static boolean mbSoLoadSuccess = false;
  private ConfigStorage mConfigStorageInstance;
  private HttpproxyFacade proxy;

  public PlayManagerImp()
  {
    AppMethodBeat.i(124408);
    this.proxy = null;
    this.mConfigStorageInstance = new ConfigStorage();
    this.proxy = HttpproxyFacade.instance();
    AppMethodBeat.o(124408);
  }

  private static boolean isWifiOn(Context paramContext)
  {
    AppMethodBeat.i(124409);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(124409);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(124409);
        bool = false;
      }
      else if (paramContext.getType() == 1)
      {
        AppMethodBeat.o(124409);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(124409);
        bool = false;
      }
    }
  }

  public void appToBack()
  {
    try
    {
      AppMethodBeat.i(124417);
      try
      {
        this.proxy.pushEvent(4);
        AppMethodBeat.o(124417);
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,appToBack native not found");
          AppMethodBeat.o(124417);
        }
      }
    }
    finally
    {
    }
  }

  public void appToFront()
  {
    try
    {
      AppMethodBeat.i(124416);
      try
      {
        this.proxy.pushEvent(3);
        AppMethodBeat.o(124416);
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,appToFront native not found");
          AppMethodBeat.o(124416);
        }
      }
    }
    finally
    {
    }
  }

  public String buildPlayURLMp4(int paramInt)
  {
    try
    {
      AppMethodBeat.i(124412);
      try
      {
        String str1 = this.proxy.buildPlayURL(paramInt);
        AppMethodBeat.o(124412);
        return str1;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,buildPlayURL native not found");
          String str2 = "";
          AppMethodBeat.o(124412);
        }
      }
    }
    finally
    {
    }
  }

  public int cleanStorage()
  {
    try
    {
      AppMethodBeat.i(124428);
      try
      {
        i = this.proxy.cleanStorage();
        AppMethodBeat.o(124428);
        return i;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,cleanStorage native not found");
          int i = -1;
          AppMethodBeat.o(124428);
        }
      }
    }
    finally
    {
    }
  }

  public void deinit()
  {
    try
    {
      AppMethodBeat.i(124411);
      try
      {
        this.mConfigStorageInstance.stopGetServerConfig();
        this.proxy.deinit();
        AppMethodBeat.o(124411);
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,deinit native not found");
          AppMethodBeat.o(124411);
        }
      }
    }
    finally
    {
    }
  }

  public int getCurrentOffset(int paramInt)
  {
    try
    {
      AppMethodBeat.i(124423);
      try
      {
        paramInt = this.proxy.getCurrentOffset(paramInt);
        AppMethodBeat.o(124423);
        return paramInt;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,getCurrentOffset native not found");
          paramInt = 0;
          AppMethodBeat.o(124423);
        }
      }
    }
    finally
    {
    }
  }

  public int getLocalServerPort()
  {
    try
    {
      AppMethodBeat.i(124426);
      try
      {
        i = this.proxy.getLocalServerPort();
        AppMethodBeat.o(124426);
        return i;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,getLocalServerPort native not found");
          int i = -1;
          AppMethodBeat.o(124426);
        }
      }
    }
    finally
    {
    }
  }

  public String getProxyVersion()
  {
    try
    {
      AppMethodBeat.i(124418);
      try
      {
        String str1 = this.proxy.getVersion();
        AppMethodBeat.o(124418);
        return str1;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,getProxyVersion native not found");
          String str2 = "TVHttpproxy.1.0.0.0000";
          AppMethodBeat.o(124418);
        }
      }
    }
    finally
    {
    }
  }

  public int getTotalOffset(int paramInt)
  {
    try
    {
      AppMethodBeat.i(124424);
      try
      {
        paramInt = this.proxy.getTotalOffset(paramInt);
        AppMethodBeat.o(124424);
        return paramInt;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,getTotalOffset native not found");
          paramInt = 0;
          AppMethodBeat.o(124424);
        }
      }
    }
    finally
    {
    }
  }

  // ERROR //
  public int init(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc 146
    //   6: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: ifnonnull +12 -> 22
    //   13: ldc 146
    //   15: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_3
    //   21: ireturn
    //   22: aload_0
    //   23: getfield 35	com/tencent/qqvideo/proxy/common/PlayManagerImp:proxy	Lcom/tencent/qqvideo/proxy/httpproxy/HttpproxyFacade;
    //   26: ifnull +7 -> 33
    //   29: aload_1
    //   30: invokestatic 150	com/tencent/qqvideo/proxy/httpproxy/HttpproxyFacade:setContext	(Landroid/content/Context;)V
    //   33: getstatic 22	com/tencent/qqvideo/proxy/common/PlayManagerImp:mbSoLoadSuccess	Z
    //   36: istore 4
    //   38: iload 4
    //   40: ifne +21 -> 61
    //   43: ldc 152
    //   45: ldc 2
    //   47: invokevirtual 158	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   50: aload_1
    //   51: invokestatic 164	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:load	(Ljava/lang/String;Ljava/lang/ClassLoader;Landroid/content/Context;)V
    //   54: invokestatic 167	com/tencent/qqvideo/proxy/httpproxy/TVHttpProxyLoadLibrary:setupBrokenLibraryHandler	()V
    //   57: iconst_1
    //   58: putstatic 22	com/tencent/qqvideo/proxy/common/PlayManagerImp:mbSoLoadSuccess	Z
    //   61: aload_1
    //   62: invokestatic 171	com/tencent/qqvideo/proxy/common/ConfigStorage:getDownProxyConfig	(Landroid/content/Context;)Ljava/lang/String;
    //   65: astore 5
    //   67: aload_0
    //   68: getfield 40	com/tencent/qqvideo/proxy/common/PlayManagerImp:mConfigStorageInstance	Lcom/tencent/qqvideo/proxy/common/ConfigStorage;
    //   71: aload_1
    //   72: invokevirtual 174	com/tencent/qqvideo/proxy/common/ConfigStorage:synGetServerConfig	(Landroid/content/Context;)V
    //   75: aload_2
    //   76: astore 6
    //   78: aload_2
    //   79: ifnonnull +7 -> 86
    //   82: ldc 99
    //   84: astore 6
    //   86: aload_0
    //   87: getfield 35	com/tencent/qqvideo/proxy/common/PlayManagerImp:proxy	Lcom/tencent/qqvideo/proxy/httpproxy/HttpproxyFacade;
    //   90: aload 6
    //   92: aload 5
    //   94: invokevirtual 177	com/tencent/qqvideo/proxy/httpproxy/HttpproxyFacade:init	(Ljava/lang/String;Ljava/lang/String;)I
    //   97: istore 7
    //   99: aload_1
    //   100: invokestatic 179	com/tencent/qqvideo/proxy/common/PlayManagerImp:isWifiOn	(Landroid/content/Context;)Z
    //   103: ifne +11 -> 114
    //   106: aload_0
    //   107: getfield 35	com/tencent/qqvideo/proxy/common/PlayManagerImp:proxy	Lcom/tencent/qqvideo/proxy/httpproxy/HttpproxyFacade;
    //   110: iconst_2
    //   111: invokevirtual 182	com/tencent/qqvideo/proxy/httpproxy/HttpproxyFacade:setNetWorkState	(I)V
    //   114: ldc 146
    //   116: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: iload 7
    //   121: istore_3
    //   122: goto -104 -> 18
    //   125: astore_1
    //   126: iconst_0
    //   127: putstatic 22	com/tencent/qqvideo/proxy/common/PlayManagerImp:mbSoLoadSuccess	Z
    //   130: ldc 146
    //   132: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   135: goto -117 -> 18
    //   138: astore_1
    //   139: aload_0
    //   140: monitorexit
    //   141: aload_1
    //   142: athrow
    //   143: astore_1
    //   144: ldc 146
    //   146: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: goto -131 -> 18
    //
    // Exception table:
    //   from	to	target	type
    //   43	61	125	java/lang/Throwable
    //   4	9	138	finally
    //   13	18	138	finally
    //   22	33	138	finally
    //   33	38	138	finally
    //   43	61	138	finally
    //   61	75	138	finally
    //   86	114	138	finally
    //   114	119	138	finally
    //   126	135	138	finally
    //   144	149	138	finally
    //   61	75	143	java/lang/Throwable
    //   86	114	143	java/lang/Throwable
  }

  public int preLoad(int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(124422);
      try
      {
        paramInt1 = this.proxy.preLoad(paramInt1, paramInt2);
        AppMethodBeat.o(124422);
        return paramInt1;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,preLoad native not found");
          paramInt1 = -1;
          AppMethodBeat.o(124422);
        }
      }
    }
    finally
    {
    }
  }

  public void setCookie(String paramString)
  {
    try
    {
      AppMethodBeat.i(124415);
      try
      {
        this.proxy.setCookie(paramString);
        AppMethodBeat.o(124415);
        return;
      }
      catch (Throwable paramString)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,setCookie native not found");
          AppMethodBeat.o(124415);
        }
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public int setMaxStorageSize(long paramLong)
  {
    try
    {
      AppMethodBeat.i(124427);
      try
      {
        i = this.proxy.setMaxStorageSize(paramLong);
        AppMethodBeat.o(124427);
        return i;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,setMaxStorageSize native not found");
          int i = -1;
          AppMethodBeat.o(124427);
        }
      }
    }
    finally
    {
    }
  }

  public void setNetWorkState(int paramInt)
  {
    try
    {
      AppMethodBeat.i(124419);
      "setNetWorkState".concat(String.valueOf(paramInt));
      try
      {
        this.proxy.setNetWorkState(paramInt);
        AppMethodBeat.o(124419);
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,setNetWorkStatus native not found");
          AppMethodBeat.o(124419);
        }
      }
    }
    finally
    {
    }
  }

  public void setPlayerState(int paramInt)
  {
    try
    {
      AppMethodBeat.i(124420);
      "setPlayerState".concat(String.valueOf(paramInt));
      try
      {
        this.proxy.setPlayerState(paramInt);
        AppMethodBeat.o(124420);
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,setPlayState native not found");
          AppMethodBeat.o(124420);
        }
      }
    }
    finally
    {
    }
  }

  public void setRemainTime(int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(124425);
      try
      {
        this.proxy.setRemainTime(paramInt1, paramInt2);
        AppMethodBeat.o(124425);
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,getTotalOffset native not found");
          AppMethodBeat.o(124425);
        }
      }
    }
    finally
    {
    }
  }

  public void setUtilsObject(IUtils paramIUtils)
  {
    try
    {
      AppMethodBeat.i(124414);
      try
      {
        this.proxy.setUtils(paramIUtils);
        AppMethodBeat.o(124414);
        return;
      }
      catch (Throwable paramIUtils)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,setUtilsObject native not found");
          AppMethodBeat.o(124414);
        }
      }
    }
    finally
    {
    }
    throw paramIUtils;
  }

  public int startPlay(String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(124421);
      try
      {
        paramInt1 = this.proxy.startPlay(paramString1, paramInt1, paramString2, paramLong, paramInt2);
        AppMethodBeat.o(124421);
        return paramInt1;
      }
      catch (Throwable paramString1)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,startPlay native not found");
          paramInt1 = -1;
          AppMethodBeat.o(124421);
        }
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public void stopPlay(int paramInt)
  {
    try
    {
      AppMethodBeat.i(124413);
      try
      {
        this.proxy.stopPlay(paramInt);
        AppMethodBeat.o(124413);
        return;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          HttpproxyFacade.print(6, TAG, "error ,stopPlay native not found");
          AppMethodBeat.o(124413);
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqvideo.proxy.common.PlayManagerImp
 * JD-Core Version:    0.6.2
 */