package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lr;
import com.tencent.mm.g.a.lr.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

class JsApiOpenAdCanvas$JsApiOpenAdCanvasTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiOpenAdCanvasTask> CREATOR;
  private String cFM;
  private int cHx;
  private int cHy;
  private q hwf;
  private int hwi;
  private m hwz;
  private WeakReference<Context> hxY;
  private String hxZ;
  private String hya;
  private String hyb;

  static
  {
    AppMethodBeat.i(130510);
    CREATOR = new JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.2();
    AppMethodBeat.o(130510);
  }

  public JsApiOpenAdCanvas$JsApiOpenAdCanvasTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130504);
    g(paramParcel);
    AppMethodBeat.o(130504);
  }

  public JsApiOpenAdCanvas$JsApiOpenAdCanvasTask(m paramm, q paramq, int paramInt1, WeakReference<Context> paramWeakReference, String paramString1, int paramInt2, int paramInt3, String paramString2, String paramString3)
  {
    this.hwz = paramm;
    this.hwf = paramq;
    this.hwi = paramInt1;
    this.hxY = paramWeakReference;
    this.hxZ = paramString1;
    this.cHx = paramInt2;
    this.cHy = paramInt3;
    this.cFM = paramString2;
    this.hya = paramString3;
  }

  public final void asP()
  {
    AppMethodBeat.i(130506);
    com.tencent.mm.sdk.g.d.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(130502);
        lr locallr = new lr();
        locallr.cHv.pageId = JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.a(JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.this);
        locallr.cHv.cvq = JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.b(JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.this);
        locallr.cHv.cHx = JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.c(JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.this);
        locallr.cHv.cHy = JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.d(JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.this);
        locallr.cHv.cvd = 0;
        a.xxA.m(locallr);
        JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.a(JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.this, locallr.cHw.cHz);
        JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.e(JsApiOpenAdCanvas.JsApiOpenAdCanvasTask.this);
        AppMethodBeat.o(130502);
      }
    }
    , "JsApiOpenAdCanvas");
    AppMethodBeat.o(130506);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130505);
    String str1 = this.hyb;
    if (this.cHx == 0)
    {
      Intent localIntent = new Intent();
      String str2 = str1;
      if (str1 == null)
        str2 = "";
      localIntent.putExtra("sns_landing_pages_xml", str2);
      localIntent.putExtra("sns_landing_pages_pageid", bo.anl(this.hxZ));
      localIntent.putExtra("sns_landig_pages_from_source", 13);
      localIntent.putExtra("sns_landing_pages_extra", this.cFM);
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
      localIntent.putExtra("sns_landing_pages_no_store", this.cHy);
      localIntent.putExtra("sns_landing_pages_ad_info", this.hya);
      com.tencent.mm.bp.d.b((Context)this.hxY.get(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
      this.hwf.M(this.hwi, this.hwz.j("ok", null));
    }
    while (true)
    {
      aBW();
      AppMethodBeat.o(130505);
      return;
      if (this.cHx == 1)
        this.hwf.M(this.hwi, this.hwz.j("ok", null));
      else
        this.hwf.M(this.hwi, this.hwz.j("fail", null));
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130507);
    this.hxZ = paramParcel.readString();
    this.cHx = paramParcel.readInt();
    this.cHy = paramParcel.readInt();
    this.cFM = paramParcel.readString();
    this.hya = paramParcel.readString();
    this.hyb = paramParcel.readString();
    AppMethodBeat.o(130507);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130508);
    paramParcel.writeString(this.hxZ);
    paramParcel.writeInt(this.cHx);
    paramParcel.writeInt(this.cHy);
    paramParcel.writeString(this.cFM);
    paramParcel.writeString(this.hya);
    paramParcel.writeString(this.hyb);
    AppMethodBeat.o(130508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenAdCanvas.JsApiOpenAdCanvasTask
 * JD-Core Version:    0.6.2
 */