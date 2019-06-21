package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.media.music.a.a;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiOperateMusicPlayer$OperateMusicPlayer$1
  implements Runnable
{
  JsApiOperateMusicPlayer$OperateMusicPlayer$1(JsApiOperateMusicPlayer.OperateMusicPlayer paramOperateMusicPlayer, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130719);
    String str1 = new StringBuilder().append(this.hAH.csB).append(this.hAB).append(this.hAC).toString().hashCode();
    String str2 = this.hAC;
    String str3 = this.hAC;
    String str4 = this.chV;
    String str5 = this.hAD;
    String str6 = this.hAE;
    String str7 = this.hAF;
    String str8 = this.hAB;
    String str9 = com.tencent.mm.compatible.util.e.eSn;
    String str10 = c.XW() + this.hAC.hashCode();
    String str11 = this.hAG;
    com.tencent.mm.aw.e locale = new com.tencent.mm.aw.e();
    locale.fJS = 7;
    locale.fJZ = str2;
    locale.fKl = str3;
    locale.fJW = str4;
    locale.fJX = str5;
    locale.fKc = str6;
    locale.fKb = str7;
    locale.fKa = str8;
    locale.fKf = str9;
    locale.fKh = "";
    locale.fKe = str10;
    locale.fJU = str1;
    locale.fJV = 0.0F;
    locale.fJY = str11;
    locale.fJT = 1;
    locale.fKd = null;
    locale.fKk = str1;
    locale.fKq = true;
    com.tencent.mm.aw.a.b(locale);
    a.a.aId().a(JsApiOperateMusicPlayer.OperateMusicPlayer.b(this.hAH), this.hAH.csB);
    a.a.aId().ikS = this.hAH.csB;
    a.a.aId().ikT = locale.fJU;
    ab.i("MicroMsg.JsApiOperateMusicPlayer", "startPlayMusic");
    this.hAH.action = -1;
    this.hAH.errorMsg = "";
    this.hAH.error = false;
    JsApiOperateMusicPlayer.OperateMusicPlayer.c(this.hAH);
    AppMethodBeat.o(130719);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer.OperateMusicPlayer.1
 * JD-Core Version:    0.6.2
 */