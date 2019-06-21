package com.tencent.mm.plugin.game.luggage.c.a;

import android.content.Context;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.ui.base.l;

public abstract class a
{
  int id;

  public a(int paramInt)
  {
    this.id = paramInt;
  }

  public abstract void a(Context paramContext, d paramd, bbb parambbb);

  public void a(d paramd, l paraml, bbb parambbb)
  {
    paramd = parambbb.Title + "__" + parambbb.ThumbUrl;
    paraml.e(parambbb.wkB, paramd);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.a
 * JD-Core Version:    0.6.2
 */