package com.tencent.mm.plugin.choosemsgfile.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class e extends c
{
  private String IS;
  private long edW;
  private bi kua;
  private com.tencent.mm.vending.e.a kub;

  public e(com.tencent.mm.plugin.choosemsgfile.b.b.a parama, a parama1, com.tencent.mm.vending.e.b paramb)
  {
    super(parama, parama1, paramb);
  }

  protected final boolean bfh()
  {
    AppMethodBeat.i(54266);
    com.tencent.mm.pluginsdk.model.app.b localb = ((com.tencent.mm.choosemsgfile.compat.b)g.K(com.tencent.mm.choosemsgfile.compat.b.class)).i(this.IS, this.edW);
    boolean bool;
    if (((com.tencent.mm.choosemsgfile.compat.b)g.K(com.tencent.mm.choosemsgfile.compat.b.class)).a(this.kua, localb))
    {
      MsgFile localMsgFile = new MsgFile();
      localMsgFile.fileSize = this.ktT.bfp();
      localMsgFile.filePath = localb.field_fileFullPath;
      localMsgFile.fileName = this.ktT.getFileName();
      localMsgFile.type = "file";
      localMsgFile.eov = this.ktT.bfo();
      localMsgFile.timeStamp = (this.ktT.getTimeStamp() / 1000L);
      b(localMsgFile);
      bool = true;
      AppMethodBeat.o(54266);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54266);
    }
  }

  protected final void bfi()
  {
    AppMethodBeat.i(54267);
    boolean bool = ((com.tencent.mm.choosemsgfile.compat.b)g.K(com.tencent.mm.choosemsgfile.compat.b.class)).a(this.IS, this.kua, new e.1(this));
    ab.i("MicroMsg.MsgFileWorker_File", "initOk:%b", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      ab.i("MicroMsg.MsgFileWorker_File", "initOk fail");
      bfk();
    }
    AppMethodBeat.o(54267);
  }

  protected final boolean checkValid()
  {
    boolean bool = false;
    AppMethodBeat.i(54265);
    ab.i("MicroMsg.MsgFileWorker_File", "start %s", new Object[] { this });
    if ((this.ktT == null) || (this.ktT.kua == null))
    {
      ab.e("MicroMsg.MsgFileWorker_File", "mMsgInfo is null, err");
      AppMethodBeat.o(54265);
    }
    while (true)
    {
      return bool;
      this.kua = this.ktT.kua;
      this.edW = this.ktT.kua.field_msgId;
      j.b localb = j.b.me(this.kua.field_content);
      if (localb == null)
      {
        ab.e("MicroMsg.MsgFileWorker_File", "parse msgContent error, %s", new Object[] { this.kua.field_content });
        AppMethodBeat.o(54265);
      }
      else
      {
        if ((bo.isNullOrNil(localb.csD)) && (!bo.isNullOrNil(localb.fgD)))
        {
          ab.e("MicroMsg.MsgFileWorker_File", "msgContent format error, %s", new Object[] { this.kua.field_content });
          localb.csD = localb.fgD.hashCode();
        }
        this.IS = localb.csD;
        if (bo.isNullOrNil(this.IS))
        {
          ab.e("MicroMsg.MsgFileWorker_File", "MediaId is null, err return");
          AppMethodBeat.o(54265);
        }
        else
        {
          AppMethodBeat.o(54265);
          bool = true;
        }
      }
    }
  }

  public final void dead()
  {
    AppMethodBeat.i(54268);
    ab.i("MicroMsg.MsgFileWorker_File", "dead");
    if (this.kub != null)
      this.kub.dead();
    AppMethodBeat.o(54268);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.e
 * JD-Core Version:    0.6.2
 */