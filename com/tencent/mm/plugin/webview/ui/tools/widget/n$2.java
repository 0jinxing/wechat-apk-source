package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.i;
import java.util.ArrayList;
import java.util.LinkedList;

final class n$2
  implements View.OnClickListener
{
  n$2(n paramn, LinkedList paramLinkedList, n.a parama, i parami)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(79175);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.hCi.size(); i++)
      if ((((buj)this.hCi.get(i)).wWa == 2) || (((buj)this.hCi.get(i)).wWa == 3))
        localArrayList.add(((buj)this.hCi.get(i)).vOF);
    ab.d("MicroMsg.AppBrandAuthorizeDialog", "stev rejectButton click!");
    paramView = new Bundle();
    paramView.putSerializable("key_scope", localArrayList);
    this.uKb.f(2, paramView);
    this.szF.dismiss();
    AppMethodBeat.o(79175);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.n.2
 * JD-Core Version:    0.6.2
 */