package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.media.music.AppBrandMusicClientService.a;
import com.tencent.mm.plugin.appbrand.media.music.a.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask extends MainProcessTask
{
  public static final Parcelable.Creator<SetBackgroundAudioListenerTask> CREATOR;
  public int action;
  public String appId;
  public String cBb;
  public int cBc;
  public String cwz;
  private final com.tencent.mm.sdk.b.c hAA;
  public String hAz;
  private boolean hBa;
  g.c huj;
  public int hwi;
  private m hwz;
  public com.tencent.mm.plugin.appbrand.jsapi.c hxS;

  static
  {
    AppMethodBeat.i(137781);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(137781);
  }

  public JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask(Parcel paramParcel)
  {
    AppMethodBeat.i(137774);
    this.hBa = false;
    this.hAA = new JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask.2(this);
    g(paramParcel);
    AppMethodBeat.o(137774);
  }

  public JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask(com.tencent.mm.plugin.appbrand.jsapi.a parama, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt)
  {
    AppMethodBeat.i(137773);
    this.hBa = false;
    this.hAA = new JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask.2(this);
    this.hwz = parama;
    this.hxS = paramc;
    this.hwi = paramInt;
    AppMethodBeat.o(137773);
  }

  public final void asP()
  {
    AppMethodBeat.i(137775);
    ab.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "runInMainProcess");
    if (this.hBa)
    {
      ab.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "send Preempted Event");
      this.hBa = false;
      localObject = new ke();
      ((ke)localObject).cFH.action = 10;
      ((ke)localObject).cFH.state = "preempted";
      ((ke)localObject).cFH.appId = this.appId;
      ((ke)localObject).cFH.cFJ = true;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    }
    Object localObject = a.a.aId().ikS;
    if (!bo.isNullOrNil((String)localObject))
    {
      ab.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "remove listener preAppid is %s, appid is %s", new Object[] { localObject, this.appId });
      a.a.aId().Cv((String)localObject);
    }
    a.a.aId().a(this.hAA, this.appId);
    com.tencent.mm.plugin.appbrand.media.music.a locala = a.a.aId();
    String str1 = this.appId;
    int i = this.cBc;
    String str2 = this.cwz;
    localObject = this.cBb;
    locala.ikS = str1;
    locala.cBc = i;
    locala.cwz = str2;
    locala.cBb = ((String)localObject);
    AppMethodBeat.o(137775);
  }

  public final void asQ()
  {
    AppMethodBeat.i(137776);
    if (this.hxS == null)
    {
      ab.e("MicroMsg.Music.SetBackgroundAudioListenerTask", "service is null, don't callback");
      AppMethodBeat.o(137776);
    }
    while (true)
    {
      return;
      oa(this.action);
      label112: AppBrandMusicClientService localAppBrandMusicClientService;
      int i;
      Iterator localIterator;
      switch (this.action)
      {
      case 5:
      case 6:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      default:
        ab.i("MicroMsg.Music.SetBackgroundAudioListenerTask", "runInClientProcess callback action:%d, retJson:%s", new Object[] { Integer.valueOf(this.action), this.hAz });
        new JsApiOperateBackgroundAudio.c().j(this.hxS).AM(this.hAz).aCj();
        localAppBrandMusicClientService = AppBrandMusicClientService.ikP;
        i = this.action;
        ab.i("MicroMsg.AppBrandMusicClientService", "notifyAction, action:%d", new Object[] { Integer.valueOf(i) });
        localIterator = localAppBrandMusicClientService.ikO.entrySet().iterator();
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 7:
      case 13:
      case 14:
      }
      while (true)
      {
        if (!localIterator.hasNext())
          break label398;
        Object localObject = (Map.Entry)localIterator.next();
        if (localObject != null)
        {
          String str = (String)((Map.Entry)localObject).getKey();
          localObject = (AppBrandMusicClientService.a)((Map.Entry)localObject).getValue();
          if ((!TextUtils.isEmpty(localAppBrandMusicClientService.ikQ)) && (localAppBrandMusicClientService.ikQ.equalsIgnoreCase(str)))
          {
            ab.i("MicroMsg.AppBrandMusicClientService", "current play music appId is %s", new Object[] { localAppBrandMusicClientService.ikQ });
            if (localObject != null)
            {
              if (i == 10)
              {
                ((AppBrandMusicClientService.a)localObject).awG();
                continue;
                g.a(this.appId, this.huj);
                AppBrandMusicClientService.ikP.ikQ = this.appId;
                break label112;
                g.b(this.appId, this.huj);
                break label112;
                JsApiOperateBackgroundAudio.b.k(this.hxS);
                AppMethodBeat.o(137776);
                break;
                JsApiOperateBackgroundAudio.a.k(this.hxS);
                AppMethodBeat.o(137776);
                break;
              }
              if (i == 2)
                ((AppBrandMusicClientService.a)localObject).onStop();
            }
          }
        }
      }
      label398: AppMethodBeat.o(137776);
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(137777);
    this.appId = paramParcel.readString();
    this.hAz = paramParcel.readString();
    this.action = paramParcel.readInt();
    this.cBc = paramParcel.readInt();
    this.cwz = paramParcel.readString();
    this.cBb = paramParcel.readString();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.hBa = bool;
      AppMethodBeat.o(137777);
      return;
      bool = false;
    }
  }

  protected void oa(int paramInt)
  {
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(137778);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hAz);
    paramParcel.writeInt(this.action);
    paramParcel.writeInt(this.cBc);
    paramParcel.writeString(this.cwz);
    paramParcel.writeString(this.cBb);
    if (this.hBa);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(137778);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask
 * JD-Core Version:    0.6.2
 */