package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.ui.chat.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;

public final class v
  implements j
{
  private Context context;
  private ad ehM;
  private String yJf;
  private boolean yLd;
  private boolean yLe;

  public v(Context paramContext, ad paramad, String paramString)
  {
    AppMethodBeat.i(30811);
    this.yLd = true;
    this.yLe = true;
    this.context = paramContext;
    this.ehM = paramad;
    this.yJf = paramString;
    if (ad.mR(this.yJf))
      this.yLe = false;
    if (ad.aow(this.yJf))
      this.yLd = false;
    if (ad.aou(this.yJf))
      this.yLd = false;
    if ((this.ehM != null) && (ad.mR(this.ehM.field_username)))
      paramContext = this.yJf;
    while (true)
    {
      if (com.tencent.mm.model.t.mT(paramContext))
        this.yLe = false;
      AppMethodBeat.o(30811);
      return;
      if (this.ehM == null)
        paramContext = null;
      else
        paramContext = this.ehM.field_username;
    }
  }

  public final void A(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(30812);
    aw.ZK();
    if (!c.isSDCardAvailable())
    {
      com.tencent.mm.ui.base.t.hO(this.context);
      AppMethodBeat.o(30812);
    }
    while (true)
    {
      return;
      if (paramEmojiInfo != null)
        break;
      AppMethodBeat.o(30812);
    }
    if ((this.ehM.field_username.equals("medianote")) && ((r.YD() & 0x4000) == 0));
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label208;
      paramEmojiInfo.field_start = 0;
      paramEmojiInfo.field_state = EmojiInfo.yat;
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().updateEmojiInfo(paramEmojiInfo);
      localObject = new bi();
      ((bi)localObject).setType(47);
      ((bi)localObject).ju("medianote");
      ((bi)localObject).hO(1);
      if (paramEmojiInfo.xy())
        ((bi)localObject).setContent(com.tencent.mm.storage.ap.a(r.Yz(), 0L, false, paramEmojiInfo.Aq(), false, ""));
      ((bi)localObject).jv(paramEmojiInfo.Aq());
      ((bi)localObject).eJ(bf.oC(((cy)localObject).field_talker));
      ((bi)localObject).setStatus(2);
      aw.ZK();
      c.XO().Z((bi)localObject);
      AppMethodBeat.o(30812);
      break;
    }
    label208: com.tencent.mm.pluginsdk.a.d locald = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr();
    if (bo.isNullOrNil(this.yJf));
    for (Object localObject = this.ehM.field_username; ; localObject = this.yJf)
    {
      locald.a((String)localObject, paramEmojiInfo, null);
      AppMethodBeat.o(30812);
      break;
    }
  }

  // ERROR //
  public final void B(EmojiInfo paramEmojiInfo)
  {
    // Byte code:
    //   0: sipush 30813
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 70	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   9: pop
    //   10: invokestatic 76	com/tencent/mm/model/c:isSDCardAvailable	()Z
    //   13: ifne +17 -> 30
    //   16: aload_0
    //   17: getfield 32	com/tencent/mm/ui/chatting/v:context	Landroid/content/Context;
    //   20: invokestatic 82	com/tencent/mm/ui/base/t:hO	(Landroid/content/Context;)V
    //   23: sipush 30813
    //   26: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   29: return
    //   30: aload_1
    //   31: ifnonnull +12 -> 43
    //   34: sipush 30813
    //   37: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: goto -11 -> 29
    //   43: new 201	com/tencent/mm/opensdk/modelmsg/WXMediaMessage
    //   46: dup
    //   47: invokespecial 202	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:<init>	()V
    //   50: astore_2
    //   51: new 204	java/lang/StringBuilder
    //   54: dup
    //   55: invokespecial 205	java/lang/StringBuilder:<init>	()V
    //   58: astore_3
    //   59: invokestatic 70	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   62: pop
    //   63: aload_3
    //   64: invokestatic 208	com/tencent/mm/model/c:Yb	()Ljava/lang/String;
    //   67: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload_1
    //   71: invokevirtual 147	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   74: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: astore 4
    //   82: new 204	java/lang/StringBuilder
    //   85: dup
    //   86: invokespecial 205	java/lang/StringBuilder:<init>	()V
    //   89: aload 4
    //   91: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc 217
    //   96: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokestatic 222	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   105: ifeq +100 -> 205
    //   108: new 204	java/lang/StringBuilder
    //   111: dup
    //   112: invokespecial 205	java/lang/StringBuilder:<init>	()V
    //   115: aload 4
    //   117: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: ldc 217
    //   122: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: invokestatic 225	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   131: l2i
    //   132: istore 5
    //   134: aload_2
    //   135: new 204	java/lang/StringBuilder
    //   138: dup
    //   139: invokespecial 205	java/lang/StringBuilder:<init>	()V
    //   142: aload 4
    //   144: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: ldc 217
    //   149: invokevirtual 212	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   155: iconst_0
    //   156: iload 5
    //   158: invokestatic 229	com/tencent/mm/vfs/e:e	(Ljava/lang/String;II)[B
    //   161: putfield 233	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:thumbData	[B
    //   164: aload_2
    //   165: new 235	com/tencent/mm/opensdk/modelmsg/WXEmojiObject
    //   168: dup
    //   169: aload 4
    //   171: invokespecial 237	com/tencent/mm/opensdk/modelmsg/WXEmojiObject:<init>	(Ljava/lang/String;)V
    //   174: putfield 241	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   177: aload_2
    //   178: aload_1
    //   179: getfield 244	com/tencent/mm/storage/emotion/EmojiInfo:field_app_id	Ljava/lang/String;
    //   182: aconst_null
    //   183: aload_0
    //   184: getfield 36	com/tencent/mm/ui/chatting/v:yJf	Ljava/lang/String;
    //   187: iconst_1
    //   188: aload_1
    //   189: invokevirtual 147	com/tencent/mm/storage/emotion/EmojiInfo:Aq	()Ljava/lang/String;
    //   192: invokestatic 249	com/tencent/mm/pluginsdk/model/app/l:a	(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I
    //   195: pop
    //   196: sipush 30813
    //   199: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   202: goto -173 -> 29
    //   205: aload 4
    //   207: invokestatic 253	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   210: astore 6
    //   212: aload 6
    //   214: astore_3
    //   215: aload_2
    //   216: aload 6
    //   218: fconst_1
    //   219: invokestatic 259	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$b:b	(Ljava/io/InputStream;F)Landroid/graphics/Bitmap;
    //   222: invokevirtual 263	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:setThumbImage	(Landroid/graphics/Bitmap;)V
    //   225: aload 6
    //   227: invokestatic 266	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   230: goto -66 -> 164
    //   233: astore 7
    //   235: aconst_null
    //   236: astore 6
    //   238: aload 6
    //   240: astore_3
    //   241: ldc_w 268
    //   244: aload 7
    //   246: ldc 149
    //   248: iconst_0
    //   249: anewarray 4	java/lang/Object
    //   252: invokestatic 274	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: aload 6
    //   257: astore_3
    //   258: ldc_w 268
    //   261: ldc_w 276
    //   264: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   267: aload 6
    //   269: invokestatic 266	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   272: goto -108 -> 164
    //   275: astore_1
    //   276: aconst_null
    //   277: astore_3
    //   278: aload_3
    //   279: invokestatic 266	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   282: sipush 30813
    //   285: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   288: aload_1
    //   289: athrow
    //   290: astore_1
    //   291: goto -13 -> 278
    //   294: astore 7
    //   296: goto -58 -> 238
    //
    // Exception table:
    //   from	to	target	type
    //   205	212	233	java/lang/Exception
    //   205	212	275	finally
    //   215	225	290	finally
    //   241	255	290	finally
    //   258	267	290	finally
    //   215	225	294	java/lang/Exception
  }

  public final boolean bOe()
  {
    return this.yLe;
  }

  public final boolean bOf()
  {
    return this.yLd;
  }

  public final void bOg()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.v
 * JD-Core Version:    0.6.2
 */