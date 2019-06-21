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
import com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class l$2
  implements q.a
{
  public l$2(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5, String paramString6, MMActivity paramMMActivity)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(52983);
    if (paramBoolean)
    {
      String str1 = this.kUP;
      String str2 = this.kUQ;
      Object localObject1 = this.hWg;
      paramInt = this.kUR;
      String str3 = this.kUN;
      Object localObject2 = this.val$name;
      Object localObject3 = this.kUS;
      ab.d("MicroMsg.emoji.EmojiSharedMgr", "shareToFriend");
      Object localObject4 = new WXMediaMessage();
      ((WXMediaMessage)localObject4).title = str2;
      ((WXMediaMessage)localObject4).description = ((String)localObject1);
      localObject1 = new WXDesignerSharedObject();
      ((WXDesignerSharedObject)localObject1).designerUIN = paramInt;
      ((WXDesignerSharedObject)localObject1).thumburl = ((String)localObject3);
      ((WXDesignerSharedObject)localObject1).url = str3;
      ((WXDesignerSharedObject)localObject1).designerName = ((String)localObject2);
      ((WXDesignerSharedObject)localObject1).designerRediretctUrl = ((String)localObject3);
      ((WXMediaMessage)localObject4).mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
      o.ahk();
      localObject2 = c.kR((String)localObject3);
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
      h.bQ(this.cgq, this.cgq.getString(2131297050));
    }
    AppMethodBeat.o(52983);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.l.2
 * JD-Core Version:    0.6.2
 */