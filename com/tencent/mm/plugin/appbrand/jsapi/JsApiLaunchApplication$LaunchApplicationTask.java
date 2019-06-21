package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jc;
import com.tencent.mm.g.a.jc.b;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.a;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

class JsApiLaunchApplication$LaunchApplicationTask extends AppBrandProxyTransparentUIProcessTask
{
  public static final Parcelable.Creator<LaunchApplicationTask> CREATOR;
  public String appId;
  public Bundle cvs;
  public String extInfo;
  public Runnable hww;
  public String hxq;
  public int showType;
  public boolean success;

  static
  {
    AppMethodBeat.i(130447);
    CREATOR = new JsApiLaunchApplication.LaunchApplicationTask.2();
    AppMethodBeat.o(130447);
  }

  private JsApiLaunchApplication$LaunchApplicationTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130446);
    g(paramParcel);
    AppMethodBeat.o(130446);
  }

  public JsApiLaunchApplication$LaunchApplicationTask(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
  }

  public final void a(Context paramContext, AppBrandProxyTransparentUIProcessTask.a parama)
  {
    AppMethodBeat.i(130442);
    JsApiLaunchApplication.a locala = new JsApiLaunchApplication.a(new JsApiLaunchApplication.LaunchApplicationTask.1(this, parama));
    parama = new WXAppExtendObject();
    parama.extInfo = this.extInfo;
    Object localObject = new WXMediaMessage(parama);
    ((WXMediaMessage)localObject).sdkVer = 620954368;
    ((WXMediaMessage)localObject).messageExt = this.extInfo;
    parama = new jc();
    parama.cEj.cEl = ((WXMediaMessage)localObject);
    parama.cEj.appId = this.appId;
    parama.cEj.showType = this.showType;
    parama.cEj.context = paramContext;
    parama.cEj.cvs = this.cvs;
    parama.cEj.cEm = locala;
    a.xxA.m(parama);
    boolean bool1 = parama.cEk.cEn;
    boolean bool2 = bool1;
    if (!bool1)
    {
      if ((bo.isNullOrNil(this.appId)) || (bo.isNullOrNil(this.hxq)))
        break label371;
      parama = this.appId + "://" + this.hxq;
      localObject = new Intent("android.intent.action.VIEW", Uri.parse(parama));
      ab.i("MicroMsg.JsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", new Object[] { parama });
      ((Intent)localObject).addFlags(268435456);
      parama = bo.H(paramContext, (Intent)localObject);
      if ((parama == null) || (parama.isEmpty()))
        break label385;
      if ((!TextUtils.isEmpty(((Intent)localObject).getPackage())) || (parama.size() != 1))
        break label362;
      parama = g.b((ResolveInfo)parama.get(0));
      if (bo.nullAsNil(ah.getPackageName()).equals(parama))
        break label385;
      locala.ftW = false;
      locala.hxt = false;
      locala.hxu = false;
      locala.cEn = false;
      bool1 = g.a(paramContext, (Intent)localObject, null, locala, this.cvs);
    }
    label385: 
    while (true)
      for (bool2 = bool1; ; bool2 = bool1)
      {
        locala.dS(bool2);
        AppMethodBeat.o(130442);
        return;
        label362: parama = ((Intent)localObject).getPackage();
        break;
        label371: ab.i("MicroMsg.JsApiLaunchApplication", "launchApplication nil appId or parameter.");
      }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130443);
    ab.i("MicroMsg.JsApiLaunchApplication", "runInClientProcess");
    if (this.hww != null)
    {
      ab.i("MicroMsg.JsApiLaunchApplication", "runInClientProcess asyncCallback != null");
      this.hww.run();
    }
    AppMethodBeat.o(130443);
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(130444);
    this.showType = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.hxq = paramParcel.readString();
    this.extInfo = paramParcel.readString();
    this.cvs = paramParcel.readBundle();
    if (paramParcel.readByte() == 1);
    while (true)
    {
      this.success = bool;
      AppMethodBeat.o(130444);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130445);
    paramParcel.writeInt(this.showType);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hxq);
    paramParcel.writeString(this.extInfo);
    paramParcel.writeBundle(this.cvs);
    if (this.success);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(130445);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication.LaunchApplicationTask
 * JD-Core Version:    0.6.2
 */