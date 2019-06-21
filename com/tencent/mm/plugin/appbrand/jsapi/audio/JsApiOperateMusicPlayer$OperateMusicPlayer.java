package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.b;
import com.tencent.mm.aw.e;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.media.music.a.a;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.plugin.appbrand.ui.banner.f;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

class JsApiOperateMusicPlayer$OperateMusicPlayer extends MainProcessTask
{
  public static final Parcelable.Creator<OperateMusicPlayer> CREATOR;
  public int action;
  public String csB;
  public boolean error;
  public String errorMsg;
  private final c hAA;
  v.b hAx;
  f hAy;
  public String hAz;
  g.c huj;
  private q hwf;
  private int hwi;
  private m hwz;
  public String jsonString;

  static
  {
    AppMethodBeat.i(130739);
    CREATOR = new JsApiOperateMusicPlayer.OperateMusicPlayer.7();
    AppMethodBeat.o(130739);
  }

  public JsApiOperateMusicPlayer$OperateMusicPlayer(Parcel paramParcel)
  {
    AppMethodBeat.i(130728);
    this.error = false;
    this.hAA = new c()
    {
    };
    g(paramParcel);
    AppMethodBeat.o(130728);
  }

  public JsApiOperateMusicPlayer$OperateMusicPlayer(m paramm, q paramq, int paramInt)
  {
    AppMethodBeat.i(130727);
    this.error = false;
    this.hAA = new c()
    {
    };
    this.hwz = paramm;
    this.hwf = paramq;
    this.hwi = paramInt;
    AppMethodBeat.o(130727);
  }

