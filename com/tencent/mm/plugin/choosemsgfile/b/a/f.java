package com.tencent.mm.plugin.choosemsgfile.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.d;
import com.tencent.mm.at.o;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class f extends c
{
  private bi kua;
  private com.tencent.mm.at.e kuf;

  public f(com.tencent.mm.plugin.choosemsgfile.b.b.a parama, a parama1, com.tencent.mm.vending.e.b paramb)
  {
    super(parama, parama1, paramb);
  }

  private void HI(String paramString)
  {
    AppMethodBeat.i(54278);
    MsgFile localMsgFile = new MsgFile();
    localMsgFile.fileSize = ((int)com.tencent.mm.vfs.e.asZ(paramString));
    localMsgFile.filePath = paramString;
    localMsgFile.fileName = this.kuf.fDz;
    localMsgFile.type = "image";
    localMsgFile.eov = com.tencent.mm.plugin.choosemsgfile.b.d.b.cv(localMsgFile.fileName);
    localMsgFile.timeStamp = this.kuf.fDG;
    b(localMsgFile);
    AppMethodBeat.o(54278);
  }

  private void a(com.tencent.mm.plugin.choosemsgfile.b.b.b paramb)
  {
    AppMethodBeat.i(54277);
    MsgFile localMsgFile = new MsgFile();
    localMsgFile.fileSize = paramb.bfp();
    localMsgFile.filePath = ((com.tencent.mm.choosemsgfile.compat.b)g.K(com.tencent.mm.choosemsgfile.compat.b.class)).e(this.kua);
    localMsgFile.fileName = (paramb.getFileName() + "." + localMsgFile.eov);
    localMsgFile.type = "image";
    localMsgFile.eov = paramb.bfo();
    localMsgFile.timeStamp = paramb.getTimeStamp();
    b(localMsgFile);
    AppMethodBeat.o(54277);
  }

  protected final boolean bfh()
  {
    AppMethodBeat.i(54275);
    boolean bool;
    if (this.kua.getType() == 268435505)
    {
      if (!com.tencent.mm.vfs.e.ct(((com.tencent.mm.choosemsgfile.compat.b)g.K(com.tencent.mm.choosemsgfile.compat.b.class)).e(this.kua)))
        break label138;
      if ((this.ktT instanceof com.tencent.mm.plugin.choosemsgfile.b.b.b))
      {
        a((com.tencent.mm.plugin.choosemsgfile.b.b.b)this.ktT);
        AppMethodBeat.o(54275);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.MsgFileWorker_Image", "mMsgItem isn't AppMsgImageMsgItem, err");
      bfk();
      break;
      if (this.kuf.agP())
      {
        String str = ((com.tencent.mm.choosemsgfile.compat.b)g.K(com.tencent.mm.choosemsgfile.compat.b.class)).a(this.kua, this.kuf);
        if (!bo.isNullOrNil(str))
        {
          HI(str);
          AppMethodBeat.o(54275);
          bool = true;
        }
      }
      else
      {
        label138: bool = false;
        AppMethodBeat.o(54275);
      }
    }
  }

  protected final void bfi()
  {
    AppMethodBeat.i(54276);
    if (this.kua.getType() == 268435505)
    {
      ((com.tencent.mm.choosemsgfile.compat.b)g.K(com.tencent.mm.choosemsgfile.compat.b.class)).a(this.kua, new f.1(this));
      AppMethodBeat.o(54276);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MsgFileWorker_Image", "isOk:%b", new Object[] { Boolean.valueOf(o.ahm().a(this.kuf.fDy, this.kua.field_msgId, 0, Long.valueOf(this.kua.field_msgId), 2130838182, new f.2(this))) });
      AppMethodBeat.o(54276);
    }
  }

  protected final boolean checkValid()
  {
    AppMethodBeat.i(54274);
    boolean bool;
    if ((this.ktT == null) || (this.ktT.kua == null))
    {
      ab.e("MicroMsg.MsgFileWorker_Image", "mMsgInfo is null, return");
      bfk();
      AppMethodBeat.o(54274);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.kua = this.ktT.kua;
      if (this.kua.dtH())
      {
        ab.e("MicroMsg.MsgFileWorker_Image", "mMsgInfo:%s is clean, return", new Object[] { this.kua });
        AppMethodBeat.o(54274);
        bool = false;
      }
      else if (!((com.tencent.mm.choosemsgfile.compat.b)g.K(com.tencent.mm.choosemsgfile.compat.b.class)).c(this.kua))
      {
        ab.e("MicroMsg.MsgFileWorker_Image", "mMsgInfo is not img msg, return");
        AppMethodBeat.o(54274);
        bool = false;
      }
      else if (this.kua.getType() == 268435505)
      {
        AppMethodBeat.o(54274);
        bool = true;
      }
      else
      {
        this.kuf = ((com.tencent.mm.choosemsgfile.compat.b)g.K(com.tencent.mm.choosemsgfile.compat.b.class)).d(this.kua);
        if (this.kuf == null)
        {
          ab.e("MicroMsg.MsgFileWorker_Image", "mImgInfo is null, return");
          AppMethodBeat.o(54274);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(54274);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.f
 * JD-Core Version:    0.6.2
 */