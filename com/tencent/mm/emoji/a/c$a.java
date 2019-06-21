package com.tencent.mm.emoji.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.bt.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.pluginsdk.a.e;
import com.tencent.mm.protocal.protobuf.ckw;
import com.tencent.mm.protocal.protobuf.ye;
import com.tencent.mm.protocal.protobuf.yf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.LinkedList;
import java.util.List;

public final class c$a extends a<yf>
{
  public c$a(EmojiInfo paramEmojiInfo, c.c paramc, boolean paramBoolean1, boolean paramBoolean2, String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(62242);
    paramEmojiInfo = new ye();
    ckw localckw = new ckw();
    localckw.wdO = paramc.Aq();
    localckw.ptx = paramBoolean1.start;
    localckw.ptw = paramc.field_size;
    localckw.xiE = paramBoolean2;
    localckw.wdD = paramList;
    Object localObject;
    localckw.xiG = localObject;
    localckw.wdF = paramc.field_lensId;
    localckw.wdE = paramc.field_attachTextColor;
    if (paramString2 != null)
      localckw.xiF.addAll(paramString2);
    if (paramBoolean2);
    for (int i = 1; ; i = 0)
    {
      paramEmojiInfo.vIK = i;
      paramEmojiInfo.wdV.add(localckw);
      paramEmojiInfo.wdX = paramString1;
      localckw.xiD = new b(a(paramc, paramBoolean1.start, paramBoolean1.cde));
      paramc = new b.a();
      paramc.fsJ = paramEmojiInfo;
      paramc.fsK = new yf();
      paramc.uri = "/cgi-bin/micromsg-bin/mmemojiupload";
      paramc.fsI = 703;
      this.ehh = paramc.acD();
      AppMethodBeat.o(62242);
      return;
    }
  }

  private byte[] a(EmojiInfo paramEmojiInfo, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62243);
    Object localObject;
    if ((paramEmojiInfo.field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB)
    {
      localObject = ((d)g.M(d.class)).getProvider().l(paramEmojiInfo);
      if (!bo.cb((byte[])localObject))
      {
        paramEmojiInfo = new byte[paramInt2];
        ab.d("CgiEmojiUpload", "total length:%d dataLen:%d ", new Object[] { Integer.valueOf(localObject.length), Integer.valueOf(paramInt2) });
        System.arraycopy(localObject, paramInt1, paramEmojiInfo, 0, paramInt2);
      }
    }
    while (true)
    {
      localObject = paramEmojiInfo;
      if (paramEmojiInfo == null)
        localObject = new byte[0];
      AppMethodBeat.o(62243);
      return localObject;
      ab.w("CgiEmojiUpload", "buffer is null.");
      paramEmojiInfo = new byte[0];
      continue;
      synchronized (c.b(this.eyU))
      {
        paramEmojiInfo.field_start = paramInt1;
        localObject = paramEmojiInfo.gZ(paramInt1, paramInt2);
        paramEmojiInfo.field_start = 0;
        paramEmojiInfo = (EmojiInfo)localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.a.c.a
 * JD-Core Version:    0.6.2
 */