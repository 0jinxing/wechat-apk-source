package com.tencent.mm.plugin.brandservice.ui;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.o;
import com.tencent.mm.aj.z;
import com.tencent.mm.bt.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bbo;
import com.tencent.mm.protocal.protobuf.bos;
import com.tencent.mm.protocal.protobuf.cfr;
import com.tencent.mm.protocal.protobuf.cfs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.be;
import java.lang.ref.WeakReference;

final class EnterpriseBizContactListView$a
  implements com.tencent.mm.ai.f
{
  public String jMa;
  com.tencent.mm.ui.widget.f jMb;
  WeakReference<EnterpriseBizContactListView> jMc;
  com.tencent.mm.ui.base.p tipDialog;

  public EnterpriseBizContactListView$a(EnterpriseBizContactListView paramEnterpriseBizContactListView)
  {
    AppMethodBeat.i(13962);
    this.jMc = new WeakReference(paramEnterpriseBizContactListView);
    AppMethodBeat.o(13962);
  }

  protected final void finalize()
  {
    AppMethodBeat.i(13963);
    g.Rg().b(1394, this);
    super.finalize();
    AppMethodBeat.o(13963);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(13964);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    if ((paramInt1 != 0) || (paramInt2 != 0))
      AppMethodBeat.o(13964);
    while (true)
    {
      return;
      if (paramm.getType() == 1394)
      {
        paramString = ((com.tencent.mm.plugin.profile.b.d)paramm).caz();
        Object localObject = ((com.tencent.mm.plugin.profile.b.d)paramm).cay();
        if ((localObject == null) || (((cfs)localObject).vNh == null) || (((cfs)localObject).vNh.ret != 0))
        {
          if ((localObject != null) && (((cfs)localObject).vNh != null))
          {
            ab.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:code:%s", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(((cfs)localObject).vNh.ret) });
            AppMethodBeat.o(13964);
          }
          else
          {
            ab.w("MicroMsg.BrandService.EnterpriseBizContactListView", "chuangchen onSceneEnd type:%s, err:resp == null", new Object[] { Integer.valueOf(paramm.getType()) });
            AppMethodBeat.o(13964);
          }
        }
        else if (!paramString.xeS)
        {
          AppMethodBeat.o(13964);
        }
        else
        {
          paramm = com.tencent.mm.aj.f.qX(paramString.vNb);
          paramm.field_brandFlag |= 1;
          localObject = new bbo();
          ((bbo)localObject).gvb = paramm.field_brandFlag;
          ((bbo)localObject).jBB = paramString.vNb;
          ((j)g.K(j.class)).XL().c(new j.a(47, (a)localObject));
          z.aeR().c(paramm, new String[0]);
          ((j)g.K(j.class)).XR().aoX(paramm.field_username);
          if (((j)g.K(j.class)).XR().apl(paramm.field_enterpriseFather) <= 0)
            ((j)g.K(j.class)).XR().aoX(paramm.field_enterpriseFather);
          while (true)
          {
            paramString = (EnterpriseBizContactListView)this.jMc.get();
            if (paramString != null)
              break label415;
            AppMethodBeat.o(13964);
            break;
            ((o)g.K(o.class)).XQ().aoj(paramm.field_enterpriseFather);
          }
          label415: paramString.refresh();
        }
      }
      else
      {
        AppMethodBeat.o(13964);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView.a
 * JD-Core Version:    0.6.2
 */