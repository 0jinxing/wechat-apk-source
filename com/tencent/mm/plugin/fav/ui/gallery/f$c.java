package com.tencent.mm.plugin.fav.ui.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.bo;

public final class f$c
{
  public String imagePath;
  public d mof;
  boolean mog;
  public f.c.a moh;
  public long timeStamp;
  public int type;

  public f$c(d paramd)
  {
    AppMethodBeat.i(74568);
    this.type = 0;
    this.moh = new f.c.a(this);
    this.mof = paramd;
    Object localObject;
    if ((paramd.bws()) || (paramd.bwt()))
      localObject = com.tencent.mm.plugin.fav.a.b.c(paramd.cAJ);
    while (true)
    {
      this.imagePath = ((String)localObject);
      this.timeStamp = paramd.mnW.field_updateTime;
      if ((paramd.bws()) || (paramd.bwt()))
      {
        this.mog = true;
        this.moh.moi = bo.mK(paramd.cAJ.duration);
      }
      AppMethodBeat.o(74568);
      return;
      String str = com.tencent.mm.plugin.fav.a.b.b(paramd.cAJ);
      localObject = str;
      if (!new com.tencent.mm.vfs.b(str).exists())
        localObject = com.tencent.mm.plugin.fav.a.b.c(paramd.cAJ);
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(74567);
    boolean bool;
    if ((this.mof != null) && ((paramObject instanceof d)) && (paramObject != null))
    {
      bool = this.mof.cAJ.mnd.equals(((d)paramObject).cAJ.mnd);
      AppMethodBeat.o(74567);
    }
    while (true)
    {
      return bool;
      bool = super.equals(paramObject);
      AppMethodBeat.o(74567);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f.c
 * JD-Core Version:    0.6.2
 */