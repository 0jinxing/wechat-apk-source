package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class BizContactEntranceView$1
  implements View.OnClickListener
{
  BizContactEntranceView$1(BizContactEntranceView paramBizContactEntranceView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33539);
    Intent localIntent = new Intent();
    localIntent.putExtra("intent_service_type", 251658241);
    d.b(paramView.getContext(), "brandservice", ".ui.BrandServiceIndexUI", localIntent);
    AppMethodBeat.o(33539);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.BizContactEntranceView.1
 * JD-Core Version:    0.6.2
 */