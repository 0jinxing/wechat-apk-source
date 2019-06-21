package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.choosemsgfile.b.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class f$2
  implements g.a
{
  f$2(f paramf)
  {
  }

  public final void a(boolean paramBoolean, com.tencent.mm.plugin.choosemsgfile.b.b.a parama, RecyclerView.v paramv)
  {
    AppMethodBeat.i(54363);
    if (parama == null)
    {
      ab.e("MicroMsg.ChooseMsgFileUIController", "[onCheck] item is null, err");
      AppMethodBeat.o(54363);
      return;
    }
    ab.i("MicroMsg.ChooseMsgFileUIController", "[onCheck] isChecked:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      parama.bfq();
      f.a(this.kvm).gX(parama.kua.field_msgId);
      b.a(parama, new f.2.1(this, parama, paramv), this.kvm.bfA());
    }
    while (true)
    {
      parama.T(paramv);
      AppMethodBeat.o(54363);
      break;
      parama.bfu();
      f.a(this.kvm).gY(parama.kua.field_msgId);
      f.a(this.kvm).gV(parama.kua.field_msgId);
      if (f.a(this.kvm).bfD())
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(54362);
            f.2.this.kvm.kvi.aop.notifyChanged();
            AppMethodBeat.o(54362);
          }
        });
      this.kvm.kuT.bfG();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.f.2
 * JD-Core Version:    0.6.2
 */