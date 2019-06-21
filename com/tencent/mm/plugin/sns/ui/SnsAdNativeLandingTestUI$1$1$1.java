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
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

final class SnsAdNativeLandingTestUI$1$1$1
  implements q.a
{
  SnsAdNativeLandingTestUI$1$1$1(SnsAdNativeLandingTestUI.1.1 param1, String paramString, Context paramContext)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(38700);
    if (paramBoolean)
    {
      Object localObject1 = new WXMediaMessage();
      ((WXMediaMessage)localObject1).title = "test title";
      ((WXMediaMessage)localObject1).description = "test desc";
      Object localObject2 = new WXWebpageObject();
      ((WXWebpageObject)localObject2).canvasPageXml = "<xml></xml>";
      ((WXWebpageObject)localObject2).webpageUrl = "http://www.baidu.com/";
      ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
      Bitmap localBitmap = ad.getBitmap("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150");
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        ab.i("MicroMsg.Sns.SnsAdNativieLandingTestUI", "thumb image is not null");
        localObject2 = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject2);
        ((WXMediaMessage)localObject1).thumbData = ((ByteArrayOutputStream)localObject2).toByteArray();
      }
      localObject2 = new py();
      ((py)localObject2).cMe.cEl = ((WXMediaMessage)localObject1);
      ((py)localObject2).cMe.toUser = this.cgl;
      ((py)localObject2).cMe.cMf = 49;
      ((py)localObject2).cMe.cMg = "";
      ((py)localObject2).cMe.cMh = "";
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
      h.bQ(this.val$context, this.val$context.getString(2131297050));
      AppMethodBeat.o(38700);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(38700);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.1.1.1
 * JD-Core Version:    0.6.2
 */