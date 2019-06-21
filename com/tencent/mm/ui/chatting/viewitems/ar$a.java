package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;

abstract class ar$a extends c
{
  protected ar.h zhX;

  public String b(a parama, bi parambi)
  {
    return parama.getTalkerUserName();
  }

  public boolean dHk()
  {
    return false;
  }

  protected final ar.h l(a parama)
  {
    if (this.zhX == null)
      this.zhX = new ar.h(parama);
    return this.zhX;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ar.a
 * JD-Core Version:    0.6.2
 */