package com.tencent.mm.plugin.emoji.e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.t;
import com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class l$1
  implements q.a
{
  public l$1(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, MMActivity paramMMActivity)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(52982);
    if (paramBoolean)
    {
      String str1 = this.kUI;
      String str2 = this.kUJ;
      Object localObject1 = this.kUK;
      String str3 = this.kUL;
      Object localObject2 = this.kUM;
      Object localObject3 = this.kUN;
      paramInt = this.kUO;
      ab.d("MicroMsg.emoji.EmojiSharedMgr", "doSharedToFriend");
      Object localObject4 = new WXMediaMessage();
      ((WXMediaMessage)localObject4).title = ((String)localObject1);
      ((WXMediaMessage)localObject4).description = str3;
      localObject1 = new WXEmojiSharedObject();
      ((WXEmojiSharedObject)localObject1).packageflag = paramInt;
      ((WXEmojiSharedObject)localObject1).packageid = str2;
      ((WXEmojiSharedObject)localObject1).thumburl = ((String)localObject2);
      ((WXEmojiSharedObject)localObject1).url = ((String)localObject3);
      ((WXMediaMessage)localObject4).mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
      o.ahk();
      localObject2 = c.kR((String)localObject2);
      if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
      {
        ab.i("MicroMsg.emoji.EmojiSharedMgr", "thumb image is not null");
        localObject3 = new ByteArrayOutputStream();
        ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject3);
        ((WXMediaMessage)localObject4).thumbData = ((ByteArrayOutputStream)localObject3).toByteArray();
      }
      localObject2 = new py();
      ((py)localObject2).cMe.cEl = ((WXMediaMessage)localObject4);
      ((py)localObject2).cMe.toUser = str1;
      ((py)localObject2).cMe.cMf = 49;
      ((py)localObject2).cMe.cMg = str1;
      ((py)localObject2).cMe.cMh = "";
      a.xxA.m((b)localObject2);
      if (!TextUtils.isEmpty(paramString))
      {
        localObject4 = new qb();
        ((qb)localObject4).cMq.cMr = str1;
        ((qb)localObject4).cMq.content = paramString;
        ((qb)localObject4).cMq.type = t.nK(str1);
        ((qb)localObject4).cMq.flags = 0;
        a.xxA.m((b)localObject4);
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(10993, new Object[] { Integer.valueOf(0), str2 });
      com.tencent.mm.ui.base.h.bQ(this.cgq, this.cgq.getString(2131297050));
    }
    AppMethodBeat.o(52982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.l.1
 * JD-Core Version:    0.6.2
 */