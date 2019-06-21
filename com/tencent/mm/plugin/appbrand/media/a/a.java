package com.tencent.mm.plugin.appbrand.media.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.audio.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  private static Map<String, c> ikF;
  private static Map<String, com.tencent.mm.sdk.b.c> ikG;
  private static ArrayList<String> ikH;
  private static Map<String, Boolean> ikI;

  static
  {
    AppMethodBeat.i(137803);
    ikF = new ConcurrentHashMap();
    ikG = new HashMap();
    ikH = new ArrayList();
    ikI = new ConcurrentHashMap();
    AppMethodBeat.o(137803);
  }

  public static void AO(String paramString)
  {
    AppMethodBeat.i(137796);
    ab.i("MicroMsg.Audio.AppBrandAudioClientService", "onDestroy");
    b.AO(paramString);
    ikF.clear();
    Iterator localIterator = ikH.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (com.tencent.mm.sdk.b.c)ikG.remove(localObject);
      if (localObject != null)
        com.tencent.mm.sdk.b.a.xxA.d((com.tencent.mm.sdk.b.c)localObject);
    }
    ikG.clear();
    ikH.clear();
    ikI.remove(paramString);
    AppMethodBeat.o(137796);
  }

  public static c Cr(String paramString)
  {
    AppMethodBeat.i(137798);
    paramString = (c)ikF.get(paramString);
    AppMethodBeat.o(137798);
    return paramString;
  }

  public static void Cs(String paramString)
  {
    AppMethodBeat.i(137800);
    if (!ikG.containsKey(paramString))
    {
      ab.e("MicroMsg.Audio.AppBrandAudioClientService", "appId:%s not exist the appId for listener", new Object[] { paramString });
      AppMethodBeat.o(137800);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.Audio.AppBrandAudioClientService", "removeAudioPlayerListener,appId:%s", new Object[] { paramString });
      ikH.remove(paramString);
      paramString = (com.tencent.mm.sdk.b.c)ikG.remove(paramString);
      if (paramString != null)
        com.tencent.mm.sdk.b.a.xxA.d(paramString);
      AppMethodBeat.o(137800);
    }
  }

  public static boolean Ct(String paramString)
  {
    AppMethodBeat.i(137801);
    boolean bool;
    if (!ikI.containsKey(paramString))
    {
      bool = false;
      AppMethodBeat.o(137801);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)ikI.get(paramString)).booleanValue();
      AppMethodBeat.o(137801);
    }
  }

  public static void a(String paramString, c paramc)
  {
    AppMethodBeat.i(137797);
    ikF.put(paramString, paramc);
    AppMethodBeat.o(137797);
  }

  public static void a(String paramString, com.tencent.mm.sdk.b.c paramc)
  {
    AppMethodBeat.i(137799);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.Audio.AppBrandAudioClientService", "appId is empty");
      AppMethodBeat.o(137799);
    }
    while (true)
    {
      return;
      if (paramc == null)
      {
        ab.e("MicroMsg.Audio.AppBrandAudioClientService", "listener is null");
        AppMethodBeat.o(137799);
      }
      else
      {
        if (ikG.containsKey(paramString))
          Cs(paramString);
        ab.d("MicroMsg.Audio.AppBrandAudioClientService", "addAudioPlayerListener,appId:%s", new Object[] { paramString });
        ikG.put(paramString, paramc);
        if (!ikH.contains(paramString))
          ikH.add(paramString);
        com.tencent.mm.sdk.b.a.xxA.b(paramc);
        AppMethodBeat.o(137799);
      }
    }
  }

  public static void ao(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(137802);
    ikI.put(paramString, Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(137802);
  }

  public static void onCreate(String paramString)
  {
    AppMethodBeat.i(137795);
    ab.i("MicroMsg.Audio.AppBrandAudioClientService", "onCreate");
    ikF.clear();
    b.onCreate(paramString);
    ikI.put(paramString, Boolean.TRUE);
    AppMethodBeat.o(137795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.a.a
 * JD-Core Version:    0.6.2
 */