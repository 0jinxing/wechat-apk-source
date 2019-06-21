package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.audio.b.i;
import com.tencent.mm.bt.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.wear.model.f.d;
import com.tencent.mm.protocal.protobuf.cus;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.be;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

final class m$a extends d
{
  private cus tYB;

  public m$a(cus paramcus)
  {
    this.tYB = paramcus;
  }

  public final void execute()
  {
    AppMethodBeat.i(26411);
    String str = q.uP(this.tYB.wyw);
    ab.i("MicroMsg.Wear.HttpReplyServer", "get fileName=%s", new Object[] { str });
    Object localObject = q.U(str, false);
    ab.i("MicroMsg.Wear.HttpReplyServer", "get fullPath=%s", new Object[] { localObject });
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(this.tYB.vHn.toByteArray());
    com.tencent.mm.audio.d.c localc = new com.tencent.mm.audio.d.c(8000, 16000);
    localc.eo((String)localObject);
    localObject = new byte[320];
    int i = 0;
    try
    {
      while (true)
      {
        int j = localByteArrayInputStream.read((byte[])localObject, 0, 320);
        i = j;
        label117: if (i <= 0)
          break;
        localc.a(new g.a((byte[])localObject, i), 0, false);
      }
      localc.Fe();
      ab.i("MicroMsg.Wear.HttpReplyServer", "amr compress finish");
      q.ah(str, (int)this.tYB.xqQ);
      m.amc().run();
      ab.i("MicroMsg.Wear.HttpReplyServer", "run service to send the voice");
      aw.ZK();
      com.tencent.mm.model.c.XR().apb(this.tYB.wyw);
      AppMethodBeat.o(26411);
      return;
    }
    catch (IOException localIOException)
    {
      break label117;
    }
  }

  public final String getName()
  {
    return "SendVioceMsgTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.m.a
 * JD-Core Version:    0.6.2
 */