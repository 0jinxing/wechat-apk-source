package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.Map;

public class d extends f
{
  public int cRV = 0;
  public EmojiInfo exP;

  public final f Xz()
  {
    AppMethodBeat.i(16189);
    d locald = new d();
    AppMethodBeat.o(16189);
    return locald;
  }

  public final void a(StringBuilder paramStringBuilder, j.b paramb, String paramString, com.tencent.mm.i.d paramd, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(16190);
    if (paramb.type == 2001)
      x.a(paramStringBuilder, this.exP, this.cRV);
    AppMethodBeat.o(16190);
  }

  public final void a(Map<String, String> paramMap, j.b paramb)
  {
    AppMethodBeat.i(16191);
    if (paramb.type == 2001)
    {
      paramb = new EmojiInfo();
      paramb.field_md5 = bo.nullAsNil((String)paramMap.get(".msg.appmsg.emoji.md5"));
      paramb.field_type = bo.getInt((String)paramMap.get(".msg.appmsg.emoji.type"), 0);
      paramb.field_width = bo.getInt((String)paramMap.get(".msg.appmsg.emoji.width"), 0);
      paramb.field_height = bo.getInt((String)paramMap.get(".msg.appmsg.emoji.height"), 0);
      paramb.field_size = bo.getInt((String)paramMap.get(".msg.appmsg.emoji.len"), 0);
      paramb.field_aeskey = bo.nullAsNil((String)paramMap.get(".msg.appmsg.emoji.aeskey"));
      paramb.field_cdnUrl = bo.nullAsNil((String)paramMap.get(".msg.appmsg.emoji.cdnurl"));
      paramb.field_encrypturl = bo.nullAsNil((String)paramMap.get(".msg.appmsg.emoji.encrypturl"));
      paramb.field_externUrl = bo.nullAsNil((String)paramMap.get(".msg.appmsg.emoji.externurl"));
      paramb.field_externMd5 = bo.nullAsNil((String)paramMap.get(".msg.appmsg.emoji.externmd5"));
      paramb.field_groupId = bo.nullAsNil((String)paramMap.get(".msg.appmsg.emoji.productid"));
      paramb.field_designerID = bo.nullAsNil((String)paramMap.get(".msg.appmsg.emoji.designerid"));
      paramb.field_attachedText = bo.nullAsNil((String)paramMap.get(".msg.appmsg.emoji.attachedtext"));
      paramb.field_temp = 1;
      paramb.field_catalog = EmojiInfo.yaf;
      paramb.field_state = EmojiInfo.yav;
      this.exP = paramb;
      this.cRV = bo.getInt((String)paramMap.get(".msg.appmsg.emoji.localreceivestatus"), 0);
      if (j.getEmojiStorageMgr().xYn.aqi(paramb.field_md5) == null)
        j.getEmojiStorageMgr().xYn.E(this.exP);
      ab.d("MicroMsg.AppContentLuckyMoneyEmogiPiece", "EmojiInfo: %s", new Object[] { this.exP });
    }
    AppMethodBeat.o(16191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.d
 * JD-Core Version:    0.6.2
 */