package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.c.b.f;
import com.tencent.mm.ui.chatting.c.b.o;

public class am extends a
  implements v
{
  private View ySs;
  private ViewGroup ySt;
  private boolean ySu;
  private boolean ySv;
  private final long ySw;
  private ChatFooter.c ySx;

  public am()
  {
    AppMethodBeat.i(31742);
    this.ySw = 259200000L;
    this.ySx = new am.2(this);
    AppMethodBeat.o(31742);
  }

  private void c(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    AppMethodBeat.i(31744);
    if (this.ySs != null)
    {
      this.ySs.clearAnimation();
      this.ySs.setVisibility(8);
      if (paramBoolean2.booleanValue())
      {
        if (!paramBoolean1.booleanValue())
          break label113;
        aw.ZK();
        c.Ry().set(340228, Boolean.TRUE);
        h.pYm.a(232L, 1L, 1L, false);
        AppMethodBeat.o(31744);
      }
    }
    while (true)
    {
      return;
      if (paramBoolean1.booleanValue())
      {
        aw.ZK();
        c.Ry().set(340229, Boolean.TRUE);
        h.pYm.a(232L, 2L, 1L, false);
      }
      label113: AppMethodBeat.o(31744);
    }
  }

  private void k(Boolean paramBoolean)
  {
    AppMethodBeat.i(31743);
    this.ySt = ((ViewGroup)this.cgL.findViewById(2131822377));
    this.ySs = View.inflate(this.cgL.yTx.getContext(), 2130970305, null);
    Object localObject = (TextView)this.ySs.findViewById(2131826356);
    if (paramBoolean.booleanValue())
    {
      ((TextView)localObject).setText(this.cgL.yTx.getContext().getString(2131302951));
      this.ySs.setBackgroundResource(2130839747);
    }
    for (localObject = new FrameLayout.LayoutParams(-2, -2, 85); ; localObject = new FrameLayout.LayoutParams(-2, -2, 83))
    {
      if ((this.ySt != null) && (this.ySs != null))
      {
        this.ySt.addView(this.ySs, (ViewGroup.LayoutParams)localObject);
        localObject = AnimationUtils.loadAnimation(this.cgL.yTx.getContext(), 2131034253);
        this.ySs.startAnimation((Animation)localObject);
        this.ySs.setOnClickListener(new am.1(this, paramBoolean));
      }
      AppMethodBeat.o(31743);
      return;
      ((TextView)localObject).setText(this.cgL.yTx.getContext().getString(2131302955));
      this.ySs.setBackgroundResource(2130839746);
    }
  }

  public final void dxA()
  {
    AppMethodBeat.i(31745);
    if (r.Zf().booleanValue())
    {
      if (!this.cgL.sRl.dsf())
      {
        aw.ZK();
        this.ySu = bo.e((Boolean)c.Ry().get(340228, null));
        if ((!this.ySu) && (!((f)this.cgL.aF(f.class)).dDF()) && (!((d)this.cgL.aF(d.class)).dDs()))
          k(Boolean.TRUE);
        aw.ZK();
        this.ySv = bo.e((Boolean)c.Ry().get(340229, null));
        long l1 = System.currentTimeMillis();
        aw.ZK();
        long l2 = bo.a((Long)c.Ry().get(340240, null), 0L);
        if ((this.ySu) && (!this.ySv) && (l1 - l2 >= 259200000L))
          k(Boolean.FALSE);
      }
      if (((o)this.cgL.aF(o.class)).dDX() != null)
        ((o)this.cgL.aF(o.class)).dDX().setTipsShowCallback(this.ySx);
    }
    AppMethodBeat.o(31745);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31746);
    if ((!this.cgL.sRl.dsf()) && (r.Zf().booleanValue()))
    {
      Boolean localBoolean = Boolean.FALSE;
      c(localBoolean, localBoolean);
    }
    AppMethodBeat.o(31746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.am
 * JD-Core Version:    0.6.2
 */