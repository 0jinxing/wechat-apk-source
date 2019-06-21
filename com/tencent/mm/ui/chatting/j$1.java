package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.m;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.l.a;
import com.tencent.mm.l.a.a;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.clk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import junit.framework.Assert;

final class j$1
  implements g.a
{
  j$1(bi parambi, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, com.tencent.mm.at.e parame, Context paramContext)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(30532);
    Object localObject1;
    int i;
    String str1;
    String str2;
    int j;
    String str3;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    bi localbi;
    long l1;
    if (paramd != null)
    {
      if (!paramd.field_exist_whencheck)
        break label755;
      ab.d("MicroMsg.ChattingEditModeLogic", "support second !! sceneResult:[%s]", new Object[] { paramd });
      localObject1 = this.fku;
      i = this.jOj;
      str1 = this.fwC;
      str2 = this.yIy;
      paramString = this.yIz;
      paramc = this.iRf;
      j = this.fEU;
      str3 = o.ahl().I(((cy)localObject1).field_imgPath, true);
      localObject2 = new PString();
      localObject3 = new PInt();
      localObject4 = new PInt();
      ((PString)localObject2).value = "";
      localbi = new bi();
      localbi.setType(t.nL(str1));
      localbi.ju(str1);
      localbi.hO(1);
      localbi.setStatus(1);
      localbi.eJ(bf.oC(localbi.field_talker));
      localbi.setContent(paramString);
      a.a.KG().g(localbi);
      l1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(localbi);
      if (l1 < 0L)
        break label749;
      paramBoolean = true;
      Assert.assertTrue(paramBoolean);
      ab.i("MicroMsg.ChattingEditModeLogic", "NetSceneUploadMsgImg: local msgId = ".concat(String.valueOf(l1)));
      if (j != 1)
        break label818;
    }
    label818: for (long l2 = o.ahl().a(null, l1, true, localbi.field_content, (PString)localObject2, (PInt)localObject3, (PInt)localObject4); ; l2 = 0L)
    {
      long l3 = o.ahl().a(null, l1, false, localbi.field_content, (PString)localObject2, (PInt)localObject3, (PInt)localObject4);
      localObject4 = br.z(paramString, "msg");
      paramInt = bo.getInt((String)((Map)localObject4).get(".msg.img.$length"), paramd.field_thumbimgLength);
      paramString = o.ahl().b(Long.valueOf(l3));
      paramString.fG((int)l1);
      if (l3 > 0L)
      {
        localObject3 = o.ahl().b(((PString)localObject2).value, "th_", "", false);
        ab.i("MicroMsg.ChattingEditModeLogic", "deal send img for cdn [%s]", new Object[] { localObject3 });
        com.tencent.mm.vfs.e.y(str3, (String)localObject3);
        localbi.jv(((PString)localObject2).value);
        localbi.hZ(((cy)localObject1).dJw);
        localbi.ia(((cy)localObject1).dJx);
        if (l2 > 0L)
        {
          paramString.lx(1);
          paramString.lu((int)l2);
          paramInt = bo.getInt((String)((Map)localObject4).get(".msg.img.$hdlength"), paramd.field_thumbimgLength);
        }
      }
      while (true)
      {
        o.ahl().a(Long.valueOf(l3), paramString);
        if (j == 1)
          paramString = o.ahl().b(Long.valueOf(l2));
        while (true)
        {
          ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(l1, localbi);
          o.ahl().a(Long.valueOf(l2), paramString);
          localObject1 = com.tencent.mm.al.c.a("upimg", localbi.field_createTime, localbi.field_talker, localbi.field_msgId + "_" + l2 + "_" + j);
          localObject2 = new clk();
          ((clk)localObject2).vEB = new bts().alV(str2);
          ((clk)localObject2).vEC = new bts().alV(str1);
          ((clk)localObject2).nao = localbi.getType();
          ((clk)localObject2).vEG = localbi.dqJ;
          ((clk)localObject2).vRz = paramString.fDD;
          ((clk)localObject2).xja = new bts().alV((String)localObject1);
          ((clk)localObject2).wqw = j;
          paramd.field_filemd5 = paramc;
          paramd.field_thumbimgLength = ((int)com.tencent.mm.vfs.e.asZ(str3));
          paramd.field_fileLength = paramInt;
          paramString = new m(i, (clk)localObject2, paramString, paramd, new j.2(l3, l1));
          com.tencent.mm.kernel.g.Rg().a(paramString, 0);
          while (true)
          {
            AppMethodBeat.o(30532);
            return 0;
            label749: paramBoolean = false;
            break;
            label755: ab.d("MicroMsg.ChattingEditModeLogic", "not support second !! dealDownLoadImg");
            paramString = o.ahl().q(this.fFp.fDB, "th_", "");
            j.a(this.val$context, this.fFp, this.fku, this.jOj, this.fwC, paramString);
          }
          l2 = l3;
        }
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j.1
 * JD-Core Version:    0.6.2
 */