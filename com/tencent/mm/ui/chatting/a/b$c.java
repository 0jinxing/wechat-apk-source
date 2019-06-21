package com.tencent.mm.ui.chatting.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.g;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;

public final class b$c
{
  public bi cKd;
  public String imagePath;
  boolean mog;
  public long timeStamp;
  public int type;
  public b.c.a yNE;

  public b$c(long paramLong)
  {
    AppMethodBeat.i(31134);
    this.type = 0;
    this.yNE = new b.c.a(this);
    this.timeStamp = paramLong;
    this.type = 2147483647;
    AppMethodBeat.o(31134);
  }

  public b$c(bi parambi)
  {
    AppMethodBeat.i(31133);
    this.type = 0;
    this.yNE = new b.c.a(this);
    this.cKd = parambi;
    Object localObject1;
    Object localObject2;
    if ((parambi.bws()) || (parambi.bwt()))
    {
      this.mog = true;
      com.tencent.mm.modelvideo.o.all();
      localObject1 = t.ui(parambi.field_imgPath);
      localObject2 = u.ut(parambi.field_imgPath);
      if (localObject2 != null)
        this.yNE.moi = bo.mK(((s)localObject2).fXd);
      this.yNE.cJM = j.b.X(parambi.field_content, parambi.field_reserved);
    }
    while (true)
    {
      Object localObject3 = localObject1;
      if (parambi.dtA())
      {
        Object localObject4 = j.b.me(parambi.field_content);
        localObject3 = null;
        localObject2 = localObject3;
        if (localObject4 != null)
        {
          localObject2 = localObject3;
          if (((j.b)localObject4).csD != null)
          {
            localObject2 = localObject3;
            if (((j.b)localObject4).csD.length() > 0)
            {
              localObject4 = am.aUq().aiE(((j.b)localObject4).csD);
              localObject2 = localObject3;
              if (localObject4 != null)
                localObject2 = ((b)localObject4).field_fileFullPath;
            }
          }
        }
        localObject3 = localObject1;
        if (localObject2 != null)
          localObject3 = localObject2;
      }
      this.imagePath = localObject3;
      this.timeStamp = parambi.field_createTime;
      AppMethodBeat.o(31133);
      return;
      localObject2 = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, false);
      localObject1 = localObject2;
      if (!bo.isNullOrNil((String)localObject2))
      {
        localObject1 = localObject2;
        if (!((String)localObject2).endsWith("hd"))
        {
          localObject1 = localObject2;
          if (e.ct((String)localObject2 + "hd"))
            localObject1 = (String)localObject2 + "hd";
        }
      }
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(31132);
    boolean bool;
    if ((this.cKd != null) && ((paramObject instanceof bi)) && (paramObject != null))
      if (this.cKd.field_msgId == ((bi)paramObject).field_msgId)
      {
        bool = true;
        AppMethodBeat.o(31132);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31132);
      continue;
      bool = super.equals(paramObject);
      AppMethodBeat.o(31132);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.b.c
 * JD-Core Version:    0.6.2
 */