package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.c.a.b;

public final class g$a
{
  public c gud;
  public DialogInterface.OnDismissListener jbD;
  Context mContext;
  final c.a vkm;
  String vkn;

  public g$a(Context paramContext)
  {
    AppMethodBeat.i(27657);
    this.vkn = null;
    this.mContext = paramContext;
    this.vkm = new c.a(this.mContext);
    this.vkm.rc(false);
    this.vkm.rd(false);
    this.vkm.a(new g.a.1(this));
    AppMethodBeat.o(27657);
  }

  public final a KQ(int paramInt)
  {
    AppMethodBeat.i(27668);
    this.vkn = this.mContext.getResources().getString(paramInt);
    AppMethodBeat.o(27668);
    return this;
  }

  public final a a(q.a parama)
  {
    AppMethodBeat.i(27669);
    this.gud = this.vkm.aMb();
    if (this.jbD != null)
      this.gud.setOnDismissListener(this.jbD);
    g.a(this.mContext, this.gud, this.vkn, parama, parama);
    AppMethodBeat.o(27669);
    return this;
  }

  public final a a(c.a.b paramb)
  {
    AppMethodBeat.i(27664);
    this.vkm.b(paramb);
    AppMethodBeat.o(27664);
    return this;
  }

  public final a ajC(String paramString)
  {
    AppMethodBeat.i(27660);
    int i = com.tencent.mm.bz.a.fromDPToPix(this.mContext, (int)(14.0F * com.tencent.mm.bz.a.dm(this.mContext)));
    if (!bo.isNullOrNil(paramString))
    {
      paramString = ((com.tencent.mm.plugin.emoji.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.emoji.b.a.class)).a(this.mContext, paramString.toString(), i);
      this.vkm.ak(paramString);
    }
    AppMethodBeat.o(27660);
    return this;
  }

  public final a ajD(String paramString)
  {
    AppMethodBeat.i(27661);
    this.vkm.asF(paramString);
    AppMethodBeat.o(27661);
    return this;
  }

  public final a ajE(String paramString)
  {
    AppMethodBeat.i(27663);
    g.a(this.mContext, this.vkm, paramString);
    this.vkm.ra(false);
    AppMethodBeat.o(27663);
    return this;
  }

  public final a b(Bitmap paramBitmap, int paramInt)
  {
    AppMethodBeat.i(27662);
    this.vkm.a(paramBitmap, true, paramInt);
    this.vkm.ra(false);
    g.b(this.vkm, paramBitmap);
    AppMethodBeat.o(27662);
    return this;
  }

  public final a cx(Object paramObject)
  {
    AppMethodBeat.i(27658);
    g.b(this.mContext, this.vkm, paramObject);
    this.vkm.ra(true);
    AppMethodBeat.o(27658);
    return this;
  }

  public final a djw()
  {
    AppMethodBeat.i(27659);
    this.vkm.Qa(2);
    AppMethodBeat.o(27659);
    return this;
  }

  public final a djx()
  {
    this.vkm.zQe.zPy = 8;
    return this;
  }

  public final a djy()
  {
    AppMethodBeat.i(27667);
    this.vkm.ra(false);
    AppMethodBeat.o(27667);
    return this;
  }

  public final a ev(View paramView)
  {
    AppMethodBeat.i(27665);
    this.vkm.fn(paramView);
    AppMethodBeat.o(27665);
    return this;
  }

  public final a h(Boolean paramBoolean)
  {
    AppMethodBeat.i(27666);
    this.vkm.rb(paramBoolean.booleanValue());
    if (paramBoolean.booleanValue())
      this.vkm.asH(this.mContext.getString(2131298420));
    AppMethodBeat.o(27666);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.g.a
 * JD-Core Version:    0.6.2
 */