package com.tencent.mm.plugin.choosemsgfile.b.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;

public final class g extends c
{
  private bi kua;
  private s kuh;

  public g(com.tencent.mm.plugin.choosemsgfile.b.b.a parama, a parama1, com.tencent.mm.vending.e.b paramb)
  {
    super(parama, parama1, paramb);
  }

  private void a(s params, String paramString)
  {
    AppMethodBeat.i(54285);
    MsgFile localMsgFile = new MsgFile();
    localMsgFile.fileSize = params.frO;
    localMsgFile.filePath = paramString;
    localMsgFile.eov = com.tencent.mm.plugin.choosemsgfile.b.d.b.cv(localMsgFile.filePath);
    localMsgFile.type = "video";
    localMsgFile.fileName = (params.getFileName() + "." + localMsgFile.eov);
    localMsgFile.timeStamp = params.createTime;
    b(localMsgFile);
    AppMethodBeat.o(54285);
  }

  protected final boolean bfh()
  {
    AppMethodBeat.i(54283);
    boolean bool;
    if (this.kuh.alz())
    {
      o.all();
      String str = t.uh(this.kua.field_imgPath);
      if (e.ct(str))
      {
        a(this.kuh, str);
        bool = true;
        AppMethodBeat.o(54283);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54283);
    }
  }

  protected final void bfi()
  {
    AppMethodBeat.i(54284);
    o.all().a(new t.a()
    {
      public final void a(t.a.a paramAnonymousa)
      {
        AppMethodBeat.i(54281);
        s locals = u.ut(paramAnonymousa.fileName);
        if (locals != null)
        {
          int i = locals.fWY;
          int j = locals.frO;
          g.this.dL(i, j);
          if (locals.alz())
          {
            o.all();
            paramAnonymousa = t.uh(g.a(g.this).field_imgPath);
            if (e.ct(paramAnonymousa))
            {
              g.a(g.this, locals, paramAnonymousa);
              AppMethodBeat.o(54281);
            }
          }
        }
        while (true)
        {
          return;
          ab.e("MicroMsg.MsgFileWorker_Video", "video isn't exist, return");
          g.this.bfk();
          AppMethodBeat.o(54281);
        }
      }
    }
    , Looper.getMainLooper());
    if (this.kuh.aly())
    {
      ab.i("MicroMsg.MsgFileWorker_Video", "start complete online video");
      u.uA(this.kua.field_imgPath);
      AppMethodBeat.o(54284);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MsgFileWorker_Video", "start complete offline video");
      u.ag(this.kua.field_imgPath, 10);
      u.up(this.kua.field_imgPath);
      AppMethodBeat.o(54284);
    }
  }

  protected final boolean checkValid()
  {
    AppMethodBeat.i(54282);
    boolean bool;
    if ((this.ktT == null) || (this.ktT.kua == null))
    {
      ab.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo is null, return");
      AppMethodBeat.o(54282);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.kua = this.ktT.kua;
      if (this.kua.dtH())
      {
        ab.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s is clean, return", new Object[] { this.kua });
        AppMethodBeat.o(54282);
        bool = false;
      }
      else if (!((com.tencent.mm.choosemsgfile.compat.b)com.tencent.mm.kernel.g.K(com.tencent.mm.choosemsgfile.compat.b.class)).f(this.kua))
      {
        ab.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s is not video, return", new Object[] { this.kua });
        AppMethodBeat.o(54282);
        bool = false;
      }
      else
      {
        this.kuh = u.ut(this.kua.field_imgPath);
        if (this.kuh == null)
        {
          ab.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s videoInfo is null, return", new Object[] { this.kua });
          AppMethodBeat.o(54282);
          bool = false;
        }
        else if (this.kuh.status == 198)
        {
          ab.e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s videoInfo is invalid, return", new Object[] { this.kua });
          AppMethodBeat.o(54282);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(54282);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.g
 * JD-Core Version:    0.6.2
 */