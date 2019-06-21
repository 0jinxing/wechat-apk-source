package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.t;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import java.io.ByteArrayOutputStream;
import java.util.Map;

final class SnsTransparentUI$1$1
  implements q.a
{
  SnsTransparentUI$1$1(SnsTransparentUI.1 param1, String paramString1, Context paramContext, String paramString2)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(39632);
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = new WXMediaMessage();
      ((WXMediaMessage)localObject1).title = this.rBI.rBC;
      ((WXMediaMessage)localObject1).description = this.rBI.rBE;
      Object localObject2 = new WXWebpageObject();
      ((WXWebpageObject)localObject2).canvasPageXml = this.qHy;
      ((WXWebpageObject)localObject2).webpageUrl = this.rBI.rBF;
      ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
      if (SnsTransparentUI.a(this.rBI.rBH).containsKey(this.rBI.rBD))
      {
        localObject2 = (Bitmap)SnsTransparentUI.a(this.rBI.rBH).get(this.rBI.rBD);
        if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
        {
          ab.i("SnsTransparentUI", "thumb image is not null");
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
          ((WXMediaMessage)localObject1).thumbData = localByteArrayOutputStream.toByteArray();
        }
        localObject2 = new py();
        ((py)localObject2).cMe.cEl = ((WXMediaMessage)localObject1);
        ((py)localObject2).cMe.toUser = this.cgl;
        ((py)localObject2).cMe.cMf = 49;
        ((py)localObject2).cMe.cMg = "";
        ((py)localObject2).cMe.cMh = "";
        ((py)localObject2).cMe.cMn = this.rBI.rBG;
        a.xxA.m((b)localObject2);
        if (!TextUtils.isEmpty(paramString))
        {
          localObject1 = new qb();
          ((qb)localObject1).cMq.cMr = this.cgl;
          ((qb)localObject1).cMq.content = paramString;
          ((qb)localObject1).cMq.type = t.nK(this.cgl);
          ((qb)localObject1).cMq.flags = 0;
          a.xxA.m((b)localObject1);
        }
        com.tencent.mm.ui.base.h.bQ(this.val$context, this.val$context.getString(2131297050));
        this.rBI.rBH.finish();
        AppMethodBeat.o(39632);
      }
    }
    while (true)
    {
      return;
      ag.ck(this.rBI.rBD);
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.c("adId", this.rBI.rBD, false, 1000000001, new SnsTransparentUI.1.1.1(this, (WXMediaMessage)localObject1, paramString));
      AppMethodBeat.o(39632);
      continue;
      com.tencent.mm.ui.base.h.bQ(this.val$context, this.val$context.getString(2131303492));
      this.rBI.rBH.finish();
      AppMethodBeat.o(39632);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTransparentUI.1.1
 * JD-Core Version:    0.6.2
 */