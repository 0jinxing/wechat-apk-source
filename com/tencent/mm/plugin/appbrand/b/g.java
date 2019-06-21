package com.tencent.mm.plugin.appbrand.b;

import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService.StopBackgroundMusicTask;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService.a;
import java.util.HashMap;

abstract class g extends h
{
  private final com.tencent.mm.plugin.appbrand.i gPI;
  int gWW = 0;
  private final AppBrandMusicClientService.a gWX = new g.1(this);

  g(i parami, com.tencent.mm.plugin.appbrand.i parami1)
  {
    super(parami);
    this.gPI = parami1;
  }

  private int awF()
  {
    this.gWW = 0;
    Object localObject1 = this.gPI.mAppId;
    Object localObject2 = this.gPI.aa(a.class);
    int i;
    AppBrandMusicClientService localAppBrandMusicClientService;
    if ((localObject2 != null) && (((a)localObject2).gWs))
    {
      i = 1;
      if (i == 0)
        break label176;
      if (AppBrandMusicClientService.Cu((String)localObject1))
      {
        dB(1);
        localAppBrandMusicClientService = AppBrandMusicClientService.ikP;
        localObject2 = this.gWX;
        if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (localObject2 != null))
          break label126;
      }
      label76: localObject1 = com.tencent.mm.plugin.appbrand.g.wV((String)localObject1);
      switch (g.2.gWZ[localObject1.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      return this.gWW;
      i = 0;
      break;
      label126: if (!localAppBrandMusicClientService.ikO.containsKey(localObject1))
      {
        localAppBrandMusicClientService.ikO.put(localObject1, localObject2);
        break label76;
      }
      localAppBrandMusicClientService.ikO.remove(localObject1);
      localAppBrandMusicClientService.ikO.put(localObject1, localObject2);
      break label76;
      label176: localObject2 = AppBrandMusicClientService.ikP;
      if (TextUtils.isEmpty((CharSequence)localObject1))
        break label76;
      if (!((String)localObject1).equalsIgnoreCase(((AppBrandMusicClientService)localObject2).ikQ))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandMusicClientService", "appId is diff, can't stop music");
        break label76;
      }
      localObject2 = new AppBrandMusicClientService.StopBackgroundMusicTask();
      ((AppBrandMusicClientService.StopBackgroundMusicTask)localObject2).appId = ((String)localObject1);
      AppBrandMainProcessService.a((MainProcessTask)localObject2);
      break label76;
      dB(16);
      continue;
      dB(4);
      continue;
      try
      {
        if ((!this.gPI.gNz.atz().aLZ()) || (this.gPI.asU() != null))
          dB(8);
      }
      catch (IllegalAccessError localIllegalAccessError)
      {
      }
    }
  }

  private void dB(int paramInt)
  {
    this.gWW |= paramInt;
  }

  abstract void awB();

  public void enter()
  {
    this.gWW = awF();
    super.enter();
    nu(0);
  }

  public void exit()
  {
    super.exit();
    this.gWW = 0;
    AppBrandMusicClientService localAppBrandMusicClientService = AppBrandMusicClientService.ikP;
    String str = this.gPI.mAppId;
    if ((!TextUtils.isEmpty(str)) && (localAppBrandMusicClientService.ikO.containsKey(str)))
      localAppBrandMusicClientService.ikO.remove(str);
  }

  final void nu(int paramInt)
  {
    this.gWW &= (paramInt ^ 0xFFFFFFFF);
    if (this.gWW == 0)
      awB();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.g
 * JD-Core Version:    0.6.2
 */