  public final void asP()
  {
    AppMethodBeat.i(130729);
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(this.jsonString);
      str1 = ((JSONObject)localObject1).optString("operationType");
      str2 = ((JSONObject)localObject1).optString("dataUrl");
      if (bo.isNullOrNil(str1))
      {
        this.action = -1;
        this.error = true;
        this.errorMsg = "operationType is null or nil";
        aCb();
        AppMethodBeat.o(130729);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject1;
        String str1;
        String str2;
        ab.e("MicroMsg.JsApiOperateMusicPlayer", localException.toString());
        this.action = -1;
        this.error = true;
        this.errorMsg = "data is null";
        aCb();
        AppMethodBeat.o(130729);
        continue;
        if (!a.a.aId().cD(this.csB, str1))
        {
          ab.i("MicroMsg.JsApiOperateMusicPlayer", "appid not match cannot operate");
          this.action = -1;
          this.error = true;
          this.errorMsg = "appid not match cannot operate";
          aCb();
          AppMethodBeat.o(130729);
        }
        else
        {
          Object localObject2 = str1;
          if (com.tencent.mm.aw.a.aig())
          {
            localObject2 = str1;
            if (!com.tencent.mm.aw.a.aie())
            {
              localObject2 = str1;
              if (str1.equalsIgnoreCase("play"))
              {
                localObject2 = com.tencent.mm.aw.a.aih();
                if ((localObject2 == null) || ((!bo.isNullOrNil(str2)) && (!str2.equals(((e)localObject2).fKa))))
                  break label341;
                if (!a.a.aId().cD(this.csB, "resume"))
                  break label328;
                ab.i("MicroMsg.JsApiOperateMusicPlayer", "same appid %s, change play to resume", new Object[] { this.csB });
                localObject2 = "resume";
              }
            }
          }
          while (true)
            if (((String)localObject2).equalsIgnoreCase("play"))
            {
              localObject2 = ((JSONObject)localObject1).optString("title");
              String str3 = ((JSONObject)localObject1).optString("singer");
              str1 = ((JSONObject)localObject1).optString("epname");
              localObject1 = ((JSONObject)localObject1).optString("coverImgUrl");
              if (bo.isNullOrNil(str2))
              {
                this.action = -1;
                this.error = true;
                this.errorMsg = "dataUrl is null or nil";
                aCb();
                AppMethodBeat.o(130729);
                break;
                label328: ab.i("MicroMsg.JsApiOperateMusicPlayer", "not same not same appid ,restart play");
                localObject2 = str1;
                continue;
                label341: ab.i("MicroMsg.JsApiOperateMusicPlayer", "data url has changed ,restart play");
                localObject2 = str1;
                continue;
              }
              ab.i("MicroMsg.JsApiOperateMusicPlayer", "title : %s, singer : %s, epName : %s, coverImgUrl : %s, dataUrl : %s, lowbandUrl : %s, webUrl : %s", new Object[] { localObject2, str3, str1, localObject1, str2, str2, str2 });
              com.tencent.mm.aw.a.aic();
              String str4 = a.a.aId().ikS;
              if (!bo.isNullOrNil(str4))
              {
                ab.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", new Object[] { str4, this.csB });
                a.a.aId().Cv(str4);
              }
              al.n(new JsApiOperateMusicPlayer.OperateMusicPlayer.1(this, str2, (String)localObject1, (String)localObject2, str3, str2, str2, str1), 500L);
              AppMethodBeat.o(130729);
              break;
            }
          if (((String)localObject2).equalsIgnoreCase("resume"))
          {
            localObject2 = a.a.aId().ikS;
            if (!bo.isNullOrNil((String)localObject2))
            {
              ab.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", new Object[] { localObject2, this.csB });
              a.a.aId().Cv((String)localObject2);
            }
            a.a.aId().a(this.hAA, this.csB);
            a.a.aId().ikS = this.csB;
            localObject2 = com.tencent.mm.aw.a.aih();
            if (localObject2 != null)
              a.a.aId().ikT = ((e)localObject2).fJU;
            if (b.aij())
            {
              al.n(new JsApiOperateMusicPlayer.OperateMusicPlayer.2(this), 500L);
              AppMethodBeat.o(130729);
            }
            else
            {
              ab.i("MicroMsg.JsApiOperateMusicPlayer", "resume fail");
              this.action = -1;
              this.error = true;
              this.errorMsg = "resume play fail";
              aCb();
              AppMethodBeat.o(130729);
            }
          }
          else if (((String)localObject2).equalsIgnoreCase("pause"))
          {
            if (b.aik())
            {
              al.n(new JsApiOperateMusicPlayer.OperateMusicPlayer.3(this), 500L);
              AppMethodBeat.o(130729);
            }
            else
            {
              ab.i("MicroMsg.JsApiOperateMusicPlayer", "pause fail");
              this.action = -1;
              this.error = true;
              this.errorMsg = "pause play fail";
              aCb();
              AppMethodBeat.o(130729);
            }
          }
          else if (((String)localObject2).equalsIgnoreCase("seek"))
          {
            if (com.tencent.mm.aw.a.lP(bo.getInt(bo.cD(((JSONObject)localObject1).optString("position")), -1) * 1000))
            {
              al.n(new JsApiOperateMusicPlayer.OperateMusicPlayer.4(this), 500L);
              AppMethodBeat.o(130729);
            }
            else
            {
              ab.i("MicroMsg.JsApiOperateMusicPlayer", "seek fail");
              this.action = -1;
              this.error = true;
              this.errorMsg = "seek fail";
              aCb();
              AppMethodBeat.o(130729);
            }
          }
          else if (((String)localObject2).equalsIgnoreCase("stop"))
          {
            if (b.ail())
            {
              al.n(new JsApiOperateMusicPlayer.OperateMusicPlayer.5(this), 500L);
              AppMethodBeat.o(130729);
            }
            else
            {
              ab.i("MicroMsg.JsApiOperateMusicPlayer", "stop fail");
              this.action = -1;
              this.error = false;
              this.errorMsg = "stop play fail";
              aCb();
              AppMethodBeat.o(130729);
            }
          }
          else
          {
            this.action = -1;
            this.error = true;
            aCb();
            AppMethodBeat.o(130729);
          }
        }
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130730);
    ab.i("MicroMsg.JsApiOperateMusicPlayer", "runInClientProcess(action : %s)", new Object[] { Integer.valueOf(this.action) });
    q localq = this.hwf;
    int i = this.hwi;
    m localm = this.hwz;
    String str;
    if (this.error)
    {
      StringBuilder localStringBuilder = new StringBuilder("fail");
      if (TextUtils.isEmpty(this.errorMsg))
      {
        str = "";
        str = str;
        label89: localq.M(i, localm.j(str, null));
        switch (this.action)
        {
        case 5:
        case 6:
        default:
        case 0:
        case 1:
        case 2:
        case 7:
        case 3:
        case 4:
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(130730);
      while (true)
      {
        return;
        str = ":" + this.errorMsg;
        break;
        str = "ok";
        break label89;
        ab.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPlay in");
        new JsApiOperateMusicPlayer.c((byte)0).i(this.hwf).AL(this.hAz).aCj();
        this.hAx.j("Music#isPlaying", Boolean.TRUE);
        AppBrandStickyBannerLogic.a.d(this.hAy);
        g.a(this.hwf.getAppId(), this.huj);
        AppMethodBeat.o(130730);
        continue;
        ab.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicResume in");
        this.hAx.j("Music#isPlaying", Boolean.TRUE);
        AppBrandStickyBannerLogic.a.d(this.hAy);
        g.a(this.hwf.getAppId(), this.huj);
        AppMethodBeat.o(130730);
        continue;
        ab.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicStop in");
        new JsApiOperateMusicPlayer.a((byte)0).i(this.hwf).AL(this.hAz).aCj();
        ab.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicEnd in");
        this.hAx.j("Music#isPlaying", Boolean.FALSE);
        AppBrandStickyBannerLogic.a.c(this.hAy);
        g.b(this.hwf.getAppId(), this.huj);
        AppMethodBeat.o(130730);
        continue;
        ab.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPause in");
        new JsApiOperateMusicPlayer.b((byte)0).i(this.hwf).AL(this.hAz).aCj();
        this.hAx.j("Music#isPlaying", Boolean.FALSE);
        AppBrandStickyBannerLogic.a.c(this.hAy);
        g.b(this.hwf.getAppId(), this.huj);
        AppMethodBeat.o(130730);
      }
      ab.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicError in");
      this.hwf.h("onMusicError", this.hAz, 0);
      this.hAx.j("Music#isPlaying", Boolean.FALSE);
      AppBrandStickyBannerLogic.a.c(this.hAy);
      g.b(this.hwf.getAppId(), this.huj);
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130731);
    this.jsonString = paramParcel.readString();
    this.csB = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.error = bool;
      this.hAz = paramParcel.readString();
      this.action = paramParcel.readInt();
      this.errorMsg = paramParcel.readString();
      AppMethodBeat.o(130731);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130732);
    paramParcel.writeString(this.jsonString);
    paramParcel.writeString(this.csB);
    if (this.error)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeString(this.hAz);
      paramParcel.writeInt(this.action);
      paramParcel.writeString(this.errorMsg);
      AppMethodBeat.o(130732);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer.OperateMusicPlayer
 * JD-Core Version:    0.6.2
 */