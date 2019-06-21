package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class l
{
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    AppMethodBeat.i(52985);
    Intent localIntent = new Intent();
    localIntent.putExtra("Ksnsupload_title", paramString1);
    localIntent.putExtra("KContentObjDesc", paramString2);
    localIntent.putExtra("Ksnsupload_imgurl", paramString3);
    localIntent.putExtra("Ksnsupload_link", paramString4);
    localIntent.putExtra("KUploadProduct_UserData", paramString5);
    localIntent.putExtra("Ksnsupload_type", paramInt);
    paramString1 = v.nW("emoje_stroe");
    v.Zp().y(paramString1, true).j("prePublishId", "emoje_stroe");
    localIntent.putExtra("reportSessionId", paramString1);
    d.c(paramContext, "sns", ".ui.SnsUploadUI", localIntent);
    AppMethodBeat.o(52985);
  }

  public static void a(final MMActivity paramMMActivity, String paramString1, final int paramInt1, final int paramInt2, final String paramString2, final String paramString3, final String paramString4, final String paramString5, final int paramInt3, final String paramString6)
  {
    AppMethodBeat.i(52987);
    ((i)g.K(i.class)).b(paramMMActivity.mController, paramString2, paramString4, paramString3, "", paramMMActivity.getString(2131297041), new q.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        AppMethodBeat.i(52984);
        if (paramAnonymousBoolean)
        {
          String str1 = this.kUI;
          int i = paramInt1;
          int j = paramInt2;
          String str2 = paramString2;
          String str3 = paramString3;
          String str4 = paramString4;
          Object localObject1 = paramString5;
          paramAnonymousInt = paramInt3;
          String str5 = paramString6;
          ab.d("MicroMsg.emoji.EmojiSharedMgr", "doSharedToFriend");
          Object localObject2 = new WXMediaMessage();
          ((WXMediaMessage)localObject2).title = str2;
          ((WXMediaMessage)localObject2).description = str3;
          Object localObject3 = new WXEmojiPageSharedObject();
          ((WXEmojiPageSharedObject)localObject3).type = i;
          ((WXEmojiPageSharedObject)localObject3).tid = j;
          ((WXEmojiPageSharedObject)localObject3).title = str2;
          ((WXEmojiPageSharedObject)localObject3).desc = str3;
          ((WXEmojiPageSharedObject)localObject3).iconUrl = str4;
          ((WXEmojiPageSharedObject)localObject3).secondUrl = ((String)localObject1);
          ((WXEmojiPageSharedObject)localObject3).pageType = paramAnonymousInt;
          ((WXEmojiPageSharedObject)localObject3).url = str5;
          ((WXMediaMessage)localObject2).mediaObject = ((WXMediaMessage.IMediaObject)localObject3);
          o.ahk();
          localObject3 = c.kR(str4);
          if ((localObject3 != null) && (!((Bitmap)localObject3).isRecycled()))
          {
            ab.i("MicroMsg.emoji.EmojiSharedMgr", "thumb image is not null");
            localObject1 = new ByteArrayOutputStream();
            ((Bitmap)localObject3).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject1);
            ((WXMediaMessage)localObject2).thumbData = ((ByteArrayOutputStream)localObject1).toByteArray();
          }
          localObject1 = new py();
          ((py)localObject1).cMe.cEl = ((WXMediaMessage)localObject2);
          ((py)localObject1).cMe.toUser = str1;
          ((py)localObject1).cMe.cMf = 49;
          ((py)localObject1).cMe.cMg = str1;
          ((py)localObject1).cMe.cMh = "";
          a.xxA.m((b)localObject1);
          if (!TextUtils.isEmpty(paramAnonymousString))
          {
            localObject2 = new qb();
            ((qb)localObject2).cMq.cMr = str1;
            ((qb)localObject2).cMq.content = paramAnonymousString;
            ((qb)localObject2).cMq.type = t.nK(str1);
            ((qb)localObject2).cMq.flags = 0;
            a.xxA.m((b)localObject2);
          }
          h.bQ(paramMMActivity, paramMMActivity.getString(2131297050));
          AppMethodBeat.o(52984);
        }
        while (true)
        {
          return;
          AppMethodBeat.o(52984);
        }
      }
    });
    AppMethodBeat.o(52987);
  }

  public static void dE(Context paramContext)
  {
    AppMethodBeat.i(52986);
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
    localIntent.putExtra("MMActivity.OverrideExitAnimation", 2131034227);
    d.b(paramContext, ".ui.transmit.SelectConversationUI", localIntent, 2002);
    AppMethodBeat.o(52986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.l
 * JD-Core Version:    0.6.2
 */