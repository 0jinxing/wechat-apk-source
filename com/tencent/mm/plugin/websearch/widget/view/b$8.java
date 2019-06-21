package com.tencent.mm.plugin.websearch.widget.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.f;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.widget.b.a.1;
import com.tencent.mm.plugin.websearch.widget.b.a.2;
import com.tencent.mm.plugin.websearch.widget.b.a.a;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.ui.widget.a.d;

final class b$8
  implements View.OnLongClickListener
{
  b$8(b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(91535);
    if ((this.uef.udY != null) && (bp.dpL()))
    {
      Object localObject = this.uef.eAl.getContext();
      paramView = new a.a()
      {
        public final void cUT()
        {
          AppMethodBeat.i(91534);
          b.8.this.uef.mJs.cUT();
          AppMethodBeat.o(91534);
        }

        public final void cVR()
        {
          AppMethodBeat.i(91533);
          b.8.this.uef.udN.adD(b.8.this.uef.udO);
          AppMethodBeat.o(91533);
        }
      };
      localObject = new d((Context)localObject, 2, true);
      ((d)localObject).q("当前服务为体验版本，可以选择以下调试功能", 48);
      ((d)localObject).rBl = new a.1();
      ((d)localObject).rBm = new a.2(paramView);
      ((d)localObject).cpD();
    }
    AppMethodBeat.o(91535);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.b.8
 * JD-Core Version:    0.6.2
 */